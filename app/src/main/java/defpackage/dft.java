package defpackage;

/* renamed from: dft  reason: default package */
/* compiled from: PG */
public final class dft extends dih implements djq {
    public static final dft e = new dft();
    private static volatile djx f;
    public int a;
    public boolean b;
    public String c = "";
    public String d = "";

    private dft() {
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
                return new dkb(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0000\u0002\b\u0001\u0003\b\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new dft();
            case 4:
                return new dii((float[][][][][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return e;
            case 6:
                djx djx2 = f;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (dft.class) {
                    djx = f;
                    if (djx == null) {
                        djx = new dgr(e);
                        f = djx;
                    }
                }
                return djx;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        dih.t.put(dft.class, e);
    }
}
