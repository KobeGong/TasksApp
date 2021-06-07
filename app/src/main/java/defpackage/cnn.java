package defpackage;

import java.lang.ref.ReferenceQueue;

/* renamed from: cnn  reason: default package */
/* compiled from: PG */
public final class cnn {
    public cno a;
    public cnm b;
    private boolean c;

    public cnn() {
        this(new cnq());
    }

    private cnn(cnq cnq) {
        this.c = false;
        cky.a(cnq);
    }

    public final synchronized void a(Object obj, String str) {
        if (this.c) {
            if (this.a == null) {
                this.a = new cno(new ReferenceQueue(), new cnp(), this.b);
                this.a.start();
                cdm.a(3, "LeakWatcher", "Starting leak watcher thread.", new Object[0]);
            }
            cno cno = this.a;
            cky.a((Object) str);
            cky.a(obj);
            cdm.a(3, "LeakWatcherThread", "Watching %s", str);
            cnl a2 = cnp.a(obj, str, cno.a);
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
            cdm.a(3, "LeakWatcher", "Stopping leak watcher thread.", new Object[0]);
        }
    }
}
