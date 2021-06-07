package defpackage;

/* renamed from: czz  reason: default package */
/* compiled from: PG */
public enum czz implements din {
    UNKNOWN(0),
    DASHER_ADMIN_DISABLED(1),
    SUSPENDED(2),
    NOT_AUTHORIZED(3);
    
    public static final dio b = new daa();
    private final int f;

    @Override // defpackage.din
    public final int a() {
        return this.f;
    }

    public static czz a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return DASHER_ADMIN_DISABLED;
            case 2:
                return SUSPENDED;
            case 3:
                return NOT_AUTHORIZED;
            default:
                return null;
        }
    }

    private czz(int i) {
        this.f = i;
    }
}
