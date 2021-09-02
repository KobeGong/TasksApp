package defpackage;

/* renamed from: ajq reason: default package */
/* compiled from: PG */
public abstract class ajq {
    public abstract java.util.List a();

    public abstract defpackage.dce b();

    public abstract long c();

    public static defpackage.ajq a(java.util.List list, defpackage.dce dce, long j) {
        return new defpackage.ajm(defpackage.csp.a((java.util.Collection) list), dce, j);
    }

    public static defpackage.ajq d() {
        return new defpackage.ajm(java.util.Collections.emptyList(), defpackage.dce.b, 0);
    }
}
