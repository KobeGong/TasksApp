package org.chromium.net.impl;

import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.base.annotations.CalledByNative;

/* compiled from: PG */
public class CronetBidirectionalStream extends ehp {
    public final eks a;
    public final String b;
    public final Object c = new Object();
    public boolean d;
    public int e = bg.ay;
    public int f = bg.ay;
    public ekq g;
    private final CronetUrlRequestContext h;
    private final Executor i;
    private final String j;
    private final int k;
    private final String[] l;
    private final boolean m;
    private final Collection n;
    private final boolean o;
    private final int p;
    private final boolean q;
    private final int r;
    private bkv s;
    private LinkedList t;
    private LinkedList u;
    private boolean v;
    private ejd w;
    private long x;
    private ejt y;

    CronetBidirectionalStream(CronetUrlRequestContext cronetUrlRequestContext, String str, int i2, ehr ehr, Executor executor, String str2, List list, boolean z, Collection collection, boolean z2, int i3, boolean z3, int i4) {
        super((byte) 0);
        int i5;
        this.h = cronetUrlRequestContext;
        this.j = str;
        switch (i2) {
            case 0:
                i5 = 1;
                break;
            case 1:
                i5 = 2;
                break;
            case 2:
                i5 = 3;
                break;
            case 3:
                i5 = 4;
                break;
            case 4:
                i5 = 5;
                break;
            default:
                throw new IllegalArgumentException("Invalid stream priority.");
        }
        this.k = i5;
        this.a = new eks(ehr);
        this.i = executor;
        this.b = str2;
        String[] strArr = new String[(list.size() << 1)];
        Iterator it = list.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int i7 = i6 + 1;
            strArr[i6] = (String) entry.getKey();
            strArr[i7] = (String) entry.getValue();
            i6 = i7 + 1;
        }
        this.l = strArr;
        this.m = z;
        this.t = new LinkedList();
        this.u = new LinkedList();
        this.n = collection;
        this.o = z2;
        this.p = i3;
        this.q = z3;
        this.r = i4;
    }

    private native long nativeCreateBidirectionalStream(long j2, boolean z, boolean z2, boolean z3, int i2, boolean z4, int i3);

    private native void nativeDestroy(long j2, boolean z);

    private native boolean nativeReadData(long j2, ByteBuffer byteBuffer, int i2, int i3);

    private native void nativeSendRequestHeaders(long j2);

    private native int nativeStart(long j2, String str, int i2, String str2, String[] strArr, boolean z);

    private native boolean nativeWritevData(long j2, ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2, boolean z);

    @Override // defpackage.ehp
    public final void a() {
        boolean z;
        synchronized (this.c) {
            if (this.e != bg.ay) {
                throw new IllegalStateException("Stream is already started.");
            }
            try {
                this.x = nativeCreateBidirectionalStream(this.h.b(), !this.m, this.h.a(), this.o, this.p, this.q, this.r);
                this.h.c.incrementAndGet();
                long j2 = this.x;
                String str = this.j;
                int i2 = this.k;
                String str2 = this.b;
                String[] strArr = this.l;
                if (!a(this.b)) {
                    z = true;
                } else {
                    z = false;
                }
                int nativeStart = nativeStart(j2, str, i2, str2, strArr, z);
                if (nativeStart == -1) {
                    throw new IllegalArgumentException("Invalid http method " + this.b);
                } else if (nativeStart > 0) {
                    int i3 = nativeStart - 1;
                    throw new IllegalArgumentException("Invalid header " + this.l[i3] + "=" + this.l[i3 + 1]);
                } else {
                    int i4 = bg.az;
                    this.f = i4;
                    this.e = i4;
                }
            } catch (RuntimeException e2) {
                a(false);
                throw e2;
            }
        }
    }

    @Override // defpackage.ehp
    public final void a(ByteBuffer byteBuffer) {
        synchronized (this.c) {
            if (!byteBuffer.hasRemaining()) {
                throw new IllegalArgumentException("ByteBuffer is already full.");
            }
            ehw.a(byteBuffer);
            if (this.e != bg.aA) {
                throw new IllegalStateException("Unexpected read attempt.");
            } else if (!d()) {
                if (this.y == null) {
                    this.y = new ejt(this);
                }
                this.e = bg.aB;
                if (!nativeReadData(this.x, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                    this.e = bg.aA;
                    throw new IllegalArgumentException("Unable to call native read");
                }
            }
        }
    }

    @Override // defpackage.ehp
    public final void a(ByteBuffer byteBuffer, boolean z) {
        synchronized (this.c) {
            ehw.a(byteBuffer);
            if (!byteBuffer.hasRemaining() && !z) {
                throw new IllegalArgumentException("Empty buffer before end of stream.");
            } else if (this.v) {
                throw new IllegalArgumentException("Write after writing end of stream.");
            } else if (!d()) {
                this.t.add(byteBuffer);
                if (z) {
                    this.v = true;
                }
            }
        }
    }

    @Override // defpackage.ehp
    public final void b() {
        synchronized (this.c) {
            if (!d() && (this.f == bg.aG || this.f == bg.aH)) {
                if (!this.t.isEmpty() || !this.u.isEmpty()) {
                    if (!this.t.isEmpty()) {
                        this.u.addAll(this.t);
                        this.t.clear();
                    }
                    if (this.f != bg.aH) {
                        f();
                        return;
                    }
                    return;
                }
                if (!this.d) {
                    this.d = true;
                    nativeSendRequestHeaders(this.x);
                    if (!a(this.b)) {
                        this.f = bg.aI;
                    }
                }
            }
        }
    }

    private final void f() {
        boolean z = true;
        int size = this.u.size();
        ByteBuffer[] byteBufferArr = new ByteBuffer[size];
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            ByteBuffer byteBuffer = (ByteBuffer) this.u.poll();
            byteBufferArr[i2] = byteBuffer;
            iArr[i2] = byteBuffer.position();
            iArr2[i2] = byteBuffer.limit();
        }
        this.f = bg.aH;
        this.d = true;
        long j2 = this.x;
        if (!this.v || !this.t.isEmpty()) {
            z = false;
        }
        if (!nativeWritevData(j2, byteBufferArr, iArr, iArr2, z)) {
            this.f = bg.aG;
            throw new IllegalArgumentException("Unable to call native writev.");
        }
    }

    @Override // defpackage.ehp
    public final void c() {
        synchronized (this.c) {
            if (!d() && this.e != bg.ay) {
                int i2 = bg.aD;
                this.f = i2;
                this.e = i2;
                a(true);
            }
        }
    }

    public final boolean d() {
        return this.e != bg.ay && this.x == 0;
    }

    public final void e() {
        synchronized (this.c) {
            if (!d()) {
                if (this.f == bg.aI && this.e == bg.aC) {
                    int i2 = bg.aF;
                    this.f = i2;
                    this.e = i2;
                    a(false);
                    try {
                        this.a.b(this, this.g);
                    } catch (Exception e2) {
                        dpt.c(CronetUrlRequestContext.a, "Exception in onSucceeded method", e2);
                    }
                }
            }
        }
    }

    @CalledByNative
    private void onStreamReady(boolean z) {
        a(new ejo(this, z));
    }

    @CalledByNative
    private void onResponseHeadersReceived(int i2, String str, String[] strArr, long j2) {
        try {
            this.g = new ekq(Arrays.asList(this.j), i2, "", a(strArr), str, j2);
            a(new ejp(this));
        } catch (Exception e2) {
            b(new bkv("Cannot prepare ResponseInfo", (byte) 0));
        }
    }

    @CalledByNative
    private void onReadCompleted(ByteBuffer byteBuffer, int i2, int i3, int i4, long j2) {
        boolean z = false;
        this.g.a(j2);
        if (byteBuffer.position() != i3 || byteBuffer.limit() != i4) {
            b(new bkv("ByteBuffer modified externally during read", (byte) 0));
        } else if (i2 < 0 || i3 + i2 > i4) {
            b(new bkv("Invalid number of bytes read", (byte) 0));
        } else {
            byteBuffer.position(i3 + i2);
            this.y.a = byteBuffer;
            ejt ejt = this.y;
            if (i2 == 0) {
                z = true;
            }
            ejt.b = z;
            a(this.y);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r0 >= r6.length) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r3 = r6[r0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        if (r3.position() != r7[r0]) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        if (r3.limit() == r8[r0]) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        b(new defpackage.bkv("ByteBuffer modified externally during write", (byte) 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        r3.position(r3.limit());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        if (r9 == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        if (r0 != (r6.length - 1)) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0051, code lost:
        a(new defpackage.eju(r5, r3, r2));
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005a, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    @org.chromium.base.annotations.CalledByNative
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void onWritevCompleted(java.nio.ByteBuffer[] r6, int[] r7, int[] r8, boolean r9) {
        /*
            r5 = this;
            r1 = 0
            java.lang.Object r2 = r5.c
            monitor-enter(r2)
            boolean r0 = r5.d()     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r2)     // Catch:{ all -> 0x003d }
        L_0x000b:
            return
        L_0x000c:
            int r0 = defpackage.bg.aG     // Catch:{ all -> 0x003d }
            r5.f = r0     // Catch:{ all -> 0x003d }
            java.util.LinkedList r0 = r5.u     // Catch:{ all -> 0x003d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x003d }
            if (r0 != 0) goto L_0x001b
            r5.f()     // Catch:{ all -> 0x003d }
        L_0x001b:
            monitor-exit(r2)     // Catch:{ all -> 0x003d }
            r0 = r1
        L_0x001d:
            int r2 = r6.length
            if (r0 >= r2) goto L_0x000b
            r3 = r6[r0]
            int r2 = r3.position()
            r4 = r7[r0]
            if (r2 != r4) goto L_0x0032
            int r2 = r3.limit()
            r4 = r8[r0]
            if (r2 == r4) goto L_0x0040
        L_0x0032:
            bkv r0 = new bkv
            java.lang.String r2 = "ByteBuffer modified externally during write"
            r0.<init>(r2, r1)
            r5.b(r0)
            goto L_0x000b
        L_0x003d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0040:
            int r2 = r3.limit()
            r3.position(r2)
            eju r4 = new eju
            if (r9 == 0) goto L_0x005a
            int r2 = r6.length
            int r2 = r2 + -1
            if (r0 != r2) goto L_0x005a
            r2 = 1
        L_0x0051:
            r4.<init>(r5, r3, r2)
            r5.a(r4)
            int r0 = r0 + 1
            goto L_0x001d
        L_0x005a:
            r2 = r1
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetBidirectionalStream.onWritevCompleted(java.nio.ByteBuffer[], int[], int[], boolean):void");
    }

    @CalledByNative
    private void onResponseTrailersReceived(String[] strArr) {
        a(new ejq(this, new ejh(a(strArr))));
    }

    @CalledByNative
    private void onError(int i2, int i3, int i4, String str, long j2) {
        if (this.g != null) {
            this.g.a(j2);
        }
        if (i2 == 10) {
            b(new ekp("Exception in BidirectionalStream: " + str, i3, i4));
        } else {
            b(new ejn("Exception in BidirectionalStream: " + str, i2, i3));
        }
    }

    @CalledByNative
    private void onCanceled() {
        a(new ejr(this));
    }

    @CalledByNative
    private void onMetricsCollected(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, boolean z, long j15, long j16) {
        int i2;
        synchronized (this.c) {
            if (this.w != null) {
                throw new IllegalStateException("Metrics collection should only happen once.");
            }
            this.w = new ejd(j2, j13, j14, j15, j16);
            if (this.e == bg.aF) {
                i2 = 0;
            } else if (this.e == bg.aD) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            ejb ejb = new ejb(this.j, this.n, this.w, i2, this.g, this.s);
            CronetUrlRequestContext cronetUrlRequestContext = this.h;
            synchronized (cronetUrlRequestContext.e) {
                if (!cronetUrlRequestContext.f.isEmpty()) {
                    ArrayList arrayList = new ArrayList(cronetUrlRequestContext.f.values());
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        ekv ekv = (ekv) obj;
                        CronetUrlRequestContext.a(ekv.a(), new ekh(ekv, ejb));
                    }
                }
            }
        }
    }

    public static boolean a(String str) {
        return !str.equals("GET") && !str.equals("HEAD");
    }

    private static ArrayList a(String[] strArr) {
        ArrayList arrayList = new ArrayList(strArr.length / 2);
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            arrayList.add(new AbstractMap.SimpleImmutableEntry(strArr[i2], strArr[i2 + 1]));
        }
        return arrayList;
    }

    private final void a(Runnable runnable) {
        try {
            this.i.execute(runnable);
        } catch (RejectedExecutionException e2) {
            dpt.c(CronetUrlRequestContext.a, "Exception posting task to executor", e2);
            synchronized (this.c) {
                int i2 = bg.aE;
                this.f = i2;
                this.e = i2;
                a(false);
            }
        }
    }

    private final void a(boolean z) {
        dpt.a(CronetUrlRequestContext.a, "destroyNativeStreamLocked " + toString(), new Object[0]);
        if (this.x != 0) {
            nativeDestroy(this.x, z);
            this.h.c.decrementAndGet();
            this.x = 0;
        }
    }

    /* access modifiers changed from: private */
    public final void a(bkv bkv) {
        this.s = bkv;
        synchronized (this.c) {
            if (!d()) {
                int i2 = bg.aE;
                this.f = i2;
                this.e = i2;
                a(false);
                try {
                    this.a.a(this, this.g, bkv);
                } catch (Exception e2) {
                    dpt.c(CronetUrlRequestContext.a, "Exception notifying of failed request", e2);
                }
            }
        }
    }

    public final void a(Exception exc) {
        ehs ehs = new ehs("CalledByNative method has thrown an exception", exc, (byte) 0);
        dpt.c(CronetUrlRequestContext.a, "Exception in CalledByNative method", exc);
        a((bkv) ehs);
    }

    private final void b(bkv bkv) {
        a(new ejs(this, bkv));
    }
}
