package defpackage;

/* renamed from: chn reason: default package */
/* compiled from: PG */
final class chn extends defpackage.cgj implements defpackage.cle {
    public final java.util.concurrent.atomic.AtomicBoolean d = new java.util.concurrent.atomic.AtomicBoolean();
    public volatile defpackage.civ e;
    public final defpackage.chm f;
    public final defpackage.cog g;
    public final boolean h;
    public final java.util.concurrent.atomic.AtomicBoolean i;
    public volatile defpackage.edw j;
    public final boolean k;
    private final boolean l;
    private final int m;
    private final defpackage.cha n;
    private volatile defpackage.chq o;

    chn(defpackage.coe coe, defpackage.chm chm, defpackage.cog cog, boolean z, defpackage.clt clt, android.app.Application application, float f2, boolean z2, boolean z3) {
        boolean z4 = false;
        super(coe, application, clt, defpackage.bg.Z);
        defpackage.cky.a((java.lang.Object) cog);
        defpackage.cky.a(f2 > 0.0f && f2 <= 100.0f, (java.lang.Object) "StartupSamplePercentage should be a floating number > 0 and <= 100.");
        this.n = defpackage.cha.a(application);
        defpackage.coa coa = new defpackage.coa(f2 / 100.0f);
        if (coa.a == 1.0f || coa.b.nextFloat() <= coa.a) {
            z4 = true;
        }
        this.l = z4;
        this.m = (int) (100.0f / f2);
        this.f = chm;
        this.g = cog;
        this.h = z;
        this.i = new java.util.concurrent.atomic.AtomicBoolean(z2);
        this.k = z3;
    }

    /* access modifiers changed from: 0000 */
    public final java.lang.Thread.UncaughtExceptionHandler a(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        return new defpackage.chr(this, uncaughtExceptionHandler);
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.edw a(java.lang.String str, java.lang.Throwable th) {
        int i2 = 1;
        defpackage.edw edw = new defpackage.edw();
        edw.c = defpackage.civ.a(this.e);
        edw.a = java.lang.Boolean.valueOf(true);
        edw.d = str;
        java.lang.Class<java.lang.OutOfMemoryError> cls = th.getClass();
        int i3 = cls == java.lang.OutOfMemoryError.class ? 2 : java.lang.NullPointerException.class.isAssignableFrom(cls) ? 1 : java.lang.RuntimeException.class.isAssignableFrom(cls) ? 3 : java.lang.Error.class.isAssignableFrom(cls) ? 4 : 0;
        edw.e = i3;
        edw.g = th.getClass().getName();
        try {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            defpackage.cza.a(th, new java.io.PrintWriter(stringWriter));
            java.lang.String stringWriter2 = stringWriter.toString();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("([^:^\n]+).*((?:\n\\s*at [^:~\n]*:?~?[0-9]*[^\n]*)+)(?:(\nCaused by: )([^:^\n]+).*((?:\n\\s*at [^:~\n]*:?~?[0-9]*[^\n]*)+))?(?:(\nCaused by: )([^:^\n]+).*((?:\n\\s*at [^:~\n]*:?~?[0-9]*[^\n]*)+))?").matcher(stringWriter2);
            if (matcher.find()) {
                while (i2 <= matcher.groupCount() && matcher.group(i2) != null) {
                    sb.append(matcher.group(i2));
                    i2++;
                }
            }
            edw.f = defpackage.chs.a(sb.toString());
        } catch (java.lang.Exception e2) {
            java.lang.String valueOf = java.lang.String.valueOf(e2);
            defpackage.cdm.a(5, "CrashMetricService", new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 38).append("Failed to generate hashed stack trace.").append(valueOf).toString(), new java.lang.Object[0]);
        }
        try {
            edw.b = new defpackage.efl();
            edw.b.a = defpackage.cky.a((java.lang.String) null, (android.content.Context) this.a);
        } catch (java.lang.Exception e3) {
            defpackage.cdm.b("CrashMetricService", "Failed to get process stats.", e3, new java.lang.Object[0]);
        }
        return edw;
    }

