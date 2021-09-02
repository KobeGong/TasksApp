package defpackage;

/* renamed from: dfw reason: default package */
/* compiled from: PG */
public enum dfw implements defpackage.din {
    DELETION_STATUS_UNKNOWN(0),
    ACTIVE(1),
    DELETED(2);
    
    public static final defpackage.dio c = null;
    public final int d;

    public final int a() {
        return this.d;
    }

    public static defpackage.dfw a(int i) {
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

    static {
        c = new defpackage.dfx();
    }
}
