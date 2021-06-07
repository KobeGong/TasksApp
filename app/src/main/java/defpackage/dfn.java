package defpackage;

/* renamed from: dfn  reason: default package */
/* compiled from: PG */
public final class dfn extends dih implements djq {
    public static final dfn q = new dfn();
    private static volatile djx u;
    public int a;
    public String b = "";
    public String c = "";
    public diq d = dka.b;
    public dga e;
    public long f;
    public String g = "";
    public dfr h;
    public String i = "";
    public dfs j;
    public int k;
    public dft l;
    public String m = "";
    public dfq n;
    public String o = "";
    public int p;

    private dfn() {
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dih
    public final Object a(int i2) {
        djx djx;
        switch (i2 - 1) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new dkb(q, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u001b\u0004\t\u0002\u0005\u0002\u0003\u0006\b\u0004\u0007\t\u0005\b\b\u0006\t\t\u0007\n\f\b\u000b\t\t\f\b\n\r\t\u000b\u000e\b\f\u000f\u0004\r", new Object[]{"a", "b", "c", "d", dga.class, "e", "f", "g", "h", "i", "j", "k", dfo.b, "l", "m", "n", "o", "p"});
            case 3:
                return new dfn();
            case 4:
                return new dii((char[][][][][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return q;
            case 6:
                djx djx2 = u;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (dfn.class) {
                    djx = u;
                    if (djx == null) {
                        djx = new dgr(q);
                        u = djx;
                    }
                }
                return djx;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        dih.t.put(dfn.class, q);
    }
}
