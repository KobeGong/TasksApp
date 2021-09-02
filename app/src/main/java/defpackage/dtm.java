package defpackage;

/* renamed from: dtm reason: default package */
/* compiled from: PG */
final class dtm implements defpackage.dxb {
    public final java.lang.Object a = new java.lang.Object();
    public final defpackage.dso b;
    public java.lang.Runnable c;
    public java.lang.Runnable d;
    public defpackage.dxc e;
    public java.util.Collection f = new java.util.LinkedHashSet();
    public defpackage.dpw g;
    private final defpackage.dwd h = defpackage.dwd.a(getClass().getName());
    private final java.util.concurrent.Executor i;
    private java.lang.Runnable j;
    private defpackage.doq k;
    private long l;

    dtm(java.util.concurrent.Executor executor, defpackage.dso dso) {
        this.i = executor;
        this.b = dso;
    }

    public final java.lang.Runnable a(defpackage.dxc dxc) {
        this.e = dxc;
        this.j = new defpackage.dtn(dxc);
        this.c = new defpackage.dto(dxc);
        this.d = new defpackage.dtp(dxc);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0069, code lost:
        r8.b.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x007a, code lost:
        r8.b.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.dta a(defpackage.dpb r9, defpackage.dor r10, defpackage.dna r11) {
        /*
            r8 = this;
            dxp r3 = new dxp     // Catch:{ all -> 0x0053 }
            r3.<init>(r9, r10, r11)     // Catch:{ all -> 0x0053 }
            java.lang.Object r4 = r8.a     // Catch:{ all -> 0x0053 }
            monitor-enter(r4)     // Catch:{ all -> 0x0053 }
            dpw r0 = r8.g     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x0042
            doq r0 = r8.k     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x001b
            dts r0 = r8.a(r3)     // Catch:{ all -> 0x0050 }
            monitor-exit(r4)     // Catch:{ all -> 0x0050 }
            dso r1 = r8.b
            r1.a()
        L_0x001a:
            return r0
        L_0x001b:
            doq r2 = r8.k     // Catch:{ all -> 0x0050 }
            long r0 = r8.l     // Catch:{ all -> 0x0050 }
            monitor-exit(r4)     // Catch:{ all -> 0x0050 }
        L_0x0020:
            don r2 = r2.a()     // Catch:{ all -> 0x0053 }
            boolean r4 = r11.i     // Catch:{ all -> 0x0053 }
            dtb r2 = defpackage.dvc.a(r2, r4)     // Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x005a
            dpb r0 = r3.c()     // Catch:{ all -> 0x0053 }
            dor r1 = r3.b()     // Catch:{ all -> 0x0053 }
            dna r3 = r3.a()     // Catch:{ all -> 0x0053 }
            dta r0 = r2.a(r0, r1, r3)     // Catch:{ all -> 0x0053 }
            dso r1 = r8.b
            r1.a()
            goto L_0x001a
        L_0x0042:
            duu r0 = new duu     // Catch:{ all -> 0x0050 }
            dpw r1 = r8.g     // Catch:{ all -> 0x0050 }
            r0.<init>(r1)     // Catch:{ all -> 0x0050 }
            monitor-exit(r4)     // Catch:{ all -> 0x0050 }
            dso r1 = r8.b
            r1.a()
            goto L_0x001a
        L_0x0050:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0050 }
            throw r0     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            dso r1 = r8.b
            r1.a()
            throw r0
        L_0x005a:
            java.lang.Object r4 = r8.a     // Catch:{ all -> 0x0053 }
            monitor-enter(r4)     // Catch:{ all -> 0x0053 }
            dpw r2 = r8.g     // Catch:{ all -> 0x0086 }
            if (r2 == 0) goto L_0x006f
            duu r0 = new duu     // Catch:{ all -> 0x0086 }
            dpw r1 = r8.g     // Catch:{ all -> 0x0086 }
            r0.<init>(r1)     // Catch:{ all -> 0x0086 }
            monitor-exit(r4)     // Catch:{ all -> 0x0086 }
            dso r1 = r8.b
            r1.a()
            goto L_0x001a
        L_0x006f:
            long r6 = r8.l     // Catch:{ all -> 0x0086 }
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0080
            dts r0 = r8.a(r3)     // Catch:{ all -> 0x0086 }
            monitor-exit(r4)     // Catch:{ all -> 0x0086 }
            dso r1 = r8.b
            r1.a()
            goto L_0x001a
        L_0x0080:
            doq r2 = r8.k     // Catch:{ all -> 0x0086 }
            long r0 = r8.l     // Catch:{ all -> 0x0086 }
            monitor-exit(r4)     // Catch:{ all -> 0x0086 }
            goto L_0x0020
        L_0x0086:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0086 }
            throw r0     // Catch:{ all -> 0x0053 }
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtm.a(dpb, dor, dna):dta");
    }

    private final defpackage.dts a(defpackage.doo doo) {
        defpackage.dts dts = new defpackage.dts(this, doo);
        this.f.add(dts);
        if (c() == 1) {
            this.b.a(this.j);
        }
        return dts;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r3.b.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.dpw r4) {
        /*
            r3 = this;
            java.lang.Object r1 = r3.a
            monitor-enter(r1)
            dpw r0 = r3.g     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
        L_0x0008:
            return
        L_0x0009:
            r3.g = r4     // Catch:{ all -> 0x0030 }
            dso r0 = r3.b     // Catch:{ all -> 0x0030 }
            dtq r2 = new dtq     // Catch:{ all -> 0x0030 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0030 }
            r0.a(r2)     // Catch:{ all -> 0x0030 }
            boolean r0 = r3.a()     // Catch:{ all -> 0x0030 }
            if (r0 != 0) goto L_0x0029
            java.lang.Runnable r0 = r3.d     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x0029
            dso r0 = r3.b     // Catch:{ all -> 0x0030 }
            java.lang.Runnable r2 = r3.d     // Catch:{ all -> 0x0030 }
            r0.a(r2)     // Catch:{ all -> 0x0030 }
            r0 = 0
            r3.d = r0     // Catch:{ all -> 0x0030 }
        L_0x0029:
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            dso r0 = r3.b
            r0.a()
            goto L_0x0008
        L_0x0030:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtm.a(dpw):void");
    }

    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            z = !this.f.isEmpty();
        }
        return z;
    }

    private final int c() {
        int size;
        synchronized (this.a) {
            size = this.f.size();
        }
        return size;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r4 = new java.util.ArrayList();
        r0 = r0;
        r5 = r0.size();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r2 >= r5) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        r3 = r2 + 1;
        r1 = (defpackage.dts) r0.get(r2);
        r2 = r10.a();
        r6 = r1.a.a();
        r7 = defpackage.dvc.a(r2, r6.i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        if (r7 == null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        r2 = r9.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        if (r6.c == null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        r2 = r6.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        r2.execute(new defpackage.dtr(r1, r7));
        r4.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005f, code lost:
        r1 = r9.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0066, code lost:
        if (a() != false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0068, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r9.f.removeAll(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0078, code lost:
        if (r9.f.isEmpty() == false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007a, code lost:
        r9.f = new java.util.LinkedHashSet();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0085, code lost:
        if (a() != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0087, code lost:
        r9.b.a(r9.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0090, code lost:
        if (r9.g == null) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0094, code lost:
        if (r9.d == null) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0096, code lost:
        r9.b.a(r9.d);
        r9.d = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a0, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a1, code lost:
        r9.b.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.doq r10) {
        /*
            r9 = this;
            java.lang.Object r1 = r9.a
            monitor-enter(r1)
            r9.k = r10     // Catch:{ all -> 0x005c }
            long r2 = r9.l     // Catch:{ all -> 0x005c }
            r4 = 1
            long r2 = r2 + r4
            r9.l = r2     // Catch:{ all -> 0x005c }
            if (r10 == 0) goto L_0x0014
            boolean r0 = r9.a()     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x0016
        L_0x0014:
            monitor-exit(r1)     // Catch:{ all -> 0x005c }
        L_0x0015:
            return
        L_0x0016:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x005c }
            java.util.Collection r2 = r9.f     // Catch:{ all -> 0x005c }
            r0.<init>(r2)     // Catch:{ all -> 0x005c }
            monitor-exit(r1)     // Catch:{ all -> 0x005c }
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r5 = r0.size()
            r1 = 0
            r2 = r1
        L_0x002b:
            if (r2 >= r5) goto L_0x005f
            java.lang.Object r1 = r0.get(r2)
            int r3 = r2 + 1
            dts r1 = (defpackage.dts) r1
            don r2 = r10.a()
            doo r6 = r1.a
            dna r6 = r6.a()
            boolean r7 = r6.i
            dtb r7 = defpackage.dvc.a(r2, r7)
            if (r7 == 0) goto L_0x005a
            java.util.concurrent.Executor r2 = r9.i
            java.util.concurrent.Executor r8 = r6.c
            if (r8 == 0) goto L_0x004f
            java.util.concurrent.Executor r2 = r6.c
        L_0x004f:
            dtr r6 = new dtr
            r6.<init>(r1, r7)
            r2.execute(r6)
            r4.add(r1)
        L_0x005a:
            r2 = r3
            goto L_0x002b
        L_0x005c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x005c }
            throw r0
        L_0x005f:
            java.lang.Object r1 = r9.a
            monitor-enter(r1)
            boolean r0 = r9.a()     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x006d
            monitor-exit(r1)     // Catch:{ all -> 0x006a }
            goto L_0x0015
        L_0x006a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x006a }
            throw r0
        L_0x006d:
            java.util.Collection r0 = r9.f     // Catch:{ all -> 0x006a }
            r0.removeAll(r4)     // Catch:{ all -> 0x006a }
            java.util.Collection r0 = r9.f     // Catch:{ all -> 0x006a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0081
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet     // Catch:{ all -> 0x006a }
            r0.<init>()     // Catch:{ all -> 0x006a }
            r9.f = r0     // Catch:{ all -> 0x006a }
        L_0x0081:
            boolean r0 = r9.a()     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x00a0
            dso r0 = r9.b     // Catch:{ all -> 0x006a }
            java.lang.Runnable r2 = r9.c     // Catch:{ all -> 0x006a }
            r0.a(r2)     // Catch:{ all -> 0x006a }
            dpw r0 = r9.g     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x00a0
            java.lang.Runnable r0 = r9.d     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x00a0
            dso r0 = r9.b     // Catch:{ all -> 0x006a }
            java.lang.Runnable r2 = r9.d     // Catch:{ all -> 0x006a }
            r0.a(r2)     // Catch:{ all -> 0x006a }
            r0 = 0
            r9.d = r0     // Catch:{ all -> 0x006a }
        L_0x00a0:
            monitor-exit(r1)     // Catch:{ all -> 0x006a }
            dso r0 = r9.b
            r0.a()
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtm.a(doq):void");
    }

    public final defpackage.dwd b() {
        return this.h;
    }
}
