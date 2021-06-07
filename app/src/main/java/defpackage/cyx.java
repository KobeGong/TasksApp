package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* access modifiers changed from: package-private */
/* renamed from: cyx  reason: default package */
/* compiled from: PG */
public final class cyx extends cxi implements RunnableFuture {
    private volatile cyg e;

    static cyx a(Callable callable) {
        return new cyx(callable);
    }

    static cyx a(Runnable runnable, Object obj) {
        return new cyx(Executors.callable(runnable, obj));
    }

    private cyx(Callable callable) {
        this.e = new cyy(this, callable);
    }

    public final void run() {
        cyg cyg = this.e;
        if (cyg != null) {
            cyg.run();
        }
        this.e = null;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.cwz
    public final void c() {
        cyg cyg;
        super.c();
        if (b() && (cyg = this.e) != null) {
            cyg.d();
        }
        this.e = null;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.cwz
    public final String d() {
        cyg cyg = this.e;
        if (cyg == null) {
            return super.d();
        }
        String valueOf = String.valueOf(cyg);
        return new StringBuilder(String.valueOf(valueOf).length() + 7).append("task=[").append(valueOf).append("]").toString();
    }
}
