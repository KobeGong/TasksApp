package com.google.android.gms.common.api.internal;

@com.google.android.gms.common.annotation.KeepName
/* compiled from: PG */
public abstract class BasePendingResult extends defpackage.ayt {
    private static final java.lang.ThreadLocal c = new defpackage.bcg();
    public final java.lang.Object a;
    public defpackage.bet b;
    private defpackage.ayy d;
    private java.lang.ref.WeakReference e;
    private final java.util.concurrent.CountDownLatch f;
    private final java.util.ArrayList g;
    private defpackage.ayx h;
    private final java.util.concurrent.atomic.AtomicReference i;
    /* access modifiers changed from: private */
    public defpackage.ayw j;
    private com.google.android.gms.common.api.Status k;
    private volatile boolean l;
    private boolean m;
    @com.google.android.gms.common.annotation.KeepName
    public defpackage.ayz mResultGuardian;
    private boolean n;
    private volatile defpackage.bbq o;
    private boolean p;

    @java.lang.Deprecated
    BasePendingResult() {
        this.a = new java.lang.Object();
        this.f = new java.util.concurrent.CountDownLatch(1);
        this.g = new java.util.ArrayList();
        this.i = new java.util.concurrent.atomic.AtomicReference();
        this.p = false;
        this.d = new defpackage.ayy(android.os.Looper.getMainLooper());
        this.e = new java.lang.ref.WeakReference(null);
    }

    public abstract defpackage.ayw a(com.google.android.gms.common.api.Status status);

    public BasePendingResult(defpackage.ayp ayp) {
        this.a = new java.lang.Object();
        this.f = new java.util.concurrent.CountDownLatch(1);
        this.g = new java.util.ArrayList();
        this.i = new java.util.concurrent.atomic.AtomicReference();
        this.p = false;
        this.d = new defpackage.ayy(ayp != null ? ayp.c() : android.os.Looper.getMainLooper());
        this.e = new java.lang.ref.WeakReference(ayp);
    }

    @java.lang.Deprecated
    public BasePendingResult(android.os.Looper looper) {
        this.a = new java.lang.Object();
        this.f = new java.util.concurrent.CountDownLatch(1);
        this.g = new java.util.ArrayList();
        this.i = new java.util.concurrent.atomic.AtomicReference();
        this.p = false;
        this.d = new defpackage.ayy(looper);
        this.e = new java.lang.ref.WeakReference(null);
    }

