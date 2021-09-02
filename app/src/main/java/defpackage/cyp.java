package defpackage;

/* renamed from: cyp reason: default package */
/* compiled from: PG */
final class cyp extends defpackage.cyc implements defpackage.cyk {
    private final java.util.concurrent.ScheduledFuture a;

    public cyp(defpackage.cyi cyi, java.util.concurrent.ScheduledFuture scheduledFuture) {
        super(cyi);
        this.a = scheduledFuture;
    }

    public final boolean cancel(boolean z) {
        boolean cancel = super.cancel(z);
        if (cancel) {
            this.a.cancel(z);
        }
        return cancel;
    }

    public final long getDelay(java.util.concurrent.TimeUnit timeUnit) {
        return this.a.getDelay(timeUnit);
    }

    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        return this.a.compareTo((java.util.concurrent.Delayed) obj);
    }
}
