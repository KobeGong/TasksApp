package defpackage;

/* renamed from: dcw reason: default package */
/* compiled from: PG */
public final class dcw extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dcw e = new defpackage.dcw();
    private static volatile defpackage.djx f;
    public int a;
    public int b = 0;
    public java.lang.Object c;
    public defpackage.dcu d;

    private dcw() {
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
                java.lang.Object[] objArr = {"c", "b", "a", "d", defpackage.ddq.class, defpackage.ddh.class};
                return new defpackage.dkb(e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002<\u0000\u0003<\u0000", objArr);
            case 3:
                return new defpackage.dcw();
            case 4:
                return new defpackage.dii((boolean[][][][][][][][][][][]) null);
            case 5:
                return e;
            case 6:
                defpackage.djx djx2 = f;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dcw.class) {
                    djx = f;
                    if (djx == null) {
                        djx = new defpackage.dgr(e);
                        f = djx;
                    }
                }
                return djx;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    static {
        defpackage.dcw dcw = e;
        defpackage.dih.t.put(defpackage.dcw.class, dcw);
    }
}
