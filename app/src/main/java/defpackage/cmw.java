package defpackage;

/* renamed from: cmw reason: default package */
/* compiled from: PG */
public final class cmw extends defpackage.cmx {
    public final defpackage.cmv a;

    public cmw(int i, defpackage.cmv cmv) {
        super(i);
        this.a = (defpackage.cmv) defpackage.cky.a((java.lang.Object) cmv);
    }

    public final int a(defpackage.cnc cnc) {
        return this.a.g;
    }

    public final int a(defpackage.cnc cnc, int i) {
        defpackage.cmv cmv = this.a;
        defpackage.cky.a(i, cmv.g);
        int i2 = this.h + cnc.b + 4 + cnc.b + 4;
        while (i >= cmv.c.length) {
            i2 += cmv.e;
            i -= cmv.c.length;
            cmv = cmv.f;
        }
        return cnc.d(i2 + cmv.d[i]);
    }

    public final java.lang.String b(defpackage.cnc cnc, int i) {
        defpackage.cmv cmv = this.a;
        while (true) {
            defpackage.cky.a(i, cmv.g);
            if (i < cmv.c.length) {
                return cnc.a(cmv.c[i]);
            }
            i -= cmv.c.length;
            cmv = cmv.f;
        }
    }

    public final java.lang.String c(defpackage.cnc cnc, int i) {
        if (i < 0 || i >= this.a.g) {
            return this.a.b(cnc);
        }
        defpackage.cmv cmv = this.a;
        int i2 = i;
        while (true) {
            defpackage.cky.a(i2, cmv.g);
            if (i2 < cmv.c.length) {
                break;
            }
            i2 -= cmv.c.length;
            cmv = cmv.f;
        }
        if (cmv == this.a) {
            java.lang.String b = this.a.b(cnc);
            java.lang.String b2 = b(cnc, i);
            return new java.lang.StringBuilder(java.lang.String.valueOf(b).length() + 1 + java.lang.String.valueOf(b2).length()).append(b).append('#').append(b2).toString();
        }
        java.lang.String b3 = this.a.b(cnc);
        java.lang.String b4 = cmv.b(cnc);
        java.lang.String b5 = b(cnc, i);
        return new java.lang.StringBuilder(java.lang.String.valueOf(b3).length() + 2 + java.lang.String.valueOf(b4).length() + java.lang.String.valueOf(b5).length()).append(b3).append(':').append(b4).append('#').append(b5).toString();
    }
}
