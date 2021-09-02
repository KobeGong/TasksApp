package defpackage;

/* renamed from: am reason: default package */
/* compiled from: PG */
final class am implements java.security.PrivilegedAction {
    private final /* synthetic */ java.lang.String a;

    am(java.lang.String str) {
        this.a = str;
    }

    public final /* synthetic */ java.lang.Object run() {
        return java.lang.System.getProperty(this.a);
    }
}
