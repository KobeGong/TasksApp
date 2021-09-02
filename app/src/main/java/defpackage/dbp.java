package defpackage;

/* renamed from: dbp reason: default package */
/* compiled from: PG */
public final class dbp extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dbp c = new defpackage.dbp();
    private static volatile defpackage.djx d;
    public int a = 0;
    public java.lang.Object b;

    private dbp() {
    }

    /* access modifiers changed from: protected */
    public final java.lang.Object a(int i) {
        defpackage.djx djx;
        switch (i - 1) {
            case 0:
                return java.lang.Byte.valueOf(1);
            case 1:
                return null;
            case 2:
                java.lang.Object[] objArr = {"b", "a", defpackage.dbl.class, defpackage.dbn.class, defpackage.dbf.class, defpackage.czv.class, defpackage.dbg.class, defpackage.day.class, defpackage.dbj.class, defpackage.dac.class, defpackage.czx.class};
                return new defpackage.dkb(c, "\u0000\t\u0001\u0000\u0001\f\t\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0004<\u0000\u0005<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000", objArr);
            case 3:
                return new defpackage.dbp();
            case 4:
                return new defpackage.dii((byte[][][][][][][][]) null);
            case 5:
                return c;
            case 6:
                defpackage.djx djx2 = d;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dbp.class) {
                    djx = d;
                    if (djx == null) {
                        djx = new defpackage.dgr(c);
                        d = djx;
                    }
                }
                return djx;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    static {
        defpackage.dbp dbp = c;
        defpackage.dih.t.put(defpackage.dbp.class, dbp);
    }
}
