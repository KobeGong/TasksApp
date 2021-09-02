package defpackage;

/* renamed from: deh reason: default package */
/* compiled from: PG */
public final class deh extends defpackage.dih implements defpackage.djq {
    public static final defpackage.deh e = new defpackage.deh();
    private static volatile defpackage.djx f;
    public int a;
    public java.lang.String b = "";
    public defpackage.diq c = defpackage.dka.b;
    public defpackage.diq d = defpackage.dka.b;

    private deh() {
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
                java.lang.Object[] objArr = {"a", "b", "c", "d", defpackage.dfh.class};
                return new defpackage.dkb(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\b\u0000\u0002\u001a\u0003\u001b", objArr);
            case 3:
                return new defpackage.deh();
            case 4:
                return new defpackage.dii((short[][][][][][][][][][][][][][][][]) null);
            case 5:
                return e;
            case 6:
                defpackage.djx djx2 = f;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.deh.class) {
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
        defpackage.deh deh = e;
        defpackage.dih.t.put(defpackage.deh.class, deh);
    }
}
