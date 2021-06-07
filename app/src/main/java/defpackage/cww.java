package defpackage;

/* renamed from: cww  reason: default package */
/* compiled from: PG */
public final class cww extends dih implements djq {
    public static final cww c = new cww();
    private static volatile djx d;
    public int a;
    public int b;

    private cww() {
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
                return new dkb(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{"a", "b", cwt.b});
            case 3:
                return new cww();
            case 4:
                return new dii(0);
            case 5:
                return c;
            case 6:
                djx djx2 = d;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (cww.class) {
                    djx = d;
                    if (djx == null) {
                        djx = new dgr(c);
                        d = djx;
                    }
                }
                return djx;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        dih.t.put(cww.class, c);
    }
}
