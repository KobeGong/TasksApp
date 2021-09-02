package defpackage;

/* renamed from: czy reason: default package */
/* compiled from: PG */
public final class czy extends defpackage.dih implements defpackage.djq {
    public static final defpackage.czy f = new defpackage.czy();
    private static volatile defpackage.djx g;
    public int a;
    public int b = 0;
    public java.lang.Object c;
    public int d;
    public boolean e;

    private czy() {
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
                java.lang.Object[] objArr = {"c", "b", "a", "d", defpackage.czz.b, defpackage.dbt.class, defpackage.dba.class, "e"};
                return new defpackage.dkb(f, "\u0001\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002<\u0000\u0003<\u0000\u0005\u0007\u0004", objArr);
            case 3:
                return new defpackage.czy();
            case 4:
                return new defpackage.dii((char[][]) null);
            case 5:
                return f;
            case 6:
                defpackage.djx djx2 = g;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.czy.class) {
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
        defpackage.czy czy = f;
        defpackage.dih.t.put(defpackage.czy.class, czy);
    }
}
