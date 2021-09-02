package defpackage;

/* renamed from: dxd reason: default package */
/* compiled from: PG */
public final class dxd implements defpackage.dtl, java.io.Closeable {
    public defpackage.dxe a;
    public int b;
    public volatile boolean c = false;
    private final defpackage.dzo d;
    private final defpackage.dzt e;
    private defpackage.doa f;
    private defpackage.dvk g;
    private byte[] h;
    private int i;
    private defpackage.dxh j = defpackage.dxh.HEADER;
    private int k = 5;
    private boolean l;
    private defpackage.dtd m;
    private defpackage.dtd n = new defpackage.dtd();
    private long o;
    private boolean p = false;
    private int q = -1;
    private int r;
    private boolean s = false;

    public dxd(defpackage.dxe dxe, defpackage.doa doa, int i2, defpackage.dzo dzo, defpackage.dzt dzt) {
        this.a = (defpackage.dxe) defpackage.cld.a((java.lang.Object) dxe, (java.lang.Object) "sink");
        this.f = (defpackage.doa) defpackage.cld.a((java.lang.Object) doa, (java.lang.Object) "decompressor");
        this.b = i2;
        this.d = (defpackage.dzo) defpackage.cld.a((java.lang.Object) dzo, (java.lang.Object) "statsTraceCtx");
        this.e = (defpackage.dzt) defpackage.cld.a((java.lang.Object) dzt, (java.lang.Object) "transportTracer");
    }

    public final void b(int i2) {
        this.b = i2;
    }

    public final void a(defpackage.doa doa) {
        defpackage.cld.b(this.g == null, (java.lang.Object) "Already set full stream decompressor");
        this.f = (defpackage.doa) defpackage.cld.a((java.lang.Object) doa, (java.lang.Object) "Can't pass an empty decompressor");
    }

    public final void a(defpackage.dvk dvk) {
        boolean z = true;
        defpackage.cld.b(this.f == defpackage.dno.a, (java.lang.Object) "per-message decompressor already set");
        if (this.g != null) {
            z = false;
        }
        defpackage.cld.b(z, (java.lang.Object) "full stream decompressor already set");
        this.g = (defpackage.dvk) defpackage.cld.a((java.lang.Object) dvk, (java.lang.Object) "Can't pass a null full stream decompressor");
        this.n = null;
    }

    public final void c(int i2) {
        defpackage.cld.a(i2 > 0, (java.lang.Object) "numMessages must be > 0");
        if (!b()) {
            this.o += (long) i2;
            d();
        }
    }

