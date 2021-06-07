package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: cke  reason: default package */
/* compiled from: PG */
public final class cke implements clt {
    private volatile ScheduledExecutorService a;
    private final /* synthetic */ ScheduledExecutorService b;
    private final /* synthetic */ int c;
    private final /* synthetic */ int d;

    public cke(ScheduledExecutorService scheduledExecutorService, int i, int i2) {
        this.b = scheduledExecutorService;
        this.c = i;
        this.d = i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final ScheduledExecutorService a() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    if (this.b != null) {
                        this.a = cdm.a(this.b);
                    } else {
                        int i = this.c;
                        int i2 = this.d;
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(i2, new ckg(i), new ckf());
                        scheduledThreadPoolExecutor.setMaximumPoolSize(i2);
                        this.a = cdm.a(scheduledThreadPoolExecutor);
                    }
                }
            }
        }
        return this.a;
    }
}
