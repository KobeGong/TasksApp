package defpackage;

/* renamed from: bi reason: default package */
/* compiled from: PG */
final class bi implements java.io.Serializable {
    public static final long serialVersionUID = 1;
    public final java.lang.String a;
    public final defpackage.az b;
    public final defpackage.bd c;
    public final defpackage.bd d;

    public bi(java.lang.String str, defpackage.az azVar, defpackage.bd bdVar, defpackage.bd bdVar2) {
        this.a = str;
        this.b = azVar;
        this.c = bdVar;
        this.d = bdVar2;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3 = this.a;
        java.lang.String obj = this.b.toString();
        if (this.c == null) {
            str = "";
        } else {
            java.lang.String str4 = " ";
            java.lang.String valueOf = java.lang.String.valueOf(this.c.toString());
            str = valueOf.length() != 0 ? str4.concat(valueOf) : new java.lang.String(str4);
        }
        if (this.d == null) {
            str2 = "";
        } else {
            java.lang.String str5 = " ";
            java.lang.String valueOf2 = java.lang.String.valueOf(this.d.toString());
            str2 = valueOf2.length() != 0 ? str5.concat(valueOf2) : new java.lang.String(str5);
        }
        return new java.lang.StringBuilder(java.lang.String.valueOf(str3).length() + 2 + java.lang.String.valueOf(obj).length() + java.lang.String.valueOf(str).length() + java.lang.String.valueOf(str2).length()).append(str3).append(": ").append(obj).append(str).append(str2).toString();
    }

    @java.lang.Deprecated
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
}
