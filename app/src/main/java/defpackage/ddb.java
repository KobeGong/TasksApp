package defpackage;

/* renamed from: ddb reason: default package */
/* compiled from: PG */
public final class ddb extends defpackage.dih implements defpackage.djq {
    public static final defpackage.ddb d = new defpackage.ddb();
    private static volatile defpackage.djx e;
    public int a;
    public int b = 0;
    public java.lang.Object c;

    private ddb() {
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
                java.lang.Object[] objArr = {"c", "b", "a", defpackage.ddc.class, defpackage.ddd.class, defpackage.dde.class, defpackage.dct.class, defpackage.ddn.class, defpackage.dda.class, defpackage.ddt.class, defpackage.ddg.class, defpackage.ddf.class};
                return new defpackage.dkb(d, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000", objArr);
            case 3:
                return new defpackage.ddb();
            case 4:
                return new defpackage.dii((char[][][][][][][][][][][][]) null);
            case 5:
                return d;
            case 6:
                defpackage.djx djx2 = e;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.ddb.class) {
                    djx = e;
                    if (djx == null) {
                        djx = new defpackage.dgr(d);
                        e = djx;
                    }
                }
                return djx;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    static {
        defpackage.ddb ddb = d;
        defpackage.dih.t.put(defpackage.ddb.class, ddb);
    }
}
