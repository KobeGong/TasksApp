package defpackage;

/* renamed from: dew reason: default package */
/* compiled from: PG */
public final class dew extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dew f = new defpackage.dew();
    private static volatile defpackage.djx g;
    public int a;
    public java.lang.String b = "";
    public defpackage.diq c = defpackage.dka.b;
    public defpackage.dgm d;
    public defpackage.ddu e;

    private dew() {
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
                java.lang.Object[] objArr = {"a", "b", "c", defpackage.dfj.class, "d", "e"};
                return new defpackage.dkb(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\b\u0000\u0002\u001b\u0003\t\u0001\u0004\t\u0002", objArr);
            case 3:
                return new defpackage.dew();
            case 4:
                return new defpackage.dii((boolean[][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return f;
            case 6:
                defpackage.djx djx2 = g;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dew.class) {
                    djx = g;
                    if (djx == null) {
                        djx = new defpackage.dgr(f);
                        g = djx;
                    }
                }
                return djx;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    public static /* synthetic */ void a(defpackage.dew dew, defpackage.dii dii) {
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
        dew.e = (defpackage.ddu) dih3;
        dew.a |= 4;
    }

    static {
        defpackage.dew dew = f;
        defpackage.dih.t.put(defpackage.dew.class, dew);
    }
}
