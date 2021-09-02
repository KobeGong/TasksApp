package defpackage;

/* renamed from: dvs reason: default package */
/* compiled from: PG */
final class dvs implements java.lang.Runnable {
    private final /* synthetic */ defpackage.dvq a;

    dvs(defpackage.dvq dvq) {
        this.a = dvq;
    }

    public final void run() {
        try {
            synchronized (this.a.g) {
                this.a.m = null;
                if (this.a.n) {
                    this.a.h.a();
                    return;
                }
                this.a.a(defpackage.dnq.CONNECTING);
                this.a.c();
                this.a.h.a();
            }
        } catch (Throwable th) {
            try {
                defpackage.dvq.a.logp(java.util.logging.Level.WARNING, "io.grpc.internal.InternalSubchannel$1EndOfCurrentBackoff", "run", "Exception handling end of backoff", th);
            } finally {
                this.a.h.a();
            }
        }
    }
}
