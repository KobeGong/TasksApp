package defpackage;

/* renamed from: dtt reason: default package */
/* compiled from: PG */
public class dtt implements defpackage.dta {
    private volatile boolean a;
    private defpackage.dzq b;
    public defpackage.dta c;
    private defpackage.dpw d;
    private java.util.List e = new java.util.ArrayList();
    private defpackage.dug f;

    public final void b(int i) {
        if (this.a) {
            this.c.b(i);
        } else {
            a((java.lang.Runnable) new defpackage.dtu(this, i));
        }
    }

    public final void a(int i) {
        if (this.a) {
            this.c.a(i);
        } else {
            a((java.lang.Runnable) new defpackage.dty(this, i));
        }
    }

    public final void a(defpackage.dta dta) {
        synchronized (this) {
            if (this.c == null) {
                this.c = (defpackage.dta) defpackage.cld.a((java.lang.Object) dta, (java.lang.Object) "stream");
                a();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r2.c.isEmpty() == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        r2.c = null;
        r2.b = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        r2 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        if (r2.hasNext() == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        ((java.lang.Runnable) r2.next()).run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r1 = r2.c;
        r2.c = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0054, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0055, code lost:
        r3 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005d, code lost:
        if (r3.hasNext() == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005f, code lost:
        ((java.lang.Runnable) r3.next()).run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006c, code lost:
        r1.clear();
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r0 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        monitor-enter(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a() {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0005:
            monitor-enter(r4)
            java.util.List r1 = r4.e     // Catch:{ all -> 0x0048 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x002f
            r0 = 0
            r4.e = r0     // Catch:{ all -> 0x0048 }
            r0 = 1
            r4.a = r0     // Catch:{ all -> 0x0048 }
            dug r2 = r4.f     // Catch:{ all -> 0x0048 }
            monitor-exit(r4)     // Catch:{ all -> 0x0048 }
            if (r2 == 0) goto L_0x002e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x001e:
            monitor-enter(r2)
            java.util.List r1 = r2.c     // Catch:{ all -> 0x0069 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0069 }
            if (r1 == 0) goto L_0x0050
            r0 = 0
            r2.c = r0     // Catch:{ all -> 0x0069 }
            r0 = 1
            r2.b = r0     // Catch:{ all -> 0x0069 }
            monitor-exit(r2)     // Catch:{ all -> 0x0069 }
        L_0x002e:
            return
        L_0x002f:
            java.util.List r1 = r4.e     // Catch:{ all -> 0x0048 }
            r4.e = r0     // Catch:{ all -> 0x0048 }
            monitor-exit(r4)     // Catch:{ all -> 0x0048 }
            java.util.Iterator r2 = r1.iterator()
        L_0x0038:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004b
            java.lang.Object r0 = r2.next()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            goto L_0x0038
        L_0x0048:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0048 }
            throw r0
        L_0x004b:
            r1.clear()
            r0 = r1
            goto L_0x0005
        L_0x0050:
            java.util.List r1 = r2.c     // Catch:{ all -> 0x0069 }
            r2.c = r0     // Catch:{ all -> 0x0069 }
            monitor-exit(r2)     // Catch:{ all -> 0x0069 }
            java.util.Iterator r3 = r1.iterator()
        L_0x0059:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x006c
            java.lang.Object r0 = r3.next()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            goto L_0x0059
        L_0x0069:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0069 }
            throw r0
        L_0x006c:
            r1.clear()
            r0 = r1
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtt.a():void");
    }

    private final void a(java.lang.Runnable runnable) {
        synchronized (this) {
            if (!this.a) {
                this.e.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    public final void a(java.lang.String str) {
        defpackage.cld.b(this.b == null, (java.lang.Object) "May only be called before start");
        defpackage.cld.a((java.lang.Object) str, (java.lang.Object) "authority");
        a((java.lang.Runnable) new defpackage.dtz(this, str));
    }

    public final void a(defpackage.dzq dzq) {
        defpackage.dpw dpw;
        boolean z;
        defpackage.cld.b(this.b == null, (java.lang.Object) "already started");
        synchronized (this) {
            this.b = (defpackage.dzq) defpackage.cld.a((java.lang.Object) dzq, (java.lang.Object) "listener");
            dpw = this.d;
            z = this.a;
            if (!z) {
                defpackage.dug dug = new defpackage.dug(dzq);
                this.f = dug;
                dzq = dug;
            }
        }
        if (dpw != null) {
            dzq.b(dpw, new defpackage.dor());
        } else if (z) {
            this.c.a(dzq);
        } else {
            a((java.lang.Runnable) new defpackage.dua(this, dzq));
        }
    }

    public final void a(java.io.InputStream inputStream) {
        defpackage.cld.a((java.lang.Object) inputStream, (java.lang.Object) "message");
        if (this.a) {
            this.c.a(inputStream);
        } else {
            a((java.lang.Runnable) new defpackage.dub(this, inputStream));
        }
    }

    public final void f() {
        if (this.a) {
            this.c.f();
        } else {
            a((java.lang.Runnable) new defpackage.duc(this));
        }
    }

    public void b(defpackage.dpw dpw) {
        defpackage.cld.a((java.lang.Object) dpw, (java.lang.Object) "reason");
        boolean z = true;
        defpackage.dzq dzq = null;
        synchronized (this) {
            if (this.c == null) {
                this.c = defpackage.dxm.a;
                z = false;
                dzq = this.b;
                this.d = dpw;
            }
        }
        if (z) {
            a((java.lang.Runnable) new defpackage.dud(this, dpw));
            return;
        }
        if (dzq != null) {
            dzq.b(dpw, new defpackage.dor());
        }
        a();
    }

    public final void e() {
        a((java.lang.Runnable) new defpackage.due(this));
    }

    public final void c(int i) {
        if (this.a) {
            this.c.c(i);
        } else {
            a((java.lang.Runnable) new defpackage.duf(this, i));
        }
    }

    public final void a(defpackage.doa doa) {
        defpackage.cld.a((java.lang.Object) doa, (java.lang.Object) "compressor");
        a((java.lang.Runnable) new defpackage.dtv(this, doa));
    }

    public final void a(boolean z) {
        a((java.lang.Runnable) new defpackage.dtw(this, z));
    }

    public final void a(defpackage.dob dob) {
        defpackage.cld.a((java.lang.Object) dob, (java.lang.Object) "decompressorRegistry");
        a((java.lang.Runnable) new defpackage.dtx(this, dob));
    }
}
