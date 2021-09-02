package defpackage;

/* renamed from: bxe reason: default package */
/* compiled from: PG */
public final class bxe {
    public byte[] a;
    public java.lang.String b;
    public java.util.Map c;
    private java.lang.String d;

    public final defpackage.bxe a(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null url");
        }
        this.d = str;
        return this;
    }

    public final defpackage.bxd a() {
        java.lang.String str = "";
        if (this.d == null) {
            str = java.lang.String.valueOf(str).concat(" url");
        }
        if (this.b == null) {
            str = java.lang.String.valueOf(str).concat(" contentType");
        }
        if (str.isEmpty()) {
            return new defpackage.bxa(this.d, this.a, this.b, this.c);
        }
        java.lang.String str2 = "Missing required properties:";
        java.lang.String valueOf = java.lang.String.valueOf(str);
        throw new java.lang.IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new java.lang.String(str2));
    }

    bxe() {
    }
}
