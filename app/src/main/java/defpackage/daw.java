package defpackage;

/* renamed from: daw reason: default package */
/* compiled from: PG */
public final class daw extends defpackage.dih implements defpackage.djq {
    public static final defpackage.daw h = new defpackage.daw();
    private static volatile defpackage.djx i;
    public int a;
    public java.lang.String b = "";
    public java.lang.String c = "";
    public java.lang.String d = "";
    public int e;
    public java.lang.String f = "";
    public defpackage.djj g = defpackage.djj.b;

    private daw() {
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
                java.lang.Object[] objArr = {"a", "b", "c", "d", "e", "f", "g", defpackage.dax.a};
                return new defpackage.dkb(h, "\u0000\u0006\u0000\u0001\u0001\b\u0006\u0001\u0000\u0000\u0001Ȉ\u0004Ȉ\u0005Ȉ\u0006\u0004\u0007Ȉ\b2", objArr);
            case 3:
                return new defpackage.daw();
            case 4:
                return new defpackage.dii((int[][][][][]) null);
            case 5:
                return h;
            case 6:
                defpackage.djx djx2 = i;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.daw.class) {
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
        defpackage.daw daw = h;
        defpackage.dih.t.put(defpackage.daw.class, daw);
    }
}
