package defpackage;

/* renamed from: kf reason: default package */
/* compiled from: PG */
class kf extends defpackage.ke {
    private static java.lang.reflect.Method a;
    private static boolean b;
    private static java.lang.reflect.Method c;
    private static boolean d;

    kf() {
    }

    public final void a(android.view.View view, float f) {
        if (!b) {
            try {
                java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("setTransitionAlpha", new java.lang.Class[]{java.lang.Float.TYPE});
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (java.lang.NoSuchMethodException e) {
            }
            b = true;
        }
        if (a != null) {
            try {
                a.invoke(view, new java.lang.Object[]{java.lang.Float.valueOf(f)});
            } catch (java.lang.IllegalAccessException e2) {
            } catch (java.lang.reflect.InvocationTargetException e3) {
                throw new java.lang.RuntimeException(e3.getCause());
            }
        } else {
            view.setAlpha(f);
        }
    }

    public final float b(android.view.View view) {
        if (!d) {
            try {
                java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("getTransitionAlpha", new java.lang.Class[0]);
                c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (java.lang.NoSuchMethodException e) {
            }
            d = true;
        }
        if (c != null) {
            try {
                return ((java.lang.Float) c.invoke(view, new java.lang.Object[0])).floatValue();
            } catch (java.lang.IllegalAccessException e2) {
            } catch (java.lang.reflect.InvocationTargetException e3) {
                throw new java.lang.RuntimeException(e3.getCause());
            }
        }
        return super.b(view);
    }

    public final void c(android.view.View view) {
    }

    public final void d(android.view.View view) {
    }
}
