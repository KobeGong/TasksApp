package defpackage;

/* renamed from: cic reason: default package */
/* compiled from: PG */
final class cic implements java.lang.Runnable {
    private final /* synthetic */ android.content.Context a;
    private final /* synthetic */ defpackage.cib b;

    cic(defpackage.cib cib, android.content.Context context) {
        this.b = cib;
        this.a = context;
    }

    public final void run() {
        if (this.b.a.j.compareAndSet(true, false)) {
            this.a.unregisterReceiver(this.b);
            this.b.a.i.set(android.os.SystemClock.elapsedRealtime());
            defpackage.cnn cnn = this.b.a.e;
            java.io.File b2 = defpackage.cdm.b(this.a);
            if (cnn.a != null) {
                defpackage.cno cno = cnn.a;
                if (cno.d.c != null) {
                    cno.b = (java.io.File) defpackage.cky.a((java.lang.Object) b2);
                    cno.interrupt();
                    defpackage.cdm.a(3, "LeakWatcherThread", "Schedule for heap dump", new java.lang.Object[0]);
                    return;
                }
                defpackage.cdm.a(3, "LeakWatcherThread", "Skip heap dump. No leak suspects found.", new java.lang.Object[0]);
            }
        }
    }
}
