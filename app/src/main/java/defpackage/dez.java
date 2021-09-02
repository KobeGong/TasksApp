package defpackage;

/* renamed from: dez reason: default package */
/* compiled from: PG */
public final class dez extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dez d = new defpackage.dez();
    private static volatile defpackage.djx e;
    public int a;
    public defpackage.deb b;
    public int c;

    private dez() {
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
                java.lang.Object[] objArr = {"a", "b", "c", defpackage.dey.d};
                return new defpackage.dkb(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0001", objArr);
            case 3:
                return new defpackage.dez();
            case 4:
                return new defpackage.dii((byte[][][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return d;
            case 6:
                defpackage.djx djx2 = e;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dez.class) {
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
        defpackage.dez dez = d;
        defpackage.dih.t.put(defpackage.dez.class, dez);
    }
}
