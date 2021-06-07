package defpackage;

import java.nio.charset.Charset;

/* access modifiers changed from: package-private */
/* renamed from: dhh  reason: default package */
/* compiled from: PG */
public class dhh extends dhg {
    public static final long serialVersionUID = 1;
    public final byte[] c;

    dhh(byte[] bArr) {
        this.c = bArr;
    }

    @Override // defpackage.dha
    public byte a(int i) {
        return this.c[i];
    }

    @Override // defpackage.dha
    public int a() {
        return this.c.length;
    }

    @Override // defpackage.dha
    public final dha a(int i, int i2) {
        int c2 = c(i, i2, a());
        if (c2 == 0) {
            return dha.a;
        }
        return new dhc(this.c, h() + i, c2);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dha
    public void b(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.c, i, bArr, i2, i3);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.dha
    public final void a(dgz dgz) {
        dgz.a(this.c, h(), a());
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dha
    public final String a(Charset charset) {
        return new String(this.c, h(), a(), charset);
    }

    @Override // defpackage.dha
    public final boolean d() {
        int h = h();
        return dli.a(this.c, h, a() + h);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dha
    public final int a(int i, int i2, int i3) {
        int h = h() + i2;
        return dli.a.a(i, this.c, h, h + i3);
    }

    @Override // defpackage.dha
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dha)) {
            return false;
        }
        if (a() != ((dha) obj).a()) {
            return false;
        }
        if (a() == 0) {
            return true;
        }
        if (!(obj instanceof dhh)) {
            return obj.equals(this);
        }
        int i = this.b;
        int i2 = ((dhh) obj).b;
        if (i == 0 || i2 == 0 || i == i2) {
            return a((dhh) obj, 0, a());
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.dhg
    public final boolean a(dha dha, int i, int i2) {
        if (i2 > dha.a()) {
            throw new IllegalArgumentException(new StringBuilder(40).append("Length too large: ").append(i2).append(a()).toString());
        } else if (i + i2 > dha.a()) {
            throw new IllegalArgumentException(new StringBuilder(59).append("Ran off end of other: ").append(i).append(", ").append(i2).append(", ").append(dha.a()).toString());
        } else if (!(dha instanceof dhh)) {
            return dha.a(i, i + i2).equals(a(0, i2));
        } else {
            dhh dhh = (dhh) dha;
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
    @Override // defpackage.dha
    public final int b(int i, int i2, int i3) {
        return dim.a(i, this.c, h() + i2, i3);
    }

    @Override // defpackage.dha
    public final dhj e() {
        return dhj.a(this.c, h(), a(), true);
    }

    /* access modifiers changed from: protected */
    public int h() {
        return 0;
    }
}
