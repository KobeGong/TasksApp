package defpackage;

import java.nio.ByteBuffer;

/* renamed from: cmv  reason: default package */
/* compiled from: PG */
public final class cmv extends cmx {
    public int[] a;
    public int[] b;
    public int[] c;
    public int[] d;
    public int e;
    public cmv f;
    public int g = -1;
    private final int k;

    public cmv(int i, int i2) {
        super(i);
        this.k = i2;
    }

    @Override // defpackage.cmx
    public final int a(cnc cnc) {
        return this.a.length;
    }

    @Override // defpackage.cmx
    public final int a(cnc cnc, int i) {
        return this.a[i];
    }

    @Override // defpackage.cmx
    public final String b(cnc cnc, int i) {
        return cnc.a(this.b[i]);
    }

    @Override // defpackage.cmx
    public final String c(cnc cnc, int i) {
        if (i < 0 || i >= this.a.length) {
            String valueOf = String.valueOf(b(cnc));
            return valueOf.length() != 0 ? "static ".concat(valueOf) : new String("static ");
        }
        String b2 = b(cnc);
        String b3 = b(cnc, i);
        return new StringBuilder(String.valueOf(b2).length() + 8 + String.valueOf(b3).length()).append("static ").append(b2).append("#").append(b3).toString();
    }

    public final void a() {
        if (this.g == -1) {
            this.g = this.c.length;
            if (this.f != null) {
                this.f.a();
                this.g += this.f.g;
                if ((this.f.j & 2) != 0) {
                    this.j |= 2;
                }
            }
        }
    }

    public final String b(cnc cnc) {
        return cnc.a(this.k);
    }

    public static void c(cnc cnc) {
        ByteBuffer byteBuffer = cnc.a;
        int i = 65535 & byteBuffer.getShort();
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.getShort();
            cnc.c(cnc.b(byteBuffer.get()));
        }
    }
}
