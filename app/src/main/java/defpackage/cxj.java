package defpackage;

/* renamed from: cxj reason: default package */
/* compiled from: PG */
final class cxj extends defpackage.cxa {
    public static final sun.misc.Unsafe a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;

    cxj() {
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.cxl cxl, java.lang.Thread thread) {
        a.putObject(cxl, e, thread);
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.cxl cxl, defpackage.cxl cxl2) {
        a.putObject(cxl, f, cxl2);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(defpackage.cwz cwz, defpackage.cxl cxl, defpackage.cxl cxl2) {
        return a.compareAndSwapObject(cwz, c, cxl, cxl2);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(defpackage.cwz cwz, defpackage.cxe cxe, defpackage.cxe cxe2) {
        return a.compareAndSwapObject(cwz, b, cxe, cxe2);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(defpackage.cwz cwz, java.lang.Object obj, java.lang.Object obj2) {
        return a.compareAndSwapObject(cwz, d, obj, obj2);
    }

    static {
        sun.misc.Unsafe unsafe;
        try {
            unsafe = sun.misc.Unsafe.getUnsafe();
        } catch (java.lang.SecurityException e2) {
            try {
                unsafe = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new defpackage.cxk());
            } catch (java.security.PrivilegedActionException e3) {
                throw new java.lang.RuntimeException("Could not initialize intrinsics", e3.getCause());
            }
        }
        java.lang.Class<defpackage.cwz> cls = defpackage.cwz.class;
        try {
            c = unsafe.objectFieldOffset(cls.getDeclaredField("waiters"));
            b = unsafe.objectFieldOffset(cls.getDeclaredField("taskNode"));
            d = unsafe.objectFieldOffset(cls.getDeclaredField("value"));
            e = unsafe.objectFieldOffset(defpackage.cxl.class.getDeclaredField("thread"));
            f = unsafe.objectFieldOffset(defpackage.cxl.class.getDeclaredField("next"));
            a = unsafe;
        } catch (java.lang.Exception e4) {
            defpackage.cse.a(e4);
            throw new java.lang.RuntimeException(e4);
        }
    }
}
