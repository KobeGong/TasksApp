package defpackage;

/* renamed from: ddz reason: default package */
/* compiled from: PG */
public final class ddz extends defpackage.dih implements defpackage.djq {
    public static final defpackage.ddz d = new defpackage.ddz();
    private static volatile defpackage.djx e;
    public int a;
    public int b = 0;
    public java.lang.Object c;

    private ddz() {
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
                java.lang.Object[] objArr = {"c", "b", "a", defpackage.dec.class, defpackage.ded.class, defpackage.ddv.class, defpackage.ddy.class, defpackage.dfk.class, defpackage.dee.class};
                return new defpackage.dkb(d, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", objArr);
            case 3:
                return new defpackage.ddz();
            case 4:
                return new defpackage.dii((char[][][][][][][][][][][][][][][]) null);
            case 5:
                return d;
            case 6:
                defpackage.djx djx2 = e;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.ddz.class) {
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
        defpackage.ddz ddz = d;
        defpackage.dih.t.put(defpackage.ddz.class, ddz);
    }
}
