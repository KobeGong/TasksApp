package defpackage;

/* renamed from: dfj  reason: default package */
/* compiled from: PG */
public final class dfj extends dih implements djq {
    public static final dfj d = new dfj();
    private static volatile djx e;
    public int a;
    public String b = "";
    public long c;

    private dfj() {
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
                return new dkb(d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003\u0002\u0001\u0004\b\u0000", new Object[]{"a", "c", "b"});
            case 3:
                return new dfj();
            case 4:
                return new dii((int[][][][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return d;
            case 6:
                djx djx2 = e;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (dfj.class) {
                    djx = e;
                    if (djx == null) {
                        djx = new dgr(d);
                        e = djx;
                    }
                }
                return djx;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        dih.t.put(dfj.class, d);
    }
}
