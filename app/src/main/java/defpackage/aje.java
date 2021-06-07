package defpackage;

import java.util.concurrent.ThreadFactory;

/* access modifiers changed from: package-private */
/* renamed from: aje  reason: default package */
public final /* synthetic */ class aje implements ThreadFactory {
    private final ThreadFactory a;
    private final int b = 10;

    aje(ThreadFactory threadFactory) {
        this.a = threadFactory;
    }

    public final Thread newThread(Runnable runnable) {
        return this.a.newThread(new ajf(this.b, runnable));
    }
}
