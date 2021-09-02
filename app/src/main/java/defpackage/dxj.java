package defpackage;

/* renamed from: dxj reason: default package */
/* compiled from: PG */
final class dxj extends java.io.OutputStream {
    public final java.util.List a = new java.util.ArrayList();
    private defpackage.dzx b;

    dxj(defpackage.dxi dxi) {
    }

    public final void write(int i) {
        if (this.b == null || this.b.a.remaining() <= 0) {
            write(new byte[]{(byte) i}, 0, 1);
            return;
        }
        this.b.a.put((byte) i);
    }

    public final void write(byte[] bArr, int i, int i2) {
        if (this.b == null) {
            this.b = defpackage.dzy.a(i2);
            this.a.add(this.b);
        }
        while (i2 > 0) {
            int min = java.lang.Math.min(i2, this.b.a.remaining());
            if (min == 0) {
                this.b = defpackage.dzy.a(java.lang.Math.max(i2, this.b.a.position() << 1));
                this.a.add(this.b);
            } else {
                this.b.a(bArr, i, min);
                i += min;
                i2 -= min;
            }
        }
    }
}
