package defpackage;

import android.app.Application;
import android.content.SharedPreferences;

/* access modifiers changed from: package-private */
/* renamed from: cht  reason: default package */
/* compiled from: PG */
public final class cht {
    public final Application a;
    public final clt b;
    public final cjs c;
    public final cki d;
    public final SharedPreferences e;
    public final clr f;
    private volatile chx g;
    private volatile chn h;
    private volatile clx i;
    private volatile cit j;
    private volatile cik k;
    private volatile clv l;
    private volatile chz m;
    private volatile che n;
    private volatile coe o;

    cht(Application application, clt clt, cjs cjs, cki cki, SharedPreferences sharedPreferences, clr clr) {
        this.a = application;
        this.b = clt;
        this.c = cjs;
        this.d = cki;
        this.e = sharedPreferences;
        this.f = clr;
    }

    /* access modifiers changed from: package-private */
    public final cls a(cls cls) {
        if (!this.f.a(cls)) {
            cls.a();
        }
        return cls;
    }

    /* access modifiers changed from: package-private */
    public final coe a() {
        coe a2;
        if (this.o == null) {
            synchronized (coe.class) {
                if (this.o == null) {
                    if (this.d.i) {
                        cjs cjs = this.c;
                        cjs.getClass();
                        a2 = new ckq(new chu(cjs));
                    } else {
                        a2 = this.c.a();
                    }
                    this.o = a2;
                }
            }
        }
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public final chx b() {
        if (this.g == null) {
            synchronized (chx.class) {
                if (this.g == null) {
                    this.g = (chx) a(new chx(a(), this.a, this.b));
                }
            }
        }
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        return this.c.d().b;
    }

    /* access modifiers changed from: package-private */
    public final chn d() {
        if (this.h == null) {
            synchronized (chn.class) {
                if (this.h == null) {
                    coe a2 = a();
                    Application application = this.a;
                    clt clt = this.b;
                    cjy d2 = this.c.d();
                    this.h = (chn) a(new chn(a2, d2.f, d2.e, d2.d, clt, application, d2.c, false, this.d.f));
                }
            }
        }
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        return this.c.h().b;
    }

    /* access modifiers changed from: package-private */
    public final clx f() {
        clx a2;
        if (this.i == null) {
            synchronized (clx.class) {
                if (this.i == null) {
                    if (e()) {
                        coe a3 = a();
                        Application application = this.a;
                        clt clt = this.b;
                        boolean z = this.c.c().c;
                        a2 = clx.a(a3, application, clt, this.c.h());
                    } else {
                        coe a4 = a();
                        Application application2 = this.a;
                        clt clt2 = this.b;
                        boolean z2 = this.c.c().c;
                        a2 = clx.a(a4, application2, clt2, this.c.i());
                    }
                    this.i = (clx) a(a2);
                }
            }
        }
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public final boolean g() {
        return this.c.e().b;
    }

    /* access modifiers changed from: package-private */
    public final cit h() {
        if (this.j == null) {
            synchronized (cit.class) {
                if (this.j == null) {
                    coe a2 = a();
                    Application application = this.a;
                    clt clt = this.b;
                    ckw e2 = this.c.e();
                    this.j = (cit) a(new cit(a2, application, clt, bg.Z, e2.e, this.c.e().d || this.d.h, e2.c));
                }
            }
        }
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public final cik i() {
        if (this.k == null) {
            synchronized (cik.class) {
                if (this.k == null) {
                    coe a2 = a();
                    Application application = this.a;
                    clt clt = this.b;
                    ckt b2 = this.c.b();
                    boolean z = this.d.c;
                    new cim();
                    this.k = (cik) a(new cik(a2, application, clt, b2.c, b2.d, b2.e, b2.f, z));
                }
            }
        }
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public final clv j() {
        if (this.l == null) {
            synchronized (clv.class) {
                if (this.l == null) {
                    coe a2 = a();
                    Application application = this.a;
                    clt clt = this.b;
                    cln c2 = this.c.c();
                    this.l = (clv) a(new clv(a2, application, clt, c2.d, c2.e));
                }
            }
        }
        return this.l;
    }

    /* access modifiers changed from: package-private */
    public final chz k() {
        if (this.m == null) {
            synchronized (chz.class) {
                if (this.m == null) {
                    coe a2 = a();
                    Application application = this.a;
                    boolean z = this.d.b;
                    clt clt = this.b;
                    cku k2 = this.c.k();
                    this.m = (chz) a(new chz(application, z, k2.c, cha.a(this.a), clt, new cnn(), a2));
                }
            }
        }
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public final che l() {
        if (this.n == null) {
            synchronized (che.class) {
                if (this.n == null) {
                    coe a2 = a();
                    Application application = this.a;
                    clt clt = this.b;
                    SharedPreferences sharedPreferences = this.e;
                    cjr j2 = this.c.j();
                    this.n = (che) a(new che(a2, application, clt, sharedPreferences, new clz(cip.b(application), new cmm(application), chf.a, chg.a, j2.d), j2.c));
                }
            }
        }
        return this.n;
    }
}
