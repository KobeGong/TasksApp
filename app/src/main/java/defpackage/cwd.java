package defpackage;

/* renamed from: cwd reason: default package */
/* compiled from: PG */
final class cwd {
    private final java.lang.Object a;
    private final java.lang.reflect.Method b;
    private final java.lang.reflect.Method c;

    public static defpackage.cwd a() {
        try {
            java.lang.Object invoke = java.lang.Class.forName("sun.misc.SharedSecrets").getMethod("getJavaLangAccess", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
            java.lang.reflect.Method method = java.lang.Class.forName("sun.misc.JavaLangAccess").getMethod("getStackTraceElement", new java.lang.Class[]{java.lang.Throwable.class, java.lang.Integer.TYPE});
            java.lang.reflect.Method method2 = java.lang.Class.forName("sun.misc.JavaLangAccess").getMethod("getStackTraceDepth", new java.lang.Class[]{java.lang.Throwable.class});
            method.invoke(invoke, new java.lang.Object[]{new java.lang.Throwable(), java.lang.Integer.valueOf(0)});
            ((java.lang.Integer) method2.invoke(invoke, new java.lang.Object[]{new java.lang.Throwable()})).intValue();
            return new defpackage.cwd(invoke, method, method2);
        } catch (java.lang.ThreadDeath e) {
            throw e;
        } catch (Throwable th) {
            return null;
        }
    }

    private cwd(java.lang.Object obj, java.lang.reflect.Method method, java.lang.reflect.Method method2) {
        this.a = obj;
        this.b = method;
        this.c = method2;
    }

    public final java.lang.StackTraceElement a(java.lang.Throwable th, int i) {
        try {
            return (java.lang.StackTraceElement) this.b.invoke(this.a, new java.lang.Object[]{th, java.lang.Integer.valueOf(i)});
        } catch (java.lang.reflect.InvocationTargetException e) {
            if (e.getCause() instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) e.getCause());
            } else if (e.getCause() instanceof java.lang.Error) {
                throw ((java.lang.Error) e.getCause());
            } else {
                throw new java.lang.RuntimeException(e.getCause());
            }
        } catch (java.lang.IllegalAccessException e2) {
            throw new java.lang.AssertionError(e2);
        }
    }

    public final int a(java.lang.Throwable th) {
        try {
            return ((java.lang.Integer) this.c.invoke(this.a, new java.lang.Object[]{th})).intValue();
        } catch (java.lang.reflect.InvocationTargetException e) {
            if (e.getCause() instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) e.getCause());
            } else if (e.getCause() instanceof java.lang.Error) {
                throw ((java.lang.Error) e.getCause());
            } else {
                throw new java.lang.RuntimeException(e.getCause());
            }
        } catch (java.lang.IllegalAccessException e2) {
            throw new java.lang.AssertionError(e2);
        }
    }
}
