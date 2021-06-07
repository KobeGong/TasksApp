package defpackage;

import java.io.Closeable;

/* renamed from: dxv  reason: default package */
/* compiled from: PG */
public abstract class dxv implements Closeable {
    public abstract int a();

    public abstract dxv a(int i);

    public abstract void a(byte[] bArr, int i, int i2);

    public abstract int b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* access modifiers changed from: protected */
    public final void b(int i) {
        if (a() < i) {
            throw new IndexOutOfBoundsException();
        }
    }
}
