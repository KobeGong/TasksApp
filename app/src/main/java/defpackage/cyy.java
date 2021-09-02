package defpackage;

/* renamed from: cyy reason: default package */
/* compiled from: PG */
final class cyy extends defpackage.cyg {
    private final java.util.concurrent.Callable a;
    private final /* synthetic */ defpackage.cyx b;

    cyy(defpackage.cyx cyx, java.util.concurrent.Callable callable) {
        this.b = cyx;
        this.a = (java.util.concurrent.Callable) defpackage.cld.a((java.lang.Object) callable);
    }

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        return this.b.isDone();
    }

    /* access modifiers changed from: 0000 */
    public final java.lang.Object a() {
        return this.a.call();
    }

    /* access modifiers changed from: 0000 */
    public final void a(java.lang.Object obj, java.lang.Throwable th) {
        if (th == null) {
            this.b.a(obj);
        } else {
            this.b.a(th);
        }
    }

    /* access modifiers changed from: 0000 */
    public final java.lang.String b() {
        return this.a.toString();
    }
}
