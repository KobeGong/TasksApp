package defpackage;

/* renamed from: bha reason: default package */
/* compiled from: PG */
public final class bha {
    private static android.content.SharedPreferences a = null;

    public static android.content.SharedPreferences a(android.content.Context context) {
        android.content.SharedPreferences sharedPreferences;
        synchronized (android.content.SharedPreferences.class) {
            if (a == null) {
                a = (android.content.SharedPreferences) defpackage.bjr.a((java.util.concurrent.Callable) new defpackage.bhb(context));
            }
            sharedPreferences = a;
        }
        return sharedPreferences;
    }
}
