package defpackage;

/* renamed from: cwq  reason: default package */
/* compiled from: PG */
public enum cwq implements din {
    UNASSIGNED_DIRECTIONAL_MOVEMENT_ID(0),
    LEFT(1),
    RIGHT(2),
    UP(3),
    DOWN(4);
    
    public static final dio a = new cto();
    private final int g;

    @Override // defpackage.din
    public final int a() {
        return this.g;
    }

    public static cwq a(int i) {
        switch (i) {
            case 0:
                return UNASSIGNED_DIRECTIONAL_MOVEMENT_ID;
            case 1:
                return LEFT;
            case 2:
                return RIGHT;
            case 3:
                return UP;
            case 4:
                return DOWN;
            default:
                return null;
        }
    }

    private cwq(int i) {
        this.g = i;
    }
}
