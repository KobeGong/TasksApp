package defpackage;

import java.lang.Thread;
import org.chromium.base.JavaHandlerThread;

/* renamed from: egs  reason: default package */
/* compiled from: PG */
public final class egs implements Thread.UncaughtExceptionHandler {
    private final /* synthetic */ JavaHandlerThread a;

    public egs(JavaHandlerThread javaHandlerThread) {
        this.a = javaHandlerThread;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        this.a.b = th;
    }
}
