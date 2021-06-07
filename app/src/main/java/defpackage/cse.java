package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: cse  reason: default package */
/* compiled from: PG */
public final class cse {
    private static final Object a;

    public static void a(Throwable th) {
        cld.a((Object) th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    @Deprecated
    public static RuntimeException b(Throwable th) {
        a(th);
        throw new RuntimeException(th);
    }

    public static String c(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        cza.a(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private static Object a() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable th) {
            return null;
        }
    }

    private static Method b() {
        try {
            Method a2 = a("getStackTraceDepth", Throwable.class);
            if (a2 == null) {
                return null;
            }
            a2.invoke(a(), new Throwable());
            return a2;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException e) {
            return null;
        }
    }

    private static Method a(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable th) {
            return null;
        }
    }

    static {
        Object a2 = a();
        a = a2;
        if (a2 != null) {
            a("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (a != null) {
            b();
        }
    }
}
