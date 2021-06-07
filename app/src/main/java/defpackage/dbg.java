package defpackage;

/* renamed from: dbg  reason: default package */
/* compiled from: PG */
public final class dbg extends dih implements djq {
    public static final dbg d = new dbg();
    private static volatile djx e;
    public int a;
    public dby b;
    public diq c = dka.b;

    private dbg() {
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
                return new dkb(d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0002\u001b", new Object[]{"a", "b", "c", dby.class});
            case 3:
                return new dbg();
            case 4:
                return new dii((boolean[][][][][][]) null);
            case 5:
                return d;
            case 6:
                djx djx2 = e;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (dbg.class) {
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
        dih.t.put(dbg.class, d);
    }
}
