package defpackage;

/* renamed from: dmk  reason: default package */
/* compiled from: PG */
public final class dmk extends dih implements djq {
    public static final dmk d = new dmk();
    private static volatile djx e;
    public int a;
    public int b;
    public int c;

    private dmk() {
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
                return new dkb(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"a", "b", "c"});
            case 3:
                return new dmk();
            case 4:
                return new dii((byte[][][][][][][][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return d;
            case 6:
                djx djx2 = e;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (dmk.class) {
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
        dih.t.put(dmk.class, d);
    }
}
