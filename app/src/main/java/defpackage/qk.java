package defpackage;

import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: qk  reason: default package */
/* compiled from: PG */
public final class qk {
    private static Method a;
    private static Method b;

    public static String a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return ((Locale) b.invoke(null, locale)).getScript();
            } catch (InvocationTargetException e) {
                Log.w("ICUCompat", e);
            } catch (IllegalAccessException e2) {
                Log.w("ICUCompat", e2);
            }
        } else {
            String b2 = b(locale);
            if (b2 != null) {
                return a(b2);
            }
            return null;
        }
        return locale.getScript();
    }

    private static String a(String str) {
        try {
            if (a != null) {
                return (String) a.invoke(null, str);
            }
        } catch (IllegalAccessException e) {
            Log.w("ICUCompat", e);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return null;
    }

    private static String b(Locale locale) {
        String locale2 = locale.toString();
        try {
            if (b != null) {
                return (String) b.invoke(null, locale2);
            }
        } catch (IllegalAccessException e) {
            Log.w("ICUCompat", e);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return locale2;
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        } else {
            try {
                Class<?> cls = Class.forName("libcore.icu.ICU");
                if (cls != null) {
                    a = cls.getMethod("getScript", String.class);
                    b = cls.getMethod("addLikelySubtags", String.class);
                }
            } catch (Exception e2) {
                a = null;
                b = null;
                Log.w("ICUCompat", e2);
            }
        }
    }
}
