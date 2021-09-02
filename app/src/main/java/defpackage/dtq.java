package defpackage;

/* renamed from: dtq reason: default package */
/* compiled from: PG */
final class dtq implements java.lang.Runnable {
    private final /* synthetic */ defpackage.dpw a;
    private final /* synthetic */ defpackage.dtm b;

    dtq(defpackage.dtm dtm, defpackage.dpw dpw) {
        this.b = dtm;
        this.a = dpw;
    }

    public final void run() {
        this.b.e.a(this.a);
    }
}
