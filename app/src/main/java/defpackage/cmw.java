package defpackage;

/* renamed from: cmw  reason: default package */
/* compiled from: PG */
public final class cmw extends cmx {
    public final cmv a;

    public cmw(int i, cmv cmv) {
        super(i);
        this.a = (cmv) cky.a((Object) cmv);
    }

    @Override // defpackage.cmx
    public final int a(cnc cnc) {
        return this.a.g;
    }

    @Override // defpackage.cmx
    public final int a(cnc cnc, int i) {
        cmv cmv = this.a;
        cky.a(i, cmv.g);
        int i2 = this.h + cnc.b + 4 + cnc.b + 4;
        while (i >= cmv.c.length) {
            cmv cmv2 = cmv.f;
            i2 += cmv.e;
            i -= cmv.c.length;
            cmv = cmv2;
        }
        return cnc.d(i2 + cmv.d[i]);
    }

    @Override // defpackage.cmx
    public final String b(cnc cnc, int i) {
        cmv cmv = this.a;
        while (true) {
            cky.a(i, cmv.g);
            if (i < cmv.c.length) {
                return cnc.a(cmv.c[i]);
            }
            cmv cmv2 = cmv.f;
            i -= cmv.c.length;
            cmv = cmv2;
        }
    }

    @Override // defpackage.cmx
    public final String c(cnc cnc, int i) {
        if (i < 0 || i >= this.a.g) {
            return this.a.b(cnc);
        }
        cmv cmv = this.a;
        int i2 = i;
        while (true) {
            cky.a(i2, cmv.g);
            if (i2 < cmv.c.length) {
                break;
            }
            cmv cmv2 = cmv.f;
            i2 -= cmv.c.length;
            cmv = cmv2;
        }
        if (cmv == this.a) {
            String b = this.a.b(cnc);
            String b2 = b(cnc, i);
            return new StringBuilder(String.valueOf(b).length() + 1 + String.valueOf(b2).length()).append(b).append('#').append(b2).toString();
        }
        String b3 = this.a.b(cnc);
        String b4 = cmv.b(cnc);
        String b5 = b(cnc, i);
        return new StringBuilder(String.valueOf(b3).length() + 2 + String.valueOf(b4).length() + String.valueOf(b5).length()).append(b3).append(':').append(b4).append('#').append(b5).toString();
    }
}
