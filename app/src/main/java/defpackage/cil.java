package defpackage;

/* renamed from: cil reason: default package */
/* compiled from: PG */
final class cil implements java.lang.Runnable {
    private final /* synthetic */ defpackage.eeo a = null;
    private final /* synthetic */ java.lang.String b = null;
    private final /* synthetic */ int c;
    private final /* synthetic */ boolean d;
    private final /* synthetic */ java.lang.String e;
    private final /* synthetic */ defpackage.cik f;

    cil(defpackage.cik cik, int i, java.lang.String str) {
        this.f = cik;
        this.c = i;
        this.d = false;
        this.e = str;
    }

    public final void run() {
        if (this.f.f) {
            java.lang.System.gc();
            java.lang.System.runFinalization();
            java.lang.System.gc();
        }
        if (this.f.d) {
            defpackage.cik cik = this.f;
            int i = this.c;
            java.lang.String str = this.e;
            java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = defpackage.cnx.a((android.content.Context) cik.a).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                java.lang.String packageName = cik.a.getPackageName();
                for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (android.os.Build.VERSION.SDK_INT > 22 || runningAppProcessInfo.processName.contains(packageName)) {
                        defpackage.efx efx = new defpackage.efx();
                        efx.a = defpackage.cnt.a(i, runningAppProcessInfo.pid, runningAppProcessInfo.processName, cik.a, str, cik.g);
                        cik.a(null, false, efx, null);
                    }
                }
                return;
            }
            return;
        }
        defpackage.cik cik2 = this.f;
        int i2 = this.c;
        java.lang.String str2 = this.e;
        defpackage.efx efx2 = new defpackage.efx();
        efx2.a = defpackage.cnt.a(i2, android.os.Process.myPid(), null, cik2.a, str2, cik2.g);
        cik2.a(null, false, efx2, null);
    }
}
