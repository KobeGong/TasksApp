package defpackage;

/* renamed from: dky reason: default package */
/* compiled from: PG */
public final class dky {
    public static final defpackage.dky a = new defpackage.dky(0, new int[0], new java.lang.Object[0], false);
    public int b;
    public int[] c;
    public java.lang.Object[] d;
    public int e;
    public boolean f;

    static defpackage.dky a(defpackage.dky dky, defpackage.dky dky2) {
        int i = dky.b + dky2.b;
        int[] copyOf = java.util.Arrays.copyOf(dky.c, i);
        java.lang.System.arraycopy(dky2.c, 0, copyOf, dky.b, dky2.b);
        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(dky.d, i);
        java.lang.System.arraycopy(dky2.d, 0, copyOf2, dky.b, dky2.b);
        return new defpackage.dky(i, copyOf, copyOf2, true);
    }

    dky() {
        this(0, new int[8], new java.lang.Object[8], true);
    }

    private dky(int i, int[] iArr, java.lang.Object[] objArr, boolean z) {
        this.e = -1;
        this.b = i;
        this.c = iArr;
        this.d = objArr;
        this.f = z;
    }

    public final void a(defpackage.dlt dlt) {
        if (this.b != 0) {
            if (defpackage.bg.at == defpackage.bg.at) {
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

    private static void a(int i, java.lang.Object obj, defpackage.dlt dlt) {
        int i2 = i >>> 3;
        switch (i & 7) {
            case 0:
                dlt.a(i2, ((java.lang.Long) obj).longValue());
                return;
            case 1:
                dlt.d(i2, ((java.lang.Long) obj).longValue());
                return;
            case 2:
                dlt.a(i2, (defpackage.dha) obj);
                return;
            case 3:
                if (defpackage.bg.at == defpackage.bg.at) {
                    dlt.a(i2);
                    ((defpackage.dky) obj).a(dlt);
                    dlt.b(i2);
                    return;
                }
                dlt.b(i2);
                ((defpackage.dky) obj).a(dlt);
                dlt.a(i2);
                return;
            case 5:
                dlt.d(i2, ((java.lang.Integer) obj).intValue());
                return;
            default:
                throw new java.lang.RuntimeException(defpackage.dir.f());
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
                        a2 = defpackage.dhn.e(i4, ((java.lang.Long) this.d[i2]).longValue());
                        break;
                    case 1:
                        ((java.lang.Long) this.d[i2]).longValue();
                        a2 = defpackage.dhn.h(i4);
                        break;
                    case 2:
                        a2 = defpackage.dhn.c(i4, (defpackage.dha) this.d[i2]);
                        break;
                    case 3:
                        a2 = ((defpackage.dky) this.d[i2]).a() + (defpackage.dhn.m(i4) << 1);
                        break;
                    case 5:
                        ((java.lang.Integer) this.d[i2]).intValue();
                        a2 = defpackage.dhn.f(i4);
                        break;
                    default:
                        throw new java.lang.IllegalStateException(defpackage.dir.f());
                }
                i += a2;
            }
            this.e = i;
        }
        return i;
    }

    public final boolean equals(java.lang.Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof defpackage.dky)) {
            return false;
        }
        defpackage.dky dky = (defpackage.dky) obj;
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
                java.lang.Object[] objArr = this.d;
                java.lang.Object[] objArr2 = dky.d;
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
        int i3 = 17;
        for (int i4 = 0; i4 < this.b; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        java.lang.Object[] objArr = this.d;
        for (int i6 = 0; i6 < this.b; i6++) {
            i = (i * 31) + objArr[i6].hashCode();
        }
        return i5 + i;
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i, java.lang.Object obj) {
        if (!this.f) {
            throw new java.lang.UnsupportedOperationException();
        }
        if (this.b == this.c.length) {
            int i2 = (this.b < 4 ? 8 : this.b >> 1) + this.b;
            this.c = java.util.Arrays.copyOf(this.c, i2);
            this.d = java.util.Arrays.copyOf(this.d, i2);
        }
        this.c[this.b] = i;
        this.d[this.b] = obj;
        this.b++;
    }
}
