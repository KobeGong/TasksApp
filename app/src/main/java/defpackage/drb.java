package defpackage;

/* renamed from: drb  reason: default package */
/* compiled from: PG */
final class drb implements Runnable {
    private final /* synthetic */ dxv a;
    private final /* synthetic */ dqz b;

    drb(dqz dqz, dxv dxv) {
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
