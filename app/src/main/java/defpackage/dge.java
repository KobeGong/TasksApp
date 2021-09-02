package defpackage;

/* renamed from: dge reason: default package */
/* compiled from: PG */
public enum dge implements defpackage.din {
    READ_STATE_UNKNOWN(0),
    NEW(1),
    SEEN(2),
    DISMISSED(3),
    READ(4);
    
    public static final defpackage.dio c = null;
    public final int d;

    public final int a() {
        return this.d;
    }

    public static defpackage.dge a(int i) {
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

    static {
        c = new defpackage.dgf();
    }
}
