package defpackage;

/* renamed from: dbb */
public final class dbb extends dih implements djq {
    public static final dbb e = new dbb();
    private static volatile djx f;
    public int a;
    public crb b;
    public dca c;
    public djj d = djj.b;

    private dbb() {
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
                return new dkb(e, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001\t\u0002\t\u00032", new Object[]{"a", "b", "c", "d", dbc.a});
            case 3:
                return new dbb();
            case 4:
                return new dii((char[][][][][][]) null);
            case 5:
                return e;
            case 6:
                djx djx2 = f;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (dbb.class) {
                    djx = f;
                    if (djx == null) {
                        djx = new dgr(e);
                        f = djx;
                    }
                }
                return djx;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static /* synthetic */ void a(dbb dbb, dii dii) {
        dih dih;
        boolean d2;
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
            d2 = true;
        } else if (byteValue == 0) {
            d2 = false;
        } else {
            d2 = djz.a.a(dih3).d(dih3);
            if (booleanValue) {
                dih3.a(bg.al);
            }
        }
        if (!d2) {
            throw new dkw();
        }
        dbb.c = (dca) dih3;
    }

    static {
        dih.t.put(dbb.class, e);
    }
}
