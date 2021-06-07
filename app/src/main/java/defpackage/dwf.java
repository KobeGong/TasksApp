package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* renamed from: dwf  reason: default package */
/* compiled from: PG */
public final class dwf extends dnc implements dzw {
    private static final Pattern U = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");
    public static final Logger a = Logger.getLogger(dwf.class.getName());
    public static final dpw b = dpw.i.a("Channel shutdown invoked");
    public static final dpw c = dpw.i.a("Subchannel shutdown invoked");
    public final AtomicBoolean A = new AtomicBoolean(false);
    public volatile boolean B;
    public volatile boolean C;
    public final CountDownLatch D = new CountDownLatch(1);
    public final drx E;
    public final drw F;
    public final dsp G;
    public final dyr H = new dyr();
    public dzb I;
    public final int J;
    public final long K;
    public final long L;
    public dyt M;
    public final boolean N;
    public final dvp O = new dwj(this);
    public dwn P;
    public ScheduledFuture Q;
    public dwu R;
    public drn S;
    public final dsx T = new dsx(this);
    private final dol V;
    private final long W;
    private final dnc X;
    private final dxc Y = new dwi(this);
    private ScheduledFuture Z;
    public final dwd d = dwd.a(getClass().getName());
    public final String e;
    public final dpg f;
    public final dmv g;
    public final dtc h;
    public final Executor i;
    public final dxn j;
    public final dso k = new dwg(this);
    public boolean l;
    public final dob m;
    public final dnp n;
    public final csd o;
    public final dti p = new dti();
    public final dro q;
    public final String r;
    public dpf s;
    public dwo t;
    public volatile doq u;
    public boolean v;
    public final Set w = new HashSet(16, 0.75f);
    public final Set x = new HashSet(1, 0.75f);
    public final dtm y;
    public final dwy z = new dwy();

    @Override // defpackage.dzw
    public final dwd b() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2) {
        boolean z3;
        if (z2) {
            cld.b(this.s != null, "nameResolver is null");
            if (this.t != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            cld.b(z3, "lbHelper is null");
        }
        if (this.s != null) {
            if (this.Q != null) {
                this.Q.cancel(false);
                this.R.a = true;
                this.Q = null;
                this.R = null;
                this.S = null;
            }
            this.s.b();
            this.s = null;
        }
        if (this.t != null) {
            this.t.a.a();
            this.t = null;
        }
        this.u = null;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (!this.A.get() && !this.v) {
            if (!this.O.a.isEmpty()) {
                d();
            } else {
                e();
            }
            if (this.t == null) {
                a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImpl", "exitIdleMode", "[{0}] Exiting idle mode", this.d);
                this.t = new dwo(this, this.s);
                this.t.a = this.V.a(this.t);
                dph dph = new dph(this, this.t);
                try {
                    this.s.a(dph);
                } catch (Throwable th) {
                    dph.a(dpw.a(th));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        if (this.Z != null) {
            this.Z.cancel(false);
            this.P.a = true;
            this.Z = null;
            this.P = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        if (this.W != -1) {
            d();
            this.P = new dwn(this);
            this.Z = this.h.a().schedule(new dwc(new dwk(this)), this.W, TimeUnit.MILLISECONDS);
        }
    }

    public dwf(dqv dqv, dtc dtc, dro dro, dxn dxn, csd csd, List list, drx drx) {
        super((byte) 0);
        this.e = (String) cld.a(dqv.e, "target");
        this.f = dqv.d;
        this.g = (dmv) cld.a(dqv.b(), "nameResolverParams");
        this.s = a(this.e, this.f, this.g);
        dol dol = dqv.g;
        this.V = new drk();
        this.j = (dxn) cld.a(dqv.b, "executorPool");
        cld.a(dxn, "oobExecutorPool");
        this.i = (Executor) cld.a((Executor) this.j.a(), "executor");
        this.y = new dtm(this.i, this.k);
        this.y.a(this.Y);
        this.q = dro;
        this.h = new dru(dtc, this.i);
        dnc dwv = new dwv(this);
        this.X = dng.a(dqv.s != null ? dng.a(dwv, dqv.s.d) : dwv, list);
        this.o = (csd) cld.a(csd, "stopwatchSupplier");
        if (dqv.k == -1) {
            this.W = dqv.k;
        } else {
            cld.a(dqv.k >= dqv.a, "invalid idleTimeoutMillis %s", dqv.k);
            this.W = dqv.k;
        }
        this.l = dqv.h;
        this.m = (dob) cld.a(dqv.i, "decompressorRegistry");
        this.n = (dnp) cld.a(dqv.j, "compressorRegistry");
        this.r = dqv.f;
        this.J = dqv.l;
        int i2 = dqv.m;
        this.L = dqv.n;
        this.K = dqv.o;
        this.N = !dqv.p;
        this.E = drx;
        this.F = drx.a();
        this.G = (dsp) cld.a(dqv.q);
        dsp.a(this.G.b, this);
        a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImpl", "<init>", "[{0}] Created with target {1}", new Object[]{this.d, this.e});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r0 == null) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static defpackage.dpf a(java.lang.String r7, defpackage.dpg r8, defpackage.dmv r9) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwf.a(java.lang.String, dpg, dmv):dpf");
    }

    /* access modifiers changed from: package-private */
    public final void a(doq doq) {
        this.u = doq;
        this.y.a(doq);
    }

    @Override // defpackage.dnc
    public final dnd a(dpb dpb, dna dna) {
        return this.X.a(dpb, dna);
    }

    @Override // defpackage.dnc
    public final String a() {
        return this.X.a();
    }

    static dzb a(dmv dmv) {
        return dzh.b((Map) dmv.a(dvb.a));
    }

    public final String toString() {
        return cky.b(this).a("logId", this.d).a("target", this.e).toString();
    }

    static {
        dpw.i.a("Channel shutdownNow invoked");
    }
}
