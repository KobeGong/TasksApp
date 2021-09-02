package defpackage;

/* renamed from: dlc reason: default package */
/* compiled from: PG */
final class dlc {
    public static final defpackage.dlh a;
    public static final boolean b = c();
    public static final boolean c = b();
    public static final long d = ((long) a(byte[].class));
    public static final boolean e;
    private static final java.util.logging.Logger f = java.util.logging.Logger.getLogger(defpackage.dlc.class.getName());
    private static final sun.misc.Unsafe g = a();
    private static final java.lang.Class h = defpackage.dgt.a;
    private static final boolean i = c(java.lang.Long.TYPE);
    private static final boolean j = c(java.lang.Integer.TYPE);
    private static final long k = a(d());

    private dlc() {
    }

    private static int a(java.lang.Class cls) {
        if (c) {
            return a.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int b(java.lang.Class cls) {
        if (c) {
            return a.a.arrayIndexScale(cls);
        }
        return -1;
    }

    static int a(java.lang.Object obj, long j2) {
        return a.e(obj, j2);
    }

    static void a(java.lang.Object obj, long j2, int i2) {
        a.a(obj, j2, i2);
    }

    static long b(java.lang.Object obj, long j2) {
        return a.f(obj, j2);
    }

    static void a(java.lang.Object obj, long j2, long j3) {
        a.a(obj, j2, j3);
    }

    static boolean c(java.lang.Object obj, long j2) {
        return a.b(obj, j2);
    }

    static void a(java.lang.Object obj, long j2, boolean z) {
        a.a(obj, j2, z);
    }

    static float d(java.lang.Object obj, long j2) {
        return a.c(obj, j2);
    }

    static void a(java.lang.Object obj, long j2, float f2) {
        a.a(obj, j2, f2);
    }

    static double e(java.lang.Object obj, long j2) {
        return a.d(obj, j2);
    }

    static void a(java.lang.Object obj, long j2, double d2) {
        a.a(obj, j2, d2);
    }

    static java.lang.Object f(java.lang.Object obj, long j2) {
        return a.a.getObject(obj, j2);
    }

    static void a(java.lang.Object obj, long j2, java.lang.Object obj2) {
        a.a.putObject(obj, j2, obj2);
    }

    static byte a(byte[] bArr, long j2) {
        return a.a((java.lang.Object) bArr, d + j2);
    }

    static void a(byte[] bArr, long j2, byte b2) {
        a.a((java.lang.Object) bArr, d + j2, b2);
    }

    static void a(long j2, byte b2) {
        a.a(j2, b2);
    }

    static long a(java.nio.ByteBuffer byteBuffer) {
        return a.f(byteBuffer, k);
    }

    static sun.misc.Unsafe a() {
        try {
            return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new defpackage.dld());
        } catch (Throwable th) {
            return null;
        }
    }

    private static boolean b() {
        if (g == null) {
            return false;
        }
        try {
            java.lang.Class cls = g.getClass();
            cls.getMethod("objectFieldOffset", new java.lang.Class[]{java.lang.reflect.Field.class});
            cls.getMethod("arrayBaseOffset", new java.lang.Class[]{java.lang.Class.class});
            cls.getMethod("arrayIndexScale", new java.lang.Class[]{java.lang.Class.class});
            cls.getMethod("getInt", new java.lang.Class[]{java.lang.Object.class, java.lang.Long.TYPE});
            cls.getMethod("putInt", new java.lang.Class[]{java.lang.Object.class, java.lang.Long.TYPE, java.lang.Integer.TYPE});
            cls.getMethod("getLong", new java.lang.Class[]{java.lang.Object.class, java.lang.Long.TYPE});
            cls.getMethod("putLong", new java.lang.Class[]{java.lang.Object.class, java.lang.Long.TYPE, java.lang.Long.TYPE});
            cls.getMethod("getObject", new java.lang.Class[]{java.lang.Object.class, java.lang.Long.TYPE});
            cls.getMethod("putObject", new java.lang.Class[]{java.lang.Object.class, java.lang.Long.TYPE, java.lang.Object.class});
            if (defpackage.dgt.a()) {
                return true;
            }
            cls.getMethod("getByte", new java.lang.Class[]{java.lang.Object.class, java.lang.Long.TYPE});
            cls.getMethod("putByte", new java.lang.Class[]{java.lang.Object.class, java.lang.Long.TYPE, java.lang.Byte.TYPE});
            cls.getMethod("getBoolean", new java.lang.Class[]{java.lang.Object.class, java.lang.Long.TYPE});
            cls.getMethod("putBoolean", new java.lang.Class[]{java.lang.Object.class, java.lang.Long.TYPE, java.lang.Boolean.TYPE});
            cls.getMethod("getFloat", new java.lang.Class[]{java.lang.Object.class, java.lang.Long.TYPE});
            cls.getMethod("putFloat", new java.lang.Class[]{java.lang.Object.class, java.lang.Long.TYPE, java.lang.Float.TYPE});
            cls.getMethod("getDouble", new java.lang.Class[]{java.lang.Object.class, java.lang.Long.TYPE});
            cls.getMethod("putDouble", new java.lang.Class[]{java.lang.Object.class, java.lang.Long.TYPE, java.lang.Double.TYPE});
            return true;
        } catch (Throwable th) {
            java.lang.String valueOf = java.lang.String.valueOf(th);
            f.logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 71).append("platform method missing - proto runtime falling back to safer methods: ").append(valueOf).toString());
            return false;
        }
    }

    private static boolean c() {
        if (g == null) {
            return false;
        }
        try {
            java.lang.Class cls = g.getClass();
            cls.getMethod("objectFieldOffset", new java.lang.Class[]{java.lang.reflect.Field.class});
            cls.getMethod("getLong", new java.lang.Class[]{java.lang.Object.class, java.lang.Long.TYPE});
            if (d() == null) {
                return false;
            }
            if (defpackage.dgt.a()) {
                return true;
            }
            cls.getMethod("getByte", new java.lang.Class[]{java.lang.Long.TYPE});
            cls.getMethod("putByte", new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Byte.TYPE});
            cls.getMethod("getInt", new java.lang.Class[]{java.lang.Long.TYPE});
            cls.getMethod("putInt", new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Integer.TYPE});
            cls.getMethod("getLong", new java.lang.Class[]{java.lang.Long.TYPE});
            cls.getMethod("putLong", new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE});
            cls.getMethod("copyMemory", new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE});
            cls.getMethod("copyMemory", new java.lang.Class[]{java.lang.Object.class, java.lang.Long.TYPE, java.lang.Object.class, java.lang.Long.TYPE, java.lang.Long.TYPE});
            return true;
        } catch (Throwable th) {
            java.lang.String valueOf = java.lang.String.valueOf(th);
            f.logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 71).append("platform method missing - proto runtime falling back to safer methods: ").append(valueOf).toString());
            return false;
        }
    }

    private static boolean c(java.lang.Class cls) {
        if (!defpackage.dgt.a()) {
            return false;
        }
        try {
            java.lang.Class cls2 = h;
            cls2.getMethod("peekLong", new java.lang.Class[]{cls, java.lang.Boolean.TYPE});
            cls2.getMethod("pokeLong", new java.lang.Class[]{cls, java.lang.Long.TYPE, java.lang.Boolean.TYPE});
            cls2.getMethod("pokeInt", new java.lang.Class[]{cls, java.lang.Integer.TYPE, java.lang.Boolean.TYPE});
            cls2.getMethod("peekInt", new java.lang.Class[]{cls, java.lang.Boolean.TYPE});
            cls2.getMethod("pokeByte", new java.lang.Class[]{cls, java.lang.Byte.TYPE});
            cls2.getMethod("peekByte", new java.lang.Class[]{cls});
            cls2.getMethod("pokeByteArray", new java.lang.Class[]{cls, byte[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
            cls2.getMethod("peekByteArray", new java.lang.Class[]{cls, byte[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    private static java.lang.reflect.Field d() {
        if (defpackage.dgt.a()) {
            java.lang.reflect.Field a2 = a(java.nio.Buffer.class, "effectiveDirectAddress");
            if (a2 != null) {
                return a2;
            }
        }
        java.lang.reflect.Field a3 = a(java.nio.Buffer.class, "address");
        if (a3 == null || a3.getType() != java.lang.Long.TYPE) {
            return null;
        }
        return a3;
    }

    private static long a(java.lang.reflect.Field field) {
        if (field == null || a == null) {
            return -1;
        }
        return a.a.objectFieldOffset(field);
    }

    private static java.lang.reflect.Field a(java.lang.Class cls, java.lang.String str) {
        try {
            java.lang.reflect.Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable th) {
            return null;
        }
    }

    static byte g(java.lang.Object obj, long j2) {
        return (byte) (a(obj, -4 & j2) >>> ((int) (((-1 ^ j2) & 3) << 3)));
    }

    static byte h(java.lang.Object obj, long j2) {
        return (byte) (a(obj, -4 & j2) >>> ((int) ((3 & j2) << 3)));
    }

    static void a(java.lang.Object obj, long j2, byte b2) {
        int i2 = ((((int) j2) ^ -1) & 3) << 3;
        a(obj, j2 & -4, (a(obj, j2 & -4) & ((255 << i2) ^ -1)) | ((b2 & 255) << i2));
    }

    static void b(java.lang.Object obj, long j2, byte b2) {
        int i2 = (((int) j2) & 3) << 3;
        a(obj, j2 & -4, (a(obj, j2 & -4) & ((255 << i2) ^ -1)) | ((b2 & 255) << i2));
    }

    static boolean i(java.lang.Object obj, long j2) {
        return g(obj, j2) != 0;
    }

    static boolean j(java.lang.Object obj, long j2) {
        return h(obj, j2) != 0;
    }

    static void b(java.lang.Object obj, long j2, boolean z) {
        a(obj, j2, (byte) (z ? 1 : 0));
    }

    static void c(java.lang.Object obj, long j2, boolean z) {
        b(obj, j2, (byte) (z ? 1 : 0));
    }

    static {
        boolean z;
        java.lang.reflect.Field field = null;
        defpackage.dlh dlg = g == null ? null : defpackage.dgt.a() ? i ? new defpackage.dlf(g) : j ? new defpackage.dle(g) : null : new defpackage.dlg(g);
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
        a(java.lang.Object[].class);
        b(java.lang.Object[].class);
        java.lang.reflect.Field a2 = a(java.lang.String.class, "value");
        if (a2 != null && a2.getType() == char[].class) {
            field = a2;
        }
        a(field);
        if (java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        e = z;
    }
}
