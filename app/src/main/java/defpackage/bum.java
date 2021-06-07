package defpackage;

/* renamed from: bum  reason: default package */
/* compiled from: PG */
public final class bum {
    public Long a;
    public String b;
    private String c;
    private Long d;
    private Long e;
    private btk f;
    private Long g;
    private Integer h;

    public final bum a(String str) {
        if (str == null) {
            throw new NullPointerException("Null accountName");
        }
        this.c = str;
        return this;
    }

    public final bum a(Long l) {
        if (l == null) {
            throw new NullPointerException("Null syncVersion");
        }
        this.d = l;
        return this;
    }

    public final bum b(Long l) {
        if (l == null) {
            throw new NullPointerException("Null pageVersion");
        }
        this.e = l;
        return this;
    }

    public final bum a(btk btk) {
        if (btk == null) {
            throw new NullPointerException("Null registrationStatus");
        }
        this.f = btk;
        return this;
    }

    public final bum c(Long l) {
        if (l == null) {
            throw new NullPointerException("Null lastRegistrationTimeMs");
        }
        this.g = l;
        return this;
    }

    public final bum a(int i) {
        this.h = Integer.valueOf(i);
        return this;
    }

    public final bul a() {
        String str = "";
        if (this.c == null) {
            str = String.valueOf(str).concat(" accountName");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" syncVersion");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" pageVersion");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" registrationStatus");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" lastRegistrationTimeMs");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" lastRegistrationRequestHash");
        }
        if (str.isEmpty()) {
            return new buh(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h.intValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
    }

    bum() {
    }

    bum(bul bul) {
        this.a = bul.a();
        this.c = bul.b();
        this.b = bul.c();
        this.d = bul.d();
        this.e = bul.e();
        this.f = bul.f();
        this.g = bul.g();
        this.h = Integer.valueOf(bul.h());
    }
}
