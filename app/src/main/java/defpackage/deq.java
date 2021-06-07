package defpackage;

/* renamed from: deq  reason: default package */
/* compiled from: PG */
public final class deq extends dih implements djq {
    public static final deq e = new deq();
    private static volatile djx f;
    public int a;
    public String b = "";
    public diq c = dka.b;
    public dfh d;

    private deq() {
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dih
    public final Object a(int i) {
        djx djx;
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new dkb(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\b\u0000\u0002\u001b\u0004\t\u0002", new Object[]{"a", "b", "c", dez.class, "d"});
            case 3:
                return new deq();
            case 4:
                return new dii((boolean[][][][][][][][][][][][][][][][][]) null);
            case 5:
                return e;
            case 6:
                djx djx2 = f;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (deq.class) {
                    djx = f;
                    if (djx == null) {
                        djx = new dgr(e);
                        f = djx;
                    }
                }
                return djx;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        dih.t.put(deq.class, e);
    }
}
