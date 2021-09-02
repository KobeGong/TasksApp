package defpackage;

/* renamed from: dek reason: default package */
/* compiled from: PG */
public final class dek extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dek e = new defpackage.dek();
    private static volatile defpackage.djx f;
    public int a;
    public defpackage.diq b = defpackage.dka.b;
    public long c;
    public long d;

    private dek() {
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
                java.lang.Object[] objArr = {"a", "c", "d", "b", defpackage.dfy.class};
                return new defpackage.dkb(e, "\u0001\u0003\u0000\u0001\u0004\u0007\u0003\u0000\u0001\u0000\u0004\u0002\u0000\u0005\u0002\u0001\u0007\u001b", objArr);
            case 3:
                return new defpackage.dek();
            case 4:
                return new defpackage.dii((float[][][][][][][][][][][][][][][][]) null);
            case 5:
                return e;
            case 6:
                defpackage.djx djx2 = f;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dek.class) {
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
        defpackage.dek dek = e;
        defpackage.dih.t.put(defpackage.dek.class, dek);
    }
}
