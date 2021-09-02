package defpackage;

/* renamed from: czn reason: default package */
/* compiled from: PG */
public enum czn implements defpackage.din {
    UNKNOWN(0),
    ANDROID(1),
    IOS(2),
    WEB(3),
    UNRECOGNIZED(-1);
    
    private final int f;

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static defpackage.czn a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return ANDROID;
            case 2:
                return IOS;
            case 3:
                return WEB;
            default:
                return null;
        }
    }

    private czn(int i) {
        this.f = i;
    }

    static {
        new defpackage.czo();
    }
}
