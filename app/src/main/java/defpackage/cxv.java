package defpackage;

/* renamed from: cxv reason: default package */
/* compiled from: PG */
final class cxv extends defpackage.cxw {
    private final java.util.concurrent.Callable d;
    private final /* synthetic */ defpackage.cxu e;

    public cxv(defpackage.cxu cxu, java.util.concurrent.Callable callable, java.util.concurrent.Executor executor) {
        this.e = cxu;
        super(cxu, executor);
        this.d = (java.util.concurrent.Callable) defpackage.cld.a((java.lang.Object) callable);
    }

    /* access modifiers changed from: 0000 */
    public final java.lang.Object a() {
        this.b = false;
        return this.d.call();
    }

    /* access modifiers changed from: 0000 */
    public final void a(java.lang.Object obj) {
        this.e.a(obj);
    }

    /* access modifiers changed from: 0000 */
    public final java.lang.String b() {
        return this.d.toString();
    }
}
