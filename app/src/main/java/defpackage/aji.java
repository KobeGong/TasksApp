package defpackage;

/* renamed from: aji reason: default package */
/* compiled from: PG */
final class aji extends defpackage.ajh {
    private final boolean a;
    private final boolean b;

    aji(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final java.lang.String toString() {
        boolean z = this.a;
        return "AccountSetupResult{success=" + z + ", new=" + this.b + "}";
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.ajh)) {
            return false;
        }
        defpackage.ajh ajh = (defpackage.ajh) obj;
        if (this.a == ajh.a() && this.b == ajh.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 1231;
        if (this.a) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i3 = (i ^ 1000003) * 1000003;
        if (!this.b) {
            i2 = 1237;
        }
        return i3 ^ i2;
    }
}
