package defpackage;

/* renamed from: czw reason: default package */
/* compiled from: PG */
public final class czw extends defpackage.dih implements defpackage.djq {
    public static final defpackage.czw c = new defpackage.czw();
    private static volatile defpackage.djx d;
    public java.lang.String a = "";
    public boolean b;

    private czw() {
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
                java.lang.Object[] objArr = {"a", "b"};
                return new defpackage.dkb(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", objArr);
            case 3:
                return new defpackage.czw();
            case 4:
                return new defpackage.dii((float[]) null);
            case 5:
                return c;
            case 6:
                defpackage.djx djx2 = d;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.czw.class) {
                    djx = d;
                    if (djx == null) {
                        djx = new defpackage.dgr(c);
                        d = djx;
                    }
                }
                return djx;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    static {
        defpackage.czw czw = c;
        defpackage.dih.t.put(defpackage.czw.class, czw);
    }
}
