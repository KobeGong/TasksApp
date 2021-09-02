package defpackage;

/* renamed from: des reason: default package */
/* compiled from: PG */
public final class des extends defpackage.dih implements defpackage.djq {
    public static final defpackage.des g = new defpackage.des();
    private static volatile defpackage.djx h;
    public int a;
    public java.lang.String b = "";
    public defpackage.dfh c;
    public defpackage.diq d = defpackage.dka.b;
    public defpackage.dfd e;
    public defpackage.dfa f;

    private des() {
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
                java.lang.Object[] objArr = {"a", "b", "d", "c", "e", "f"};
                return new defpackage.dkb(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0000\u0001\b\u0000\u0003\u001a\u0005\t\u0001\u0006\t\u0002\u0007\t\u0003", objArr);
            case 3:
                return new defpackage.des();
            case 4:
                return new defpackage.dii((byte[][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return g;
            case 6:
                defpackage.djx djx2 = h;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.des.class) {
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
        defpackage.des des = g;
        defpackage.dih.t.put(defpackage.des.class, des);
    }
}
