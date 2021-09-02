package defpackage;

/* renamed from: cub reason: default package */
/* compiled from: PG */
public class cub implements defpackage.cua {
    public cub() {
    }

    public final defpackage.cua a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (this != null) {
            return this;
        }
        throw null;
    }

    public final defpackage.cua a(java.lang.Throwable th) {
        if (this != null) {
            return this;
        }
        throw null;
    }

    public final void a(java.lang.String str) {
    }

    private cub(byte b) {
        this();
    }

    cub(char c) {
        this(0);
    }

    public static defpackage.cut a() {
        try {
            return (defpackage.cut) defpackage.cvk.class.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoClassDefFoundError | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
            try {
                return (defpackage.cut) com.google.common.flogger.backend.google.GooglePlatform.class.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoClassDefFoundError | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e2) {
                try {
                    return (defpackage.cut) com.google.common.flogger.backend.system.DefaultPlatform.class.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoClassDefFoundError | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e3) {
                    return null;
                }
            }
        }
    }

    public static java.lang.Object a(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException(java.lang.String.valueOf(str).concat(" must not be null"));
    }

    public static boolean a(char c) {
        return ('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z');
    }

    public static void a(boolean z) {
        if (!z) {
            throw new java.lang.ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static int a(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static int a(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    public static java.util.concurrent.Executor a(java.util.concurrent.Executor executor) {
        return new defpackage.cyr(executor);
    }

    public static defpackage.cyl a(java.util.concurrent.ExecutorService executorService) {
        if (executorService instanceof defpackage.cyl) {
            return (defpackage.cyl) executorService;
        }
        if (executorService instanceof java.util.concurrent.ScheduledExecutorService) {
            return new defpackage.cyo((java.util.concurrent.ScheduledExecutorService) executorService);
        }
        return new defpackage.cxm(executorService);
    }

    public static java.util.concurrent.ThreadFactory b() {
        if (!c()) {
            return java.util.concurrent.Executors.defaultThreadFactory();
        }
        try {
            return (java.util.concurrent.ThreadFactory) java.lang.Class.forName("com.google.appengine.api.ThreadManager").getMethod("currentRequestThreadFactory", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException e) {
            throw new java.lang.RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            throw defpackage.cse.b(e2.getCause());
        }
    }

    private static boolean c() {
        if (java.lang.System.getProperty("com.google.appengine.runtime.environment") == null) {
            return false;
        }
        try {
            if (java.lang.Class.forName("com.google.apphosting.api.ApiProxy").getMethod("getCurrentEnvironment", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]) != null) {
                return true;
            }
            return false;
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
            return false;
        }
    }

    public static java.lang.Object a(java.util.concurrent.Future future) {
        java.lang.Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (java.lang.InterruptedException e) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
        return obj;
    }
}
