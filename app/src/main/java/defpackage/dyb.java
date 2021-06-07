package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* access modifiers changed from: package-private */
/* renamed from: dyb  reason: default package */
/* compiled from: PG */
public abstract class dyb implements dta {
    public static final doy a = doy.a("grpc-retry-pushback-ms", dor.b);
    public static final dpw b = dpw.c.a("Stream thrown away because RetriableStream committed");
    public static Random q = new Random();
    private static final doy r = doy.a("grpc-previous-rpc-attempts", dor.b);
    public final dpb c;
    public final Executor d;
    public final ScheduledExecutorService e;
    public final dyu f;
    public final Object g = new Object();
    public final dyr h;
    public final long i;
    public final long j;
    public final dzb k;
    public volatile dyv l = new dyv(new ArrayList(), Collections.emptySet(), null, false, false);
    public boolean m;
    public long n;
    public Future o;
    public double p;
    private final dor s;
    private dzq t;

    dyb(dpb dpb, dor dor, dyr dyr, long j2, long j3, Executor executor, ScheduledExecutorService scheduledExecutorService, dyu dyu, dzb dzb) {
        this.c = dpb;
        this.h = dyr;
        this.i = j2;
        this.j = j3;
        this.d = executor;
        this.e = scheduledExecutorService;
        this.s = dor;
        this.f = (dyu) cld.a(dyu, "retryPolicy");
        this.p = dyu.b;
        this.k = dzb;
    }

    /* access modifiers changed from: package-private */
    public abstract dpw a();

    /* access modifiers changed from: package-private */
    public abstract dta a(dnm dnm, dor dor);

    /* access modifiers changed from: package-private */
    public abstract void b();

    /* access modifiers changed from: package-private */
    public final Runnable a(dza dza) {
        dye dye = null;
        boolean z = true;
        synchronized (this.g) {
            if (this.l.d == null) {
                Collection collection = this.l.c;
                dyv dyv = this.l;
                cld.b(dyv.d == null, "Already committed");
                List list = dyv.b;
                Set emptySet = Collections.emptySet();
                if (dyv.c.contains(dza)) {
                    emptySet = Collections.singleton(dza);
                    list = null;
                } else {
                    z = false;
                }
                this.l = new dyv(list, emptySet, dza, dyv.e, z);
                this.h.a(-this.n);
                dye = new dye(this, collection, dza);
            }
        }
        return dye;
    }

    /* access modifiers changed from: package-private */
    public final dza d(int i2) {
        dza dza = new dza(i2);
        dyc dyc = new dyc(new dyq(this, dza));
        dor dor = this.s;
        dor dor2 = new dor();
        dor2.a(dor);
        if (i2 > 0) {
            dor2.a(r, String.valueOf(i2));
        }
        dza.a = a(dyc, dor2);
        return dza;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008c, code lost:
        r0 = r1;
        r8 = r0.size();
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0094, code lost:
        if (r7 >= r8) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0096, code lost:
        r2 = r0.get(r7);
        r7 = r7 + 1;
        r2 = (defpackage.dyp) r2;
        r9 = r11.l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a2, code lost:
        if (r9.d == null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a6, code lost:
        if (r9.d != r12) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00aa, code lost:
        if (r9.e == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ae, code lost:
        if (r9.d != r12) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b0, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b1, code lost:
        defpackage.cld.b(r0, "substream should be CANCELLED_BECAUSE_COMMITTED already");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b8, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ba, code lost:
        r2.a(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00be, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(defpackage.dza r12) {
        /*
        // Method dump skipped, instructions count: 193
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyb.b(dza):void");
    }

    @Override // defpackage.dta
    public final void a(dzq dzq) {
        this.t = dzq;
        dpw a2 = a();
        if (a2 != null) {
            b(a2);
            return;
        }
        synchronized (this.g) {
            this.l.b.add(new dyo(this));
        }
        b(d(0));
    }

    @Override // defpackage.dta
    public final void b(dpw dpw) {
        dza dza = new dza(0);
        dza.a = new dxm();
        Runnable a2 = a(dza);
        if (a2 != null) {
            Future future = this.o;
            if (future != null) {
                future.cancel(false);
                this.o = null;
            }
            this.t.b(dpw, new dor());
            a2.run();
            return;
        }
        this.l.d.a.b(dpw);
        synchronized (this.g) {
            dyv dyv = this.l;
            this.l = new dyv(dyv.b, dyv.c, dyv.d, true, dyv.a);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(dyp dyp) {
        Collection<dza> collection;
        synchronized (this.g) {
            if (!this.l.a) {
                this.l.b.add(dyp);
            }
            collection = this.l.c;
        }
        for (dza dza : collection) {
            dyp.a(dza);
        }
    }

    @Override // defpackage.dzp
    public final void a(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // defpackage.dzp
    public final void c(int i2) {
        dyv dyv = this.l;
        if (dyv.a) {
            dyv.d.a.c(i2);
        } else {
            a(new dym(i2));
        }
    }

    @Override // defpackage.dzp
    public final void f() {
        dyv dyv = this.l;
        if (dyv.a) {
            dyv.d.a.f();
        } else {
            a(new dyh());
        }
    }

    @Override // defpackage.dzp
    public final void a(doa doa) {
        a(new dyf(doa));
    }

    @Override // defpackage.dta
    public final void a(boolean z) {
        a(new dyi(z));
    }

    @Override // defpackage.dta
    public final void e() {
        a(new dyj());
    }

    @Override // defpackage.dta
    public final void a(String str) {
        a(new dyd(str));
    }

    @Override // defpackage.dta
    public final void a(dob dob) {
        a(new dyg(dob));
    }

    @Override // defpackage.dta
    public final void b(int i2) {
        a(new dyk(i2));
    }

    @Override // defpackage.dta
    public final void a(int i2) {
        a(new dyl(i2));
    }

    static boolean c() {
        return false;
    }
}
