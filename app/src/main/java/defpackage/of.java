package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: of  reason: default package */
/* compiled from: PG */
final class of implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(1);

    of() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "ModernAsyncTask #" + this.a.getAndIncrement());
    }
}
