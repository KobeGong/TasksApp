package defpackage;

/* renamed from: dby  reason: default package */
/* compiled from: PG */
public final class dby extends dih implements djq {
    public static final dby g = new dby();
    private static volatile djx h;
    public int a;
    public int b = 0;
    public Object c;
    public String d = "";
    public dca e;
    public djj f = djj.b;

    private dby() {
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dih
    public final Object a(int i) {
        djx djx;
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new dkb(g, "\u0000\u0004\u0001\u0001\u0001\u0006\u0004\u0001\u0000\u0000\u0001Ȉ\u0002\t\u0004Ȼ\u0000\u00062", new Object[]{"c", "b", "a", "d", "e", "f", dbz.a});
            case 3:
                return new dby();
            case 4:
                return new dii((int[][][][][][][][][]) null);
            case 5:
                return g;
            case 6:
                djx djx2 = h;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (dby.class) {
                    djx = h;
                    if (djx == null) {
                        djx = new dgr(g);
                        h = djx;
                    }
                }
                return djx;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static /* synthetic */ void a(dby dby, dii dii) {
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
        dby.e = (dca) dih3;
    }

    static {
        dih.t.put(dby.class, g);
    }
}
