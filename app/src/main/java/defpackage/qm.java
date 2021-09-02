package defpackage;

/* renamed from: qm reason: default package */
/* compiled from: PG */
public final class qm {
    public static final defpackage.ql a = new defpackage.ql(null, false);
    public static final defpackage.ql b = new defpackage.ql(null, true);
    public static final defpackage.ql c = new defpackage.ql(defpackage.qo.a, false);
    public static final defpackage.ql d = new defpackage.ql(defpackage.qo.a, true);

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
        new defpackage.ql(defpackage.qn.a, false);
    }
}
