package defpackage;

/* renamed from: czq  reason: default package */
/* compiled from: PG */
public enum czq implements din {
    NONE(0),
    PROMPT(1),
    NAG(2),
    FORCE(3),
    UNRECOGNIZED(-1);
    
    private final int f;

    @Override // defpackage.din
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static czq a(int i) {
        switch (i) {
            case 0:
                return NONE;
            case 1:
                return PROMPT;
            case 2:
                return NAG;
            case 3:
                return FORCE;
            default:
                return null;
        }
    }

    private czq(int i) {
        this.f = i;
    }

    static {
        new czr();
    }
}
