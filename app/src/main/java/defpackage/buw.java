package defpackage;

import java.util.List;

/* renamed from: buw  reason: default package */
/* compiled from: PG */
public final class buw {
    public List a;
    public dgu b;
    public String c;
    private String d;
    private dge e;
    private dfu f;
    private dgj g;
    private Long h;
    private Long i;
    private dfn j;
    private String k;
    private Long l;

    public final buw a(String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.d = str;
        return this;
    }

    public final buw a(dge dge) {
        if (dge == null) {
            throw new NullPointerException("Null readState");
        }
        this.e = dge;
        return this;
    }

    public final buw a(dfu dfu) {
        if (dfu == null) {
            throw new NullPointerException("Null countBehavior");
        }
        this.f = dfu;
        return this;
    }

    public final buw a(dgj dgj) {
        if (dgj == null) {
            throw new NullPointerException("Null systemTrayBehavior");
        }
        this.g = dgj;
        return this;
    }

    public final buw a(Long l2) {
        if (l2 == null) {
            throw new NullPointerException("Null lastUpdatedVersion");
        }
        this.h = l2;
        return this;
    }

    public final buw b(Long l2) {
        if (l2 == null) {
            throw new NullPointerException("Null lastNotificationVersion");
        }
        this.i = l2;
        return this;
    }

    public final buw a(dfn dfn) {
        if (dfn == null) {
            throw new NullPointerException("Null androidSdkMessage");
        }
        this.j = dfn;
        return this;
    }

    public final buw b(String str) {
        if (str == null) {
            throw new NullPointerException("Null groupId");
        }
        this.k = str;
        return this;
    }

    public final buw c(Long l2) {
        if (l2 == null) {
            throw new NullPointerException("Null expirationTimestampUsec");
        }
        this.l = l2;
        return this;
    }

    public final buv a() {
        String str = "";
        if (this.d == null) {
            str = String.valueOf(str).concat(" id");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" readState");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" countBehavior");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" systemTrayBehavior");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" lastUpdatedVersion");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" lastNotificationVersion");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" androidSdkMessage");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" groupId");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" expirationTimestampUsec");
        }
        if (str.isEmpty()) {
            return new buk(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.a, this.b, this.c, this.k, this.l);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
    }

    buw() {
    }
}
