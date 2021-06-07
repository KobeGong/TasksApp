package defpackage;

/* renamed from: bto  reason: default package */
/* compiled from: PG */
public final class bto extends bts {
    private final btu a;
    private final btr b;

    public bto(btu btu, btr btr) {
        this.a = btu;
        this.b = btr;
    }

    @Override // defpackage.bts
    public final btu a() {
        return this.a;
    }

    @Override // defpackage.bts
    public final btr b() {
        return this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        return new StringBuilder(String.valueOf(valueOf).length() + 44 + String.valueOf(valueOf2).length()).append("PreferenceEntry{preferenceKey=").append(valueOf).append(", preference=").append(valueOf2).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bts)) {
            return false;
        }
        bts bts = (bts) obj;
        return this.a.equals(bts.a()) && this.b.equals(bts.b());
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
