package defpackage;

/* renamed from: dea  reason: default package */
/* compiled from: PG */
public enum dea implements din {
    ENDPOINT_UNKNOWN(0),
    ANDROID(1),
    IOS(2),
    OGB(3),
    IN_APP_TRAY(4),
    WEB_PUSH(5),
    HTTP_STREAMING(6);
    
    public static final dio a = new dgv();
    private final int i;

    @Override // defpackage.din
    public final int a() {
        return this.i;
    }

    public static dea a(int i2) {
        switch (i2) {
            case 0:
                return ENDPOINT_UNKNOWN;
            case 1:
                return ANDROID;
            case 2:
                return IOS;
            case 3:
                return OGB;
            case 4:
                return IN_APP_TRAY;
            case 5:
                return WEB_PUSH;
            case 6:
                return HTTP_STREAMING;
            default:
                return null;
        }
    }

    private dea(int i2) {
        this.i = i2;
    }
}
