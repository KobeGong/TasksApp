package defpackage;

/* renamed from: czm reason: default package */
/* compiled from: PG */
public final class czm extends defpackage.dih implements defpackage.djq {
    public static final defpackage.czm c = new defpackage.czm();
    private static volatile defpackage.djx d;
    public int a;
    public int b;

    private czm() {
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
                return new defpackage.dkb(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0004", objArr);
            case 3:
                return new defpackage.czm();
            case 4:
                return new defpackage.dii(0.0f);
            case 5:
                return c;
            case 6:
                defpackage.djx djx2 = d;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.czm.class) {
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
        defpackage.czm czm = c;
        defpackage.dih.t.put(defpackage.czm.class, czm);
    }
}
