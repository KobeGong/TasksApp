package defpackage;

/* renamed from: dby reason: default package */
/* compiled from: PG */
public final class dby extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dby g = new defpackage.dby();
    private static volatile defpackage.djx h;
    public int a;
    public int b = 0;
    public java.lang.Object c;
    public java.lang.String d = "";
    public defpackage.dca e;
    public defpackage.djj f = defpackage.djj.b;

    private dby() {
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
                java.lang.Object[] objArr = {"c", "b", "a", "d", "e", "f", defpackage.dbz.a};
                return new defpackage.dkb(g, "\u0000\u0004\u0001\u0001\u0001\u0006\u0004\u0001\u0000\u0000\u0001Ȉ\u0002\t\u0004Ȼ\u0000\u00062", objArr);
            case 3:
                return new defpackage.dby();
            case 4:
                return new defpackage.dii((int[][][][][][][][][]) null);
            case 5:
                return g;
            case 6:
                defpackage.djx djx2 = h;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dby.class) {
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

    public static /* synthetic */ void a(defpackage.dby dby, defpackage.dii dii) {
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
        dby.e = (defpackage.dca) dih3;
    }

    static {
        defpackage.dby dby = g;
        defpackage.dih.t.put(defpackage.dby.class, dby);
    }
}
