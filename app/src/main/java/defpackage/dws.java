package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: dws  reason: default package */
/* compiled from: PG */
public final class dws implements Runnable {
    private final /* synthetic */ dpw a;
    private final /* synthetic */ dph b;

    public dws(dph dph, dpw dpw) {
        this.b = dph;
        this.a = dpw;
    }

    public final void run() {
        if (this.b.a == this.b.b.t) {
            this.b.a.a.a(this.a);
            if (this.b.b.Q == null) {
                if (this.b.b.S == null) {
                    dwf dwf = this.b.b;
                    dro dro = this.b.b.q;
                    dwf.S = new drn();
                }
                long a2 = this.b.b.S.a();
                if (dwf.a.isLoggable(Level.FINE)) {
                    dwf.a.log(Level.FINE, "[{0}] Scheduling DNS resolution backoff for {1} ns", new Object[]{this.b.b.d, Long.valueOf(a2)});
                }
                this.b.b.R = new dwu(this.b.b);
                this.b.b.Q = this.b.b.h.a().schedule(this.b.b.R, a2, TimeUnit.NANOSECONDS);
            }
        }
    }
}
