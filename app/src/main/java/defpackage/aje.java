package defpackage;

/* renamed from: aje reason: default package */
final /* synthetic */ class aje implements java.util.concurrent.ThreadFactory {
    private final java.util.concurrent.ThreadFactory a;
    private final int b = 10;

    aje(java.util.concurrent.ThreadFactory threadFactory) {
        this.a = threadFactory;
    }

    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        return this.a.newThread(new defpackage.ajf(this.b, runnable));
    }
}
