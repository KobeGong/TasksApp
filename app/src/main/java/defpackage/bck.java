package defpackage;

/* renamed from: bck reason: default package */
/* compiled from: PG */
final class bck implements java.lang.Runnable {
    private /* synthetic */ defpackage.bcj a;

    bck(defpackage.bcj bcj) {
        this.a = bcj;
    }

    public final void run() {
        this.a.g.lock();
        try {
            defpackage.bcj.a(this.a);
        } finally {
            this.a.g.unlock();
        }
    }
}
