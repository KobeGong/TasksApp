package defpackage;

/* renamed from: cno reason: default package */
/* compiled from: PG */
public final class cno extends java.lang.Thread {
    public final java.lang.ref.ReferenceQueue a;
    public java.io.File b;
    public final defpackage.cnl c;
    public final defpackage.cnl d;
    private final defpackage.cnm e;
    private final java.util.Deque f = new java.util.ArrayDeque(20);
    private final java.util.Deque g = new java.util.ArrayDeque(3);

    cno(java.lang.ref.ReferenceQueue referenceQueue, defpackage.cnp cnp, defpackage.cnm cnm) {
        setName("Primes-Watcher");
        this.a = referenceQueue;
        this.e = cnm;
        this.c = new defpackage.cnl("Sentinel", "Sentinel", referenceQueue);
        this.d = new defpackage.cnl("Sentinel", "Sentinel", referenceQueue);
        for (int i = 0; i < 20; i++) {
            this.f.add(new java.lang.Object());
        }
        for (int i2 = 0; i2 < 3; i2++) {
            this.g.add(new defpackage.cnl("Sentinel", "Sentinel", referenceQueue));
        }
    }

    public final void run() {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        while (!isInterrupted()) {
            try {
                java.lang.Thread.sleep(5000);
                java.lang.Object poll = this.f.poll();
                this.f.offer(new java.lang.Object());
                defpackage.cnl a2 = defpackage.cnp.a(poll, "", this.a);
                boolean z4 = false;
                while (!z4) {
                    java.lang.ref.Reference reference = null;
                    while (reference == null) {
                        reference = this.a.remove();
                    }
                    java.lang.ref.Reference reference2 = reference;
                    boolean z5 = z4;
                    while (reference2 != null) {
                        if (reference2 == a2) {
                            if (!z5) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            defpackage.cky.b(z3, (java.lang.Object) "Only one dummy released at a time.");
                            z2 = true;
                        } else {
                            java.lang.String a3 = a((defpackage.cnl) reference2);
                            defpackage.cnm cnm = this.e;
                            defpackage.cia cia = (defpackage.cia) cnm.a.get(a3);
                            if (cia == null) {
                                cia = new defpackage.cia();
                                cnm.a.put(a3, cia);
                            }
                            cia.a++;
                            z2 = z5;
                        }
                        z5 = z2;
                        reference2 = this.a.poll();
                    }
                    if (!z5) {
                        this.e.a(false);
                    }
                    z4 = z5;
                }
                defpackage.cnl cnl = (defpackage.cnl) this.g.poll();
                if (cnl.c != null) {
                    z = true;
                } else {
                    z = false;
                }
                int i2 = 0;
                for (defpackage.cnl cnl2 = this.d.c; cnl2 != null; cnl2 = cnl2.c) {
                    i2++;
                }
                while (cnl.c != null) {
                    defpackage.cnl a4 = cnl.c.a();
                    defpackage.cnm cnm2 = this.e;
                    java.lang.String str = a4.a;
                    defpackage.cia cia2 = (defpackage.cia) cnm2.a.get(str);
                    if (cia2 == null) {
                        cia2 = new defpackage.cia();
                        cnm2.a.put(str, cia2);
                    }
                    cia2.b++;
                    if (i2 < 500) {
                        a4.a(this.d);
                        i = i2 + 1;
                    } else {
                        i = i2;
                    }
                    i2 = i;
                }
                this.g.offer(cnl);
                synchronized (this.c) {
                    if (this.c.c != null) {
                        cnl.c = this.c.c;
                        cnl.c.b = cnl;
                        this.c.c = null;
                    }
                }
                this.e.a(z);
            } catch (java.lang.InterruptedException e2) {
                if (this.b != null) {
                    a();
                } else {
                    throw e2;
                }
            } catch (java.lang.InterruptedException e3) {
                interrupt();
                if (this.b != null) {
                    interrupted();
                    a();
                }
            }
        }
        synchronized (this.c) {
            this.c.c = null;
        }
        this.f.clear();
        this.g.clear();
    }

    private final java.lang.String a(defpackage.cnl cnl) {
        if (cnl.b == this.c) {
            synchronized (this.c) {
                cnl.a();
            }
        } else {
            cnl.a();
        }
        return cnl.a;
    }

