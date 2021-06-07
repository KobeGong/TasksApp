package defpackage;

import java.net.SocketAddress;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* access modifiers changed from: package-private */
/* renamed from: dwa  reason: default package */
/* compiled from: PG */
public final class dwa implements dxc {
    private final dth a;
    private final SocketAddress b;
    private final /* synthetic */ dvq c;

    dwa(dvq dvq, dth dth, SocketAddress socketAddress) {
        this.c = dvq;
        this.a = dth;
        this.b = socketAddress;
    }

    @Override // defpackage.dxc
    public final void a() {
        dpw dpw;
        if (dvq.a.isLoggable(Level.FINE)) {
            dvq.a.logp(Level.FINE, "io.grpc.internal.InternalSubchannel$TransportListener", "transportReady", "[{0}] {1} for {2} is ready", new Object[]{this.c.b, this.a.b(), this.b});
        }
        try {
            synchronized (this.c.g) {
                dpw = this.c.t;
                this.c.k = null;
                if (dpw != null) {
                    cld.b(this.c.r == null, "Unexpected non-null activeTransport");
                } else if (this.c.q == this.a) {
                    this.c.a(dnq.READY);
                    this.c.r = this.a;
                    this.c.q = null;
                }
            }
            if (dpw != null) {
                this.a.a(dpw);
            }
        } finally {
            this.c.h.a();
        }
    }

    @Override // defpackage.dxc
    public final void a(boolean z) {
        this.c.a(this.a, z);
    }

    @Override // defpackage.dxc
    public final void a(dpw dpw) {
        if (dvq.a.isLoggable(Level.FINE)) {
            dvq.a.logp(Level.FINE, "io.grpc.internal.InternalSubchannel$TransportListener", "transportShutdown", "[{0}] {1} for {2} is being shutdown with status {3}", new Object[]{this.c.b, this.a.b(), this.b, dpw});
        }
        try {
            synchronized (this.c.g) {
                if (this.c.s.a != dnq.SHUTDOWN) {
                    if (this.c.r == this.a) {
                        this.c.a(dnq.IDLE);
                        this.c.r = null;
                        this.c.j = 0;
                    } else if (this.c.q == this.a) {
                        cld.a(this.c.s.a == dnq.CONNECTING, "Expected state is CONNECTING, actual state is %s", this.c.s.a);
                        this.c.j++;
                        if (this.c.j >= this.c.i.a.size()) {
                            this.c.q = null;
                            this.c.j = 0;
                            dvq dvq = this.c;
                            cld.a(!dpw.a(), "The error status must not be OK");
                            dvq.a(new dnr(dnq.TRANSIENT_FAILURE, dpw));
                            if (dvq.k == null) {
                                dro dro = dvq.c;
                                dvq.k = new drn();
                            }
                            long a2 = dvq.k.a() - dvq.l.a(TimeUnit.NANOSECONDS);
                            if (dvq.a.isLoggable(Level.FINE)) {
                                dvq.a.logp(Level.FINE, "io.grpc.internal.InternalSubchannel", "scheduleBackoff", "[{0}] Scheduling backoff for {1} ns", new Object[]{dvq.b, Long.valueOf(a2)});
                            }
                            cld.b(dvq.m == null, "previous reconnectTask is not done");
                            dvq.n = false;
                            dvq.m = dvq.e.schedule(new dwc(new dvs(dvq)), a2, TimeUnit.NANOSECONDS);
                        } else {
                            this.c.c();
                        }
                    }
                    this.c.h.a();
                }
            }
        } finally {
            this.c.h.a();
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // defpackage.dxc
    public final void b() {
        boolean z;
        if (dvq.a.isLoggable(Level.FINE)) {
            dvq.a.logp(Level.FINE, "io.grpc.internal.InternalSubchannel$TransportListener", "transportTerminated", "[{0}] {1} for {2} is terminated", new Object[]{this.c.b, this.a.b(), this.b});
        }
        dsp.b(this.c.f.d, this.a);
        this.c.a(this.a, false);
        try {
            synchronized (this.c.g) {
                this.c.o.remove(this.a);
                if (this.c.s.a == dnq.SHUTDOWN && this.c.o.isEmpty()) {
                    if (dvq.a.isLoggable(Level.FINE)) {
                        dvq.a.logp(Level.FINE, "io.grpc.internal.InternalSubchannel$TransportListener", "transportTerminated", "[{0}] Terminated in transportTerminated()", this.c.b);
                    }
                    this.c.d();
                }
            }
            this.c.h.a();
            if (this.c.r != this.a) {
                z = true;
            } else {
                z = false;
            }
            cld.b(z, "activeTransport still points to this transport. Seems transportShutdown() was not called.");
        } catch (Throwable th) {
            this.c.h.a();
            throw th;
        }
    }
}
