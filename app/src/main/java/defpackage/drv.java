package defpackage;

import java.util.concurrent.Executor;

/* renamed from: drv  reason: default package */
/* compiled from: PG */
final class drv extends duy {
    private final dth a;
    private final String b;
    private final /* synthetic */ dru c;

    drv(dru dru, dth dth, String str) {
        this.c = dru;
        this.a = (dth) cld.a(dth, "delegate");
        this.b = (String) cld.a(str, "authority");
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.duy
    public final dth c() {
        return this.a;
    }

    @Override // defpackage.dtb, defpackage.duy
    public final dta a(dpb dpb, dor dor, dna dna) {
        dmy dmy = dna.e;
        if (dmy == null) {
            return this.a.a(dpb, dor, dna);
        }
        dmz dmz = new dmz(this.a, dpb, dor, dna);
        dmw a2 = dmv.a().a(dmy.b, this.b).a(dmy.a, dps.NONE);
        dmv a3 = this.a.a();
        a2.a(a3.a.size()).putAll(a3.a);
        if (dna.d != null) {
            a2.a(dmy.b, dna.d);
        }
        try {
            dmv a4 = a2.a();
            Executor executor = dna.c;
            Executor executor2 = this.c.a;
            if (executor == null) {
                if (executor2 != null) {
                    executor = executor2;
                } else {
                    throw new NullPointerException("Both parameters are null");
                }
            }
            dmy.a(dpb, a4, executor, dmz);
        } catch (Throwable th) {
            dmz.a(dpw.f.a("Credentials should use fail() instead of throwing exceptions").b(th));
        }
        return dmz.a();
    }
}
