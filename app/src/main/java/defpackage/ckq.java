package defpackage;

/* renamed from: ckq reason: default package */
/* compiled from: PG */
final class ckq implements defpackage.ckm, defpackage.coe {
    private final defpackage.clt b;
    private final java.util.concurrent.BlockingQueue c;

    ckq(defpackage.clt clt) {
        this(clt, new java.util.concurrent.ArrayBlockingQueue(5));
    }

    private ckq(defpackage.clt clt, java.util.concurrent.BlockingQueue blockingQueue) {
        this.b = clt;
        this.c = blockingQueue;
    }

    public final void a(defpackage.efx efx) {
        if (efx.w == null) {
            defpackage.clt clt = (defpackage.clt) this.c.poll();
            if (clt != null) {
                efx.w = (defpackage.efa) clt.a();
            }
        }
        ((defpackage.coe) defpackage.cky.a((java.lang.Object) (defpackage.coe) this.b.a())).a(efx);
    }

    public final void a(defpackage.clt clt) {
        if (!this.c.offer(clt)) {
            defpackage.cdm.a(5, "PrimesForPrimes", "Queue overflow", new java.lang.Object[0]);
        }
    }
}
