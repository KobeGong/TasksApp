package defpackage;

/* renamed from: cxw reason: default package */
/* compiled from: PG */
abstract class cxw extends defpackage.cyg {
    public final java.util.concurrent.Executor a;
    public boolean b = true;
    public final /* synthetic */ defpackage.cxu c;

    public cxw(defpackage.cxu cxu, java.util.concurrent.Executor executor) {
        this.c = cxu;
        this.a = (java.util.concurrent.Executor) defpackage.cld.a((java.lang.Object) executor);
    }

    /* access modifiers changed from: 0000 */
    public abstract void a(java.lang.Object obj);

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        return this.c.isDone();
    }

    /* access modifiers changed from: 0000 */
    public final void a(java.lang.Object obj, java.lang.Throwable th) {
        if (th == null) {
            a(obj);
        } else if (th instanceof java.util.concurrent.ExecutionException) {
            this.c.a(th.getCause());
        } else if (th instanceof java.util.concurrent.CancellationException) {
            this.c.cancel(false);
        } else {
            this.c.a(th);
        }
    }
}
