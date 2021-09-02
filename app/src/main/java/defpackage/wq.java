package defpackage;

/* renamed from: wq reason: default package */
/* compiled from: PG */
final class wq implements java.lang.Thread.UncaughtExceptionHandler {
    private final /* synthetic */ java.lang.Thread.UncaughtExceptionHandler a;

    wq(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        boolean z = false;
        if (th instanceof android.content.res.Resources.NotFoundException) {
            java.lang.String message = th.getMessage();
            if (message != null && (message.contains("drawable") || message.contains("Drawable"))) {
                z = true;
            }
        }
        if (z) {
            android.content.res.Resources.NotFoundException notFoundException = new android.content.res.Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.a.uncaughtException(thread, notFoundException);
            return;
        }
        this.a.uncaughtException(thread, th);
    }
}
