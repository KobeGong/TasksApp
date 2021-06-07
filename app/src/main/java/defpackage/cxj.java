package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* renamed from: cxj  reason: default package */
/* compiled from: PG */
final class cxj extends cxa {
    public static final Unsafe a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;

    cxj() {
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cxa
    public final void a(cxl cxl, Thread thread) {
        a.putObject(cxl, e, thread);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cxa
    public final void a(cxl cxl, cxl cxl2) {
        a.putObject(cxl, f, cxl2);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cxa
    public final boolean a(cwz cwz, cxl cxl, cxl cxl2) {
        return a.compareAndSwapObject(cwz, c, cxl, cxl2);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cxa
    public final boolean a(cwz cwz, cxe cxe, cxe cxe2) {
        return a.compareAndSwapObject(cwz, b, cxe, cxe2);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cxa
    public final boolean a(cwz cwz, Object obj, Object obj2) {
        return a.compareAndSwapObject(cwz, d, obj, obj2);
    }

    static {
        Unsafe unsafe;
        try {
            unsafe = Unsafe.getUnsafe();
        } catch (SecurityException e2) {
            try {
                unsafe = (Unsafe) AccessController.doPrivileged(new cxk());
            } catch (PrivilegedActionException e3) {
                throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
            }
        }
        try {
            c = unsafe.objectFieldOffset(cwz.class.getDeclaredField("waiters"));
            b = unsafe.objectFieldOffset(cwz.class.getDeclaredField("listeners"));
            d = unsafe.objectFieldOffset(cwz.class.getDeclaredField("value"));
            e = unsafe.objectFieldOffset(cxl.class.getDeclaredField("thread"));
            f = unsafe.objectFieldOffset(cxl.class.getDeclaredField("next"));
            a = unsafe;
        } catch (Exception e4) {
            cse.a(e4);
            throw new RuntimeException(e4);
        }
    }
}
