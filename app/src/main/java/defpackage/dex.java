package defpackage;

/* renamed from: dex reason: default package */
/* compiled from: PG */
public final class dex extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dex a = new defpackage.dex();
    private static volatile defpackage.djx b;

    private dex() {
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
                return new defpackage.dkb(a, "\u0001\u0000", null);
            case 3:
                return new defpackage.dex();
            case 4:
                return new defpackage.dii((float[][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return a;
            case 6:
                defpackage.djx djx2 = b;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dex.class) {
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
        defpackage.dex dex = a;
        defpackage.dih.t.put(defpackage.dex.class, dex);
    }
}