    private final boolean e() {
        return this.f.getCount() == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.ayx r4) {
        /*
            r3 = this;
            r0 = 1
            java.lang.Object r1 = r3.a
            monitor-enter(r1)
            boolean r2 = r3.l     // Catch:{ all -> 0x0030 }
            if (r2 != 0) goto L_0x001d
        L_0x0008:
            java.lang.String r2 = "Result has already been consumed."
            defpackage.azb.a(r0, r2)     // Catch:{ all -> 0x0030 }
            bbq r0 = r3.o     // Catch:{ all -> 0x0030 }
            r0 = 1
            java.lang.String r2 = "Cannot set callbacks if then() has been called."
            defpackage.azb.a(r0, r2)     // Catch:{ all -> 0x0030 }
            boolean r0 = r3.b()     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x001f
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
        L_0x001c:
            return
        L_0x001d:
            r0 = 0
            goto L_0x0008
        L_0x001f:
            boolean r0 = r3.e()     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x0033
            ayy r0 = r3.d     // Catch:{ all -> 0x0030 }
            ayw r2 = r3.f()     // Catch:{ all -> 0x0030 }
            r0.a(r4, r2)     // Catch:{ all -> 0x0030 }
        L_0x002e:
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            goto L_0x001c
        L_0x0030:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            throw r0
        L_0x0033:
            r3.h = r4     // Catch:{ all -> 0x0030 }
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.a(ayx):void");
    }

    public final void a(defpackage.ayu ayu) {
        defpackage.azb.b(true, (java.lang.Object) "Callback cannot be null.");
        synchronized (this.a) {
            if (e()) {
                ayu.a(this.k);
            } else {
                this.g.add(ayu);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r2 = this;
            java.lang.Object r1 = r2.a
            monitor-enter(r1)
            boolean r0 = r2.m     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x000b
            boolean r0 = r2.l     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x000d
        L_0x000b:
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
        L_0x000c:
            return
        L_0x000d:
            bet r0 = r2.b     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0016
            bet r0 = r2.b     // Catch:{ RemoteException -> 0x002c }
            r0.a()     // Catch:{ RemoteException -> 0x002c }
        L_0x0016:
            ayw r0 = r2.j     // Catch:{ all -> 0x0029 }
            b(r0)     // Catch:{ all -> 0x0029 }
            r0 = 1
            r2.m = r0     // Catch:{ all -> 0x0029 }
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.e     // Catch:{ all -> 0x0029 }
            ayw r0 = r2.a(r0)     // Catch:{ all -> 0x0029 }
            r2.c(r0)     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            goto L_0x000c
        L_0x0029:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            throw r0
        L_0x002c:
            r0 = move-exception
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.a():void");
    }

    public final boolean c() {
        boolean b2;
        synchronized (this.a) {
            if (((defpackage.ayp) this.e.get()) == null || !this.p) {
                a();
            }
            b2 = b();
        }
        return b2;
    }

    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            z = this.m;
        }
        return z;
    }

    public final void a(defpackage.ayw ayw) {
        boolean z;
        boolean z2 = true;
        synchronized (this.a) {
            if (this.n || this.m) {
                b(ayw);
                return;
            }
            if (e()) {
            }
            if (!e()) {
                z = true;
            } else {
                z = false;
            }
            defpackage.azb.a(z, (java.lang.Object) "Results have already been set");
            if (this.l) {
                z2 = false;
            }
            defpackage.azb.a(z2, (java.lang.Object) "Result has already been consumed");
            c(ayw);
        }
    }

    public final void b(com.google.android.gms.common.api.Status status) {
        synchronized (this.a) {
            if (!e()) {
                a(a(status));
                this.n = true;
            }
        }
    }

    public final void a(defpackage.bbs bbs) {
        this.i.set(bbs);
    }

    public final void d() {
        this.p = this.p || ((java.lang.Boolean) c.get()).booleanValue();
    }

    private final defpackage.ayw f() {
        defpackage.ayw ayw;
        boolean z = true;
        synchronized (this.a) {
            if (this.l) {
                z = false;
            }
            defpackage.azb.a(z, (java.lang.Object) "Result has already been consumed.");
            defpackage.azb.a(e(), (java.lang.Object) "Result is not ready.");
            ayw = this.j;
            this.j = null;
            this.h = null;
            this.l = true;
        }
        defpackage.bbs bbs = (defpackage.bbs) this.i.getAndSet(null);
        if (bbs != null) {
            bbs.a(this);
        }
        return ayw;
    }

    private final void c(defpackage.ayw ayw) {
        this.j = ayw;
        this.b = null;
        this.f.countDown();
        this.k = this.j.b();
        if (this.m) {
            this.h = null;
        } else if (this.h != null) {
            this.d.removeMessages(2);
            this.d.a(this.h, f());
        } else if (this.j instanceof defpackage.ayv) {
            this.mResultGuardian = new defpackage.ayz(this);
        }
        java.util.ArrayList arrayList = this.g;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            java.lang.Object obj = arrayList.get(i2);
            i2++;
            ((defpackage.ayu) obj).a(this.k);
        }
        this.g.clear();
    }

    public static void b(defpackage.ayw ayw) {
        if (ayw instanceof defpackage.ayv) {
            try {
                ((defpackage.ayv) ayw).a();
            } catch (java.lang.RuntimeException e2) {
                java.lang.String valueOf = java.lang.String.valueOf(ayw);
                android.util.Log.w("BasePendingResult", new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 18).append("Unable to release ").append(valueOf).toString(), e2);
            }
        }
    }
}
