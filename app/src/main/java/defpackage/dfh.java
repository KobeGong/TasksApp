package defpackage;

/* renamed from: dfh  reason: default package */
/* compiled from: PG */
public final class dfh extends dih implements djq {
    public static final dfh d = new dfh();
    private static volatile djx e;
    public int a;
    public int b;
    public ddz c;

    private dfh() {
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
                return new dkb(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001", new Object[]{"a", "b", ddw.b, "c"});
            case 3:
                return new dfh();
            case 4:
                return new dii((char[][][][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return d;
            case 6:
                djx djx2 = e;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (dfh.class) {
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
        dih.t.put(dfh.class, d);
    }
}
