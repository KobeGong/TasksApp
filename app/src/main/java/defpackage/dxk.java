package defpackage;

/* renamed from: dxk reason: default package */
/* compiled from: PG */
final class dxk extends java.io.OutputStream {
    private final /* synthetic */ defpackage.dxi a;

    dxk(defpackage.dxi dxi) {
        this.a = dxi;
    }

    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.a.a(bArr, i, i2);
    }
}