    public final void a(defpackage.dxv dxv) {
        boolean z;
        boolean z2 = true;
        boolean z3 = false;
        defpackage.cld.a((java.lang.Object) dxv, (java.lang.Object) "data");
        try {
            if (!(b() || this.s)) {
                if (this.g != null) {
                    defpackage.dvk dvk = this.g;
                    if (!dvk.i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    defpackage.cld.b(z, (java.lang.Object) "GzipInflatingBuffer is closed");
                    dvk.a.a(dxv);
                    dvk.n = false;
                } else {
                    this.n.a(dxv);
                }
                try {
                    d();
                } catch (Throwable th) {
                    th = th;
                    z2 = false;
                    if (z2) {
                        dxv.close();
                    }
                    throw th;
                }
            } else {
                z3 = true;
            }
            if (z3) {
                dxv.close();
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void a() {
        if (!b()) {
            if (c()) {
                close();
            } else {
                this.s = true;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void close() {
        boolean z;
        boolean z2;
        if (!b()) {
            boolean z3 = this.m != null && this.m.a > 0;
            try {
                if (this.g != null) {
                    if (!z3) {
                        defpackage.dvk dvk = this.g;
                        if (!dvk.i) {
                            z = true;
                        } else {
                            z = false;
                        }
                        defpackage.cld.b(z, (java.lang.Object) "GzipInflatingBuffer is closed");
                        if (dvk.c.b() == 0 && dvk.h == defpackage.dvm.HEADER) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (!z2) {
                            z3 = false;
                            this.g.close();
                        }
                    }
                    z3 = true;
                    this.g.close();
                }
                if (this.n != null) {
                    this.n.close();
                }
                if (this.m != null) {
                    this.m.close();
                }
                this.g = null;
                this.n = null;
                this.m = null;
                this.a.a(z3);
            } catch (Throwable th) {
                this.g = null;
                this.n = null;
                this.m = null;
                throw th;
            }
        }
    }

    public final boolean b() {
        return this.n == null && this.g == null;
    }

    private final boolean c() {
        boolean z = true;
        if (this.g != null) {
            defpackage.dvk dvk = this.g;
            if (dvk.i) {
                z = false;
            }
            defpackage.cld.b(z, (java.lang.Object) "GzipInflatingBuffer is closed");
            return dvk.n;
        } else if (this.n.a != 0) {
            return false;
        } else {
            return true;
        }
    }

    private final void d() {
        java.io.InputStream a2;
        if (!this.p) {
            this.p = true;
            while (!this.c && this.o > 0 && e()) {
                try {
                    switch (this.j.ordinal()) {
                        case 0:
                            int b2 = this.m.b();
                            if ((b2 & 254) == 0) {
                                this.l = (b2 & 1) != 0;
                                defpackage.dtd dtd = this.m;
                                dtd.b(4);
                                this.k = dtd.b() | (dtd.b() << 24) | (dtd.b() << 16) | (dtd.b() << 8);
                                if (this.k >= 0 && this.k <= this.b) {
                                    this.q++;
                                    for (defpackage.dqc c2 : this.d.a) {
                                        c2.c();
                                    }
                                    defpackage.dzt dzt = this.e;
                                    dzt.e.a();
                                    java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
                                    defpackage.dzv dzv = dzt.b;
                                    dzt.f = timeUnit.toNanos(java.lang.System.currentTimeMillis());
                                    this.j = defpackage.dxh.BODY;
                                    break;
                                } else {
                                    throw defpackage.dpw.g.a(java.lang.String.format("gRPC message exceeds maximum size %d: %d", new java.lang.Object[]{java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.k)})).b();
                                }
                            } else {
                                throw defpackage.dpw.h.a("gRPC frame header malformed: reserved bits not zero").b();
                            }
                        case 1:
                            defpackage.dzo dzo = this.d;
                            int i2 = this.q;
                            long j2 = (long) this.r;
                            for (defpackage.dqc a3 : dzo.a) {
                                a3.a(i2, j2);
                            }
                            this.r = 0;
                            if (this.l) {
                                a2 = f();
                            } else {
                                this.d.c((long) this.m.a);
                                a2 = defpackage.dxw.a((defpackage.dxv) this.m);
                            }
                            this.m = null;
                            this.a.a((defpackage.dzr) new defpackage.dxf(a2));
                            this.j = defpackage.dxh.HEADER;
                            this.k = 5;
                            this.o--;
                            break;
                        default:
                            java.lang.String valueOf = java.lang.String.valueOf(this.j);
                            throw new java.lang.AssertionError(new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 15).append("Invalid state: ").append(valueOf).toString());
                    }
                } finally {
                    this.p = false;
                }
            }
            if (this.c) {
                close();
                return;
            }
            if (this.s && c()) {
                close();
            }
            this.p = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:160:0x0342 A[SYNTHETIC, Splitter:B:160:0x0342] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0316 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean e() {
        /*
            r15 = this;
            r2 = 0
            r1 = 0
            dtd r0 = r15.m     // Catch:{ all -> 0x008e }
            if (r0 != 0) goto L_0x000d
            dtd r0 = new dtd     // Catch:{ all -> 0x008e }
            r0.<init>()     // Catch:{ all -> 0x008e }
            r15.m = r0     // Catch:{ all -> 0x008e }
        L_0x000d:
            int r0 = r15.k     // Catch:{ all -> 0x008e }
            dtd r3 = r15.m     // Catch:{ all -> 0x008e }
            int r3 = r3.a     // Catch:{ all -> 0x008e }
            int r0 = r0 - r3
            if (r0 <= 0) goto L_0x039e
            dvk r3 = r15.g     // Catch:{ all -> 0x008e }
            if (r3 == 0) goto L_0x0356
            byte[] r3 = r15.h     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            if (r3 == 0) goto L_0x0025
            int r3 = r15.i     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            byte[] r4 = r15.h     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r4 = r4.length     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            if (r3 != r4) goto L_0x0032
        L_0x0025:
            r3 = 2097152(0x200000, float:2.938736E-39)
            int r3 = java.lang.Math.min(r0, r3)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            byte[] r3 = new byte[r3]     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r15.h = r3     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r3 = 0
            r15.i = r3     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
        L_0x0032:
            byte[] r3 = r15.h     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r3 = r3.length     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r4 = r15.i     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r3 = r3 - r4
            int r6 = java.lang.Math.min(r0, r3)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            dvk r7 = r15.g     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            byte[] r8 = r15.h     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r9 = r15.i     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            boolean r0 = r7.i     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            if (r0 != 0) goto L_0x00ac
            r0 = 1
        L_0x0047:
            java.lang.String r3 = "GzipInflatingBuffer is closed"
            defpackage.cld.b(r0, r3)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r3 = 0
            r0 = 1
            r5 = r3
        L_0x004f:
            if (r0 == 0) goto L_0x02ef
            int r3 = r6 - r5
            if (r3 <= 0) goto L_0x02ef
            dvm r0 = r7.h     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r0 = r0.ordinal()     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            switch(r0) {
                case 0: goto L_0x00ae;
                case 1: goto L_0x0148;
                case 2: goto L_0x0171;
                case 3: goto L_0x01d7;
                case 4: goto L_0x01fc;
                case 5: goto L_0x0221;
                case 6: goto L_0x0256;
                case 7: goto L_0x0289;
                case 8: goto L_0x02a2;
                case 9: goto L_0x02e9;
                default: goto L_0x005e;
            }     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
        L_0x005e:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            dvm r3 = r7.h     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r4 = r4.length()     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r4 = r4 + 15
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r5.<init>(r4)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            java.lang.String r4 = "Invalid state: "
            java.lang.StringBuilder r4 = r5.append(r4)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            java.lang.StringBuilder r3 = r4.append(r3)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r0.<init>(r3)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            throw r0     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
        L_0x0087:
            r0 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch:{ all -> 0x008e }
            r3.<init>(r0)     // Catch:{ all -> 0x008e }
            throw r3     // Catch:{ all -> 0x008e }
        L_0x008e:
            r0 = move-exception
            if (r2 <= 0) goto L_0x00ab
            dxe r3 = r15.a
            r3.a(r2)
            dxh r3 = r15.j
            dxh r4 = defpackage.dxh.BODY
            if (r3 != r4) goto L_0x00ab
            dvk r3 = r15.g
            if (r3 == 0) goto L_0x03c9
            dzo r2 = r15.d
            long r4 = (long) r1
            r2.d(r4)
            int r2 = r15.r
            int r1 = r1 + r2
            r15.r = r1
        L_0x00ab:
            throw r0
        L_0x00ac:
            r0 = 0
            goto L_0x0047
        L_0x00ae:
            dvl r0 = r7.c     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r0 = r0.b()     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r3 = 10
            if (r0 >= r3) goto L_0x00ba
            r0 = 0
            goto L_0x004f
        L_0x00ba:
            dvl r0 = r7.c     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r0 = r0.c()     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r3 = 35615(0x8b1f, float:4.9907E-41)
            if (r0 == r3) goto L_0x00d4
            java.util.zip.ZipException r0 = new java.util.zip.ZipException     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            java.lang.String r3 = "Not in GZIP format"
            r0.<init>(r3)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            throw r0     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
        L_0x00cd:
            r0 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch:{ all -> 0x008e }
            r3.<init>(r0)     // Catch:{ all -> 0x008e }
            throw r3     // Catch:{ all -> 0x008e }
        L_0x00d4:
            dvl r0 = r7.c     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r0 = r0.a()     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r3 = 8
            if (r0 == r3) goto L_0x00e6
            java.util.zip.ZipException r0 = new java.util.zip.ZipException     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            java.lang.String r3 = "Unsupported compression method"
            r0.<init>(r3)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            throw r0     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
        L_0x00e6:
            dvl r0 = r7.c     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r0 = r0.a()     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r7.j = r0     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            dvl r4 = r7.c     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r0 = 6
            dvk r3 = r4.a     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r3 = r3.f     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            dvk r10 = r4.a     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r10 = r10.e     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r3 = r3 - r10
            if (r3 <= 0) goto L_0x03d9
            r0 = 6
            int r0 = java.lang.Math.min(r3, r0)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            dvk r3 = r4.a     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            java.util.zip.CRC32 r3 = r3.b     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            dvk r10 = r4.a     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            byte[] r10 = r10.d     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            dvk r11 = r4.a     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r11 = r11.e     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r3.update(r10, r11, r0)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            dvk r3 = r4.a     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            defpackage.dvk.a(r3, r0)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r0 = 6 - r0
            r3 = r0
        L_0x0118:
            if (r3 <= 0) goto L_0x013b
            r0 = 512(0x200, float:7.175E-43)
            byte[] r10 = new byte[r0]     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r0 = 0
        L_0x011f:
            if (r0 >= r3) goto L_0x013b
            int r11 = r3 - r0
            r12 = 512(0x200, float:7.175E-43)
            int r11 = java.lang.Math.min(r11, r12)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            dvk r12 = r4.a     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            dtd r12 = r12.a     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r13 = 0
            r12.a(r10, r13, r11)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            dvk r12 = r4.a     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            java.util.zip.CRC32 r12 = r12.b     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r13 = 0
            r12.update(r10, r13, r11)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r0 = r0 + r11
            goto L_0x011f
        L_0x013b:
            dvk r0 = r4.a     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r3 = 6
            defpackage.dvk.b(r0, r3)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            dvm r0 = defpackage.dvm.HEADER_EXTRA_LEN     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r7.h = r0     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r0 = 1
            goto L_0x004f
        L_0x0148:
            int r0 = r7.j     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r0 = r0 & 4
            r3 = 4
            if (r0 == r3) goto L_0x0156
            dvm r0 = defpackage.dvm.HEADER_NAME     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r7.h = r0     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r0 = 1
            goto L_0x004f
        L_0x0156:
            dvl r0 = r7.c     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r0 = r0.b()     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r3 = 2
            if (r0 >= r3) goto L_0x0162
            r0 = 0
            goto L_0x004f
        L_0x0162:
            dvl r0 = r7.c     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r0 = r0.c()     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r7.k = r0     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            dvm r0 = defpackage.dvm.HEADER_EXTRA     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r7.h = r0     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r0 = 1
            goto L_0x004f
        L_0x0171:
            dvl r0 = r7.c     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r0 = r0.b()     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r3 = r7.k     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            if (r0 >= r3) goto L_0x017e
            r0 = 0
            goto L_0x004f
        L_0x017e:
            dvl r10 = r7.c     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r4 = r7.k     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            dvk r0 = r10.a     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r0 = r0.f     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            dvk r3 = r10.a     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r3 = r3.e     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r0 = r0 - r3
            if (r0 <= 0) goto L_0x03d6
            int r0 = java.lang.Math.min(r0, r4)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            dvk r3 = r10.a     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            java.util.zip.CRC32 r3 = r3.b     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            dvk r11 = r10.a     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            byte[] r11 = r11.d     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            dvk r12 = r10.a     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r12 = r12.e     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r3.update(r11, r12, r0)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            dvk r3 = r10.a     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            defpackage.dvk.a(r3, r0)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r0 = r4 - r0
            r3 = r0
        L_0x01a8:
            if (r3 <= 0) goto L_0x01cb
            r0 = 512(0x200, float:7.175E-43)
            byte[] r11 = new byte[r0]     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r0 = 0
        L_0x01af:
            if (r0 >= r3) goto L_0x01cb
            int r12 = r3 - r0
            r13 = 512(0x200, float:7.175E-43)
            int r12 = java.lang.Math.min(r12, r13)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            dvk r13 = r10.a     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            dtd r13 = r13.a     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r14 = 0
            r13.a(r11, r14, r12)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            dvk r13 = r10.a     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            java.util.zip.CRC32 r13 = r13.b     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r14 = 0
            r13.update(r11, r14, r12)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r0 = r0 + r12
            goto L_0x01af
        L_0x01cb:
            dvk r0 = r10.a     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            defpackage.dvk.b(r0, r4)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            dvm r0 = defpackage.dvm.HEADER_NAME     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r7.h = r0     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r0 = 1
            goto L_0x004f
        L_0x01d7:
            int r0 = r7.j     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r0 = r0 & 8
            r3 = 8
            if (r0 != r3) goto L_0x01f5
            dvl r0 = r7.c     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
        L_0x01e1:
            int r3 = r0.b()     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            if (r3 <= 0) goto L_0x01f3
            int r3 = r0.a()     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            if (r3 != 0) goto L_0x01e1
            r0 = 1
        L_0x01ee:
            if (r0 != 0) goto L_0x01f5
            r0 = 0
            goto L_0x004f
        L_0x01f3:
            r0 = 0
            goto L_0x01ee
        L_0x01f5:
            dvm r0 = defpackage.dvm.HEADER_COMMENT     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r7.h = r0     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r0 = 1
            goto L_0x004f
        L_0x01fc:
            int r0 = r7.j     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r0 = r0 & 16
            r3 = 16
            if (r0 != r3) goto L_0x021a
            dvl r0 = r7.c     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
        L_0x0206:
            int r3 = r0.b()     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            if (r3 <= 0) goto L_0x0218
            int r3 = r0.a()     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            if (r3 != 0) goto L_0x0206
            r0 = 1
        L_0x0213:
            if (r0 != 0) goto L_0x021a
            r0 = 0
            goto L_0x004f
        L_0x0218:
            r0 = 0
            goto L_0x0213
        L_0x021a:
            dvm r0 = defpackage.dvm.HEADER_CRC     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r7.h = r0     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r0 = 1
            goto L_0x004f
        L_0x0221:
            int r0 = r7.j     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r0 = r0 & 2
            r3 = 2
            if (r0 != r3) goto L_0x024f
            dvl r0 = r7.c     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r0 = r0.b()     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r3 = 2
            if (r0 >= r3) goto L_0x0234
            r0 = 0
            goto L_0x004f
        L_0x0234:
            java.util.zip.CRC32 r0 = r7.b     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            long r10 = r0.getValue()     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r0 = (int) r10     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r3 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r3
            dvl r3 = r7.c     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r3 = r3.c()     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            if (r0 == r3) goto L_0x024f
            java.util.zip.ZipException r0 = new java.util.zip.ZipException     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            java.lang.String r3 = "Corrupt GZIP header"
            r0.<init>(r3)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            throw r0     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
        L_0x024f:
            dvm r0 = defpackage.dvm.INITIALIZE_INFLATER     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r7.h = r0     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r0 = 1
            goto L_0x004f
        L_0x0256:
            java.util.zip.Inflater r0 = r7.g     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            if (r0 != 0) goto L_0x027e
            java.util.zip.Inflater r0 = new java.util.zip.Inflater     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r3 = 1
            r0.<init>(r3)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r7.g = r0     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
        L_0x0262:
            java.util.zip.CRC32 r0 = r7.b     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r0.reset()     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r0 = r7.f     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r3 = r7.e     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r0 = r0 - r3
            if (r0 <= 0) goto L_0x0284
            java.util.zip.Inflater r3 = r7.g     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            byte[] r4 = r7.d     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r10 = r7.e     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r3.setInput(r4, r10, r0)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            dvm r0 = defpackage.dvm.INFLATING     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r7.h = r0     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
        L_0x027b:
            r0 = 1
            goto L_0x004f
        L_0x027e:
            java.util.zip.Inflater r0 = r7.g     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r0.reset()     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            goto L_0x0262
        L_0x0284:
            dvm r0 = defpackage.dvm.INFLATER_NEEDS_INPUT     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r7.h = r0     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            goto L_0x027b
        L_0x0289:
            int r0 = r9 + r5
            int r0 = r7.a(r8, r0, r3)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r3 = r5 + r0
            dvm r0 = r7.h     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            dvm r4 = defpackage.dvm.TRAILER     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            if (r0 != r4) goto L_0x029e
            boolean r0 = r7.a()     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r5 = r3
            goto L_0x004f
        L_0x029e:
            r0 = 1
            r5 = r3
            goto L_0x004f
        L_0x02a2:
            java.util.zip.Inflater r0 = r7.g     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            if (r0 == 0) goto L_0x02c7
            r0 = 1
        L_0x02a7:
            java.lang.String r3 = "inflater is null"
            defpackage.cld.b(r0, r3)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r0 = r7.e     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r3 = r7.f     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            if (r0 != r3) goto L_0x02c9
            r0 = 1
        L_0x02b3:
            java.lang.String r3 = "inflaterInput has unconsumed bytes"
            defpackage.cld.b(r0, r3)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            dtd r0 = r7.a     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r0 = r0.a     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r3 = 512(0x200, float:7.175E-43)
            int r0 = java.lang.Math.min(r0, r3)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            if (r0 != 0) goto L_0x02cb
            r0 = 0
            goto L_0x004f
        L_0x02c7:
            r0 = 0
            goto L_0x02a7
        L_0x02c9:
            r0 = 0
            goto L_0x02b3
        L_0x02cb:
            r3 = 0
            r7.e = r3     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r7.f = r0     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            dtd r3 = r7.a     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            byte[] r4 = r7.d     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r10 = r7.e     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r3.a(r4, r10, r0)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            java.util.zip.Inflater r3 = r7.g     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            byte[] r4 = r7.d     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r10 = r7.e     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r3.setInput(r4, r10, r0)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            dvm r0 = defpackage.dvm.INFLATING     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r7.h = r0     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r0 = 1
            goto L_0x004f
        L_0x02e9:
            boolean r0 = r7.a()     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            goto L_0x004f
        L_0x02ef:
            if (r0 == 0) goto L_0x0301
            dvm r0 = r7.h     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            dvm r3 = defpackage.dvm.HEADER     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            if (r0 != r3) goto L_0x0334
            dvl r0 = r7.c     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r0 = r0.b()     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r3 = 10
            if (r0 >= r3) goto L_0x0334
        L_0x0301:
            r0 = 1
        L_0x0302:
            r7.n = r0     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            dvk r0 = r15.g     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r3 = r0.l     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r4 = 0
            r0.l = r4     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r2 = r2 + r3
            dvk r0 = r15.g     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r3 = r0.m     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r4 = 0
            r0.m = r4     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r1 = r1 + r3
            if (r5 != 0) goto L_0x0342
            if (r2 <= 0) goto L_0x0332
            dxe r0 = r15.a
            r0.a(r2)
            dxh r0 = r15.j
            dxh r3 = defpackage.dxh.BODY
            if (r0 != r3) goto L_0x0332
            dvk r0 = r15.g
            if (r0 == 0) goto L_0x0336
            dzo r0 = r15.d
            long r2 = (long) r1
            r0.d(r2)
            int r0 = r15.r
            int r0 = r0 + r1
            r15.r = r0
        L_0x0332:
            r0 = 0
        L_0x0333:
            return r0
        L_0x0334:
            r0 = 0
            goto L_0x0302
        L_0x0336:
            dzo r0 = r15.d
            long r4 = (long) r2
            r0.d(r4)
            int r0 = r15.r
            int r0 = r0 + r2
            r15.r = r0
            goto L_0x0332
        L_0x0342:
            dtd r0 = r15.m     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            byte[] r3 = r15.h     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r4 = r15.i     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            dxv r3 = defpackage.dxw.a(r3, r4, r5)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            r0.a(r3)     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r0 = r15.i     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            int r0 = r0 + r5
            r15.i = r0     // Catch:{ IOException -> 0x0087, DataFormatException -> 0x00cd }
            goto L_0x000d
        L_0x0356:
            dtd r3 = r15.n     // Catch:{ all -> 0x008e }
            int r3 = r3.a     // Catch:{ all -> 0x008e }
            if (r3 != 0) goto L_0x0386
            if (r2 <= 0) goto L_0x0378
            dxe r0 = r15.a
            r0.a(r2)
            dxh r0 = r15.j
            dxh r3 = defpackage.dxh.BODY
            if (r0 != r3) goto L_0x0378
            dvk r0 = r15.g
            if (r0 == 0) goto L_0x037a
            dzo r0 = r15.d
            long r2 = (long) r1
            r0.d(r2)
            int r0 = r15.r
            int r0 = r0 + r1
            r15.r = r0
        L_0x0378:
            r0 = 0
            goto L_0x0333
        L_0x037a:
            dzo r0 = r15.d
            long r4 = (long) r2
            r0.d(r4)
            int r0 = r15.r
            int r0 = r0 + r2
            r15.r = r0
            goto L_0x0378
        L_0x0386:
            dtd r3 = r15.n     // Catch:{ all -> 0x008e }
            int r3 = r3.a     // Catch:{ all -> 0x008e }
            int r0 = java.lang.Math.min(r0, r3)     // Catch:{ all -> 0x008e }
            int r2 = r2 + r0
            dtd r3 = r15.m     // Catch:{ all -> 0x008e }
            dtd r4 = r15.n     // Catch:{ all -> 0x008e }
            dxv r0 = r4.a(r0)     // Catch:{ all -> 0x008e }
            dtd r0 = (defpackage.dtd) r0     // Catch:{ all -> 0x008e }
            r3.a(r0)     // Catch:{ all -> 0x008e }
            goto L_0x000d
        L_0x039e:
            if (r2 <= 0) goto L_0x03ba
            dxe r0 = r15.a
            r0.a(r2)
            dxh r0 = r15.j
            dxh r3 = defpackage.dxh.BODY
            if (r0 != r3) goto L_0x03ba
            dvk r0 = r15.g
            if (r0 == 0) goto L_0x03bd
            dzo r0 = r15.d
            long r2 = (long) r1
            r0.d(r2)
            int r0 = r15.r
            int r0 = r0 + r1
            r15.r = r0
        L_0x03ba:
            r0 = 1
            goto L_0x0333
        L_0x03bd:
            dzo r0 = r15.d
            long r4 = (long) r2
            r0.d(r4)
            int r0 = r15.r
            int r0 = r0 + r2
            r15.r = r0
            goto L_0x03ba
        L_0x03c9:
            dzo r1 = r15.d
            long r4 = (long) r2
            r1.d(r4)
            int r1 = r15.r
            int r1 = r1 + r2
            r15.r = r1
            goto L_0x00ab
        L_0x03d6:
            r3 = r4
            goto L_0x01a8
        L_0x03d9:
            r3 = r0
            goto L_0x0118
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxd.e():boolean");
    }

    private final java.io.InputStream f() {
        if (this.f == defpackage.dno.a) {
            throw defpackage.dpw.h.a("Can't decode compressed gRPC message as compression not configured").b();
        }
        try {
            return new defpackage.dxg(this.f.a(defpackage.dxw.a((defpackage.dxv) this.m)), this.b, this.d);
        } catch (java.io.IOException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }
}