    private final defpackage.edw g() {
        defpackage.cky.c();
        java.io.File file = new java.io.File(this.a.getFilesDir(), "primes_crash");
        try {
            if (file.exists()) {
                defpackage.cdm.a(3, "CrashMetricService", "found persisted crash", new java.lang.Object[0]);
                defpackage.edw edw = new defpackage.edw();
                if (a(file, edw)) {
                    return edw;
                }
                defpackage.cdm.a(5, "CrashMetricService", "could not delete crash file", new java.lang.Object[0]);
            }
        } catch (java.io.IOException e2) {
            defpackage.cdm.a("CrashMetricService", "IO failure", (java.lang.Throwable) e2, new java.lang.Object[0]);
        } catch (java.lang.SecurityException e3) {
            defpackage.cdm.a("CrashMetricService", "Unexpected SecurityException", (java.lang.Throwable) e3, new java.lang.Object[0]);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(java.io.File r8, defpackage.edw r9) {
        /*
            r0 = 0
            r2 = 0
            long r4 = r8.length()     // Catch:{ all -> 0x003c }
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x0033
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x0033
            int r3 = (int) r4     // Catch:{ all -> 0x003c }
            byte[] r4 = new byte[r3]     // Catch:{ all -> 0x003c }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x003c }
            r1.<init>(r8)     // Catch:{ all -> 0x003c }
        L_0x001b:
            if (r0 >= r3) goto L_0x0025
            int r2 = r3 - r0
            int r2 = r1.read(r4, r0, r2)     // Catch:{ all -> 0x0044 }
            int r0 = r0 + r2
            goto L_0x001b
        L_0x0025:
            r0 = 0
            defpackage.dmf.a(r9, r4, r0, r3)     // Catch:{ all -> 0x0044 }
        L_0x0029:
            boolean r0 = r8.delete()     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x0032
            r1.close()
        L_0x0032:
            return r0
        L_0x0033:
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x003c }
            r9.a = r0     // Catch:{ all -> 0x003c }
            r1 = r2
            goto L_0x0029
        L_0x003c:
            r0 = move-exception
            r1 = r2
        L_0x003e:
            if (r1 == 0) goto L_0x0043
            r1.close()
        L_0x0043:
            throw r0
        L_0x0044:
            r0 = move-exception
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chn.a(java.io.File, edw):boolean");
    }

    public final void e() {
        defpackage.cdm.a(3, "CrashMetricService", "onPrimesInitialize", new java.lang.Object[0]);
        defpackage.edw edw = null;
        if (this.k) {
            defpackage.cdm.a(3, "CrashMetricService", "persistent crash enabled.", new java.lang.Object[0]);
            try {
                edw = g();
            } catch (java.lang.RuntimeException e2) {
                defpackage.cdm.b("CrashMetricService", "Unexpected failure: ", e2, new java.lang.Object[0]);
            }
        }
        if (this.i.get()) {
            this.j = edw;
        } else if (!b() || (edw == null && !this.l)) {
            defpackage.cdm.a(4, "CrashMetricService", "Startup metric for 'PRIMES_CRASH_MONITORING_INITIALIZED' dropped.", new java.lang.Object[0]);
        } else {
            a(2, edw);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.civ civ) {
        java.lang.String str = "CrashMetricService";
        java.lang.String str2 = "activeComponentName: ";
        java.lang.String valueOf = java.lang.String.valueOf(defpackage.civ.a(civ));
        defpackage.cdm.a(3, str, valueOf.length() != 0 ? str2.concat(valueOf) : new java.lang.String(str2), new java.lang.Object[0]);
        this.e = civ;
    }

    public final void f() {
        defpackage.cdm.a(3, "CrashMetricService", "onFirstActivityCreated", new java.lang.Object[0]);
        if (!this.i.get()) {
            if (!b() || !this.l) {
                defpackage.cdm.a(4, "CrashMetricService", "Startup metric for 'PRIMES_FIRST_ACTIVITY_LAUNCHED' dropped.", new java.lang.Object[0]);
            } else {
                c().submit(new defpackage.chp(this));
            }
        }
        this.o = new defpackage.chq(this);
        this.n.a((defpackage.cgp) this.o);
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, defpackage.edw edw) {
        defpackage.efx efx = new defpackage.efx();
        efx.h = new defpackage.efg();
        efx.h.b = java.lang.Integer.valueOf(this.m);
        efx.h.a = i2;
        if (edw != null) {
            efx.h.c = new defpackage.efh();
            efx.h.c.a = edw;
        }
        a(efx);
    }

    /* access modifiers changed from: 0000 */
    public final void d() {
        if (this.o != null) {
            this.n.b(this.o);
            this.o = null;
        }
        if (this.d.get() && (java.lang.Thread.getDefaultUncaughtExceptionHandler() instanceof defpackage.chr)) {
            java.lang.Thread.setDefaultUncaughtExceptionHandler(((defpackage.chr) java.lang.Thread.getDefaultUncaughtExceptionHandler()).a);
        }
    }
}
