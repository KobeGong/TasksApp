package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* access modifiers changed from: package-private */
/* renamed from: dlc  reason: default package */
/* compiled from: PG */
public final class dlc {
    public static final dlh a;
    public static final boolean b = c();
    public static final boolean c = b();
    public static final long d = ((long) a(byte[].class));
    public static final boolean e;
    private static final Logger f = Logger.getLogger(dlc.class.getName());
    private static final Unsafe g = a();
    private static final Class h = dgt.a;
    private static final boolean i = c(Long.TYPE);
    private static final boolean j = c(Integer.TYPE);
    private static final long k = a(d());

    private dlc() {
    }

    private static int a(Class cls) {
        if (c) {
            return a.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int b(Class cls) {
        if (c) {
            return a.a.arrayIndexScale(cls);
        }
        return -1;
    }

    static int a(Object obj, long j2) {
        return a.e(obj, j2);
    }

    static void a(Object obj, long j2, int i2) {
        a.a(obj, j2, i2);
    }

    static long b(Object obj, long j2) {
        return a.f(obj, j2);
    }

    static void a(Object obj, long j2, long j3) {
        a.a(obj, j2, j3);
    }

    static boolean c(Object obj, long j2) {
        return a.b(obj, j2);
    }

    static void a(Object obj, long j2, boolean z) {
        a.a(obj, j2, z);
    }

    static float d(Object obj, long j2) {
        return a.c(obj, j2);
    }

    static void a(Object obj, long j2, float f2) {
        a.a(obj, j2, f2);
    }

    static double e(Object obj, long j2) {
        return a.d(obj, j2);
    }

    static void a(Object obj, long j2, double d2) {
        a.a(obj, j2, d2);
    }

    static Object f(Object obj, long j2) {
        return a.a.getObject(obj, j2);
    }

    static void a(Object obj, long j2, Object obj2) {
        a.a.putObject(obj, j2, obj2);
    }

    static byte a(byte[] bArr, long j2) {
        return a.a(bArr, d + j2);
    }

    static void a(byte[] bArr, long j2, byte b2) {
        a.a((Object) bArr, d + j2, b2);
    }

    static void a(long j2, byte b2) {
        a.a(j2, b2);
    }

    static long a(ByteBuffer byteBuffer) {
        return a.f(byteBuffer, k);
    }

    static Unsafe a() {
        try {
            return (Unsafe) AccessController.doPrivileged(new dld());
        } catch (Throwable th) {
            return null;
        }
    }

    private static boolean b() {
        if (g == null) {
            return false;
        }
        try {
            Class<?> cls = g.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            cls.getMethod("getInt", Object.class, Long.TYPE);
            cls.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            cls.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
            cls.getMethod("getObject", Object.class, Long.TYPE);
            cls.getMethod("putObject", Object.class, Long.TYPE, Object.class);
            if (dgt.a()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, Long.TYPE);
            cls.getMethod("putByte", Object.class, Long.TYPE, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, Long.TYPE);
            cls.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, Long.TYPE);
            cls.getMethod("putFloat", Object.class, Long.TYPE, Float.TYPE);
            cls.getMethod("getDouble", Object.class, Long.TYPE);
            cls.getMethod("putDouble", Object.class, Long.TYPE, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = f;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", new StringBuilder(String.valueOf(valueOf).length() + 71).append("platform method missing - proto runtime falling back to safer methods: ").append(valueOf).toString());
            return false;
        }
    }

    private static boolean c() {
        if (g == null) {
            return false;
        }
        try {
            Class<?> cls = g.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            if (d() == null) {
                return false;
            }
            if (dgt.a()) {
                return true;
            }
            cls.getMethod("getByte", Long.TYPE);
            cls.getMethod("putByte", Long.TYPE, Byte.TYPE);
            cls.getMethod("getInt", Long.TYPE);
            cls.getMethod("putInt", Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Long.TYPE);
            cls.getMethod("putLong", Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Long.TYPE, Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = f;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", new StringBuilder(String.valueOf(valueOf).length() + 71).append("platform method missing - proto runtime falling back to safer methods: ").append(valueOf).toString());
            return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.lang.Class */
    /* JADX WARN: Multi-variable type inference failed */
    private static boolean c(Class cls) {
        if (!dgt.a()) {
            return false;
        }
        try {
            Class cls2 = h;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    private static Field d() {
        Field a2;
        if (dgt.a() && (a2 = a(Buffer.class, "effectiveDirectAddress")) != null) {
            return a2;
        }
        Field a3 = a(Buffer.class, "address");
        if (a3 == null || a3.getType() != Long.TYPE) {
            return null;
        }
        return a3;
    }

    private static long a(Field field) {
        if (field == null || a == null) {
            return -1;
        }
        return a.a.objectFieldOffset(field);
    }

    private static Field a(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable th) {
            return null;
        }
    }

    static byte g(Object obj, long j2) {
        return (byte) (a(obj, -4 & j2) >>> ((int) (((-1 ^ j2) & 3) << 3)));
    }

    static byte h(Object obj, long j2) {
        return (byte) (a(obj, -4 & j2) >>> ((int) ((3 & j2) << 3)));
    }

    static void a(Object obj, long j2, byte b2) {
        int i2 = ((((int) j2) ^ -1) & 3) << 3;
        a(obj, j2 & -4, (a(obj, j2 & -4) & ((255 << i2) ^ -1)) | ((b2 & 255) << i2));
    }

    static void b(Object obj, long j2, byte b2) {
        int i2 = (((int) j2) & 3) << 3;
        a(obj, j2 & -4, (a(obj, j2 & -4) & ((255 << i2) ^ -1)) | ((b2 & 255) << i2));
    }

    static boolean i(Object obj, long j2) {
        return g(obj, j2) != 0;
    }

    static boolean j(Object obj, long j2) {
        return h(obj, j2) != 0;
    }

    static void b(Object obj, long j2, boolean z) {
        a(obj, j2, (byte) (z ? 1 : 0));
    }

    static void c(Object obj, long j2, boolean z) {
        b(obj, j2, (byte) (z ? 1 : 0));
    }

    static {
        dlh dlg;
        boolean z;
        Field field = null;
        if (g == null) {
            dlg = null;
        } else if (!dgt.a()) {
            dlg = new dlg(g);
        } else if (i) {
            dlg = new dlf(g);
        } else {
            dlg = j ? new dle(g) : null;
        }
        a = dlg;
        a(boolean[].class);
        b(boolean[].class);
        a(int[].class);
        b(int[].class);
        a(long[].class);
        b(long[].class);
        a(float[].class);
        b(float[].class);
        a(double[].class);
        b(double[].class);
        a(Object[].class);
        b(Object[].class);
        Field a2 = a(String.class, "value");
        if (a2 != null && a2.getType() == char[].class) {
            field = a2;
        }
        a(field);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        e = z;
    }
}
