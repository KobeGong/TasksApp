package defpackage;

/* renamed from: cwp  reason: default package */
/* compiled from: PG */
public final class cwp extends dih implements djq {
    public static final cwp g = new cwp();
    private static volatile djx h;
    public int a;
    public int b;
    public int c;
    public dip d = dil.b;
    public int e;
    public int f;

    private cwp() {
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
                return new dkb(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0016\u0004\f\u0002\u0007\f\u0003", new Object[]{"a", "b", "c", "d", "e", cwr.a, "f", cwq.a});
            case 3:
                return new cwp();
            case 4:
                return new dii((char) 0);
            case 5:
                return g;
            case 6:
                djx djx2 = h;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (cwp.class) {
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

    static {
        dih.t.put(cwp.class, g);
    }
}
