package defpackage;

/* renamed from: dxz reason: default package */
/* compiled from: PG */
final class dxz extends defpackage.dxv {
    private final java.nio.ByteBuffer a;

    dxz(java.nio.ByteBuffer byteBuffer) {
        this.a = (java.nio.ByteBuffer) defpackage.cld.a((java.lang.Object) byteBuffer, (java.lang.Object) "bytes");
    }

    public final int a() {
        return this.a.remaining();
    }

    public final int b() {
        b(1);
        return this.a.get() & 255;
    }

    public final void a(byte[] bArr, int i, int i2) {
        b(i2);
        this.a.get(bArr, i, i2);
    }

    public final /* synthetic */ defpackage.dxv a(int i) {
        b(i);
        java.nio.ByteBuffer duplicate = this.a.duplicate();
        duplicate.limit(this.a.position() + i);
        this.a.position(this.a.position() + i);
        return new defpackage.dxz(duplicate);
    }
}
