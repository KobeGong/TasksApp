package defpackage;

/* renamed from: def  reason: default package */
/* compiled from: PG */
public final class def extends dih implements djq {
    public static final def e = new def();
    private static volatile djx f;
    public int a;
    public String b = "";
    public diq c = dka.b;
    public diq d = dka.b;

    private def() {
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
                return new def();
            case 4:
                return new dii((byte[][][][][][][][][][][][][][][][]) null);
            case 5:
                return e;
            case 6:
                djx djx2 = f;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (def.class) {
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
        dih.t.put(def.class, e);
    }
}
