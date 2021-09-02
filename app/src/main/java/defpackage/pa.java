package defpackage;

/* renamed from: pa reason: default package */
/* compiled from: PG */
public final class pa extends defpackage.oz {
    /* access modifiers changed from: protected */
    public final android.graphics.Typeface a(java.lang.Object obj) {
        try {
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance(this.a, 1);
            java.lang.reflect.Array.set(newInstance, 0, obj);
            return (android.graphics.Typeface) this.b.invoke(null, new java.lang.Object[]{newInstance, "sans-serif", java.lang.Integer.valueOf(-1), java.lang.Integer.valueOf(-1)});
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    public final java.lang.reflect.Method a(java.lang.Class cls) {
        java.lang.reflect.Method declaredMethod = android.graphics.Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new java.lang.Class[]{java.lang.reflect.Array.newInstance(cls, 1).getClass(), java.lang.String.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
