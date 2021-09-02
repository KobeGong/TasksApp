package defpackage;

/* renamed from: ddu reason: default package */
/* compiled from: PG */
public final class ddu extends defpackage.dih implements defpackage.djq {
    public static final defpackage.ddu d = new defpackage.ddu();
    private static volatile defpackage.djx e;
    public int a;
    public int b = 0;
    public java.lang.Object c;

    private ddu() {
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
                java.lang.Object[] objArr = {"c", "b", "a", defpackage.dfh.class};
                return new defpackage.dkb(d, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001;\u0000\u0002<\u0000", objArr);
            case 3:
                return new defpackage.ddu();
            case 4:
                return new defpackage.dii((boolean[][][][][][][][][][][][][][]) null);
            case 5:
                return d;
            case 6:
                defpackage.djx djx2 = e;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.ddu.class) {
                    djx = e;
                    if (djx == null) {
                        djx = new defpackage.dgr(d);
                        e = djx;
                    }
                }
                return djx;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    static {
        defpackage.ddu ddu = d;
        defpackage.dih.t.put(defpackage.ddu.class, ddu);
    }
}
