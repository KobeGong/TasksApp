package defpackage;

/* renamed from: crb reason: default package */
/* compiled from: PG */
public final class crb extends defpackage.dih implements defpackage.djq {
    public static final defpackage.crb e = new defpackage.crb();
    private static volatile defpackage.djx f;
    public int a;
    public defpackage.djj b = defpackage.djj.b;
    public defpackage.dip c = defpackage.dil.b;
    public boolean d;

    private crb() {
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
                java.lang.Object[] objArr = {"a", "b", defpackage.crc.a, "c", "d"};
                return new defpackage.dkb(e, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0001\u0000\u00012\u0002'\u0003\u0007", objArr);
            case 3:
                return new defpackage.crb();
            case 4:
                return new defpackage.dii(0);
            case 5:
                return e;
            case 6:
                defpackage.djx djx2 = f;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.crb.class) {
                    djx = f;
                    if (djx == null) {
                        djx = new defpackage.dgr(e);
                        f = djx;
                    }
                }
                return djx;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    static {
        defpackage.crb crb = e;
        defpackage.dih.t.put(defpackage.crb.class, crb);
    }
}
