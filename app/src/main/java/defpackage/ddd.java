package defpackage;

/* renamed from: ddd  reason: default package */
/* compiled from: PG */
public final class ddd extends dih implements djq {
    public static final ddd f = new ddd();
    private static volatile djx g;
    public int a;
    public String b = "";
    public long c;
    public String d = "";
    public long e;

    private ddd() {
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
                return new dkb(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0002\u0003\u0002\u0001\u0004\u0002\u0003", new Object[]{"a", "b", "d", "c", "e"});
            case 3:
                return new ddd();
            case 4:
                return new dii((int[][][][][][][][][][][][]) null);
            case 5:
                return f;
            case 6:
                djx djx2 = g;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (ddd.class) {
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
        dih.t.put(ddd.class, f);
    }
}
