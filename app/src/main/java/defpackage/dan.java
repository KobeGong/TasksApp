package defpackage;

/* renamed from: dan reason: default package */
/* compiled from: PG */
public final class dan extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dan f = new defpackage.dan();
    private static volatile defpackage.djx g;
    public int a = 0;
    public java.lang.Object b;
    public java.lang.String c = "";
    public java.lang.String d = "";
    public int e;

    private dan() {
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
                java.lang.Object[] objArr = {"b", "a", "c", "d", "e", defpackage.dao.class, defpackage.dap.class};
                return new defpackage.dkb(f, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004<\u0000\u0005<\u0000", objArr);
            case 3:
                return new defpackage.dan();
            case 4:
                return new defpackage.dii((short[][][][]) null);
            case 5:
                return f;
            case 6:
                defpackage.djx djx2 = g;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dan.class) {
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

    public static /* synthetic */ void a(defpackage.dan dan, defpackage.dii dii) {
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
        dan.b = dih3;
        dan.a = 4;
    }

    static {
        defpackage.dan dan = f;
        defpackage.dih.t.put(defpackage.dan.class, dan);
    }
}
