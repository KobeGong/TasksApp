package defpackage;

/* renamed from: bxf reason: default package */
/* compiled from: PG */
public abstract class bxf {
    public abstract int a();

    public abstract java.lang.String b();

    public abstract byte[] c();

    public abstract java.util.Map d();

    /* access modifiers changed from: 0000 */
    public abstract java.lang.Throwable e();

    public final boolean f() {
        return (e() == null && a() == 200) ? false : true;
    }

    public final java.lang.Throwable g() {
        if (e() != null || a() == 200) {
            return e();
        }
        return new defpackage.bxh(java.lang.Integer.valueOf(a()), b());
    }

    public static defpackage.bxg h() {
        return new defpackage.bxg().a(-1).a(java.util.Collections.emptyMap());
    }

    bxf() {
    }
}
