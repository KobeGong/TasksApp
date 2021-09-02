package defpackage;

/* renamed from: dfl reason: default package */
/* compiled from: PG */
public final class dfl extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dfl g = new defpackage.dfl();
    private static volatile defpackage.djx h;
    public int a;
    public java.lang.String b = "";
    public java.lang.String c = "";
    public java.lang.String d = "";
    public defpackage.dgm e;
    public defpackage.dgu f;

    private dfl() {
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
                java.lang.Object[] objArr = {"a", "b", "c", "d", "e", "f"};
                return new defpackage.dkb(g, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\t\u0004\u0006\t\u0005", objArr);
            case 3:
                return new defpackage.dfl();
            case 4:
                return new defpackage.dii((float[][][][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return g;
            case 6:
                defpackage.djx djx2 = h;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dfl.class) {
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
        defpackage.dfl dfl = g;
        defpackage.dih.t.put(defpackage.dfl.class, dfl);
    }
}
