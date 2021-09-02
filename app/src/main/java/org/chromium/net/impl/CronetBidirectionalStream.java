package org.chromium.net.impl;

/* compiled from: PG */
public class CronetBidirectionalStream extends defpackage.ehp {
    public final defpackage.eks a;
    public final java.lang.String b;
    public final java.lang.Object c = new java.lang.Object();
    public boolean d;
    public int e = defpackage.bg.ay;
    public int f = defpackage.bg.ay;
    public defpackage.ekq g;
    private final org.chromium.net.impl.CronetUrlRequestContext h;
    private final java.util.concurrent.Executor i;
    private final java.lang.String j;
    private final int k;
    private final java.lang.String[] l;
    private final boolean m;
    private final java.util.Collection n;
    private final boolean o;
    private final int p;
    private final boolean q;
    private final int r;
    private defpackage.bkv s;
    private java.util.LinkedList t;
    private java.util.LinkedList u;
    private boolean v;
    private defpackage.ejd w;
    private long x;
    private defpackage.ejt y;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.util.Map$Entry>, for r14v0, types: [java.util.List, java.util.List<java.util.Map$Entry>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    CronetBidirectionalStream(org.chromium.net.impl.CronetUrlRequestContext r8, java.lang.String r9, int r10, defpackage.ehr r11, java.util.concurrent.Executor r12, java.lang.String r13, java.util.List<java.util.Map.Entry> r14, boolean r15, java.util.Collection r16, boolean r17, int r18, boolean r19, int r20) {
        /*
            r7 = this;
            r1 = 0
            r7.<init>(r1)
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r7.c = r1
            int r1 = defpackage.bg.ay
            r7.e = r1
            int r1 = defpackage.bg.ay
            r7.f = r1
            r7.h = r8
            r7.j = r9
            switch(r10) {
                case 0: goto L_0x0022;
                case 1: goto L_0x0060;
                case 2: goto L_0x0062;
                case 3: goto L_0x0064;
                case 4: goto L_0x0066;
                default: goto L_0x001a;
            }
        L_0x001a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Invalid stream priority."
            r1.<init>(r2)
            throw r1
        L_0x0022:
            r1 = 1
        L_0x0023:
            r7.k = r1
            eks r1 = new eks
            r1.<init>(r11)
            r7.a = r1
            r7.i = r12
            r7.b = r13
            int r1 = r14.size()
            int r1 = r1 << 1
            java.lang.String[] r4 = new java.lang.String[r1]
            r1 = 0
            java.util.Iterator r5 = r14.iterator()
            r3 = r1
        L_0x003e:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0068
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            int r6 = r3 + 1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r4[r3] = r2
            int r2 = r6 + 1
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r4[r6] = r1
            r3 = r2
            goto L_0x003e
        L_0x0060:
            r1 = 2
            goto L_0x0023
        L_0x0062:
            r1 = 3
            goto L_0x0023
        L_0x0064:
            r1 = 4
            goto L_0x0023
        L_0x0066:
            r1 = 5
            goto L_0x0023
        L_0x0068:
            r7.l = r4
            r7.m = r15
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r7.t = r1
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r7.u = r1
            r0 = r16
            r7.n = r0
            r0 = r17
            r7.o = r0
            r0 = r18
            r7.p = r0
            r0 = r19
            r7.q = r0
            r0 = r20
            r7.r = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetBidirectionalStream.<init>(org.chromium.net.impl.CronetUrlRequestContext, java.lang.String, int, ehr, java.util.concurrent.Executor, java.lang.String, java.util.List, boolean, java.util.Collection, boolean, int, boolean, int):void");
    }

    private native long nativeCreateBidirectionalStream(long j2, boolean z, boolean z2, boolean z3, int i2, boolean z4, int i3);

    private native void nativeDestroy(long j2, boolean z);

    private native boolean nativeReadData(long j2, java.nio.ByteBuffer byteBuffer, int i2, int i3);

    private native void nativeSendRequestHeaders(long j2);

    private native int nativeStart(long j2, java.lang.String str, int i2, java.lang.String str2, java.lang.String[] strArr, boolean z);

    private native boolean nativeWritevData(long j2, java.nio.ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2, boolean z);

    public final void a() {
        boolean z;
        synchronized (this.c) {
            if (this.e != defpackage.bg.ay) {
                throw new java.lang.IllegalStateException("Stream is already started.");
            }
            try {
                this.x = nativeCreateBidirectionalStream(this.h.b(), !this.m, this.h.a(), this.o, this.p, this.q, this.r);
                this.h.c.incrementAndGet();
                long j2 = this.x;
                java.lang.String str = this.j;
                int i2 = this.k;
                java.lang.String str2 = this.b;
                java.lang.String[] strArr = this.l;
                if (!a(this.b)) {
                    z = true;
                } else {
                    z = false;
                }
                int nativeStart = nativeStart(j2, str, i2, str2, strArr, z);
                if (nativeStart == -1) {
                    throw new java.lang.IllegalArgumentException("Invalid http method " + this.b);
                } else if (nativeStart > 0) {
                    int i3 = nativeStart - 1;
                    throw new java.lang.IllegalArgumentException("Invalid header " + this.l[i3] + "=" + this.l[i3 + 1]);
                } else {
                    int i4 = defpackage.bg.az;
                    this.f = i4;
                    this.e = i4;
                }
            } catch (java.lang.RuntimeException e2) {
                a(false);
                throw e2;
            }
        }
    }

    public final void a(java.nio.ByteBuffer byteBuffer) {
        synchronized (this.c) {
            if (!byteBuffer.hasRemaining()) {
                throw new java.lang.IllegalArgumentException("ByteBuffer is already full.");
            }
            defpackage.ehw.a(byteBuffer);
            if (this.e != defpackage.bg.aA) {
                throw new java.lang.IllegalStateException("Unexpected read attempt.");
            } else if (!d()) {
                if (this.y == null) {
                    this.y = new defpackage.ejt(this);
                }
                this.e = defpackage.bg.aB;
                if (!nativeReadData(this.x, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                    this.e = defpackage.bg.aA;
                    throw new java.lang.IllegalArgumentException("Unable to call native read");
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.nio.ByteBuffer r4, boolean r5) {
        /*
            r3 = this;
            java.lang.Object r1 = r3.c
            monitor-enter(r1)
            defpackage.ehw.a(r4)     // Catch:{ all -> 0x0016 }
            boolean r0 = r4.hasRemaining()     // Catch:{ all -> 0x0016 }
            if (r0 != 0) goto L_0x0019
            if (r5 != 0) goto L_0x0019
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0016 }
            java.lang.String r2 = "Empty buffer before end of stream."
            r0.<init>(r2)     // Catch:{ all -> 0x0016 }
            throw r0     // Catch:{ all -> 0x0016 }
        L_0x0016:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0016 }
            throw r0
        L_0x0019:
            boolean r0 = r3.v     // Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x0025
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0016 }
            java.lang.String r2 = "Write after writing end of stream."
            r0.<init>(r2)     // Catch:{ all -> 0x0016 }
            throw r0     // Catch:{ all -> 0x0016 }
        L_0x0025:
            boolean r0 = r3.d()     // Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x002d
            monitor-exit(r1)     // Catch:{ all -> 0x0016 }
        L_0x002c:
            return
        L_0x002d:
            java.util.LinkedList r0 = r3.t     // Catch:{ all -> 0x0016 }
            r0.add(r4)     // Catch:{ all -> 0x0016 }
            if (r5 == 0) goto L_0x0037
            r0 = 1
            r3.v = r0     // Catch:{ all -> 0x0016 }
        L_0x0037:
            monitor-exit(r1)     // Catch:{ all -> 0x0016 }
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetBidirectionalStream.a(java.nio.ByteBuffer, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r4 = this;
            java.lang.Object r1 = r4.c
            monitor-enter(r1)
            boolean r0 = r4.d()     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x0015
            int r0 = r4.f     // Catch:{ all -> 0x0041 }
            int r2 = defpackage.bg.aG     // Catch:{ all -> 0x0041 }
            if (r0 == r2) goto L_0x0017
            int r0 = r4.f     // Catch:{ all -> 0x0041 }
            int r2 = defpackage.bg.aH     // Catch:{ all -> 0x0041 }
            if (r0 == r2) goto L_0x0017
        L_0x0015:
            monitor-exit(r1)     // Catch:{ all -> 0x0041 }
        L_0x0016:
            return
        L_0x0017:
            java.util.LinkedList r0 = r4.t     // Catch:{ all -> 0x0041 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0044
            java.util.LinkedList r0 = r4.u     // Catch:{ all -> 0x0041 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0044
            boolean r0 = r4.d     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x003f
            r0 = 1
            r4.d = r0     // Catch:{ all -> 0x0041 }
            long r2 = r4.x     // Catch:{ all -> 0x0041 }
            r4.nativeSendRequestHeaders(r2)     // Catch:{ all -> 0x0041 }
            java.lang.String r0 = r4.b     // Catch:{ all -> 0x0041 }
            boolean r0 = a(r0)     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x003f
            int r0 = defpackage.bg.aI     // Catch:{ all -> 0x0041 }
            r4.f = r0     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r1)     // Catch:{ all -> 0x0041 }
            goto L_0x0016
        L_0x0041:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0041 }
            throw r0
        L_0x0044:
            java.util.LinkedList r0 = r4.t     // Catch:{ all -> 0x0041 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x0058
            java.util.LinkedList r0 = r4.u     // Catch:{ all -> 0x0041 }
            java.util.LinkedList r2 = r4.t     // Catch:{ all -> 0x0041 }
            r0.addAll(r2)     // Catch:{ all -> 0x0041 }
            java.util.LinkedList r0 = r4.t     // Catch:{ all -> 0x0041 }
            r0.clear()     // Catch:{ all -> 0x0041 }
        L_0x0058:
            int r0 = r4.f     // Catch:{ all -> 0x0041 }
            int r2 = defpackage.bg.aH     // Catch:{ all -> 0x0041 }
            if (r0 != r2) goto L_0x0060
            monitor-exit(r1)     // Catch:{ all -> 0x0041 }
            goto L_0x0016
        L_0x0060:
            r4.f()     // Catch:{ all -> 0x0041 }
            monitor-exit(r1)     // Catch:{ all -> 0x0041 }
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetBidirectionalStream.b():void");
    }

    private final void f() {
        boolean z = true;
        int size = this.u.size();
        java.nio.ByteBuffer[] byteBufferArr = new java.nio.ByteBuffer[size];
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) this.u.poll();
            byteBufferArr[i2] = byteBuffer;
            iArr[i2] = byteBuffer.position();
            iArr2[i2] = byteBuffer.limit();
        }
        this.f = defpackage.bg.aH;
        this.d = true;
        long j2 = this.x;
        if (!this.v || !this.t.isEmpty()) {
            z = false;
        }
        if (!nativeWritevData(j2, byteBufferArr, iArr, iArr2, z)) {
            this.f = defpackage.bg.aG;
            throw new java.lang.IllegalArgumentException("Unable to call native writev.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r3 = this;
            java.lang.Object r1 = r3.c
            monitor-enter(r1)
            boolean r0 = r3.d()     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x000f
            int r0 = r3.e     // Catch:{ all -> 0x001d }
            int r2 = defpackage.bg.ay     // Catch:{ all -> 0x001d }
            if (r0 != r2) goto L_0x0011
        L_0x000f:
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
        L_0x0010:
            return
        L_0x0011:
            int r0 = defpackage.bg.aD     // Catch:{ all -> 0x001d }
            r3.f = r0     // Catch:{ all -> 0x001d }
            r3.e = r0     // Catch:{ all -> 0x001d }
            r0 = 1
            r3.a(r0)     // Catch:{ all -> 0x001d }
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            goto L_0x0010
        L_0x001d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetBidirectionalStream.c():void");
    }

    public final boolean d() {
        return this.e != defpackage.bg.ay && this.x == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r5 = this;
            r4 = 0
            java.lang.Object r1 = r5.c
            monitor-enter(r1)
            boolean r0 = r5.d()     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
        L_0x000b:
            return
        L_0x000c:
            int r0 = r5.f     // Catch:{ all -> 0x001a }
            int r2 = defpackage.bg.aI     // Catch:{ all -> 0x001a }
            if (r0 != r2) goto L_0x0018
            int r0 = r5.e     // Catch:{ all -> 0x001a }
            int r2 = defpackage.bg.aC     // Catch:{ all -> 0x001a }
            if (r0 == r2) goto L_0x001d
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x000b
        L_0x001a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r0
        L_0x001d:
            int r0 = defpackage.bg.aF     // Catch:{ all -> 0x001a }
            r5.f = r0     // Catch:{ all -> 0x001a }
            r5.e = r0     // Catch:{ all -> 0x001a }
            r0 = 0
            r5.a(r0)     // Catch:{ all -> 0x001a }
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            eks r0 = r5.a     // Catch:{ Exception -> 0x0030 }
            ekq r1 = r5.g     // Catch:{ Exception -> 0x0030 }
            r0.b(r5, r1)     // Catch:{ Exception -> 0x0030 }
            goto L_0x000b
        L_0x0030:
            r0 = move-exception
            java.lang.String r1 = org.chromium.net.impl.CronetUrlRequestContext.a
            java.lang.String r2 = "Exception in onSucceeded method"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r4] = r0
            defpackage.dpt.c(r1, r2, r3)
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetBidirectionalStream.e():void");
    }

    @org.chromium.base.annotations.CalledByNative
    private void onStreamReady(boolean z) {
        a((java.lang.Runnable) new defpackage.ejo(this, z));
    }

    @org.chromium.base.annotations.CalledByNative
    private void onResponseHeadersReceived(int i2, java.lang.String str, java.lang.String[] strArr, long j2) {
        try {
            int i3 = i2;
            this.g = new defpackage.ekq(java.util.Arrays.asList(new java.lang.String[]{this.j}), i3, "", a(strArr), str, j2);
            a((java.lang.Runnable) new defpackage.ejp(this));
        } catch (java.lang.Exception e2) {
            b(new defpackage.bkv("Cannot prepare ResponseInfo", 0));
        }
    }

    @org.chromium.base.annotations.CalledByNative
    private void onReadCompleted(java.nio.ByteBuffer byteBuffer, int i2, int i3, int i4, long j2) {
        boolean z = false;
        this.g.a(j2);
        if (byteBuffer.position() != i3 || byteBuffer.limit() != i4) {
            b(new defpackage.bkv("ByteBuffer modified externally during read", 0));
        } else if (i2 < 0 || i3 + i2 > i4) {
            b(new defpackage.bkv("Invalid number of bytes read", 0));
        } else {
            byteBuffer.position(i3 + i2);
            this.y.a = byteBuffer;
            defpackage.ejt ejt = this.y;
            if (i2 == 0) {
                z = true;
            }
            ejt.b = z;
            a((java.lang.Runnable) this.y);
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
        b(new defpackage.bkv("ByteBuffer modified externally during write", 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        r3.position(r3.limit());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
        if (r9 == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        if (r0 != (r6.length - 1)) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
        a((java.lang.Runnable) new defpackage.eju(r5, r3, r2));
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005a, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
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
            monitor-exit(r2)     // Catch:{ all -> 0x003d }
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

    @org.chromium.base.annotations.CalledByNative
    private void onResponseTrailersReceived(java.lang.String[] strArr) {
        a((java.lang.Runnable) new defpackage.ejq(this, new defpackage.ejh(a(strArr))));
    }

    @org.chromium.base.annotations.CalledByNative
    private void onError(int i2, int i3, int i4, java.lang.String str, long j2) {
        if (this.g != null) {
            this.g.a(j2);
        }
        if (i2 == 10) {
            b(new defpackage.ekp("Exception in BidirectionalStream: " + str, i3, i4));
        } else {
            b(new defpackage.ejn("Exception in BidirectionalStream: " + str, i2, i3));
        }
    }

    @org.chromium.base.annotations.CalledByNative
    private void onCanceled() {
        a((java.lang.Runnable) new defpackage.ejr(this));
    }

    @org.chromium.base.annotations.CalledByNative
    private void onMetricsCollected(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, boolean z, long j15, long j16) {
        int i2;
        synchronized (this.c) {
            if (this.w != null) {
                throw new java.lang.IllegalStateException("Metrics collection should only happen once.");
            }
            this.w = new defpackage.ejd(j2, j13, j14, j15, j16);
            if (this.e == defpackage.bg.aF) {
                i2 = 0;
            } else if (this.e == defpackage.bg.aD) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            defpackage.ejb ejb = new defpackage.ejb(this.j, this.n, this.w, i2, this.g, this.s);
            org.chromium.net.impl.CronetUrlRequestContext cronetUrlRequestContext = this.h;
            synchronized (cronetUrlRequestContext.e) {
                if (!cronetUrlRequestContext.f.isEmpty()) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(cronetUrlRequestContext.f.values());
                    java.util.ArrayList arrayList2 = arrayList;
                    int size = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size) {
                        java.lang.Object obj = arrayList2.get(i3);
                        i3++;
                        defpackage.ekv ekv = (defpackage.ekv) obj;
                        org.chromium.net.impl.CronetUrlRequestContext.a(ekv.a(), (java.lang.Runnable) new defpackage.ekh(ekv, ejb));
                    }
                }
            }
        }
    }

    public static boolean a(java.lang.String str) {
        return !str.equals("GET") && !str.equals("HEAD");
    }

    private static java.util.ArrayList a(java.lang.String[] strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length / 2);
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            arrayList.add(new java.util.AbstractMap.SimpleImmutableEntry(strArr[i2], strArr[i2 + 1]));
        }
        return arrayList;
    }

    private final void a(java.lang.Runnable runnable) {
        try {
            this.i.execute(runnable);
        } catch (java.util.concurrent.RejectedExecutionException e2) {
            defpackage.dpt.c(org.chromium.net.impl.CronetUrlRequestContext.a, "Exception posting task to executor", e2);
            synchronized (this.c) {
                int i2 = defpackage.bg.aE;
                this.f = i2;
                this.e = i2;
                a(false);
            }
        }
    }

    private final void a(boolean z) {
        defpackage.dpt.a(org.chromium.net.impl.CronetUrlRequestContext.a, "destroyNativeStreamLocked " + toString(), new java.lang.Object[0]);
        if (this.x != 0) {
            nativeDestroy(this.x, z);
            this.h.c.decrementAndGet();
            this.x = 0;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.bkv r6) {
        /*
            r5 = this;
            r4 = 0
            r5.s = r6
            java.lang.Object r1 = r5.c
            monitor-enter(r1)
            boolean r0 = r5.d()     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x000e
            monitor-exit(r1)     // Catch:{ all -> 0x002f }
        L_0x000d:
            return
        L_0x000e:
            int r0 = defpackage.bg.aE     // Catch:{ all -> 0x002f }
            r5.f = r0     // Catch:{ all -> 0x002f }
            r5.e = r0     // Catch:{ all -> 0x002f }
            r0 = 0
            r5.a(r0)     // Catch:{ all -> 0x002f }
            monitor-exit(r1)     // Catch:{ all -> 0x002f }
            eks r0 = r5.a     // Catch:{ Exception -> 0x0021 }
            ekq r1 = r5.g     // Catch:{ Exception -> 0x0021 }
            r0.a(r5, r1, r6)     // Catch:{ Exception -> 0x0021 }
            goto L_0x000d
        L_0x0021:
            r0 = move-exception
            java.lang.String r1 = org.chromium.net.impl.CronetUrlRequestContext.a
            java.lang.String r2 = "Exception notifying of failed request"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r4] = r0
            defpackage.dpt.c(r1, r2, r3)
            goto L_0x000d
        L_0x002f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetBidirectionalStream.a(bkv):void");
    }

    public final void a(java.lang.Exception exc) {
        defpackage.ehs ehs = new defpackage.ehs("CalledByNative method has thrown an exception", exc, 0);
        defpackage.dpt.c(org.chromium.net.impl.CronetUrlRequestContext.a, "Exception in CalledByNative method", exc);
        a((defpackage.bkv) ehs);
    }

    private final void b(defpackage.bkv bkv) {
        a((java.lang.Runnable) new defpackage.ejs(this, bkv));
    }
}
