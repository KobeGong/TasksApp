package defpackage;

/* renamed from: cwx reason: default package */
/* compiled from: PG */
public final class cwx extends defpackage.dih implements defpackage.djq {
    public static final defpackage.cwx c = new defpackage.cwx();
    private static volatile defpackage.djx d;
    public int a;
    public defpackage.cwv b;

    private cwx() {
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
                java.lang.Object[] objArr = {"a", "b"};
                return new defpackage.dkb(c, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004\t\u0001", objArr);
            case 3:
                return new defpackage.cwx();
            case 4:
                return new defpackage.dii(false);
            case 5:
                return c;
            case 6:
                defpackage.djx djx2 = d;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.cwx.class) {
                    djx = d;
                    if (djx == null) {
                        djx = new defpackage.dgr(c);
                        d = djx;
                    }
                }
                return djx;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    public static /* synthetic */ void a(defpackage.cwx cwx, defpackage.dii dii) {
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
        cwx.b = (defpackage.cwv) dih3;
        cwx.a |= 2;
    }

    static {
        defpackage.cwx cwx = c;
        defpackage.dih.t.put(defpackage.cwx.class, cwx);
    }
}
