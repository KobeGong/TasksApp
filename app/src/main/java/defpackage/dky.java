package defpackage;

import java.util.Arrays;

/* renamed from: dky  reason: default package */
/* compiled from: PG */
public final class dky {
    public static final dky a = new dky(0, new int[0], new Object[0], false);
    public int b;
    public int[] c;
    public Object[] d;
    public int e;
    public boolean f;

    static dky a(dky dky, dky dky2) {
        int i = dky.b + dky2.b;
        int[] copyOf = Arrays.copyOf(dky.c, i);
        System.arraycopy(dky2.c, 0, copyOf, dky.b, dky2.b);
        Object[] copyOf2 = Arrays.copyOf(dky.d, i);
        System.arraycopy(dky2.d, 0, copyOf2, dky.b, dky2.b);
        return new dky(i, copyOf, copyOf2, true);
    }

    dky() {
        this(0, new int[8], new Object[8], true);
    }

    private dky(int i, int[] iArr, Object[] objArr, boolean z) {
        this.e = -1;
        this.b = i;
        this.c = iArr;
        this.d = objArr;
        this.f = z;
    }

    public final void a(dlt dlt) {
        if (this.b != 0) {
            if (bg.at == bg.at) {
                for (int i = 0; i < this.b; i++) {
                    a(this.c[i], this.d[i], dlt);
                }
                return;
            }
            for (int i2 = this.b - 1; i2 >= 0; i2--) {
                a(this.c[i2], this.d[i2], dlt);
            }
        }
    }

    private static void a(int i, Object obj, dlt dlt) {
        int i2 = i >>> 3;
        switch (i & 7) {
            case 0:
                dlt.a(i2, ((Long) obj).longValue());
                return;
            case 1:
                dlt.d(i2, ((Long) obj).longValue());
                return;
            case 2:
                dlt.a(i2, (dha) obj);
                return;
            case 3:
                if (bg.at == bg.at) {
                    dlt.a(i2);
                    ((dky) obj).a(dlt);
                    dlt.b(i2);
                    return;
                }
                dlt.b(i2);
                ((dky) obj).a(dlt);
                dlt.a(i2);
                return;
            case 4:
            default:
                throw new RuntimeException(dir.f());
            case 5:
                dlt.d(i2, ((Integer) obj).intValue());
                return;
        }
    }

    public final int a() {
        int a2;
        int i = this.e;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < this.b; i2++) {
                int i3 = this.c[i2];
                int i4 = i3 >>> 3;
                switch (i3 & 7) {
                    case 0:
                        a2 = dhn.e(i4, ((Long) this.d[i2]).longValue());
                        break;
                    case 1:
                        ((Long) this.d[i2]).longValue();
                        a2 = dhn.h(i4);
                        break;
                    case 2:
                        a2 = dhn.c(i4, (dha) this.d[i2]);
                        break;
                    case 3:
                        a2 = ((dky) this.d[i2]).a() + (dhn.m(i4) << 1);
                        break;
                    case 4:
                    default:
                        throw new IllegalStateException(dir.f());
                    case 5:
                        ((Integer) this.d[i2]).intValue();
                        a2 = dhn.f(i4);
                        break;
                }
                i += a2;
            }
            this.e = i;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof dky)) {
            return false;
        }
        dky dky = (dky) obj;
        if (this.b == dky.b) {
            int[] iArr = this.c;
            int[] iArr2 = dky.c;
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
                Object[] objArr = this.d;
                Object[] objArr2 = dky.d;
                int i3 = this.b;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
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
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        int i2 = (this.b + 527) * 31;
        int[] iArr = this.c;
        int i3 = this.b;
        int i4 = 17;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.d;
        int i7 = this.b;
        for (int i8 = 0; i8 < i7; i8++) {
            i = (i * 31) + objArr[i8].hashCode();
        }
        return i6 + i;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, Object obj) {
        if (!this.f) {
            throw new UnsupportedOperationException();
        }
        if (this.b == this.c.length) {
            int i2 = (this.b < 4 ? 8 : this.b >> 1) + this.b;
            this.c = Arrays.copyOf(this.c, i2);
            this.d = Arrays.copyOf(this.d, i2);
        }
        this.c[this.b] = i;
        this.d[this.b] = obj;
        this.b++;
    }
}
