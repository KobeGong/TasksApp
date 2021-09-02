package defpackage;

/* renamed from: cse reason: default package */
/* compiled from: PG */
public final class cse {
    private static final java.lang.Object a;

    public static void a(java.lang.Throwable th) {
        defpackage.cld.a((java.lang.Object) th);
        if (th instanceof java.lang.RuntimeException) {
            throw ((java.lang.RuntimeException) th);
        } else if (th instanceof java.lang.Error) {
            throw ((java.lang.Error) th);
        }
    }

    @java.lang.Deprecated
    public static java.lang.RuntimeException b(java.lang.Throwable th) {
        a(th);
        throw new java.lang.RuntimeException(th);
    }

    public static java.lang.String c(java.lang.Throwable th) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        defpackage.cza.a(th, new java.io.PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private static java.lang.Object a() {
        boolean z = false;
        try {
            return java.lang.Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.ThreadDeath e) {
            throw e;
        } catch (Throwable th) {
            return z;
        }
    }

    private static java.lang.reflect.Method b() {
        try {
            java.lang.reflect.Method a2 = a("getStackTraceDepth", java.lang.Throwable.class);
            if (a2 == null) {
                return null;
            }
            a2.invoke(a(), new java.lang.Object[]{new java.lang.Throwable()});
            return a2;
        } catch (java.lang.IllegalAccessException | java.lang.UnsupportedOperationException | java.lang.reflect.InvocationTargetException e) {
            return null;
        }
    }

    private static java.lang.reflect.Method a(java.lang.String str, java.lang.Class... clsArr) {
        boolean z = false;
        try {
            return java.lang.Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (java.lang.ThreadDeath e) {
            throw e;
        } catch (Throwable th) {
            return z;
        }
    }

    static {
        java.lang.Object a2 = a();
        a = a2;
        if (a2 != null) {
            a("getStackTraceElement", java.lang.Throwable.class, java.lang.Integer.TYPE);
        }
        if (a != null) {
            b();
        }
    }
}
