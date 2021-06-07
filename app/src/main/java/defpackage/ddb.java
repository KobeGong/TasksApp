package defpackage;

/* renamed from: ddb  reason: default package */
/* compiled from: PG */
public final class ddb extends dih implements djq {
    public static final ddb d = new ddb();
    private static volatile djx e;
    public int a;
    public int b = 0;
    public Object c;

    private ddb() {
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
                return new dkb(d, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"c", "b", "a", ddc.class, ddd.class, dde.class, dct.class, ddn.class, dda.class, ddt.class, ddg.class, ddf.class});
            case 3:
                return new ddb();
            case 4:
                return new dii((char[][][][][][][][][][][][]) null);
            case 5:
                return d;
            case 6:
                djx djx2 = e;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (ddb.class) {
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
        dih.t.put(ddb.class, d);
    }
}
