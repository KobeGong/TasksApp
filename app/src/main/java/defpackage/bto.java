package defpackage;

/* renamed from: bto reason: default package */
/* compiled from: PG */
public final class bto extends defpackage.bts {
    private final defpackage.btu a;
    private final defpackage.btr b;

    public bto(defpackage.btu btu, defpackage.btr btr) {
        this.a = btu;
        this.b = btr;
    }

    public final defpackage.btu a() {
        return this.a;
    }

    public final defpackage.btr b() {
        return this.b;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.a);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.b);
        return new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 44 + java.lang.String.valueOf(valueOf2).length()).append("PreferenceEntry{preferenceKey=").append(valueOf).append(", preference=").append(valueOf2).append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.bts)) {
            return false;
        }
        defpackage.bts bts = (defpackage.bts) obj;
        if (!this.a.equals(bts.a()) || !this.b.equals(bts.b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
