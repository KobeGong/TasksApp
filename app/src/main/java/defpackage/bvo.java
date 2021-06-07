package defpackage;

import android.os.SystemClock;

/* renamed from: bvo  reason: default package */
/* compiled from: PG */
public abstract class bvo {
    public static bvo c() {
        bvp bvp = new bvp();
        bvp.a = null;
        return bvp.a(SystemClock.uptimeMillis()).a();
    }

    /* access modifiers changed from: package-private */
    public abstract Long a();

    /* access modifiers changed from: package-private */
    public abstract long b();

    public final boolean d() {
        return a() == null;
    }

    public final long e() {
        return Math.max(0L, ((Long) cld.a(a())).longValue() - (SystemClock.uptimeMillis() - b()));
    }

    public final bvo f() {
        if (d()) {
            return this;
        }
        bvp bvp = new bvp();
        bvp.a = Long.valueOf(Math.max(0L, a().longValue() - 500));
        return bvp.a(b()).a();
    }

    bvo() {
    }
}
