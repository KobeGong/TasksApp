package defpackage;

/* renamed from: dqo reason: default package */
/* compiled from: PG */
public final class dqo implements defpackage.dth {
    public final java.lang.String a;
    public defpackage.dxc b;
    public final java.lang.Object c = new java.lang.Object();
    public final java.util.Set d = new java.util.HashSet();
    public final java.util.concurrent.Executor e;
    public final int f;
    public final boolean g;
    public final defpackage.dzt h;
    public boolean i;
    public defpackage.dpw j;
    public boolean k;
    public defpackage.dqj l;
    private final defpackage.dwd m = defpackage.dwd.a(getClass().getName());
    private final java.net.InetSocketAddress n;
    private final java.lang.String o;
    private boolean p;
    private boolean q;

    dqo(defpackage.dqj dqj, java.net.InetSocketAddress inetSocketAddress, java.lang.String str, java.lang.String str2, java.util.concurrent.Executor executor, int i2, boolean z, defpackage.dzt dzt) {
        this.n = (java.net.InetSocketAddress) defpackage.cld.a((java.lang.Object) inetSocketAddress, (java.lang.Object) "address");
        this.o = str;
        this.a = defpackage.dvc.a("cronet", str2);
        this.f = i2;
        this.g = z;
        this.e = (java.util.concurrent.Executor) defpackage.cld.a((java.lang.Object) executor, (java.lang.Object) "executor");
        this.l = (defpackage.dqj) defpackage.cld.a((java.lang.Object) dqj, (java.lang.Object) "streamFactory");
        this.h = (defpackage.dzt) defpackage.cld.a((java.lang.Object) dzt, (java.lang.Object) "transportTracer");
    }

    public final java.lang.Runnable a(defpackage.dxc dxc) {
        this.b = (defpackage.dxc) defpackage.cld.a((java.lang.Object) dxc, (java.lang.Object) "listener");
        synchronized (this.c) {
            this.k = true;
        }
        return new defpackage.dqp(this);
    }

    public final java.lang.String toString() {
        java.lang.String obj = super.toString();
        java.lang.String valueOf = java.lang.String.valueOf(this.n);
        return new java.lang.StringBuilder(java.lang.String.valueOf(obj).length() + 2 + java.lang.String.valueOf(valueOf).length()).append(obj).append("(").append(valueOf).append(")").toString();
    }

    /* JADX INFO: used method not loaded: dxc.a(dpw):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x000f, code lost:
        if (r2.p == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0011, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r2.p = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x001c, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x001d, code lost:
        r2.b.a(r3);
        r1 = r2.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0024, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r2.i = true;
        r2.j = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x002a, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x002b, code lost:
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000a, code lost:
        r1 = r2.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000c, code lost:
        monitor-enter(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.dpw r3) {
        /*
            r2 = this;
            java.lang.Object r1 = r2.c
            monitor-enter(r1)
            boolean r0 = r2.i     // Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r1)     // Catch:{ all -> 0x0016 }
        L_0x0008:
            return
        L_0x0009:
            monitor-exit(r1)     // Catch:{ all -> 0x0016 }
            java.lang.Object r1 = r2.c
            monitor-enter(r1)
            boolean r0 = r2.p     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0019
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            goto L_0x0008
        L_0x0013:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            throw r0
        L_0x0016:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0016 }
            throw r0
        L_0x0019:
            r0 = 1
            r2.p = r0     // Catch:{ all -> 0x0013 }
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            dxc r0 = r2.b
            r0.a(r3)
            java.lang.Object r1 = r2.c
            monitor-enter(r1)
            r0 = 1
            r2.i = r0     // Catch:{ all -> 0x002f }
            r2.j = r3     // Catch:{ all -> 0x002f }
            monitor-exit(r1)     // Catch:{ all -> 0x002f }
            r2.c()
            goto L_0x0008
        L_0x002f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqo.a(dpw):void");
    }

    public final defpackage.dmv a() {
        return defpackage.dmv.b;
    }

    public final defpackage.dwd b() {
        return this.m;
    }

    private final void c() {
        synchronized (this.c) {
            if (this.i && !this.q && this.d.size() == 0) {
                this.q = true;
                this.b.b();
            }
        }
    }

    public final void a(defpackage.dqk dqk, defpackage.dpw dpw) {
        synchronized (this.c) {
            if (this.d.remove(dqk)) {
                dqk.m.b(dpw, dpw.l == defpackage.dpx.CANCELLED || dpw.l == defpackage.dpx.DEADLINE_EXCEEDED, new defpackage.dor());
                c();
            }
        }
    }

    public final /* synthetic */ defpackage.dta a(defpackage.dpb dpb, defpackage.dor dor, defpackage.dna dna) {
        defpackage.cld.a((java.lang.Object) dpb, (java.lang.Object) "method");
        defpackage.cld.a((java.lang.Object) dor, (java.lang.Object) "headers");
        java.lang.String str = "/";
        java.lang.String valueOf = java.lang.String.valueOf(dpb.b);
        java.lang.String str2 = valueOf.length() != 0 ? str.concat(valueOf) : new java.lang.String(str);
        java.lang.String str3 = this.o;
        return new defpackage.dqq(this, new java.lang.StringBuilder(java.lang.String.valueOf(str3).length() + 8 + java.lang.String.valueOf(str2).length()).append("https://").append(str3).append(str2).toString(), dor, dpb, defpackage.dzo.a(dna, dor), dna).a;
    }
}
