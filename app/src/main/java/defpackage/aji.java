package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: aji  reason: default package */
/* compiled from: PG */
public final class aji extends ajh {
    private final boolean a;
    private final boolean b;

    aji(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.ajh
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.ajh
    public final boolean b() {
        return this.b;
    }

    public final String toString() {
        boolean z = this.a;
        return new StringBuilder(44).append("AccountSetupResult{success=").append(z).append(", new=").append(this.b).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajh)) {
            return false;
        }
        ajh ajh = (ajh) obj;
        return this.a == ajh.a() && this.b == ajh.b();
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
