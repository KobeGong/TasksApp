package defpackage;

/* renamed from: dei reason: default package */
/* compiled from: PG */
public final class dei extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dei a = new defpackage.dei();
    private static volatile defpackage.djx b;

    private dei() {
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
                return new defpackage.dkb(a, "\u0001\u0000", null);
            case 3:
                return new defpackage.dei();
            case 4:
                return new defpackage.dii((int[][][][][][][][][][][][][][][][]) null);
            case 5:
                return a;
            case 6:
                defpackage.djx djx2 = b;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dei.class) {
                    djx = b;
                    if (djx == null) {
                        djx = new defpackage.dgr(a);
                        b = djx;
                    }
                }
                return djx;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    static {
        defpackage.dei dei = a;
        defpackage.dih.t.put(defpackage.dei.class, dei);
    }
}
