package defpackage;

/* renamed from: eda reason: default package */
/* compiled from: PG */
public final class eda extends defpackage.dih implements defpackage.djq {
    public static final defpackage.eda a = new defpackage.eda();
    private static volatile defpackage.djx b;

    private eda() {
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
                return new defpackage.dkb(a, "\u0001\u0000", objArr);
            case 3:
                return new defpackage.eda();
            case 4:
                return new defpackage.dii((char[][][][][][][][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return a;
            case 6:
                defpackage.djx djx2 = b;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.eda.class) {
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
        new defpackage.egn();
        defpackage.eda eda = a;
        defpackage.dih.t.put(defpackage.eda.class, eda);
    }
}
