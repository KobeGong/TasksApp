package defpackage;

import com.google.common.flogger.backend.google.GooglePlatform;
import com.google.common.flogger.backend.system.DefaultPlatform;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: cub  reason: default package */
/* compiled from: PG */
public class cub implements cua {
    public cub() {
    }

    @Override // defpackage.cua
    public final cua a(String str, String str2, String str3) {
        if (this != null) {
            return this;
        }
        throw null;
    }

    @Override // defpackage.cua
    public final cua a(Throwable th) {
        if (this != null) {
            return this;
        }
        throw null;
    }

    @Override // defpackage.cua
    public final void a(String str) {
    }

    private cub(byte b) {
        this();
    }

    cub(char c) {
        this((byte) 0);
    }

    public static cut a() {
        try {
            return (cut) cvk.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException e) {
            try {
                return (cut) GooglePlatform.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException e2) {
                try {
                    return (cut) DefaultPlatform.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException e3) {
                    return null;
                }
            }
        }
    }

    public static Object a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(str).concat(" must not be null"));
    }

    public static boolean a(char c) {
        return ('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z');
    }

    public static void a(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
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

    public static Executor a(Executor executor) {
        return new cyr(executor);
    }

    public static cyl a(ExecutorService executorService) {
        if (executorService instanceof cyl) {
            return (cyl) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            return new cyo((ScheduledExecutorService) executorService);
        }
        return new cxm(executorService);
    }

    public static ThreadFactory b() {
        if (!c()) {
            return Executors.defaultThreadFactory();
        }
        try {
            return (ThreadFactory) Class.forName("com.google.appengine.api.ThreadManager").getMethod("currentRequestThreadFactory", new Class[0]).invoke(null, new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e);
        } catch (InvocationTargetException e2) {
            throw cse.b(e2.getCause());
        }
    }

    private static boolean c() {
        if (System.getProperty("com.google.appengine.runtime.environment") == null) {
            return false;
        }
        try {
            if (Class.forName("com.google.apphosting.api.ApiProxy").getMethod("getCurrentEnvironment", new Class[0]).invoke(null, new Object[0]) != null) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            return false;
        }
    }

    public static Object a(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException e) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }
}
