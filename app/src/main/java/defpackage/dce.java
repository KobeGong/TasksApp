package defpackage;

/* renamed from: dce */
public final class dce extends dih implements djq {
    public static final dce b = new dce();
    private static volatile djx c;
    public diq a = dka.b;

    private dce() {
    }

    @Override // defpackage.dih
    public final Object a(int i) {
        djx djx;
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new dkb(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dcf.class});
            case 3:
                return new dce();
            case 4:
                return new dii((char[][][][][][][][][][]) null);
            case 5:
                return b;
            case 6:
                djx djx2 = c;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (dce.class) {
                    djx = c;
                    if (djx == null) {
                        djx = new dgr(b);
                        c = djx;
                    }
                }
                return djx;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static /* synthetic */ void a(dce dce, int i, dii dii) {
        dih dih;
        boolean d;
        if (!dce.a.a()) {
            diq diq = dce.a;
            int size = diq.size();
            dce.a = diq.a(size == 0 ? 10 : size << 1);
        }
        diq diq2 = dce.a;
        if (dii.b) {
            dih = dii.a;
        } else {
            dih dih2 = dii.a;
            djz.a.a(dih2).c(dih2);
            dii.b = true;
            dih = dii.a;
        }
        dih dih3 = dih;
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) dih3.a(bg.ak)).byteValue();
        if (byteValue == 1) {
            d = true;
        } else if (byteValue == 0) {
            d = false;
        } else {
            d = djz.a.a(dih3).d(dih3);
            if (booleanValue) {
                dih3.a(bg.al);
            }
        }
        if (!d) {
            throw new dkw();
        }
        diq2.set(i, (dcf) dih3);
    }

    public static /* synthetic */ void b(dce dce, int i, dii dii) {
        dih dih;
        boolean d;
        if (!dce.a.a()) {
            diq diq = dce.a;
            int size = diq.size();
            dce.a = diq.a(size == 0 ? 10 : size << 1);
        }
        diq diq2 = dce.a;
        if (dii.b) {
            dih = dii.a;
        } else {
            dih dih2 = dii.a;
            djz.a.a(dih2).c(dih2);
            dii.b = true;
            dih = dii.a;
        }
        dih dih3 = dih;
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) dih3.a(bg.ak)).byteValue();
        if (byteValue == 1) {
            d = true;
        } else if (byteValue == 0) {
            d = false;
        } else {
            d = djz.a.a(dih3).d(dih3);
            if (booleanValue) {
                dih3.a(bg.al);
            }
        }
        if (!d) {
            throw new dkw();
        }
        diq2.add(i, (dcf) dih3);
    }

    static {
        dih.t.put(dce.class, b);
    }
}
