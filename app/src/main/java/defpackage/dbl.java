package defpackage;

/* renamed from: dbl reason: default package */
/* compiled from: PG */
public final class dbl extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dbl a = new defpackage.dbl();
    private static volatile defpackage.djx b;

    private dbl() {
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
                java.lang.Object[] objArr = new java.lang.Object[0];
                return new defpackage.dkb(a, "\u0000\u0000", objArr);
            case 3:
                return new defpackage.dbl();
            case 4:
                return new defpackage.dii((short[][][][][][][]) null);
            case 5:
                return a;
            case 6:
                defpackage.djx djx2 = b;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dbl.class) {
                    djx = b;
                    if (djx == null) {
                        djx = new defpackage.dgr(a);
                        b = djx;
                    }
                }
                return djx;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    static {
        defpackage.dbl dbl = a;
        defpackage.dih.t.put(defpackage.dbl.class, dbl);
    }
}
