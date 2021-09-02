package defpackage;

/* renamed from: ddl reason: default package */
/* compiled from: PG */
public final class ddl extends defpackage.dih implements defpackage.djq {
    public static final defpackage.ddl l = new defpackage.ddl();
    private static volatile defpackage.djx m;
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
    public defpackage.diq k = defpackage.dka.b;

    private ddl() {
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
                java.lang.Object[] objArr = {"a", "b", "c", defpackage.dcr.b, "d", "e", "f", "g", "h", "i", "j", "k", defpackage.ddm.class};
                return new defpackage.dkb(l, "\u0001\n\u0000\u0001\u0002\f\n\u0000\u0001\u0000\u0002\u0001\u0000\u0003\f\u0001\u0004\b\u0002\u0005\b\u0003\u0006\b\u0004\u0007\b\u0005\b\b\u0006\t\u0004\u0007\n\b\b\f\u001b", objArr);
            case 3:
                return new defpackage.ddl();
            case 4:
                return new defpackage.dii((int[][][][][][][][][][][][][]) null);
            case 5:
                return l;
            case 6:
                defpackage.djx djx2 = m;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.ddl.class) {
                    djx = m;
                    if (djx == null) {
                        djx = new defpackage.dgr(l);
                        m = djx;
                    }
                }
                return djx;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    static {
        defpackage.ddl ddl = l;
        defpackage.dih.t.put(defpackage.ddl.class, ddl);
    }
}
