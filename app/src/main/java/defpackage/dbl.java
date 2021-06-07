package defpackage;

/* renamed from: dbl  reason: default package */
/* compiled from: PG */
public final class dbl extends dih implements djq {
    public static final dbl a = new dbl();
    private static volatile djx b;

    private dbl() {
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
                return new dkb(a, "\u0000\u0000", new Object[0]);
            case 3:
                return new dbl();
            case 4:
                return new dii((short[][][][][][][]) null);
            case 5:
                return a;
            case 6:
                djx djx2 = b;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (dbl.class) {
                    djx = b;
                    if (djx == null) {
                        djx = new dgr(a);
                        b = djx;
                    }
                }
                return djx;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        dih.t.put(dbl.class, a);
    }
}
