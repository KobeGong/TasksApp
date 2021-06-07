package defpackage;

/* renamed from: bbw  reason: default package */
/* compiled from: PG */
public final class bbw implements ays {
    public final int a;
    public final ayp b;
    public final ays c;
    private /* synthetic */ bbv d;

    public bbw(bbv bbv, int i, ayp ayp, ays ays) {
        this.d = bbv;
        this.a = i;
        this.b = ayp;
        this.c = ays;
        ayp.a((ays) this);
    }

    @Override // defpackage.ays
    public final void a(axq axq) {
        String valueOf = String.valueOf(axq);
        new StringBuilder(String.valueOf(valueOf).length() + 27).append("beginFailureResolution for ").append(valueOf);
        bbv bbv = this.d;
        bcd bcd = new bcd(axq, this.a);
        if (bbv.d.compareAndSet(null, bcd)) {
            bbv.e.post(new bce(bbv, bcd));
        }
    }
}
