package defpackage;

/* renamed from: dfu reason: default package */
/* compiled from: PG */
public enum dfu implements defpackage.din {
    COUNT_BEHAVIOR_UNSPECIFIED(0),
    INCLUDE_IN_COUNTS(1),
    EXCLUDE_FROM_COUNTS(2);
    
    public static final defpackage.dio c = null;
    public final int d;

    public final int a() {
        return this.d;
    }

    public static defpackage.dfu a(int i) {
        switch (i) {
            case 0:
                return COUNT_BEHAVIOR_UNSPECIFIED;
            case 1:
                return INCLUDE_IN_COUNTS;
            case 2:
                return EXCLUDE_FROM_COUNTS;
            default:
                return null;
        }
    }

    private dfu(int i) {
        this.d = i;
    }

    static {
        c = new defpackage.dfv();
    }
}
