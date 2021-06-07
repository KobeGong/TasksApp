package defpackage;

/* renamed from: btp  reason: default package */
/* compiled from: PG */
public final class btp extends btu {
    private final String a;
    private final String b;

    public btp(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.btu
    public final String a() {
        return this.a;
    }

    @Override // defpackage.btu
    public final String b() {
        return this.b;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        return new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(str2).length()).append("PreferenceKey{key=").append(str).append(", dynamicKey=").append(str2).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof btu)) {
            return false;
        }
        btu btu = (btu) obj;
        if (this.a.equals(btu.a())) {
            if (this.b == null) {
                if (btu.b() == null) {
                    return true;
                }
            } else if (this.b.equals(btu.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b == null ? 0 : this.b.hashCode()) ^ (1000003 * (this.a.hashCode() ^ 1000003));
    }
}
