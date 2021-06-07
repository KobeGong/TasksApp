package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: cjk  reason: default package */
/* compiled from: PG */
public final class cjk implements Runnable {
    private final /* synthetic */ cjw a;
    private final /* synthetic */ clt b;
    private final /* synthetic */ clt c;
    private final /* synthetic */ clt d;
    private final /* synthetic */ cgq e;
    private final /* synthetic */ cjm f;
    private final /* synthetic */ cji g;

    cjk(cji cji, cjw cjw, clt clt, clt clt2, clt clt3, cgq cgq, cjm cjm) {
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
            cji.a(this.g, this.a, this.b, this.c, this.d, this.e, this.f);
        } catch (RuntimeException e2) {
            cdm.b("Primes", "Primes failed to initialized in the background", e2, new Object[0]);
            this.g.c();
        }
    }
}
