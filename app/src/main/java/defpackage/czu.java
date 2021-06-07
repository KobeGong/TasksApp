package defpackage;

/* renamed from: czu  reason: default package */
/* compiled from: PG */
public final class czu extends dih implements djq {
    public static final czu f = new czu();
    private static volatile djx g;
    public crb a;
    public dca b;
    public String c = "";
    public String d = "";
    public int e;

    private czu() {
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
                return new dkb(f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002\t\u0003Ȉ\u0004Ȉ\u0005\u0004", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new czu();
            case 4:
                return new dii((int[]) null);
            case 5:
                return f;
            case 6:
                djx djx2 = g;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (czu.class) {
                    djx = g;
                    if (djx == null) {
                        djx = new dgr(f);
                        g = djx;
                    }
                }
                return djx;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        dih.t.put(czu.class, f);
    }
}
