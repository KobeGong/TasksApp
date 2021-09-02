package defpackage;

/* renamed from: ug reason: default package */
/* compiled from: PG */
public final class ug {
    public static final defpackage.uj a;

    static {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            a = new defpackage.ui();
        } else if (android.os.Build.VERSION.SDK_INT >= 21) {
            a = new defpackage.uh();
        } else {
            a = new defpackage.uj();
        }
    }
}
