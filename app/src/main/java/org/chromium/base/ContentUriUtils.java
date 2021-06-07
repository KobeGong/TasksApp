package org.chromium.base;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.chromium.base.annotations.CalledByNative;

/* compiled from: PG */
public class ContentUriUtils {
    private ContentUriUtils() {
    }

    @CalledByNative
    public static int openContentUriForRead(String str) {
        AssetFileDescriptor a = a(str);
        if (a != null) {
            return a.getParcelFileDescriptor().detachFd();
        }
        return -1;
    }

    @CalledByNative
    public static boolean contentUriExists(String str) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = a(str);
            return assetFileDescriptor != null;
        } finally {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException e) {
                }
            }
        }
    }

    @CalledByNative
    public static String getMimeType(String str) {
        ContentResolver contentResolver = ehw.a.getContentResolver();
        Uri parse = Uri.parse(str);
        if (!a(parse)) {
            return contentResolver.getType(parse);
        }
        String[] streamTypes = contentResolver.getStreamTypes(parse, "*/*");
        if (streamTypes == null || streamTypes.length <= 0) {
            return null;
        }
        return streamTypes[0];
    }

    private static AssetFileDescriptor a(String str) {
        ContentResolver contentResolver = ehw.a.getContentResolver();
        Uri parse = Uri.parse(str);
        try {
            if (a(parse)) {
                String[] streamTypes = contentResolver.getStreamTypes(parse, "*/*");
                if (streamTypes != null && streamTypes.length > 0) {
                    AssetFileDescriptor openTypedAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(parse, streamTypes[0], null);
                    if (openTypedAssetFileDescriptor == null || openTypedAssetFileDescriptor.getStartOffset() == 0) {
                        return openTypedAssetFileDescriptor;
                    }
                    try {
                        openTypedAssetFileDescriptor.close();
                    } catch (IOException e) {
                    }
                    throw new SecurityException("Cannot open files with non-zero offset type.");
                }
            } else {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(parse, "r");
                if (openFileDescriptor != null) {
                    return new AssetFileDescriptor(openFileDescriptor, 0, -1);
                }
            }
        } catch (FileNotFoundException e2) {
            Log.w("ContentUriUtils", "Cannot find content uri: " + str, e2);
        } catch (SecurityException e3) {
            Log.w("ContentUriUtils", "Cannot open content uri: " + str, e3);
        } catch (Exception e4) {
            Log.w("ContentUriUtils", "Unknown content uri: " + str, e4);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005f, code lost:
        r1 = r0;
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0068, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0069, code lost:
        r1 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(android.net.Uri r9) {
        /*
        // Method dump skipped, instructions count: 107
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.ContentUriUtils.a(android.net.Uri):boolean");
    }

    static {
        new Object();
    }

    private static /* synthetic */ void a(Throwable th, Cursor cursor) {
        if (th != null) {
            try {
                cursor.close();
            } catch (Throwable th2) {
                cza.a(th, th2);
            }
        } else {
            cursor.close();
        }
    }
}
