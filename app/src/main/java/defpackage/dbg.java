package defpackage;

/* renamed from: dbg reason: default package */
/* compiled from: PG */
public final class dbg extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dbg d = new defpackage.dbg();
    private static volatile defpackage.djx e;
    public int a;
    public defpackage.dby b;
    public defpackage.diq c = defpackage.dka.b;

    private dbg() {
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
                java.lang.Object[] objArr = {"a", "b", "c", defpackage.dby.class};
                return new defpackage.dkb(d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0002\u001b", objArr);
            case 3:
                return new defpackage.dbg();
            case 4:
                return new defpackage.dii((boolean[][][][][][]) null);
            case 5:
                return d;
            case 6:
                defpackage.djx djx2 = e;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dbg.class) {
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
        defpackage.dbg dbg = d;
        defpackage.dih.t.put(defpackage.dbg.class, dbg);
    }
}
