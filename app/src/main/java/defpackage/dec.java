package defpackage;

/* renamed from: dec reason: default package */
/* compiled from: PG */
public final class dec extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dec f = new defpackage.dec();
    private static volatile defpackage.djx g;
    public int a;
    public java.lang.String b = "";
    public long c;
    public java.lang.String d = "";
    public long e;

    private dec() {
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
                java.lang.Object[] objArr = {"a", "b", "d", "c", "e"};
                return new defpackage.dkb(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0002\u0003\u0002\u0001\u0004\u0002\u0003", objArr);
            case 3:
                return new defpackage.dec();
            case 4:
                return new defpackage.dii((int[][][][][][][][][][][][][][][]) null);
            case 5:
                return f;
            case 6:
                defpackage.djx djx2 = g;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dec.class) {
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
        defpackage.dec dec = f;
        defpackage.dih.t.put(defpackage.dec.class, dec);
    }
}
