package defpackage;

/* renamed from: dfy  reason: default package */
/* compiled from: PG */
public final class dfy extends dih implements djq {
    public static final dfy m = new dfy();
    private static volatile djx n;
    public int a;
    public int b = 0;
    public Object c;
    public String d = "";
    public String e = "";
    public dgl f;
    public diq g = dka.b;
    public long h;
    public long i;
    public dgu j;
    public String k = "";
    public long l;

    private dfy() {
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
                return new dkb(m, "\u0001\u000e\u0001\u0001\u0002\u0014\u000e\u0000\u0001\u0000\u0002\b\u0002\u0005\u001b\b\u0002\u0007\t\u0002\b\n\b\u0001\f<\u0000\r<\u0000\u000e\t\u000e\u000f\t\u0004\u0010\b\u000f\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014\u0002\u0010", new Object[]{"c", "b", "a", "e", "g", dfz.class, "h", "i", "d", dfn.class, dgc.class, "j", "f", "k", dgn.class, dgb.class, dgd.class, "l"});
            case 3:
                return new dfy();
            case 4:
                return new dii((byte[][][][][][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return m;
            case 6:
                djx djx2 = n;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (dfy.class) {
                    djx = n;
                    if (djx == null) {
                        djx = new dgr(m);
                        n = djx;
                    }
                }
                return djx;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        dih.t.put(dfy.class, m);
    }
}
