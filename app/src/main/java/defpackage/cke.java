package defpackage;

/* renamed from: cke reason: default package */
/* compiled from: PG */
public final class cke implements defpackage.clt {
    private volatile java.util.concurrent.ScheduledExecutorService a;
    private final /* synthetic */ java.util.concurrent.ScheduledExecutorService b;
    private final /* synthetic */ int c;
    private final /* synthetic */ int d;

    public cke(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, int i, int i2) {
        this.b = scheduledExecutorService;
        this.c = i;
        this.d = i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final java.util.concurrent.ScheduledExecutorService a() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    if (this.b != null) {
                        this.a = defpackage.cdm.a(this.b);
                    } else {
                        int i = this.c;
                        int i2 = this.d;
                        java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new java.util.concurrent.ScheduledThreadPoolExecutor(i2, new defpackage.ckg(i), new defpackage.ckf());
                        scheduledThreadPoolExecutor.setMaximumPoolSize(i2);
                        this.a = defpackage.cdm.a((java.util.concurrent.ScheduledExecutorService) scheduledThreadPoolExecutor);
                    }
                }
            }
        }
        return this.a;
    }
}
