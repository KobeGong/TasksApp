package defpackage;

/* renamed from: ctn reason: default package */
/* compiled from: PG */
public abstract class ctn implements defpackage.cua, defpackage.cuo {
    private static final java.lang.String a = new java.lang.String();
    private final java.util.logging.Level b;
    private final long c;
    private defpackage.ctq d;
    private defpackage.ctt e;
    private defpackage.cvf f;
    private java.lang.Object[] g;

    protected ctn(java.util.logging.Level level, boolean z) {
        this(level, z, defpackage.cut.e());
    }

    /* access modifiers changed from: protected */
    public abstract defpackage.cvz a();

    /* access modifiers changed from: protected */
    public abstract defpackage.ctj b();

    /* access modifiers changed from: protected */
    public abstract defpackage.cua c();

    private ctn(java.util.logging.Level level, boolean z, long j) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.b = (java.util.logging.Level) defpackage.cub.a((java.lang.Object) level, "level");
        this.c = j;
        if (z) {
            a(defpackage.ctp.e, java.lang.Boolean.TRUE);
        }
    }

    public final java.util.logging.Level d() {
        return this.b;
    }

    public final long e() {
        return this.c;
    }

    public final defpackage.ctt f() {
        if (this.e != null) {
            return this.e;
        }
        throw new java.lang.IllegalStateException("cannot request log site information prior to postProcess()");
    }

    public final defpackage.cvf g() {
        return this.f;
    }

    public final java.lang.Object[] h() {
        if (this.f != null) {
            return this.g;
        }
        throw new java.lang.IllegalStateException("cannot get arguments unless a template context exists");
    }

    public final java.lang.Object i() {
        if (this.f == null) {
            return this.g[0];
        }
        throw new java.lang.IllegalStateException("cannot get literal argument if a template context exists");
    }

    public final boolean j() {
        return this.d != null && java.lang.Boolean.TRUE.equals(this.d.b(defpackage.ctp.e));
    }

    public final defpackage.cur k() {
        return this.d != null ? this.d : defpackage.cur.c;
    }

    private final void a(defpackage.cuc cuc, java.lang.Object obj) {
        if (this.d == null) {
            this.d = new defpackage.ctq();
        }
        defpackage.ctq ctq = this.d;
        int a2 = ctq.a(cuc);
        if (a2 != -1) {
            ctq.a[(a2 * 2) + 1] = defpackage.cub.a(obj, "metadata value");
            return;
        }
        if ((ctq.b + 1) * 2 > ctq.a.length) {
            ctq.a = java.util.Arrays.copyOf(ctq.a, ctq.a.length * 2);
        }
        ctq.a[ctq.b * 2] = defpackage.cub.a((java.lang.Object) cuc, "metadata key");
        ctq.a[(ctq.b * 2) + 1] = defpackage.cub.a(obj, "metadata value");
        ctq.b++;
    }

    public final defpackage.cua a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.e = defpackage.ctt.a(str, str2, str3);
        return c();
    }

    public final defpackage.cua a(java.lang.Throwable th) {
        a(defpackage.ctp.a, th);
        return c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r13) {
        /*
            r12 = this;
            r4 = 0
            r6 = 1
            r5 = 0
            ctt r0 = r12.e
            if (r0 != 0) goto L_0x001d
            ctj r0 = r12.b()
            cup r0 = r0.a
            java.lang.Class<ctn> r1 = defpackage.ctn.class
            ctt r0 = r0.a(r1, r6)
            java.lang.String r1 = "logger backend must not return a null LogSite"
            java.lang.Object r0 = defpackage.cub.a(r0, r1)
            ctt r0 = (defpackage.ctt) r0
            r12.e = r0
        L_0x001d:
            ctt r0 = r12.e
            ctt r1 = defpackage.ctt.a
            if (r0 == r1) goto L_0x01a1
            ctt r1 = r12.e
            cur r0 = r12.k()
            cuc r2 = defpackage.ctp.d
            java.lang.Object r0 = r0.b(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x019e
            ctr r1 = new ctr
            ctt r2 = r12.e
            r1.<init>(r2, r0)
            r3 = r1
        L_0x003b:
            ctq r0 = r12.d
            if (r0 == 0) goto L_0x00bb
            if (r3 == 0) goto L_0x00bb
            ctq r0 = r12.d
            cuc r1 = defpackage.ctp.b
            java.lang.Object r0 = r0.b(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            ctq r1 = r12.d
            cuc r2 = defpackage.ctp.c
            java.lang.Object r1 = r1.b(r2)
            cty r1 = (defpackage.cty) r1
            ctz r8 = defpackage.ctx.a
            java.util.concurrent.ConcurrentMap r2 = r8.a
            java.lang.Object r2 = r2.get(r3)
            ctx r2 = (defpackage.ctx) r2
            if (r2 != 0) goto L_0x0070
            ctx r7 = new ctx
            r7.<init>()
            java.util.concurrent.ConcurrentMap r2 = r8.a
            java.lang.Object r2 = r2.putIfAbsent(r3, r7)
            ctx r2 = (defpackage.ctx) r2
            if (r2 == 0) goto L_0x019b
        L_0x0070:
            if (r0 == 0) goto L_0x00ae
            int r0 = r0.intValue()
            java.util.concurrent.atomic.AtomicLong r3 = r2.b
            long r8 = r3.getAndIncrement()
            long r10 = (long) r0
            long r8 = r8 % r10
            r10 = 0
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x00ac
            r0 = r6
        L_0x0085:
            if (r0 != 0) goto L_0x00ae
            r0 = r5
        L_0x0088:
            if (r0 != 0) goto L_0x0139
            r0 = r5
        L_0x008b:
            if (r0 == 0) goto L_0x016a
            java.lang.String r2 = a
            java.lang.Object[] r3 = new java.lang.Object[r6]
            r3[r5] = r13
            r12.g = r3
            r1 = r5
        L_0x0096:
            if (r1 > 0) goto L_0x014d
            r0 = r3[r1]
            boolean r0 = r0 instanceof defpackage.ctm
            if (r0 == 0) goto L_0x00a8
            r0 = r3[r1]
            ctm r0 = (defpackage.ctm) r0
            java.lang.Object r0 = r0.a()
            r3[r1] = r0
        L_0x00a8:
            int r0 = r1 + 1
            r1 = r0
            goto L_0x0096
        L_0x00ac:
            r0 = r5
            goto L_0x0085
        L_0x00ae:
            if (r1 == 0) goto L_0x00bb
            java.util.concurrent.atomic.AtomicLong r0 = r2.c
            r0.get()
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x00bb:
            cur r0 = r12.k()
            cuc r1 = defpackage.ctp.g
            java.lang.Object r0 = r0.b(r1)
            cud r0 = (defpackage.cud) r0
            if (r0 == 0) goto L_0x0136
            cuc r3 = defpackage.ctp.g
            ctq r1 = r12.d
            if (r1 == 0) goto L_0x0113
            ctq r7 = r12.d
            int r1 = r7.a(r3)
            if (r1 < 0) goto L_0x0113
            int r2 = r1 * 2
            int r1 = r2 + 2
        L_0x00db:
            int r8 = r7.b
            int r8 = r8 * 2
            if (r1 >= r8) goto L_0x0100
            java.lang.Object[] r8 = r7.a
            r8 = r8[r1]
            boolean r9 = r8.equals(r3)
            if (r9 != 0) goto L_0x00fd
            java.lang.Object[] r9 = r7.a
            r9[r2] = r8
            java.lang.Object[] r8 = r7.a
            int r9 = r2 + 1
            java.lang.Object[] r10 = r7.a
            int r11 = r1 + 1
            r10 = r10[r11]
            r8[r9] = r10
            int r2 = r2 + 2
        L_0x00fd:
            int r1 = r1 + 2
            goto L_0x00db
        L_0x0100:
            int r3 = r7.b
            int r8 = r1 - r2
            int r8 = r8 >> 1
            int r3 = r3 - r8
            r7.b = r3
        L_0x0109:
            if (r2 >= r1) goto L_0x0113
            java.lang.Object[] r8 = r7.a
            int r3 = r2 + 1
            r8[r2] = r4
            r2 = r3
            goto L_0x0109
        L_0x0113:
            ctw r2 = new ctw
            cur r1 = r12.k()
            cuc r3 = defpackage.ctp.a
            java.lang.Object r1 = r1.b(r3)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Class<ctn> r3 = defpackage.ctn.class
            java.lang.Throwable r4 = new java.lang.Throwable
            r4.<init>()
            int r7 = r0.a
            java.lang.StackTraceElement[] r3 = defpackage.cwc.a(r3, r4, r7)
            r2.<init>(r1, r0, r3)
            cuc r0 = defpackage.ctp.a
            r12.a(r0, r2)
        L_0x0136:
            r0 = r6
            goto L_0x0088
        L_0x0139:
            cuy r0 = defpackage.cut.c()
            java.util.SortedMap r1 = r0.b
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x014a
            cuc r1 = defpackage.ctp.f
            r12.a(r1, r0)
        L_0x014a:
            r0 = r6
            goto L_0x008b
        L_0x014d:
            java.lang.String r0 = a
            if (r2 == r0) goto L_0x015c
            cvf r0 = new cvf
            cvz r1 = r12.a()
            r0.<init>(r1, r2)
            r12.f = r0
        L_0x015c:
            ctj r1 = r12.b()
            java.lang.String r0 = "data"
            defpackage.cub.a(r12, r0)
            cup r0 = r1.a     // Catch:{ RuntimeException -> 0x016b }
            r0.a(r12)     // Catch:{ RuntimeException -> 0x016b }
        L_0x016a:
            return
        L_0x016b:
            r0 = move-exception
            cup r1 = r1.a     // Catch:{ cuq -> 0x0172, RuntimeException -> 0x0174 }
            r1.a(r0, r12)     // Catch:{ cuq -> 0x0172, RuntimeException -> 0x0174 }
            goto L_0x016a
        L_0x0172:
            r0 = move-exception
            throw r0
        L_0x0174:
            r0 = move-exception
            r1 = r0
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.String r3 = "logging error: "
            java.lang.String r0 = r1.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r4 = r0.length()
            if (r4 == 0) goto L_0x0195
            java.lang.String r0 = r3.concat(r0)
        L_0x018c:
            r2.println(r0)
            java.io.PrintStream r0 = java.lang.System.err
            defpackage.cza.a(r1, r0)
            goto L_0x016a
        L_0x0195:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            goto L_0x018c
        L_0x019b:
            r2 = r7
            goto L_0x0070
        L_0x019e:
            r3 = r1
            goto L_0x003b
        L_0x01a1:
            r3 = r4
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctn.a(java.lang.String):void");
    }
}
