package defpackage;

/* renamed from: bbw reason: default package */
/* compiled from: PG */
public final class bbw implements defpackage.ays {
    public final int a;
    public final defpackage.ayp b;
    public final defpackage.ays c;
    private /* synthetic */ defpackage.bbv d;

    public bbw(defpackage.bbv bbv, int i, defpackage.ayp ayp, defpackage.ays ays) {
        this.d = bbv;
        this.a = i;
        this.b = ayp;
        this.c = ays;
        ayp.a((defpackage.ays) this);
    }

    public final void a(defpackage.axq axq) {
        java.lang.String valueOf = java.lang.String.valueOf(axq);
        new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 27).append("beginFailureResolution for ").append(valueOf);
        defpackage.bbv bbv = this.d;
        defpackage.bcd bcd = new defpackage.bcd(axq, this.a);
        if (bbv.d.compareAndSet(null, bcd)) {
            bbv.e.post(new defpackage.bce(bbv, bcd));
        }
    }
}
