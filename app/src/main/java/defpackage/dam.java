package defpackage;

/* renamed from: dam reason: default package */
/* compiled from: PG */
public final class dam extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dam a = new defpackage.dam();
    private static volatile defpackage.djx b;

    private dam() {
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
                return new defpackage.dam();
            case 4:
                return new defpackage.dii((char[][][][]) null);
            case 5:
                return a;
            case 6:
                defpackage.djx djx2 = b;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dam.class) {
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
        defpackage.dam dam = a;
        defpackage.dih.t.put(defpackage.dam.class, dam);
    }
}
