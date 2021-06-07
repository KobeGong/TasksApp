package defpackage;

import com.google.android.libraries.notifications.executor.impl.basic.ChimeExecutorApiService;

/* renamed from: bwy  reason: default package */
/* compiled from: PG */
final class bwy implements Runnable {
    private final /* synthetic */ bwx a;

    bwy(bwx bwx) {
        this.a = bwx;
    }

    public final void run() {
        ChimeExecutorApiService chimeExecutorApiService = this.a.a;
        chimeExecutorApiService.b--;
        this.a.a.a();
    }
}
