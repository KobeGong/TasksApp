package defpackage;

import java.io.IOException;

/* renamed from: blb  reason: default package */
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

    public void a(bku bku) {
    }

    public static final byte[] a(blb blb) {
        byte[] bArr = new byte[blb.d()];
        try {
            bku a = bku.a(bArr, bArr.length);
            blb.a(a);
            if (a.a.remaining() == 0) {
                return bArr;
            }
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", Integer.valueOf(a.a.remaining())));
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public String toString() {
        return bjr.a(this);
    }

    /* renamed from: c */
    public blb clone() {
        return (blb) super.clone();
    }
}
