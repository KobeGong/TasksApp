package defpackage;

/* renamed from: ddq reason: default package */
/* compiled from: PG */
public final class ddq extends defpackage.dih implements defpackage.djq {
    public static final defpackage.ddq c = new defpackage.ddq();
    private static volatile defpackage.djx d;
    public int a;
    public int b;

    private ddq() {
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
                java.lang.Object[] objArr = {"a", "b", defpackage.ddr.e};
                return new defpackage.dkb(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", objArr);
            case 3:
                return new defpackage.ddq();
            case 4:
                return new defpackage.dii((short[][][][][][][][][][][][][][]) null);
            case 5:
                return c;
            case 6:
                defpackage.djx djx2 = d;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.ddq.class) {
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
        defpackage.ddq ddq = c;
        defpackage.dih.t.put(defpackage.ddq.class, ddq);
    }
}
