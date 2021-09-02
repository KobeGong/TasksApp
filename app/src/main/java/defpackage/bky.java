package defpackage;

/* renamed from: bky reason: default package */
/* compiled from: PG */
public final class bky implements java.lang.Cloneable {
    public defpackage.bkz[] a;
    public int b;
    private int[] c;

    bky() {
        this(10);
    }

    private bky(int i) {
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
        int i4 = i2 / 4;
        this.c = new int[i4];
        this.a = new defpackage.bkz[i4];
        this.b = 0;
    }

    public final boolean a() {
        return this.b == 0;
    }

    public final boolean equals(java.lang.Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.bky)) {
            return false;
        }
        defpackage.bky bky = (defpackage.bky) obj;
        if (this.b != bky.b) {
            return false;
        }
        int[] iArr = this.c;
        int[] iArr2 = bky.c;
        int i = this.b;
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
            defpackage.bkz[] bkzArr = this.a;
            defpackage.bkz[] bkzArr2 = bky.a;
            int i3 = this.b;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                } else if (!bkzArr[i4].equals(bkzArr2[i4])) {
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
        for (int i2 = 0; i2 < this.b; i2++) {
            i = (((i * 31) + this.c[i2]) * 31) + this.a[i2].hashCode();
        }
        return i;
    }

    public final /* synthetic */ java.lang.Object clone() {
        int i = this.b;
        defpackage.bky bky = new defpackage.bky(i);
        java.lang.System.arraycopy(this.c, 0, bky.c, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            if (this.a[i2] != null) {
                bky.a[i2] = (defpackage.bkz) this.a[i2].clone();
            }
        }
        bky.b = i;
        return bky;
    }

    static {
        new defpackage.bkz();
    }
}
