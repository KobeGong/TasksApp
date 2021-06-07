package defpackage;

/* renamed from: cwt  reason: default package */
/* compiled from: PG */
public enum cwt implements din {
    UNSPECIFIED(0),
    ANDROID(1);
    
    public static final dio b = new cwu();
    public final int c;

    @Override // defpackage.din
    public final int a() {
        return this.c;
    }

    public static cwt a(int i) {
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
}
