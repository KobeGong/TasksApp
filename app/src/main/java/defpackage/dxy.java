package defpackage;

/* renamed from: dxy reason: default package */
/* compiled from: PG */
final class dxy extends defpackage.dxv {
    private int a;
    private final int b;
    private final byte[] c;

    dxy(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    dxy(byte[] bArr, int i, int i2) {
        boolean z;
        boolean z2 = true;
        defpackage.cld.a(i >= 0, (java.lang.Object) "offset must be >= 0");
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        defpackage.cld.a(z, (java.lang.Object) "length must be >= 0");
        if (i + i2 > bArr.length) {
            z2 = false;
        }
        defpackage.cld.a(z2, (java.lang.Object) "offset + length exceeds array boundary");
        this.c = (byte[]) defpackage.cld.a((java.lang.Object) bArr, (java.lang.Object) "bytes");
        this.a = i;
        this.b = i + i2;
    }

    public final int a() {
        return this.b - this.a;
    }

    public final int b() {
        b(1);
        byte[] bArr = this.c;
        int i = this.a;
        this.a = i + 1;
        return bArr[i] & 255;
    }

    public final void a(byte[] bArr, int i, int i2) {
        java.lang.System.arraycopy(this.c, this.a, bArr, i, i2);
        this.a += i2;
    }

    public final /* synthetic */ defpackage.dxv a(int i) {
        b(i);
        int i2 = this.a;
        this.a += i;
        return new defpackage.dxy(this.c, i2, i);
    }
}
