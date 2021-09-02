package defpackage;

/* renamed from: cnn reason: default package */
/* compiled from: PG */
public final class cnn {
    public defpackage.cno a;
    public defpackage.cnm b;
    private boolean c;

    public cnn() {
        this(new defpackage.cnq());
    }

    private cnn(defpackage.cnq cnq) {
        this.c = false;
        defpackage.cky.a((java.lang.Object) cnq);
    }

    public final synchronized void a(java.lang.Object obj, java.lang.String str) {
        if (this.c) {
            if (this.a == null) {
                this.a = new defpackage.cno(new java.lang.ref.ReferenceQueue(), new defpackage.cnp(), this.b);
                this.a.start();
                defpackage.cdm.a(3, "LeakWatcher", "Starting leak watcher thread.", new java.lang.Object[0]);
            }
            defpackage.cno cno = this.a;
            defpackage.cky.a((java.lang.Object) str);
            defpackage.cky.a(obj);
            defpackage.cdm.a(3, "LeakWatcherThread", "Watching %s", str);
            defpackage.cnl a2 = defpackage.cnp.a(obj, str, cno.a);
            synchronized (cno.c) {
                a2.a(cno.c);
            }
        }
    }

    public final synchronized void a() {
        this.c = true;
    }

    public final synchronized void b() {
        if (this.c) {
            this.c = false;
            if (this.a != null) {
                this.a.interrupt();
                this.a = null;
            }
            defpackage.cdm.a(3, "LeakWatcher", "Stopping leak watcher thread.", new java.lang.Object[0]);
        }
    }
}
