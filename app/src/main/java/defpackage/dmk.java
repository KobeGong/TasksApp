package defpackage;

/* renamed from: dmk reason: default package */
/* compiled from: PG */
public final class dmk extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dmk d = new defpackage.dmk();
    private static volatile defpackage.djx e;
    public int a;
    public int b;
    public int c;

    private dmk() {
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
                return new defpackage.dkb(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", objArr);
            case 3:
                return new defpackage.dmk();
            case 4:
                return new defpackage.dii((byte[][][][][][][][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return d;
            case 6:
                defpackage.djx djx2 = e;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dmk.class) {
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
        defpackage.dmk dmk = d;
        defpackage.dih.t.put(defpackage.dmk.class, dmk);
    }
}
