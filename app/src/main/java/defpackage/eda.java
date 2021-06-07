package defpackage;

/* renamed from: eda  reason: default package */
/* compiled from: PG */
public final class eda extends dih implements djq {
    public static final eda a = new eda();
    private static volatile djx b;

    private eda() {
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
                return new dkb(a, "\u0001\u0000", new Object[0]);
            case 3:
                return new eda();
            case 4:
                return new dii((char[][][][][][][][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return a;
            case 6:
                djx djx2 = b;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (eda.class) {
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
        new egn();
        dih.t.put(eda.class, a);
    }
}
