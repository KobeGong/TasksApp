package defpackage;

import java.nio.ByteBuffer;

/* renamed from: dzx  reason: default package */
/* compiled from: PG */
public final class dzx {
    public final ByteBuffer a;

    public final void a(byte[] bArr, int i, int i2) {
        this.a.put(bArr, i, i2);
    }

    public dzx(ByteBuffer byteBuffer) {
        this.a = (ByteBuffer) cld.a(byteBuffer, "buffer");
    }
}
