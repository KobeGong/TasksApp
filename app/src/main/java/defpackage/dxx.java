package defpackage;

import java.io.InputStream;

/* access modifiers changed from: package-private */
/* renamed from: dxx  reason: default package */
/* compiled from: PG */
public final class dxx extends InputStream implements doj {
    private final dxv a;

    public dxx(dxv dxv) {
        this.a = (dxv) cld.a(dxv, "buffer");
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.a.a();
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.a.a() == 0) {
            return -1;
        }
        return this.a.b();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.a.a() == 0) {
            return -1;
        }
        int min = Math.min(this.a.a(), i2);
        this.a.a(bArr, i, min);
        return min;
    }
}
