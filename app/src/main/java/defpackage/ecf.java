package defpackage;

/* renamed from: ecf reason: default package */
/* compiled from: PG */
public final class ecf {
    public static final defpackage.ecf c = new defpackage.ecf(defpackage.ecl.a, defpackage.ecg.a, defpackage.ecm.a);
    public final defpackage.ecg a;
    public final defpackage.ecm b;
    private final defpackage.ecl d;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.ecf)) {
            return false;
        }
        defpackage.ecf ecf = (defpackage.ecf) obj;
        if (!this.d.equals(ecf.d) || !this.a.equals(ecf.a) || !this.b.equals(ecf.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.d, this.a, this.b});
    }

    public final java.lang.String toString() {
        return defpackage.cky.b((java.lang.Object) this).a("traceId", (java.lang.Object) this.d).a("spanId", (java.lang.Object) this.a).a("traceOptions", (java.lang.Object) this.b).toString();
    }

    private ecf(defpackage.ecl ecl, defpackage.ecg ecg, defpackage.ecm ecm) {
        this.d = ecl;
        this.a = ecg;
        this.b = ecm;
    }
}
