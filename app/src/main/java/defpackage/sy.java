package defpackage;

/* renamed from: sy reason: default package */
/* compiled from: PG */
public final class sy {
    public static final defpackage.ta a;

    static {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            a = new defpackage.sz();
        } else if (android.os.Build.VERSION.SDK_INT >= 18) {
            a = new defpackage.ta(0);
        } else {
            a = new defpackage.ta();
        }
    }
}
