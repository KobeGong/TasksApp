package defpackage;

/* renamed from: dce reason: default package */
/* compiled from: PG */
public final class dce extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dce b = new defpackage.dce();
    private static volatile defpackage.djx c;
    public defpackage.diq a = defpackage.dka.b;

    private dce() {
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
                java.lang.Object[] objArr = {"a", defpackage.dcf.class};
                return new defpackage.dkb(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", objArr);
            case 3:
                return new defpackage.dce();
            case 4:
                return new defpackage.dii((char[][][][][][][][][][]) null);
            case 5:
                return b;
            case 6:
                defpackage.djx djx2 = c;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dce.class) {
                    djx = c;
                    if (djx == null) {
                        djx = new defpackage.dgr(b);
                        c = djx;
                    }
                }
                return djx;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    public static /* synthetic */ void a(defpackage.dce dce, int i, defpackage.dii dii) {
        defpackage.dih dih;
        boolean d;
        if (!dce.a.a()) {
            defpackage.diq diq = dce.a;
            int size = diq.size();
            dce.a = diq.a(size == 0 ? 10 : size << 1);
        }
        defpackage.diq diq2 = dce.a;
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
            d = true;
        } else if (byteValue == 0) {
            d = false;
        } else {
            d = defpackage.djz.a.a((java.lang.Object) dih3).d(dih3);
            if (booleanValue) {
                dih3.a(defpackage.bg.al);
            }
        }
        if (!d) {
            throw new defpackage.dkw();
        }
        diq2.set(i, (defpackage.dcf) dih3);
    }

    public static /* synthetic */ void b(defpackage.dce dce, int i, defpackage.dii dii) {
        defpackage.dih dih;
        boolean d;
        if (!dce.a.a()) {
            defpackage.diq diq = dce.a;
            int size = diq.size();
            dce.a = diq.a(size == 0 ? 10 : size << 1);
        }
        defpackage.diq diq2 = dce.a;
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
            d = true;
        } else if (byteValue == 0) {
            d = false;
        } else {
            d = defpackage.djz.a.a((java.lang.Object) dih3).d(dih3);
            if (booleanValue) {
                dih3.a(defpackage.bg.al);
            }
        }
        if (!d) {
            throw new defpackage.dkw();
        }
        diq2.add(i, (defpackage.dcf) dih3);
    }

    static {
        defpackage.dce dce = b;
        defpackage.dih.t.put(defpackage.dce.class, dce);
    }
}
