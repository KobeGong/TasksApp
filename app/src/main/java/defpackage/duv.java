package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: duv  reason: default package */
/* compiled from: PG */
public final class duv implements dtb {
    private final dpw a;
    private final int b;

    duv(dpw dpw, int i) {
        cld.a(!dpw.a(), "error must not be OK");
        this.a = dpw;
        this.b = i;
    }

    @Override // defpackage.dtb
    public final dta a(dpb dpb, dor dor, dna dna) {
        return new duu(this.a, this.b);
    }

    @Override // defpackage.dzw
    public final dwd b() {
        throw new UnsupportedOperationException("Not a real transport");
    }
}
