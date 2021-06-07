package defpackage;

/* renamed from: dcr  reason: default package */
/* compiled from: PG */
public enum dcr implements din {
    SDK_TYPE_UNSPECIFIED(0),
    CUSTOM(1),
    GUNS(2),
    CHIME(3);
    
    public static final dio b = new dcs();
    public final int c;

    @Override // defpackage.din
    public final int a() {
        return this.c;
    }

    public static dcr a(int i) {
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
}
