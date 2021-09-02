package defpackage;

/* renamed from: dfj reason: default package */
/* compiled from: PG */
public final class dfj extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dfj d = new defpackage.dfj();
    private static volatile defpackage.djx e;
    public int a;
    public java.lang.String b = "";
    public long c;

    private dfj() {
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
                java.lang.Object[] objArr = {"a", "c", "b"};
                return new defpackage.dkb(d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003\u0002\u0001\u0004\b\u0000", objArr);
            case 3:
                return new defpackage.dfj();
            case 4:
                return new defpackage.dii((int[][][][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return d;
            case 6:
                defpackage.djx djx2 = e;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dfj.class) {
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
        defpackage.dfj dfj = d;
        defpackage.dih.t.put(defpackage.dfj.class, dfj);
    }
}
