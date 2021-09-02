package defpackage;

/* renamed from: dpq reason: default package */
/* compiled from: PG */
final class dpq extends defpackage.dok {
    private final defpackage.dom a;
    private defpackage.dop b;

    dpq(defpackage.dom dom) {
        this.a = (defpackage.dom) defpackage.cld.a((java.lang.Object) dom, (java.lang.Object) "helper");
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<doe>, for r5v0, types: [java.util.List, java.util.List<doe>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.List<defpackage.doe> r5, defpackage.dmv r6) {
        /*
            r4 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r5.iterator()
        L_0x0009:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r0 = r2.next()
            doe r0 = (defpackage.doe) r0
            java.util.List r0 = r0.a
            r1.addAll(r0)
            goto L_0x0009
        L_0x001b:
            doe r0 = new doe
            r0.<init>(r1)
            dop r1 = r4.b
            if (r1 != 0) goto L_0x0046
            dom r1 = r4.a
            dmv r2 = defpackage.dmv.b
            dop r0 = r1.a(r0, r2)
            r4.b = r0
            dom r0 = r4.a
            dnq r1 = defpackage.dnq.CONNECTING
            dpr r2 = new dpr
            dop r3 = r4.b
            don r3 = defpackage.don.a(r3)
            r2.<init>(r3)
            r0.a(r1, r2)
            dop r0 = r4.b
            r0.b()
        L_0x0045:
            return
        L_0x0046:
            dom r1 = r4.a
            dop r2 = r4.b
            r1.a(r2, r0)
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpq.a(java.util.List, dmv):void");
    }

    public final void a(defpackage.dpw dpw) {
        if (this.b != null) {
            this.b.a();
            this.b = null;
        }
        this.a.a(defpackage.dnq.TRANSIENT_FAILURE, (defpackage.doq) new defpackage.dpr(defpackage.don.a(dpw)));
    }

    public final void a(defpackage.dop dop, defpackage.dnr dnr) {
        defpackage.don a2;
        defpackage.dnq dnq = dnr.a;
        if (dop == this.b && dnq != defpackage.dnq.SHUTDOWN) {
            switch (dnq.ordinal()) {
                case 0:
                    a2 = defpackage.don.a;
                    break;
                case 1:
                case 3:
                    a2 = defpackage.don.a(dop);
                    break;
                case 2:
                    a2 = defpackage.don.a(dnr.b);
                    break;
                default:
                    java.lang.String valueOf = java.lang.String.valueOf(dnq);
                    throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 18).append("Unsupported state:").append(valueOf).toString());
            }
            this.a.a(dnq, (defpackage.doq) new defpackage.dpr(a2));
        }
    }

    public final void a() {
        if (this.b != null) {
            this.b.a();
        }
    }
}
