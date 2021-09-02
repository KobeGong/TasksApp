package defpackage;

/* renamed from: daz reason: default package */
/* compiled from: PG */
public final class daz extends defpackage.dih implements defpackage.djq {
    public static final defpackage.daz b = new defpackage.daz();
    private static volatile defpackage.djx c;
    public defpackage.diq a = defpackage.dka.b;

    private daz() {
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
                java.lang.Object[] objArr = {"a", defpackage.dbo.class};
                return new defpackage.dkb(b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", objArr);
            case 3:
                return new defpackage.daz();
            case 4:
                return new defpackage.dii((float[][][][][]) null);
            case 5:
                return b;
            case 6:
                defpackage.djx djx2 = c;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.daz.class) {
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
        defpackage.daz daz = b;
        defpackage.dih.t.put(defpackage.daz.class, daz);
    }
}
