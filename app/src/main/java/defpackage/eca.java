package defpackage;

@Deprecated
/* renamed from: eca  reason: default package */
/* compiled from: PG */
public final class eca {
    public ecb a;
    public Long b;
    private Long c;
    private Long d;

    public final eca a(long j) {
        this.c = Long.valueOf(j);
        return this;
    }

    public final eca b(long j) {
        this.d = Long.valueOf(j);
        return this;
    }

    public final ebz a() {
        String str = "";
        if (this.a == null) {
            str = String.valueOf(str).concat(" type");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" messageId");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" uncompressedMessageSize");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" compressedMessageSize");
        }
        if (str.isEmpty()) {
            return new ebu(this.a, this.b.longValue(), this.c.longValue(), this.d.longValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
    }

    eca() {
    }

    eca(byte b2) {
        this();
    }
}
