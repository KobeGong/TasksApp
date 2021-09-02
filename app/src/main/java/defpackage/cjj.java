package defpackage;

/* renamed from: cjj reason: default package */
/* compiled from: PG */
final class cjj implements java.lang.Runnable {
    private final java.util.concurrent.atomic.AtomicBoolean a = new java.util.concurrent.atomic.AtomicBoolean(true);
    private final /* synthetic */ java.util.concurrent.ExecutorService b;
    private final /* synthetic */ defpackage.cjw c;
    private final /* synthetic */ defpackage.clt d;
    private final /* synthetic */ defpackage.clt e;
    private final /* synthetic */ defpackage.clt f;
    private final /* synthetic */ defpackage.cgq g;
    private final /* synthetic */ defpackage.cjm h;
    private final /* synthetic */ boolean i;
    private final /* synthetic */ defpackage.cji j;

    cjj(defpackage.cji cji, java.util.concurrent.ExecutorService executorService, defpackage.cjw cjw, defpackage.clt clt, defpackage.clt clt2, defpackage.clt clt3, defpackage.cgq cgq, defpackage.cjm cjm, boolean z) {
        this.j = cji;
        this.b = executorService;
        this.c = cjw;
        this.d = clt;
        this.e = clt2;
        this.f = clt3;
        this.g = cgq;
        this.h = cjm;
        this.i = z;
    }

    public final void run() {
        if (this.a.getAndSet(false)) {
            defpackage.cji.a(this.j, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
            if (this.i) {
                this.b.shutdown();
            }
        }
    }
}
