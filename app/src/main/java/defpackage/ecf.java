package defpackage;

import java.util.Arrays;

/* renamed from: ecf  reason: default package */
/* compiled from: PG */
public final class ecf {
    public static final ecf c = new ecf(ecl.a, ecg.a, ecm.a);
    public final ecg a;
    public final ecm b;
    private final ecl d;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ecf)) {
            return false;
        }
        ecf ecf = (ecf) obj;
        return this.d.equals(ecf.d) && this.a.equals(ecf.a) && this.b.equals(ecf.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.a, this.b});
    }

    public final String toString() {
        return cky.b(this).a("traceId", this.d).a("spanId", this.a).a("traceOptions", this.b).toString();
    }

    private ecf(ecl ecl, ecg ecg, ecm ecm) {
        this.d = ecl;
        this.a = ecg;
        this.b = ecm;
    }
}
