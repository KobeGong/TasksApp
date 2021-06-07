package defpackage;

/* renamed from: bck  reason: default package */
/* compiled from: PG */
final class bck implements Runnable {
    private /* synthetic */ bcj a;

    bck(bcj bcj) {
        this.a = bcj;
    }

    public final void run() {
        this.a.g.lock();
        try {
            bcj.a(this.a);
        } finally {
            this.a.g.unlock();
        }
    }
}
