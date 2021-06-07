package defpackage;

/* renamed from: dca  reason: default package */
/* compiled from: PG */
public final class dca extends dih implements djq {
    public static final dca g = new dca();
    private static volatile djx h;
    public boolean a;
    public String b = "";
    public String c = "";
    public dmk d;
    public boolean e;
    public dan f;

    private dca() {
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
                return new dkb(g, "\u0000\u0006\u0000\u0000\u0001\b\u0006\u0000\u0000\u0000\u0001\u0007\u0002Ȉ\u0003Ȉ\u0004\t\u0006\u0007\b\t", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new dca();
            case 4:
                return new dii((boolean[][][][][][][][][]) null);
            case 5:
                return g;
            case 6:
                djx djx2 = h;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (dca.class) {
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

    public static /* synthetic */ void a(dca dca, dii dii) {
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
        dca.f = (dan) dih3;
    }

    static {
        dih.t.put(dca.class, g);
    }
}
