package defpackage;

import java.util.Map;

/* renamed from: bxg  reason: default package */
/* compiled from: PG */
public final class bxg {
    public String a;
    public byte[] b;
    public Throwable c;
    private Integer d;
    private Map e;

    public final bxg a(int i) {
        this.d = Integer.valueOf(i);
        return this;
    }

    public final bxg a(Map map) {
        if (map == null) {
            throw new NullPointerException("Null responseHeaders");
        }
        this.e = map;
        return this;
    }

    public final bxf a() {
        String str = "";
        if (this.d == null) {
            str = String.valueOf(str).concat(" statusCode");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" responseHeaders");
        }
        if (str.isEmpty()) {
            return new bxb(this.d.intValue(), this.a, this.b, this.e, this.c);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
    }

    bxg() {
    }
}
