package defpackage;

/* renamed from: ahr reason: default package */
/* compiled from: PG */
public final class ahr {
    private static java.lang.reflect.Method a;

    public static boolean a(android.view.View view) {
        if (ViewCompat.a.j(view) == 1) {
            return true;
        }
        return false;
    }

    public static void a(android.view.View view, android.graphics.Rect rect, android.graphics.Rect rect2) {
        if (a != null) {
            try {
                a.invoke(view, new java.lang.Object[]{rect, rect2});
            } catch (java.lang.Exception e) {
            }
        }
    }

    public static void b(android.view.View view) {
        try {
            java.lang.reflect.Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new java.lang.Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
        }
    }

    static {
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            try {
                java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("computeFitSystemWindows", new java.lang.Class[]{android.graphics.Rect.class, android.graphics.Rect.class});
                a = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    a.setAccessible(true);
                }
            } catch (java.lang.NoSuchMethodException e) {
            }
        }
    }
}
