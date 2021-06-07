package defpackage;

/* renamed from: del  reason: default package */
/* compiled from: PG */
public final class del extends dih implements djq {
    public static final del h = new del();
    private static volatile djx i;
    public int a;
    public String b = "";
    public dfi c;
    public long d;
    public int e;
    public dfd f;
    public diq g = dka.b;

    private del() {
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
                return new dkb(h, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0001\u0000\u0001\b\u0000\u0005\f\u0004\u0007\u0002\u0002\b\t\u0001\t\t\u0005\n\u001b", new Object[]{"a", "b", "e", dem.b, "d", "c", "f", "g", dfj.class});
            case 3:
                return new del();
            case 4:
                return new dii((byte[][][][][][][][][][][][][][][][][]) null);
            case 5:
                return h;
            case 6:
                djx djx2 = i;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (del.class) {
                    djx = i;
                    if (djx == null) {
                        djx = new dgr(h);
                        i = djx;
                    }
                }
                return djx;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        dih.t.put(del.class, h);
    }
}
