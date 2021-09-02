package defpackage;

/* renamed from: ddr reason: default package */
/* compiled from: PG */
public enum ddr implements defpackage.din {
    INTERACTION_TYPE_UNSPECIFIED(0),
    ACTION_CLICK(1),
    CLICKED(2),
    CLICKED_SUPER_THREAD(3),
    CLICKED_UNBUNDLED_SUPER_THREAD(4),
    DISMISSED(5),
    DISMISS_ALL(6),
    DISMISS_APP_ROLLUP(7),
    DISMISSED_SUPER_THREAD(8),
    DISMISSED_AFTER_EXPIRATION(14),
    SHOWN(9),
    SHOWN_WITHOUT_IMAGE(10),
    DELIVERED(11),
    DELIVERED_SYNC_INSTRUCTION(12),
    DELIVERED_FULL_SYNC_INSTRUCTION(13);
    
    public static final defpackage.dio e = null;
    public final int f;

    public final int a() {
        return this.f;
    }

    public static defpackage.ddr a(int i) {
        switch (i) {
            case 0:
                return INTERACTION_TYPE_UNSPECIFIED;
            case 1:
                return ACTION_CLICK;
            case 2:
                return CLICKED;
            case 3:
                return CLICKED_SUPER_THREAD;
            case 4:
                return CLICKED_UNBUNDLED_SUPER_THREAD;
            case 5:
                return DISMISSED;
            case 6:
                return DISMISS_ALL;
            case 7:
                return DISMISS_APP_ROLLUP;
            case 8:
                return DISMISSED_SUPER_THREAD;
            case 9:
                return SHOWN;
            case 10:
                return SHOWN_WITHOUT_IMAGE;
            case 11:
                return DELIVERED;
            case 12:
                return DELIVERED_SYNC_INSTRUCTION;
            case 13:
                return DELIVERED_FULL_SYNC_INSTRUCTION;
            case 14:
                return DISMISSED_AFTER_EXPIRATION;
            default:
                return null;
        }
    }

    private ddr(int i) {
        this.f = i;
    }

    static {
        e = new defpackage.dds();
    }
}
