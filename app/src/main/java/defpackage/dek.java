package defpackage;

/* renamed from: dek  reason: default package */
/* compiled from: PG */
public final class dek extends dih implements djq {
    public static final dek e = new dek();
    private static volatile djx f;
    public int a;
    public diq b = dka.b;
    public long c;
    public long d;

    private dek() {
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
                return new dkb(e, "\u0001\u0003\u0000\u0001\u0004\u0007\u0003\u0000\u0001\u0000\u0004\u0002\u0000\u0005\u0002\u0001\u0007\u001b", new Object[]{"a", "c", "d", "b", dfy.class});
            case 3:
                return new dek();
            case 4:
                return new dii((float[][][][][][][][][][][][][][][][]) null);
            case 5:
                return e;
            case 6:
                djx djx2 = f;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (dek.class) {
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
        dih.t.put(dek.class, e);
    }
}
