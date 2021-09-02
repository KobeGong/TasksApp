package defpackage;

/* renamed from: egr reason: default package */
/* compiled from: PG */
public final class egr implements java.lang.Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ org.chromium.base.JavaHandlerThread b;

    public egr(org.chromium.base.JavaHandlerThread javaHandlerThread, long j) {
        this.b = javaHandlerThread;
        this.a = j;
    }

    public final void run() {
        this.b.stopOnThread(this.a);
    }
}
