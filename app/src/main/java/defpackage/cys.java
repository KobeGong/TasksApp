package defpackage;

/* renamed from: cys  reason: default package */
/* compiled from: PG */
final class cys implements Runnable {
    private final /* synthetic */ Runnable a;

    cys(Runnable runnable) {
        this.a = runnable;
    }

    public final void run() {
        this.a.run();
    }
}
