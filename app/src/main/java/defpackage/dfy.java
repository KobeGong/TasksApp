package defpackage;

/* renamed from: dfy reason: default package */
/* compiled from: PG */
public final class dfy extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dfy m = new defpackage.dfy();
    private static volatile defpackage.djx n;
    public int a;
    public int b = 0;
    public java.lang.Object c;
    public java.lang.String d = "";
    public java.lang.String e = "";
    public defpackage.dgl f;
    public defpackage.diq g = defpackage.dka.b;
    public long h;
    public long i;
    public defpackage.dgu j;
    public java.lang.String k = "";
    public long l;

    private dfy() {
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
                java.lang.Object[] objArr = {"c", "b", "a", "e", "g", defpackage.dfz.class, "h", "i", "d", defpackage.dfn.class, defpackage.dgc.class, "j", "f", "k", defpackage.dgn.class, defpackage.dgb.class, defpackage.dgd.class, "l"};
                return new defpackage.dkb(m, "\u0001\u000e\u0001\u0001\u0002\u0014\u000e\u0000\u0001\u0000\u0002\b\u0002\u0005\u001b\b\u0002\u0007\t\u0002\b\n\b\u0001\f<\u0000\r<\u0000\u000e\t\u000e\u000f\t\u0004\u0010\b\u000f\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014\u0002\u0010", objArr);
            case 3:
                return new defpackage.dfy();
            case 4:
                return new defpackage.dii((byte[][][][][][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return m;
            case 6:
                defpackage.djx djx2 = n;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dfy.class) {
                    djx = n;
                    if (djx == null) {
                        djx = new defpackage.dgr(m);
                        n = djx;
                    }
                }
                return djx;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    static {
        defpackage.dfy dfy = m;
        defpackage.dih.t.put(defpackage.dfy.class, dfy);
    }
}
