package defpackage;

/* renamed from: dpw reason: default package */
/* compiled from: PG */
public final class dpw {
    public static final java.util.List a;
    public static final defpackage.dpw b = defpackage.dpx.OK.a();
    public static final defpackage.dpw c = defpackage.dpx.CANCELLED.a();
    public static final defpackage.dpw d = defpackage.dpx.UNKNOWN.a();
    public static final defpackage.dpw e = defpackage.dpx.DEADLINE_EXCEEDED.a();
    public static final defpackage.dpw f = defpackage.dpx.UNAUTHENTICATED.a();
    public static final defpackage.dpw g = defpackage.dpx.RESOURCE_EXHAUSTED.a();
    public static final defpackage.dpw h = defpackage.dpx.INTERNAL.a();
    public static final defpackage.dpw i = defpackage.dpx.UNAVAILABLE.a();
    public static final defpackage.doy j = defpackage.doy.a("grpc-status", false, new defpackage.dpy());
    public static final defpackage.doy k = defpackage.doy.a("grpc-message", false, o);
    private static final defpackage.dpa o = new defpackage.dpz();
    public final defpackage.dpx l;
    public final java.lang.String m;
    public final java.lang.Throwable n;

    /* Code decompiled incorrectly, please refer to instructions dump. */
    static defpackage.dpw a(byte[] r5) {
        /*
            r4 = 57
            r1 = 1
            r3 = 48
            r0 = 0
            int r2 = r5.length
            if (r2 != r1) goto L_0x0010
            byte r2 = r5[r0]
            if (r2 != r3) goto L_0x0010
            dpw r0 = b
        L_0x000f:
            return r0
        L_0x0010:
            int r2 = r5.length
            switch(r2) {
                case 1: goto L_0x0066;
                case 2: goto L_0x0032;
                default: goto L_0x0014;
            }
        L_0x0014:
            dpw r1 = d
            java.lang.String r2 = "Unknown code "
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r3 = defpackage.crp.a
            r0.<init>(r5, r3)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r3 = r0.length()
            if (r3 == 0) goto L_0x0060
            java.lang.String r0 = r2.concat(r0)
        L_0x002d:
            dpw r0 = r1.a(r0)
            goto L_0x000f
        L_0x0032:
            byte r2 = r5[r0]
            if (r2 < r3) goto L_0x0014
            byte r2 = r5[r0]
            if (r2 > r4) goto L_0x0014
            byte r0 = r5[r0]
            int r0 = r0 + -48
            int r0 = r0 * 10
            int r0 = r0 + 0
        L_0x0042:
            byte r2 = r5[r1]
            if (r2 < r3) goto L_0x0014
            byte r2 = r5[r1]
            if (r2 > r4) goto L_0x0014
            byte r1 = r5[r1]
            int r1 = r1 + -48
            int r0 = r0 + r1
            java.util.List r1 = a
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x0014
            java.util.List r1 = a
            java.lang.Object r0 = r1.get(r0)
            dpw r0 = (defpackage.dpw) r0
            goto L_0x000f
        L_0x0060:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            goto L_0x002d
        L_0x0066:
            r1 = r0
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpw.a(byte[]):dpw");
    }

    public static defpackage.dpw a(java.lang.Throwable th) {
        for (java.lang.Throwable th2 = (java.lang.Throwable) defpackage.cld.a((java.lang.Object) th, (java.lang.Object) "t"); th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof defpackage.dqa) {
                return ((defpackage.dqa) th2).a;
            }
            if (th2 instanceof defpackage.dqb) {
                return ((defpackage.dqb) th2).a;
            }
        }
        return d.b(th);
    }

    static java.lang.String a(defpackage.dpw dpw) {
        if (dpw.m == null) {
            return dpw.l.toString();
        }
        java.lang.String valueOf = java.lang.String.valueOf(dpw.l);
        java.lang.String str = dpw.m;
        return new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 2 + java.lang.String.valueOf(str).length()).append(valueOf).append(": ").append(str).toString();
    }

    private dpw(defpackage.dpx dpx) {
        this(dpx, null, null);
    }

    private dpw(defpackage.dpx dpx, java.lang.String str, java.lang.Throwable th) {
        this.l = (defpackage.dpx) defpackage.cld.a((java.lang.Object) dpx, (java.lang.Object) "code");
        this.m = str;
        this.n = th;
    }

    public final defpackage.dpw b(java.lang.Throwable th) {
        return defpackage.cru.d(this.n, th) ? this : new defpackage.dpw(this.l, this.m, th);
    }

    public final defpackage.dpw a(java.lang.String str) {
        return defpackage.cru.d(this.m, str) ? this : new defpackage.dpw(this.l, str, this.n);
    }

    public final defpackage.dpw b(java.lang.String str) {
        if (str == null) {
            return this;
        }
        if (this.m == null) {
            return new defpackage.dpw(this.l, str, this.n);
        }
        defpackage.dpx dpx = this.l;
        java.lang.String str2 = this.m;
        return new defpackage.dpw(dpx, new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 1 + java.lang.String.valueOf(str).length()).append(str2).append("\n").append(str).toString(), this.n);
    }

    public final boolean a() {
        return defpackage.dpx.OK == this.l;
    }

    public final defpackage.dqb b() {
        return new defpackage.dqb(this);
    }

    public final defpackage.dqb a(defpackage.dor dor) {
        return new defpackage.dqb(this, dor);
    }

    public final defpackage.dqa c() {
        return new defpackage.dqa(this);
    }

    public final java.lang.String toString() {
        return defpackage.cky.b((java.lang.Object) this).a("code", (java.lang.Object) this.l.name()).a("description", (java.lang.Object) this.m).a("cause", this.n != null ? defpackage.cse.c(this.n) : this.n).toString();
    }

    static {
        defpackage.dpx[] values;
        java.util.TreeMap treeMap = new java.util.TreeMap();
        for (defpackage.dpx dpx : defpackage.dpx.values()) {
            defpackage.dpw dpw = (defpackage.dpw) treeMap.put(java.lang.Integer.valueOf(dpx.r), new defpackage.dpw(dpx));
            if (dpw != null) {
                java.lang.String name = dpw.l.name();
                java.lang.String name2 = dpx.name();
                throw new java.lang.IllegalStateException(new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 34 + java.lang.String.valueOf(name2).length()).append("Code value duplication between ").append(name).append(" & ").append(name2).toString());
            }
        }
        a = java.util.Collections.unmodifiableList(new java.util.ArrayList(treeMap.values()));
        defpackage.dpx.INVALID_ARGUMENT.a();
        defpackage.dpx.NOT_FOUND.a();
        defpackage.dpx.ALREADY_EXISTS.a();
        defpackage.dpx.PERMISSION_DENIED.a();
        defpackage.dpx.FAILED_PRECONDITION.a();
        defpackage.dpx.ABORTED.a();
        defpackage.dpx.OUT_OF_RANGE.a();
        defpackage.dpx.UNIMPLEMENTED.a();
        defpackage.dpx.DATA_LOSS.a();
    }
}
