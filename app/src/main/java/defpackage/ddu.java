package defpackage;

/* renamed from: ddu  reason: default package */
/* compiled from: PG */
public final class ddu extends dih implements djq {
    public static final ddu d = new ddu();
    private static volatile djx e;
    public int a;
    public int b = 0;
    public Object c;

    private ddu() {
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
                return new dkb(d, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001;\u0000\u0002<\u0000", new Object[]{"c", "b", "a", dfh.class});
            case 3:
                return new ddu();
            case 4:
                return new dii((boolean[][][][][][][][][][][][][][]) null);
            case 5:
                return d;
            case 6:
                djx djx2 = e;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (ddu.class) {
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
        dih.t.put(ddu.class, d);
    }
}
