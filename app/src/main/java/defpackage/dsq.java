package defpackage;

import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
/* renamed from: dsq  reason: default package */
/* compiled from: PG */
public final class dsq extends dnd {
    private static final Logger j = Logger.getLogger(dsq.class.getName());
    private static final byte[] k = "gzip".getBytes(Charset.forName("US-ASCII"));
    public final dpb a;
    public final Executor b;
    public final drw c;
    public final dns d;
    public dta e;
    public volatile boolean f;
    public boolean g;
    public dob h = dob.a;
    public dnp i = dnp.a;
    private volatile ScheduledFuture l;
    private final boolean m;
    private final dna n;
    private final boolean o;
    private boolean p;
    private boolean q;
    private final dsx r;
    private final dnu s = new dsy(this);
    private ScheduledExecutorService t;

    dsq(dpb dpb, Executor executor, dna dna, dsx dsx, ScheduledExecutorService scheduledExecutorService, drw drw, boolean z) {
        Executor dzd;
        this.a = dpb;
        if (executor == cyn.INSTANCE) {
            dzd = new dzc();
        } else {
            dzd = new dzd(executor);
        }
        this.b = dzd;
        this.c = drw;
        this.d = dns.a();
        this.m = dpb.a == dpe.UNARY || dpb.a == dpe.SERVER_STREAMING;
        this.n = dna;
        this.r = dsx;
        this.t = scheduledExecutorService;
        this.o = z;
    }

