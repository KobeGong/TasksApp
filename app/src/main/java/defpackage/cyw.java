package defpackage;

import java.lang.Thread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: cyw  reason: default package */
/* compiled from: PG */
public final class cyw implements ThreadFactory {
    private final /* synthetic */ ThreadFactory a;
    private final /* synthetic */ String b;
    private final /* synthetic */ AtomicLong c;
    private final /* synthetic */ Boolean d;
    private final /* synthetic */ Integer e = null;
    private final /* synthetic */ Thread.UncaughtExceptionHandler f = null;

    public cyw(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool) {
        this.a = threadFactory;
        this.b = str;
        this.c = atomicLong;
        this.d = bool;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.a.newThread(runnable);
        if (this.b != null) {
            newThread.setName(cyv.a(this.b, Long.valueOf(this.c.getAndIncrement())));
        }
        if (this.d != null) {
            newThread.setDaemon(this.d.booleanValue());
        }
        return newThread;
    }
}
