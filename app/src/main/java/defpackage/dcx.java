package defpackage;

/* renamed from: dcx reason: default package */
/* compiled from: PG */
public final class dcx extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dcx d = new defpackage.dcx();
    private static volatile defpackage.djx e;
    public int a;
    public defpackage.dcw b;
    public int c;

    private dcx() {
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
                java.lang.Object[] objArr = {"a", "b", "c", defpackage.dcy.c};
                return new defpackage.dkb(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\t\u0001\u0003\f\u0002", objArr);
            case 3:
                return new defpackage.dcx();
            case 4:
                return new defpackage.dii((float[][][][][][][][][][][]) null);
            case 5:
                return d;
            case 6:
                defpackage.djx djx2 = e;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dcx.class) {
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
        defpackage.dcx dcx = d;
        defpackage.dih.t.put(defpackage.dcx.class, dcx);
    }
}
