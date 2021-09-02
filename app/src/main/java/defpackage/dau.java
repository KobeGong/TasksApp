package defpackage;

/* renamed from: dau reason: default package */
/* compiled from: PG */
public final class dau extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dau d = new defpackage.dau();
    private static volatile defpackage.djx e;
    public defpackage.crb a;
    public java.lang.String b = "";
    public boolean c;

    private dau() {
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
                return new defpackage.dkb(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003\u0007", objArr);
            case 3:
                return new defpackage.dau();
            case 4:
                return new defpackage.dii((char[][][][][]) null);
            case 5:
                return d;
            case 6:
                defpackage.djx djx2 = e;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dau.class) {
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
        defpackage.dau dau = d;
        defpackage.dih.t.put(defpackage.dau.class, dau);
    }
}
