package defpackage;

/* renamed from: dcv reason: default package */
/* compiled from: PG */
public final class dcv extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dcv d = new defpackage.dcv();
    private static volatile defpackage.djx e;
    public int a;
    public java.lang.String b = "";
    public long c;

    private dcv() {
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
                java.lang.Object[] objArr = {"a", "b", "c"};
                return new defpackage.dkb(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001", objArr);
            case 3:
                return new defpackage.dcv();
            case 4:
                return new defpackage.dii((int[][][][][][][][][][][]) null);
            case 5:
                return d;
            case 6:
                defpackage.djx djx2 = e;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dcv.class) {
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
        defpackage.dcv dcv = d;
        defpackage.dih.t.put(defpackage.dcv.class, dcv);
    }
}
