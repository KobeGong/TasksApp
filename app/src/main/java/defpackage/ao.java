package defpackage;

/* renamed from: ao reason: default package */
/* compiled from: PG */
final class ao implements java.security.PrivilegedAction {
    private final /* synthetic */ java.lang.Class a;
    private final /* synthetic */ java.lang.String b;

    ao(java.lang.Class cls, java.lang.String str) {
        this.a = cls;
        this.b = str;
    }

    public final /* synthetic */ java.lang.Object run() {
        return this.a.getResourceAsStream(this.b);
    }
}
