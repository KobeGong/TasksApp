package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ckg  reason: default package */
/* compiled from: PG */
public final class ckg implements ThreadFactory {
    public final int a;
    private final AtomicInteger b;
    private final String c;

    public ckg(int i) {
        this("Primes", i);
    }

    public ckg(String str, int i) {
        this.b = new AtomicInteger(1);
        this.a = i;
        this.c = str;
    }

    public final Thread newThread(Runnable runnable) {
        ckh ckh = new ckh(this, runnable);
        String str = this.c;
        Thread thread = new Thread(ckh, new StringBuilder(String.valueOf(str).length() + 12).append(str).append("-").append(this.b.getAndIncrement()).toString());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
