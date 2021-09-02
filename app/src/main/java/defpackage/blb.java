package defpackage;

/* renamed from: blb reason: default package */
/* compiled from: PG */
public class blb {
    public volatile int b = -1;

    public final int d() {
        int a = a();
        this.b = a;
        return a;
    }

    /* access modifiers changed from: protected */
    public int a() {
        return 0;
    }

    public void a(defpackage.bku bku) {
    }

    public static final byte[] a(defpackage.blb blb) {
        byte[] bArr = new byte[blb.d()];
        try {
            defpackage.bku a = defpackage.bku.a(bArr, bArr.length);
            blb.a(a);
            if (a.a.remaining() == 0) {
                return bArr;
            }
            throw new java.lang.IllegalStateException(java.lang.String.format("Did not write as much data as expected, %s bytes remaining.", new java.lang.Object[]{java.lang.Integer.valueOf(a.a.remaining())}));
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public java.lang.String toString() {
        return defpackage.bjr.a(this);
    }

    /* renamed from: c */
    public defpackage.blb clone() {
        return (defpackage.blb) super.clone();
    }
}
