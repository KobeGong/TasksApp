package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.PowerManager;
import com.google.android.libraries.notifications.executor.impl.basic.ChimeExecutorApiService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bwt  reason: default package */
/* compiled from: PG */
public final class bwt implements bwq {
    public static final AtomicInteger a = new AtomicInteger();
    public Context b;
    public ExecutorService c;

    @Override // defpackage.bwq
    public final void a(Runnable runnable) {
        this.c.execute(runnable);
    }

    @Override // defpackage.bwq
    public final Future a(Callable callable) {
        return this.c.submit(callable);
    }

    @Override // defpackage.bwq
    public final void b(Runnable runnable) {
        ChimeExecutorApiService.a(this.b, runnable);
    }

    @Override // defpackage.bwq
    public final void a(BroadcastReceiver.PendingResult pendingResult, Runnable runnable) {
        PowerManager powerManager = (PowerManager) this.b.getSystemService("power");
        String valueOf = String.valueOf("ChimeExecutorApi::");
        String valueOf2 = String.valueOf(this.b.getPackageName());
        this.c.execute(new bwu(powerManager.newWakeLock(1, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)), runnable, pendingResult));
    }
}
