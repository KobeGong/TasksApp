package defpackage;

/* renamed from: dgj  reason: default package */
/* compiled from: PG */
public enum dgj implements din {
    SYSTEM_TRAY_BEHAVIOR_UNSPECIFIED(0),
    SHOW_IN_SYSTEM_TRAY(1),
    REMOVE_FROM_SYSTEM_TRAY(2);
    
    public static final dio c = new dgk();
    public final int d;

    @Override // defpackage.din
    public final int a() {
        return this.d;
    }

    public static dgj a(int i) {
        switch (i) {
            case 0:
                return SYSTEM_TRAY_BEHAVIOR_UNSPECIFIED;
            case 1:
                return SHOW_IN_SYSTEM_TRAY;
            case 2:
                return REMOVE_FROM_SYSTEM_TRAY;
            default:
                return null;
        }
    }

    private dgj(int i) {
        this.d = i;
    }
}
