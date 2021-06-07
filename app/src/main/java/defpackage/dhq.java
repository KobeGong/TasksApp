package defpackage;

import java.nio.ByteBuffer;

/* access modifiers changed from: package-private */
/* renamed from: dhq  reason: default package */
/* compiled from: PG */
public final class dhq extends dhp {
    private final ByteBuffer e;
    private int f;

    dhq(ByteBuffer byteBuffer) {
        super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        this.e = byteBuffer;
        this.f = byteBuffer.position();
    }

    @Override // defpackage.dhn, defpackage.dhp
    public final void h() {
        this.e.position(this.f + (this.d - this.c));
    }
}
