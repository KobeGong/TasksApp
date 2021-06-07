package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: cjj  reason: default package */
/* compiled from: PG */
final class cjj implements Runnable {
    private final AtomicBoolean a = new AtomicBoolean(true);
    private final /* synthetic */ ExecutorService b;
    private final /* synthetic */ cjw c;
    private final /* synthetic */ clt d;
    private final /* synthetic */ clt e;
    private final /* synthetic */ clt f;
    private final /* synthetic */ cgq g;
    private final /* synthetic */ cjm h;
    private final /* synthetic */ boolean i;
    private final /* synthetic */ cji j;

    cjj(cji cji, ExecutorService executorService, cjw cjw, clt clt, clt clt2, clt clt3, cgq cgq, cjm cjm, boolean z) {
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
            cji.a(this.j, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
            if (this.i) {
                this.b.shutdown();
            }
        }
    }
}
