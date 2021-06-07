package defpackage;

import java.util.Collections;
import java.util.Map;

/* renamed from: bxf  reason: default package */
/* compiled from: PG */
public abstract class bxf {
    public abstract int a();

    public abstract String b();

    public abstract byte[] c();

    public abstract Map d();

    /* access modifiers changed from: package-private */
    public abstract Throwable e();

    public final boolean f() {
        return (e() == null && a() == 200) ? false : true;
    }

    public final Throwable g() {
        if (e() != null || a() == 200) {
            return e();
        }
        return new bxh(Integer.valueOf(a()), b());
    }

    public static bxg h() {
        return new bxg().a(-1).a(Collections.emptyMap());
    }

    bxf() {
    }
}
