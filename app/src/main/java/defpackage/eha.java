package defpackage;

/* renamed from: eha reason: default package */
/* compiled from: PG */
public final class eha {
    public static final defpackage.ehd a;

    static {
        if (android.os.Build.VERSION.SDK_INT >= 22) {
            a = new defpackage.ehc();
        } else {
            a = new defpackage.ehb();
        }
    }
}
