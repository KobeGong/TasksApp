package defpackage;

/* renamed from: aju reason: default package */
/* compiled from: PG */
public final class aju implements defpackage.ajy {
    public static java.lang.String a;
    private static defpackage.crv b;

    public final void a(android.app.Application application, java.util.concurrent.Executor executor) {
        defpackage.coq.a(application, new defpackage.ajv(this, new defpackage.coz(new defpackage.aiu(new defpackage.bqp(application, "TASKS", null, 0), executor))));
    }

    public final void a(java.lang.String str) {
        a = str;
    }

    public static synchronized defpackage.akm a() {
        defpackage.akm akn;
        synchronized (defpackage.aju.class) {
            if (b == null) {
                b = defpackage.akj.a();
            }
            if (b.a()) {
                akn = (defpackage.akm) b.b();
            } else {
                akn = new defpackage.akn();
            }
        }
        return akn;
    }

    public static void b() {
        defpackage.crv a2 = defpackage.akq.a();
        if (a2.a()) {
            ((defpackage.akr) a2.b()).a();
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Collection, code=java.util.Collection<dby>, for r3v0, types: [java.util.Collection<dby>, java.util.Collection] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.util.Collection<defpackage.dby> r3) {
        /*
            crv r0 = defpackage.akq.a()
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x002b
            int r0 = r3.size()
            java.util.ArrayList r1 = defpackage.cky.b(r0)
            java.util.Iterator r2 = r3.iterator()
        L_0x0016:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r2.next()
            dby r0 = (defpackage.dby) r0
            java.lang.String r0 = r0.d
            r1.add(r0)
            goto L_0x0016
        L_0x0028:
            c()
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aju.a(java.util.Collection):void");
    }

    public static void c() {
        defpackage.crv a2 = defpackage.akq.a();
        if (a2.a()) {
            ((defpackage.akr) a2.b()).b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.aoe a(android.content.Context r4, android.content.Intent r5) {
            r1 = 0
            java.lang.String r0 = r5.getAction()
            java.lang.String r2 = "android.intent.action.SEARCH"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0013
            aot r0 = new aot
            r0.<init>(r5)
        L_0x0012:
            return r0
        L_0x0013:
            java.lang.String r2 = "android.intent.action.VIEW"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x004d
            android.net.Uri r0 = r5.getData()
            if (r0 == 0) goto L_0x0045
            java.util.List r0 = r0.getPathSegments()
            if (r0 == 0) goto L_0x0045
            int r2 = r0.size()
            r3 = 4
            if (r2 != r3) goto L_0x0045
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "task"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0045
            r0 = 1
        L_0x003d:
            if (r0 == 0) goto L_0x0047
            aos r0 = new aos
            r0.<init>(r5)
            goto L_0x0012
        L_0x0045:
            r0 = r1
            goto L_0x003d
        L_0x0047:
            aoq r0 = new aoq
            r0.<init>(r1)
            goto L_0x0012
        L_0x004d:
            java.lang.String r2 = "android.intent.action.SEND"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = "text/plain"
            java.lang.String r2 = r5.getType()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0067
            aor r0 = new aor
            r0.<init>(r4, r5)
            goto L_0x0012
        L_0x0067:
            aoq r0 = new aoq
            r0.<init>(r1)
            goto L_0x0012
    }
}
