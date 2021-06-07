package defpackage;

/* renamed from: ctt  reason: default package */
/* compiled from: PG */
public abstract class ctt {
    public static final ctt a = new ctu();

    public abstract String a();

    public abstract String b();

    public abstract int c();

    public abstract String d();

    public final String toString() {
        StringBuilder append = new StringBuilder("LogSite{ class=").append(a()).append(", method=").append(b()).append(", line=").append(c());
        if (d() != null) {
            append.append(", file=").append(d());
        }
        return append.append(" }").toString();
    }

    @Deprecated
    public static ctt a(String str, String str2, String str3) {
        return new ctv(str, str2, 105, str3);
    }
}
