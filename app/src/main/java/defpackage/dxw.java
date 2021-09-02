package defpackage;

/* renamed from: dxw reason: default package */
/* compiled from: PG */
public final class dxw {
    public static defpackage.dxv a(byte[] bArr, int i, int i2) {
        return new defpackage.dxy(bArr, i, i2);
    }

    public static defpackage.dxv a(java.nio.ByteBuffer byteBuffer) {
        return new defpackage.dxz(byteBuffer);
    }

    public static java.lang.String a(defpackage.dxv dxv, java.nio.charset.Charset charset) {
        defpackage.cld.a((java.lang.Object) charset, (java.lang.Object) "charset");
        defpackage.cld.a((java.lang.Object) dxv, (java.lang.Object) "buffer");
        int a = dxv.a();
        byte[] bArr = new byte[a];
        dxv.a(bArr, 0, a);
        return new java.lang.String(bArr, charset);
    }

    public static java.io.InputStream a(defpackage.dxv dxv) {
        return new defpackage.dxx(dxv);
    }

    static {
        new defpackage.dxy(new byte[0]);
    }
}
