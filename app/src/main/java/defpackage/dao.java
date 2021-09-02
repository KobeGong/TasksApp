package defpackage;

/* renamed from: dao reason: default package */
/* compiled from: PG */
public final class dao extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dao c = new defpackage.dao();
    private static volatile defpackage.djx d;
    public java.lang.String a = "";
    public java.lang.String b = "";

    private dao() {
    }

    /* access modifiers changed from: protected */
    public final java.lang.Object a(int i) {
        defpackage.djx djx;
        switch (i - 1) {
            case 0:
                return java.lang.Byte.valueOf(1);
            case 1:
                return null;
            case 2:
                java.lang.Object[] objArr = {"a", "b"};
                return new defpackage.dkb(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", objArr);
            case 3:
                return new defpackage.dao();
            case 4:
                return new defpackage.dii((int[][][][]) null);
            case 5:
                return c;
            case 6:
                defpackage.djx djx2 = d;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dao.class) {
                    djx = d;
                    if (djx == null) {
                        djx = new defpackage.dgr(c);
                        d = djx;
                    }
                }
                return djx;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    static {
        defpackage.dao dao = c;
        defpackage.dih.t.put(defpackage.dao.class, dao);
    }
}
