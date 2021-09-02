package defpackage;

/* renamed from: dfn reason: default package */
/* compiled from: PG */
public final class dfn extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dfn q = new defpackage.dfn();
    private static volatile defpackage.djx u;
    public int a;
    public java.lang.String b = "";
    public java.lang.String c = "";
    public defpackage.diq d = defpackage.dka.b;
    public defpackage.dga e;
    public long f;
    public java.lang.String g = "";
    public defpackage.dfr h;
    public java.lang.String i = "";
    public defpackage.dfs j;
    public int k;
    public defpackage.dft l;
    public java.lang.String m = "";
    public defpackage.dfq n;
    public java.lang.String o = "";
    public int p;

    private dfn() {
    }

    /* access modifiers changed from: protected */
    public final java.lang.Object a(int i2) {
        defpackage.djx djx;
        switch (i2 - 1) {
            case 0:
                return java.lang.Byte.valueOf(1);
            case 1:
                return null;
            case 2:
                java.lang.Object[] objArr = {"a", "b", "c", "d", defpackage.dga.class, "e", "f", "g", "h", "i", "j", "k", defpackage.dfo.b, "l", "m", "n", "o", "p"};
                return new defpackage.dkb(q, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u001b\u0004\t\u0002\u0005\u0002\u0003\u0006\b\u0004\u0007\t\u0005\b\b\u0006\t\t\u0007\n\f\b\u000b\t\t\f\b\n\r\t\u000b\u000e\b\f\u000f\u0004\r", objArr);
            case 3:
                return new defpackage.dfn();
            case 4:
                return new defpackage.dii((char[][][][][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return q;
            case 6:
                defpackage.djx djx2 = u;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dfn.class) {
                    djx = u;
                    if (djx == null) {
                        djx = new defpackage.dgr(q);
                        u = djx;
                    }
                }
                return djx;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    static {
        defpackage.dfn dfn = q;
        defpackage.dih.t.put(defpackage.dfn.class, dfn);
    }
}
