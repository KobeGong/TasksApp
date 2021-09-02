package defpackage;

/* renamed from: dhh reason: default package */
/* compiled from: PG */
class dhh extends defpackage.dhg {
    public static final long serialVersionUID = 1;
    public final byte[] c;

    dhh(byte[] bArr) {
        this.c = bArr;
    }

    public byte a(int i) {
        return this.c[i];
    }

    public int a() {
        return this.c.length;
    }

    public final defpackage.dha a(int i, int i2) {
        int c2 = c(i, i2, a());
        if (c2 == 0) {
            return defpackage.dha.a;
        }
        return new defpackage.dhc(this.c, h() + i, c2);
    }

    /* access modifiers changed from: protected */
    public void b(byte[] bArr, int i, int i2, int i3) {
        java.lang.System.arraycopy(this.c, i, bArr, i2, i3);
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.dgz dgz) {
        dgz.a(this.c, h(), a());
    }

    /* access modifiers changed from: protected */
    public final java.lang.String a(java.nio.charset.Charset charset) {
        return new java.lang.String(this.c, h(), a(), charset);
    }

    public final boolean d() {
        int h = h();
        return defpackage.dli.a(this.c, h, a() + h);
    }

    /* access modifiers changed from: protected */
    public final int a(int i, int i2, int i3) {
        int h = h() + i2;
        return defpackage.dli.a.a(i, this.c, h, h + i3);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.dha)) {
            return false;
        }
        if (a() != ((defpackage.dha) obj).a()) {
            return false;
        }
        if (a() == 0) {
            return true;
        }
        if (!(obj instanceof defpackage.dhh)) {
            return obj.equals(this);
        }
        defpackage.dhh dhh = (defpackage.dhh) obj;
        int i = this.b;
        int i2 = dhh.b;
        if (i == 0 || i2 == 0 || i == i2) {
            return a((defpackage.dhh) obj, 0, a());
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(defpackage.dha dha, int i, int i2) {
        if (i2 > dha.a()) {
            throw new java.lang.IllegalArgumentException("Length too large: " + i2 + a());
        } else if (i + i2 > dha.a()) {
            throw new java.lang.IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + dha.a());
        } else if (!(dha instanceof defpackage.dhh)) {
            return dha.a(i, i + i2).equals(a(0, i2));
        } else {
            defpackage.dhh dhh = (defpackage.dhh) dha;
            byte[] bArr = this.c;
            byte[] bArr2 = dhh.c;
            int h = h() + i2;
            int h2 = h();
            int h3 = dhh.h() + i;
            while (h2 < h) {
                if (bArr[h2] != bArr2[h3]) {
                    return false;
                }
                h2++;
                h3++;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final int b(int i, int i2, int i3) {
        return defpackage.dim.a(i, this.c, h() + i2, i3);
    }

    public final defpackage.dhj e() {
        return defpackage.dhj.a(this.c, h(), a(), true);
    }

    /* access modifiers changed from: protected */
    public int h() {
        return 0;
    }
}
