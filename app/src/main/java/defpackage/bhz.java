package defpackage;

import android.content.BroadcastReceiver;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
/* renamed from: bhz  reason: default package */
/* compiled from: PG */
public final class bhz {
    public final Intent a;
    private final BroadcastReceiver.PendingResult b;
    private boolean c = false;
    private final ScheduledFuture d;

    bhz(Intent intent, BroadcastReceiver.PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.a = intent;
        this.b = pendingResult;
        this.d = scheduledExecutorService.schedule(new bia(this, intent), 9500, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        if (!this.c) {
            this.b.finish();
            this.d.cancel(false);
            this.c = true;
        }
    }
}
