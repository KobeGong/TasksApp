package defpackage;

/* renamed from: czy  reason: default package */
/* compiled from: PG */
public final class czy extends dih implements djq {
    public static final czy f = new czy();
    private static volatile djx g;
    public int a;
    public int b = 0;
    public Object c;
    public int d;
    public boolean e;

    private czy() {
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
                return new dkb(f, "\u0001\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002<\u0000\u0003<\u0000\u0005\u0007\u0004", new Object[]{"c", "b", "a", "d", czz.b, dbt.class, dba.class, "e"});
            case 3:
                return new czy();
            case 4:
                return new dii((char[][]) null);
            case 5:
                return f;
            case 6:
                djx djx2 = g;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (czy.class) {
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
        dih.t.put(czy.class, f);
    }
}
