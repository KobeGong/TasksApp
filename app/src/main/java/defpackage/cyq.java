package defpackage;

/* renamed from: cyq  reason: default package */
/* compiled from: PG */
final class cyq extends cwz implements Runnable {
    private final Runnable e;

    public cyq(Runnable runnable) {
        this.e = (Runnable) cld.a(runnable);
    }

    public final void run() {
        try {
            this.e.run();
        } catch (Throwable th) {
            a(th);
            throw cse.b(th);
        }
    }
}
