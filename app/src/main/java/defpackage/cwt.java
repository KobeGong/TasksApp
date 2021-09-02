package defpackage;

/* renamed from: cwt reason: default package */
/* compiled from: PG */
public enum cwt implements defpackage.din {
    UNSPECIFIED(0),
    ANDROID(1);
    
    public static final defpackage.dio b = null;
    public final int c;

    public final int a() {
        return this.c;
    }

    public static defpackage.cwt a(int i) {
        switch (i) {
            case 0:
                return UNSPECIFIED;
            case 1:
                return ANDROID;
            default:
                return null;
        }
    }

    private cwt(int i) {
        this.c = i;
    }

    static {
        b = new defpackage.cwu();
    }
}
