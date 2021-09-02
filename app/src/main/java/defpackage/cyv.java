package defpackage;

/* renamed from: cyv reason: default package */
/* compiled from: PG */
public final class cyv {
    public java.lang.String a = null;
    public java.lang.Boolean b = null;

    public final defpackage.cyv a(java.lang.String str) {
        a(str, java.lang.Integer.valueOf(0));
        this.a = str;
        return this;
    }

    public final defpackage.cyv a(boolean z) {
        this.b = java.lang.Boolean.valueOf(z);
        return this;
    }

    static java.lang.String a(java.lang.String str, java.lang.Object... objArr) {
        return java.lang.String.format(java.util.Locale.ROOT, str, objArr);
    }
}
