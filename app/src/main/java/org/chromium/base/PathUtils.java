package org.chromium.base;

/* compiled from: PG */
public class PathUtils {
    private PathUtils() {
    }

    public static java.lang.String[] a() {
        defpackage.egy egy;
        java.lang.Throwable th;
        android.os.AsyncTask asyncTask = null;
        try {
            if (asyncTask.cancel(false)) {
                egy = new defpackage.egy(android.os.StrictMode.allowThreadDiskWrites(), 0);
                try {
                    java.lang.String[] strArr = new java.lang.String[3];
                    android.content.Context context = defpackage.ehw.a;
                    strArr[0] = context.getDir(null, 0).getPath();
                    strArr[1] = context.getDir("textures", 0).getPath();
                    if (context.getCacheDir() != null) {
                        strArr[2] = context.getCacheDir().getPath();
                    }
                    a(null, egy);
                    return strArr;
                } catch (Throwable th2) {
                    java.lang.Throwable th3 = th2;
                    th = r0;
                    th = th3;
                }
            } else {
                android.os.AsyncTask asyncTask2 = null;
                return (java.lang.String[]) asyncTask2.get();
            }
            a(th, egy);
            throw th;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            return null;
        }
    }

    @org.chromium.base.annotations.CalledByNative
    public static java.lang.String getDataDirectory() {
        return defpackage.egw.a[0];
    }

    @org.chromium.base.annotations.CalledByNative
    public static java.lang.String getCacheDirectory() {
        return defpackage.egw.a[2];
    }

    @org.chromium.base.annotations.CalledByNative
    public static java.lang.String getThumbnailCacheDirectory() {
        return defpackage.egw.a[1];
    }

    @org.chromium.base.annotations.CalledByNative
    private static java.lang.String getDownloadsDirectory() {
        java.lang.Throwable th = null;
        defpackage.egy egy = new defpackage.egy(android.os.StrictMode.allowThreadDiskReads(), 0);
        try {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            java.lang.String path = android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_DOWNLOADS).getPath();
            org.chromium.base.metrics.RecordHistogram.a("Android.StrictMode.DownloadsDir", android.os.SystemClock.elapsedRealtime() - elapsedRealtime, java.util.concurrent.TimeUnit.MILLISECONDS);
            a(null, egy);
            return path;
        } catch (Throwable th2) {
            java.lang.Throwable th3 = th2;
            th = r0;
            th = th3;
        }
        a(th, egy);
        throw th;
    }

    @org.chromium.base.annotations.CalledByNative
    private static java.lang.String getNativeLibraryDirectory() {
        android.content.pm.ApplicationInfo applicationInfo = defpackage.ehw.a.getApplicationInfo();
        if ((applicationInfo.flags & 128) != 0 || (applicationInfo.flags & 1) == 0) {
            return applicationInfo.nativeLibraryDir;
        }
        return "/system/lib/";
    }

    @org.chromium.base.annotations.CalledByNative
    public static java.lang.String getExternalStorageDirectory() {
        return android.os.Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    static {
        new java.util.concurrent.atomic.AtomicBoolean();
    }

    private static /* synthetic */ void a(java.lang.Throwable th, defpackage.egy egy) {
        if (th != null) {
            try {
                egy.close();
            } catch (Throwable th2) {
                defpackage.cza.a(th, th2);
            }
        } else {
            egy.close();
        }
    }
}
