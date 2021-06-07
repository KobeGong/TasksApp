package defpackage;

/* renamed from: dmi  reason: default package */
/* compiled from: PG */
public final class dmi extends dih implements djq {
    public static final dmi b = new dmi();
    private static volatile djx c;
    public djj a = djj.b;

    private dmi() {
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
                return new dkb(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", dmj.a});
            case 3:
                return new dmi();
            case 4:
                return new dii((float[][][][][][][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return b;
            case 6:
                djx djx2 = c;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (dmi.class) {
                    djx = c;
                    if (djx == null) {
                        djx = new dgr(b);
                        c = djx;
                    }
                }
                return djx;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        dih.t.put(dmi.class, b);
    }
}
