package defpackage;

/* renamed from: dtq  reason: default package */
/* compiled from: PG */
final class dtq implements Runnable {
    private final /* synthetic */ dpw a;
    private final /* synthetic */ dtm b;

    dtq(dtm dtm, dpw dpw) {
        this.b = dtm;
        this.a = dpw;
    }

    public final void run() {
        this.b.e.a(this.a);
    }
}
