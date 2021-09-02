package defpackage;

/* renamed from: dfd reason: default package */
/* compiled from: PG */
public final class dfd extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dfd f = new defpackage.dfd();
    private static volatile defpackage.djx g;
    public int a;
    public java.lang.String b = "";
    public java.lang.String c = "";
    public defpackage.dfe d;
    public defpackage.dgu e;

    private dfd() {
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
                return new defpackage.dkb(f, "\u0001\u0004\u0000\u0001\u0001\u001e\u0004\u0000\u0000\u0000\u0001\b\u0000\u0003\t\u0002\u0004\b\u0001\u001e\t\u0003", objArr);
            case 3:
                return new defpackage.dfd();
            case 4:
                return new defpackage.dii((boolean[][][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return f;
            case 6:
                defpackage.djx djx2 = g;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dfd.class) {
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
        defpackage.dfd dfd = f;
        defpackage.dih.t.put(defpackage.dfd.class, dfd);
    }
}
