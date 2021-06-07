package defpackage;

/* renamed from: dcx  reason: default package */
/* compiled from: PG */
public final class dcx extends dih implements djq {
    public static final dcx d = new dcx();
    private static volatile djx e;
    public int a;
    public dcw b;
    public int c;

    private dcx() {
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
                return new dkb(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\t\u0001\u0003\f\u0002", new Object[]{"a", "b", "c", dcy.c});
            case 3:
                return new dcx();
            case 4:
                return new dii((float[][][][][][][][][][][]) null);
            case 5:
                return d;
            case 6:
                djx djx2 = e;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (dcx.class) {
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

    static {
        dih.t.put(dcx.class, d);
    }
}
