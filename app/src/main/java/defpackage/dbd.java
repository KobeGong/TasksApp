package defpackage;

/* renamed from: dbd reason: default package */
/* compiled from: PG */
public final class dbd extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dbd e = new defpackage.dbd();
    private static volatile defpackage.djx f;
    public int a;
    public defpackage.crb b;
    public defpackage.dcd c;
    public defpackage.djj d = defpackage.djj.b;

    private dbd() {
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
                java.lang.Object[] objArr = {"a", "b", "c", "d", defpackage.dbe.a};
                return new defpackage.dkb(e, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001\t\u0002\t\u00032", objArr);
            case 3:
                return new defpackage.dbd();
            case 4:
                return new defpackage.dii((short[][][][][][]) null);
            case 5:
                return e;
            case 6:
                defpackage.djx djx2 = f;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dbd.class) {
                    djx = f;
                    if (djx == null) {
                        djx = new defpackage.dgr(e);
                        f = djx;
                    }
                }
                return djx;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    public static /* synthetic */ void a(defpackage.dbd dbd, defpackage.dii dii) {
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
        dbd.c = (defpackage.dcd) dih3;
    }

    static {
        defpackage.dbd dbd = e;
        defpackage.dih.t.put(defpackage.dbd.class, dbd);
    }
}
