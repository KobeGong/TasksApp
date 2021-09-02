package defpackage;

/* renamed from: cyx reason: default package */
/* compiled from: PG */
final class cyx extends defpackage.cxi implements java.util.concurrent.RunnableFuture {
    private volatile defpackage.cyg e;

    static defpackage.cyx a(java.util.concurrent.Callable callable) {
        return new defpackage.cyx(callable);
    }

    static defpackage.cyx a(java.lang.Runnable runnable, java.lang.Object obj) {
        return new defpackage.cyx(java.util.concurrent.Executors.callable(runnable, obj));
    }

    private cyx(java.util.concurrent.Callable callable) {
        this.e = new defpackage.cyy(this, callable);
    }

    public final void run() {
        defpackage.cyg cyg = this.e;
        if (cyg != null) {
            cyg.run();
        }
        this.e = null;
    }

    /* access modifiers changed from: protected */
    public final void c() {
        super.c();
        if (b()) {
            defpackage.cyg cyg = this.e;
            if (cyg != null) {
                cyg.d();
            }
        }
        this.e = null;
    }

    /* access modifiers changed from: protected */
    public final java.lang.String d() {
        defpackage.cyg cyg = this.e;
        if (cyg == null) {
            return super.d();
        }
        java.lang.String valueOf = java.lang.String.valueOf(cyg);
        return new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 7).append("task=[").append(valueOf).append("]").toString();
    }
}
