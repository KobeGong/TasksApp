package defpackage;

/* renamed from: clb reason: default package */
/* compiled from: PG */
final class clb implements java.lang.Runnable {
    private final /* synthetic */ java.lang.Runnable a;

    clb(defpackage.cla cla, java.lang.Runnable runnable) {
        this.a = runnable;
    }

    public final void run() {
        try {
            this.a.run();
        } catch (Throwable th) {
            defpackage.cld.a(th);
            throw th;
        }
    }
}
