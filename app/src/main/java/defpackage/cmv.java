package defpackage;

/* renamed from: cmv reason: default package */
/* compiled from: PG */
public final class cmv extends defpackage.cmx {
    public int[] a;
    public int[] b;
    public int[] c;
    public int[] d;
    public int e;
    public defpackage.cmv f;
    public int g = -1;
    private final int k;

    public cmv(int i, int i2) {
        super(i);
        this.k = i2;
    }

    public final int a(defpackage.cnc cnc) {
        return this.a.length;
    }

    public final int a(defpackage.cnc cnc, int i) {
        return this.a[i];
    }

    public final java.lang.String b(defpackage.cnc cnc, int i) {
        return cnc.a(this.b[i]);
    }

    public final java.lang.String c(defpackage.cnc cnc, int i) {
        if (i < 0 || i >= this.a.length) {
            java.lang.String str = "static ";
            java.lang.String valueOf = java.lang.String.valueOf(b(cnc));
            return valueOf.length() != 0 ? str.concat(valueOf) : new java.lang.String(str);
        }
        java.lang.String b2 = b(cnc);
        java.lang.String b3 = b(cnc, i);
        return new java.lang.StringBuilder(java.lang.String.valueOf(b2).length() + 8 + java.lang.String.valueOf(b3).length()).append("static ").append(b2).append("#").append(b3).toString();
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

    public final java.lang.String b(defpackage.cnc cnc) {
        return cnc.a(this.k);
    }

    public static void c(defpackage.cnc cnc) {
        java.nio.ByteBuffer byteBuffer = cnc.a;
        short s = 65535 & byteBuffer.getShort();
        for (int i = 0; i < s; i++) {
            byteBuffer.getShort();
            cnc.c(cnc.b(byteBuffer.get()));
        }
    }
}
