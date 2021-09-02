package defpackage;

/* renamed from: dmb reason: default package */
/* compiled from: PG */
public final class dmb implements java.lang.Cloneable {
    public static final defpackage.dmc a = new defpackage.dmc();
    public int[] b;
    public defpackage.dmc[] c;
    public int d;

    dmb() {
        this(10);
    }

    private dmb(int i) {
        int a2 = a(i);
        this.b = new int[a2];
        this.c = new defpackage.dmc[a2];
        this.d = 0;
    }

    public final boolean equals(java.lang.Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.dmb)) {
            return false;
        }
        defpackage.dmb dmb = (defpackage.dmb) obj;
        if (this.d != dmb.d) {
            return false;
        }
        int[] iArr = this.b;
        int[] iArr2 = dmb.b;
        int i = this.d;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                z = true;
                break;
            } else if (iArr[i2] != iArr2[i2]) {
                z = false;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            defpackage.dmc[] dmcArr = this.c;
            defpackage.dmc[] dmcArr2 = dmb.c;
            int i3 = this.d;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                } else if (!dmcArr[i4].equals(dmcArr2[i4])) {
                    z2 = false;
                    break;
                } else {
                    i4++;
                }
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (((i * 31) + this.b[i2]) * 31) + this.c[i2].hashCode();
        }
        return i;
    }

    static int a(int i) {
        int i2 = i << 2;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            } else if (i2 <= (1 << i3) - 12) {
                i2 = (1 << i3) - 12;
                break;
            } else {
                i3++;
            }
        }
        return i2 / 4;
    }

    /* access modifiers changed from: 0000 */
    public final int b(int i) {
        int i2 = 0;
        int i3 = this.d - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            int i5 = this.b[i4];
            if (i5 < i) {
                i2 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return i2 ^ -1;
    }

    public final /* synthetic */ java.lang.Object clone() {
        int i = this.d;
        defpackage.dmb dmb = new defpackage.dmb(i);
        java.lang.System.arraycopy(this.b, 0, dmb.b, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] != null) {
                dmb.c[i2] = (defpackage.dmc) this.c[i2].clone();
            }
        }
        dmb.d = i;
        return dmb;
    }
}
