package defpackage;

/* renamed from: but reason: default package */
/* compiled from: PG */
public final class but {
    private java.lang.Long a;
    private java.lang.Integer b;
    private byte[] c;

    public final defpackage.but a(java.lang.Long l) {
        if (l == null) {
            throw new java.lang.NullPointerException("Null id");
        }
        this.a = l;
        return this;
    }

    public final defpackage.but a(java.lang.Integer num) {
        if (num == null) {
            throw new java.lang.NullPointerException("Null jobType");
        }
        this.b = num;
        return this;
    }

    public final defpackage.but a(byte[] bArr) {
        if (bArr == null) {
            throw new java.lang.NullPointerException("Null payload");
        }
        this.c = bArr;
        return this;
    }

    public final defpackage.bus a() {
        java.lang.String str = "";
        if (this.a == null) {
            str = java.lang.String.valueOf(str).concat(" id");
        }
        if (this.b == null) {
            str = java.lang.String.valueOf(str).concat(" jobType");
        }
        if (this.c == null) {
            str = java.lang.String.valueOf(str).concat(" payload");
        }
        if (str.isEmpty()) {
            return new defpackage.buj(this.a, this.b, this.c);
        }
        java.lang.String str2 = "Missing required properties:";
        java.lang.String valueOf = java.lang.String.valueOf(str);
        throw new java.lang.IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new java.lang.String(str2));
    }
}
