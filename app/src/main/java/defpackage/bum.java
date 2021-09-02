package defpackage;

/* renamed from: bum reason: default package */
/* compiled from: PG */
public final class bum {
    public java.lang.Long a;
    public java.lang.String b;
    private java.lang.String c;
    private java.lang.Long d;
    private java.lang.Long e;
    private defpackage.btk f;
    private java.lang.Long g;
    private java.lang.Integer h;

    public final defpackage.bum a(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null accountName");
        }
        this.c = str;
        return this;
    }

    public final defpackage.bum a(java.lang.Long l) {
        if (l == null) {
            throw new java.lang.NullPointerException("Null syncVersion");
        }
        this.d = l;
        return this;
    }

    public final defpackage.bum b(java.lang.Long l) {
        if (l == null) {
            throw new java.lang.NullPointerException("Null pageVersion");
        }
        this.e = l;
        return this;
    }

    public final defpackage.bum a(defpackage.btk btk) {
        if (btk == null) {
            throw new java.lang.NullPointerException("Null registrationStatus");
        }
        this.f = btk;
        return this;
    }

    public final defpackage.bum c(java.lang.Long l) {
        if (l == null) {
            throw new java.lang.NullPointerException("Null lastRegistrationTimeMs");
        }
        this.g = l;
        return this;
    }

    public final defpackage.bum a(int i) {
        this.h = java.lang.Integer.valueOf(i);
        return this;
    }

    public final defpackage.bul a() {
        java.lang.String str = "";
        if (this.c == null) {
            str = java.lang.String.valueOf(str).concat(" accountName");
        }
        if (this.d == null) {
            str = java.lang.String.valueOf(str).concat(" syncVersion");
        }
        if (this.e == null) {
            str = java.lang.String.valueOf(str).concat(" pageVersion");
        }
        if (this.f == null) {
            str = java.lang.String.valueOf(str).concat(" registrationStatus");
        }
        if (this.g == null) {
            str = java.lang.String.valueOf(str).concat(" lastRegistrationTimeMs");
        }
        if (this.h == null) {
            str = java.lang.String.valueOf(str).concat(" lastRegistrationRequestHash");
        }
        if (str.isEmpty()) {
            return new defpackage.buh(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h.intValue());
        }
        java.lang.String str2 = "Missing required properties:";
        java.lang.String valueOf = java.lang.String.valueOf(str);
        throw new java.lang.IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new java.lang.String(str2));
    }

    bum() {
    }

    bum(defpackage.bul bul) {
        this.a = bul.a();
        this.c = bul.b();
        this.b = bul.c();
        this.d = bul.d();
        this.e = bul.e();
        this.f = bul.f();
        this.g = bul.g();
        this.h = java.lang.Integer.valueOf(bul.h());
    }
}
