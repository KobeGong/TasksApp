package defpackage;

/* renamed from: dfe reason: default package */
/* compiled from: PG */
public final class dfe extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dfe m = new defpackage.dfe();
    private static volatile defpackage.djx n;
    public int a;
    public float b;
    public int c;
    public java.lang.String d = "";
    public java.lang.String e = "";
    public java.lang.String f = "";
    public java.lang.String g = "";
    public java.lang.String h = "";
    public int i;
    public java.lang.String j = "";
    public java.lang.String k = "";
    public defpackage.diq l = defpackage.dka.b;

    private dfe() {
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
                java.lang.Object[] objArr = {"a", "b", "e", "f", "g", "h", "i", "j", "c", defpackage.dfg.b, "d", "k", "l", defpackage.dff.class};
                return new defpackage.dkb(m, "\u0001\u000b\u0000\u0001\u0002\f\u000b\u0000\u0001\u0000\u0002\u0001\u0000\u0003\b\u0003\u0004\b\u0004\u0005\b\u0005\u0006\b\u0006\u0007\u0004\u0007\b\b\b\t\f\u0001\n\b\u0002\u000b\b\t\f\u001b", objArr);
            case 3:
                return new defpackage.dfe();
            case 4:
                return new defpackage.dii((float[][][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return m;
            case 6:
                defpackage.djx djx2 = n;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dfe.class) {
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
        defpackage.dfe dfe = m;
        defpackage.dih.t.put(defpackage.dfe.class, dfe);
    }
}
