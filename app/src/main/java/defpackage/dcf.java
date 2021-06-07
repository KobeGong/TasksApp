package defpackage;

/* renamed from: dcf */
public final class dcf extends dih implements djq {
    public static final dcf d = new dcf();
    private static volatile djx e;
    public int a;
    public String b = "";
    public diq c = dka.b;

    private dcf() {
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
                return new dkb(d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"a", "b", "c", dcf.class});
            case 3:
                return new dcf();
            case 4:
                return new dii((short[][][][][][][][][][]) null);
            case 5:
                return d;
            case 6:
                djx djx2 = e;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (dcf.class) {
                    djx = e;
                    if (djx == null) {
                        djx = new dgr(d);
                        e = djx;
                    }
                }
                return djx;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static /* synthetic */ void a(dcf dcf, dii dii) {
        dih dih;
        boolean d2;
        if (!dcf.c.a()) {
            diq diq = dcf.c;
            int size = diq.size();
            dcf.c = diq.a(size == 0 ? 10 : size << 1);
        }
        diq diq2 = dcf.c;
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
        diq2.add((dcf) dih3);
    }

    public static /* synthetic */ void a(dcf dcf, int i, dii dii) {
        dih dih;
        boolean d2;
        if (!dcf.c.a()) {
            diq diq = dcf.c;
            int size = diq.size();
            dcf.c = diq.a(size == 0 ? 10 : size << 1);
        }
        diq diq2 = dcf.c;
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
        diq2.add(i, (dcf) dih3);
    }

    static {
        dih.t.put(dcf.class, d);
    }
}
