package org.chromium.base;

/* compiled from: PG */
public class ContentUriUtils {
    private ContentUriUtils() {
    }

    @org.chromium.base.annotations.CalledByNative
    public static int openContentUriForRead(java.lang.String str) {
        android.content.res.AssetFileDescriptor a = a(str);
        if (a != null) {
            return a.getParcelFileDescriptor().detachFd();
        }
        return -1;
    }

    @org.chromium.base.annotations.CalledByNative
    public static boolean contentUriExists(java.lang.String str) {
        boolean z;
        android.content.res.AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = a(str);
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (java.io.IOException e) {
                }
            }
            return z;
        } finally {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (java.io.IOException e2) {
                }
            }
        }
    }

    @org.chromium.base.annotations.CalledByNative
    public static java.lang.String getMimeType(java.lang.String str) {
        android.content.ContentResolver contentResolver = defpackage.ehw.a.getContentResolver();
        android.net.Uri parse = android.net.Uri.parse(str);
        if (!a(parse)) {
            return contentResolver.getType(parse);
        }
        java.lang.String[] streamTypes = contentResolver.getStreamTypes(parse, "*/*");
        if (streamTypes == null || streamTypes.length <= 0) {
            return null;
        }
        return streamTypes[0];
    }

    private static android.content.res.AssetFileDescriptor a(java.lang.String str) {
        android.content.ContentResolver contentResolver = defpackage.ehw.a.getContentResolver();
        android.net.Uri parse = android.net.Uri.parse(str);
        try {
            if (a(parse)) {
                java.lang.String[] streamTypes = contentResolver.getStreamTypes(parse, "*/*");
                if (streamTypes != null && streamTypes.length > 0) {
                    android.content.res.AssetFileDescriptor openTypedAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(parse, streamTypes[0], null);
                    if (openTypedAssetFileDescriptor == null || openTypedAssetFileDescriptor.getStartOffset() == 0) {
                        return openTypedAssetFileDescriptor;
                    }
                    try {
                        openTypedAssetFileDescriptor.close();
                    } catch (java.io.IOException e) {
                    }
                    throw new java.lang.SecurityException("Cannot open files with non-zero offset type.");
                }
                return null;
            }
            android.os.ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(parse, "r");
            if (openFileDescriptor != null) {
                return new android.content.res.AssetFileDescriptor(openFileDescriptor, 0, -1);
            }
            return null;
        } catch (java.io.FileNotFoundException e2) {
            android.util.Log.w("ContentUriUtils", "Cannot find content uri: " + str, e2);
        } catch (java.lang.SecurityException e3) {
            android.util.Log.w("ContentUriUtils", "Cannot open content uri: " + str, e3);
        } catch (java.lang.Exception e4) {
            android.util.Log.w("ContentUriUtils", "Unknown content uri: " + str, e4);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(android.net.Uri r9) {
        /*
            r6 = 0
            r7 = 0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 >= r1) goto L_0x0009
        L_0x0008:
            return r6
        L_0x0009:
            if (r9 == 0) goto L_0x0008
            android.content.Context r0 = defpackage.ehw.a
            boolean r0 = android.provider.DocumentsContract.isDocumentUri(r0, r9)
            if (r0 == 0) goto L_0x0008
            android.content.Context r0 = defpackage.ehw.a
            android.content.ContentResolver r0 = r0.getContentResolver()
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r1 = r9
            android.database.Cursor r2 = r0.query(r1, r2, r3, r4, r5)     // Catch:{ NullPointerException -> 0x005a }
            if (r2 == 0) goto L_0x0053
            int r0 = r2.getCount()     // Catch:{ Throwable -> 0x005c, all -> 0x0068 }
            if (r0 <= 0) goto L_0x0053
            r2.moveToFirst()     // Catch:{ Throwable -> 0x005c, all -> 0x0068 }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x005c, all -> 0x0068 }
            r1 = 24
            if (r0 < r1) goto L_0x0051
            java.lang.String r0 = "flags"
            int r0 = r2.getColumnIndex(r0)     // Catch:{ Throwable -> 0x005c, all -> 0x0068 }
            if (r0 < 0) goto L_0x0051
            long r0 = r2.getLong(r0)     // Catch:{ Throwable -> 0x005c, all -> 0x0068 }
            r4 = 512(0x200, double:2.53E-321)
            long r0 = r0 & r4
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0051
            r0 = 1
        L_0x0049:
            if (r2 == 0) goto L_0x004f
            r1 = 0
            a(r1, r2)     // Catch:{ NullPointerException -> 0x005a }
        L_0x004f:
            r6 = r0
            goto L_0x0008
        L_0x0051:
            r0 = r6
            goto L_0x0049
        L_0x0053:
            if (r2 == 0) goto L_0x0008
            r0 = 0
            a(r0, r2)     // Catch:{ NullPointerException -> 0x005a }
            goto L_0x0008
        L_0x005a:
            r0 = move-exception
            goto L_0x0008
        L_0x005c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x005e }
        L_0x005e:
            r1 = move-exception
            r8 = r1
            r1 = r0
            r0 = r8
        L_0x0062:
            if (r2 == 0) goto L_0x0067
            a(r1, r2)     // Catch:{ NullPointerException -> 0x005a }
        L_0x0067:
            throw r0     // Catch:{ NullPointerException -> 0x005a }
        L_0x0068:
            r0 = move-exception
            r1 = r7
            goto L_0x0062
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.ContentUriUtils.a(android.net.Uri):boolean");
    }

    static {
        new java.lang.Object();
    }

    private static /* synthetic */ void a(java.lang.Throwable th, android.database.Cursor cursor) {
        if (th != null) {
            try {
                cursor.close();
            } catch (Throwable th2) {
                defpackage.cza.a(th, th2);
            }
        } else {
            cursor.close();
        }
    }
}
