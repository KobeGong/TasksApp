package defpackage;

/* renamed from: dcw  reason: default package */
/* compiled from: PG */
public final class dcw extends dih implements djq {
    public static final dcw e = new dcw();
    private static volatile djx f;
    public int a;
    public int b = 0;
    public Object c;
    public dcu d;

    private dcw() {
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
                return new dkb(e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", "a", "d", ddq.class, ddh.class});
            case 3:
                return new dcw();
            case 4:
                return new dii((boolean[][][][][][][][][][][]) null);
            case 5:
                return e;
            case 6:
                djx djx2 = f;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (dcw.class) {
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
        dih.t.put(dcw.class, e);
    }
}
