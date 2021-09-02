package defpackage;

/* renamed from: dfb reason: default package */
/* compiled from: PG */
public final class dfb extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dfb d = new defpackage.dfb();
    private static volatile defpackage.djx e;
    public int a;
    public long b;
    public java.lang.String c = "";

    private dfb() {
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
                java.lang.Object[] objArr = {"a", "b", "c"};
                return new defpackage.dkb(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0000\u0002\b\u0001", objArr);
            case 3:
                return new defpackage.dfb();
            case 4:
                return new defpackage.dii((short[][][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return d;
            case 6:
                defpackage.djx djx2 = e;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dfb.class) {
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
        defpackage.dfb dfb = d;
        defpackage.dih.t.put(defpackage.dfb.class, dfb);
    }
}
