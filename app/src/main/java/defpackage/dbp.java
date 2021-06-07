package defpackage;

/* renamed from: dbp  reason: default package */
/* compiled from: PG */
public final class dbp extends dih implements djq {
    public static final dbp c = new dbp();
    private static volatile djx d;
    public int a = 0;
    public Object b;

    private dbp() {
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
                return new dkb(c, "\u0000\t\u0001\u0000\u0001\f\t\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0004<\u0000\u0005<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000", new Object[]{"b", "a", dbl.class, dbn.class, dbf.class, czv.class, dbg.class, day.class, dbj.class, dac.class, czx.class});
            case 3:
                return new dbp();
            case 4:
                return new dii((byte[][][][][][][][]) null);
            case 5:
                return c;
            case 6:
                djx djx2 = d;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (dbp.class) {
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
        dih.t.put(dbp.class, c);
    }
}
