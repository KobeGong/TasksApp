package defpackage;

/* renamed from: ddl  reason: default package */
/* compiled from: PG */
public final class ddl extends dih implements djq {
    public static final ddl l = new ddl();
    private static volatile djx m;
    public int a;
    public float b;
    public int c;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public int i;
    public String j = "";
    public diq k = dka.b;

    private ddl() {
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
                return new dkb(l, "\u0001\n\u0000\u0001\u0002\f\n\u0000\u0001\u0000\u0002\u0001\u0000\u0003\f\u0001\u0004\b\u0002\u0005\b\u0003\u0006\b\u0004\u0007\b\u0005\b\b\u0006\t\u0004\u0007\n\b\b\f\u001b", new Object[]{"a", "b", "c", dcr.b, "d", "e", "f", "g", "h", "i", "j", "k", ddm.class});
            case 3:
                return new ddl();
            case 4:
                return new dii((int[][][][][][][][][][][][][]) null);
            case 5:
                return l;
            case 6:
                djx djx2 = m;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (ddl.class) {
                    djx = m;
                    if (djx == null) {
                        djx = new dgr(l);
                        m = djx;
                    }
                }
                return djx;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        dih.t.put(ddl.class, l);
    }
}
