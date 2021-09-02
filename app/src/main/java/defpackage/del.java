package defpackage;

/* renamed from: del reason: default package */
/* compiled from: PG */
public final class del extends defpackage.dih implements defpackage.djq {
    public static final defpackage.del h = new defpackage.del();
    private static volatile defpackage.djx i;
    public int a;
    public java.lang.String b = "";
    public defpackage.dfi c;
    public long d;
    public int e;
    public defpackage.dfd f;
    public defpackage.diq g = defpackage.dka.b;

    private del() {
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
                java.lang.Object[] objArr = {"a", "b", "e", defpackage.dem.b, "d", "c", "f", "g", defpackage.dfj.class};
                return new defpackage.dkb(h, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0001\u0000\u0001\b\u0000\u0005\f\u0004\u0007\u0002\u0002\b\t\u0001\t\t\u0005\n\u001b", objArr);
            case 3:
                return new defpackage.del();
            case 4:
                return new defpackage.dii((byte[][][][][][][][][][][][][][][][][]) null);
            case 5:
                return h;
            case 6:
                defpackage.djx djx2 = i;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.del.class) {
                    djx = i;
                    if (djx == null) {
                        djx = new defpackage.dgr(h);
                        i = djx;
                    }
                }
                return djx;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    static {
        defpackage.del del = h;
        defpackage.dih.t.put(defpackage.del.class, del);
    }
}
