package defpackage;

import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* access modifiers changed from: package-private */
/* renamed from: cja  reason: default package */
/* compiled from: PG */
public final class cja implements cjh {
    public volatile chk a;
    public final Queue b = new ConcurrentLinkedQueue();

    cja() {
    }

    private final void a(cjf cjf) {
        synchronized (this.b) {
            if (this.a == null) {
                this.b.add(cjf);
            } else {
                cjf.a(this.a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(chk chk) {
        cjf cjf = (cjf) this.b.poll();
        while (cjf != null) {
            cjf.a(chk);
            cjf = (cjf) this.b.poll();
        }
    }

    @Override // defpackage.cjh
    public final void a(Runnable runnable) {
        a(new cjb(runnable));
    }

    @Override // defpackage.cjh
    public final void d() {
        a(new cjc());
    }

    @Override // defpackage.cjh
    public final void a(cir cir) {
        a(new cjd(cir));
    }

    @Override // defpackage.cjh
    public final void e() {
        Thread.setDefaultUncaughtExceptionHandler(a(Thread.getDefaultUncaughtExceptionHandler()));
    }

    @Override // defpackage.cjh
    public final Thread.UncaughtExceptionHandler a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        cje cje = new cje(uncaughtExceptionHandler);
        a((cjf) cje);
        return cje;
    }

    @Override // defpackage.cjh
    public final boolean f() {
        return false;
    }

    @Override // defpackage.cjh
    public final void c() {
        this.b.clear();
    }

    @Override // defpackage.cjh
    public final clt b() {
        return null;
    }

    @Override // defpackage.cjh
    public final boolean a(cls cls) {
        return false;
    }
}
