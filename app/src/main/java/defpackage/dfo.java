package defpackage;

/* renamed from: dfo  reason: default package */
/* compiled from: PG */
public enum dfo implements din {
    PRIORITY_DEFAULT(0),
    PRIORITY_HIGH(1),
    PRIORITY_LOW(2),
    PRIORITY_MAX(3),
    PRIORITY_MIN(4);
    
    public static final dio b = new dfp();
    private final int g;

    @Override // defpackage.din
    public final int a() {
        return this.g;
    }

    public static dfo a(int i) {
        switch (i) {
            case 0:
                return PRIORITY_DEFAULT;
            case 1:
                return PRIORITY_HIGH;
            case 2:
                return PRIORITY_LOW;
            case 3:
                return PRIORITY_MAX;
            case 4:
                return PRIORITY_MIN;
            default:
                return null;
        }
    }

    private dfo(int i) {
        this.g = i;
    }
}
