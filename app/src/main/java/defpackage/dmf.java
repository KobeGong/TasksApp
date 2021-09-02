package defpackage;

/* renamed from: dmf reason: default package */
/* compiled from: PG */
public abstract class dmf {
    public volatile int k = -1;

    public abstract defpackage.dmf a(defpackage.dlw dlw);

    public final int c() {
        int a = a();
        this.k = a;
        return a;
    }

    public int a() {
        return 0;
    }

    public void a(defpackage.dlx dlx) {
    }

    public static final byte[] a(defpackage.dmf dmf) {
        byte[] bArr = new byte[dmf.c()];
        try {
            defpackage.dlx a = defpackage.dlx.a(bArr, bArr.length);
            dmf.a(a);
            if (a.a.remaining() == 0) {
                return bArr;
            }
            throw new java.lang.IllegalStateException(java.lang.String.format("Did not write as much data as expected, %s bytes remaining.", new java.lang.Object[]{java.lang.Integer.valueOf(a.a.remaining())}));
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public static final defpackage.dmf a(defpackage.dmf dmf, byte[] bArr, int i, int i2) {
        try {
            defpackage.dlw a = defpackage.dlw.a(bArr, i, i2);
            dmf.a(a);
            a.a(0);
            return dmf;
        } catch (defpackage.dme e) {
            throw e;
        } catch (java.io.IOException e2) {
            throw new java.lang.RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }

    public java.lang.String toString() {
        return defpackage.dgv.a(this);
    }

    /* renamed from: b */
    public defpackage.dmf clone() {
        return (defpackage.dmf) super.clone();
    }
}
