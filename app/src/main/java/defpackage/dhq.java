package defpackage;

/* renamed from: dhq reason: default package */
/* compiled from: PG */
final class dhq extends defpackage.dhp {
    private final java.nio.ByteBuffer e;
    private int f;

    dhq(java.nio.ByteBuffer byteBuffer) {
        super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        this.e = byteBuffer;
        this.f = byteBuffer.position();
    }

    public final void h() {
        this.e.position(this.f + (this.d - this.c));
    }
}
