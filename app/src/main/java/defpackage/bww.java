package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.notifications.executor.impl.basic.ChimeExecutorApiService;

/* renamed from: bww  reason: default package */
/* compiled from: PG */
public final class bww implements Runnable {
    private final /* synthetic */ Runnable a;
    private final /* synthetic */ Context b;

    public bww(Runnable runnable, Context context) {
        this.a = runnable;
        this.b = context;
    }

    public final void run() {
        ChimeExecutorApiService.a.add(this.a);
        Intent intent = new Intent(this.b, ChimeExecutorApiService.class);
        intent.setAction("ACTION_NEW_TASK");
        this.b.startService(intent);
    }
}
