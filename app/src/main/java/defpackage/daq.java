package defpackage;

/* renamed from: daq  reason: default package */
/* compiled from: PG */
public enum daq implements din {
    UNKNOWN(0),
    GMAIL_THREAD(1),
    GMAIL_PERMALINK(2),
    UNRECOGNIZED(-1);
    
    private final int e;

    @Override // defpackage.din
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static daq a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return GMAIL_THREAD;
            case 2:
                return GMAIL_PERMALINK;
            default:
                return null;
        }
    }

    private daq(int i) {
        this.e = i;
    }

    static {
        new dar();
    }
}
