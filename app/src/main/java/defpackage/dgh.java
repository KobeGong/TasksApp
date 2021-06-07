package defpackage;

/* renamed from: dgh  reason: default package */
/* compiled from: PG */
public enum dgh implements din {
    UNKNOWN_INSTRUCTION(0),
    SYNC(1),
    FULL_SYNC(2);
    
    public static final dio d = new dgi();
    private final int e;

    @Override // defpackage.din
    public final int a() {
        return this.e;
    }

    public static dgh a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_INSTRUCTION;
            case 1:
                return SYNC;
            case 2:
                return FULL_SYNC;
            default:
                return null;
        }
    }

    private dgh(int i) {
        this.e = i;
    }
}
