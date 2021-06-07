package defpackage;

import org.chromium.base.JavaHandlerThread;

/* renamed from: egr  reason: default package */
/* compiled from: PG */
public final class egr implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ JavaHandlerThread b;

    public egr(JavaHandlerThread javaHandlerThread, long j) {
        this.b = javaHandlerThread;
        this.a = j;
    }

    public final void run() {
        this.b.stopOnThread(this.a);
    }
}
