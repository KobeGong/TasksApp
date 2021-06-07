package defpackage;

/* renamed from: deo  reason: default package */
/* compiled from: PG */
public final class deo extends dih implements djq {
    public static final deo e = new deo();
    private static volatile djx f;
    public int a;
    public String b = "";
    public dfh c;
    public dfa d;

    private deo() {
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
                return new dkb(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\b\u0000\u0003\t\u0001\u0004\t\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new deo();
            case 4:
                return new dii((short[][][][][][][][][][][][][][][][][]) null);
            case 5:
                return e;
            case 6:
                djx djx2 = f;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (deo.class) {
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

    static {
        dih.t.put(deo.class, e);
    }
}
