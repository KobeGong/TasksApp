package defpackage;

/* renamed from: ejm reason: default package */
/* compiled from: PG */
public final class ejm extends defpackage.ehq {
    private final defpackage.ehy a;
    private final java.lang.String b;
    private final defpackage.ehr c;
    private final java.util.concurrent.Executor d;
    private final java.util.ArrayList e = new java.util.ArrayList();
    private java.lang.String f = "POST";
    private int g = 3;
    private boolean h;
    private java.util.Collection i;
    private boolean j;
    private int k;
    private boolean l;
    private int m;

    public ejm(java.lang.String str, defpackage.ehr ehr, java.util.concurrent.Executor executor, defpackage.ehy ehy) {
        super(0);
        if (str == null) {
            throw new java.lang.NullPointerException("URL is required.");
        } else if (ehr == null) {
            throw new java.lang.NullPointerException("Callback is required.");
        } else if (executor == null) {
            throw new java.lang.NullPointerException("Executor is required.");
        } else if (ehy == null) {
            throw new java.lang.NullPointerException("CronetEngine is required.");
        } else {
            this.b = str;
            this.c = ehr;
            this.d = executor;
            this.a = ehy;
        }
    }

    public final defpackage.ehq a(java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.NullPointerException("Invalid metrics annotation.");
        }
        if (this.i == null) {
            this.i = new java.util.ArrayList();
        }
        this.i.add(obj);
        return this;
    }

    @android.annotation.SuppressLint({"WrongConstant"})
    public final defpackage.ehp d() {
        return this.a.a(this.b, this.c, this.d, this.f, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
    }

    public final /* synthetic */ defpackage.ehq c() {
        this.h = true;
        return this;
    }

    public final /* synthetic */ defpackage.ehq b(java.lang.String str, java.lang.String str2) {
        return (defpackage.ejm) a(str, str2);
    }

    public final /* synthetic */ defpackage.ehq b(java.lang.String str) {
        return (defpackage.ejm) a(str);
    }

    @android.annotation.SuppressLint({"WrongConstant"})
    public final /* synthetic */ defpackage.ehp b() {
        return b();
    }

    public final /* synthetic */ defpackage.ehq a() {
        return (defpackage.ejm) a();
    }

    public final /* synthetic */ defpackage.ehq a(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            throw new java.lang.NullPointerException("Invalid header name.");
        } else if (str2 == null) {
            throw new java.lang.NullPointerException("Invalid header value.");
        } else {
            this.e.add(new java.util.AbstractMap.SimpleImmutableEntry(str, str2));
            return this;
        }
    }

    public final /* synthetic */ defpackage.ehq a(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Method is required.");
        }
        this.f = str;
        return this;
    }
}
