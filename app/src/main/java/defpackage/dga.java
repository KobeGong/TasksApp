package defpackage;

/* renamed from: dga reason: default package */
/* compiled from: PG */
public final class dga extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dga d = new defpackage.dga();
    private static volatile defpackage.djx e;
    public int a;
    public java.lang.String b = "";
    public java.lang.String c = "";

    private dga() {
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
                return new defpackage.dkb(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\b\u0000\u0003\b\u0002", objArr);
            case 3:
                return new defpackage.dga();
            case 4:
                return new defpackage.dii((short[][][][][][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return d;
            case 6:
                defpackage.djx djx2 = e;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dga.class) {
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
        defpackage.dga dga = d;
        defpackage.dih.t.put(defpackage.dga.class, dga);
    }
}
