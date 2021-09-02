package defpackage;

/* renamed from: cjk reason: default package */
/* compiled from: PG */
final class cjk implements java.lang.Runnable {
    private final /* synthetic */ defpackage.cjw a;
    private final /* synthetic */ defpackage.clt b;
    private final /* synthetic */ defpackage.clt c;
    private final /* synthetic */ defpackage.clt d;
    private final /* synthetic */ defpackage.cgq e;
    private final /* synthetic */ defpackage.cjm f;
    private final /* synthetic */ defpackage.cji g;

    cjk(defpackage.cji cji, defpackage.cjw cjw, defpackage.clt clt, defpackage.clt clt2, defpackage.clt clt3, defpackage.cgq cgq, defpackage.cjm cjm) {
        this.g = cji;
        this.a = cjw;
        this.b = clt;
        this.c = clt2;
        this.d = clt3;
        this.e = cgq;
        this.f = cjm;
    }

    public final void run() {
        try {
            defpackage.cji.a(this.g, this.a, this.b, this.c, this.d, this.e, this.f);
        } catch (java.lang.RuntimeException e2) {
            defpackage.cdm.b("Primes", "Primes failed to initialized in the background", e2, new java.lang.Object[0]);
            this.g.c();
        }
    }
}
