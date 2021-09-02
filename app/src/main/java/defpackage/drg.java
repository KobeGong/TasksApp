package defpackage;

/* renamed from: drg reason: default package */
/* compiled from: PG */
final class drg implements java.lang.Runnable {
    private final /* synthetic */ java.lang.Throwable a;
    private final /* synthetic */ defpackage.dqz b;

    drg(defpackage.dqz dqz, java.lang.Throwable th) {
        this.b = dqz;
        this.a = th;
    }

    public final void run() {
        this.b.a.a(this.a);
    }
}
