package defpackage;

/* renamed from: ddp  reason: default package */
/* compiled from: PG */
public final class ddp extends dih implements djq {
    public static final ddp f = new ddp();
    private static volatile djx g;
    public int a;
    public int b = 0;
    public Object c;
    public String d = "";
    public diq e = dka.b;

    private ddp() {
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
                return new dkb(f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001<\u0000\u0002?\u0000\u0003\u001a\u0004\b\u0002", new Object[]{"c", "b", "a", ddo.class, dcn.a, "e", "d"});
            case 3:
                return new ddp();
            case 4:
                return new dii((char[][][][][][][][][][][][][][]) null);
            case 5:
                return f;
            case 6:
                djx djx2 = g;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (ddp.class) {
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
        dih.t.put(ddp.class, f);
    }
}
