package defpackage;

/* renamed from: drv reason: default package */
/* compiled from: PG */
final class drv extends defpackage.duy {
    private final defpackage.dth a;
    private final java.lang.String b;
    private final /* synthetic */ defpackage.dru c;

    drv(defpackage.dru dru, defpackage.dth dth, java.lang.String str) {
        this.c = dru;
        this.a = (defpackage.dth) defpackage.cld.a((java.lang.Object) dth, (java.lang.Object) "delegate");
        this.b = (java.lang.String) defpackage.cld.a((java.lang.Object) str, (java.lang.Object) "authority");
    }

    /* access modifiers changed from: protected */
    public final defpackage.dth c() {
        return this.a;
    }

    public final defpackage.dta a(defpackage.dpb dpb, defpackage.dor dor, defpackage.dna dna) {
        defpackage.dmy dmy = dna.e;
        if (dmy == null) {
            return this.a.a(dpb, dor, dna);
        }
        defpackage.dmz dmz = new defpackage.dmz(this.a, dpb, dor, dna);
        defpackage.dmw a2 = defpackage.dmv.a().a(defpackage.dmy.b, this.b).a(defpackage.dmy.a, defpackage.dps.NONE);
        defpackage.dmv a3 = this.a.a();
        a2.a(a3.a.size()).putAll(a3.a);
        if (dna.d != null) {
            a2.a(defpackage.dmy.b, dna.d);
        }
        try {
            defpackage.dmv a4 = a2.a();
            java.util.concurrent.Executor executor = dna.c;
            java.util.concurrent.Executor executor2 = this.c.a;
            if (executor == null) {
                if (executor2 != null) {
                    executor = executor2;
                } else {
                    throw new java.lang.NullPointerException("Both parameters are null");
                }
            }
            dmy.a(dpb, a4, executor, dmz);
        } catch (Throwable th) {
            dmz.a(defpackage.dpw.f.a("Credentials should use fail() instead of throwing exceptions").b(th));
        }
        return dmz.a();
    }
}
