package defpackage;

/* renamed from: dge  reason: default package */
/* compiled from: PG */
public enum dge implements din {
    READ_STATE_UNKNOWN(0),
    NEW(1),
    SEEN(2),
    DISMISSED(3),
    READ(4);
    
    public static final dio c = new dgf();
    public final int d;

    @Override // defpackage.din
    public final int a() {
        return this.d;
    }

    public static dge a(int i) {
        switch (i) {
            case 0:
                return READ_STATE_UNKNOWN;
            case 1:
                return NEW;
            case 2:
                return SEEN;
            case 3:
                return DISMISSED;
            case 4:
                return READ;
            default:
                return null;
        }
    }

    private dge(int i) {
        this.d = i;
    }
}
