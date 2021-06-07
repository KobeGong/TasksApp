package defpackage;

import java.lang.Thread;
import java.util.concurrent.ScheduledExecutorService;

/* access modifiers changed from: package-private */
/* renamed from: chk  reason: default package */
/* compiled from: PG */
public final class chk implements cjh {
    private final cht a;

    chk(cht cht) {
        this.a = cht;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List a() {
        /*
        // Method dump skipped, instructions count: 282
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chk.a():java.util.List");
    }

    @Override // defpackage.cjh
    public final clt b() {
        return this.a.b;
    }

    @Override // defpackage.cjh
    public final void c() {
        this.a.f.a();
    }

    @Override // defpackage.cjh
    public final boolean a(cls cls) {
        return this.a.f.a(cls);
    }

    @Override // defpackage.cjh
    public final void a(Runnable runnable) {
        ((Runnable) cky.a((Object) runnable)).run();
    }

    @Override // defpackage.cjh
    public final void d() {
        if (this.a.c.b().b) {
            this.a.i().e();
        }
    }

    @Override // defpackage.cjh
    public final void a(cir cir) {
        if (cir != null && this.a.g()) {
            cit h = this.a.h();
            if (h.b()) {
                if (!(cir.c > 0 || cir.d > 0 || cir.e > 0 || cir.n == 2 || cir.n == 3)) {
                    cdm.a(5, "NetworkMetricService", "skip logging NetworkEvent due to empty bandwidth/latency data", new Object[0]);
                } else {
                    ((ScheduledExecutorService) h.b.a()).submit(new ciu(h, cir));
                }
            }
        }
    }

    @Override // defpackage.cjh
    public final void e() {
        if (this.a.c()) {
            chn d = this.a.d();
            if (d.d.compareAndSet(false, true)) {
                Thread.setDefaultUncaughtExceptionHandler(d.a(Thread.getDefaultUncaughtExceptionHandler()));
            }
        }
    }

    @Override // defpackage.cjh
    public final Thread.UncaughtExceptionHandler a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        if (this.a.c()) {
            return this.a.d().a(uncaughtExceptionHandler);
        }
        return uncaughtExceptionHandler;
    }

    @Override // defpackage.cjh
    public final boolean f() {
        return this.a.g();
    }
}
