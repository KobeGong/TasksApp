package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: d  reason: default package */
/* compiled from: PG */
public final class d extends e {
    private final Object a = new Object();
    private ExecutorService b = Executors.newFixedThreadPool(2);
    private volatile Handler c;

    @Override // defpackage.e
    public final void a(Runnable runnable) {
        this.b.execute(runnable);
    }

    @Override // defpackage.e
    public final void b(Runnable runnable) {
        if (this.c == null) {
            synchronized (this.a) {
                if (this.c == null) {
                    this.c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.c.post(runnable);
    }

    @Override // defpackage.e
    public final boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
