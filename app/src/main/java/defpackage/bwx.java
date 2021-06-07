package defpackage;

import android.os.PowerManager;
import com.google.android.libraries.notifications.executor.impl.basic.ChimeExecutorApiService;

/* renamed from: bwx  reason: default package */
/* compiled from: PG */
public final class bwx implements Runnable {
    public final /* synthetic */ ChimeExecutorApiService a;
    private final /* synthetic */ PowerManager.WakeLock b;
    private final /* synthetic */ Runnable c;

    public bwx(ChimeExecutorApiService chimeExecutorApiService, PowerManager.WakeLock wakeLock, Runnable runnable) {
        this.a = chimeExecutorApiService;
        this.b = wakeLock;
        this.c = runnable;
    }

    public final void run() {
        try {
            this.b.acquire();
            this.c.run();
        } finally {
            this.b.release();
            cky.a((Runnable) new bwy(this));
        }
    }
}
