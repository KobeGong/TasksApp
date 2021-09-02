package defpackage;

/* renamed from: day reason: default package */
/* compiled from: PG */
public final class day extends defpackage.dih implements defpackage.djq {
    public static final defpackage.day c = new defpackage.day();
    private static volatile defpackage.djx d;
    public defpackage.diq a = defpackage.dka.b;
    public defpackage.diq b = defpackage.dka.b;

    private day() {
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
                java.lang.Object[] objArr = {"a", defpackage.dby.class, "b", defpackage.dcb.class};
                return new defpackage.dkb(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", objArr);
            case 3:
                return new defpackage.day();
            case 4:
                return new defpackage.dii((boolean[][][][][]) null);
            case 5:
                return c;
            case 6:
                defpackage.djx djx2 = d;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.day.class) {
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
        defpackage.day day = c;
        defpackage.dih.t.put(defpackage.day.class, day);
    }
}
