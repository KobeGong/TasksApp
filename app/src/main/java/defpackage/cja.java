package defpackage;

/* renamed from: cja reason: default package */
/* compiled from: PG */
final class cja implements defpackage.cjh {
    public volatile defpackage.chk a;
    public final java.util.Queue b = new java.util.concurrent.ConcurrentLinkedQueue();

    cja() {
    }

    private final void a(defpackage.cjf cjf) {
        synchronized (this.b) {
            if (this.a == null) {
                this.b.add(cjf);
            } else {
                cjf.a(this.a);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.chk chk) {
        defpackage.cjf cjf = (defpackage.cjf) this.b.poll();
        while (cjf != null) {
            cjf.a(chk);
            cjf = (defpackage.cjf) this.b.poll();
        }
    }

    public final void a(java.lang.Runnable runnable) {
        a((defpackage.cjf) new defpackage.cjb(runnable));
    }

    public final void d() {
        a((defpackage.cjf) new defpackage.cjc());
    }

    public final void a(defpackage.cir cir) {
        a((defpackage.cjf) new defpackage.cjd(cir));
    }

    public final void e() {
        java.lang.Thread.setDefaultUncaughtExceptionHandler(a(java.lang.Thread.getDefaultUncaughtExceptionHandler()));
    }

    public final java.lang.Thread.UncaughtExceptionHandler a(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        defpackage.cje cje = new defpackage.cje(uncaughtExceptionHandler);
        a((defpackage.cjf) cje);
        return cje;
    }

    public final boolean f() {
        return false;
    }

    public final void c() {
        this.b.clear();
    }

    public final defpackage.clt b() {
        return null;
    }

    public final boolean a(defpackage.cls cls) {
        return false;
    }
}
