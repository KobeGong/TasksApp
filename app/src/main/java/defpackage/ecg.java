package defpackage;

/* renamed from: ecg reason: default package */
/* compiled from: PG */
public final class ecg implements java.lang.Comparable {
    public static final defpackage.ecg a = new defpackage.ecg(new byte[8]);
    public final byte[] b;

    private ecg(byte[] bArr) {
        this.b = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.ecg)) {
            return false;
        }
        return java.util.Arrays.equals(this.b, ((defpackage.ecg) obj).b);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.b);
    }

    public final java.lang.String toString() {
        defpackage.cwe a2 = defpackage.cwe.b.a();
        byte[] bArr = this.b;
        return defpackage.cky.b((java.lang.Object) this).a("spanId", (java.lang.Object) a2.a(bArr, bArr.length)).toString();
    }

    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        defpackage.ecg ecg = (defpackage.ecg) obj;
        for (int i = 0; i < 8; i++) {
            if (this.b[i] != ecg.b[i]) {
                return this.b[i] < ecg.b[i] ? -1 : 1;
            }
        }
        return 0;
    }
}
