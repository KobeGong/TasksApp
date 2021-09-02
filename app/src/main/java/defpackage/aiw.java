package defpackage;

/* renamed from: aiw reason: default package */
/* compiled from: PG */
public final class aiw {
    private static defpackage.cyi b;
    public final android.content.SharedPreferences a;

    aiw(android.content.SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public static synchronized defpackage.cyi a(android.content.Context context) {
        defpackage.cyi cyi;
        synchronized (defpackage.aiw.class) {
            if (b == null) {
                defpackage.cyu cyu = new defpackage.cyu();
                com.google.android.apps.tasks.common.TaskApplication.getApplication().a.execute(new defpackage.aix(cyu, context));
                b = cyu;
            }
            cyi = b;
        }
        return cyi;
    }

    public static synchronized defpackage.aiw b(android.content.Context context) {
        defpackage.aiw aiw;
        synchronized (defpackage.aiw.class) {
            aiw = (defpackage.aiw) defpackage.cyd.c(a(context));
        }
        return aiw;
    }

    public final boolean a() {
        return this.a.getBoolean("onboarding_dismissed", false);
    }
}
