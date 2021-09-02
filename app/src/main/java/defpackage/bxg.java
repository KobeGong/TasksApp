package defpackage;

/* renamed from: bxg reason: default package */
/* compiled from: PG */
public final class bxg {
    public java.lang.String a;
    public byte[] b;
    public java.lang.Throwable c;
    private java.lang.Integer d;
    private java.util.Map e;

    public final defpackage.bxg a(int i) {
        this.d = java.lang.Integer.valueOf(i);
        return this;
    }

    public final defpackage.bxg a(java.util.Map map) {
        if (map == null) {
            throw new java.lang.NullPointerException("Null responseHeaders");
        }
        this.e = map;
        return this;
    }

    public final defpackage.bxf a() {
        java.lang.String str = "";
        if (this.d == null) {
            str = java.lang.String.valueOf(str).concat(" statusCode");
        }
        if (this.e == null) {
            str = java.lang.String.valueOf(str).concat(" responseHeaders");
        }
        if (str.isEmpty()) {
            return new defpackage.bxb(this.d.intValue(), this.a, this.b, this.e, this.c);
        }
        java.lang.String str2 = "Missing required properties:";
        java.lang.String valueOf = java.lang.String.valueOf(str);
        throw new java.lang.IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new java.lang.String(str2));
    }

    bxg() {
    }
}
