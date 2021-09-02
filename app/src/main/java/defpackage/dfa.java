package defpackage;

/* renamed from: dfa reason: default package */
/* compiled from: PG */
public final class dfa extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dfa d = new defpackage.dfa();
    private static volatile defpackage.djx e;
    public int a;
    public defpackage.dfb b;
    public defpackage.dfc c;

    private dfa() {
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
                return new defpackage.dkb(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001", objArr);
            case 3:
                return new defpackage.dfa();
            case 4:
                return new defpackage.dii((char[][][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return d;
            case 6:
                defpackage.djx djx2 = e;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dfa.class) {
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
        defpackage.dfa dfa = d;
        defpackage.dih.t.put(defpackage.dfa.class, dfa);
    }
}
