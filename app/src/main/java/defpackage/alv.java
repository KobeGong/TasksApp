package defpackage;

/* renamed from: alv reason: default package */
/* compiled from: PG */
public final class alv {
    public final java.lang.String a;
    public java.util.List b = null;
    private final android.content.Context c;
    private java.util.Map d = new java.util.HashMap();
    private java.util.List e = new java.util.ArrayList();
    private boolean f = false;
    private java.util.concurrent.ScheduledExecutorService g;

    public alv(java.lang.String str, android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.g = scheduledExecutorService;
        this.a = str;
        this.c = context.getApplicationContext();
        g();
    }

    public final synchronized java.util.List a() {
        java.util.List unmodifiableList;
        if (this.b == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = java.util.Collections.unmodifiableList(this.b);
        }
        return unmodifiableList;
    }

    public final synchronized defpackage.dcb a(java.lang.String str) {
        defpackage.dcb dcb;
        java.util.Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                dcb = null;
                break;
            }
            dcb = (defpackage.dcb) it.next();
            if (dcb.b.equals(str)) {
                break;
            }
        }
        return dcb;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<dcb>, for r4v0, types: [java.util.List, java.util.List<dcb>, java.lang.Iterable] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.util.List<defpackage.dcb> r4) {
            r3 = this;
            monitor-enter(r3)
            java.util.Map r0 = r3.d     // Catch:{ all -> 0x0028 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x0028 }
            boolean r1 = r0 instanceof java.util.Collection     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x002b
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0028 }
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ all -> 0x0028 }
            r1.<init>(r0)     // Catch:{ all -> 0x0028 }
        L_0x0012:
            java.util.Iterator r2 = r4.iterator()     // Catch:{ all -> 0x0028 }
        L_0x0016:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0039
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0028 }
            dcb r0 = (defpackage.dcb) r0     // Catch:{ all -> 0x0028 }
            java.lang.String r0 = r0.b     // Catch:{ all -> 0x0028 }
            r1.remove(r0)     // Catch:{ all -> 0x0028 }
            goto L_0x0016
        L_0x0028:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x002b:
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0028 }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0028 }
            r0.<init>()     // Catch:{ all -> 0x0028 }
            defpackage.cky.a(r0, r1)     // Catch:{ all -> 0x0028 }
            r1 = r0
            goto L_0x0012
        L_0x0039:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0028 }
        L_0x003d:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x005b
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0028 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0028 }
            java.util.Map r2 = r3.d     // Catch:{ all -> 0x0028 }
            java.lang.Object r0 = r2.remove(r0)     // Catch:{ all -> 0x0028 }
            ajq r0 = (defpackage.ajq) r0     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x003d
            java.util.List r0 = r0.a()     // Catch:{ all -> 0x0028 }
            defpackage.aju.a(r0)     // Catch:{ all -> 0x0028 }
            goto L_0x003d
        L_0x005b:
            java.util.ArrayList r0 = defpackage.cky.a(r4)     // Catch:{ all -> 0x0028 }
            r3.b = r0     // Catch:{ all -> 0x0028 }
            r3.e()     // Catch:{ all -> 0x0028 }
            monitor-exit(r3)
            return
    }

    public final synchronized AbsTaskListStructure b(java.lang.String str) {
        AbsTaskListStructure ajq;
        ajq = (AbsTaskListStructure) this.d.get(str);
        if (ajq == null) {
            ajq = null;
        }
        return ajq;
    }

    public final synchronized defpackage.dby a(java.lang.String str, java.lang.String str2) {
        defpackage.dby dby = null;
        synchronized (this) {
            AbsTaskListStructure b2 = b(str);
            if (b2 != null) {
                int a2 = a(b2.getTasks(), str2);
                if (a2 >= 0) {
                    dby = (defpackage.dby) b2.getTasks().get(a2);
                }
            }
        }
        return dby;
    }

    public final synchronized boolean b(java.lang.String str, java.lang.String str2) {
        boolean z;
        AbsTaskListStructure b2 = b(str);
        if (b2 != null) {
            java.util.Iterator it = b2.getStructure().a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((defpackage.dcf) it.next()).b.equals(str2)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        return z;
    }

    public final synchronized java.util.List c(java.lang.String str, java.lang.String str2) {
        java.util.ArrayList arrayList;
        arrayList = new java.util.ArrayList();
        AbsTaskListStructure b2 = b(str);
        if (b2 != null) {
            for (defpackage.dcf dcf : b2.getStructure().a) {
                if (dcf.b.equals(str2)) {
                    for (defpackage.dcf dcf2 : dcf.c) {
                        int a2 = a(b2.getTasks(), dcf2.b);
                        if (a2 >= 0) {
                            arrayList.add((defpackage.dby) b2.getTasks().get(a2));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized void a(java.lang.String str, AbsTaskListStructure ajq) {
        if (e(str) >= 0) {
            AbsTaskListStructure ajq2 = (AbsTaskListStructure) this.d.get(str);
            this.d.put(str, ajq);
            e();
            java.util.HashSet hashSet = new java.util.HashSet();
            if (ajq2 != null) {
                for (defpackage.dby dby : ajq2.getTasks()) {
                    hashSet.add(dby.d);
                }
                if (ajq != null) {
                    for (defpackage.dby dby2 : ajq.getTasks()) {
                        hashSet.remove(dby2.d);
                    }
                }
                defpackage.aju.c();
            }
            if (ajq != null) {
                ajq.getTasks();
                defpackage.aju.b();
            }
        }
    }

    public final synchronized void a(java.lang.String str, java.lang.String str2, boolean z) {
        defpackage.dih dih;
        defpackage.dih dih2;
        AbsTaskListStructure ajq = (AbsTaskListStructure) this.d.get(str);
        if (ajq != null) {
            int a2 = a(ajq.getTasks(), str2);
            if (a2 >= 0) {
                defpackage.dby dby = (defpackage.dby) ajq.getTasks().get(a2);
                defpackage.dii dii = (defpackage.dii) dby.a(defpackage.bg.ao);
                dii.a((defpackage.dih) dby);
                defpackage.dii dii2 = dii;
                defpackage.dca f2 = dii2.f();
                defpackage.dii dii3 = (defpackage.dii) f2.a(defpackage.bg.ao);
                dii3.a((defpackage.dih) f2);
                dii2.g(dii3.a(z));
                if (dii2.b) {
                    dih = dii2.a;
                } else {
                    defpackage.dih dih3 = dii2.a;
                    defpackage.djz.a.a((java.lang.Object) dih3).c(dih3);
                    dii2.b = true;
                    dih = dii2.a;
                }
                defpackage.dih dih4 = dih;
                if (!defpackage.dih.a(dih4, java.lang.Boolean.TRUE.booleanValue())) {
                    throw new defpackage.dkw();
                }
                defpackage.dby dby2 = (defpackage.dby) dih4;
                java.util.ArrayList a3 = defpackage.cky.a((java.lang.Iterable) ajq.getTasks());
                a3.remove(a2);
                a3.add(0, dby2);
                defpackage.dce b2 = ajq.getStructure();
                defpackage.dii dii4 = (defpackage.dii) b2.a(defpackage.bg.ao);
                dii4.a((defpackage.dih) b2);
                defpackage.dii dii5 = dii4;
                if (z) {
                    a(str2, dii5);
                } else {
                    dii5.b(0, ((defpackage.dii) defpackage.dcf.d.a(defpackage.bg.ao)).i(str2));
                }
                java.util.Map map = this.d;
                if (dii5.b) {
                    dih2 = dii5.a;
                } else {
                    defpackage.dih dih5 = dii5.a;
                    defpackage.djz.a.a((java.lang.Object) dih5).c(dih5);
                    dii5.b = true;
                    dih2 = dii5.a;
                }
                defpackage.dih dih6 = dih2;
                if (!defpackage.dih.a(dih6, java.lang.Boolean.TRUE.booleanValue())) {
                    throw new defpackage.dkw();
                }
                map.put(str, AbsTaskListStructure.a(a3, (defpackage.dce) dih6, ajq.getLastSyncedMs()));
                e();
                defpackage.csp.a((java.lang.Object) dby2);
                defpackage.aju.b();
            }
        }
    }

    public final synchronized void a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        a(str, str2, (defpackage.crq) new defpackage.alw(str3));
    }

    public final synchronized void b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        a(str, str2, (defpackage.crq) new defpackage.alx(str3));
    }

    public final synchronized void a(java.lang.String str, java.lang.String str2, defpackage.dmk dmk) {
        a(str, str2, (defpackage.crq) new defpackage.aly(dmk));
    }

    public final synchronized void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map map) {
        defpackage.dca dca;
        defpackage.dce dce;
        defpackage.dcf dcf;
        AbsTaskListStructure ajq;
        defpackage.dce dce2;
        defpackage.dih dih;
        defpackage.dih dih2;
        defpackage.dih dih3;
        defpackage.dih dih4;
        AbsTaskListStructure ajq2 = (AbsTaskListStructure) this.d.get(str);
        if (ajq2 != null) {
            int a2 = a(ajq2.getTasks(), str2);
            if (a2 >= 0) {
                java.util.ArrayList a3 = defpackage.cky.a((java.lang.Iterable) ajq2.getTasks());
                defpackage.dby dby = (defpackage.dby) a3.remove(a2);
                defpackage.dce b2 = ajq2.getStructure();
                if (dby.e == null) {
                    dca = defpackage.dca.g;
                } else {
                    dca = dby.e;
                }
                if (!dca.a) {
                    defpackage.dii dii = (defpackage.dii) b2.a(defpackage.bg.ao);
                    dii.a((defpackage.dih) b2);
                    defpackage.dii dii2 = dii;
                    dcf = a(str2, dii2);
                    if (dii2.b) {
                        dih4 = dii2.a;
                    } else {
                        defpackage.dih dih5 = dii2.a;
                        defpackage.djz.a.a((java.lang.Object) dih5).c(dih5);
                        dii2.b = true;
                        dih4 = dii2.a;
                    }
                    defpackage.dih dih6 = dih4;
                    if (!defpackage.dih.a(dih6, java.lang.Boolean.TRUE.booleanValue())) {
                        throw new defpackage.dkw();
                    }
                    dce = (defpackage.dce) dih6;
                } else {
                    dce = b2;
                    dcf = null;
                }
                defpackage.aju.a((java.util.Collection) defpackage.csp.a((java.lang.Object) dby));
                AbsTaskListStructure ajq3 = (AbsTaskListStructure) this.d.get(str3);
                if (ajq3 == null) {
                    ajq = AbsTaskListStructure.d();
                } else {
                    ajq = ajq3;
                }
                java.util.ArrayList a4 = defpackage.cky.a((java.lang.Iterable) ajq.getTasks());
                defpackage.dce b3 = ajq.getStructure();
                if (dcf != null) {
                    defpackage.dii i = ((defpackage.dii) defpackage.dcf.d.a(defpackage.bg.ao)).i(str4);
                    for (defpackage.dcf dcf2 : dcf.c) {
                        if (map.containsKey(dcf2.b)) {
                            int a5 = a((java.util.List) a3, dcf2.b);
                            if (a5 >= 0) {
                                java.lang.String str5 = (java.lang.String) map.get(dcf2.b);
                                defpackage.dii i2 = ((defpackage.dii) defpackage.dcf.d.a(defpackage.bg.ao)).i(str5);
                                i.b();
                                defpackage.dcf.a((defpackage.dcf) i.a, i2);
                                defpackage.dby dby2 = (defpackage.dby) a3.remove(a5);
                                defpackage.dii dii3 = (defpackage.dii) dby2.a(defpackage.bg.ao);
                                dii3.a((defpackage.dih) dby2);
                                defpackage.dii e2 = dii3.e(str5);
                                if (e2.b) {
                                    dih3 = e2.a;
                                } else {
                                    defpackage.dih dih7 = e2.a;
                                    defpackage.djz.a.a((java.lang.Object) dih7).c(dih7);
                                    e2.b = true;
                                    dih3 = e2.a;
                                }
                                defpackage.dih dih8 = dih3;
                                if (!defpackage.dih.a(dih8, java.lang.Boolean.TRUE.booleanValue())) {
                                    throw new defpackage.dkw();
                                }
                                a4.add((defpackage.dby) dih8);
                            } else {
                                continue;
                            }
                        }
                    }
                    defpackage.dce b4 = ajq.getStructure();
                    defpackage.dii dii4 = (defpackage.dii) b4.a(defpackage.bg.ao);
                    dii4.a((defpackage.dih) b4);
                    defpackage.dii dii5 = dii4;
                    dii5.b(0, i);
                    if (dii5.b) {
                        dih2 = dii5.a;
                    } else {
                        defpackage.dih dih9 = dii5.a;
                        defpackage.djz.a.a((java.lang.Object) dih9).c(dih9);
                        dii5.b = true;
                        dih2 = dii5.a;
                    }
                    defpackage.dih dih10 = dih2;
                    if (!defpackage.dih.a(dih10, java.lang.Boolean.TRUE.booleanValue())) {
                        throw new defpackage.dkw();
                    }
                    dce2 = (defpackage.dce) dih10;
                } else {
                    dce2 = b3;
                }
                defpackage.dii dii6 = (defpackage.dii) dby.a(defpackage.bg.ao);
                dii6.a((defpackage.dih) dby);
                defpackage.dii e3 = dii6.e(str4);
                if (e3.b) {
                    dih = e3.a;
                } else {
                    defpackage.dih dih11 = e3.a;
                    defpackage.djz.a.a((java.lang.Object) dih11).c(dih11);
                    e3.b = true;
                    dih = e3.a;
                }
                defpackage.dih dih12 = dih;
                if (!defpackage.dih.a(dih12, java.lang.Boolean.TRUE.booleanValue())) {
                    throw new defpackage.dkw();
                }
                defpackage.dby dby3 = (defpackage.dby) dih12;
                a4.add(dby3);
                defpackage.csp.a((java.lang.Object) dby3);
                defpackage.aju.b();
                this.d.put(str, AbsTaskListStructure.a(a3, dce, ajq2.getLastSyncedMs()));
                this.d.put(str3, AbsTaskListStructure.a(a4, dce2, ajq.getLastSyncedMs()));
                e();
            }
        }
    }

    public final synchronized void a(java.lang.String str, defpackage.dby dby, int i, java.lang.String str2) {
        AbsTaskListStructure ajq;
        defpackage.dih dih;
        defpackage.dih dih2;
        AbsTaskListStructure ajq2 = (AbsTaskListStructure) this.d.get(str);
        if (ajq2 == null) {
            ajq = AbsTaskListStructure.d();
        } else {
            ajq = ajq2;
        }
        if (a(ajq.getTasks(), dby.d) < 0) {
            if (android.text.TextUtils.isEmpty(str2)) {
                java.util.ArrayList a2 = defpackage.cky.a((java.lang.Iterable) ajq.getTasks());
                a2.add(0, dby);
                java.util.Map map = this.d;
                defpackage.dce b2 = ajq.getStructure();
                defpackage.dii dii = (defpackage.dii) b2.a(defpackage.bg.ao);
                dii.a((defpackage.dih) b2);
                defpackage.dii b3 = dii.b(i, ((defpackage.dii) defpackage.dcf.d.a(defpackage.bg.ao)).i(dby.d));
                if (b3.b) {
                    dih2 = b3.a;
                } else {
                    defpackage.dih dih3 = b3.a;
                    defpackage.djz.a.a((java.lang.Object) dih3).c(dih3);
                    b3.b = true;
                    dih2 = b3.a;
                }
                defpackage.dih dih4 = dih2;
                if (!defpackage.dih.a(dih4, java.lang.Boolean.TRUE.booleanValue())) {
                    throw new defpackage.dkw();
                }
                map.put(str, AbsTaskListStructure.a(a2, (defpackage.dce) dih4, ajq.getLastSyncedMs()));
                defpackage.csp.a((java.lang.Object) dby);
                defpackage.aju.b();
                e();
            } else {
                int i2 = 0;
                for (defpackage.dcf dcf : ajq.getStructure().a) {
                    if (dcf.b.equals(str2)) {
                        java.util.ArrayList a3 = defpackage.cky.a((java.lang.Iterable) ajq.getTasks());
                        a3.add(0, dby);
                        java.util.Map map2 = this.d;
                        defpackage.dce b4 = ajq.getStructure();
                        defpackage.dii dii2 = (defpackage.dii) b4.a(defpackage.bg.ao);
                        dii2.a((defpackage.dih) b4);
                        defpackage.dii dii3 = dii2;
                        defpackage.dcf dcf2 = (defpackage.dcf) ajq.getStructure().a.get(i2);
                        defpackage.dii dii4 = (defpackage.dii) dcf2.a(defpackage.bg.ao);
                        dii4.a((defpackage.dih) dcf2);
                        defpackage.dii dii5 = dii4;
                        defpackage.dii i3 = ((defpackage.dii) defpackage.dcf.d.a(defpackage.bg.ao)).i(dby.d);
                        dii5.b();
                        defpackage.dcf.a((defpackage.dcf) dii5.a, i, i3);
                        defpackage.dii a4 = dii3.a(i2, dii5);
                        if (a4.b) {
                            dih = a4.a;
                        } else {
                            defpackage.dih dih5 = a4.a;
                            defpackage.djz.a.a((java.lang.Object) dih5).c(dih5);
                            a4.b = true;
                            dih = a4.a;
                        }
                        defpackage.dih dih6 = dih;
                        if (!defpackage.dih.a(dih6, java.lang.Boolean.TRUE.booleanValue())) {
                            throw new defpackage.dkw();
                        }
                        map2.put(str, AbsTaskListStructure.a(a3, (defpackage.dce) dih6, ajq.getLastSyncedMs()));
                        defpackage.csp.a((java.lang.Object) dby);
                        defpackage.aju.b();
                        e();
                    }
                    i2++;
                }
            }
        }
    }

    public final synchronized void a(java.lang.String str, java.lang.String str2, int i, java.lang.String str3) {
        defpackage.dih dih;
        int i2 = 10;
        synchronized (this) {
            AbsTaskListStructure ajq = (AbsTaskListStructure) this.d.get(str);
            if (ajq != null) {
                defpackage.dce b2 = ajq.getStructure();
                defpackage.dii dii = (defpackage.dii) b2.a(defpackage.bg.ao);
                dii.a((defpackage.dih) b2);
                defpackage.dii dii2 = dii;
                defpackage.dcf a2 = a(str2, dii2);
                if (a2 != null) {
                    if (!android.text.TextUtils.isEmpty(str3)) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= dii2.h().size()) {
                                break;
                            }
                            defpackage.dcf b3 = dii2.b(i3);
                            if (b3.b.equals(str3)) {
                                defpackage.dii dii3 = (defpackage.dii) b3.a(defpackage.bg.ao);
                                dii3.a((defpackage.dih) b3);
                                defpackage.dii dii4 = dii3;
                                dii4.b();
                                defpackage.dcf dcf = (defpackage.dcf) dii4.a;
                                if (a2 == null) {
                                    throw new java.lang.NullPointerException();
                                }
                                if (!dcf.c.a()) {
                                    defpackage.diq diq = dcf.c;
                                    int size = diq.size();
                                    if (size != 0) {
                                        i2 = size << 1;
                                    }
                                    dcf.c = diq.a(i2);
                                }
                                dcf.c.add(i, a2);
                                dii2.a(i3, dii4);
                            } else {
                                i3++;
                            }
                        }
                    } else {
                        dii2.b();
                        defpackage.dce dce = (defpackage.dce) dii2.a;
                        if (a2 == null) {
                            throw new java.lang.NullPointerException();
                        }
                        if (!dce.a.a()) {
                            defpackage.diq diq2 = dce.a;
                            int size2 = diq2.size();
                            if (size2 != 0) {
                                i2 = size2 << 1;
                            }
                            dce.a = diq2.a(i2);
                        }
                        dce.a.add(i, a2);
                    }
                }
                if (a2 != null) {
                    java.util.Map map = this.d;
                    java.util.List a3 = ajq.getTasks();
                    if (dii2.b) {
                        dih = dii2.a;
                    } else {
                        defpackage.dih dih2 = dii2.a;
                        defpackage.djz.a.a((java.lang.Object) dih2).c(dih2);
                        dii2.b = true;
                        dih = dii2.a;
                    }
                    defpackage.dih dih3 = dih;
                    if (!defpackage.dih.a(dih3, java.lang.Boolean.TRUE.booleanValue())) {
                        throw new defpackage.dkw();
                    }
                    map.put(str, AbsTaskListStructure.a(a3, (defpackage.dce) dih3, ajq.getLastSyncedMs()));
                    e();
                }
            }
        }
    }

    private final void a(java.lang.String str, java.lang.String str2, defpackage.crq crq) {
        AbsTaskListStructure ajq = (AbsTaskListStructure) this.d.get(str);
        if (ajq != null) {
            int a2 = a(ajq.getTasks(), str2);
            if (a2 >= 0) {
                defpackage.dby dby = (defpackage.dby) crq.a((defpackage.dby) ajq.getTasks().get(a2));
                java.util.ArrayList a3 = defpackage.cky.a((java.lang.Iterable) ajq.getTasks());
                a3.set(a2, dby);
                this.d.put(str, AbsTaskListStructure.a(a3, ajq.getStructure(), ajq.getLastSyncedMs()));
                e();
                defpackage.csp.a((java.lang.Object) dby);
                defpackage.aju.b();
            }
        }
    }

    private static defpackage.dcf a(java.lang.String str, defpackage.dii dii) {
        defpackage.dcf dcf = null;
        for (int i = 0; i < dii.h().size() && dcf == null; i++) {
            defpackage.dcf b2 = dii.b(i);
            if (b2.b.equals(str)) {
                dii.c(i);
                dcf = b2;
            } else {
                int i2 = 0;
                while (i2 < b2.c.size() && dcf == null) {
                    defpackage.dcf dcf2 = (defpackage.dcf) b2.c.get(i2);
                    if (dcf2.b.equals(str)) {
                        defpackage.dii dii2 = (defpackage.dii) b2.a(defpackage.bg.ao);
                        dii2.a((defpackage.dih) b2);
                        dii.a(i, dii2.d(i2));
                    } else {
                        dcf2 = dcf;
                    }
                    i2++;
                    dcf = dcf2;
                }
            }
        }
        return dcf;
    }

    public final synchronized void d(java.lang.String str, java.lang.String str2) {
        boolean z;
        defpackage.dce dce;
        defpackage.dih dih;
        defpackage.dih dih2;
        AbsTaskListStructure ajq = (AbsTaskListStructure) this.d.get(str);
        if (ajq != null) {
            defpackage.dce b2 = ajq.getStructure();
            java.util.ArrayList a2 = defpackage.cky.a((java.lang.Iterable) ajq.getTasks());
            int a3 = a((java.util.List) a2, str2);
            if (a3 >= 0) {
                defpackage.aju.a((java.util.Collection) defpackage.csp.a((java.lang.Object) (defpackage.dby) a2.remove(a3)));
            }
            defpackage.diq diq = b2.a;
            int i = 0;
            boolean z2 = false;
            while (!z2 && i < diq.size()) {
                defpackage.dcf dcf = (defpackage.dcf) diq.get(i);
                if (defpackage.cru.d(str2, dcf.b)) {
                    defpackage.dce b3 = ajq.getStructure();
                    defpackage.dii dii = (defpackage.dii) b3.a(defpackage.bg.ao);
                    dii.a((defpackage.dih) b3);
                    defpackage.dii dii2 = dii;
                    dii2.c(i);
                    for (int size = dcf.c.size() - 1; size >= 0; size--) {
                        int a4 = a((java.util.List) a2, ((defpackage.dcf) dcf.c.get(size)).b);
                        if (a4 >= 0) {
                            defpackage.aju.a((java.util.Collection) defpackage.csp.a((java.lang.Object) (defpackage.dby) a2.remove(a4)));
                        }
                    }
                    if (dii2.b) {
                        dih2 = dii2.a;
                    } else {
                        defpackage.dih dih3 = dii2.a;
                        defpackage.djz.a.a((java.lang.Object) dih3).c(dih3);
                        dii2.b = true;
                        dih2 = dii2.a;
                    }
                    defpackage.dih dih4 = dih2;
                    if (!defpackage.dih.a(dih4, java.lang.Boolean.TRUE.booleanValue())) {
                        throw new defpackage.dkw();
                    }
                    z2 = true;
                    b2 = (defpackage.dce) dih4;
                } else {
                    int i2 = 0;
                    while (!z2 && i2 < dcf.c.size()) {
                        if (defpackage.cru.d(str2, ((defpackage.dcf) dcf.c.get(i2)).b)) {
                            defpackage.dce b4 = ajq.getStructure();
                            defpackage.dii dii3 = (defpackage.dii) b4.a(defpackage.bg.ao);
                            dii3.a((defpackage.dih) b4);
                            defpackage.dii dii4 = dii3;
                            defpackage.dii dii5 = (defpackage.dii) dcf.a(defpackage.bg.ao);
                            dii5.a((defpackage.dih) dcf);
                            dii4.a(i, dii5.d(i2));
                            if (dii4.b) {
                                dih = dii4.a;
                            } else {
                                defpackage.dih dih5 = dii4.a;
                                defpackage.djz.a.a((java.lang.Object) dih5).c(dih5);
                                dii4.b = true;
                                dih = dii4.a;
                            }
                            defpackage.dih dih6 = dih;
                            if (!defpackage.dih.a(dih6, java.lang.Boolean.TRUE.booleanValue())) {
                                throw new defpackage.dkw();
                            }
                            dce = (defpackage.dce) dih6;
                            z = true;
                        } else {
                            z = z2;
                            dce = b2;
                        }
                        i2++;
                        b2 = dce;
                        z2 = z;
                    }
                }
                i++;
            }
            this.d.put(str, AbsTaskListStructure.a(a2, b2, ajq.getLastSyncedMs()));
            e();
        }
    }

    public final synchronized void c(java.lang.String str) {
        defpackage.dca dca;
        AbsTaskListStructure ajq = (AbsTaskListStructure) this.d.get(str);
        if (ajq != null) {
            defpackage.dce b2 = ajq.getStructure();
            java.util.List<defpackage.dby> a2 = ajq.getTasks();
            java.util.ArrayList b3 = defpackage.cky.b(a2.size());
            for (defpackage.dby dby : a2) {
                if (dby.e == null) {
                    dca = defpackage.dca.g;
                } else {
                    dca = dby.e;
                }
                if (!dca.a) {
                    b3.add(dby);
                }
            }
            this.d.put(str, AbsTaskListStructure.a(b3, b2, ajq.getLastSyncedMs()));
            e();
        }
    }

    public final synchronized void a(defpackage.dcb dcb) {
        if (e(dcb.b) < 0) {
            this.b.add(dcb);
            e();
        }
    }

    public final synchronized void e(java.lang.String str, java.lang.String str2) {
        defpackage.dcd dcd;
        defpackage.dih dih;
        int e2 = e(str);
        if (e2 >= 0) {
            defpackage.dcb dcb = (defpackage.dcb) this.b.get(e2);
            defpackage.dii dii = (defpackage.dii) dcb.a(defpackage.bg.ao);
            dii.a((defpackage.dih) dcb);
            defpackage.dii dii2 = dii;
            defpackage.dcb dcb2 = (defpackage.dcb) dii2.a;
            if (dcb2.c == null) {
                dcd = defpackage.dcd.c;
            } else {
                dcd = dcb2.c;
            }
            defpackage.dii dii3 = (defpackage.dii) dcd.a(defpackage.bg.ao);
            dii3.a((defpackage.dih) dcd);
            dii2.i(dii3.h(str2));
            java.util.List list = this.b;
            if (dii2.b) {
                dih = dii2.a;
            } else {
                defpackage.dih dih2 = dii2.a;
                defpackage.djz.a.a((java.lang.Object) dih2).c(dih2);
                dii2.b = true;
                dih = dii2.a;
            }
            defpackage.dih dih3 = dih;
            if (!defpackage.dih.a(dih3, java.lang.Boolean.TRUE.booleanValue())) {
                throw new defpackage.dkw();
            }
            list.set(e2, (defpackage.dcb) dih3);
            e();
        }
    }

    public final synchronized void d(java.lang.String str) {
        AbsTaskListStructure ajq = (AbsTaskListStructure) this.d.remove(str);
        int e2 = e(str);
        if (e2 >= 0) {
            this.b.remove(e2);
            e();
        }
        if (ajq != null) {
            defpackage.aju.a((java.util.Collection) ajq.getTasks());
        }
    }

    public final synchronized void a(defpackage.amn amn) {
        this.e.add(amn);
        e();
    }

    public final synchronized void b(defpackage.amn amn) {
        if (this.e.remove(amn)) {
            e();
        }
    }

    public final synchronized java.util.List b() {
        return java.util.Collections.unmodifiableList(this.e);
    }

    public final synchronized void c() {
        h();
        this.f = false;
        this.c.deleteFile(f());
    }

    private final synchronized void e() {
        if (!this.f) {
            this.f = true;
            this.g.schedule(new defpackage.alz(this), 50, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void d() {
        java.io.FileOutputStream openFileOutput;
        if (this.f) {
            try {
                openFileOutput = this.c.openFileOutput(f(), 0);
                java.io.ObjectOutputStream objectOutputStream = new java.io.ObjectOutputStream(openFileOutput);
                objectOutputStream.writeObject(b(this.b));
                java.util.Map map = this.d;
                java.util.HashMap hashMap = new java.util.HashMap();
                for (java.util.Map.Entry entry : map.entrySet()) {
                    java.lang.String str = (java.lang.String) entry.getKey();
                    java.util.List b2 = b(((AbsTaskListStructure) entry.getValue()).getTasks());
                    byte[] a2 = defpackage.bdk.a((defpackage.dih) ((AbsTaskListStructure) entry.getValue()).getStructure());
                    long c2 = ((AbsTaskListStructure) entry.getValue()).getLastSyncedMs();
                    defpackage.ama ama = new defpackage.ama();
                    ama.a = b2;
                    ama.b = a2;
                    ama.c = c2;
                    hashMap.put(str, ama);
                }
                objectOutputStream.writeObject(hashMap);
                objectOutputStream.writeObject(this.e);
                objectOutputStream.flush();
                openFileOutput.close();
            } catch (java.io.IOException e2) {
                defpackage.azb.a("Cannot save database", (java.lang.Throwable) e2, new java.lang.String[0]);
            } catch (Throwable th) {
                openFileOutput.close();
                throw th;
            }
            this.f = false;
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<dih>, for r3v0, types: [java.util.List, java.util.List<dih>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List b(java.util.List<defpackage.dih> r3) {
        /*
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r3.iterator()
        L_0x0009:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001d
            java.lang.Object r0 = r2.next()
            dih r0 = (defpackage.dih) r0
            byte[] r0 = defpackage.bdk.a(r0)
            r1.add(r0)
            goto L_0x0009
        L_0x001d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alv.b(java.util.List):java.util.List");
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<byte[]>, for r3v0, types: [java.util.List, java.util.List<byte[]>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List a(java.util.List<byte[]> r3, defpackage.dih r4) {
        /*
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r3.iterator()
        L_0x0009:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001d
            java.lang.Object r0 = r2.next()
            byte[] r0 = (byte[]) r0
            dih r0 = defpackage.bdk.a(r0, r4)
            r1.add(r0)
            goto L_0x0009
        L_0x001d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alv.a(java.util.List, dih):java.util.List");
    }

    private final java.lang.String f() {
        java.lang.String str = "database_";
        java.lang.String valueOf = java.lang.String.valueOf(defpackage.azb.a(this.a));
        return valueOf.length() != 0 ? str.concat(valueOf) : new java.lang.String(str);
    }

    private final synchronized void g() {
        try {
            java.io.FileInputStream openFileInput = this.c.openFileInput(f());
            try {
                java.io.ObjectInputStream objectInputStream = new java.io.ObjectInputStream(openFileInput);
                this.b = a((java.util.List) objectInputStream.readObject(), (defpackage.dih) defpackage.dcb.g);
                java.util.Map map = (java.util.Map) objectInputStream.readObject();
                java.util.HashMap hashMap = new java.util.HashMap();
                for (java.util.Map.Entry entry : map.entrySet()) {
                    java.lang.String str = (java.lang.String) entry.getKey();
                    defpackage.ama ama = (defpackage.ama) entry.getValue();
                    hashMap.put(str, AbsTaskListStructure.a(a(ama.a, (defpackage.dih) defpackage.dby.g), (defpackage.dce) defpackage.bdk.a(ama.b, (defpackage.dih) defpackage.dce.b), ama.c));
                }
                this.d = hashMap;
                this.e = (java.util.List) objectInputStream.readObject();
                java.lang.String str2 = "Database opened: ";
                java.lang.String valueOf = java.lang.String.valueOf(defpackage.azb.a(this.a));
                if (valueOf.length() != 0) {
                    str2.concat(valueOf);
                } else {
                    new java.lang.String(str2);
                }
            } catch (java.lang.ClassCastException | java.lang.ClassNotFoundException e2) {
                defpackage.azb.a("Incompatible database; will continue as new: %s", e2, defpackage.azb.a(this.a));
                h();
            } finally {
                openFileInput.close();
            }
        } catch (java.io.FileNotFoundException e3) {
            java.lang.Object[] objArr = {e3, defpackage.azb.a(this.a), e3};
        } catch (java.io.IOException e4) {
            defpackage.azb.a("Cannot open database: %s", (java.lang.Throwable) e4, defpackage.azb.a(this.a));
        }
        if (this.b == null) {
            this.b = new java.util.ArrayList();
        }
        return;
    }

    private final void h() {
        this.b = new java.util.ArrayList();
        this.d = new java.util.HashMap();
        this.e = new java.util.ArrayList();
    }

    private static int a(java.util.List list, java.lang.String str) {
        if (list == null) {
            return -1;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                return -1;
            }
            if (defpackage.cru.d(str, ((defpackage.dby) list.get(i2)).d)) {
                return i2;
            }
            i = i2 + 1;
        }
    }

    private final int e(java.lang.String str) {
        if (this.b == null) {
            return -1;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.b.size()) {
                return -1;
            }
            if (defpackage.cru.d(str, ((defpackage.dcb) this.b.get(i2)).b)) {
                return i2;
            }
            i = i2 + 1;
        }
    }
}
