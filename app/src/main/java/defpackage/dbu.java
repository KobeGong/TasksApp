package defpackage;

/* renamed from: dbu  reason: default package */
/* compiled from: PG */
public final class dbu extends dih implements djq {
    public static final dbu c = new dbu();
    private static volatile djx d;
    public int a = 0;
    public Object b;

    private dbu() {
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
                return new dkb(c, "\u0000\b\u0001\u0000\n\u0011\b\u0000\u0000\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000", new Object[]{"b", "a", dak.class, dam.class, daf.class, dat.class, dag.class, dav.class, czt.class, dai.class});
            case 3:
                return new dbu();
            case 4:
                return new dii((float[][][][][][][][]) null);
            case 5:
                return c;
            case 6:
                djx djx2 = d;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (dbu.class) {
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
        dih.t.put(dbu.class, c);
    }
}
