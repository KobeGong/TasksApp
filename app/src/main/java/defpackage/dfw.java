package defpackage;

/* renamed from: dfw  reason: default package */
/* compiled from: PG */
public enum dfw implements din {
    DELETION_STATUS_UNKNOWN(0),
    ACTIVE(1),
    DELETED(2);
    
    public static final dio c = new dfx();
    public final int d;

    @Override // defpackage.din
    public final int a() {
        return this.d;
    }

    public static dfw a(int i) {
        switch (i) {
            case 0:
                return DELETION_STATUS_UNKNOWN;
            case 1:
                return ACTIVE;
            case 2:
                return DELETED;
            default:
                return null;
        }
    }

    private dfw(int i) {
        this.d = i;
    }
}
