package defpackage;

/* renamed from: egp reason: default package */
/* compiled from: PG */
public final class egp implements java.lang.Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ long b;
    private final /* synthetic */ org.chromium.base.JavaHandlerThread c;

    public egp(org.chromium.base.JavaHandlerThread javaHandlerThread, long j, long j2) {
        this.c = javaHandlerThread;
        this.a = j;
        this.b = j2;
    }

    public final void run() {
        this.c.nativeInitializeThread(this.a, this.b);
    }
}
