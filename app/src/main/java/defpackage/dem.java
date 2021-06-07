package defpackage;

/* renamed from: dem  reason: default package */
/* compiled from: PG */
public enum dem implements din {
    RENDERING_BEHAVIOR_UNKNOWN(0),
    RENDER_ALL(1),
    SKIP_RENDERING_READ_STATE_CHANGES(2),
    NONE(3);
    
    public static final dio b = new djw();
    public final int c;

    @Override // defpackage.din
    public final int a() {
        return this.c;
    }

    public static dem a(int i) {
        switch (i) {
            case 0:
                return RENDERING_BEHAVIOR_UNKNOWN;
            case 1:
                return RENDER_ALL;
            case 2:
                return SKIP_RENDERING_READ_STATE_CHANGES;
            case 3:
                return NONE;
            default:
                return null;
        }
    }

    private dem(int i) {
        this.c = i;
    }
}
