package defpackage;

/* renamed from: qk reason: default package */
/* compiled from: PG */
public final class qk {
    private static java.lang.reflect.Method a;
    private static java.lang.reflect.Method b;

    public static java.lang.String a(java.util.Locale locale) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            try {
                return ((java.util.Locale) b.invoke(null, new java.lang.Object[]{locale})).getScript();
            } catch (java.lang.reflect.InvocationTargetException e) {
                android.util.Log.w("ICUCompat", e);
            } catch (java.lang.IllegalAccessException e2) {
                android.util.Log.w("ICUCompat", e2);
            }
        } else {
            java.lang.String b2 = b(locale);
            if (b2 != null) {
                return a(b2);
            }
            return null;
        }
        return locale.getScript();
    }

    private static java.lang.String a(java.lang.String str) {
        try {
            if (a != null) {
                return (java.lang.String) a.invoke(null, new java.lang.Object[]{str});
            }
        } catch (java.lang.IllegalAccessException e) {
            android.util.Log.w("ICUCompat", e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            android.util.Log.w("ICUCompat", e2);
        }
        return null;
    }

    private static java.lang.String b(java.util.Locale locale) {
        java.lang.String locale2 = locale.toString();
        try {
            if (b != null) {
                return (java.lang.String) b.invoke(null, new java.lang.Object[]{locale2});
            }
        } catch (java.lang.IllegalAccessException e) {
            android.util.Log.w("ICUCompat", e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            android.util.Log.w("ICUCompat", e2);
        }
        return locale2;
    }

    static {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            try {
                b = java.lang.Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new java.lang.Class[]{java.util.Locale.class});
            } catch (java.lang.Exception e) {
                throw new java.lang.IllegalStateException(e);
            }
        } else {
            try {
                java.lang.Class cls = java.lang.Class.forName("libcore.icu.ICU");
                if (cls != null) {
                    a = cls.getMethod("getScript", new java.lang.Class[]{java.lang.String.class});
                    b = cls.getMethod("addLikelySubtags", new java.lang.Class[]{java.lang.String.class});
                }
            } catch (java.lang.Exception e2) {
                a = null;
                b = null;
                android.util.Log.w("ICUCompat", e2);
            }
        }
    }
}
