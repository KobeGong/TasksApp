package defpackage;

/* renamed from: buw reason: default package */
/* compiled from: PG */
public final class buw {
    public java.util.List a;
    public defpackage.dgu b;
    public java.lang.String c;
    private java.lang.String d;
    private defpackage.dge e;
    private defpackage.dfu f;
    private defpackage.dgj g;
    private java.lang.Long h;
    private java.lang.Long i;
    private defpackage.dfn j;
    private java.lang.String k;
    private java.lang.Long l;

    public final defpackage.buw a(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null id");
        }
        this.d = str;
        return this;
    }

    public final defpackage.buw a(defpackage.dge dge) {
        if (dge == null) {
            throw new java.lang.NullPointerException("Null readState");
        }
        this.e = dge;
        return this;
    }

    public final defpackage.buw a(defpackage.dfu dfu) {
        if (dfu == null) {
            throw new java.lang.NullPointerException("Null countBehavior");
        }
        this.f = dfu;
        return this;
    }

    public final defpackage.buw a(defpackage.dgj dgj) {
        if (dgj == null) {
            throw new java.lang.NullPointerException("Null systemTrayBehavior");
        }
        this.g = dgj;
        return this;
    }

    public final defpackage.buw a(java.lang.Long l2) {
        if (l2 == null) {
            throw new java.lang.NullPointerException("Null lastUpdatedVersion");
        }
        this.h = l2;
        return this;
    }

    public final defpackage.buw b(java.lang.Long l2) {
        if (l2 == null) {
            throw new java.lang.NullPointerException("Null lastNotificationVersion");
        }
        this.i = l2;
        return this;
    }

    public final defpackage.buw a(defpackage.dfn dfn) {
        if (dfn == null) {
            throw new java.lang.NullPointerException("Null androidSdkMessage");
        }
        this.j = dfn;
        return this;
    }

    public final defpackage.buw b(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null groupId");
        }
        this.k = str;
        return this;
    }

    public final defpackage.buw c(java.lang.Long l2) {
        if (l2 == null) {
            throw new java.lang.NullPointerException("Null expirationTimestampUsec");
        }
        this.l = l2;
        return this;
    }

    public final defpackage.buv a() {
        java.lang.String str = "";
        if (this.d == null) {
            str = java.lang.String.valueOf(str).concat(" id");
        }
        if (this.e == null) {
            str = java.lang.String.valueOf(str).concat(" readState");
        }
        if (this.f == null) {
            str = java.lang.String.valueOf(str).concat(" countBehavior");
        }
        if (this.g == null) {
            str = java.lang.String.valueOf(str).concat(" systemTrayBehavior");
        }
        if (this.h == null) {
            str = java.lang.String.valueOf(str).concat(" lastUpdatedVersion");
        }
        if (this.i == null) {
            str = java.lang.String.valueOf(str).concat(" lastNotificationVersion");
        }
        if (this.j == null) {
            str = java.lang.String.valueOf(str).concat(" androidSdkMessage");
        }
        if (this.k == null) {
            str = java.lang.String.valueOf(str).concat(" groupId");
        }
        if (this.l == null) {
            str = java.lang.String.valueOf(str).concat(" expirationTimestampUsec");
        }
        if (str.isEmpty()) {
            return new defpackage.buk(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.a, this.b, this.c, this.k, this.l);
        }
        java.lang.String str2 = "Missing required properties:";
        java.lang.String valueOf = java.lang.String.valueOf(str);
        throw new java.lang.IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new java.lang.String(str2));
    }

    buw() {
    }
}
