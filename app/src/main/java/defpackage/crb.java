package defpackage;

/* renamed from: crb  reason: default package */
/* compiled from: PG */
public final class crb extends dih implements djq {
    public static final crb e = new crb();
    private static volatile djx f;
    public int a;
    public djj b = djj.b;
    public dip c = dil.b;
    public boolean d;

    private crb() {
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
                return new dkb(e, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0001\u0000\u00012\u0002'\u0003\u0007", new Object[]{"a", "b", crc.a, "c", "d"});
            case 3:
                return new crb();
            case 4:
                return new dii((byte) 0);
            case 5:
                return e;
            case 6:
                djx djx2 = f;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (crb.class) {
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
        dih.t.put(crb.class, e);
    }
}
