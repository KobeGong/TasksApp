package defpackage;

/* renamed from: dqr reason: default package */
/* compiled from: PG */
public abstract class dqr extends defpackage.dqy implements defpackage.dta, defpackage.dxl {
    public static final java.util.logging.Logger o = java.util.logging.Logger.getLogger(defpackage.dqr.class.getName());
    private final defpackage.dva a;
    private boolean b;
    private volatile boolean c;

    public dqr(defpackage.dzy dzy, defpackage.dzo dzo, defpackage.dzt dzt, defpackage.dor dor, boolean z) {
        defpackage.cld.a((java.lang.Object) dor, (java.lang.Object) "headers");
        defpackage.cld.a((java.lang.Object) dzt, (java.lang.Object) "transportTracer");
        this.b = z;
        if (!z) {
            this.a = new defpackage.dxi(this, dzy, dzo);
        } else {
            this.a = new defpackage.dqs(this, dor, dzo);
        }
    }

    public abstract defpackage.dqt a();

    /* renamed from: b */
    public abstract defpackage.dri c();

    public final void a(int i) {
        this.a.a(i);
    }

    public final void b(int i) {
        c().i.b(i);
    }

    public final void a(boolean z) {
        c().n = z;
    }

    public final void a(defpackage.dob dob) {
        defpackage.dri c2 = c();
        defpackage.cld.b(c2.m == null, (java.lang.Object) "Already called start");
        c2.o = (defpackage.dob) defpackage.cld.a((java.lang.Object) dob, (java.lang.Object) "decompressorRegistry");
    }

    public final void a(defpackage.dzq dzq) {
        defpackage.dri c2 = c();
        defpackage.cld.b(c2.m == null, (java.lang.Object) "Already called setListener");
        c2.m = (defpackage.dzq) defpackage.cld.a((java.lang.Object) dzq, (java.lang.Object) "listener");
        if (!this.b) {
            a().a(null);
        }
    }

    /* access modifiers changed from: protected */
    public final defpackage.dva d() {
        return this.a;
    }

