package defpackage;

/* renamed from: dcl  reason: default package */
/* compiled from: PG */
public enum dcl implements din {
    CHANNEL_UNKNOWN(0),
    EMAIL(1),
    APPLE_PUSH(2),
    GCM_DEVICE_PUSH(3),
    GCM_GROUP_PUSH(4),
    SMS(5),
    CUSTOM_ENDPOINT(6),
    WEB_PUSH(7),
    MATCHSTICK(8),
    HTTP_STREAMING(9);
    
    public static final dio b = new dcm();
    public final int c;

    @Override // defpackage.din
    public final int a() {
        return this.c;
    }

    public static dcl a(int i) {
        switch (i) {
            case 0:
                return CHANNEL_UNKNOWN;
            case 1:
                return EMAIL;
            case 2:
                return APPLE_PUSH;
            case 3:
                return GCM_DEVICE_PUSH;
            case 4:
                return GCM_GROUP_PUSH;
            case 5:
                return SMS;
            case 6:
                return CUSTOM_ENDPOINT;
            case 7:
                return WEB_PUSH;
            case 8:
                return MATCHSTICK;
            case 9:
                return HTTP_STREAMING;
            default:
                return null;
        }
    }

    private dcl(int i) {
        this.c = i;
    }
}
