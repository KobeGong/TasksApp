package defpackage;

/* renamed from: deh  reason: default package */
/* compiled from: PG */
public final class deh extends dih implements djq {
    public static final deh e = new deh();
    private static volatile djx f;
    public int a;
    public String b = "";
    public diq c = dka.b;
    public diq d = dka.b;

    private deh() {
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
                return new dkb(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\b\u0000\u0002\u001a\u0003\u001b", new Object[]{"a", "b", "c", "d", dfh.class});
            case 3:
                return new deh();
            case 4:
                return new dii((short[][][][][][][][][][][][][][][][]) null);
            case 5:
                return e;
            case 6:
                djx djx2 = f;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (deh.class) {
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
        dih.t.put(deh.class, e);
    }
}
