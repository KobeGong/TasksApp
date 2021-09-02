package defpackage;

/* renamed from: czv reason: default package */
/* compiled from: PG */
public final class czv extends defpackage.dih implements defpackage.djq {
    public static final defpackage.czv c = new defpackage.czv();
    private static volatile defpackage.djx d;
    public defpackage.dby a;
    public defpackage.dcb b;

    private czv() {
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
                return new defpackage.dkb(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", objArr);
            case 3:
                return new defpackage.czv();
            case 4:
                return new defpackage.dii((boolean[]) null);
            case 5:
                return c;
            case 6:
                defpackage.djx djx2 = d;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.czv.class) {
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
        defpackage.czv czv = c;
        defpackage.dih.t.put(defpackage.czv.class, czv);
    }
}
