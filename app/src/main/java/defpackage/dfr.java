package defpackage;

/* renamed from: dfr  reason: default package */
/* compiled from: PG */
public final class dfr extends dih implements djq {
    public static final dfr f = new dfr();
    private static volatile djx g;
    public int a;
    public String b = "";
    public String c = "";
    public diq d = dka.b;
    public diq e = dka.b;

    private dfr() {
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
                return new dkb(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u001b\u0004\u001b", new Object[]{"a", "b", "c", "d", dga.class, "e", dfl.class});
            case 3:
                return new dfr();
            case 4:
                return new dii((int[][][][][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return f;
            case 6:
                djx djx2 = g;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (dfr.class) {
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
        dih.t.put(dfr.class, f);
    }
}
