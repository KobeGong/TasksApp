package defpackage;

/* renamed from: cbl reason: default package */
/* compiled from: PG */
public final class cbl {
    private final android.content.Context a;
    private final defpackage.crv b;
    private final defpackage.crv c;
    private final defpackage.cbk d;
    private final defpackage.bux e;
    private final defpackage.cbj f;
    private final defpackage.ccu g;
    private final defpackage.bya h;

    public final void a(defpackage.bul bul, defpackage.buv buv, boolean z, boolean z2, defpackage.bvo bvo) {
        boolean z3;
        defpackage.bty.a("SystemTrayManagerImpl", "Updating notification", new java.lang.Object[0]);
        java.lang.String str = bul != null ? bul.b() : null;
        if (!z) {
            java.util.List a2 = this.e.a(str, buv.a());
            if (a2.isEmpty() || ((defpackage.buv) a2.get(0)).e().longValue() < buv.e().longValue()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                defpackage.bty.a("SystemTrayManagerImpl", "Skipping thread [%s]. Already in system tray.", buv.a());
                return;
            }
        }
        if (!this.f.a(buv)) {
            this.h.a(defpackage.ddi.BAD_CHANNEL).a(bul).a(buv).a();
            defpackage.bty.a("SystemTrayManagerImpl", "Skipping thread [%s]. Can't post to channel.", buv.a());
        } else if (!defpackage.nm.a(this.a).a()) {
            this.h.a(defpackage.ddi.USER_BLOCKED).a(bul).a(buv).a();
            defpackage.bty.a("SystemTrayManagerImpl", "Skipping thread [%s]. Notifications from this app are blocked.", buv.a());
        } else {
            java.lang.String a3 = a(bul, buv.a());
            defpackage.ni a4 = this.d.a.a(a3, bul, buv, z2, bvo);
            if (a4 != null) {
                if (this.b.a()) {
                    ((defpackage.cbt) this.b.b()).a();
                }
                a(bul, buv, a3, a4, z, z2);
            }
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.String>, for r7v0, types: [java.util.List, java.util.List<java.lang.String>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(defpackage.bul r6, java.util.List<java.lang.String> r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            if (r6 == 0) goto L_0x0029
            java.lang.String r0 = r6.b()     // Catch:{ all -> 0x0026 }
            r1 = r0
        L_0x0008:
            java.util.Iterator r2 = r7.iterator()     // Catch:{ all -> 0x0026 }
        L_0x000c:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x002c
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0026 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0026 }
            java.lang.String r0 = a(r6, r0)     // Catch:{ all -> 0x0026 }
            android.content.Context r3 = r5.a     // Catch:{ all -> 0x0026 }
            nm r3 = defpackage.nm.a(r3)     // Catch:{ all -> 0x0026 }
            r3.a(r0)     // Catch:{ all -> 0x0026 }
            goto L_0x000c
        L_0x0026:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0029:
            r0 = 0
            r1 = r0
            goto L_0x0008
        L_0x002c:
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0026 }
            java.lang.Object[] r0 = r7.toArray(r0)     // Catch:{ all -> 0x0026 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x0026 }
            bux r2 = r5.e     // Catch:{ all -> 0x0026 }
            java.util.List r2 = r2.a(r1, r0)     // Catch:{ all -> 0x0026 }
            bux r3 = r5.e     // Catch:{ all -> 0x0026 }
            r3.b(r1, r0)     // Catch:{ all -> 0x0026 }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0026 }
            r1.<init>()     // Catch:{ all -> 0x0026 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0026 }
        L_0x0049:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0068
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0026 }
            buv r0 = (defpackage.buv) r0     // Catch:{ all -> 0x0026 }
            java.lang.String r0 = r0.k()     // Catch:{ all -> 0x0026 }
            boolean r3 = r1.add(r0)     // Catch:{ all -> 0x0026 }
            if (r3 == 0) goto L_0x0049
            java.lang.String r3 = b(r6, r0)     // Catch:{ all -> 0x0026 }
            r4 = 1
            r5.a(r3, r0, r6, r4)     // Catch:{ all -> 0x0026 }
            goto L_0x0049
        L_0x0068:
            monitor-exit(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbl.a(bul, java.util.List):void");
    }

    public final synchronized void a(defpackage.bul bul) {
        java.lang.String str = bul != null ? bul.b() : null;
        java.util.List<defpackage.buv> a2 = this.e.a(str);
        this.e.b(str);
        java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet<>();
        for (defpackage.buv buv : a2) {
            hashSet.add(buv.k());
            defpackage.nm.a(this.a).a(a(bul, buv.a()));
        }
        for (java.lang.String b2 : hashSet) {
            defpackage.nm.a(this.a).a(b(bul, b2));
        }
    }

    public cbl(android.content.Context context, defpackage.crv crv, defpackage.crv crv2, defpackage.cbk cbk, defpackage.bux bux, defpackage.cbj cbj, defpackage.ccu ccu, defpackage.bya bya) {
        this.a = context;
        this.b = crv;
        this.c = crv2;
        this.d = cbk;
        this.e = bux;
        this.f = cbj;
        this.g = ccu;
        this.h = bya;
    }

    private final synchronized void a(defpackage.bul bul, defpackage.buv buv, java.lang.String str, defpackage.ni niVar, boolean z, boolean z2) {
        int a2 = this.e.a(bul != null ? bul.b() : null, buv);
        if (z || a2 == defpackage.bg.U || a2 == defpackage.bg.V) {
            java.lang.String b2 = b(bul, buv.k());
            if (a(b2, buv.k(), bul, z2 || (a2 != defpackage.bg.U && !z))) {
                niVar.l = false;
                niVar.k = b2;
            }
            defpackage.nm.a(this.a).a(str, niVar.b());
            this.h.a(defpackage.ddr.SHOWN).a(bul).a(buv).a();
            if (this.c.a()) {
                defpackage.cbu cbu = (defpackage.cbu) this.c.b();
                java.util.Arrays.asList(new defpackage.buv[]{buv});
                cbu.a();
            }
            if (buv.l().longValue() > 0) {
                long convert = java.util.concurrent.TimeUnit.MILLISECONDS.convert(buv.l().longValue(), java.util.concurrent.TimeUnit.MICROSECONDS);
                android.app.AlarmManager alarmManager = (android.app.AlarmManager) this.a.getSystemService("alarm");
                defpackage.ccu ccu = this.g;
                alarmManager.set(1, convert, android.app.PendingIntent.getBroadcast(ccu.a, defpackage.ccu.a(str, "com.google.android.libraries.notifications.NOTIFICATION_EXPIRED"), ccu.a("com.google.android.libraries.notifications.NOTIFICATION_EXPIRED", ccu.b.f().j(), bul, java.util.Arrays.asList(new defpackage.buv[]{buv}), 12), 134217728));
            }
        }
    }

    private final boolean a(java.lang.String str, java.lang.String str2, defpackage.bul bul, boolean z) {
        defpackage.ni niVar;
        if (!defpackage.bwj.d() && "chime_default_group".equals(str2)) {
            return false;
        }
        java.util.List<defpackage.buv> a2 = this.e.a(bul != null ? bul.b() : null, "group_id=?", new java.lang.String[]{str2});
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (defpackage.buv buv : a2) {
            if (this.f.a(buv)) {
                arrayList.add(buv);
            }
        }
        if (arrayList.isEmpty()) {
            defpackage.nm.a(this.a).a(str);
            return false;
        }
        defpackage.cbk cbk = this.d;
        if (defpackage.bwj.d()) {
            defpackage.cbm cbm = cbk.a;
            defpackage.cld.a(true);
            defpackage.cld.a(!arrayList.isEmpty());
            defpackage.buf f2 = cbm.b.f();
            defpackage.ni niVar2 = new defpackage.ni(cbm.a, 0);
            niVar2.t = 2;
            defpackage.ni a3 = niVar2.a(f2.a().intValue());
            if (bul != null) {
                a3.c(bul.b());
            }
            if (f2.c() != null) {
                a3.p = cbm.a.getResources().getColor(f2.c().intValue());
            }
            cbm.d.a(a3, (defpackage.buv) arrayList.get(0));
            cbm.a(a3, f2, bul, arrayList.size());
            a3.f = cbm.c.a(str, bul, arrayList);
            a3.a(cbm.c.b(str, bul, arrayList));
            niVar = a3;
        } else if (arrayList.size() == 1) {
            niVar = cbk.a.a(str, bul, (defpackage.buv) arrayList.get(0), z, defpackage.bvo.c());
        } else {
            defpackage.cbm cbm2 = cbk.a;
            defpackage.cld.a(true);
            defpackage.cld.a(arrayList.size() >= 2);
            defpackage.buf f3 = cbm2.b.f();
            defpackage.nj njVar = new defpackage.nj();
            java.util.ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                java.lang.Object obj = arrayList2.get(i);
                i++;
                defpackage.dfn g2 = ((defpackage.buv) obj).g();
                njVar.a((java.lang.CharSequence) android.text.Html.fromHtml(cbm2.a.getString(2131951694, new java.lang.Object[]{g2.b, g2.c})));
            }
            defpackage.ni a4 = new defpackage.ni(cbm2.a, 0).a((java.lang.CharSequence) cbm2.a.getString(f3.b().intValue())).b((java.lang.CharSequence) cbm2.a.getResources().getQuantityString(2131886085, arrayList.size(), new java.lang.Object[]{java.lang.Integer.valueOf(arrayList.size())})).a(f3.a().intValue()).a((defpackage.nk) njVar);
            if (bul != null) {
                a4.c(bul.b());
            }
            if (f3.c() != null) {
                a4.p = cbm2.a.getResources().getColor(f3.c().intValue());
            }
            defpackage.cbm.a(a4, f3, ((defpackage.buv) arrayList.get(0)).g(), z);
            cbm2.a(a4, f3, bul, arrayList.size());
            a4.f = cbm2.c.a(str, bul, arrayList);
            a4.a(cbm2.c.b(str, bul, arrayList));
            niVar = a4;
        }
        if (this.b.a()) {
            ((defpackage.cbt) this.b.b()).c();
        }
        niVar.l = true;
        niVar.k = str;
        defpackage.nm.a(this.a).a(str, niVar.b());
        return true;
    }

    private static java.lang.String a(defpackage.bul bul, java.lang.String str) {
        java.lang.String c2 = bul == null ? "Anonymous" : bul.c();
        return new java.lang.StringBuilder(java.lang.String.valueOf(c2).length() + 2 + java.lang.String.valueOf(str).length()).append(c2).append("::").append(str).toString();
    }

    private static java.lang.String b(defpackage.bul bul, java.lang.String str) {
        java.lang.String c2 = bul == null ? "Anonymous" : bul.c();
        return new java.lang.StringBuilder(java.lang.String.valueOf(c2).length() + 11 + java.lang.String.valueOf(str).length()).append(c2).append("::SUMMARY::").append(str).toString();
    }
}
