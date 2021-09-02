package defpackage;

/* renamed from: dgl reason: default package */
/* compiled from: PG */
public final class dgl extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dgl f = new defpackage.dgl();
    private static volatile defpackage.djx g;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    private dgl() {
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
                java.lang.Object[] objArr = {"a", "b", defpackage.dge.c, "c", defpackage.dfw.c, "d", defpackage.dfu.c, "e", defpackage.dgj.c};
                return new defpackage.dkb(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\f\u0002\u0004\f\u0003", objArr);
            case 3:
                return new defpackage.dgl();
            case 4:
                return new defpackage.dii((char[][][][][][][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return f;
            case 6:
                defpackage.djx djx2 = g;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dgl.class) {
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
        defpackage.dgl dgl = f;
        defpackage.dih.t.put(defpackage.dgl.class, dgl);
    }
}
