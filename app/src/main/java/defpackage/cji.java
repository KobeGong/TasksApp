package defpackage;

/* renamed from: cji reason: default package */
/* compiled from: PG */
final class cji implements defpackage.cjh {
    private static final java.util.concurrent.atomic.AtomicInteger c = new java.util.concurrent.atomic.AtomicInteger();
    public final android.app.Application a;
    public final defpackage.clt b;
    private final java.util.concurrent.atomic.AtomicReference d = new java.util.concurrent.atomic.AtomicReference();

    cji(android.app.Application application, defpackage.clt clt) {
        defpackage.cky.b(true);
        this.a = (android.app.Application) defpackage.cky.a((java.lang.Object) application);
        this.b = (defpackage.clt) defpackage.cky.a((java.lang.Object) clt);
        c.incrementAndGet();
        this.d.set(new defpackage.cja());
    }

    private final defpackage.cjh g() {
        return (defpackage.cjh) this.d.get();
    }

    public final void c() {
        ((defpackage.cjh) this.d.getAndSet(new defpackage.ciw())).c();
        try {
            android.app.Application application = this.a;
            synchronized (defpackage.cha.class) {
                if (defpackage.cha.a != null) {
                    defpackage.chb chb = defpackage.cha.a.b;
                    application.unregisterActivityLifecycleCallbacks(chb.a);
                    application.unregisterComponentCallbacks(chb.a);
                    defpackage.cha.a = null;
                }
            }
        } catch (java.lang.RuntimeException e) {
            defpackage.cdm.a(5, "Primes", "Failed to shutdown app lifecycle monitor", new java.lang.Object[0]);
        }
    }

    static boolean a() {
        return true;
    }

    public final boolean a(defpackage.cls cls) {
        return g().a(cls);
    }

    public final defpackage.clt b() {
        defpackage.clt b2 = g().b();
        return b2 != null ? b2 : this.b;
    }

    public final void a(java.lang.Runnable runnable) {
        g().a(runnable);
    }

    public final void d() {
        g().d();
    }

    public final void a(defpackage.cir cir) {
        g().a(cir);
    }

    public final void e() {
        g().e();
    }

    public final java.lang.Thread.UncaughtExceptionHandler a(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        return g().a(uncaughtExceptionHandler);
    }

    public final boolean f() {
        return g().f();
    }

    static /* synthetic */ void a(defpackage.cji cji, java.util.concurrent.ExecutorService executorService, defpackage.cjw cjw, defpackage.clt clt, defpackage.clt clt2, defpackage.clt clt3, defpackage.cgq cgq, defpackage.cjm cjm) {
        try {
            executorService.submit(new defpackage.cjk(cji, cjw, clt, clt2, clt3, cgq, cjm));
        } catch (java.lang.RuntimeException e) {
            defpackage.cdm.b("Primes", "Primes failed to initialized", e, new java.lang.Object[0]);
            cji.c();
        }
    }

    static /* synthetic */ void a(defpackage.cji cji, defpackage.cjw cjw, defpackage.clt clt, defpackage.clt clt2, defpackage.clt clt3, defpackage.cgq cgq, defpackage.cjm cjm) {
        defpackage.cko.a.a = defpackage.chl.a();
        defpackage.cky.a((java.lang.Object) java.lang.Integer.valueOf(2131951805));
        defpackage.clr clr = (defpackage.clr) clt3.a();
        clr.a((defpackage.cls) cgq);
        clr.a((defpackage.cls) cjm);
        android.app.Application application = cji.a;
        defpackage.clt clt4 = cji.b;
        defpackage.cmq cmq = new defpackage.cmq(application);
        clr.a((defpackage.clt) cmq);
        if (!clr.a) {
            application.registerReceiver(new defpackage.cmo(clr, cmq, clt4), new android.content.IntentFilter("com.google.gservices.intent.action.GSERVICES_CHANGED"));
        }
        if (clr.a) {
            cji.c();
            return;
        }
        defpackage.cko.a.b = defpackage.chl.a();
        android.content.SharedPreferences sharedPreferences = (android.content.SharedPreferences) clt2.a();
        defpackage.coe coe = cjw.a;
        android.app.Application application2 = cjw.b;
        defpackage.cjt cjt = new defpackage.cjt();
        cjt.a = coe;
        cjt.b = new defpackage.ckt(defpackage.akp.a(application2, "Tasks:enable_memory_metric"));
        cjt.c = new defpackage.cln(defpackage.akp.a(application2, "Tasks:enable_timer_metric"));
        cjt.d = new defpackage.cjy(defpackage.akp.a(application2, "Tasks:enable_crash_metric"), 0);
        cjt.e = new defpackage.ckw(defpackage.akp.a(application2, "Tasks:enable_network_metric"));
        cjt.f = new defpackage.ckx(defpackage.akp.a(application2, "Tasks:enable_package_metric"));
        defpackage.cjs a2 = defpackage.cjs.a((defpackage.cjs) defpackage.cky.a((java.lang.Object) defpackage.cjs.a(new defpackage.cju(cjt.a, cjt.b, cjt.c, cjt.d, cjt.e, cjt.f))));
        defpackage.cko.a.c = defpackage.chl.a();
        defpackage.cki cki = (defpackage.cki) defpackage.cky.a((java.lang.Object) (defpackage.cki) clt.a());
        if (clr.a) {
            cji.c();
            return;
        }
        defpackage.cko.a.d = defpackage.chl.a();
        defpackage.cht cht = new defpackage.cht(cji.a, cji.b, a2, cki, sharedPreferences, clr);
        cji.a.getPackageName();
        defpackage.chk chk = new defpackage.chk(cht);
        if (clr.a) {
            cji.c();
            return;
        }
        defpackage.cjh cjh = (defpackage.cjh) cji.d.get();
        if (!(cjh instanceof defpackage.cja) || !cji.d.compareAndSet(cjh, chk)) {
            defpackage.cdm.a(3, "Primes", "Primes shutdown during initialization", new java.lang.Object[0]);
            chk.c();
        } else {
            for (defpackage.cle cle : chk.a()) {
                cle.e();
                synchronized (cgq) {
                    if (!cgq.c) {
                        cgq.b.add(cle);
                    } else {
                        cle.f();
                    }
                }
            }
            if (!clr.a) {
                defpackage.cja cja = (defpackage.cja) cjh;
                cja.a(chk);
                synchronized (cja.b) {
                    cja.a = chk;
                }
                cja.a(chk);
                defpackage.cjl cjl = new defpackage.cjl(cht);
                synchronized (cjm.b) {
                    if (cjm.c) {
                        ((java.util.concurrent.ScheduledExecutorService) cjm.a.a()).submit(cjl);
                    } else {
                        cjm.b.add(cjl);
                    }
                }
            }
            cjh.c();
        }
        defpackage.cdm.c(cji.a);
        defpackage.cdm.d(cji.a);
        defpackage.cko.a.e = defpackage.chl.a();
    }
}
