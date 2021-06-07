package defpackage;

import android.content.res.Resources;
import java.lang.Thread;

/* renamed from: wq  reason: default package */
/* compiled from: PG */
final class wq implements Thread.UncaughtExceptionHandler {
    private final /* synthetic */ Thread.UncaughtExceptionHandler a;

    wq(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        String message;
        boolean z = false;
        if ((th instanceof Resources.NotFoundException) && (message = th.getMessage()) != null && (message.contains("drawable") || message.contains("Drawable"))) {
            z = true;
        }
        if (z) {
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.a.uncaughtException(thread, notFoundException);
            return;
        }
        this.a.uncaughtException(thread, th);
    }
}
