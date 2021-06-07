package defpackage;

import java.io.IOException;

/* renamed from: dmf  reason: default package */
/* compiled from: PG */
public abstract class dmf {
    public volatile int k = -1;

    public abstract dmf a(dlw dlw);

    public final int c() {
        int a = a();
        this.k = a;
        return a;
    }

    public int a() {
        return 0;
    }

    public void a(dlx dlx) {
    }

    public static final byte[] a(dmf dmf) {
        byte[] bArr = new byte[dmf.c()];
        try {
            dlx a = dlx.a(bArr, bArr.length);
            dmf.a(a);
            if (a.a.remaining() == 0) {
                return bArr;
            }
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", Integer.valueOf(a.a.remaining())));
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public static final dmf a(dmf dmf, byte[] bArr, int i, int i2) {
        try {
            dlw a = dlw.a(bArr, i, i2);
            dmf.a(a);
            a.a(0);
            return dmf;
        } catch (dme e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }

    public String toString() {
        return dgv.a(this);
    }

    /* renamed from: b */
    public dmf clone() {
        return (dmf) super.clone();
    }
}
