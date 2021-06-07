package defpackage;

import java.util.Arrays;

/* renamed from: ecg  reason: default package */
/* compiled from: PG */
public final class ecg implements Comparable {
    public static final ecg a = new ecg(new byte[8]);
    public final byte[] b;

    private ecg(byte[] bArr) {
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ecg)) {
            return false;
        }
        return Arrays.equals(this.b, ((ecg) obj).b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    public final String toString() {
        crs b2 = cky.b(this);
        cwe a2 = cwe.b.a();
        byte[] bArr = this.b;
        return b2.a("spanId", a2.a(bArr, bArr.length)).toString();
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        ecg ecg = (ecg) obj;
        for (int i = 0; i < 8; i++) {
            if (this.b[i] != ecg.b[i]) {
                return this.b[i] < ecg.b[i] ? -1 : 1;
            }
        }
        return 0;
    }
}
