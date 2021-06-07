package defpackage;

/* renamed from: dra  reason: default package */
/* compiled from: PG */
final class dra implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ dqz b;

    dra(dqz dqz, int i) {
        this.b = dqz;
        this.a = i;
    }

    public final void run() {
        if (!this.b.b.b()) {
            try {
                this.b.b.c(this.a);
            } catch (Throwable th) {
                this.b.a.a(th);
                this.b.b.close();
            }
        }
    }
}
