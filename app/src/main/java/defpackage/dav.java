package defpackage;

/* renamed from: dav  reason: default package */
/* compiled from: PG */
public final class dav extends dih implements djq {
    public static final dav c = new dav();
    private static volatile djx d;
    public int a;
    public diq b = dka.b;

    private dav() {
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
                return new dkb(c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", "b", dby.class});
            case 3:
                return new dav();
            case 4:
                return new dii((short[][][][][]) null);
            case 5:
                return c;
            case 6:
                djx djx2 = d;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (dav.class) {
                    djx = d;
                    if (djx == null) {
                        djx = new dgr(c);
                        d = djx;
                    }
                }
                return djx;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        dih.t.put(dav.class, c);
    }
}
