package defpackage;

/* renamed from: dhc reason: default package */
/* compiled from: PG */
final class dhc extends defpackage.dhh {
    public static final long serialVersionUID = 1;
    private final int d;
    private final int e;

    dhc(byte[] bArr, int i, int i2) {
        super(bArr);
        c(i, i + i2, bArr.length);
        this.d = i;
        this.e = i2;
    }

    public final byte a(int i) {
        b(i, a());
        return this.c[this.d + i];
    }

    public final int a() {
        return this.e;
    }

    /* access modifiers changed from: protected */
    public final int h() {
        return this.d;
    }

    /* access modifiers changed from: protected */
    public final void b(byte[] bArr, int i, int i2, int i3) {
        java.lang.System.arraycopy(this.c, h() + i, bArr, i2, i3);
    }

    /* access modifiers changed from: 0000 */
    public final java.lang.Object writeReplace() {
        return defpackage.dha.a(b());
    }

    private final void readObject(java.io.ObjectInputStream objectInputStream) {
        throw new java.io.InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }
}
