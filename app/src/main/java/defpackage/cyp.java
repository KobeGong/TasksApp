package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
/* renamed from: cyp  reason: default package */
/* compiled from: PG */
public final class cyp extends cyc implements cyk {
    private final ScheduledFuture a;

    public cyp(cyi cyi, ScheduledFuture scheduledFuture) {
        super(cyi);
        this.a = scheduledFuture;
    }

    @Override // defpackage.cya
    public final boolean cancel(boolean z) {
        boolean cancel = super.cancel(z);
        if (cancel) {
            this.a.cancel(z);
        }
        return cancel;
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.a.getDelay(timeUnit);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.a.compareTo((Delayed) obj);
    }
}
