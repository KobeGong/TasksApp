package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: clb  reason: default package */
/* compiled from: PG */
public final class clb implements Runnable {
    private final /* synthetic */ Runnable a;

    clb(cla cla, Runnable runnable) {
        this.a = runnable;
    }

    public final void run() {
        try {
            this.a.run();
        } catch (Throwable th) {
            cld.a(th);
            throw th;
        }
    }
}
