package defpackage;

/* renamed from: byh reason: default package */
/* compiled from: PG */
public final class byh {
    private final defpackage.cda a;
    private final defpackage.byg b;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<buv>, for r9v0, types: [java.util.List, java.util.List<buv>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(defpackage.bul r8, java.util.List<defpackage.buv> r9, defpackage.bvo r10) {
        /*
            r7 = this;
            r3 = 0
            java.util.Iterator r6 = r9.iterator()
        L_0x0005:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x001c
            java.lang.Object r2 = r6.next()
            buv r2 = (defpackage.buv) r2
            cda r0 = r7.a
            cbl r0 = r0.a
            r1 = r8
            r4 = r3
            r5 = r10
            r0.a(r1, r2, r3, r4, r5)
            goto L_0x0005
        L_0x001c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byh.b(bul, java.util.List, bvo):void");
    }

    public byh(defpackage.cda cda, defpackage.byg byg, defpackage.bqd bqd) {
        this.a = cda;
        this.b = byg;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<dfy>, for r14v0, types: [java.util.List, java.util.List<dfy>] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.bul r13, java.util.List<defpackage.dfy> r14, defpackage.bvo r15) {
        /*
            r12 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r14.iterator()
        L_0x000e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x006e
            java.lang.Object r0 = r5.next()
            dfy r0 = (defpackage.dfy) r0
            dgl r2 = r0.f
            if (r2 != 0) goto L_0x0045
            dgl r2 = defpackage.dgl.f
        L_0x0020:
            int r3 = r2.c
            dfw r3 = defpackage.dfw.a(r3)
            if (r3 != 0) goto L_0x002a
            dfw r3 = defpackage.dfw.DELETION_STATUS_UNKNOWN
        L_0x002a:
            dfw r6 = defpackage.dfw.DELETED
            if (r3 == r6) goto L_0x003c
            int r2 = r2.e
            dgj r2 = defpackage.dgj.a(r2)
            if (r2 != 0) goto L_0x0038
            dgj r2 = defpackage.dgj.SYSTEM_TRAY_BEHAVIOR_UNSPECIFIED
        L_0x0038:
            dgj r3 = defpackage.dgj.REMOVE_FROM_SYSTEM_TRAY
            if (r2 != r3) goto L_0x0048
        L_0x003c:
            r2 = 1
        L_0x003d:
            if (r2 == 0) goto L_0x0066
            java.lang.String r0 = r0.d
            r4.add(r0)
            goto L_0x000e
        L_0x0045:
            dgl r2 = r0.f
            goto L_0x0020
        L_0x0048:
            long r2 = r0.l
            r6 = 0
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x0064
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r6 = r0.l
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r2 = r2.convert(r6, r3)
            long r6 = java.lang.System.currentTimeMillis()
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x0064
            r2 = 1
            goto L_0x003d
        L_0x0064:
            r2 = 0
            goto L_0x003d
        L_0x0066:
            buv r0 = defpackage.buv.a(r0)
            r1.add(r0)
            goto L_0x000e
        L_0x006e:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x007b
            cda r0 = r12.a
            cbl r0 = r0.a
            r0.a(r13, r4)
        L_0x007b:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00ea
            byg r4 = r12.b
            crv r0 = r4.a
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x00eb
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            crv r0 = r4.a
            java.lang.Object r0 = r0.b()
            cbv r0 = (defpackage.cbv) r0
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r7 = r1.size()
            r2 = 0
            r3 = r2
        L_0x00a5:
            if (r3 >= r7) goto L_0x00d0
            java.lang.Object r2 = r1.get(r3)
            int r3 = r3 + 1
            buv r2 = (defpackage.buv) r2
            int r8 = defpackage.bg.Y
            int r9 = r0.a()
            if (r8 != r9) goto L_0x00bb
            r5.add(r2)
            goto L_0x00a5
        L_0x00bb:
            r6.add(r2)
            java.lang.String r8 = "ChimeThreadFilterImpl"
            java.lang.String r9 = "Thread [%s] filtered out by host app interceptor."
            r10 = 1
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r11 = 0
            java.lang.String r2 = r2.a()
            r10[r11] = r2
            defpackage.bty.a(r8, r9, r10)
            goto L_0x00a5
        L_0x00d0:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x00e7
            bya r0 = r4.b
            ddi r1 = defpackage.ddi.DROPPED_BY_CLIENT
            byb r0 = r0.a(r1)
            byb r0 = r0.a(r13)
            r0.b = r6
            r0.a()
        L_0x00e7:
            r12.b(r13, r5, r15)
        L_0x00ea:
            return
        L_0x00eb:
            r12.b(r13, r1, r15)
            goto L_0x00ea
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byh.a(bul, java.util.List, bvo):void");
    }
}
