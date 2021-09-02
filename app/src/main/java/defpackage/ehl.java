package defpackage;

/* renamed from: ehl reason: default package */
/* compiled from: PG */
public final class ehl {
    @android.annotation.TargetApi(23)
    public static boolean a() {
        if (android.os.Build.VERSION.SDK_INT < 23) {
            return true;
        }
        return android.security.NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    static {
        new defpackage.ehl();
    }
}
