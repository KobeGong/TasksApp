package defpackage;

/* renamed from: dgu  reason: default package */
/* compiled from: PG */
public final class dgu extends dih implements djq {
    public static final dgu b = new dgu();
    private static volatile djx c;
    public dha a = dha.a;

    private dgu() {
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
                return new dkb(b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\n", new Object[]{"a"});
            case 3:
                return new dgu();
            case 4:
                return new dii((boolean[][][][][][][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return b;
            case 6:
                djx djx2 = c;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (dgu.class) {
                    djx = c;
                    if (djx == null) {
                        djx = new dgr(b);
                        c = djx;
                    }
                }
                return djx;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        dih.t.put(dgu.class, b);
    }
}
