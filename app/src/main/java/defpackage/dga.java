package defpackage;

/* renamed from: dga  reason: default package */
/* compiled from: PG */
public final class dga extends dih implements djq {
    public static final dga d = new dga();
    private static volatile djx e;
    public int a;
    public String b = "";
    public String c = "";

    private dga() {
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
                return new dkb(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\b\u0000\u0003\b\u0002", new Object[]{"a", "b", "c"});
            case 3:
                return new dga();
            case 4:
                return new dii((short[][][][][][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return d;
            case 6:
                djx djx2 = e;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (dga.class) {
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
        dih.t.put(dga.class, d);
    }
}