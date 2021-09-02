package defpackage;

/* renamed from: czx reason: default package */
/* compiled from: PG */
public final class czx extends defpackage.dih implements defpackage.djq {
    public static final defpackage.czx a = new defpackage.czx();
    private static volatile defpackage.djx b;

    private czx() {
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
                return new defpackage.dkb(a, "\u0000\u0000", null);
            case 3:
                return new defpackage.czx();
            case 4:
                return new defpackage.dii((byte[][]) null);
            case 5:
                return a;
            case 6:
                defpackage.djx djx2 = b;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.czx.class) {
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
        defpackage.czx czx = a;
        defpackage.dih.t.put(defpackage.czx.class, czx);
    }
}
