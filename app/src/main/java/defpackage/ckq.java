package defpackage;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* access modifiers changed from: package-private */
/* renamed from: ckq  reason: default package */
/* compiled from: PG */
public final class ckq implements ckm, coe {
    private final clt b;
    private final BlockingQueue c;

    ckq(clt clt) {
        this(clt, new ArrayBlockingQueue(5));
    }

    private ckq(clt clt, BlockingQueue blockingQueue) {
        this.b = clt;
        this.c = blockingQueue;
    }

    @Override // defpackage.coe
    public final void a(efx efx) {
        clt clt;
        if (efx.w == null && (clt = (clt) this.c.poll()) != null) {
            efx.w = (efa) clt.a();
        }
        ((coe) cky.a((coe) this.b.a())).a(efx);
    }

    @Override // defpackage.ckm
    public final void a(clt clt) {
        if (!this.c.offer(clt)) {
            cdm.a(5, "PrimesForPrimes", "Queue overflow", new Object[0]);
        }
    }
}
