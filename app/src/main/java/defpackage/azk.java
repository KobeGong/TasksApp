package defpackage;

/* renamed from: azk reason: default package */
/* compiled from: PG */
public final class azk implements defpackage.bae {
    public final defpackage.baf a;
    public final java.util.concurrent.locks.Lock b;
    public final android.content.Context c;
    public defpackage.bps d;
    public boolean e;
    public boolean f;
    public defpackage.bdp g;
    public boolean h;
    public boolean i;
    public final defpackage.bdj j;
    private final defpackage.axv k;
    private defpackage.axq l;
    private int m;
    private int n = 0;
    private int o;
    private final android.os.Bundle p = new android.os.Bundle();
    private final java.util.Set q = new java.util.HashSet();
    private boolean r;
    private final java.util.Map s;
    private final defpackage.ayf t;
    private java.util.ArrayList u = new java.util.ArrayList();

    public azk(defpackage.baf baf, defpackage.bdj bdj, java.util.Map map, defpackage.axv axv, defpackage.ayf ayf, java.util.concurrent.locks.Lock lock, android.content.Context context) {
        this.a = baf;
        this.j = bdj;
        this.s = map;
        this.k = axv;
        this.t = ayf;
        this.b = lock;
        this.c = context;
    }

    public final void a() {
        this.a.g.clear();
        this.e = false;
        this.l = null;
        this.n = 0;
        this.r = true;
        this.f = false;
        this.h = false;
        java.util.HashMap hashMap = new java.util.HashMap();
        for (defpackage.ayd ayd : this.s.keySet()) {
            defpackage.ayj ayj = (defpackage.ayj) this.a.f.get(ayd.b());
            boolean booleanValue = ((java.lang.Boolean) this.s.get(ayd)).booleanValue();
            if (ayj.h()) {
                this.e = true;
                if (booleanValue) {
                    this.q.add(ayd.b());
                } else {
                    this.r = false;
                }
            }
            hashMap.put(ayj, new defpackage.azm(this, ayd, booleanValue));
        }
        if (this.e) {
            this.j.h = java.lang.Integer.valueOf(java.lang.System.identityHashCode(this.a.m));
            defpackage.azt azt = new defpackage.azt(this);
            this.d = (defpackage.bps) this.t.a(this.c, this.a.m.c(), this.j, this.j.g, azt, azt);
        }
        this.o = this.a.f.size();
        this.u.add(defpackage.bai.a.submit(new defpackage.azn(this, hashMap)));
    }

