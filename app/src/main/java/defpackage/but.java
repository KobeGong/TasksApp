package defpackage;

/* renamed from: but  reason: default package */
/* compiled from: PG */
public final class but {
    private Long a;
    private Integer b;
    private byte[] c;

    public final but a(Long l) {
        if (l == null) {
            throw new NullPointerException("Null id");
        }
        this.a = l;
        return this;
    }

    public final but a(Integer num) {
        if (num == null) {
            throw new NullPointerException("Null jobType");
        }
        this.b = num;
        return this;
    }

    public final but a(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("Null payload");
        }
        this.c = bArr;
        return this;
    }

    public final bus a() {
        String str = "";
        if (this.a == null) {
            str = String.valueOf(str).concat(" id");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" jobType");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" payload");
        }
        if (str.isEmpty()) {
            return new buj(this.a, this.b, this.c);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
    }
}
