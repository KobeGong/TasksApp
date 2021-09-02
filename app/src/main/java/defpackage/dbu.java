package defpackage;

/* renamed from: dbu reason: default package */
/* compiled from: PG */
public final class dbu extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dbu c = new defpackage.dbu();
    private static volatile defpackage.djx d;
    public int a = 0;
    public java.lang.Object b;

    private dbu() {
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
                java.lang.Object[] objArr = {"b", "a", defpackage.dak.class, defpackage.dam.class, defpackage.daf.class, defpackage.dat.class, defpackage.dag.class, defpackage.dav.class, defpackage.czt.class, defpackage.dai.class};
                return new defpackage.dkb(c, "\u0000\b\u0001\u0000\n\u0011\b\u0000\u0000\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000", objArr);
            case 3:
                return new defpackage.dbu();
            case 4:
                return new defpackage.dii((float[][][][][][][][]) null);
            case 5:
                return c;
            case 6:
                defpackage.djx djx2 = d;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dbu.class) {
                    djx = d;
                    if (djx == null) {
                        djx = new defpackage.dgr(c);
                        d = djx;
                    }
                }
                return djx;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    static {
        defpackage.dbu dbu = c;
        defpackage.dih.t.put(defpackage.dbu.class, dbu);
    }
}
