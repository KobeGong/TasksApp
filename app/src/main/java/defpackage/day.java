package defpackage;

/* renamed from: day  reason: default package */
/* compiled from: PG */
public final class day extends dih implements djq {
    public static final day c = new day();
    private static volatile djx d;
    public diq a = dka.b;
    public diq b = dka.b;

    private day() {
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
                return new dkb(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", dby.class, "b", dcb.class});
            case 3:
                return new day();
            case 4:
                return new dii((boolean[][][][][]) null);
            case 5:
                return c;
            case 6:
                djx djx2 = d;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (day.class) {
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
        dih.t.put(day.class, c);
    }
}
