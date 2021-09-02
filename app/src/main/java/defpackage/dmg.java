package defpackage;

/* renamed from: dmg reason: default package */
/* compiled from: PG */
final class dmg {
    public final int a;
    public final byte[] b;

    dmg(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.dmg)) {
            return false;
        }
        defpackage.dmg dmg = (defpackage.dmg) obj;
        if (this.a != dmg.a || !java.util.Arrays.equals(this.b, dmg.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.a + 527) * 31) + java.util.Arrays.hashCode(this.b);
    }
}
