package defpackage;

import java.util.Map;

/* renamed from: bxe  reason: default package */
/* compiled from: PG */
public final class bxe {
    public byte[] a;
    public String b;
    public Map c;
    private String d;

    public final bxe a(String str) {
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.d = str;
        return this;
    }

    public final bxd a() {
        String str = "";
        if (this.d == null) {
            str = String.valueOf(str).concat(" url");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" contentType");
        }
        if (str.isEmpty()) {
            return new bxa(this.d, this.a, this.b, this.c);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
    }

    bxe() {
    }
}
