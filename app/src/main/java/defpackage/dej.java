package defpackage;

/* renamed from: dej  reason: default package */
/* compiled from: PG */
public final class dej extends dih implements djq {
    public static final dej f = new dej();
    private static volatile djx g;
    public int a;
    public String b = "";
    public dfi c;
    public long d;
    public dfd e;

    private dej() {
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
                return new dkb(f, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0000\u0001\b\u0000\u0005\u0002\u0002\u0007\t\u0001\b\t\u0004", new Object[]{"a", "b", "d", "c", "e"});
            case 3:
                return new dej();
            case 4:
                return new dii((boolean[][][][][][][][][][][][][][][][]) null);
            case 5:
                return f;
            case 6:
                djx djx2 = g;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (dej.class) {
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
        dih.t.put(dej.class, f);
    }
}