    public final void c(int i) {
        defpackage.dqt a2 = a();
        synchronized (a2.a.m.a) {
            defpackage.dqn dqn = a2.a.m;
            try {
                dqn.i.c(i);
            } catch (Throwable th) {
                dqn.a(th);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.dzx r8, boolean r9, boolean r10) {
        /*
            r7 = this;
            if (r8 != 0) goto L_0x0004
            if (r9 == 0) goto L_0x001f
        L_0x0004:
            r0 = 1
        L_0x0005:
            java.lang.String r1 = "null frame before EOS"
            defpackage.cld.a(r0, r1)
            dqt r1 = r7.a()
            dqk r0 = r1.a
            dqn r0 = r0.m
            java.lang.Object r2 = r0.a
            monitor-enter(r2)
            dqk r0 = r1.a     // Catch:{ all -> 0x0055 }
            dqn r0 = r0.m     // Catch:{ all -> 0x0055 }
            boolean r0 = r0.d     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0021
            monitor-exit(r2)     // Catch:{ all -> 0x0055 }
        L_0x001e:
            return
        L_0x001f:
            r0 = 0
            goto L_0x0005
        L_0x0021:
            if (r8 == 0) goto L_0x0058
            dzx r8 = (defpackage.dzx) r8     // Catch:{ all -> 0x0055 }
            java.nio.ByteBuffer r0 = r8.a     // Catch:{ all -> 0x0055 }
            r0.flip()     // Catch:{ all -> 0x0055 }
        L_0x002a:
            dqk r3 = r1.a     // Catch:{ all -> 0x0055 }
            int r4 = r0.remaining()     // Catch:{ all -> 0x0055 }
            dri r3 = r3.c()     // Catch:{ all -> 0x0055 }
            java.lang.Object r5 = r3.j     // Catch:{ all -> 0x0055 }
            monitor-enter(r5)     // Catch:{ all -> 0x0055 }
            int r6 = r3.k     // Catch:{ all -> 0x005b }
            int r4 = r4 + r6
            r3.k = r4     // Catch:{ all -> 0x005b }
            monitor-exit(r5)     // Catch:{ all -> 0x005b }
            dqk r3 = r1.a     // Catch:{ all -> 0x0055 }
            dqn r3 = r3.m     // Catch:{ all -> 0x0055 }
            boolean r3 = r3.c     // Catch:{ all -> 0x0055 }
            if (r3 != 0) goto L_0x005e
            dqk r1 = r1.a     // Catch:{ all -> 0x0055 }
            dqn r1 = r1.m     // Catch:{ all -> 0x0055 }
            dqm r3 = new dqm     // Catch:{ all -> 0x0055 }
            r3.<init>(r0, r9, r10)     // Catch:{ all -> 0x0055 }
            java.util.Queue r0 = r1.b     // Catch:{ all -> 0x0055 }
            r0.add(r3)     // Catch:{ all -> 0x0055 }
        L_0x0053:
            monitor-exit(r2)     // Catch:{ all -> 0x0055 }
            goto L_0x001e
        L_0x0055:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0055 }
            throw r0
        L_0x0058:
            java.nio.ByteBuffer r0 = defpackage.dqk.a     // Catch:{ all -> 0x0055 }
            goto L_0x002a
        L_0x005b:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x005b }
            throw r0     // Catch:{ all -> 0x0055 }
        L_0x005e:
            dqk r1 = r1.a     // Catch:{ all -> 0x0055 }
            ehp r3 = r1.i     // Catch:{ all -> 0x0055 }
            r3.a(r0, r9)     // Catch:{ all -> 0x0055 }
            if (r10 == 0) goto L_0x0053
            ehp r0 = r1.i     // Catch:{ all -> 0x0055 }
            r0.b()     // Catch:{ all -> 0x0055 }
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqr.a(dzx, boolean, boolean):void");
    }

    public final void e() {
        if (!c().p) {
            c().p = true;
            d().c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(defpackage.dpw r6) {
        /*
            r5 = this;
            r1 = 1
            boolean r0 = r6.a()
            if (r0 != 0) goto L_0x0024
            r0 = r1
        L_0x0008:
            java.lang.String r2 = "Should not cancel with OK status"
            defpackage.cld.a(r0, r2)
            r5.c = r1
            dqt r1 = r5.a()
            dqk r0 = r1.a
            dqn r0 = r0.m
            java.lang.Object r2 = r0.a
            monitor-enter(r2)
            dqk r0 = r1.a     // Catch:{ all -> 0x004f }
            dqn r0 = r0.m     // Catch:{ all -> 0x004f }
            boolean r0 = r0.d     // Catch:{ all -> 0x004f }
            if (r0 == 0) goto L_0x0026
            monitor-exit(r2)     // Catch:{ all -> 0x004f }
        L_0x0023:
            return
        L_0x0024:
            r0 = 0
            goto L_0x0008
        L_0x0026:
            dqk r0 = r1.a     // Catch:{ all -> 0x004f }
            dqn r0 = r0.m     // Catch:{ all -> 0x004f }
            r3 = 1
            r0.d = r3     // Catch:{ all -> 0x004f }
            dqk r0 = r1.a     // Catch:{ all -> 0x004f }
            dqn r0 = r0.m     // Catch:{ all -> 0x004f }
            r0.f = r6     // Catch:{ all -> 0x004f }
            dqk r0 = r1.a     // Catch:{ all -> 0x004f }
            dqn r3 = r0.m     // Catch:{ all -> 0x004f }
            java.util.Queue r0 = r3.b     // Catch:{ all -> 0x004f }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x004f }
        L_0x003d:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x004f }
            if (r0 == 0) goto L_0x0052
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x004f }
            dqm r0 = (defpackage.dqm) r0     // Catch:{ all -> 0x004f }
            java.nio.ByteBuffer r0 = r0.a     // Catch:{ all -> 0x004f }
            r0.clear()     // Catch:{ all -> 0x004f }
            goto L_0x003d
        L_0x004f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004f }
            throw r0
        L_0x0052:
            java.util.Queue r0 = r3.b     // Catch:{ all -> 0x004f }
            r0.clear()     // Catch:{ all -> 0x004f }
            dqk r0 = r1.a     // Catch:{ all -> 0x004f }
            ehp r0 = r0.i     // Catch:{ all -> 0x004f }
            if (r0 == 0) goto L_0x0066
            dqk r0 = r1.a     // Catch:{ all -> 0x004f }
            ehp r0 = r0.i     // Catch:{ all -> 0x004f }
            r0.c()     // Catch:{ all -> 0x004f }
        L_0x0064:
            monitor-exit(r2)     // Catch:{ all -> 0x004f }
            goto L_0x0023
        L_0x0066:
            dqk r0 = r1.a     // Catch:{ all -> 0x004f }
            dqo r0 = r0.f     // Catch:{ all -> 0x004f }
            dqk r1 = r1.a     // Catch:{ all -> 0x004f }
            r0.a(r1, r6)     // Catch:{ all -> 0x004f }
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqr.b(dpw):void");
    }
}
