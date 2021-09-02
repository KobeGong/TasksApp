package defpackage;

/* renamed from: ddk reason: default package */
/* compiled from: PG */
public final class ddk extends defpackage.dih implements defpackage.djq {
    public static final defpackage.ddk f = new defpackage.ddk();
    private static volatile defpackage.djx g;
    public int a;
    public int b = 0;
    public java.lang.Object c;
    public java.lang.String d = "";
    public defpackage.ddl e;

    private ddk() {
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
                java.lang.Object[] objArr = {"c", "b", "a", "d", "e"};
                return new defpackage.dkb(f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u00027\u0000\u0003\t\u0003\u0004;\u0000", objArr);
            case 3:
                return new defpackage.ddk();
            case 4:
                return new defpackage.dii((short[][][][][][][][][][][][][]) null);
            case 5:
                return f;
            case 6:
                defpackage.djx djx2 = g;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.ddk.class) {
                    djx = g;
                    if (djx == null) {
                        djx = new defpackage.dgr(f);
                        g = djx;
                    }
                }
                return djx;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    static {
        defpackage.ddk ddk = f;
        defpackage.dih.t.put(defpackage.ddk.class, ddk);
    }
}
