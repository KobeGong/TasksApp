package defpackage;

/* renamed from: cbr reason: default package */
/* compiled from: PG */
public final class cbr extends defpackage.dih implements defpackage.djq {
    public static final defpackage.cbr b = new defpackage.cbr();
    private static volatile defpackage.djx c;
    public defpackage.diq a = defpackage.dka.b;

    private cbr() {
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
                java.lang.Object[] objArr = {"a", defpackage.dgu.class};
                return new defpackage.dkb(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", objArr);
            case 3:
                return new defpackage.cbr();
            case 4:
                return new defpackage.dii();
            case 5:
                return b;
            case 6:
                defpackage.djx djx2 = c;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.cbr.class) {
                    djx = c;
                    if (djx == null) {
                        djx = new defpackage.dgr(b);
                        c = djx;
                    }
                }
                return djx;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    static {
        defpackage.cbr cbr = b;
        defpackage.dih.t.put(defpackage.cbr.class, cbr);
    }
}
