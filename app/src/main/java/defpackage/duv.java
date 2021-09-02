package defpackage;

/* renamed from: duv reason: default package */
/* compiled from: PG */
final class duv implements defpackage.dtb {
    private final defpackage.dpw a;
    private final int b;

    duv(defpackage.dpw dpw, int i) {
        defpackage.cld.a(!dpw.a(), (java.lang.Object) "error must not be OK");
        this.a = dpw;
        this.b = i;
    }

    public final defpackage.dta a(defpackage.dpb dpb, defpackage.dor dor, defpackage.dna dna) {
        return new defpackage.duu(this.a, this.b);
    }

    public final defpackage.dwd b() {
        throw new java.lang.UnsupportedOperationException("Not a real transport");
    }
}
