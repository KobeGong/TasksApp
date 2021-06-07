package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.tasks.common.TaskApplication;

/* renamed from: aiw  reason: default package */
/* compiled from: PG */
public final class aiw {
    private static cyi b;
    public final SharedPreferences a;

    aiw(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public static synchronized cyi a(Context context) {
        cyi cyi;
        synchronized (aiw.class) {
            if (b == null) {
                cyu cyu = new cyu();
                TaskApplication.b().a.execute(new aix(cyu, context));
                b = cyu;
            }
            cyi = b;
        }
        return cyi;
    }

    public static synchronized aiw b(Context context) {
        aiw aiw;
        synchronized (aiw.class) {
            aiw = (aiw) cyd.c(a(context));
        }
        return aiw;
    }

    public final boolean a() {
        return this.a.getBoolean("onboarding_dismissed", false);
    }
}
