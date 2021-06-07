package defpackage;

/* renamed from: des  reason: default package */
/* compiled from: PG */
public final class des extends dih implements djq {
    public static final des g = new des();
    private static volatile djx h;
    public int a;
    public String b = "";
    public dfh c;
    public diq d = dka.b;
    public dfd e;
    public dfa f;

    private des() {
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
                return new dkb(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0000\u0001\b\u0000\u0003\u001a\u0005\t\u0001\u0006\t\u0002\u0007\t\u0003", new Object[]{"a", "b", "d", "c", "e", "f"});
            case 3:
                return new des();
            case 4:
                return new dii((byte[][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return g;
            case 6:
                djx djx2 = h;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (des.class) {
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
        dih.t.put(des.class, g);
    }
}
