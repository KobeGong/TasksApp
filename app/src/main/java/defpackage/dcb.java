package defpackage;

/* renamed from: dcb reason: default package */
/* compiled from: PG */
public final class dcb extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dcb g = new defpackage.dcb();
    private static volatile defpackage.djx h;
    public int a;
    public java.lang.String b = "";
    public defpackage.dcd c;
    public defpackage.dce d;
    public java.lang.String e = "";
    public defpackage.djj f = defpackage.djj.b;

    private dcb() {
    }

    /* access modifiers changed from: protected */
    public final java.lang.Object a(int i) {
        defpackage.djx djx;
        switch (i - 1) {
            case 0:
                return java.lang.Byte.valueOf(1);
            case 1:
                return null;
            case 2:
                java.lang.Object[] objArr = {"a", "b", "c", "d", "e", "f", defpackage.dcc.a};
                return new defpackage.dkb(g, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001Ȉ\u0002\t\u0003\t\u0004Ȉ\u00052", objArr);
            case 3:
                return new defpackage.dcb();
            case 4:
                return new defpackage.dii((float[][][][][][][][][]) null);
            case 5:
                return g;
            case 6:
                defpackage.djx djx2 = h;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dcb.class) {
                    djx = h;
                    if (djx == null) {
                        djx = new defpackage.dgr(g);
                        h = djx;
                    }
                }
                return djx;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    public static /* synthetic */ void a(defpackage.dcb dcb, defpackage.dii dii) {
        defpackage.dih dih;
        boolean d2;
        if (dii.b) {
            dih = dii.a;
        } else {
            defpackage.dih dih2 = dii.a;
            defpackage.djz.a.a((java.lang.Object) dih2).c(dih2);
            dii.b = true;
            dih = dii.a;
        }
        defpackage.dih dih3 = dih;
        boolean booleanValue = java.lang.Boolean.TRUE.booleanValue();
        byte byteValue = ((java.lang.Byte) dih3.a(defpackage.bg.ak)).byteValue();
        if (byteValue == 1) {
            d2 = true;
        } else if (byteValue == 0) {
            d2 = false;
        } else {
            d2 = defpackage.djz.a.a((java.lang.Object) dih3).d(dih3);
            if (booleanValue) {
                dih3.a(defpackage.bg.al);
            }
        }
        if (!d2) {
            throw new defpackage.dkw();
        }
        dcb.c = (defpackage.dcd) dih3;
    }

    static {
        defpackage.dcb dcb = g;
        defpackage.dih.t.put(defpackage.dcb.class, dcb);
    }
}
