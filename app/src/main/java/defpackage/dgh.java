package defpackage;

/* renamed from: dgh reason: default package */
/* compiled from: PG */
public enum dgh implements defpackage.din {
    UNKNOWN_INSTRUCTION(0),
    SYNC(1),
    FULL_SYNC(2);
    
    public static final defpackage.dio d = null;
    private final int e;

    public final int a() {
        return this.e;
    }

    public static defpackage.dgh a(int i) {
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

    static {
        d = new defpackage.dgi();
    }
}
