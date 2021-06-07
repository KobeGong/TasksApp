package defpackage;

/* renamed from: daw  reason: default package */
/* compiled from: PG */
public final class daw extends dih implements djq {
    public static final daw h = new daw();
    private static volatile djx i;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public int e;
    public String f = "";
    public djj g = djj.b;

    private daw() {
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dih
    public final Object a(int i2) {
        djx djx;
        switch (i2 - 1) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new dkb(h, "\u0000\u0006\u0000\u0001\u0001\b\u0006\u0001\u0000\u0000\u0001Ȉ\u0004Ȉ\u0005Ȉ\u0006\u0004\u0007Ȉ\b2", new Object[]{"a", "b", "c", "d", "e", "f", "g", dax.a});
            case 3:
                return new daw();
            case 4:
                return new dii((int[][][][][]) null);
            case 5:
                return h;
            case 6:
                djx djx2 = i;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (daw.class) {
                    djx = i;
                    if (djx == null) {
                        djx = new dgr(h);
                        i = djx;
                    }
                }
                return djx;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        dih.t.put(daw.class, h);
    }
}
