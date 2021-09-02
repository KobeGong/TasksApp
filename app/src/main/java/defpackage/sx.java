package defpackage;

/* renamed from: sx reason: default package */
/* compiled from: PG */
public final class sx {
    private static java.lang.reflect.Method a;

    public static float a(android.view.ViewConfiguration viewConfiguration, android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }
        return c(viewConfiguration, context);
    }

    public static float b(android.view.ViewConfiguration viewConfiguration, android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
        return c(viewConfiguration, context);
    }

    private static float c(android.view.ViewConfiguration viewConfiguration, android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 25 && a != null) {
            try {
                return (float) ((java.lang.Integer) a.invoke(viewConfiguration, new java.lang.Object[0])).intValue();
            } catch (java.lang.Exception e) {
            }
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    public static int a(android.view.ViewConfiguration viewConfiguration) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return viewConfiguration.getScaledHoverSlop();
        }
        return viewConfiguration.getScaledTouchSlop() / 2;
    }

    static {
        if (android.os.Build.VERSION.SDK_INT == 25) {
            try {
                a = android.view.ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new java.lang.Class[0]);
            } catch (java.lang.Exception e) {
            }
        }
    }
}
