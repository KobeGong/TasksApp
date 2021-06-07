package defpackage;

/* renamed from: btk  reason: default package */
/* compiled from: PG */
public enum btk {
    UNKNOWN_STATUS(0),
    REGISTERED(1),
    PENDING_REGISTRATION(2),
    FAILED_REGISTRATION(3),
    UNREGISTERED(4),
    PENDING_UNREGISTRATION(5),
    FAILED_UNREGISTRATION(6);
    
    public final int g;

    private btk(int i2) {
        this.g = i2;
    }

    public static btk a(int i2) {
        switch (i2) {
            case 1:
                return REGISTERED;
            case 2:
                return PENDING_REGISTRATION;
            case 3:
                return FAILED_REGISTRATION;
            case 4:
                return UNREGISTERED;
            case 5:
                return PENDING_UNREGISTRATION;
            case 6:
                return FAILED_UNREGISTRATION;
            default:
                return UNKNOWN_STATUS;
        }
    }
}
