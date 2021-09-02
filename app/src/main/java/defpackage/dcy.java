package defpackage;

/* renamed from: dcy reason: default package */
/* compiled from: PG */
public enum dcy implements defpackage.din {
    UNKNOWN_ENVIRONMENT(0),
    DEV(1),
    AUTOPUSH(2),
    PRODUCTION(3);
    
    public static final defpackage.dio c = null;
    public final int d;

    public final int a() {
        return this.d;
    }

    public static defpackage.dcy a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ENVIRONMENT;
            case 1:
                return DEV;
            case 2:
                return AUTOPUSH;
            case 3:
                return PRODUCTION;
            default:
                return null;
        }
    }

    private dcy(int i) {
        this.d = i;
    }

    static {
        c = new defpackage.dcz();
    }
}
