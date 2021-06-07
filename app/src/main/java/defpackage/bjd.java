package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bjd  reason: default package */
/* compiled from: PG */
public final class bjd implements ThreadFactory {
    private final String a;
    private final AtomicInteger b;
    private final ThreadFactory c;

    public bjd(String str) {
        this(str, (byte) 0);
    }

    private bjd(String str, byte b2) {
        this.b = new AtomicInteger();
        this.c = Executors.defaultThreadFactory();
        this.a = (String) azb.b(str, "Name must not be null");
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.c.newThread(new bje(runnable));
        String str = this.a;
        newThread.setName(new StringBuilder(String.valueOf(str).length() + 13).append(str).append("[").append(this.b.getAndIncrement()).append("]").toString());
        return newThread;
    }
}
