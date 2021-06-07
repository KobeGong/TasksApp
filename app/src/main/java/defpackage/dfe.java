package defpackage;

/* renamed from: dfe  reason: default package */
/* compiled from: PG */
public final class dfe extends dih implements djq {
    public static final dfe m = new dfe();
    private static volatile djx n;
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
    public String k = "";
    public diq l = dka.b;

    private dfe() {
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
                return new dkb(m, "\u0001\u000b\u0000\u0001\u0002\f\u000b\u0000\u0001\u0000\u0002\u0001\u0000\u0003\b\u0003\u0004\b\u0004\u0005\b\u0005\u0006\b\u0006\u0007\u0004\u0007\b\b\b\t\f\u0001\n\b\u0002\u000b\b\t\f\u001b", new Object[]{"a", "b", "e", "f", "g", "h", "i", "j", "c", dfg.b, "d", "k", "l", dff.class});
            case 3:
                return new dfe();
            case 4:
                return new dii((float[][][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return m;
            case 6:
                djx djx2 = n;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (dfe.class) {
                    djx = n;
                    if (djx == null) {
                        djx = new dgr(m);
                        n = djx;
                    }
                }
                return djx;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        dih.t.put(dfe.class, m);
    }
}
