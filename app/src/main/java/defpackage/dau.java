package defpackage;

/* renamed from: dau  reason: default package */
/* compiled from: PG */
public final class dau extends dih implements djq {
    public static final dau d = new dau();
    private static volatile djx e;
    public crb a;
    public String b = "";
    public boolean c;

    private dau() {
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
                return new dkb(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003\u0007", new Object[]{"a", "b", "c"});
            case 3:
                return new dau();
            case 4:
                return new dii((char[][][][][]) null);
            case 5:
                return d;
            case 6:
                djx djx2 = e;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (dau.class) {
                    djx = e;
                    if (djx == null) {
                        djx = new dgr(d);
                        e = djx;
                    }
                }
                return djx;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        dih.t.put(dau.class, d);
    }
}
