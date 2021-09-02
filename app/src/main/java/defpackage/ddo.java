package defpackage;

/* renamed from: ddo reason: default package */
/* compiled from: PG */
public final class ddo extends defpackage.dih implements defpackage.djq {
    public static final defpackage.ddo d = new defpackage.ddo();
    private static volatile defpackage.djx e;
    public int a;
    public int b;
    public defpackage.ddb c;

    private ddo() {
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
                java.lang.Object[] objArr = {"a", "b", defpackage.dcl.b, "c"};
                return new defpackage.dkb(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001", objArr);
            case 3:
                return new defpackage.ddo();
            case 4:
                return new defpackage.dii((byte[][][][][][][][][][][][][][]) null);
            case 5:
                return d;
            case 6:
                defpackage.djx djx2 = e;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.ddo.class) {
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
        defpackage.ddo ddo = d;
        defpackage.dih.t.put(defpackage.ddo.class, ddo);
    }
}
