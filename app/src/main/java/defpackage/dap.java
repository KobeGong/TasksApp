package defpackage;

/* renamed from: dap  reason: default package */
/* compiled from: PG */
public final class dap extends dih implements djq {
    public static final dap b = new dap();
    private static volatile djx c;
    public String a = "";

    private dap() {
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
                return new dkb(b, "\u0000\u0001\u0000\u0000\u0005\u0005\u0001\u0000\u0000\u0000\u0005Ȉ", new Object[]{"a"});
            case 3:
                return new dap();
            case 4:
                return new dii((boolean[][][][]) null);
            case 5:
                return b;
            case 6:
                djx djx2 = c;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (dap.class) {
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
        dih.t.put(dap.class, b);
    }
}
