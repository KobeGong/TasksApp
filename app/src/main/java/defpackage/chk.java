package defpackage;

/* renamed from: chk reason: default package */
/* compiled from: PG */
final class chk implements defpackage.cjh {
    private final defpackage.cht a;

    chk(defpackage.cht cht) {
        this.a = cht;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List a() {
        /*
            r13 = this;
            r12 = 24
            r9 = 1
            r8 = 0
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            cht r0 = r13.a
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x001a
            cht r0 = r13.a
            chn r0 = r0.d()
            r10.add(r0)
        L_0x001a:
            cht r0 = r13.a
            cjs r1 = r0.c
            ckx r1 = r1.f()
            boolean r1 = r1.b
            if (r1 == 0) goto L_0x010d
            cjs r0 = r0.c
            ckx r0 = r0.f()
            boolean r0 = r0.c
            r0 = r9
        L_0x002f:
            if (r0 == 0) goto L_0x005b
            cht r11 = r13.a
            coe r1 = r11.a()
            android.app.Application r2 = r11.a
            clt r3 = r11.b
            android.content.SharedPreferences r4 = r11.e
            cjs r0 = r11.c
            ckx r0 = r0.f()
            ckd r7 = r0.d
            ciy r0 = new ciy
            boolean r5 = r7.b
            int r6 = r7.c
            java.util.regex.Pattern[] r7 = r7.a()
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            cls r0 = r11.a(r0)
            ciy r0 = (defpackage.ciy) r0
            r10.add(r0)
        L_0x005b:
            cht r0 = r13.a
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r12) goto L_0x006f
            cki r1 = r0.d
            boolean r1 = r1.d
            if (r1 != 0) goto L_0x0110
            cjs r0 = r0.c
            cjr r0 = r0.j()
            boolean r0 = r0.b
        L_0x006f:
            r0 = r8
        L_0x0070:
            if (r0 == 0) goto L_0x007b
            cht r0 = r13.a
            che r0 = r0.l()
            r10.add(r0)
        L_0x007b:
            cht r0 = r13.a
            cki r0 = r0.d
            boolean r0 = r0.e
            if (r0 == 0) goto L_0x008c
            cht r0 = r13.a
            chx r0 = r0.b()
            r10.add(r0)
        L_0x008c:
            cht r0 = r13.a
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r12) goto L_0x009a
            cjs r0 = r0.c
            ckr r0 = r0.g()
            boolean r0 = r0.b
        L_0x009a:
            cht r0 = r13.a
            cjs r0 = r0.c
            cjx r0 = r0.l()
            boolean r0 = r0.b
            cht r0 = r13.a
            cjs r0 = r0.c
            cln r0 = r0.c()
            boolean r0 = r0.b
            if (r0 == 0) goto L_0x0113
            clf r0 = defpackage.clf.a
            long r0 = r0.c
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0113
            r0 = r9
        L_0x00bb:
            if (r0 == 0) goto L_0x00d7
            cht r0 = r13.a
            clh r1 = new clh
            android.app.Application r2 = r0.a
            cha r2 = defpackage.cha.a(r2)
            chv r3 = new chv
            r3.<init>(r0)
            chw r4 = new chw
            r4.<init>(r0)
            r1.<init>(r2, r3, r4)
            r0.a(r1)
        L_0x00d7:
            cht r0 = r13.a
            cjs r1 = r0.c
            cku r1 = r1.k()
            boolean r1 = r1.b
            cki r1 = r0.d
            boolean r1 = r1.a
            if (r1 != 0) goto L_0x00ed
            cki r0 = r0.d
            boolean r0 = r0.b
            if (r0 == 0) goto L_0x0115
        L_0x00ed:
            r0 = r9
        L_0x00ee:
            if (r0 == 0) goto L_0x0102
            cht r0 = r13.a
            chz r1 = r0.k()
            monitor-enter(r1)
            cnn r0 = r1.e     // Catch:{ all -> 0x0117 }
            r0.a()     // Catch:{ all -> 0x0117 }
            cha r0 = r1.d     // Catch:{ all -> 0x0117 }
            r0.a(r1)     // Catch:{ all -> 0x0117 }
            monitor-exit(r1)     // Catch:{ all -> 0x0117 }
        L_0x0102:
            cht r0 = r13.a
            cjs r0 = r0.c
            ckv r0 = r0.m()
            boolean r0 = r0.b
            return r10
        L_0x010d:
            r0 = r8
            goto L_0x002f
        L_0x0110:
            r0 = r9
            goto L_0x0070
        L_0x0113:
            r0 = r8
            goto L_0x00bb
        L_0x0115:
            r0 = r8
            goto L_0x00ee
        L_0x0117:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0117 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chk.a():java.util.List");
    }

    public final defpackage.clt b() {
        return this.a.b;
    }

    public final void c() {
        this.a.f.a();
    }

    public final boolean a(defpackage.cls cls) {
        return this.a.f.a(cls);
    }

    public final void a(java.lang.Runnable runnable) {
        ((java.lang.Runnable) defpackage.cky.a((java.lang.Object) runnable)).run();
    }

    public final void d() {
        if (this.a.c.b().b) {
            this.a.i().e();
        }
    }

    public final void a(defpackage.cir cir) {
        if (cir != null && this.a.g()) {
            defpackage.cit h = this.a.h();
            if (h.b()) {
                if (!(cir.c > 0 || cir.d > 0 || cir.e > 0 || cir.n == 2 || cir.n == 3)) {
                    defpackage.cdm.a(5, "NetworkMetricService", "skip logging NetworkEvent due to empty bandwidth/latency data", new java.lang.Object[0]);
                } else {
                    ((java.util.concurrent.ScheduledExecutorService) h.b.a()).submit(new defpackage.ciu(h, cir));
                }
            }
        }
    }

    public final void e() {
        if (this.a.c()) {
            defpackage.chn d = this.a.d();
            if (d.d.compareAndSet(false, true)) {
                java.lang.Thread.setDefaultUncaughtExceptionHandler(d.a(java.lang.Thread.getDefaultUncaughtExceptionHandler()));
            }
        }
    }

    public final java.lang.Thread.UncaughtExceptionHandler a(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        if (this.a.c()) {
            return this.a.d().a(uncaughtExceptionHandler);
        }
        return uncaughtExceptionHandler;
    }

    public final boolean f() {
        return this.a.g();
    }
}
