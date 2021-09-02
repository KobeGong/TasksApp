package defpackage;

/* renamed from: dfr reason: default package */
/* compiled from: PG */
public final class dfr extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dfr f = new defpackage.dfr();
    private static volatile defpackage.djx g;
    public int a;
    public java.lang.String b = "";
    public java.lang.String c = "";
    public defpackage.diq d = defpackage.dka.b;
    public defpackage.diq e = defpackage.dka.b;

    private dfr() {
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
                java.lang.Object[] objArr = {"a", "b", "c", "d", defpackage.dga.class, "e", defpackage.dfl.class};
                return new defpackage.dkb(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u001b\u0004\u001b", objArr);
            case 3:
                return new defpackage.dfr();
            case 4:
                return new defpackage.dii((int[][][][][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return f;
            case 6:
                defpackage.djx djx2 = g;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dfr.class) {
                    djx = g;
                    if (djx == null) {
                        djx = new defpackage.dgr(f);
                        g = djx;
                    }
                }
                return djx;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    static {
        defpackage.dfr dfr = f;
        defpackage.dih.t.put(defpackage.dfr.class, dfr);
    }
}
