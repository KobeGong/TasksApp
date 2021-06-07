package defpackage;

/* renamed from: dcu  reason: default package */
/* compiled from: PG */
public final class dcu extends dih implements djq {
    public static final dcu g = new dcu();
    private static volatile djx h;
    public int a;
    public diq b = dka.b;
    public String c = "";
    public String d = "";
    public ddk e;
    public ddp f;

    private dcu() {
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
                return new dkb(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\u001b\u0002\b\u0000\u0004\t\u0002\u0005\t\u0003\u0006\b\u0001", new Object[]{"a", "b", dcv.class, "c", "e", "f", "d"});
            case 3:
                return new dcu();
            case 4:
                return new dii((short[][][][][][][][][][][]) null);
            case 5:
                return g;
            case 6:
                djx djx2 = h;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (dcu.class) {
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
        dih.t.put(dcu.class, g);
    }
}
