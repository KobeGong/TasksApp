package defpackage;

/* renamed from: dey reason: default package */
/* compiled from: PG */
public enum dey implements defpackage.din {
    NOTIFY_PREFERENCE_UNKNOWN(0),
    NOTIFY(1),
    DROP(2);
    
    public static final defpackage.dio d = null;
    public final int e;

    public final int a() {
        return this.e;
    }

    public static defpackage.dey a(int i) {
        switch (i) {
            case 0:
                return NOTIFY_PREFERENCE_UNKNOWN;
            case 1:
                return NOTIFY;
            case 2:
                return DROP;
            default:
                return null;
        }
    }

    private dey(int i) {
        this.e = i;
    }

    static {
        d = new defpackage.dku();
    }
}
