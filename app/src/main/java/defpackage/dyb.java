package defpackage;

/* renamed from: dyb reason: default package */
/* compiled from: PG */
abstract class dyb implements defpackage.dta {
    public static final defpackage.doy a = defpackage.doy.a("grpc-retry-pushback-ms", defpackage.dor.b);
    public static final defpackage.dpw b = defpackage.dpw.c.a("Stream thrown away because RetriableStream committed");
    public static java.util.Random q = new java.util.Random();
    private static final defpackage.doy r = defpackage.doy.a("grpc-previous-rpc-attempts", defpackage.dor.b);
    public final defpackage.dpb c;
    public final java.util.concurrent.Executor d;
    public final java.util.concurrent.ScheduledExecutorService e;
    public final defpackage.dyu f;
    public final java.lang.Object g = new java.lang.Object();
    public final defpackage.dyr h;
    public final long i;
    public final long j;
    public final defpackage.dzb k;
    public volatile defpackage.dyv l = new defpackage.dyv(new java.util.ArrayList(), java.util.Collections.emptySet(), null, false, false);
    public boolean m;
    public long n;
    public java.util.concurrent.Future o;
    public double p;
    private final defpackage.dor s;
    /* access modifiers changed from: private */
    public defpackage.dzq t;

    dyb(defpackage.dpb dpb, defpackage.dor dor, defpackage.dyr dyr, long j2, long j3, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.dyu dyu, defpackage.dzb dzb) {
        this.c = dpb;
        this.h = dyr;
        this.i = j2;
        this.j = j3;
        this.d = executor;
        this.e = scheduledExecutorService;
        this.s = dor;
        this.f = (defpackage.dyu) defpackage.cld.a((java.lang.Object) dyu, (java.lang.Object) "retryPolicy");
        this.p = dyu.b;
        this.k = dzb;
    }

    /* access modifiers changed from: 0000 */
    public abstract defpackage.dpw a();

    /* access modifiers changed from: 0000 */
    public abstract defpackage.dta a(defpackage.dnm dnm, defpackage.dor dor);

    /* access modifiers changed from: 0000 */
    public abstract void b();

