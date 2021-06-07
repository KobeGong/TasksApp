package defpackage;

/* renamed from: dfd  reason: default package */
/* compiled from: PG */
public final class dfd extends dih implements djq {
    public static final dfd f = new dfd();
    private static volatile djx g;
    public int a;
    public String b = "";
    public String c = "";
    public dfe d;
    public dgu e;

    private dfd() {
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
                return new dkb(f, "\u0001\u0004\u0000\u0001\u0001\u001e\u0004\u0000\u0000\u0000\u0001\b\u0000\u0003\t\u0002\u0004\b\u0001\u001e\t\u0003", new Object[]{"a", "b", "d", "c", "e"});
            case 3:
                return new dfd();
            case 4:
                return new dii((boolean[][][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return f;
            case 6:
                djx djx2 = g;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (dfd.class) {
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
        dih.t.put(dfd.class, f);
    }
}
