package defpackage;

/* renamed from: der  reason: default package */
/* compiled from: PG */
public final class der extends dih implements djq {
    public static final der a = new der();
    private static volatile djx b;

    private der() {
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
                return new dkb(a, "\u0001\u0000", null);
            case 3:
                return new der();
            case 4:
                return new dii((float[][][][][][][][][][][][][][][][][]) null);
            case 5:
                return a;
            case 6:
                djx djx2 = b;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (der.class) {
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
        dih.t.put(der.class, a);
    }
}