    /* access modifiers changed from: 0000 */
    public final java.lang.Runnable a(defpackage.dza dza) {
        defpackage.dye dye = null;
        boolean z = true;
        synchronized (this.g) {
            if (this.l.d == null) {
                java.util.Collection collection = this.l.c;
                defpackage.dyv dyv = this.l;
                defpackage.cld.b(dyv.d == null, (java.lang.Object) "Already committed");
                java.util.List list = dyv.b;
                java.util.Set emptySet = java.util.Collections.emptySet();
                if (dyv.c.contains(dza)) {
                    emptySet = java.util.Collections.singleton(dza);
                    list = null;
                } else {
                    z = false;
                }
                this.l = new defpackage.dyv(list, emptySet, dza, dyv.e, z);
                this.h.a(-this.n);
                dye = new defpackage.dye(this, collection, dza);
            }
        }
        return dye;
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.dza d(int i2) {
        defpackage.dza dza = new defpackage.dza(i2);
        defpackage.dyc dyc = new defpackage.dyc(new defpackage.dyq(this, dza));
        defpackage.dor dor = this.s;
        defpackage.dor dor2 = new defpackage.dor();
        dor2.a(dor);
        if (i2 > 0) {
            dor2.a(r, (java.lang.Object) java.lang.String.valueOf(i2));
        }
        dza.a = a(dyc, dor2);
        return dza;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008c, code lost:
        r0 = (java.util.ArrayList) r1;
        r8 = r0.size();
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0094, code lost:
        if (r7 >= r8) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0096, code lost:
        r2 = r0.get(r7);
        r7 = r7 + 1;
        r2 = (defpackage.dyp) r2;
        r9 = r11.l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a2, code lost:
        if (r9.d == null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a6, code lost:
        if (r9.d != r12) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00aa, code lost:
        if (r9.e == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ae, code lost:
        if (r9.d != r12) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b0, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b1, code lost:
        defpackage.cld.b(r0, (java.lang.Object) "substream should be CANCELLED_BECAUSE_COMMITTED already");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00b8, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ba, code lost:
        r2.a(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00be, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(defpackage.dza r12) {
        /*
            r11 = this;
            r6 = 0
            r3 = 1
            r4 = 0
            r1 = r6
            r0 = r4
        L_0x0005:
            java.lang.Object r7 = r11.g
            monitor-enter(r7)
            dyv r8 = r11.l     // Catch:{ all -> 0x005b }
            dza r2 = r8.d     // Catch:{ all -> 0x005b }
            if (r2 == 0) goto L_0x001b
            dza r2 = r8.d     // Catch:{ all -> 0x005b }
            if (r2 == r12) goto L_0x001b
            monitor-exit(r7)     // Catch:{ all -> 0x005b }
            dta r0 = r12.a
            dpw r1 = b
            r0.b(r1)
        L_0x001a:
            return
        L_0x001b:
            java.util.List r2 = r8.b     // Catch:{ all -> 0x005b }
            int r2 = r2.size()     // Catch:{ all -> 0x005b }
            if (r0 != r2) goto L_0x0064
            boolean r0 = r8.a     // Catch:{ all -> 0x005b }
            if (r0 != 0) goto L_0x005e
            r0 = r3
        L_0x0028:
            java.lang.String r1 = "Already passThrough"
            defpackage.cld.b(r0, r1)     // Catch:{ all -> 0x005b }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x005b }
            java.util.Collection r0 = r8.c     // Catch:{ all -> 0x005b }
            r2.<init>(r0)     // Catch:{ all -> 0x005b }
            boolean r0 = r12.b     // Catch:{ all -> 0x005b }
            if (r0 != 0) goto L_0x003b
            r2.add(r12)     // Catch:{ all -> 0x005b }
        L_0x003b:
            dza r0 = r8.d     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x0060
            r5 = r3
        L_0x0040:
            java.util.List r1 = r8.b     // Catch:{ all -> 0x005b }
            if (r5 == 0) goto L_0x004e
            dza r0 = r8.d     // Catch:{ all -> 0x005b }
            if (r0 != r12) goto L_0x0062
        L_0x0048:
            java.lang.String r0 = "Another RPC attempt has already committed"
            defpackage.cld.b(r3, r0)     // Catch:{ all -> 0x005b }
            r1 = r6
        L_0x004e:
            dyv r0 = new dyv     // Catch:{ all -> 0x005b }
            dza r3 = r8.d     // Catch:{ all -> 0x005b }
            boolean r4 = r8.e     // Catch:{ all -> 0x005b }
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x005b }
            r11.l = r0     // Catch:{ all -> 0x005b }
            monitor-exit(r7)     // Catch:{ all -> 0x005b }
            goto L_0x001a
        L_0x005b:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x005b }
            throw r0
        L_0x005e:
            r0 = r4
            goto L_0x0028
        L_0x0060:
            r5 = r4
            goto L_0x0040
        L_0x0062:
            r3 = r4
            goto L_0x0048
        L_0x0064:
            boolean r2 = r12.b     // Catch:{ all -> 0x005b }
            if (r2 == 0) goto L_0x006a
            monitor-exit(r7)     // Catch:{ all -> 0x005b }
            goto L_0x001a
        L_0x006a:
            int r2 = r0 + 128
            java.util.List r5 = r8.b     // Catch:{ all -> 0x005b }
            int r5 = r5.size()     // Catch:{ all -> 0x005b }
            int r5 = java.lang.Math.min(r2, r5)     // Catch:{ all -> 0x005b }
            if (r1 != 0) goto L_0x007f
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x005b }
            int r2 = r5 - r0
            r1.<init>(r2)     // Catch:{ all -> 0x005b }
        L_0x007f:
            r1.clear()     // Catch:{ all -> 0x005b }
            java.util.List r2 = r8.b     // Catch:{ all -> 0x005b }
            java.util.List r0 = r2.subList(r0, r5)     // Catch:{ all -> 0x005b }
            r1.addAll(r0)     // Catch:{ all -> 0x005b }
            monitor-exit(r7)     // Catch:{ all -> 0x005b }
            r0 = r1
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r8 = r0.size()
            r7 = r4
        L_0x0094:
            if (r7 >= r8) goto L_0x00be
            java.lang.Object r2 = r0.get(r7)
            int r7 = r7 + 1
            dyp r2 = (defpackage.dyp) r2
            dyv r9 = r11.l
            dza r10 = r9.d
            if (r10 == 0) goto L_0x00a8
            dza r10 = r9.d
            if (r10 != r12) goto L_0x00be
        L_0x00a8:
            boolean r10 = r9.e
            if (r10 == 0) goto L_0x00ba
            dza r0 = r9.d
            if (r0 != r12) goto L_0x00b8
            r0 = r3
        L_0x00b1:
            java.lang.String r1 = "substream should be CANCELLED_BECAUSE_COMMITTED already"
            defpackage.cld.b(r0, r1)
            goto L_0x001a
        L_0x00b8:
            r0 = r4
            goto L_0x00b1
        L_0x00ba:
            r2.a(r12)
            goto L_0x0094
        L_0x00be:
            r0 = r5
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyb.b(dza):void");
    }

    public final void a(defpackage.dzq dzq) {
        this.t = dzq;
        defpackage.dpw a2 = a();
        if (a2 != null) {
            b(a2);
            return;
        }
        synchronized (this.g) {
            this.l.b.add(new defpackage.dyo(this));
        }
        b(d(0));
    }

    public final void b(defpackage.dpw dpw) {
        defpackage.dza dza = new defpackage.dza(0);
        dza.a = new defpackage.dxm();
        java.lang.Runnable a2 = a(dza);
        if (a2 != null) {
            java.util.concurrent.Future future = this.o;
            if (future != null) {
                future.cancel(false);
                this.o = null;
            }
            this.t.b(dpw, new defpackage.dor());
            a2.run();
            return;
        }
        this.l.d.a.b(dpw);
        synchronized (this.g) {
            defpackage.dyv dyv = this.l;
            this.l = new defpackage.dyv(dyv.b, dyv.c, dyv.d, true, dyv.a);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.dyp dyp) {
        java.util.Collection<defpackage.dza> collection;
        synchronized (this.g) {
            if (!this.l.a) {
                this.l.b.add(dyp);
            }
            collection = this.l.c;
        }
        for (defpackage.dza a2 : collection) {
            dyp.a(a2);
        }
    }

    public final void a(java.io.InputStream inputStream) {
        throw new java.lang.IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    public final void c(int i2) {
        defpackage.dyv dyv = this.l;
        if (dyv.a) {
            dyv.d.a.c(i2);
        } else {
            a((defpackage.dyp) new defpackage.dym(i2));
        }
    }

    public final void f() {
        defpackage.dyv dyv = this.l;
        if (dyv.a) {
            dyv.d.a.f();
        } else {
            a((defpackage.dyp) new defpackage.dyh());
        }
    }

    public final void a(defpackage.doa doa) {
        a((defpackage.dyp) new defpackage.dyf(doa));
    }

    public final void a(boolean z) {
        a((defpackage.dyp) new defpackage.dyi(z));
    }

    public final void e() {
        a((defpackage.dyp) new defpackage.dyj());
    }

    public final void a(java.lang.String str) {
        a((defpackage.dyp) new defpackage.dyd(str));
    }

    public final void a(defpackage.dob dob) {
        a((defpackage.dyp) new defpackage.dyg(dob));
    }

    public final void b(int i2) {
        a((defpackage.dyp) new defpackage.dyk(i2));
    }

    public final void a(int i2) {
        a((defpackage.dyp) new defpackage.dyl(i2));
    }

    static boolean c() {
        return false;
    }
}
