package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

/* renamed from: dxd  reason: default package */
/* compiled from: PG */
public final class dxd implements dtl, Closeable {
    public dxe a;
    public int b;
    public volatile boolean c = false;
    private final dzo d;
    private final dzt e;
    private doa f;
    private dvk g;
    private byte[] h;
    private int i;
    private dxh j = dxh.HEADER;
    private int k = 5;
    private boolean l;
    private dtd m;
    private dtd n = new dtd();
    private long o;
    private boolean p = false;
    private int q = -1;
    private int r;
    private boolean s = false;

    public dxd(dxe dxe, doa doa, int i2, dzo dzo, dzt dzt) {
        this.a = (dxe) cld.a(dxe, "sink");
        this.f = (doa) cld.a(doa, "decompressor");
        this.b = i2;
        this.d = (dzo) cld.a(dzo, "statsTraceCtx");
        this.e = (dzt) cld.a(dzt, "transportTracer");
    }

    @Override // defpackage.dtl
    public final void b(int i2) {
        this.b = i2;
    }

    @Override // defpackage.dtl
    public final void a(doa doa) {
        cld.b(this.g == null, "Already set full stream decompressor");
        this.f = (doa) cld.a(doa, "Can't pass an empty decompressor");
    }

    @Override // defpackage.dtl
    public final void a(dvk dvk) {
        boolean z = true;
        cld.b(this.f == dno.a, "per-message decompressor already set");
        if (this.g != null) {
            z = false;
        }
        cld.b(z, "full stream decompressor already set");
        this.g = (dvk) cld.a(dvk, "Can't pass a null full stream decompressor");
        this.n = null;
    }

    @Override // defpackage.dtl
    public final void c(int i2) {
        cld.a(i2 > 0, "numMessages must be > 0");
        if (!b()) {
            this.o += (long) i2;
            d();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0042  */
    @Override // defpackage.dtl
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.dxv r6) {
        /*
            r5 = this;
            r1 = 1
            r2 = 0
            java.lang.String r0 = "data"
            defpackage.cld.a(r6, r0)
            boolean r0 = r5.b()     // Catch:{ all -> 0x003f }
            if (r0 != 0) goto L_0x0011
            boolean r0 = r5.s     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0035
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 != 0) goto L_0x0049
            dvk r0 = r5.g     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0039
            dvk r3 = r5.g     // Catch:{ all -> 0x003f }
            boolean r0 = r3.i     // Catch:{ all -> 0x003f }
            if (r0 != 0) goto L_0x0037
            r0 = r1
        L_0x001f:
            java.lang.String r4 = "GzipInflatingBuffer is closed"
            defpackage.cld.b(r0, r4)     // Catch:{ all -> 0x003f }
            dtd r0 = r3.a     // Catch:{ all -> 0x003f }
            r0.a(r6)     // Catch:{ all -> 0x003f }
            r0 = 0
            r3.n = r0     // Catch:{ all -> 0x003f }
        L_0x002c:
            r5.d()     // Catch:{ all -> 0x0046 }
        L_0x002f:
            if (r2 == 0) goto L_0x0034
            r6.close()
        L_0x0034:
            return
        L_0x0035:
            r0 = r2
            goto L_0x0012
        L_0x0037:
            r0 = r2
            goto L_0x001f
        L_0x0039:
            dtd r0 = r5.n
            r0.a(r6)
            goto L_0x002c
        L_0x003f:
            r0 = move-exception
        L_0x0040:
            if (r1 == 0) goto L_0x0045
            r6.close()
        L_0x0045:
            throw r0
        L_0x0046:
            r0 = move-exception
            r1 = r2
            goto L_0x0040
        L_0x0049:
            r2 = r1
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxd.a(dxv):void");
    }

    @Override // defpackage.dtl
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
    @Override // java.io.Closeable, defpackage.dtl, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        boolean z2;
        if (!b()) {
            boolean z3 = this.m != null && this.m.a > 0;
            try {
                if (this.g != null) {
                    if (!z3) {
                        dvk dvk = this.g;
                        if (!dvk.i) {
                            z = true;
                        } else {
                            z = false;
                        }
                        cld.b(z, "GzipInflatingBuffer is closed");
                        if (dvk.c.b() == 0 && dvk.h == dvm.HEADER) {
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
        if (this.g == null) {
            return this.n.a == 0;
        }
        dvk dvk = this.g;
        if (dvk.i) {
            z = false;
        }
        cld.b(z, "GzipInflatingBuffer is closed");
        return dvk.n;
    }

    private final void d() {
        InputStream a2;
        if (!this.p) {
            this.p = true;
            while (!this.c && this.o > 0 && e()) {
                try {
                    switch (this.j.ordinal()) {
                        case 0:
                            int b2 = this.m.b();
                            if ((b2 & 254) == 0) {
                                this.l = (b2 & 1) != 0;
                                dtd dtd = this.m;
                                dtd.b(4);
                                this.k = dtd.b() | (dtd.b() << 24) | (dtd.b() << 16) | (dtd.b() << 8);
                                if (this.k >= 0 && this.k <= this.b) {
                                    this.q++;
                                    for (dqc dqc : this.d.a) {
                                        dqc.c();
                                    }
                                    dzt dzt = this.e;
                                    dzt.e.a();
                                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                    dzv dzv = dzt.b;
                                    dzt.f = timeUnit.toNanos(System.currentTimeMillis());
                                    this.j = dxh.BODY;
                                    break;
                                } else {
                                    throw dpw.g.a(String.format("gRPC message exceeds maximum size %d: %d", Integer.valueOf(this.b), Integer.valueOf(this.k))).b();
                                }
                            } else {
                                throw dpw.h.a("gRPC frame header malformed: reserved bits not zero").b();
                            }
                        case 1:
                            dzo dzo = this.d;
                            int i2 = this.q;
                            long j2 = (long) this.r;
                            dqc[] dqcArr = dzo.a;
                            for (dqc dqc2 : dqcArr) {
                                dqc2.a(i2, j2);
                            }
                            this.r = 0;
                            if (this.l) {
                                a2 = f();
                            } else {
                                this.d.c((long) this.m.a);
                                a2 = dxw.a(this.m);
                            }
                            this.m = null;
                            this.a.a(new dxf(a2));
                            this.j = dxh.HEADER;
                            this.k = 5;
                            this.o--;
                            break;
                        default:
                            String valueOf = String.valueOf(this.j);
                            throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 15).append("Invalid state: ").append(valueOf).toString());
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

    /* JADX WARNING: Removed duplicated region for block: B:155:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0316 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean e() {
        /*
        // Method dump skipped, instructions count: 1012
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxd.e():boolean");
    }

    private final InputStream f() {
        if (this.f == dno.a) {
            throw dpw.h.a("Can't decode compressed gRPC message as compression not configured").b();
        }
        try {
            return new dxg(this.f.a(dxw.a(this.m)), this.b, this.d);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }
}
