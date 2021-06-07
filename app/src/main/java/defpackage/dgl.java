package defpackage;

/* renamed from: dgl  reason: default package */
/* compiled from: PG */
public final class dgl extends dih implements djq {
    public static final dgl f = new dgl();
    private static volatile djx g;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    private dgl() {
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dih
    public final Object a(int i) {
        djx djx;
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new dkb(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\f\u0002\u0004\f\u0003", new Object[]{"a", "b", dge.c, "c", dfw.c, "d", dfu.c, "e", dgj.c});
            case 3:
                return new dgl();
            case 4:
                return new dii((char[][][][][][][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return f;
            case 6:
                djx djx2 = g;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (dgl.class) {
                    djx = g;
                    if (djx == null) {
                        djx = new dgr(f);
                        g = djx;
                    }
                }
                return djx;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        dih.t.put(dgl.class, f);
    }
}
