package defpackage;

/* renamed from: drb reason: default package */
/* compiled from: PG */
final class drb implements java.lang.Runnable {
    private final /* synthetic */ defpackage.dxv a;
    private final /* synthetic */ defpackage.dqz b;

    drb(defpackage.dqz dqz, defpackage.dxv dxv) {
        this.b = dqz;
        this.a = dxv;
    }

    public final void run() {
        try {
            this.b.b.a(this.a);
        } catch (Throwable th) {
            this.b.a(th);
            this.b.b.close();
        }
    }
}