    /* access modifiers changed from: 0000 */
    public final boolean d() {
        this.o--;
        if (this.o > 0) {
            return false;
        }
        if (this.o < 0) {
            android.util.Log.w("GoogleApiClientConnecting", this.a.m.m());
            android.util.Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new java.lang.Exception());
            b(new defpackage.axq(8, null));
            return false;
        } else if (this.l == null) {
            return true;
        } else {
            this.a.l = this.m;
            b(this.l);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void e() {
        if (this.o == 0) {
            if (!this.e || this.f) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                this.n = 1;
                this.o = this.a.f.size();
                for (defpackage.ayh ayh : this.a.f.keySet()) {
                    if (!this.a.g.containsKey(ayh)) {
                        arrayList.add((defpackage.ayj) this.a.f.get(ayh));
                    } else if (d()) {
                        g();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.u.add(defpackage.bai.a.submit(new defpackage.azq(this, arrayList)));
                }
            }
        }
    }

    public final void a(android.os.Bundle bundle) {
        if (b(1)) {
            if (bundle != null) {
                this.p.putAll(bundle);
            }
            if (d()) {
                g();
            }
        }
    }

    public final void a(defpackage.axq axq, defpackage.ayd ayd, boolean z) {
        if (b(1)) {
            b(axq, ayd, z);
            if (d()) {
                g();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private final void g() {
        defpackage.baf baf = this.a;
        baf.a.lock();
        try {
            baf.m.l();
            baf.k = new defpackage.azi(baf);
            baf.k.a();
            baf.b.signalAll();
            baf.a.unlock();
            defpackage.bai.a.execute(new defpackage.azl(this));
            if (this.d != null) {
                if (this.h) {
                    this.d.a(this.g, this.i);
                }
                a(false);
            }
            for (defpackage.ayh ayh : this.a.g.keySet()) {
                ((defpackage.ayj) this.a.f.get(ayh)).e();
            }
            this.a.n.a(this.p.isEmpty() ? null : this.p);
        } catch (Throwable th) {
            baf.a.unlock();
            throw th;
        }
    }

    public final defpackage.bca a(defpackage.bca bca) {
        this.a.m.c.add(bca);
        return bca;
    }

    public final defpackage.bca b(defpackage.bca bca) {
        throw new java.lang.IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void c() {
    }

    public final boolean b() {
        h();
        a(true);
        this.a.a((defpackage.axq) null);
        return true;
    }

    public final void a(int i2) {
        b(new defpackage.axq(8, null));
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r2 != false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (Integer.MAX_VALUE >= r5.m) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(defpackage.axq r6, defpackage.ayd r7, boolean r8) {
        /*
            r5 = this;
            r4 = 0
            r3 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
            r0 = 1
            if (r8 == 0) goto L_0x0011
            boolean r2 = r6.a()
            if (r2 == 0) goto L_0x002b
            r2 = r0
        L_0x000f:
            if (r2 == 0) goto L_0x0037
        L_0x0011:
            axq r2 = r5.l
            if (r2 == 0) goto L_0x0019
            int r2 = r5.m
            if (r3 >= r2) goto L_0x0037
        L_0x0019:
            if (r0 == 0) goto L_0x001f
            r5.l = r6
            r5.m = r3
        L_0x001f:
            baf r0 = r5.a
            java.util.Map r0 = r0.g
            ayh r1 = r7.b()
            r0.put(r1, r6)
            return
        L_0x002b:
            int r2 = r6.b
            android.content.Intent r2 = defpackage.axv.a(r4, r2, r4)
            if (r2 == 0) goto L_0x0035
            r2 = r0
            goto L_0x000f
        L_0x0035:
            r2 = r1
            goto L_0x000f
        L_0x0037:
            r0 = r1
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azk.b(axq, ayd, boolean):void");
    }

    /* access modifiers changed from: 0000 */
    public final void f() {
        this.e = false;
        this.a.m.e = java.util.Collections.emptySet();
        for (defpackage.ayh ayh : this.q) {
            if (!this.a.g.containsKey(ayh)) {
                this.a.g.put(ayh, new defpackage.axq(17, null));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(defpackage.axq axq) {
        return this.r && !axq.a();
    }

    /* access modifiers changed from: 0000 */
    public final void b(defpackage.axq axq) {
        h();
        a(!axq.a());
        this.a.a(axq);
        this.a.n.a(axq);
    }

    private final void a(boolean z) {
        if (this.d != null) {
            if (this.d.f() && z) {
                this.d.q();
            }
            this.d.e();
            this.g = null;
        }
    }

    private final void h() {
        java.util.ArrayList arrayList = this.u;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            java.lang.Object obj = arrayList.get(i2);
            i2++;
            ((java.util.concurrent.Future) obj).cancel(true);
        }
        this.u.clear();
    }

    /* access modifiers changed from: 0000 */
    public final boolean b(int i2) {
        if (this.n == i2) {
            return true;
        }
        android.util.Log.w("GoogleApiClientConnecting", this.a.m.m());
        java.lang.String valueOf = java.lang.String.valueOf(this);
        android.util.Log.w("GoogleApiClientConnecting", new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 23).append("Unexpected callback in ").append(valueOf).toString());
        android.util.Log.w("GoogleApiClientConnecting", "mRemainingConnections=" + this.o);
        java.lang.String c2 = c(this.n);
        java.lang.String c3 = c(i2);
        android.util.Log.wtf("GoogleApiClientConnecting", new java.lang.StringBuilder(java.lang.String.valueOf(c2).length() + 70 + java.lang.String.valueOf(c3).length()).append("GoogleApiClient connecting is in step ").append(c2).append(" but received callback for step ").append(c3).toString(), new java.lang.Exception());
        b(new defpackage.axq(8, null));
        return false;
    }

    private static java.lang.String c(int i2) {
        switch (i2) {
            case 0:
                return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            case 1:
                return "STEP_GETTING_REMOTE_SERVICE";
            default:
                return "UNKNOWN";
        }
    }
}
