package defpackage;

/* renamed from: dmb  reason: default package */
/* compiled from: PG */
public final class dmb implements Cloneable {
    public static final dmc a = new dmc();
    public int[] b;
    public dmc[] c;
    public int d;

    dmb() {
        this(10);
    }

    private dmb(int i) {
        int a2 = a(i);
        this.b = new int[a2];
        this.c = new dmc[a2];
        this.d = 0;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dmb)) {
            return false;
        }
        dmb dmb = (dmb) obj;
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
            dmc[] dmcArr = this.c;
            dmc[] dmcArr2 = dmb.c;
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

    /* access modifiers changed from: package-private */
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

    @Override // java.lang.Object
    public final /* synthetic */ Object clone() {
        int i = this.d;
        dmb dmb = new dmb(i);
        System.arraycopy(this.b, 0, dmb.b, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] != null) {
                dmb.c[i2] = (dmc) this.c[i2].clone();
            }
        }
        dmb.d = i;
        return dmb;
    }
}
