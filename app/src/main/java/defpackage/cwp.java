package defpackage;

/* renamed from: cwp reason: default package */
/* compiled from: PG */
public final class cwp extends defpackage.dih implements defpackage.djq {
    public static final defpackage.cwp g = new defpackage.cwp();
    private static volatile defpackage.djx h;
    public int a;
    public int b;
    public int c;
    public defpackage.dip d = defpackage.dil.b;
    public int e;
    public int f;

    private cwp() {
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
                java.lang.Object[] objArr = {"a", "b", "c", "d", "e", defpackage.cwr.a, "f", defpackage.cwq.a};
                return new defpackage.dkb(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0016\u0004\f\u0002\u0007\f\u0003", objArr);
            case 3:
                return new defpackage.cwp();
            case 4:
                return new defpackage.dii(0);
            case 5:
                return g;
            case 6:
                defpackage.djx djx2 = h;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.cwp.class) {
                    djx = h;
                    if (djx == null) {
                        djx = new defpackage.dgr(g);
                        h = djx;
                    }
                }
                return djx;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    static {
        defpackage.cwp cwp = g;
        defpackage.dih.t.put(defpackage.cwp.class, cwp);
    }
}
