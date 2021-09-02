package defpackage;

/* renamed from: bff reason: default package */
/* compiled from: PG */
abstract class bff extends defpackage.bfd {
    private static final java.lang.ref.WeakReference b = new java.lang.ref.WeakReference(null);
    private java.lang.ref.WeakReference a = b;

    bff(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: protected */
    public abstract byte[] d();

    /* access modifiers changed from: 0000 */
    public final byte[] c() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.a.get();
            if (bArr == null) {
                bArr = d();
                this.a = new java.lang.ref.WeakReference(bArr);
            }
        }
        return bArr;
    }
}
