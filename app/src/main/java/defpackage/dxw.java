package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: dxw  reason: default package */
/* compiled from: PG */
public final class dxw {
    public static dxv a(byte[] bArr, int i, int i2) {
        return new dxy(bArr, i, i2);
    }

    public static dxv a(ByteBuffer byteBuffer) {
        return new dxz(byteBuffer);
    }

    public static String a(dxv dxv, Charset charset) {
        cld.a(charset, "charset");
        cld.a(dxv, "buffer");
        int a = dxv.a();
        byte[] bArr = new byte[a];
        dxv.a(bArr, 0, a);
        return new String(bArr, charset);
    }

    public static InputStream a(dxv dxv) {
        return new dxx(dxv);
    }

    static {
        new dxy(new byte[0]);
    }
}
