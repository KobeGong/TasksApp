package defpackage;

/* renamed from: dcu reason: default package */
/* compiled from: PG */
public final class dcu extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dcu g = new defpackage.dcu();
    private static volatile defpackage.djx h;
    public int a;
    public defpackage.diq b = defpackage.dka.b;
    public java.lang.String c = "";
    public java.lang.String d = "";
    public defpackage.ddk e;
    public defpackage.ddp f;

    private dcu() {
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
                java.lang.Object[] objArr = {"a", "b", defpackage.dcv.class, "c", "e", "f", "d"};
                return new defpackage.dkb(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\u001b\u0002\b\u0000\u0004\t\u0002\u0005\t\u0003\u0006\b\u0001", objArr);
            case 3:
                return new defpackage.dcu();
            case 4:
                return new defpackage.dii((short[][][][][][][][][][][]) null);
            case 5:
                return g;
            case 6:
                defpackage.djx djx2 = h;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dcu.class) {
                    djx = h;
                    if (djx == null) {
                        djx = new defpackage.dgr(g);
                        h = djx;
                    }
                }
                return djx;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    static {
        defpackage.dcu dcu = g;
        defpackage.dih.t.put(defpackage.dcu.class, dcu);
    }
}
