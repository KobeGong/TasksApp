package defpackage;

import android.app.Application;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import com.google.android.apps.tasks.R;
import java.lang.Thread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
/* renamed from: cji  reason: default package */
/* compiled from: PG */
public final class cji implements cjh {
    private static final AtomicInteger c = new AtomicInteger();
    public final Application a;
    public final clt b;
    private final AtomicReference d = new AtomicReference();

    cji(Application application, clt clt) {
        cky.b(true);
        this.a = (Application) cky.a((Object) application);
        this.b = (clt) cky.a(clt);
        c.incrementAndGet();
        this.d.set(new cja());
    }

    private final cjh g() {
        return (cjh) this.d.get();
    }

    @Override // defpackage.cjh
    public final void c() {
        ((cjh) this.d.getAndSet(new ciw())).c();
        try {
            Application application = this.a;
            synchronized (cha.class) {
                if (cha.a != null) {
                    chb chb = cha.a.b;
                    application.unregisterActivityLifecycleCallbacks(chb.a);
                    application.unregisterComponentCallbacks(chb.a);
                    cha.a = null;
                }
            }
        } catch (RuntimeException e) {
            cdm.a(5, "Primes", "Failed to shutdown app lifecycle monitor", new Object[0]);
        }
    }

    static boolean a() {
        return true;
    }

    @Override // defpackage.cjh
    public final boolean a(cls cls) {
        return g().a(cls);
    }

    @Override // defpackage.cjh
    public final clt b() {
        clt b2 = g().b();
        return b2 != null ? b2 : this.b;
    }

    @Override // defpackage.cjh
    public final void a(Runnable runnable) {
        g().a(runnable);
    }

    @Override // defpackage.cjh
    public final void d() {
        g().d();
    }

    @Override // defpackage.cjh
    public final void a(cir cir) {
        g().a(cir);
    }

    @Override // defpackage.cjh
    public final void e() {
        g().e();
    }

    @Override // defpackage.cjh
    public final Thread.UncaughtExceptionHandler a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        return g().a(uncaughtExceptionHandler);
    }

    @Override // defpackage.cjh
    public final boolean f() {
        return g().f();
    }

    static /* synthetic */ void a(cji cji, ExecutorService executorService, cjw cjw, clt clt, clt clt2, clt clt3, cgq cgq, cjm cjm) {
        try {
            executorService.submit(new cjk(cji, cjw, clt, clt2, clt3, cgq, cjm));
        } catch (RuntimeException e) {
            cdm.b("Primes", "Primes failed to initialized", e, new Object[0]);
            cji.c();
        }
    }

    static /* synthetic */ void a(cji cji, cjw cjw, clt clt, clt clt2, clt clt3, cgq cgq, cjm cjm) {
        cko.a.a = chl.a();
        cky.a((Object) Integer.valueOf((int) R.string.primes_marker));
        clr clr = (clr) clt3.a();
        clr.a(cgq);
        clr.a(cjm);
        Application application = cji.a;
        clt clt4 = cji.b;
        cmq cmq = new cmq(application);
        clr.a(cmq);
        if (!clr.a) {
            application.registerReceiver(new cmo(clr, cmq, clt4), new IntentFilter("com.google.gservices.intent.action.GSERVICES_CHANGED"));
        }
        if (clr.a) {
            cji.c();
            return;
        }
        cko.a.b = chl.a();
        SharedPreferences sharedPreferences = (SharedPreferences) clt2.a();
        coe coe = cjw.a;
        Application application2 = cjw.b;
        cjt cjt = new cjt();
        cjt.a = coe;
        cjt.b = new ckt(akp.a(application2, "Tasks:enable_memory_metric"));
        cjt.c = new cln(akp.a(application2, "Tasks:enable_timer_metric"));
        cjt.d = new cjy(akp.a(application2, "Tasks:enable_crash_metric"), (byte) 0);
        cjt.e = new ckw(akp.a(application2, "Tasks:enable_network_metric"));
        cjt.f = new ckx(akp.a(application2, "Tasks:enable_package_metric"));
        cjs a2 = cjs.a((cjs) cky.a(cjs.a(new cju(cjt.a, cjt.b, cjt.c, cjt.d, cjt.e, cjt.f))));
        cko.a.c = chl.a();
        cki cki = (cki) cky.a((cki) clt.a());
        if (clr.a) {
            cji.c();
            return;
        }
        cko.a.d = chl.a();
        cht cht = new cht(cji.a, cji.b, a2, cki, sharedPreferences, clr);
        cji.a.getPackageName();
        chk chk = new chk(cht);
        if (clr.a) {
            cji.c();
            return;
        }
        cjh cjh = (cjh) cji.d.get();
        if (!(cjh instanceof cja) || !cji.d.compareAndSet(cjh, chk)) {
            cdm.a(3, "Primes", "Primes shutdown during initialization", new Object[0]);
            chk.c();
        } else {
            for (cle cle : chk.a()) {
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
                cja cja = (cja) cjh;
                cja.a(chk);
                synchronized (cja.b) {
                    cja.a = chk;
                }
                cja.a(chk);
                cjl cjl = new cjl(cht);
                synchronized (cjm.b) {
                    if (cjm.c) {
                        ((ScheduledExecutorService) cjm.a.a()).submit(cjl);
                    } else {
                        cjm.b.add(cjl);
                    }
                }
            }
            cjh.c();
        }
        cdm.c(cji.a);
        cdm.d(cji.a);
        cko.a.e = chl.a();
    }
}
