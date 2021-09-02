package defpackage;

@java.lang.Deprecated
/* renamed from: eca reason: default package */
/* compiled from: PG */
public final class eca {
    public defpackage.ecb a;
    public java.lang.Long b;
    private java.lang.Long c;
    private java.lang.Long d;

    public final defpackage.eca a(long j) {
        this.c = java.lang.Long.valueOf(j);
        return this;
    }

    public final defpackage.eca b(long j) {
        this.d = java.lang.Long.valueOf(j);
        return this;
    }

    public final defpackage.ebz a() {
        java.lang.String str = "";
        if (this.a == null) {
            str = java.lang.String.valueOf(str).concat(" type");
        }
        if (this.b == null) {
            str = java.lang.String.valueOf(str).concat(" messageId");
        }
        if (this.c == null) {
            str = java.lang.String.valueOf(str).concat(" uncompressedMessageSize");
        }
        if (this.d == null) {
            str = java.lang.String.valueOf(str).concat(" compressedMessageSize");
        }
        if (str.isEmpty()) {
            return new defpackage.ebu(this.a, this.b.longValue(), this.c.longValue(), this.d.longValue());
        }
        java.lang.String str2 = "Missing required properties:";
        java.lang.String valueOf = java.lang.String.valueOf(str);
        throw new java.lang.IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new java.lang.String(str2));
    }

    eca() {
    }

    eca(byte b2) {
        this();
    }
}
