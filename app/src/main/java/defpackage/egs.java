package defpackage;

/* renamed from: egs reason: default package */
/* compiled from: PG */
public final class egs implements java.lang.Thread.UncaughtExceptionHandler {
    private final /* synthetic */ org.chromium.base.JavaHandlerThread a;

    public egs(org.chromium.base.JavaHandlerThread javaHandlerThread) {
        this.a = javaHandlerThread;
    }

    public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        this.a.b = th;
    }
}
