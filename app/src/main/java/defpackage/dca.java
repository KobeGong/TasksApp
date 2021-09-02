package defpackage;

/* renamed from: dca reason: default package */
/* compiled from: PG */
public final class dca extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dca g = new defpackage.dca();
    private static volatile defpackage.djx h;
    public boolean a;
    public java.lang.String b = "";//title
    public java.lang.String c = "";
    public defpackage.dmk d;
    public boolean e;
    public defpackage.dan f;

    private dca() {
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
                java.lang.Object[] objArr = {"a", "b", "c", "d", "e", "f"};
                return new defpackage.dkb(g, "\u0000\u0006\u0000\u0000\u0001\b\u0006\u0000\u0000\u0000\u0001\u0007\u0002Ȉ\u0003Ȉ\u0004\t\u0006\u0007\b\t", objArr);
            case 3:
                return new defpackage.dca();
            case 4:
                return new defpackage.dii((boolean[][][][][][][][][]) null);
            case 5:
                return g;
            case 6:
                defpackage.djx djx2 = h;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dca.class) {
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

    public static /* synthetic */ void a(defpackage.dca dca, defpackage.dii dii) {
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
        dca.f = (defpackage.dan) dih3;
    }

    static {
        defpackage.dca dca = g;
        defpackage.dih.t.put(defpackage.dca.class, dca);
    }
}
