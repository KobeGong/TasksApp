package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: drg  reason: default package */
/* compiled from: PG */
public final class drg implements Runnable {
    private final /* synthetic */ Throwable a;
    private final /* synthetic */ dqz b;

    drg(dqz dqz, Throwable th) {
        this.b = dqz;
        this.a = th;
    }

    public final void run() {
        this.b.a.a(this.a);
    }
}
