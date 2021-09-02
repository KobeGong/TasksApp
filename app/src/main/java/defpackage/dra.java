package defpackage;

/* renamed from: dra reason: default package */
/* compiled from: PG */
final class dra implements java.lang.Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ defpackage.dqz b;

    dra(defpackage.dqz dqz, int i) {
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
