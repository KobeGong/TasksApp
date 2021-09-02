package defpackage;

/* renamed from: jx reason: default package */
/* compiled from: PG */
final class jx extends defpackage.jy {
    private static java.lang.reflect.Method a;
    private static boolean b;

    jx() {
    }

    public final defpackage.ju a(android.view.ViewGroup viewGroup) {
        return new defpackage.jt(viewGroup);
    }

    public final void a(android.view.ViewGroup viewGroup, boolean z) {
        if (!b) {
            try {
                java.lang.reflect.Method declaredMethod = android.view.ViewGroup.class.getDeclaredMethod("suppressLayout", new java.lang.Class[]{java.lang.Boolean.TYPE});
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (java.lang.NoSuchMethodException e) {
            }
            b = true;
        }
        if (a != null) {
            try {
                a.invoke(viewGroup, new java.lang.Object[]{java.lang.Boolean.valueOf(z)});
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e2) {
            }
        }
    }
}
