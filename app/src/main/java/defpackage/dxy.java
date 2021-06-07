package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: dxy  reason: default package */
/* compiled from: PG */
public final class dxy extends dxv {
    private int a;
    private final int b;
    private final byte[] c;

    dxy(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    dxy(byte[] bArr, int i, int i2) {
        boolean z;
        boolean z2 = true;
        cld.a(i >= 0, "offset must be >= 0");
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        cld.a(z, "length must be >= 0");
        cld.a(i + i2 > bArr.length ? false : z2, "offset + length exceeds array boundary");
        this.c = (byte[]) cld.a(bArr, "bytes");
        this.a = i;
        this.b = i + i2;
    }

    @Override // defpackage.dxv
    public final int a() {
        return this.b - this.a;
    }

    @Override // defpackage.dxv
    public final int b() {
        b(1);
        byte[] bArr = this.c;
        int i = this.a;
        this.a = i + 1;
        return bArr[i] & 255;
    }

    @Override // defpackage.dxv
    public final void a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.c, this.a, bArr, i, i2);
        this.a += i2;
    }

    @Override // defpackage.dxv
    public final /* synthetic */ dxv a(int i) {
        b(i);
        int i2 = this.a;
        this.a += i;
        return new dxy(this.c, i2, i);
    }
}
