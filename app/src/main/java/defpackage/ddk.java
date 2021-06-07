package defpackage;

/* renamed from: ddk  reason: default package */
/* compiled from: PG */
public final class ddk extends dih implements djq {
    public static final ddk f = new ddk();
    private static volatile djx g;
    public int a;
    public int b = 0;
    public Object c;
    public String d = "";
    public ddl e;

    private ddk() {
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
                return new dkb(f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u00027\u0000\u0003\t\u0003\u0004;\u0000", new Object[]{"c", "b", "a", "d", "e"});
            case 3:
                return new ddk();
            case 4:
                return new dii((short[][][][][][][][][][][][][]) null);
            case 5:
                return f;
            case 6:
                djx djx2 = g;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (ddk.class) {
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
        dih.t.put(ddk.class, f);
    }
}
