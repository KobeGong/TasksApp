package defpackage;

/* renamed from: btp reason: default package */
/* compiled from: PG */
public final class btp extends defpackage.btu {
    private final java.lang.String a;
    private final java.lang.String b;

    public btp(java.lang.String str, java.lang.String str2) {
        this.a = str;
        this.b = str2;
    }

    public final java.lang.String a() {
        return this.a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        java.lang.String str2 = this.b;
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 32 + java.lang.String.valueOf(str2).length()).append("PreferenceKey{key=").append(str).append(", dynamicKey=").append(str2).append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.btu)) {
            return false;
        }
        defpackage.btu btu = (defpackage.btu) obj;
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
