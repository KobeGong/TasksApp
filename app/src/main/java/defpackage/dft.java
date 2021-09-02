package defpackage;

/* renamed from: dft reason: default package */
/* compiled from: PG */
public final class dft extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dft e = new defpackage.dft();
    private static volatile defpackage.djx f;
    public int a;
    public boolean b;
    public java.lang.String c = "";
    public java.lang.String d = "";

    private dft() {
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
                java.lang.Object[] objArr = {"a", "b", "c", "d"};
                return new defpackage.dkb(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0000\u0002\b\u0001\u0003\b\u0002", objArr);
            case 3:
                return new defpackage.dft();
            case 4:
                return new defpackage.dii((float[][][][][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return e;
            case 6:
                defpackage.djx djx2 = f;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dft.class) {
                    djx = f;
                    if (djx == null) {
                        djx = new defpackage.dgr(e);
                        f = djx;
                    }
                }
                return djx;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    static {
        defpackage.dft dft = e;
        defpackage.dih.t.put(defpackage.dft.class, dft);
    }
}
