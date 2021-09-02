package defpackage;

/* renamed from: kh reason: default package */
/* compiled from: PG */
final class kh extends defpackage.kg {
    private static java.lang.reflect.Method a;
    private static boolean b;

    kh() {
    }

    public final void a(android.view.View view, int i, int i2, int i3, int i4) {
        if (!b) {
            try {
                java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("setLeftTopRightBottom", new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (java.lang.NoSuchMethodException e) {
            }
            b = true;
        }
        if (a != null) {
            try {
                a.invoke(view, new java.lang.Object[]{java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4)});
            } catch (java.lang.IllegalAccessException e2) {
            } catch (java.lang.reflect.InvocationTargetException e3) {
                throw new java.lang.RuntimeException(e3.getCause());
            }
        }
    }
}
