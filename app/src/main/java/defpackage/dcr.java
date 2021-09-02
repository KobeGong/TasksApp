package defpackage;

/* renamed from: dcr reason: default package */
/* compiled from: PG */
public enum dcr implements defpackage.din {
    SDK_TYPE_UNSPECIFIED(0),
    CUSTOM(1),
    GUNS(2),
    CHIME(3);
    
    public static final defpackage.dio b = null;
    public final int c;

    public final int a() {
        return this.c;
    }

    public static defpackage.dcr a(int i) {
        switch (i) {
            case 0:
                return SDK_TYPE_UNSPECIFIED;
            case 1:
                return CUSTOM;
            case 2:
                return GUNS;
            case 3:
                return CHIME;
            default:
                return null;
        }
    }

    private dcr(int i) {
        this.c = i;
    }

    static {
        b = new defpackage.dcs();
    }
}
