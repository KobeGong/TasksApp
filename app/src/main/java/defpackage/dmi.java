package defpackage;

/* renamed from: dmi reason: default package */
/* compiled from: PG */
public final class dmi extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dmi b = new defpackage.dmi();
    private static volatile defpackage.djx c;
    public defpackage.djj a = defpackage.djj.b;

    private dmi() {
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
                java.lang.Object[] objArr = {"a", defpackage.dmj.a};
                return new defpackage.dkb(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", objArr);
            case 3:
                return new defpackage.dmi();
            case 4:
                return new defpackage.dii((float[][][][][][][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return b;
            case 6:
                defpackage.djx djx2 = c;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dmi.class) {
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
        defpackage.dmi dmi = b;
        defpackage.dih.t.put(defpackage.dmi.class, dmi);
    }
}
