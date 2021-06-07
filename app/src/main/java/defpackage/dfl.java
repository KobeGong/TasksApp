package defpackage;

/* renamed from: dfl  reason: default package */
/* compiled from: PG */
public final class dfl extends dih implements djq {
    public static final dfl g = new dfl();
    private static volatile djx h;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public dgm e;
    public dgu f;

    private dfl() {
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
                return new dkb(g, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\t\u0004\u0006\t\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new dfl();
            case 4:
                return new dii((float[][][][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return g;
            case 6:
                djx djx2 = h;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (dfl.class) {
                    djx = h;
                    if (djx == null) {
                        djx = new dgr(g);
                        h = djx;
                    }
                }
                return djx;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        dih.t.put(dfl.class, g);
    }
}
