package org.chromium.base;

import android.content.pm.ApplicationInfo;
import android.os.Environment;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.base.annotations.CalledByNative;

/* compiled from: PG */
public class PathUtils {
    private PathUtils() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        r2 = r0;
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        r2 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] a() {
        /*
            r1 = 0
            r0 = 0
            r2 = 0
            boolean r0 = r0.cancel(r2)     // Catch:{ InterruptedException -> 0x0053, ExecutionException -> 0x005e }
            if (r0 == 0) goto L_0x0056
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ InterruptedException -> 0x0053, ExecutionException -> 0x005e }
            egy r3 = new egy     // Catch:{ InterruptedException -> 0x0053, ExecutionException -> 0x005e }
            r2 = 0
            r3.<init>(r0, r2)     // Catch:{ InterruptedException -> 0x0053, ExecutionException -> 0x005e }
            r0 = 3
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ Throwable -> 0x0049, all -> 0x0060 }
            android.content.Context r2 = defpackage.ehw.a     // Catch:{ Throwable -> 0x0049, all -> 0x0060 }
            r4 = 0
            r5 = 0
            r6 = 0
            java.io.File r5 = r2.getDir(r5, r6)     // Catch:{ Throwable -> 0x0049, all -> 0x0060 }
            java.lang.String r5 = r5.getPath()     // Catch:{ Throwable -> 0x0049, all -> 0x0060 }
            r0[r4] = r5     // Catch:{ Throwable -> 0x0049, all -> 0x0060 }
            r4 = 1
            java.lang.String r5 = "textures"
            r6 = 0
            java.io.File r5 = r2.getDir(r5, r6)     // Catch:{ Throwable -> 0x0049, all -> 0x0060 }
            java.lang.String r5 = r5.getPath()     // Catch:{ Throwable -> 0x0049, all -> 0x0060 }
            r0[r4] = r5     // Catch:{ Throwable -> 0x0049, all -> 0x0060 }
            java.io.File r4 = r2.getCacheDir()     // Catch:{ Throwable -> 0x0049, all -> 0x0060 }
            if (r4 == 0) goto L_0x0044
            r4 = 2
            java.io.File r2 = r2.getCacheDir()     // Catch:{ Throwable -> 0x0049, all -> 0x0060 }
            java.lang.String r2 = r2.getPath()     // Catch:{ Throwable -> 0x0049, all -> 0x0060 }
            r0[r4] = r2     // Catch:{ Throwable -> 0x0049, all -> 0x0060 }
        L_0x0044:
            r2 = 0
            a(r2, r3)
        L_0x0048:
            return r0
        L_0x0049:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004b:
            r2 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
        L_0x004f:
            a(r2, r3)
            throw r0
        L_0x0053:
            r0 = move-exception
        L_0x0054:
            r0 = r1
            goto L_0x0048
        L_0x0056:
            r0 = 0
            java.lang.Object r0 = r0.get()
            java.lang.String[] r0 = (java.lang.String[]) r0
            goto L_0x0048
        L_0x005e:
            r0 = move-exception
            goto L_0x0054
        L_0x0060:
            r0 = move-exception
            r2 = r1
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.PathUtils.a():java.lang.String[]");
    }

    @CalledByNative
    public static String getDataDirectory() {
        return egw.a[0];
    }

    @CalledByNative
    public static String getCacheDirectory() {
        return egw.a[2];
    }

    @CalledByNative
    public static String getThumbnailCacheDirectory() {
        return egw.a[1];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        r1 = r0;
        r0 = r1;
     */
    @org.chromium.base.annotations.CalledByNative
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getDownloadsDirectory() {
        /*
            r1 = 0
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            egy r2 = new egy
            r3 = 0
            r2.<init>(r0, r3)
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Throwable -> 0x002a, all -> 0x0034 }
            java.lang.String r0 = android.os.Environment.DIRECTORY_DOWNLOADS     // Catch:{ Throwable -> 0x002a, all -> 0x0034 }
            java.io.File r0 = android.os.Environment.getExternalStoragePublicDirectory(r0)     // Catch:{ Throwable -> 0x002a, all -> 0x0034 }
            java.lang.String r0 = r0.getPath()     // Catch:{ Throwable -> 0x002a, all -> 0x0034 }
            java.lang.String r3 = "Android.StrictMode.DownloadsDir"
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Throwable -> 0x002a, all -> 0x0034 }
            long r4 = r6 - r4
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Throwable -> 0x002a, all -> 0x0034 }
            org.chromium.base.metrics.RecordHistogram.a(r3, r4, r6)     // Catch:{ Throwable -> 0x002a, all -> 0x0034 }
            a(r1, r2)
            return r0
        L_0x002a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x002c }
        L_0x002c:
            r1 = move-exception
            r8 = r1
            r1 = r0
            r0 = r8
        L_0x0030:
            a(r1, r2)
            throw r0
        L_0x0034:
            r0 = move-exception
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.PathUtils.getDownloadsDirectory():java.lang.String");
    }

    @CalledByNative
    private static String getNativeLibraryDirectory() {
        ApplicationInfo applicationInfo = ehw.a.getApplicationInfo();
        if ((applicationInfo.flags & 128) != 0 || (applicationInfo.flags & 1) == 0) {
            return applicationInfo.nativeLibraryDir;
        }
        return "/system/lib/";
    }

    @CalledByNative
    public static String getExternalStorageDirectory() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    static {
        new AtomicBoolean();
    }

    private static /* synthetic */ void a(Throwable th, egy egy) {
        if (th != null) {
            try {
                egy.close();
            } catch (Throwable th2) {
                cza.a(th, th2);
            }
        } else {
            egy.close();
        }
    }
}
