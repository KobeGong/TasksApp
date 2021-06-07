package defpackage;

import java.nio.ByteBuffer;

/* access modifiers changed from: package-private */
/* renamed from: dxz  reason: default package */
/* compiled from: PG */
public final class dxz extends dxv {
    private final ByteBuffer a;

    dxz(ByteBuffer byteBuffer) {
        this.a = (ByteBuffer) cld.a(byteBuffer, "bytes");
    }

    @Override // defpackage.dxv
    public final int a() {
        return this.a.remaining();
    }

    @Override // defpackage.dxv
    public final int b() {
        b(1);
        return this.a.get() & 255;
    }

    @Override // defpackage.dxv
    public final void a(byte[] bArr, int i, int i2) {
        b(i2);
        this.a.get(bArr, i, i2);
    }

    @Override // defpackage.dxv
    public final /* synthetic */ dxv a(int i) {
        b(i);
        ByteBuffer duplicate = this.a.duplicate();
        duplicate.limit(this.a.position() + i);
        this.a.position(this.a.position() + i);
        return new dxz(duplicate);
    }
}
