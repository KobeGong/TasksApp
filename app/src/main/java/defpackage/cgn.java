package defpackage;

/* renamed from: cgn reason: default package */
/* compiled from: PG */
final class cgn implements defpackage.clt {
    private final /* synthetic */ defpackage.cgm a;

    cgn(defpackage.cgm cgm) {
        this.a = cgm;
    }

    public final /* synthetic */ java.lang.Object a() {
        boolean z;
        java.util.List runningAppProcesses = defpackage.cnx.a((android.content.Context) this.a.a).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            java.util.Iterator it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (android.app.ActivityManager.RunningAppProcessInfo) it.next();
                if (runningAppProcessInfo.pid == android.os.Process.myPid()) {
                    z = runningAppProcessInfo.importance == 100;
                }
            }
        }
        z = false;
        return java.lang.Boolean.valueOf(z);
    }
}
