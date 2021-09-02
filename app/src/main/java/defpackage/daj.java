package defpackage;

/* renamed from: daj reason: default package */
/* compiled from: PG */
public final class daj extends defpackage.dih implements defpackage.djq {
    public static final defpackage.daj b = new defpackage.daj();
    private static volatile defpackage.djx c;
    public defpackage.crb a;

    private daj() {
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
                return new defpackage.dkb(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", objArr);
            case 3:
                return new defpackage.daj();
            case 4:
                return new defpackage.dii((boolean[][][]) null);
            case 5:
                return b;
            case 6:
                defpackage.djx djx2 = c;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.daj.class) {
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
        defpackage.daj daj = b;
        defpackage.dih.t.put(defpackage.daj.class, daj);
    }
}
