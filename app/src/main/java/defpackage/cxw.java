package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: cxw  reason: default package */
/* compiled from: PG */
public abstract class cxw extends cyg {
    public final Executor a;
    public boolean b = true;
    public final /* synthetic */ cxu c;

    public cxw(cxu cxu, Executor executor) {
        this.c = cxu;
        this.a = (Executor) cld.a(executor);
    }

    /* access modifiers changed from: package-private */
    public abstract void a(Object obj);

    /* access modifiers changed from: package-private */
    @Override // defpackage.cyg
    public final boolean c() {
        return this.c.isDone();
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cyg
    public final void a(Object obj, Throwable th) {
        if (th == null) {
            a(obj);
        } else if (th instanceof ExecutionException) {
            this.c.a(th.getCause());
        } else if (th instanceof CancellationException) {
            this.c.cancel(false);
        } else {
            this.c.a(th);
        }
    }
}
