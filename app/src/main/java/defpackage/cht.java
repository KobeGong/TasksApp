package defpackage;

/* renamed from: cht reason: default package */
/* compiled from: PG */
final class cht {
    public final android.app.Application a;
    public final defpackage.clt b;
    public final defpackage.cjs c;
    public final defpackage.cki d;
    public final android.content.SharedPreferences e;
    public final defpackage.clr f;
    private volatile defpackage.chx g;
    private volatile defpackage.chn h;
    private volatile defpackage.clx i;
    private volatile defpackage.cit j;
    private volatile defpackage.cik k;
    private volatile defpackage.clv l;
    private volatile defpackage.chz m;
    private volatile defpackage.che n;
    private volatile defpackage.coe o;

    cht(android.app.Application application, defpackage.clt clt, defpackage.cjs cjs, defpackage.cki cki, android.content.SharedPreferences sharedPreferences, defpackage.clr clr) {
        this.a = application;
        this.b = clt;
        this.c = cjs;
        this.d = cki;
        this.e = sharedPreferences;
        this.f = clr;
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.cls a(defpackage.cls cls) {
        if (!this.f.a(cls)) {
            cls.a();
        }
        return cls;
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.coe a() {
        defpackage.coe a2;
        if (this.o == null) {
            synchronized (defpackage.coe.class) {
                if (this.o == null) {
                    if (this.d.i) {
                        defpackage.cjs cjs = this.c;
                        cjs.getClass();
                        a2 = new defpackage.ckq(new defpackage.chu(cjs));
                    } else {
                        a2 = this.c.a();
                    }
                    this.o = a2;
                }
            }
        }
        return this.o;
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.chx b() {
        if (this.g == null) {
            synchronized (defpackage.chx.class) {
                if (this.g == null) {
                    this.g = (defpackage.chx) a(new defpackage.chx(a(), this.a, this.b));
                }
            }
        }
        return this.g;
    }

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        return this.c.d().b;
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.chn d() {
        if (this.h == null) {
            synchronized (defpackage.chn.class) {
                if (this.h == null) {
                    defpackage.coe a2 = a();
                    android.app.Application application = this.a;
                    defpackage.clt clt = this.b;
                    defpackage.cjy d2 = this.c.d();
                    this.h = (defpackage.chn) a(new defpackage.chn(a2, d2.f, d2.e, d2.d, clt, application, d2.c, false, this.d.f));
                }
            }
        }
        return this.h;
    }

    /* access modifiers changed from: 0000 */
    public final boolean e() {
        return this.c.h().b;
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.clx f() {
        defpackage.clx a2;
        if (this.i == null) {
            synchronized (defpackage.clx.class) {
                if (this.i == null) {
                    if (e()) {
                        defpackage.coe a3 = a();
                        android.app.Application application = this.a;
                        defpackage.clt clt = this.b;
                        boolean z = this.c.c().c;
                        a2 = defpackage.clx.a(a3, application, clt, this.c.h());
                    } else {
                        defpackage.coe a4 = a();
                        android.app.Application application2 = this.a;
                        defpackage.clt clt2 = this.b;
                        boolean z2 = this.c.c().c;
                        a2 = defpackage.clx.a(a4, application2, clt2, this.c.i());
                    }
                    this.i = (defpackage.clx) a(a2);
                }
            }
        }
        return this.i;
    }

    /* access modifiers changed from: 0000 */
    public final boolean g() {
        return this.c.e().b;
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.cit h() {
        if (this.j == null) {
            synchronized (defpackage.cit.class) {
                if (this.j == null) {
                    defpackage.coe a2 = a();
                    android.app.Application application = this.a;
                    defpackage.clt clt = this.b;
                    defpackage.ckw e2 = this.c.e();
                    this.j = (defpackage.cit) a(new defpackage.cit(a2, application, clt, defpackage.bg.Z, e2.e, this.c.e().d || this.d.h, e2.c));
                }
            }
        }
        return this.j;
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.cik i() {
        if (this.k == null) {
            synchronized (defpackage.cik.class) {
                if (this.k == null) {
                    defpackage.coe a2 = a();
                    android.app.Application application = this.a;
                    defpackage.clt clt = this.b;
                    defpackage.ckt b2 = this.c.b();
                    boolean z = this.d.c;
                    new defpackage.cim();
                    this.k = (defpackage.cik) a(new defpackage.cik(a2, application, clt, b2.c, b2.d, b2.e, b2.f, z));
                }
            }
        }
        return this.k;
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.clv j() {
        if (this.l == null) {
            synchronized (defpackage.clv.class) {
                if (this.l == null) {
                    defpackage.coe a2 = a();
                    android.app.Application application = this.a;
                    defpackage.clt clt = this.b;
                    defpackage.cln c2 = this.c.c();
                    this.l = (defpackage.clv) a(new defpackage.clv(a2, application, clt, c2.d, c2.e));
                }
            }
        }
        return this.l;
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.chz k() {
        if (this.m == null) {
            synchronized (defpackage.chz.class) {
                if (this.m == null) {
                    defpackage.coe a2 = a();
                    android.app.Application application = this.a;
                    boolean z = this.d.b;
                    defpackage.clt clt = this.b;
                    defpackage.cku k2 = this.c.k();
                    this.m = (defpackage.chz) a(new defpackage.chz(application, z, k2.c, defpackage.cha.a(this.a), clt, new defpackage.cnn(), a2));
                }
            }
        }
        return this.m;
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.che l() {
        if (this.n == null) {
            synchronized (defpackage.che.class) {
                if (this.n == null) {
                    defpackage.coe a2 = a();
                    android.app.Application application = this.a;
                    defpackage.clt clt = this.b;
                    android.content.SharedPreferences sharedPreferences = this.e;
                    defpackage.cjr j2 = this.c.j();
                    defpackage.clz clz = new defpackage.clz(defpackage.cip.b(application), new defpackage.cmm(application), defpackage.chf.a, defpackage.chg.a, j2.d);
                    this.n = (defpackage.che) a(new defpackage.che(a2, application, clt, sharedPreferences, clz, j2.c));
                }
            }
        }
        return this.n;
    }
}
