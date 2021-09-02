package defpackage;

/* renamed from: bvo reason: default package */
/* compiled from: PG */
public abstract class bvo {
    public static defpackage.bvo c() {
        defpackage.bvp bvp = new defpackage.bvp();
        bvp.a = null;
        return bvp.a(android.os.SystemClock.uptimeMillis()).a();
    }

    /* access modifiers changed from: 0000 */
    public abstract java.lang.Long a();

    /* access modifiers changed from: 0000 */
    public abstract long b();

    public final boolean d() {
        return a() == null;
    }

    public final long e() {
        return java.lang.Math.max(0, ((java.lang.Long) defpackage.cld.a((java.lang.Object) a())).longValue() - (android.os.SystemClock.uptimeMillis() - b()));
    }

    public final defpackage.bvo f() {
        if (d()) {
            return this;
        }
        defpackage.bvp bvp = new defpackage.bvp();
        bvp.a = java.lang.Long.valueOf(java.lang.Math.max(0, a().longValue() - 500));
        return bvp.a(b()).a();
    }

    bvo() {
    }
}
