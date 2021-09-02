package defpackage;

/* renamed from: czu reason: default package */
/* compiled from: PG */
public final class czu extends defpackage.dih implements defpackage.djq {
    public static final defpackage.czu f = new defpackage.czu();
    private static volatile defpackage.djx g;
    public defpackage.crb a;
    public defpackage.dca b;
    public java.lang.String c = "";
    public java.lang.String d = "";
    public int e;

    private czu() {
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
                java.lang.Object[] objArr = {"a", "b", "c", "d", "e"};
                return new defpackage.dkb(f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002\t\u0003Ȉ\u0004Ȉ\u0005\u0004", objArr);
            case 3:
                return new defpackage.czu();
            case 4:
                return new defpackage.dii((int[]) null);
            case 5:
                return f;
            case 6:
                defpackage.djx djx2 = g;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.czu.class) {
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
        defpackage.czu czu = f;
        defpackage.dih.t.put(defpackage.czu.class, czu);
    }
}
