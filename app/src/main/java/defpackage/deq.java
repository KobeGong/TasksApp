package defpackage;

/* renamed from: deq reason: default package */
/* compiled from: PG */
public final class deq extends defpackage.dih implements defpackage.djq {
    public static final defpackage.deq e = new defpackage.deq();
    private static volatile defpackage.djx f;
    public int a;
    public java.lang.String b = "";
    public defpackage.diq c = defpackage.dka.b;
    public defpackage.dfh d;

    private deq() {
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
                java.lang.Object[] objArr = {"a", "b", "c", defpackage.dez.class, "d"};
                return new defpackage.dkb(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\b\u0000\u0002\u001b\u0004\t\u0002", objArr);
            case 3:
                return new defpackage.deq();
            case 4:
                return new defpackage.dii((boolean[][][][][][][][][][][][][][][][][]) null);
            case 5:
                return e;
            case 6:
                defpackage.djx djx2 = f;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.deq.class) {
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
        defpackage.deq deq = e;
        defpackage.dih.t.put(defpackage.deq.class, deq);
    }
}
