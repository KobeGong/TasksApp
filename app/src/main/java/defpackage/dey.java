package defpackage;

/* renamed from: dey  reason: default package */
/* compiled from: PG */
public enum dey implements din {
    NOTIFY_PREFERENCE_UNKNOWN(0),
    NOTIFY(1),
    DROP(2);
    
    public static final dio d = new dku();
    public final int e;

    @Override // defpackage.din
    public final int a() {
        return this.e;
    }

    public static dey a(int i) {
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
}
