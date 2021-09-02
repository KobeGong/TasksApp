package defpackage;

/* renamed from: dxx reason: default package */
/* compiled from: PG */
final class dxx extends java.io.InputStream implements defpackage.doj {
    private final defpackage.dxv a;

    public dxx(defpackage.dxv dxv) {
        this.a = (defpackage.dxv) defpackage.cld.a((java.lang.Object) dxv, (java.lang.Object) "buffer");
    }

    public final int available() {
        return this.a.a();
    }

    public final int read() {
        if (this.a.a() == 0) {
            return -1;
        }
        return this.a.b();
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (this.a.a() == 0) {
            return -1;
        }
        int min = java.lang.Math.min(this.a.a(), i2);
        this.a.a(bArr, i, min);
        return min;
    }
}
