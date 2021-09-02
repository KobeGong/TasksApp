package defpackage;

/* renamed from: ctt reason: default package */
/* compiled from: PG */
public abstract class ctt {
    public static final defpackage.ctt a = new defpackage.ctu();

    public abstract java.lang.String a();

    public abstract java.lang.String b();

    public abstract int c();

    public abstract java.lang.String d();

    public final java.lang.String toString() {
        java.lang.StringBuilder append = new java.lang.StringBuilder("LogSite{ class=").append(a()).append(", method=").append(b()).append(", line=").append(c());
        if (d() != null) {
            append.append(", file=").append(d());
        }
        return append.append(" }").toString();
    }

    @java.lang.Deprecated
    public static defpackage.ctt a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return new defpackage.ctv(str, str2, 105, str3);
    }
}
