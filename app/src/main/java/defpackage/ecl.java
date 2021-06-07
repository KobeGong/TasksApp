package defpackage;

import java.util.Arrays;

/* renamed from: ecl  reason: default package */
/* compiled from: PG */
public final class ecl implements Comparable {
    public static final ecl a = new ecl(new byte[16]);
    private final byte[] b;

    private ecl(byte[] bArr) {
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ecl)) {
            return false;
        }
        return Arrays.equals(this.b, ((ecl) obj).b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    public final String toString() {
        crs b2 = cky.b(this);
        cwe a2 = cwe.b.a();
        byte[] bArr = this.b;
        return b2.a("traceId", a2.a(bArr, bArr.length)).toString();
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        ecl ecl = (ecl) obj;
        for (int i = 0; i < 16; i++) {
            if (this.b[i] != ecl.b[i]) {
                return this.b[i] < ecl.b[i] ? -1 : 1;
            }
        }
        return 0;
    }
}
