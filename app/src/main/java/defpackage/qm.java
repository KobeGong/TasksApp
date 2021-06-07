package defpackage;

/* renamed from: qm  reason: default package */
/* compiled from: PG */
public final class qm {
    public static final ql a = new ql(null, false);
    public static final ql b = new ql(null, true);
    public static final ql c = new ql(qo.a, false);
    public static final ql d = new ql(qo.a, true);

    static int a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
            case 2:
                return 0;
            default:
                return 2;
        }
    }

    static int b(int i) {
        switch (i) {
            case 0:
            case 14:
            case 15:
                return 1;
            case 1:
            case 2:
            case 16:
            case 17:
                return 0;
            default:
                return 2;
        }
    }

    static {
        new ql(qn.a, false);
    }
}
