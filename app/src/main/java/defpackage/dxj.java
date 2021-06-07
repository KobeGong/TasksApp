package defpackage;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: dxj  reason: default package */
/* compiled from: PG */
public final class dxj extends OutputStream {
    public final List a = new ArrayList();
    private dzx b;

    dxj(dxi dxi) {
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        if (this.b == null || this.b.a.remaining() <= 0) {
            write(new byte[]{(byte) i}, 0, 1);
            return;
        }
        this.b.a.put((byte) i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (this.b == null) {
            this.b = dzy.a(i2);
            this.a.add(this.b);
        }
        while (i2 > 0) {
            int min = Math.min(i2, this.b.a.remaining());
            if (min == 0) {
                this.b = dzy.a(Math.max(i2, this.b.a.position() << 1));
                this.a.add(this.b);
            } else {
                this.b.a(bArr, i, min);
                i += min;
                i2 -= min;
            }
        }
    }
}
