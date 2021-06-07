package defpackage;

import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: dwm  reason: default package */
/* compiled from: PG */
final class dwm extends dyb {
    private final /* synthetic */ dna r;
    private final /* synthetic */ dpb s;
    private final /* synthetic */ dns t;
    private final /* synthetic */ dsx u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    dwm(dsx dsx, dpb dpb, dor dor, dyr dyr, long j, long j2, Executor executor, ScheduledExecutorService scheduledExecutorService, dyu dyu, dzb dzb, dna dna, dpb dpb2, dns dns) {
        super(dpb, dor, dyr, j, j2, executor, scheduledExecutorService, dyu, dzb);
        this.u = dsx;
        this.r = dna;
        this.s = dpb2;
        this.t = dns;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.dyb
    public final dpw a() {
        return this.u.a.z.a(this);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.dyb
    public final void b() {
        dwy dwy = this.u.a.z;
        synchronized (dwy.a) {
            dwy.b.remove(this);
            if (dwy.b.isEmpty()) {
                dwy.b = new HashSet();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.dyb
    public final dta a(dnm dnm, dor dor) {
        dna a = this.r.a(dnm);
        dtb a2 = this.u.a(new dxp(this.s, dor, a));
        dns c = this.t.c();
        try {
            return a2.a(this.s, dor, a);
        } finally {
            this.t.a(c);
        }
    }
}
