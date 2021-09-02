package defpackage;

/* renamed from: cyq reason: default package */
/* compiled from: PG */
final class cyq extends defpackage.cwz implements java.lang.Runnable {
    private final java.lang.Runnable e;

    public cyq(java.lang.Runnable runnable) {
        this.e = (java.lang.Runnable) defpackage.cld.a((java.lang.Object) runnable);
    }

    public final void run() {
        try {
            this.e.run();
        } catch (Throwable th) {
            a(th);
            throw defpackage.cse.b(th);
        }
    }
}
