package defpackage;

/* renamed from: dej reason: default package */
/* compiled from: PG */
public final class dej extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dej f = new defpackage.dej();
    private static volatile defpackage.djx g;
    public int a;
    public java.lang.String b = "";
    public defpackage.dfi c;
    public long d;
    public defpackage.dfd e;

    private dej() {
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
                java.lang.Object[] objArr = {"a", "b", "d", "c", "e"};
                return new defpackage.dkb(f, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0000\u0001\b\u0000\u0005\u0002\u0002\u0007\t\u0001\b\t\u0004", objArr);
            case 3:
                return new defpackage.dej();
            case 4:
                return new defpackage.dii((boolean[][][][][][][][][][][][][][][][]) null);
            case 5:
                return f;
            case 6:
                defpackage.djx djx2 = g;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dej.class) {
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
        defpackage.dej dej = f;
        defpackage.dih.t.put(defpackage.dej.class, dej);
    }
}
