package defpackage;

import java.util.Arrays;

/* access modifiers changed from: package-private */
/* renamed from: dmg  reason: default package */
/* compiled from: PG */
public final class dmg {
    public final int a;
    public final byte[] b;

    dmg(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dmg)) {
            return false;
        }
        dmg dmg = (dmg) obj;
        return this.a == dmg.a && Arrays.equals(this.b, dmg.b);
    }

    public final int hashCode() {
        return ((this.a + 527) * 31) + Arrays.hashCode(this.b);
    }
}
