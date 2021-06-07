package defpackage;

/* renamed from: dao  reason: default package */
/* compiled from: PG */
public final class dao extends dih implements djq {
    public static final dao c = new dao();
    private static volatile djx d;
    public String a = "";
    public String b = "";

    private dao() {
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
                return new dkb(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new dao();
            case 4:
                return new dii((int[][][][]) null);
            case 5:
                return c;
            case 6:
                djx djx2 = d;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (dao.class) {
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
        dih.t.put(dao.class, c);
    }
}
