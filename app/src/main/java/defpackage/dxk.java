package defpackage;

import java.io.OutputStream;

/* access modifiers changed from: package-private */
/* renamed from: dxk  reason: default package */
/* compiled from: PG */
public final class dxk extends OutputStream {
    private final /* synthetic */ dxi a;

    dxk(dxi dxi) {
        this.a = dxi;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.a.a(bArr, i, i2);
    }
}
