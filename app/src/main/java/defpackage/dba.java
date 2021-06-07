package defpackage;

/* renamed from: dba  reason: default package */
/* compiled from: PG */
public final class dba extends dih implements djq {
    public static final dba d = new dba();
    private static volatile djx e;
    public int a;
    public diq b = dka.b;
    public String c = "";

    private dba() {
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
                return new dkb(d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", new Object[]{"a", "b", dbp.class, "c"});
            case 3:
                return new dba();
            case 4:
                return new dii((byte[][][][][][]) null);
            case 5:
                return d;
            case 6:
                djx djx2 = e;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (dba.class) {
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
        dih.t.put(dba.class, d);
    }
}
