package defpackage;

/* renamed from: ddp reason: default package */
/* compiled from: PG */
public final class ddp extends defpackage.dih implements defpackage.djq {
    public static final defpackage.ddp f = new defpackage.ddp();
    private static volatile defpackage.djx g;
    public int a;
    public int b = 0;
    public java.lang.Object c;
    public java.lang.String d = "";
    public defpackage.diq e = defpackage.dka.b;

    private ddp() {
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
                java.lang.Object[] objArr = {"c", "b", "a", defpackage.ddo.class, defpackage.dcn.a, "e", "d"};
                return new defpackage.dkb(f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001<\u0000\u0002?\u0000\u0003\u001a\u0004\b\u0002", objArr);
            case 3:
                return new defpackage.ddp();
            case 4:
                return new defpackage.dii((char[][][][][][][][][][][][][][]) null);
            case 5:
                return f;
            case 6:
                defpackage.djx djx2 = g;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.ddp.class) {
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
        defpackage.ddp ddp = f;
        defpackage.dih.t.put(defpackage.ddp.class, ddp);
    }
}
