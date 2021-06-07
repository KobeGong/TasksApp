package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
/* renamed from: cwd  reason: default package */
/* compiled from: PG */
public final class cwd {
    private final Object a;
    private final Method b;
    private final Method c;

    public static cwd a() {
        try {
            Object invoke = Class.forName("sun.misc.SharedSecrets").getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
            Method method = Class.forName("sun.misc.JavaLangAccess").getMethod("getStackTraceElement", Throwable.class, Integer.TYPE);
            Method method2 = Class.forName("sun.misc.JavaLangAccess").getMethod("getStackTraceDepth", Throwable.class);
            method.invoke(invoke, new Throwable(), 0);
            ((Integer) method2.invoke(invoke, new Throwable())).intValue();
            return new cwd(invoke, method, method2);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable th) {
            return null;
        }
    }

    private cwd(Object obj, Method method, Method method2) {
        this.a = obj;
        this.b = method;
        this.c = method2;
    }

    public final StackTraceElement a(Throwable th, int i) {
        try {
            return (StackTraceElement) this.b.invoke(this.a, th, Integer.valueOf(i));
        } catch (InvocationTargetException e) {
            if (e.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e.getCause());
            } else if (e.getCause() instanceof Error) {
                throw ((Error) e.getCause());
            } else {
                throw new RuntimeException(e.getCause());
            }
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }

    public final int a(Throwable th) {
        try {
            return ((Integer) this.c.invoke(this.a, th)).intValue();
        } catch (InvocationTargetException e) {
            if (e.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e.getCause());
            } else if (e.getCause() instanceof Error) {
                throw ((Error) e.getCause());
            } else {
                throw new RuntimeException(e.getCause());
            }
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }
}
