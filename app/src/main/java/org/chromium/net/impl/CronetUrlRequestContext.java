package org.chromium.net.impl;

@org.chromium.base.annotations.UsedByReflection
/* compiled from: PG */
public class CronetUrlRequestContext extends defpackage.ehy {
    public static final java.lang.String a = org.chromium.net.impl.CronetUrlRequestContext.class.getSimpleName();
    public final java.lang.Object b = new java.lang.Object();
    public final java.util.concurrent.atomic.AtomicInteger c = new java.util.concurrent.atomic.AtomicInteger(0);
    public long d = 0;
    public final java.lang.Object e = new java.lang.Object();
    public final java.util.Map f = new java.util.HashMap();
    private final android.os.ConditionVariable g = new android.os.ConditionVariable(false);
    private final int h;
    private final java.lang.Object i = new java.lang.Object();
    private final defpackage.egu j = new defpackage.egu();
    private final defpackage.egu k = new defpackage.egu();
    private android.os.ConditionVariable l = new android.os.ConditionVariable();
    private volatile android.os.ConditionVariable m;

    @org.chromium.base.annotations.UsedByReflection
    public CronetUrlRequestContext(defpackage.ejv ejv) {
        super(0);
        boolean z = ejv.l;
        this.h = ejv.a(10);
        org.chromium.net.impl.CronetLibraryLoader.a(ejv.a, ejv);
        nativeSetMinLogLevel(3);
        int i2 = ejv.j;
        synchronized (this.b) {
            java.lang.String str = ejv.e;
            boolean z2 = ejv.f;
            boolean z3 = ejv.f;
            long nativeCreateRequestContextConfig = nativeCreateRequestContextConfig(str, null, z2, "", ejv.g, ejv.h, ejv.i, ejv.j, ejv.k, null, 0, ejv.l, ejv.d, null);
            java.util.Iterator it = ejv.b.iterator();
            while (it.hasNext()) {
                it.next();
                nativeAddQuicHint(nativeCreateRequestContextConfig, null, 0, 0);
            }
            java.util.Iterator it2 = ejv.c.iterator();
            while (it2.hasNext()) {
                it2.next();
                java.util.Date date = null;
                nativeAddPkp(nativeCreateRequestContextConfig, null, null, false, date.getTime());
            }
            this.d = nativeCreateRequestContextAdapter(nativeCreateRequestContextConfig);
            if (this.d == 0) {
                throw new java.lang.NullPointerException("Context Adapter creation failed.");
            }
        }
        org.chromium.net.impl.CronetLibraryLoader.a(new defpackage.eke(this));
    }

    private static native void nativeAddPkp(long j2, java.lang.String str, byte[][] bArr, boolean z, long j3);

    private static native void nativeAddQuicHint(long j2, java.lang.String str, int i2, int i3);

    private native void nativeConfigureNetworkQualityEstimatorForTesting(long j2, boolean z, boolean z2, boolean z3);

    private static native long nativeCreateRequestContextAdapter(long j2);

    private static native long nativeCreateRequestContextConfig(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, boolean z2, boolean z3, boolean z4, int i2, long j2, java.lang.String str4, long j3, boolean z5, boolean z6, java.lang.String str5);

    private native void nativeDestroy(long j2);

    private native void nativeGetCertVerifierData(long j2);

    private static native byte[] nativeGetHistogramDeltas();

    /* access modifiers changed from: private */
    public native void nativeInitRequestContextOnInitThread(long j2);

    private native void nativeProvideRTTObservations(long j2, boolean z);

    private native void nativeProvideThroughputObservations(long j2, boolean z);

    private static native int nativeSetMinLogLevel(int i2);

    private native void nativeStartNetLogToDisk(long j2, java.lang.String str, boolean z, int i2);

    private native boolean nativeStartNetLogToFile(long j2, java.lang.String str, boolean z);

    private native void nativeStopNetLog(long j2);

    public final defpackage.ehq a(java.lang.String str, defpackage.ehr ehr, java.util.concurrent.Executor executor) {
        return new defpackage.ejm(str, ehr, executor, this);
    }

    /* access modifiers changed from: protected */
    public final defpackage.ehp a(java.lang.String str, defpackage.ehr ehr, java.util.concurrent.Executor executor, java.lang.String str2, java.util.List list, int i2, boolean z, java.util.Collection collection, boolean z2, int i3, boolean z3, int i4) {
        org.chromium.net.impl.CronetBidirectionalStream cronetBidirectionalStream;
        synchronized (this.b) {
            c();
            cronetBidirectionalStream = new org.chromium.net.impl.CronetBidirectionalStream(this, str, i2, ehr, executor, str2, list, z, collection, z2, i3, z3, i4);
        }
        return cronetBidirectionalStream;
    }

    @org.chromium.base.annotations.CalledByNative
    public void stopNetLogCompleted() {
        this.m.open();
    }

    public final void a(defpackage.ejc ejc) {
        synchronized (this.e) {
            this.f.put(ejc, new defpackage.ekv(ejc));
        }
    }

    public final void b(defpackage.ejc ejc) {
        synchronized (this.e) {
            this.f.remove(ejc);
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean a() {
        boolean z;
        synchronized (this.e) {
            z = !this.f.isEmpty();
        }
        return z;
    }

    public final long b() {
        long j2;
        synchronized (this.b) {
            c();
            j2 = this.d;
        }
        return j2;
    }

    private final void c() {
        if (!(this.d != 0)) {
            throw new java.lang.IllegalStateException("Engine is shut down.");
        }
    }

    @org.chromium.base.annotations.CalledByNative
    private void initNetworkThread() {
        java.lang.Thread.currentThread();
        this.g.open();
        java.lang.Thread.currentThread().setName("ChromiumNet");
        android.os.Process.setThreadPriority(this.h);
    }

    @org.chromium.base.annotations.CalledByNative
    private void onEffectiveConnectionTypeChanged(int i2) {
        synchronized (this.i) {
        }
    }

    @org.chromium.base.annotations.CalledByNative
    private void onRTTOrThroughputEstimatesComputed(int i2, int i3, int i4) {
        synchronized (this.i) {
        }
    }

    @org.chromium.base.annotations.CalledByNative
    private void onRttObservation(int i2, long j2, int i3) {
        synchronized (this.i) {
            java.util.Iterator it = this.j.iterator();
            while (it.hasNext()) {
                defpackage.ekt ekt = (defpackage.ekt) it.next();
                a(ekt.a(), (java.lang.Runnable) new defpackage.ekf(ekt));
            }
        }
    }

    @org.chromium.base.annotations.CalledByNative
    private void onThroughputObservation(int i2, long j2, int i3) {
        synchronized (this.i) {
            java.util.Iterator it = this.k.iterator();
            while (it.hasNext()) {
                defpackage.eku eku = (defpackage.eku) it.next();
                a(eku.a(), (java.lang.Runnable) new defpackage.ekg(eku));
            }
        }
    }

    @org.chromium.base.annotations.CalledByNative
    private void onGetCertVerifierData(java.lang.String str) {
        this.l.open();
    }

    static void a(java.util.concurrent.Executor executor, java.lang.Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (java.util.concurrent.RejectedExecutionException e2) {
            defpackage.dpt.c(a, "Exception posting task to executor", e2);
        }
    }

    static {
        new java.util.HashSet();
    }
}
