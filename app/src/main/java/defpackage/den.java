package defpackage;

/* renamed from: den reason: default package */
/* compiled from: PG */
public final class den extends defpackage.dih implements defpackage.djq {
    public static final defpackage.den d = new defpackage.den();
    private static volatile defpackage.djx e;
    public int a;
    public defpackage.diq b = defpackage.dka.b;
    public long c;

    private den() {
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
                java.lang.Object[] objArr = {"a", "c", "b", defpackage.dfy.class};
                return new defpackage.dkb(d, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0001\u0000\u0004\u0002\u0000\u0005\u001b", objArr);
            case 3:
                return new defpackage.den();
            case 4:
                return new defpackage.dii((char[][][][][][][][][][][][][][][][][]) null);
            case 5:
                return d;
            case 6:
                defpackage.djx djx2 = e;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.den.class) {
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
        defpackage.den den = d;
        defpackage.dih.t.put(defpackage.den.class, den);
    }
}
