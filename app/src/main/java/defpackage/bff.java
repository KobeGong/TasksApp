package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: bff  reason: default package */
/* compiled from: PG */
abstract class bff extends bfd {
    private static final WeakReference b = new WeakReference(null);
    private WeakReference a = b;

    bff(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: protected */
    public abstract byte[] d();

    /* access modifiers changed from: package-private */
    @Override // defpackage.bfd
    public final byte[] c() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.a.get();
            if (bArr == null) {
                bArr = d();
                this.a = new WeakReference(bArr);
            }
        }
        return bArr;
    }
}
