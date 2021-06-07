package org.chromium.net.impl;

import android.os.ConditionVariable;
import android.os.Process;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.UsedByReflection;

@UsedByReflection
/* compiled from: PG */
public class CronetUrlRequestContext extends ehy {
    public static final String a = CronetUrlRequestContext.class.getSimpleName();
    public final Object b = new Object();
    public final AtomicInteger c = new AtomicInteger(0);
    public long d = 0;
    public final Object e = new Object();
    public final Map f = new HashMap();
    private final ConditionVariable g = new ConditionVariable(false);
    private final int h;
    private final Object i = new Object();
    private final egu j = new egu();
    private final egu k = new egu();
    private ConditionVariable l = new ConditionVariable();
    private volatile ConditionVariable m;

    @UsedByReflection
    public CronetUrlRequestContext(ejv ejv) {
        super((byte) 0);
        boolean z = ejv.l;
        this.h = ejv.a(10);
        CronetLibraryLoader.a(ejv.a, ejv);
        nativeSetMinLogLevel(3);
        int i2 = ejv.j;
        synchronized (this.b) {
            String str = ejv.e;
            boolean z2 = ejv.f;
            boolean z3 = ejv.f;
            long nativeCreateRequestContextConfig = nativeCreateRequestContextConfig(str, null, z2, "", ejv.g, ejv.h, ejv.i, ejv.j, ejv.k, null, 0, ejv.l, ejv.d, null);
            Iterator it = ejv.b.iterator();
            while (it.hasNext()) {
                it.next();
                nativeAddQuicHint(nativeCreateRequestContextConfig, null, 0, 0);
            }
            Iterator it2 = ejv.c.iterator();
            while (it2.hasNext()) {
                it2.next();
                Date date = null;
                nativeAddPkp(nativeCreateRequestContextConfig, null, null, false, date.getTime());
            }
            this.d = nativeCreateRequestContextAdapter(nativeCreateRequestContextConfig);
            if (this.d == 0) {
                throw new NullPointerException("Context Adapter creation failed.");
            }
        }
        CronetLibraryLoader.a(new eke(this));
    }

    private static native void nativeAddPkp(long j2, String str, byte[][] bArr, boolean z, long j3);

    private static native void nativeAddQuicHint(long j2, String str, int i2, int i3);

    private native void nativeConfigureNetworkQualityEstimatorForTesting(long j2, boolean z, boolean z2, boolean z3);

    private static native long nativeCreateRequestContextAdapter(long j2);

    private static native long nativeCreateRequestContextConfig(String str, String str2, boolean z, String str3, boolean z2, boolean z3, boolean z4, int i2, long j2, String str4, long j3, boolean z5, boolean z6, String str5);

    private native void nativeDestroy(long j2);

    private native void nativeGetCertVerifierData(long j2);

    private static native byte[] nativeGetHistogramDeltas();

    /* access modifiers changed from: private */
    public native void nativeInitRequestContextOnInitThread(long j2);

    private native void nativeProvideRTTObservations(long j2, boolean z);

    private native void nativeProvideThroughputObservations(long j2, boolean z);

    private static native int nativeSetMinLogLevel(int i2);

    private native void nativeStartNetLogToDisk(long j2, String str, boolean z, int i2);

    private native boolean nativeStartNetLogToFile(long j2, String str, boolean z);

    private native void nativeStopNetLog(long j2);

    @Override // defpackage.ehy
    public final ehq a(String str, ehr ehr, Executor executor) {
        return new ejm(str, ehr, executor, this);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ehy
    public final ehp a(String str, ehr ehr, Executor executor, String str2, List list, int i2, boolean z, Collection collection, boolean z2, int i3, boolean z3, int i4) {
        CronetBidirectionalStream cronetBidirectionalStream;
        synchronized (this.b) {
            c();
            cronetBidirectionalStream = new CronetBidirectionalStream(this, str, i2, ehr, executor, str2, list, z, collection, z2, i3, z3, i4);
        }
        return cronetBidirectionalStream;
    }

    @CalledByNative
    public void stopNetLogCompleted() {
        this.m.open();
    }

    @Override // defpackage.ehy
    public final void a(ejc ejc) {
        synchronized (this.e) {
            this.f.put(ejc, new ekv(ejc));
        }
    }

    @Override // defpackage.ehy
    public final void b(ejc ejc) {
        synchronized (this.e) {
            this.f.remove(ejc);
        }
    }

    /* access modifiers changed from: package-private */
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
            throw new IllegalStateException("Engine is shut down.");
        }
    }

    @CalledByNative
    private void initNetworkThread() {
        Thread.currentThread();
        this.g.open();
        Thread.currentThread().setName("ChromiumNet");
        Process.setThreadPriority(this.h);
    }

    @CalledByNative
    private void onEffectiveConnectionTypeChanged(int i2) {
        synchronized (this.i) {
        }
    }

    @CalledByNative
    private void onRTTOrThroughputEstimatesComputed(int i2, int i3, int i4) {
        synchronized (this.i) {
        }
    }

    @CalledByNative
    private void onRttObservation(int i2, long j2, int i3) {
        synchronized (this.i) {
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                ekt ekt = (ekt) it.next();
                a(ekt.a(), new ekf(ekt));
            }
        }
    }

    @CalledByNative
    private void onThroughputObservation(int i2, long j2, int i3) {
        synchronized (this.i) {
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                eku eku = (eku) it.next();
                a(eku.a(), new ekg(eku));
            }
        }
    }

    @CalledByNative
    private void onGetCertVerifierData(String str) {
        this.l.open();
    }

    static void a(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e2) {
            dpt.c(a, "Exception posting task to executor", e2);
        }
    }

    static {
        new HashSet();
    }
}
