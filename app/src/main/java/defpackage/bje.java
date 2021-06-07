package defpackage;

import android.os.Process;

/* renamed from: bje  reason: default package */
/* compiled from: PG */
final class bje implements Runnable {
    private final Runnable a;

    public bje(Runnable runnable) {
        this.a = runnable;
    }

    public final void run() {
        Process.setThreadPriority(0);
        this.a.run();
    }
}
