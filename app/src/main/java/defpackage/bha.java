package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: bha  reason: default package */
/* compiled from: PG */
public final class bha {
    private static SharedPreferences a = null;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            if (a == null) {
                a = (SharedPreferences) bjr.a(new bhb(context));
            }
            sharedPreferences = a;
        }
        return sharedPreferences;
    }
}