    /* JADX WARNING: type inference failed for: r2v89 */
    /* JADX WARNING: type inference failed for: r2v90 */
    /* JADX WARNING: type inference failed for: r3v48, types: [int] */
    /* JADX WARNING: type inference failed for: r4v34 */
    /* JADX WARNING: type inference failed for: r3v49 */
    /* JADX WARNING: type inference failed for: r2v143 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a() {
        /*
            r17 = this;
            r0 = r17
            java.io.File r1 = r0.b
            if (r1 == 0) goto L_0x0030
            r1 = 1
        L_0x0007:
            defpackage.cky.b(r1)
            r0 = r17
            java.io.File r1 = r0.b
            boolean r1 = r1.exists()
            if (r1 == 0) goto L_0x0032
            java.lang.String r1 = "LeakWatcherThread"
            java.lang.String r2 = "Abort dumping heap because heapdump file %s exists"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r0 = r17
            java.io.File r5 = r0.b
            java.lang.String r5 = r5.getName()
            r3[r4] = r5
            r4 = 3
            defpackage.cdm.a(r4, r1, r2, r3)
            r1 = 0
            r0 = r17
            r0.b = r1
        L_0x002f:
            return
        L_0x0030:
            r1 = 0
            goto L_0x0007
        L_0x0032:
            cnl r6 = new cnl
            java.lang.String r1 = "Sentinel"
            java.lang.String r2 = "Sentinel"
            r0 = r17
            java.lang.ref.ReferenceQueue r3 = r0.a
            r6.<init>(r1, r2, r3)
            r0 = r17
            cnl r2 = r0.c
            monitor-enter(r2)
            r0 = r17
            cnl r1 = r0.c     // Catch:{ all -> 0x00e5 }
            r6.a(r1)     // Catch:{ all -> 0x00e5 }
            r0 = r17
            cnl r1 = r0.c     // Catch:{ all -> 0x00e5 }
            r3 = 0
            r1.c = r3     // Catch:{ all -> 0x00e5 }
            r1 = 0
            r6.b = r1     // Catch:{ all -> 0x00e5 }
            monitor-exit(r2)     // Catch:{ all -> 0x00e5 }
            java.lang.System.nanoTime()     // Catch:{ Throwable -> 0x00b2 }
            r0 = r17
            java.io.File r1 = r0.b     // Catch:{ Throwable -> 0x00b2 }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ Throwable -> 0x00b2 }
            android.os.Debug.dumpHprofData(r1)     // Catch:{ Throwable -> 0x00b2 }
            java.lang.System.nanoTime()     // Catch:{ Throwable -> 0x00b2 }
            cmt r1 = new cmt     // Catch:{ Throwable -> 0x00b2 }
            r0 = r17
            java.io.File r2 = r0.b     // Catch:{ Throwable -> 0x00b2 }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x00b2 }
            java.lang.Class<cnl> r2 = defpackage.cnl.class
            java.lang.String r5 = r2.getName()     // Catch:{ Throwable -> 0x00b2 }
            java.io.File r1 = r1.c     // Catch:{ Throwable -> 0x00b2 }
            cnc r7 = defpackage.cnc.a(r1)     // Catch:{ Throwable -> 0x00b2 }
            java.util.Set r1 = java.util.Collections.singleton(r5)     // Catch:{ Throwable -> 0x00b2 }
            java.lang.Iterable r2 = defpackage.cmt.b     // Catch:{ Throwable -> 0x00b2 }
            java.lang.Iterable r3 = defpackage.cmt.a     // Catch:{ Throwable -> 0x00b2 }
            cmy r8 = new cmy     // Catch:{ Throwable -> 0x00b2 }
            r8.<init>(r7, r2, r3, r1)     // Catch:{ Throwable -> 0x00b2 }
        L_0x0089:
            java.nio.ByteBuffer r1 = r8.b     // Catch:{ Throwable -> 0x00b2 }
            boolean r1 = r1.hasRemaining()     // Catch:{ Throwable -> 0x00b2 }
            if (r1 == 0) goto L_0x04cc
            java.nio.ByteBuffer r1 = r8.b     // Catch:{ Throwable -> 0x00b2 }
            byte r1 = r1.get()     // Catch:{ Throwable -> 0x00b2 }
            java.nio.ByteBuffer r2 = r8.b     // Catch:{ Throwable -> 0x00b2 }
            r2.getInt()     // Catch:{ Throwable -> 0x00b2 }
            java.nio.ByteBuffer r2 = r8.b     // Catch:{ Throwable -> 0x00b2 }
            java.nio.ByteBuffer r3 = r8.b     // Catch:{ Throwable -> 0x00b2 }
            int r3 = r3.position()     // Catch:{ Throwable -> 0x00b2 }
            int r2 = r2.getInt(r3)     // Catch:{ Throwable -> 0x00b2 }
            if (r2 >= 0) goto L_0x00e8
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ Throwable -> 0x00b2 }
            java.lang.String r2 = "Length too large to parse."
            r1.<init>(r2)     // Catch:{ Throwable -> 0x00b2 }
            throw r1     // Catch:{ Throwable -> 0x00b2 }
        L_0x00b2:
            r1 = move-exception
            java.lang.String r2 = "LeakWatcherThread"
            java.lang.String r3 = "Failed to analyze dump"
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x00d7 }
            defpackage.cdm.a(r2, r3, r1, r4)     // Catch:{ all -> 0x00d7 }
            r0 = r17
            cnl r2 = r0.c     // Catch:{ all -> 0x00d7 }
            monitor-enter(r2)     // Catch:{ all -> 0x00d7 }
        L_0x00c2:
            cnl r1 = r6.c     // Catch:{ all -> 0x00d4 }
            if (r1 == 0) goto L_0x076b
            cnl r1 = r6.c     // Catch:{ all -> 0x00d4 }
            cnl r1 = r1.a()     // Catch:{ all -> 0x00d4 }
            r0 = r17
            cnl r3 = r0.c     // Catch:{ all -> 0x00d4 }
            r1.a(r3)     // Catch:{ all -> 0x00d4 }
            goto L_0x00c2
        L_0x00d4:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00d4 }
            throw r1     // Catch:{ all -> 0x00d7 }
        L_0x00d7:
            r1 = move-exception
            r0 = r17
            java.io.File r2 = r0.b
            r3 = 0
            r0 = r17
            r0.b = r3
            r2.delete()
            throw r1
        L_0x00e5:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00e5 }
            throw r1
        L_0x00e8:
            switch(r1) {
                case 1: goto L_0x00f7;
                case 2: goto L_0x011a;
                case 12: goto L_0x01a3;
                case 28: goto L_0x01a3;
                default: goto L_0x00eb;
            }
        L_0x00eb:
            java.nio.ByteBuffer r1 = r8.b     // Catch:{ Throwable -> 0x00b2 }
            int r1 = r1.getInt()     // Catch:{ Throwable -> 0x00b2 }
            cnc r2 = r8.a     // Catch:{ Throwable -> 0x00b2 }
            r2.c(r1)     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x0089
        L_0x00f7:
            java.nio.ByteBuffer r1 = r8.b     // Catch:{ Throwable -> 0x00b2 }
            int r1 = r1.position()     // Catch:{ Throwable -> 0x00b2 }
            java.nio.ByteBuffer r2 = r8.b     // Catch:{ Throwable -> 0x00b2 }
            int r2 = r2.getInt()     // Catch:{ Throwable -> 0x00b2 }
            cnc r3 = r8.a     // Catch:{ Throwable -> 0x00b2 }
            int r3 = r3.a()     // Catch:{ Throwable -> 0x00b2 }
            cne r4 = r8.c     // Catch:{ Throwable -> 0x00b2 }
            r4.a(r3, r1)     // Catch:{ Throwable -> 0x00b2 }
            cnc r1 = r8.a     // Catch:{ Throwable -> 0x00b2 }
            cnc r3 = r8.a     // Catch:{ Throwable -> 0x00b2 }
            int r3 = r3.b     // Catch:{ Throwable -> 0x00b2 }
            int r2 = r2 - r3
            r1.c(r2)     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x0089
        L_0x011a:
            java.nio.ByteBuffer r1 = r8.b     // Catch:{ Throwable -> 0x00b2 }
            r1.getInt()     // Catch:{ Throwable -> 0x00b2 }
            java.nio.ByteBuffer r1 = r8.b     // Catch:{ Throwable -> 0x00b2 }
            r1.getInt()     // Catch:{ Throwable -> 0x00b2 }
            java.nio.ByteBuffer r1 = r8.b     // Catch:{ Throwable -> 0x00b2 }
            int r1 = r1.position()     // Catch:{ Throwable -> 0x00b2 }
            cnc r2 = r8.a     // Catch:{ Throwable -> 0x00b2 }
            int r3 = r2.a()     // Catch:{ Throwable -> 0x00b2 }
            java.nio.ByteBuffer r2 = r8.b     // Catch:{ Throwable -> 0x00b2 }
            r2.getInt()     // Catch:{ Throwable -> 0x00b2 }
            cne r2 = r8.c     // Catch:{ Throwable -> 0x00b2 }
            cnc r4 = r8.a     // Catch:{ Throwable -> 0x00b2 }
            int r4 = r4.a()     // Catch:{ Throwable -> 0x00b2 }
            int r2 = r2.b(r4)     // Catch:{ Throwable -> 0x00b2 }
            cmv r4 = new cmv     // Catch:{ Throwable -> 0x00b2 }
            r4.<init>(r1, r2)     // Catch:{ Throwable -> 0x00b2 }
            cng r1 = r8.e     // Catch:{ Throwable -> 0x00b2 }
            r1.a(r3, r4)     // Catch:{ Throwable -> 0x00b2 }
            cnc r1 = r8.a     // Catch:{ Throwable -> 0x00b2 }
            java.nio.ByteBuffer r9 = r1.a     // Catch:{ Throwable -> 0x00b2 }
            int r9 = r9.getInt(r2)     // Catch:{ Throwable -> 0x00b2 }
            int r1 = r1.b     // Catch:{ Throwable -> 0x00b2 }
            int r9 = r9 - r1
            cnc r1 = r8.a     // Catch:{ Throwable -> 0x00b2 }
            int r2 = r2 + 4
            int r1 = r1.b     // Catch:{ Throwable -> 0x00b2 }
            int r1 = r1 + r2
            cni r2 = r8.m     // Catch:{ Throwable -> 0x00b2 }
            java.nio.ByteBuffer r10 = r8.b     // Catch:{ Throwable -> 0x00b2 }
            cnj r2 = r2.a     // Catch:{ Throwable -> 0x00b2 }
            int r9 = r9 + r1
            r16 = r1
            r1 = r2
            r2 = r16
        L_0x0169:
            if (r2 >= r9) goto L_0x018b
            byte r11 = r10.get(r2)     // Catch:{ Throwable -> 0x00b2 }
            rj r12 = r1.b     // Catch:{ Throwable -> 0x00b2 }
            if (r12 == 0) goto L_0x017d
            rj r1 = r1.b     // Catch:{ Throwable -> 0x00b2 }
            java.lang.Object r1 = r1.a(r11)     // Catch:{ Throwable -> 0x00b2 }
            cnj r1 = (defpackage.cnj) r1     // Catch:{ Throwable -> 0x00b2 }
            if (r1 != 0) goto L_0x0188
        L_0x017d:
            r1 = 0
        L_0x017e:
            cmz r1 = (defpackage.cmz) r1     // Catch:{ Throwable -> 0x00b2 }
            cmz r2 = defpackage.cmz.IDENTIFY_OBJECT_CLASS     // Catch:{ Throwable -> 0x00b2 }
            if (r1 != r2) goto L_0x018e
            r8.i = r3     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x0089
        L_0x0188:
            int r2 = r2 + 1
            goto L_0x0169
        L_0x018b:
            java.lang.Object r1 = r1.a     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x017e
        L_0x018e:
            cmz r2 = defpackage.cmz.CLASSIFY_REF     // Catch:{ Throwable -> 0x00b2 }
            if (r1 != r2) goto L_0x019a
            int r1 = r4.j     // Catch:{ Throwable -> 0x00b2 }
            r1 = r1 | 2
            r4.j = r1     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x0089
        L_0x019a:
            if (r1 == 0) goto L_0x0089
            cng r2 = r8.k     // Catch:{ Throwable -> 0x00b2 }
            r2.a(r3, r1)     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x0089
        L_0x01a3:
            java.nio.ByteBuffer r1 = r8.b     // Catch:{ Throwable -> 0x00b2 }
            int r1 = r1.getInt()     // Catch:{ Throwable -> 0x00b2 }
            java.nio.ByteBuffer r2 = r8.b     // Catch:{ Throwable -> 0x00b2 }
            int r2 = r2.position()     // Catch:{ Throwable -> 0x00b2 }
            int r9 = r2 + r1
        L_0x01b1:
            java.nio.ByteBuffer r1 = r8.b     // Catch:{ Throwable -> 0x00b2 }
            int r1 = r1.position()     // Catch:{ Throwable -> 0x00b2 }
            if (r1 >= r9) goto L_0x04bc
            java.nio.ByteBuffer r1 = r8.b     // Catch:{ Throwable -> 0x00b2 }
            byte r1 = r1.get()     // Catch:{ Throwable -> 0x00b2 }
            r1 = r1 & 255(0xff, float:3.57E-43)
            cnc r2 = r8.a     // Catch:{ Throwable -> 0x00b2 }
            cne r2 = r2.c     // Catch:{ Throwable -> 0x00b2 }
            boolean r2 = r2.c(r1)     // Catch:{ Throwable -> 0x00b2 }
            if (r2 == 0) goto L_0x01f7
            cnc r2 = r8.a     // Catch:{ Throwable -> 0x00b2 }
            cne r2 = r2.c     // Catch:{ Throwable -> 0x00b2 }
            int r2 = r2.b(r1)     // Catch:{ Throwable -> 0x00b2 }
            cne r3 = r8.h     // Catch:{ Throwable -> 0x00b2 }
            boolean r3 = r3.c(r1)     // Catch:{ Throwable -> 0x00b2 }
            if (r3 == 0) goto L_0x01e1
            cnc r1 = r8.a     // Catch:{ Throwable -> 0x00b2 }
            r1.c(r2)     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x01b1
        L_0x01e1:
            cnc r3 = r8.a     // Catch:{ Throwable -> 0x00b2 }
            int r3 = r3.a()     // Catch:{ Throwable -> 0x00b2 }
            cne r4 = r8.d     // Catch:{ Throwable -> 0x00b2 }
            r4.a(r3, r1)     // Catch:{ Throwable -> 0x00b2 }
            cnc r1 = r8.a     // Catch:{ Throwable -> 0x00b2 }
            cnc r3 = r8.a     // Catch:{ Throwable -> 0x00b2 }
            int r3 = r3.b     // Catch:{ Throwable -> 0x00b2 }
            int r2 = r2 - r3
            r1.c(r2)     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x01b1
        L_0x01f7:
            switch(r1) {
                case 32: goto L_0x0215;
                case 33: goto L_0x03a3;
                case 34: goto L_0x0408;
                case 35: goto L_0x0460;
                case 195: goto L_0x0460;
                case 254: goto L_0x04a1;
                default: goto L_0x01fa;
            }     // Catch:{ Throwable -> 0x00b2 }
        L_0x01fa:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ Throwable -> 0x00b2 }
            r3 = 23
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00b2 }
            r4.<init>(r3)     // Catch:{ Throwable -> 0x00b2 }
            java.lang.String r3 = "Unknown tag "
            java.lang.StringBuilder r3 = r4.append(r3)     // Catch:{ Throwable -> 0x00b2 }
            java.lang.StringBuilder r1 = r3.append(r1)     // Catch:{ Throwable -> 0x00b2 }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x00b2 }
            r2.<init>(r1)     // Catch:{ Throwable -> 0x00b2 }
            throw r2     // Catch:{ Throwable -> 0x00b2 }
        L_0x0215:
            cnc r1 = r8.a     // Catch:{ Throwable -> 0x00b2 }
            int r1 = r1.a()     // Catch:{ Throwable -> 0x00b2 }
            int r2 = r8.i     // Catch:{ Throwable -> 0x00b2 }
            if (r1 != r2) goto L_0x02a8
            cng r2 = r8.e     // Catch:{ Throwable -> 0x00b2 }
            java.lang.Object r1 = r2.a(r1)     // Catch:{ Throwable -> 0x00b2 }
            cmv r1 = (defpackage.cmv) r1     // Catch:{ Throwable -> 0x00b2 }
            cnc r3 = r8.a     // Catch:{ Throwable -> 0x00b2 }
            cng r2 = r8.e     // Catch:{ Throwable -> 0x00b2 }
            java.nio.ByteBuffer r4 = r3.a     // Catch:{ Throwable -> 0x00b2 }
            int r10 = r4.position()     // Catch:{ Throwable -> 0x00b2 }
            int r11 = r3.b     // Catch:{ Throwable -> 0x00b2 }
            int r10 = r10 - r11
            r1.h = r10     // Catch:{ Throwable -> 0x00b2 }
            r4.getInt()     // Catch:{ Throwable -> 0x00b2 }
            int r4 = r3.a()     // Catch:{ Throwable -> 0x00b2 }
            java.lang.Object r2 = r2.a(r4)     // Catch:{ Throwable -> 0x00b2 }
            cmv r2 = (defpackage.cmv) r2     // Catch:{ Throwable -> 0x00b2 }
            r1.f = r2     // Catch:{ Throwable -> 0x00b2 }
            int r2 = r3.b     // Catch:{ Throwable -> 0x00b2 }
            int r2 = r2 * 5
            int r2 = r2 + 4
            r3.c(r2)     // Catch:{ Throwable -> 0x00b2 }
            defpackage.cmv.c(r3)     // Catch:{ Throwable -> 0x00b2 }
            java.nio.ByteBuffer r4 = r3.a     // Catch:{ Throwable -> 0x00b2 }
            short r2 = r4.getShort()     // Catch:{ Throwable -> 0x00b2 }
            r10 = 65535(0xffff, float:9.1834E-41)
            r10 = r10 & r2
            r2 = 0
        L_0x025c:
            if (r2 >= r10) goto L_0x026f
            r3.a()     // Catch:{ Throwable -> 0x00b2 }
            byte r11 = r4.get()     // Catch:{ Throwable -> 0x00b2 }
            int r11 = r3.b(r11)     // Catch:{ Throwable -> 0x00b2 }
            r3.c(r11)     // Catch:{ Throwable -> 0x00b2 }
            int r2 = r2 + 1
            goto L_0x025c
        L_0x026f:
            r2 = 0
            int[] r2 = new int[r2]     // Catch:{ Throwable -> 0x00b2 }
            r1.a = r2     // Catch:{ Throwable -> 0x00b2 }
            r2 = 0
            int[] r2 = new int[r2]     // Catch:{ Throwable -> 0x00b2 }
            r1.b = r2     // Catch:{ Throwable -> 0x00b2 }
            java.nio.ByteBuffer r4 = r3.a     // Catch:{ Throwable -> 0x00b2 }
            short r2 = r4.getShort()     // Catch:{ Throwable -> 0x00b2 }
            r10 = 65535(0xffff, float:9.1834E-41)
            r10 = r10 & r2
            r2 = 0
            r1.e = r2     // Catch:{ Throwable -> 0x00b2 }
            r2 = 0
        L_0x0287:
            if (r2 >= r10) goto L_0x029c
            r3.a()     // Catch:{ Throwable -> 0x00b2 }
            byte r11 = r4.get()     // Catch:{ Throwable -> 0x00b2 }
            int r12 = r1.e     // Catch:{ Throwable -> 0x00b2 }
            int r11 = r3.b(r11)     // Catch:{ Throwable -> 0x00b2 }
            int r11 = r11 + r12
            r1.e = r11     // Catch:{ Throwable -> 0x00b2 }
            int r2 = r2 + 1
            goto L_0x0287
        L_0x029c:
            r2 = 0
            int[] r2 = new int[r2]     // Catch:{ Throwable -> 0x00b2 }
            r1.c = r2     // Catch:{ Throwable -> 0x00b2 }
            r2 = 0
            int[] r2 = new int[r2]     // Catch:{ Throwable -> 0x00b2 }
            r1.d = r2     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x01b1
        L_0x02a8:
            cng r2 = r8.e     // Catch:{ Throwable -> 0x00b2 }
            java.lang.Object r1 = r2.a(r1)     // Catch:{ Throwable -> 0x00b2 }
            cmv r1 = (defpackage.cmv) r1     // Catch:{ Throwable -> 0x00b2 }
            cnc r10 = r8.a     // Catch:{ Throwable -> 0x00b2 }
            cng r2 = r8.e     // Catch:{ Throwable -> 0x00b2 }
            cne r11 = r8.c     // Catch:{ Throwable -> 0x00b2 }
            java.nio.ByteBuffer r3 = r10.a     // Catch:{ Throwable -> 0x00b2 }
            int r4 = r3.position()     // Catch:{ Throwable -> 0x00b2 }
            int r12 = r10.b     // Catch:{ Throwable -> 0x00b2 }
            int r4 = r4 - r12
            r1.h = r4     // Catch:{ Throwable -> 0x00b2 }
            r3.getInt()     // Catch:{ Throwable -> 0x00b2 }
            int r4 = r10.a()     // Catch:{ Throwable -> 0x00b2 }
            java.lang.Object r2 = r2.a(r4)     // Catch:{ Throwable -> 0x00b2 }
            cmv r2 = (defpackage.cmv) r2     // Catch:{ Throwable -> 0x00b2 }
            r1.f = r2     // Catch:{ Throwable -> 0x00b2 }
            int r2 = r10.b     // Catch:{ Throwable -> 0x00b2 }
            int r2 = r2 * 5
            r10.c(r2)     // Catch:{ Throwable -> 0x00b2 }
            r3.getInt()     // Catch:{ Throwable -> 0x00b2 }
            defpackage.cmv.c(r10)     // Catch:{ Throwable -> 0x00b2 }
            java.nio.ByteBuffer r4 = r10.a     // Catch:{ Throwable -> 0x00b2 }
            short r2 = r4.getShort()     // Catch:{ Throwable -> 0x00b2 }
            r3 = 65535(0xffff, float:9.1834E-41)
            r12 = r2 & r3
            int[] r2 = new int[r12]     // Catch:{ Throwable -> 0x00b2 }
            r1.a = r2     // Catch:{ Throwable -> 0x00b2 }
            int[] r2 = new int[r12]     // Catch:{ Throwable -> 0x00b2 }
            r1.b = r2     // Catch:{ Throwable -> 0x00b2 }
            r3 = 0
            r2 = 0
            r16 = r2
            r2 = r3
            r3 = r16
        L_0x02f7:
            if (r3 >= r12) goto L_0x0326
            int r13 = r10.a()     // Catch:{ Throwable -> 0x00b2 }
            byte r14 = r4.get()     // Catch:{ Throwable -> 0x00b2 }
            boolean r15 = defpackage.cnc.e(r14)     // Catch:{ Throwable -> 0x00b2 }
            if (r15 == 0) goto L_0x031e
            int r14 = r10.a()     // Catch:{ Throwable -> 0x00b2 }
            if (r14 == 0) goto L_0x031b
            int[] r15 = r1.a     // Catch:{ Throwable -> 0x00b2 }
            r15[r2] = r14     // Catch:{ Throwable -> 0x00b2 }
            int[] r14 = r1.b     // Catch:{ Throwable -> 0x00b2 }
            int r13 = r11.b(r13)     // Catch:{ Throwable -> 0x00b2 }
            r14[r2] = r13     // Catch:{ Throwable -> 0x00b2 }
            int r2 = r2 + 1
        L_0x031b:
            int r3 = r3 + 1
            goto L_0x02f7
        L_0x031e:
            int r13 = r10.b(r14)     // Catch:{ Throwable -> 0x00b2 }
            r10.c(r13)     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x031b
        L_0x0326:
            if (r2 != r12) goto L_0x0379
            int[] r3 = r1.a     // Catch:{ Throwable -> 0x00b2 }
        L_0x032a:
            r1.a = r3     // Catch:{ Throwable -> 0x00b2 }
            if (r2 != r12) goto L_0x0380
            int[] r2 = r1.b     // Catch:{ Throwable -> 0x00b2 }
        L_0x0330:
            r1.b = r2     // Catch:{ Throwable -> 0x00b2 }
            java.nio.ByteBuffer r12 = r10.a     // Catch:{ Throwable -> 0x00b2 }
            short r2 = r12.getShort()     // Catch:{ Throwable -> 0x00b2 }
            r3 = 65535(0xffff, float:9.1834E-41)
            r13 = r2 & r3
            int[] r2 = new int[r13]     // Catch:{ Throwable -> 0x00b2 }
            r1.c = r2     // Catch:{ Throwable -> 0x00b2 }
            int[] r2 = new int[r13]     // Catch:{ Throwable -> 0x00b2 }
            r1.d = r2     // Catch:{ Throwable -> 0x00b2 }
            r3 = 0
            r2 = 0
            r1.e = r2     // Catch:{ Throwable -> 0x00b2 }
            r2 = 0
            r4 = r2
        L_0x034b:
            if (r4 >= r13) goto L_0x0387
            int r2 = r10.a()     // Catch:{ Throwable -> 0x00b2 }
            byte r14 = r12.get()     // Catch:{ Throwable -> 0x00b2 }
            boolean r15 = defpackage.cnc.e(r14)     // Catch:{ Throwable -> 0x00b2 }
            if (r15 == 0) goto L_0x077a
            int[] r15 = r1.c     // Catch:{ Throwable -> 0x00b2 }
            int r2 = r11.b(r2)     // Catch:{ Throwable -> 0x00b2 }
            r15[r3] = r2     // Catch:{ Throwable -> 0x00b2 }
            int[] r2 = r1.d     // Catch:{ Throwable -> 0x00b2 }
            int r15 = r1.e     // Catch:{ Throwable -> 0x00b2 }
            r2[r3] = r15     // Catch:{ Throwable -> 0x00b2 }
            int r2 = r3 + 1
        L_0x036b:
            int r3 = r1.e     // Catch:{ Throwable -> 0x00b2 }
            int r14 = r10.b(r14)     // Catch:{ Throwable -> 0x00b2 }
            int r3 = r3 + r14
            r1.e = r3     // Catch:{ Throwable -> 0x00b2 }
            int r3 = r4 + 1
            r4 = r3
            r3 = r2
            goto L_0x034b
        L_0x0379:
            int[] r3 = r1.a     // Catch:{ Throwable -> 0x00b2 }
            int[] r3 = java.util.Arrays.copyOf(r3, r2)     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x032a
        L_0x0380:
            int[] r3 = r1.b     // Catch:{ Throwable -> 0x00b2 }
            int[] r2 = java.util.Arrays.copyOf(r3, r2)     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x0330
        L_0x0387:
            if (r3 != r13) goto L_0x0395
            int[] r2 = r1.c     // Catch:{ Throwable -> 0x00b2 }
        L_0x038b:
            r1.c = r2     // Catch:{ Throwable -> 0x00b2 }
            if (r3 != r13) goto L_0x039c
            int[] r2 = r1.d     // Catch:{ Throwable -> 0x00b2 }
        L_0x0391:
            r1.d = r2     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x01b1
        L_0x0395:
            int[] r2 = r1.c     // Catch:{ Throwable -> 0x00b2 }
            int[] r2 = java.util.Arrays.copyOf(r2, r3)     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x038b
        L_0x039c:
            int[] r2 = r1.d     // Catch:{ Throwable -> 0x00b2 }
            int[] r2 = java.util.Arrays.copyOf(r2, r3)     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x0391
        L_0x03a3:
            java.nio.ByteBuffer r1 = r8.b     // Catch:{ Throwable -> 0x00b2 }
            int r3 = r1.position()     // Catch:{ Throwable -> 0x00b2 }
            cnc r1 = r8.a     // Catch:{ Throwable -> 0x00b2 }
            int r4 = r1.a()     // Catch:{ Throwable -> 0x00b2 }
            java.nio.ByteBuffer r1 = r8.b     // Catch:{ Throwable -> 0x00b2 }
            r1.getInt()     // Catch:{ Throwable -> 0x00b2 }
            cnc r1 = r8.a     // Catch:{ Throwable -> 0x00b2 }
            int r2 = r1.a()     // Catch:{ Throwable -> 0x00b2 }
            java.nio.ByteBuffer r1 = r8.b     // Catch:{ Throwable -> 0x00b2 }
            int r10 = r1.getInt()     // Catch:{ Throwable -> 0x00b2 }
            cng r1 = r8.e     // Catch:{ Throwable -> 0x00b2 }
            java.lang.Object r1 = r1.a(r2)     // Catch:{ Throwable -> 0x00b2 }
            cmv r1 = (defpackage.cmv) r1     // Catch:{ Throwable -> 0x00b2 }
            cng r11 = r8.k     // Catch:{ Throwable -> 0x00b2 }
            java.lang.Object r2 = r11.a(r2)     // Catch:{ Throwable -> 0x00b2 }
            cmz r2 = (defpackage.cmz) r2     // Catch:{ Throwable -> 0x00b2 }
            if (r1 == 0) goto L_0x0401
            cmz r11 = defpackage.cmz.EXCLUDE_INSTANCE     // Catch:{ Throwable -> 0x00b2 }
            if (r2 == r11) goto L_0x0401
            cmw r11 = new cmw     // Catch:{ Throwable -> 0x00b2 }
            r11.<init>(r3, r1)     // Catch:{ Throwable -> 0x00b2 }
            cng r3 = r8.f     // Catch:{ Throwable -> 0x00b2 }
            r3.a(r4, r11)     // Catch:{ Throwable -> 0x00b2 }
            cmz r3 = defpackage.cmz.FIND_INSTANCE     // Catch:{ Throwable -> 0x00b2 }
            if (r2 != r3) goto L_0x0401
            cnc r2 = r8.a     // Catch:{ Throwable -> 0x00b2 }
            java.lang.String r2 = r1.b(r2)     // Catch:{ Throwable -> 0x00b2 }
            java.util.Map r1 = r8.g     // Catch:{ Throwable -> 0x00b2 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Throwable -> 0x00b2 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ Throwable -> 0x00b2 }
            if (r1 != 0) goto L_0x03fe
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Throwable -> 0x00b2 }
            r1.<init>()     // Catch:{ Throwable -> 0x00b2 }
            java.util.Map r3 = r8.g     // Catch:{ Throwable -> 0x00b2 }
            r3.put(r2, r1)     // Catch:{ Throwable -> 0x00b2 }
        L_0x03fe:
            r1.add(r11)     // Catch:{ Throwable -> 0x00b2 }
        L_0x0401:
            cnc r1 = r8.a     // Catch:{ Throwable -> 0x00b2 }
            r1.c(r10)     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x01b1
        L_0x0408:
            java.nio.ByteBuffer r1 = r8.b     // Catch:{ Throwable -> 0x00b2 }
            int r3 = r1.position()     // Catch:{ Throwable -> 0x00b2 }
            cnc r1 = r8.a     // Catch:{ Throwable -> 0x00b2 }
            int r4 = r1.a()     // Catch:{ Throwable -> 0x00b2 }
            java.nio.ByteBuffer r1 = r8.b     // Catch:{ Throwable -> 0x00b2 }
            r1.getInt()     // Catch:{ Throwable -> 0x00b2 }
            java.nio.ByteBuffer r1 = r8.b     // Catch:{ Throwable -> 0x00b2 }
            int r10 = r1.getInt()     // Catch:{ Throwable -> 0x00b2 }
            cnc r1 = r8.a     // Catch:{ Throwable -> 0x00b2 }
            int r11 = r1.a()     // Catch:{ Throwable -> 0x00b2 }
            cng r1 = r8.k     // Catch:{ Throwable -> 0x00b2 }
            java.lang.Object r1 = r1.a(r11)     // Catch:{ Throwable -> 0x00b2 }
            cmz r1 = (defpackage.cmz) r1     // Catch:{ Throwable -> 0x00b2 }
            cng r2 = r8.e     // Catch:{ Throwable -> 0x00b2 }
            java.lang.Object r2 = r2.a(r11)     // Catch:{ Throwable -> 0x00b2 }
            if (r2 == 0) goto L_0x045e
            java.lang.Object r12 = defpackage.cng.a     // Catch:{ Throwable -> 0x00b2 }
            if (r2 == r12) goto L_0x045e
            r2 = 1
        L_0x043a:
            if (r2 == 0) goto L_0x0452
            cmz r2 = defpackage.cmz.EXCLUDE_INSTANCE     // Catch:{ Throwable -> 0x00b2 }
            if (r1 == r2) goto L_0x0452
            cmu r2 = new cmu     // Catch:{ Throwable -> 0x00b2 }
            cng r1 = r8.e     // Catch:{ Throwable -> 0x00b2 }
            java.lang.Object r1 = r1.a(r11)     // Catch:{ Throwable -> 0x00b2 }
            cmv r1 = (defpackage.cmv) r1     // Catch:{ Throwable -> 0x00b2 }
            r2.<init>(r3, r1)     // Catch:{ Throwable -> 0x00b2 }
            cng r1 = r8.f     // Catch:{ Throwable -> 0x00b2 }
            r1.a(r4, r2)     // Catch:{ Throwable -> 0x00b2 }
        L_0x0452:
            cnc r1 = r8.a     // Catch:{ Throwable -> 0x00b2 }
            cnc r2 = r8.a     // Catch:{ Throwable -> 0x00b2 }
            int r2 = r2.b     // Catch:{ Throwable -> 0x00b2 }
            int r2 = r2 * r10
            r1.c(r2)     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x01b1
        L_0x045e:
            r2 = 0
            goto L_0x043a
        L_0x0460:
            java.nio.ByteBuffer r1 = r8.b     // Catch:{ Throwable -> 0x00b2 }
            int r2 = r1.position()     // Catch:{ Throwable -> 0x00b2 }
            cnc r1 = r8.a     // Catch:{ Throwable -> 0x00b2 }
            int r3 = r1.a()     // Catch:{ Throwable -> 0x00b2 }
            java.nio.ByteBuffer r1 = r8.b     // Catch:{ Throwable -> 0x00b2 }
            r1.getInt()     // Catch:{ Throwable -> 0x00b2 }
            java.nio.ByteBuffer r1 = r8.b     // Catch:{ Throwable -> 0x00b2 }
            int r4 = r1.getInt()     // Catch:{ Throwable -> 0x00b2 }
            java.nio.ByteBuffer r1 = r8.b     // Catch:{ Throwable -> 0x00b2 }
            byte r10 = r1.get()     // Catch:{ Throwable -> 0x00b2 }
            cng r1 = r8.l     // Catch:{ Throwable -> 0x00b2 }
            java.lang.Object r1 = r1.a(r10)     // Catch:{ Throwable -> 0x00b2 }
            cmz r1 = (defpackage.cmz) r1     // Catch:{ Throwable -> 0x00b2 }
            cnc r11 = r8.a     // Catch:{ Throwable -> 0x00b2 }
            cnc r12 = r8.a     // Catch:{ Throwable -> 0x00b2 }
            int r10 = r12.b(r10)     // Catch:{ Throwable -> 0x00b2 }
            int r4 = r4 * r10
            r11.c(r4)     // Catch:{ Throwable -> 0x00b2 }
            cmz r4 = defpackage.cmz.EXCLUDE_INSTANCE     // Catch:{ Throwable -> 0x00b2 }
            if (r1 == r4) goto L_0x01b1
            cna r1 = new cna     // Catch:{ Throwable -> 0x00b2 }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x00b2 }
            cng r2 = r8.f     // Catch:{ Throwable -> 0x00b2 }
            r2.a(r3, r1)     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x01b1
        L_0x04a1:
            java.nio.ByteBuffer r1 = r8.b     // Catch:{ Throwable -> 0x00b2 }
            r1.getInt()     // Catch:{ Throwable -> 0x00b2 }
            cnc r1 = r8.a     // Catch:{ Throwable -> 0x00b2 }
            int r1 = r1.a()     // Catch:{ Throwable -> 0x00b2 }
            cnc r2 = r8.a     // Catch:{ Throwable -> 0x00b2 }
            cne r3 = r8.c     // Catch:{ Throwable -> 0x00b2 }
            int r1 = r3.b(r1)     // Catch:{ Throwable -> 0x00b2 }
            java.lang.String r1 = r2.a(r1)     // Catch:{ Throwable -> 0x00b2 }
            r8.j = r1     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x01b1
        L_0x04bc:
            java.nio.ByteBuffer r1 = r8.b     // Catch:{ Throwable -> 0x00b2 }
            int r1 = r1.position()     // Catch:{ Throwable -> 0x00b2 }
            if (r1 != r9) goto L_0x04ca
            r1 = 1
        L_0x04c5:
            defpackage.cky.b(r1)     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x0089
        L_0x04ca:
            r1 = 0
            goto L_0x04c5
        L_0x04cc:
            cng r1 = r8.e     // Catch:{ Throwable -> 0x00b2 }
            cnh r2 = new cnh     // Catch:{ Throwable -> 0x00b2 }
            int[] r3 = r1.b     // Catch:{ Throwable -> 0x00b2 }
            java.lang.Object[] r1 = r1.c     // Catch:{ Throwable -> 0x00b2 }
            r2.<init>(r3, r1)     // Catch:{ Throwable -> 0x00b2 }
        L_0x04d7:
            r1 = 0
            r2.c = r1     // Catch:{ Throwable -> 0x00b2 }
        L_0x04da:
            java.lang.Object r1 = r2.c     // Catch:{ Throwable -> 0x00b2 }
            if (r1 == 0) goto L_0x04e4
            java.lang.Object r1 = r2.c     // Catch:{ Throwable -> 0x00b2 }
            java.lang.Object r3 = defpackage.cng.a     // Catch:{ Throwable -> 0x00b2 }
            if (r1 != r3) goto L_0x04f8
        L_0x04e4:
            int r1 = r2.b     // Catch:{ Throwable -> 0x00b2 }
            java.lang.Object[] r3 = r2.a     // Catch:{ Throwable -> 0x00b2 }
            int r3 = r3.length     // Catch:{ Throwable -> 0x00b2 }
            if (r1 >= r3) goto L_0x04f8
            java.lang.Object[] r1 = r2.a     // Catch:{ Throwable -> 0x00b2 }
            int r3 = r2.b     // Catch:{ Throwable -> 0x00b2 }
            int r4 = r3 + 1
            r2.b = r4     // Catch:{ Throwable -> 0x00b2 }
            r1 = r1[r3]     // Catch:{ Throwable -> 0x00b2 }
            r2.c = r1     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x04da
        L_0x04f8:
            java.lang.Object r1 = r2.c     // Catch:{ Throwable -> 0x00b2 }
            if (r1 == 0) goto L_0x050d
            java.lang.Object r1 = r2.c     // Catch:{ Throwable -> 0x00b2 }
            java.lang.Object r3 = defpackage.cng.a     // Catch:{ Throwable -> 0x00b2 }
            if (r1 == r3) goto L_0x050d
            r1 = 1
        L_0x0503:
            if (r1 == 0) goto L_0x050f
            java.lang.Object r1 = r2.c     // Catch:{ Throwable -> 0x00b2 }
            cmv r1 = (defpackage.cmv) r1     // Catch:{ Throwable -> 0x00b2 }
            r1.a()     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x04d7
        L_0x050d:
            r1 = 0
            goto L_0x0503
        L_0x050f:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Throwable -> 0x00b2 }
            r2.<init>()     // Catch:{ Throwable -> 0x00b2 }
            cne r1 = r8.d     // Catch:{ Throwable -> 0x00b2 }
            cnf r3 = new cnf     // Catch:{ Throwable -> 0x00b2 }
            int[] r4 = r1.c     // Catch:{ Throwable -> 0x00b2 }
            int[] r9 = r1.d     // Catch:{ Throwable -> 0x00b2 }
            int r1 = r1.b     // Catch:{ Throwable -> 0x00b2 }
            r3.<init>(r4, r9, r1)     // Catch:{ Throwable -> 0x00b2 }
        L_0x0521:
            int r1 = r3.c     // Catch:{ Throwable -> 0x00b2 }
            r3.f = r1     // Catch:{ Throwable -> 0x00b2 }
        L_0x0525:
            int r1 = r3.f     // Catch:{ Throwable -> 0x00b2 }
            int r4 = r3.c     // Catch:{ Throwable -> 0x00b2 }
            if (r1 != r4) goto L_0x053f
            int r1 = r3.d     // Catch:{ Throwable -> 0x00b2 }
            int[] r4 = r3.b     // Catch:{ Throwable -> 0x00b2 }
            int r4 = r4.length     // Catch:{ Throwable -> 0x00b2 }
            if (r1 >= r4) goto L_0x053f
            int[] r1 = r3.b     // Catch:{ Throwable -> 0x00b2 }
            int r4 = r3.d     // Catch:{ Throwable -> 0x00b2 }
            int r9 = r4 + 1
            r3.d = r9     // Catch:{ Throwable -> 0x00b2 }
            r1 = r1[r4]     // Catch:{ Throwable -> 0x00b2 }
            r3.f = r1     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x0525
        L_0x053f:
            int r1 = r3.d     // Catch:{ Throwable -> 0x00b2 }
            if (r1 <= 0) goto L_0x054d
            int[] r1 = r3.a     // Catch:{ Throwable -> 0x00b2 }
            int r4 = r3.d     // Catch:{ Throwable -> 0x00b2 }
            int r4 = r4 + -1
            r1 = r1[r4]     // Catch:{ Throwable -> 0x00b2 }
            r3.e = r1     // Catch:{ Throwable -> 0x00b2 }
        L_0x054d:
            int r1 = r3.f     // Catch:{ Throwable -> 0x00b2 }
            int r4 = r3.c     // Catch:{ Throwable -> 0x00b2 }
            if (r1 == r4) goto L_0x0573
            int r4 = r3.e     // Catch:{ Throwable -> 0x00b2 }
            cng r1 = r8.e     // Catch:{ Throwable -> 0x00b2 }
            java.lang.Object r1 = r1.a(r4)     // Catch:{ Throwable -> 0x00b2 }
            cmx r1 = (defpackage.cmx) r1     // Catch:{ Throwable -> 0x00b2 }
            if (r1 != 0) goto L_0x0569
            cng r1 = r8.f     // Catch:{ Throwable -> 0x00b2 }
            java.lang.Object r1 = r1.a(r4)     // Catch:{ Throwable -> 0x00b2 }
            cmx r1 = (defpackage.cmx) r1     // Catch:{ Throwable -> 0x00b2 }
            if (r1 == 0) goto L_0x0521
        L_0x0569:
            int r4 = r1.j     // Catch:{ Throwable -> 0x00b2 }
            r4 = r4 | 1
            r1.j = r4     // Catch:{ Throwable -> 0x00b2 }
            r2.add(r1)     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x0521
        L_0x0573:
            cne r1 = r8.c     // Catch:{ Throwable -> 0x00b2 }
            r1.a()     // Catch:{ Throwable -> 0x00b2 }
            cng r1 = r8.k     // Catch:{ Throwable -> 0x00b2 }
            r1.a()     // Catch:{ Throwable -> 0x00b2 }
            cnd r4 = new cnd     // Catch:{ Throwable -> 0x00b2 }
            cng r1 = r8.e     // Catch:{ Throwable -> 0x00b2 }
            cng r3 = r8.f     // Catch:{ Throwable -> 0x00b2 }
            java.util.Map r8 = r8.g     // Catch:{ Throwable -> 0x00b2 }
            r4.<init>(r1, r3, r2, r8)     // Catch:{ Throwable -> 0x00b2 }
            java.util.Map r1 = r4.d     // Catch:{ Throwable -> 0x00b2 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ Throwable -> 0x00b2 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ Throwable -> 0x00b2 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Throwable -> 0x00b2 }
            r3.<init>()     // Catch:{ Throwable -> 0x00b2 }
            if (r1 == 0) goto L_0x05d4
            java.util.Iterator r5 = r1.iterator()     // Catch:{ Throwable -> 0x00b2 }
        L_0x059b:
            boolean r1 = r5.hasNext()     // Catch:{ Throwable -> 0x00b2 }
            if (r1 == 0) goto L_0x05d4
            java.lang.Object r1 = r5.next()     // Catch:{ Throwable -> 0x00b2 }
            cmx r1 = (defpackage.cmx) r1     // Catch:{ Throwable -> 0x00b2 }
            java.lang.String r8 = "referent"
            defpackage.cky.a(r8)     // Catch:{ Throwable -> 0x00b2 }
            int r9 = r1.a(r7)     // Catch:{ Throwable -> 0x00b2 }
            r2 = 0
        L_0x05b1:
            if (r2 >= r9) goto L_0x05d2
            java.lang.String r10 = r1.b(r7, r2)     // Catch:{ Throwable -> 0x00b2 }
            boolean r10 = r8.equals(r10)     // Catch:{ Throwable -> 0x00b2 }
            if (r10 == 0) goto L_0x05cf
            int r1 = r1.a(r7, r2)     // Catch:{ Throwable -> 0x00b2 }
        L_0x05c1:
            cng r2 = r4.b     // Catch:{ Throwable -> 0x00b2 }
            java.lang.Object r1 = r2.a(r1)     // Catch:{ Throwable -> 0x00b2 }
            cmx r1 = (defpackage.cmx) r1     // Catch:{ Throwable -> 0x00b2 }
            if (r1 == 0) goto L_0x059b
            r3.add(r1)     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x059b
        L_0x05cf:
            int r2 = r2 + 1
            goto L_0x05b1
        L_0x05d2:
            r1 = 0
            goto L_0x05c1
        L_0x05d4:
            boolean r1 = r3.isEmpty()     // Catch:{ Throwable -> 0x00b2 }
            if (r1 != 0) goto L_0x06e4
            java.util.ArrayDeque r5 = new java.util.ArrayDeque     // Catch:{ Throwable -> 0x00b2 }
            r5.<init>()     // Catch:{ Throwable -> 0x00b2 }
            java.util.List r1 = r4.c     // Catch:{ Throwable -> 0x00b2 }
            java.util.Iterator r2 = r1.iterator()     // Catch:{ Throwable -> 0x00b2 }
        L_0x05e5:
            boolean r1 = r2.hasNext()     // Catch:{ Throwable -> 0x00b2 }
            if (r1 == 0) goto L_0x05fb
            java.lang.Object r1 = r2.next()     // Catch:{ Throwable -> 0x00b2 }
            cmx r1 = (defpackage.cmx) r1     // Catch:{ Throwable -> 0x00b2 }
            boolean r8 = defpackage.cky.a(r1)     // Catch:{ Throwable -> 0x00b2 }
            if (r8 != 0) goto L_0x05e5
            r5.addLast(r1)     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x05e5
        L_0x05fb:
            cng r8 = r4.b     // Catch:{ Throwable -> 0x00b2 }
            cng r9 = r4.a     // Catch:{ Throwable -> 0x00b2 }
        L_0x05ff:
            boolean r1 = r5.isEmpty()     // Catch:{ Throwable -> 0x00b2 }
            if (r1 != 0) goto L_0x0642
            java.lang.Object r1 = r5.removeFirst()     // Catch:{ Throwable -> 0x00b2 }
            r0 = r1
            cmx r0 = (defpackage.cmx) r0     // Catch:{ Throwable -> 0x00b2 }
            r2 = r0
            int r10 = r2.a(r7)     // Catch:{ Throwable -> 0x00b2 }
            r1 = 0
            r4 = r1
        L_0x0613:
            if (r4 >= r10) goto L_0x05ff
            int r11 = r2.a(r7, r4)     // Catch:{ Throwable -> 0x00b2 }
            java.lang.Object r1 = r8.a(r11)     // Catch:{ Throwable -> 0x00b2 }
            cmx r1 = (defpackage.cmx) r1     // Catch:{ Throwable -> 0x00b2 }
            if (r1 != 0) goto L_0x0627
            java.lang.Object r1 = r9.a(r11)     // Catch:{ Throwable -> 0x00b2 }
            cmx r1 = (defpackage.cmx) r1     // Catch:{ Throwable -> 0x00b2 }
        L_0x0627:
            if (r1 == 0) goto L_0x063e
            cmx r11 = r1.i     // Catch:{ Throwable -> 0x00b2 }
            if (r11 != 0) goto L_0x063e
            int r11 = r1.j     // Catch:{ Throwable -> 0x00b2 }
            r11 = r11 & 1
            if (r11 != 0) goto L_0x063e
            boolean r11 = defpackage.cky.a(r1)     // Catch:{ Throwable -> 0x00b2 }
            if (r11 != 0) goto L_0x063e
            r1.i = r2     // Catch:{ Throwable -> 0x00b2 }
            r5.addLast(r1)     // Catch:{ Throwable -> 0x00b2 }
        L_0x063e:
            int r1 = r4 + 1
            r4 = r1
            goto L_0x0613
        L_0x0642:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Throwable -> 0x00b2 }
            r4.<init>()     // Catch:{ Throwable -> 0x00b2 }
            r0 = r3
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ Throwable -> 0x00b2 }
            r1 = r0
            int r8 = r1.size()     // Catch:{ Throwable -> 0x00b2 }
            r2 = 0
            r3 = r2
        L_0x0651:
            if (r3 >= r8) goto L_0x06a7
            java.lang.Object r2 = r1.get(r3)     // Catch:{ Throwable -> 0x00b2 }
            int r3 = r3 + 1
            cmx r2 = (defpackage.cmx) r2     // Catch:{ Throwable -> 0x00b2 }
            cmx r5 = r2.i     // Catch:{ Throwable -> 0x00b2 }
            if (r5 == 0) goto L_0x0651
            boolean r5 = r2 instanceof defpackage.cmw     // Catch:{ Throwable -> 0x00b2 }
            if (r5 == 0) goto L_0x0651
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00b2 }
            r9.<init>()     // Catch:{ Throwable -> 0x00b2 }
            r5 = -1
            java.lang.String r5 = r2.c(r7, r5)     // Catch:{ Throwable -> 0x00b2 }
            r9.append(r5)     // Catch:{ Throwable -> 0x00b2 }
        L_0x0670:
            cmx r5 = r2.i     // Catch:{ Throwable -> 0x00b2 }
            if (r5 == 0) goto L_0x069f
            r5 = 10
            r9.append(r5)     // Catch:{ Throwable -> 0x00b2 }
            cmx r10 = r2.i     // Catch:{ Throwable -> 0x00b2 }
            int r5 = r2.h     // Catch:{ Throwable -> 0x00b2 }
            int r11 = r7.d(r5)     // Catch:{ Throwable -> 0x00b2 }
            int r12 = r10.a(r7)     // Catch:{ Throwable -> 0x00b2 }
            r5 = 0
        L_0x0686:
            if (r5 >= r12) goto L_0x069d
            int r13 = r10.a(r7, r5)     // Catch:{ Throwable -> 0x00b2 }
            if (r11 != r13) goto L_0x069a
        L_0x068e:
            cmx r10 = r2.i     // Catch:{ Throwable -> 0x00b2 }
            java.lang.String r5 = r10.c(r7, r5)     // Catch:{ Throwable -> 0x00b2 }
            r9.append(r5)     // Catch:{ Throwable -> 0x00b2 }
            cmx r2 = r2.i     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x0670
        L_0x069a:
            int r5 = r5 + 1
            goto L_0x0686
        L_0x069d:
            r5 = -1
            goto L_0x068e
        L_0x069f:
            java.lang.String r2 = r9.toString()     // Catch:{ Throwable -> 0x00b2 }
            r4.add(r2)     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x0651
        L_0x06a7:
            r3 = r4
        L_0x06a8:
            boolean r1 = r3.isEmpty()     // Catch:{ Throwable -> 0x00b2 }
            if (r1 != 0) goto L_0x073e
            r0 = r17
            cnm r4 = r0.e     // Catch:{ Throwable -> 0x00b2 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Throwable -> 0x00b2 }
            r5.<init>()     // Catch:{ Throwable -> 0x00b2 }
            java.util.Iterator r7 = r3.iterator()     // Catch:{ Throwable -> 0x00b2 }
        L_0x06bb:
            boolean r1 = r7.hasNext()     // Catch:{ Throwable -> 0x00b2 }
            if (r1 == 0) goto L_0x06f0
            java.lang.Object r1 = r7.next()     // Catch:{ Throwable -> 0x00b2 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x00b2 }
            eet r8 = new eet     // Catch:{ Throwable -> 0x00b2 }
            r8.<init>()     // Catch:{ Throwable -> 0x00b2 }
            r2 = 10
            int r2 = r1.indexOf(r2)     // Catch:{ Throwable -> 0x00b2 }
            if (r2 >= 0) goto L_0x06ea
            r2 = r1
        L_0x06d5:
            r8.a = r2     // Catch:{ Throwable -> 0x00b2 }
            r8.d = r1     // Catch:{ Throwable -> 0x00b2 }
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Throwable -> 0x00b2 }
            r8.c = r1     // Catch:{ Throwable -> 0x00b2 }
            r5.add(r8)     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x06bb
        L_0x06e4:
            java.util.List r1 = java.util.Collections.emptyList()     // Catch:{ Throwable -> 0x00b2 }
            r3 = r1
            goto L_0x06a8
        L_0x06ea:
            r9 = 0
            java.lang.String r2 = r1.substring(r9, r2)     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x06d5
        L_0x06f0:
            boolean r1 = r5.isEmpty()     // Catch:{ Throwable -> 0x00b2 }
            if (r1 != 0) goto L_0x071f
            efx r2 = new efx     // Catch:{ Throwable -> 0x00b2 }
            r2.<init>()     // Catch:{ Throwable -> 0x00b2 }
            eel r1 = new eel     // Catch:{ Throwable -> 0x00b2 }
            r1.<init>()     // Catch:{ Throwable -> 0x00b2 }
            r2.n = r1     // Catch:{ Throwable -> 0x00b2 }
            eel r7 = r2.n     // Catch:{ Throwable -> 0x00b2 }
            int r1 = r5.size()     // Catch:{ Throwable -> 0x00b2 }
            eet[] r1 = new defpackage.eet[r1]     // Catch:{ Throwable -> 0x00b2 }
            java.lang.Object[] r1 = r5.toArray(r1)     // Catch:{ Throwable -> 0x00b2 }
            eet[] r1 = (defpackage.eet[]) r1     // Catch:{ Throwable -> 0x00b2 }
            r7.a = r1     // Catch:{ Throwable -> 0x00b2 }
            chz r1 = r4.b     // Catch:{ Throwable -> 0x00b2 }
            boolean r1 = r1.b()     // Catch:{ Throwable -> 0x00b2 }
            if (r1 == 0) goto L_0x071f
            chz r1 = r4.b     // Catch:{ Throwable -> 0x00b2 }
            r1.a(r2)     // Catch:{ Throwable -> 0x00b2 }
        L_0x071f:
            boolean r1 = r3.isEmpty()     // Catch:{ Throwable -> 0x00b2 }
            if (r1 != 0) goto L_0x073e
            java.lang.String r1 = "MemoryLeakService"
            java.lang.String r2 = "Primes found %d leak(s): %s"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x00b2 }
            r5 = 0
            int r7 = r3.size()     // Catch:{ Throwable -> 0x00b2 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Throwable -> 0x00b2 }
            r4[r5] = r7     // Catch:{ Throwable -> 0x00b2 }
            r5 = 1
            r4[r5] = r3     // Catch:{ Throwable -> 0x00b2 }
            r3 = 2
            defpackage.cdm.a(r3, r1, r2, r4)     // Catch:{ Throwable -> 0x00b2 }
        L_0x073e:
            r0 = r17
            java.util.Deque r1 = r0.g     // Catch:{ Throwable -> 0x00b2 }
            java.util.Iterator r2 = r1.iterator()     // Catch:{ Throwable -> 0x00b2 }
        L_0x0746:
            boolean r1 = r2.hasNext()     // Catch:{ Throwable -> 0x00b2 }
            if (r1 == 0) goto L_0x0756
            java.lang.Object r1 = r2.next()     // Catch:{ Throwable -> 0x00b2 }
            cnl r1 = (defpackage.cnl) r1     // Catch:{ Throwable -> 0x00b2 }
            r1.a()     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x0746
        L_0x0756:
            r0 = r17
            cnl r1 = r0.d     // Catch:{ Throwable -> 0x00b2 }
            r1.a()     // Catch:{ Throwable -> 0x00b2 }
            r0 = r17
            java.io.File r1 = r0.b
            r2 = 0
            r0 = r17
            r0.b = r2
            r1.delete()
            goto L_0x002f
        L_0x076b:
            monitor-exit(r2)     // Catch:{ all -> 0x00d4 }
            r0 = r17
            java.io.File r1 = r0.b
            r2 = 0
            r0 = r17
            r0.b = r2
            r1.delete()
            goto L_0x002f
        L_0x077a:
            r2 = r3
            goto L_0x036b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cno.a():void");
    }
}
