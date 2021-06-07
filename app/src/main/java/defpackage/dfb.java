package defpackage;

/* renamed from: dfb  reason: default package */
/* compiled from: PG */
public final class dfb extends dih implements djq {
    public static final dfb d = new dfb();
    private static volatile djx e;
    public int a;
    public long b;
    public String c = "";

    private dfb() {
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
                return new dkb(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0000\u0002\b\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new dfb();
            case 4:
                return new dii((short[][][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return d;
            case 6:
                djx djx2 = e;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (dfb.class) {
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
        dih.t.put(dfb.class, d);
    }
}
