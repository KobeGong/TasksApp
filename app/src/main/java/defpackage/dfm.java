package defpackage;

/* renamed from: dfm reason: default package */
/* compiled from: PG */
public final class dfm extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dfm e = new defpackage.dfm();
    private static volatile defpackage.djx f;
    public int a;
    public java.lang.String b = "";
    public defpackage.dfy c;
    public defpackage.dgg d;

    private dfm() {
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
                java.lang.Object[] objArr = {"a", "b", "c", "d"};
                return new defpackage.dkb(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\b\u0000\u0003\t\u0001\u0004\t\u0002", objArr);
            case 3:
                return new defpackage.dfm();
            case 4:
                return new defpackage.dii((byte[][][][][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return e;
            case 6:
                defpackage.djx djx2 = f;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dfm.class) {
                    djx = f;
                    if (djx == null) {
                        djx = new defpackage.dgr(e);
                        f = djx;
                    }
                }
                return djx;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    static {
        defpackage.dfm dfm = e;
        defpackage.dih.t.put(defpackage.dfm.class, dfm);
    }
}
