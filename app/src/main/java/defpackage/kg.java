package defpackage;

/* renamed from: kg reason: default package */
/* compiled from: PG */
class kg extends defpackage.kf {
    private static java.lang.reflect.Method a;
    private static boolean b;
    private static java.lang.reflect.Method c;
    private static boolean d;

    kg() {
    }

    public final void a(android.view.View view, android.graphics.Matrix matrix) {
        if (!b) {
            try {
                java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("transformMatrixToGlobal", new java.lang.Class[]{android.graphics.Matrix.class});
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (java.lang.NoSuchMethodException e) {
            }
            b = true;
        }
        if (a != null) {
            try {
                a.invoke(view, new java.lang.Object[]{matrix});
            } catch (java.lang.IllegalAccessException e2) {
            } catch (java.lang.reflect.InvocationTargetException e3) {
                throw new java.lang.RuntimeException(e3.getCause());
            }
        }
    }

    public final void b(android.view.View view, android.graphics.Matrix matrix) {
        if (!d) {
            try {
                java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("transformMatrixToLocal", new java.lang.Class[]{android.graphics.Matrix.class});
                c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (java.lang.NoSuchMethodException e) {
            }
            d = true;
        }
        if (c != null) {
            try {
                c.invoke(view, new java.lang.Object[]{matrix});
            } catch (java.lang.IllegalAccessException e2) {
            } catch (java.lang.reflect.InvocationTargetException e3) {
                throw new java.lang.RuntimeException(e3.getCause());
            }
        }
    }
}
