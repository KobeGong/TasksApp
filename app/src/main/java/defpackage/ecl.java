package defpackage;

/* renamed from: ecl reason: default package */
/* compiled from: PG */
public final class ecl implements java.lang.Comparable {
    public static final defpackage.ecl a = new defpackage.ecl(new byte[16]);
    private final byte[] b;

    private ecl(byte[] bArr) {
        this.b = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.ecl)) {
            return false;
        }
        return java.util.Arrays.equals(this.b, ((defpackage.ecl) obj).b);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.b);
    }

    public final java.lang.String toString() {
        defpackage.cwe a2 = defpackage.cwe.b.a();
        byte[] bArr = this.b;
        return defpackage.cky.b((java.lang.Object) this).a("traceId", (java.lang.Object) a2.a(bArr, bArr.length)).toString();
    }

    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        defpackage.ecl ecl = (defpackage.ecl) obj;
        for (int i = 0; i < 16; i++) {
            if (this.b[i] != ecl.b[i]) {
                return this.b[i] < ecl.b[i] ? -1 : 1;
            }
        }
        return 0;
    }
}
