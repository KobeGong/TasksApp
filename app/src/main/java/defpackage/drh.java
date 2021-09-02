package defpackage;

/* renamed from: drh reason: default package */
/* compiled from: PG */
final class drh implements defpackage.dzr {
    private final java.lang.Runnable a;
    private boolean b = false;
    private final /* synthetic */ defpackage.dqz c;

    drh(defpackage.dqz dqz, java.lang.Runnable runnable) {
        this.c = dqz;
        this.a = runnable;
    }

    public final java.io.InputStream a() {
        if (!this.b) {
            this.a.run();
            this.b = true;
        }
        return (java.io.InputStream) this.c.c.poll();
    }
}
