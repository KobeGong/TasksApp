package defpackage;

/* renamed from: dws reason: default package */
/* compiled from: PG */
public final class dws implements java.lang.Runnable {
    private final /* synthetic */ defpackage.dpw a;
    private final /* synthetic */ defpackage.dph b;

    public dws(defpackage.dph dph, defpackage.dpw dpw) {
        this.b = dph;
        this.a = dpw;
    }

    public final void run() {
        if (this.b.a == this.b.b.t) {
            this.b.a.a.a(this.a);
            if (this.b.b.Q == null) {
                if (this.b.b.S == null) {
                    defpackage.dwf dwf = this.b.b;
                    defpackage.dro dro = this.b.b.q;
                    dwf.S = new defpackage.drn();
                }
                long a2 = this.b.b.S.a();
                if (defpackage.dwf.a.isLoggable(java.util.logging.Level.FINE)) {
                    defpackage.dwf.a.log(java.util.logging.Level.FINE, "[{0}] Scheduling DNS resolution backoff for {1} ns", new java.lang.Object[]{this.b.b.d, java.lang.Long.valueOf(a2)});
                }
                this.b.b.R = new defpackage.dwu(this.b.b);
                this.b.b.Q = this.b.b.h.a().schedule(this.b.b.R, a2, java.util.concurrent.TimeUnit.NANOSECONDS);
            }
        }
    }
}
