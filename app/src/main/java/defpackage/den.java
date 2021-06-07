package defpackage;

/* renamed from: den  reason: default package */
/* compiled from: PG */
public final class den extends dih implements djq {
    public static final den d = new den();
    private static volatile djx e;
    public int a;
    public diq b = dka.b;
    public long c;

    private den() {
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
                return new dkb(d, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0001\u0000\u0004\u0002\u0000\u0005\u001b", new Object[]{"a", "c", "b", dfy.class});
            case 3:
                return new den();
            case 4:
                return new dii((char[][][][][][][][][][][][][][][][][]) null);
            case 5:
                return d;
            case 6:
                djx djx2 = e;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (den.class) {
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
        dih.t.put(den.class, d);
    }
}
