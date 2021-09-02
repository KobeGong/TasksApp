package defpackage;

/* renamed from: dwm reason: default package */
/* compiled from: PG */
final class dwm extends defpackage.dyb {
    private final /* synthetic */ defpackage.dna r;
    private final /* synthetic */ defpackage.dpb s;
    private final /* synthetic */ defpackage.dns t;
    private final /* synthetic */ defpackage.dsx u;

    dwm(defpackage.dsx dsx, defpackage.dpb dpb, defpackage.dor dor, defpackage.dyr dyr, long j, long j2, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.dyu dyu, defpackage.dzb dzb, defpackage.dna dna, defpackage.dpb dpb2, defpackage.dns dns) {
        this.u = dsx;
        this.r = dna;
        this.s = dpb2;
        this.t = dns;
        super(dpb, dor, dyr, j, j2, executor, scheduledExecutorService, dyu, dzb);
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.dpw a() {
        return this.u.a.z.a(this);
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        defpackage.dwy dwy = this.u.a.z;
        synchronized (dwy.a) {
            dwy.b.remove(this);
            if (dwy.b.isEmpty()) {
                dwy.b = new java.util.HashSet();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.dta a(defpackage.dnm dnm, defpackage.dor dor) {
        defpackage.dna a = this.r.a(dnm);
        defpackage.dtb a2 = this.u.a(new defpackage.dxp(this.s, dor, a));
        defpackage.dns c = this.t.c();
        try {
            defpackage.dta a3 = a2.a(this.s, dor, a);
            return a3;
        } finally {
            this.t.a(c);
        }
    }
}
