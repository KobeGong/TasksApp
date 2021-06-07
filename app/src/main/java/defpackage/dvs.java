package defpackage;

import java.util.logging.Level;

/* renamed from: dvs  reason: default package */
/* compiled from: PG */
final class dvs implements Runnable {
    private final /* synthetic */ dvq a;

    dvs(dvq dvq) {
        this.a = dvq;
    }

    public final void run() {
        try {
            synchronized (this.a.g) {
                this.a.m = null;
                if (!this.a.n) {
                    this.a.a(dnq.CONNECTING);
                    this.a.c();
                    this.a.h.a();
                }
            }
        } catch (Throwable th) {
            dvq.a.logp(Level.WARNING, "io.grpc.internal.InternalSubchannel$1EndOfCurrentBackoff", "run", "Exception handling end of backoff", th);
        } finally {
            this.a.h.a();
        }
    }
}
