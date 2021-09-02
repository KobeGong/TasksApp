package defpackage;

/* renamed from: dxv reason: default package */
/* compiled from: PG */
public abstract class dxv implements java.io.Closeable {
    public abstract int a();

    public abstract defpackage.dxv a(int i);

    public abstract void a(byte[] bArr, int i, int i2);

    public abstract int b();

    public void close() {
    }

    /* access modifiers changed from: protected */
    public final void b(int i) {
        if (a() < i) {
            throw new java.lang.IndexOutOfBoundsException();
        }
    }
}
