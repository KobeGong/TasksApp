package defpackage;

/* renamed from: czp reason: default package */
/* compiled from: PG */
public final class czp extends defpackage.dih implements defpackage.djq {
    public static final defpackage.czp b = new defpackage.czp();
    private static volatile defpackage.djx c;
    public int a;

    private czp() {
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
                java.lang.Object[] objArr = {"a"};
                return new defpackage.dkb(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", objArr);
            case 3:
                return new defpackage.czp();
            case 4:
                return new defpackage.dii((byte[]) null);
            case 5:
                return b;
            case 6:
                defpackage.djx djx2 = c;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.czp.class) {
                    djx = c;
                    if (djx == null) {
                        djx = new defpackage.dgr(b);
                        c = djx;
                    }
                }
                return djx;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    static {
        defpackage.czp czp = b;
        defpackage.dih.t.put(defpackage.czp.class, czp);
    }
}