    @Override // defpackage.dnd
    public final void a(dne dne, dor dor) {
        doa doa;
        dyu dyu;
        cld.b(this.e == null, "Already started");
        cld.b(!this.p, "call was cancelled");
        cld.a(dne, "observer");
        cld.a(dor, "headers");
        this.d.d();
        String str = this.n.f;
        if (str != null) {
            doa doa2 = (doa) this.i.b.get(str);
            if (doa2 == null) {
                this.e = dxm.a;
                this.b.execute(new dsr(this, dne, str));
                return;
            }
            doa = doa2;
        } else {
            doa = dno.a;
        }
        dob dob = this.h;
        boolean z = this.g;
        dor.b(dvc.c);
        if (doa != dno.a) {
            dor.a(dvc.c, doa.a());
        }
        dor.b(dvc.d);
        byte[] bArr = dob.c;
        if (bArr.length != 0) {
            dor.a(dvc.d, bArr);
        }
        dor.b(dvc.e);
        dor.b(dvc.f);
        if (z) {
            dor.a(dvc.f, k);
        }
        dny c2 = c();
        if (!(c2 != null && c2.a())) {
            dny dny = this.n.b;
            this.d.e();
            dor.b(dvc.b);
            if (c2 != null) {
                long max = Math.max(0L, c2.b(TimeUnit.NANOSECONDS));
                dor.a(dvc.b, Long.valueOf(max));
                if (j.isLoggable(Level.FINE) && c2 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(String.format("Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(max)));
                    if (dny == null) {
                        sb.append(" Explicit call timeout was not set.");
                    } else {
                        sb.append(String.format(" Explicit call timeout was '%d' ns.", Long.valueOf(dny.b(TimeUnit.NANOSECONDS))));
                    }
                    j.logp(Level.FINE, "io.grpc.internal.ClientCallImpl", "logIfContextNarrowedTimeout", sb.toString());
                }
            }
            if (this.o) {
                dsx dsx = this.r;
                dpb dpb = this.a;
                dna dna = this.n;
                dns dns = this.d;
                cld.b(dsx.a.N, "retry should be enabled");
                if (dsx.a.M == null) {
                    dyu = dyu.f;
                } else {
                    dyt dyt = dsx.a.M;
                    dyu dyu2 = (dyu) dyt.a.get(dpb.b);
                    if (dyu2 == null) {
                        dyu2 = (dyu) dyt.b.get(dpb.a(dpb.b));
                    }
                    if (dyu2 == null) {
                        dyu2 = dyu.f;
                    }
                    dyu = dyu2;
                }
                dyr dyr = dsx.a.H;
                long j2 = dsx.a.K;
                long j3 = dsx.a.L;
                dwf dwf = dsx.a;
                Executor executor = dna.c;
                if (executor == null) {
                    executor = dwf.i;
                }
                this.e = new dwm(dsx, dpb, dor, dyr, j2, j3, executor, dsx.a.h.a(), dyu, dsx.a.I, dna, dpb, dns);
            } else {
                dtb a2 = this.r.a(new dxp(this.a, dor, this.n));
                dns c3 = this.d.c();
                try {
                    this.e = a2.a(this.a, dor, this.n);
                } finally {
                    this.d.a(c3);
                }
            }
        } else {
            dpw dpw = dpw.e;
            String valueOf = String.valueOf(c2);
            this.e = new duu(dpw.a(new StringBuilder(String.valueOf(valueOf).length() + 19).append("deadline exceeded: ").append(valueOf).toString()));
        }
        if (this.n.d != null) {
            this.e.a(this.n.d);
        }
        if (this.n.j != null) {
            this.e.b(this.n.j.intValue());
        }
        if (this.n.k != null) {
            this.e.a(this.n.k.intValue());
        }
        this.e.a(doa);
        this.e.a(this.g);
        this.e.a(this.h);
        this.c.a();
        this.e.a(new dss(this, dne));
        dns dns2 = this.d;
        dnu dnu = this.s;
        cyn cyn = cyn.INSTANCE;
        dns.a(dnu, "cancellationListener");
        dns.a(cyn, "executor");
        dns2.b();
        if (!(c2 == null || this.d.e() == c2 || this.t == null)) {
            long b2 = c2.b(TimeUnit.NANOSECONDS);
            this.l = this.t.schedule(new dwc(new dsz(this, b2)), b2, TimeUnit.NANOSECONDS);
        }
        if (this.f) {
            b();
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.d.b();
        ScheduledFuture scheduledFuture = this.l;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* access modifiers changed from: package-private */
    public final dny c() {
        dny dny = this.n.b;
        this.d.e();
        if (dny == null) {
            return null;
        }
        return dny;
    }

    @Override // defpackage.dnd
    public final void a(int i2) {
        boolean z;
        boolean z2 = true;
        if (this.e != null) {
            z = true;
        } else {
            z = false;
        }
        cld.b(z, "Not started");
        if (i2 < 0) {
            z2 = false;
        }
        cld.a(z2, "Number requested must be non-negative");
        this.e.c(i2);
    }

    @Override // defpackage.dnd
    public final void a(String str, Throwable th) {
        dpw a2;
        if (str == null && th == null) {
            CancellationException cancellationException = new CancellationException("Cancelled without a message or cause");
            j.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancel", "Cancelling without a message or cause is suboptimal", (Throwable) cancellationException);
            th = cancellationException;
        }
        if (!this.p) {
            this.p = true;
            try {
                if (this.e != null) {
                    dpw dpw = dpw.c;
                    if (str != null) {
                        a2 = dpw.a(str);
                    } else {
                        a2 = dpw.a("Call cancelled without message");
                    }
                    if (th != null) {
                        a2 = a2.b(th);
                    }
                    this.e.b(a2);
                }
            } finally {
                b();
            }
        }
    }

    @Override // defpackage.dnd
    public final void a() {
        boolean z;
        boolean z2 = false;
        cld.b(this.e != null, "Not started");
        if (!this.p) {
            z = true;
        } else {
            z = false;
        }
        cld.b(z, "call was cancelled");
        if (!this.q) {
            z2 = true;
        }
        cld.b(z2, "call already half-closed");
        this.q = true;
        this.e.e();
    }

    @Override // defpackage.dnd
    public final void a(Object obj) {
        boolean z;
        boolean z2 = true;
        cld.b(this.e != null, "Not started");
        if (!this.p) {
            z = true;
        } else {
            z = false;
        }
        cld.b(z, "call was cancelled");
        if (this.q) {
            z2 = false;
        }
        cld.b(z2, "call was half-closed");
        try {
            if (this.e instanceof dyb) {
                dyb dyb = (dyb) this.e;
                dyv dyv = dyb.l;
                if (dyv.a) {
                    dyv.d.a.a(dyb.c.a(obj));
                } else {
                    dyb.a(new dyn(dyb, obj));
                }
            } else {
                this.e.a(this.a.a(obj));
            }
            if (!this.m) {
                this.e.f();
            }
        } catch (RuntimeException e2) {
            this.e.b(dpw.c.b(e2).a("Failed to stream message"));
        } catch (Error e3) {
            this.e.b(dpw.c.a("Client sendMessage() failed with Error"));
            throw e3;
        }
    }

    static void a(dne dne, dpw dpw, dor dor) {
        dne.a(dpw, dor);
    }
}
