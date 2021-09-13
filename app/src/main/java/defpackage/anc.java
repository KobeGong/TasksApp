package defpackage;

/* renamed from: anc reason: default package */
/* compiled from: PG */
public final class anc {
    public defpackage.anu a;
    public final java.util.concurrent.Executor b;
    private final android.content.Context c;
    private final defpackage.aiz d;
    private final java.util.concurrent.Executor e;
    private final defpackage.amg f = new defpackage.amg();
    private final java.util.Map g = new java.util.HashMap();
    private final defpackage.aoa h;

    public anc(android.accounts.Account account, android.content.Context context, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.aoa aoa) {
        this.c = context.getApplicationContext();
        this.d = new defpackage.aiz(this.c);
        this.b = executor;
        this.e = executor2;
        this.h = aoa;
        a(account, scheduledExecutorService);
    }

    public final boolean a() {
        defpackage.alv alv = this.a.a;
        return alv.b == null || alv.b.isEmpty();
    }

    public final synchronized java.lang.String b() {
        return this.a.a.a;
    }

    public final synchronized defpackage.cyi c() {
        return a("sync_lists", new and(this));
    }

    public final synchronized defpackage.cyi a(java.lang.String str) {
        java.lang.String valueOf;
        java.lang.String valueOf2;
        valueOf = "sync_list_tasks:";
        valueOf2 = java.lang.String.valueOf(str);
        return a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : valueOf, new ane(this, str));
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void b(java.lang.String str) {
        defpackage.cyu cyu = new defpackage.cyu();
        a(this.a, cyu);
        cyu.a(new defpackage.ann(this, str), this.b);
    }

    public final synchronized java.util.List d() {
        return this.a.a.a();
    }

    public final synchronized defpackage.dcb c(java.lang.String str) {
        return this.a.a.a(str);
    }

    public final synchronized AbsTaskListStructure d(java.lang.String str) {
        AbsTaskListStructure b2;
        b2 = this.a.a.b(str);
        if (b2 == null) {
            b2 = AbsTaskListStructure.d();
        }
        return b2;
    }

    public final synchronized java.util.Map a(long j) {
        java.util.HashMap hashMap;
        defpackage.dca dca;
        defpackage.dmk dmk;
        java.util.Calendar instance = java.util.Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        long timeInMillis = instance.getTimeInMillis() + j;
        hashMap = new java.util.HashMap();
        for (defpackage.dcb dcb : d()) {
            java.lang.String str = dcb.b;
            new java.lang.Object[1][0] = str;
            for (defpackage.dby dby : d(str).getTasks()) {
                if (!(dby.e != null)) {
                    defpackage.azb.a("Task %s has no properties!", dby.d);
                } else {
                    if (dby.e == null) {
                        dca = defpackage.dca.g;
                    } else {
                        dca = dby.e;
                    }
                    if (!dca.a) {
                        if (dca.d != null) {
                            if (dca.d == null) {
                                dmk = defpackage.dmk.d;
                            } else {
                                dmk = dca.d;
                            }
                            long a2 = defpackage.ajd.a(dmk);
                            if (j == 0) {
                                if (a2 < instance.getTimeInMillis()) {
                                    hashMap.put(dby, str);
                                }
                            } else if (j > 0) {
                                if (a2 < timeInMillis && a2 >= instance.getTimeInMillis()) {
                                    hashMap.put(dby, str);
                                }
                            } else if (j < 0 && a2 >= timeInMillis && a2 < instance.getTimeInMillis()) {
                                hashMap.put(dby, str);
                            }
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    public final synchronized defpackage.dby a(java.lang.String str, java.lang.String str2) {
        return this.a.a.a(str, str2);
    }

    public final synchronized boolean b(java.lang.String str, java.lang.String str2) {
        return this.a.a.b(str, str2);
    }

    public final synchronized java.util.List c(java.lang.String str, java.lang.String str2) {
        return this.a.a.c(str, str2);
    }

    public final synchronized void a(java.lang.String str, java.lang.String str2, boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str2);
        if (z) {
            AbsTaskListStructure b2 = this.a.a.b(str);
            if (b2 != null) {
                java.util.Iterator it = b2.getStructure().a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        defpackage.dcf dcf = (defpackage.dcf) it.next();
                        if (dcf.b.equals(str2)) {
                            for (defpackage.dcf dcf2 : dcf.c) {
                                arrayList.add(dcf2.b);
                            }
                        }
                    }
                }
            }
        }
        a(new amz(str, z, (String[]) arrayList.toArray(new String[0])), null);
    }

    public final synchronized void a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        a(new ana(str, str2, str3), null);
    }

    public final synchronized void b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        a(new amv(str, str2, str3), null);
    }

    public final synchronized void a(java.lang.String str, java.lang.String str2, defpackage.dmk dmk) {
        a(new amw(str, str2, dmk, amx.UPDATE), null);
    }

    public final synchronized void b(java.lang.String str, java.lang.String str2, defpackage.dmk dmk) {
        a(new amw(str, str2, dmk, amx.SNOOZE), null);
    }

    public final synchronized java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        java.lang.String a2;
        defpackage.dcb a3 = this.a.a.a(str3);
        a2 = this.f.a(a3);
        java.util.HashMap hashMap = new java.util.HashMap();
        AbsTaskListStructure b2 = this.a.a.b(str);
        if (b2 != null) {
            java.util.Iterator it = b2.getStructure().a.iterator();
            while (true) {
                if (it.hasNext()) {
                    defpackage.dcf dcf = (defpackage.dcf) it.next();
                    if (dcf.b.equals(str2)) {
                        for (defpackage.dcf dcf2 : dcf.c) {
                            hashMap.put(dcf2.b, this.f.a(a3));
                        }
                    }
                }
            }
        }
        a(new amu(str, str2, str3, a2, hashMap, z), null);
        return a2;
    }

    public final synchronized defpackage.dby a(java.lang.String str, defpackage.dby dby, int i, java.lang.String str2) {
        defpackage.dih dih;
        defpackage.dby dby2;
        defpackage.dcb a2 = this.a.a.a(str);
        defpackage.dii dii = (defpackage.dii) dby.a(defpackage.bg.ao);
        dii.a(dby);
        defpackage.dii e2 = dii.e(this.f.a(a2));
        if (e2.b) {
            dih = e2.a;
        } else {
            defpackage.dih dih2 = e2.a;
            defpackage.djz.a.a(dih2).c(dih2);
            e2.b = true;
            dih = e2.a;
        }
        defpackage.dih dih3 = dih;
        if (!defpackage.dih.a(dih3, java.lang.Boolean.TRUE.booleanValue())) {
            throw new defpackage.dkw();
        }
        dby2 = (defpackage.dby) dih3;
        a(new amo(str, dby2, i, str2), null);
        return dby2;
    }

    public final synchronized void a(java.lang.String str, java.lang.String str2, int i, java.lang.String str3) {
        a(new amt(str, str2, i, str3), null);
    }

    public final synchronized void a(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        a(new amr(str, str2), obj);
    }

    public final synchronized void e(java.lang.String str) {
        a(new amq(str), null);
    }

    public final synchronized defpackage.dcb a(defpackage.dcb dcb) {
        java.lang.String a2;
        defpackage.dih dih;
        defpackage.dcb dcb2;
        defpackage.dcb dcb3 = (defpackage.dcb) this.a.a.a().get(0);
        defpackage.dii dii = (defpackage.dii) dcb.a(defpackage.bg.ao);
        dii.a(dcb);
        defpackage.dii dii2 = dii;
        defpackage.amg amg = this.f;
        java.lang.String str = dcb3.e;
        if (!android.text.TextUtils.isEmpty(str)) {
            java.lang.String substring = str.substring(0, str.indexOf(58));
            java.lang.String b2 = amg.b();
            a2 = substring + ":" + b2 + ":0";
        } else {
            a2 = amg.a();
        }
        dii2.b();
        defpackage.dcb dcb4 = (defpackage.dcb) dii2.a;
        if (a2 == null) {
            throw new java.lang.NullPointerException();
        }
        dcb4.b = a2;
        if (dii2.b) {
            dih = dii2.a;
        } else {
            defpackage.dih dih2 = dii2.a;
            defpackage.djz.a.a(dih2).c(dih2);
            dii2.b = true;
            dih = dii2.a;
        }
        defpackage.dih dih3 = dih;
        if (!defpackage.dih.a(dih3, java.lang.Boolean.TRUE.booleanValue())) {
            throw new defpackage.dkw();
        }
        dcb2 = (defpackage.dcb) dih3;
        a(new amp(dcb2), null);
        return dcb2;
    }

    public final synchronized void d(java.lang.String str, java.lang.String str2) {
        a(new amy(str, str2), null);
    }

    public final synchronized void a(java.lang.String str, int i, java.lang.Object obj) {
        a(new ams(str, i == 0), obj);
    }

    public final synchronized void f(java.lang.String str) {
        this.g.clear();
        a("flatten_list", this.a, new defpackage.anp(str), defpackage.bg.D, null);
    }

    public final synchronized defpackage.cyi e(java.lang.String str, java.lang.String str2) {
        return a("setup_account", this.a, new defpackage.anq(str, str2), defpackage.bg.D, null);
    }

    public final synchronized defpackage.cyi a(int i) {
        return a("check_version", this.a, new defpackage.anr(i), defpackage.bg.D, null);
    }

    private final synchronized void a(android.accounts.Account account, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        defpackage.alv alv = new defpackage.alv(account.name, this.c, scheduledExecutorService);
        defpackage.aiz aiz = this.d;
        defpackage.ajb a2 = defpackage.ajb.a(this.c);
        defpackage.aka.a().b();
        defpackage.amb amb = new defpackage.amb(aiz, a2, defpackage.akf.a());
        amb.c = account;
        defpackage.amj amj = new defpackage.amj(defpackage.aiq.get().b(account.name), this.e, this.c);
        amj.a();
        defpackage.anu anu = new defpackage.anu(alv, amb, amj);
        java.util.ArrayList a3 = defpackage.cky.a(anu.a.b());
        int size = a3.size();
        int i = 0;
        while (i < size) {
            java.lang.Object obj = a3.get(i);
            i++;
            a(anu, (defpackage.amn) obj);
        }
        this.a = anu;
    }

    private final void a(defpackage.amn amn, java.lang.Object obj) {
        amn.b(this.a.a);
        this.a.a.a(amn);
        if (!defpackage.aln.a().a() || !amn.a()) {
            this.h.b(b());
            a(this.a, amn);
            return;
        }
        this.h.a(b(), new defpackage.aod(this, amn, obj));
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.anu anu, defpackage.cyu cyu) {
        defpackage.cyi a2 = a("sync_lists", anu, new defpackage.anf(this), defpackage.bg.D, null);
        a2.a(new defpackage.ang(this, a2, anu, cyu), this.b);
    }

    /* access modifiers changed from: 0000 */
    public final void a(java.lang.String str, defpackage.anu anu, defpackage.cyu cyu) {
        defpackage.cyi a2 = a("sync_list_tasks", anu, new defpackage.anh(this, str), defpackage.bg.D, null);
        a2.a(new defpackage.ani(this, a2, anu, cyu, str), this.b);
    }

    static defpackage.anw a(defpackage.anu anu) {
        defpackage.anw anw;
        java.util.List<dcb> a2 = anu.b.a();
        synchronized (anu.a) {
            if (!anu.a.b().isEmpty()) {
                anw = defpackage.anw.LOCAL_CHANGES;
            } else if (a2.isEmpty() || a2.equals(anu.a.a())) {
                anw = defpackage.anw.NO_CHANGES;
            } else {
                anu.a.a(a2);
                anw = defpackage.anw.SERVER_CHANGES;
            }
        }
        return anw;
    }

    static defpackage.anw a(java.lang.String str, defpackage.anu anu) {
        defpackage.anw anw;
        AbsTaskListStructure a2 = anu.b.a(str);
        synchronized (anu.a) {
            if (!anu.a.b().isEmpty()) {
                anw = defpackage.anw.LOCAL_CHANGES;
            } else {
                AbsTaskListStructure b2 = anu.a.b(str);
                if (b2 == null || !defpackage.csv.a(b2.getTasks()).equals(defpackage.csv.a(a2.getTasks())) || !b2.getStructure().equals(a2.getStructure())) {
                    anu.a.a(str, a2);
                    anw = defpackage.anw.SERVER_CHANGES;
                } else {
                    anw = defpackage.anw.NO_CHANGES;
                }
            }
        }
        return anw;
    }

    static java.lang.Void b(defpackage.anu anu) {
        java.util.List<defpackage.dcb> a2 = anu.b.a();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        java.util.concurrent.ExecutorService newFixedThreadPool = java.util.concurrent.Executors.newFixedThreadPool(java.lang.Math.min(5, java.lang.Math.max(1, a2.size())));
        for (defpackage.dcb anj : a2) {
            newFixedThreadPool.execute(new defpackage.anj(concurrentHashMap, anj, anu));
        }
        newFixedThreadPool.shutdown();
        try {
            newFixedThreadPool.awaitTermination(10, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.lang.InterruptedException e2) {
        }
        synchronized (anu.a) {
            if (!a2.isEmpty()) {
                anu.a.a(a2);
            }
            for (defpackage.dcb dcb : a2) {
                AbsTaskListStructure ajq = (AbsTaskListStructure) concurrentHashMap.remove(dcb.b);
                if (ajq != null) {
                    anu.a.a(dcb.b, ajq);
                }
            }
            for (defpackage.amn b2 : anu.a.b()) {
                b2.b(anu.a);
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.anu anu, defpackage.amn amn) {
        this.g.clear();
        a(amn.toString(), anu, new defpackage.ank(amn, anu), defpackage.bg.E, new defpackage.anl(anu, amn));
    }

    static defpackage.cyi a(java.lang.String str, defpackage.anu anu, defpackage.anx anx, int i, java.lang.Runnable runnable) {
        defpackage.cyi a2 = anu.c.a(new defpackage.anm(str, anx, anu), i, runnable);
        new java.lang.Object[1][0] = str;
        return a2;
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.cyi a(java.lang.String str, defpackage.csd csd) {
        defpackage.anv anv = (defpackage.anv) this.g.get(str);
        if (anv != null) {
            if (!anv.a.isDone() || (!a(anv.a) && anv.b + 5000 >= java.lang.System.currentTimeMillis())) {
                return anv.a;
            }
            this.g.remove(str);
        }
        defpackage.cyi cyi = (defpackage.cyi) csd.b();
        this.g.put(str, new defpackage.anv(cyi));
        return cyi;
    }

    private static boolean a(java.util.concurrent.Future future) {
        try {
            future.get();
            return false;
        } catch (java.lang.InterruptedException | java.util.concurrent.CancellationException | java.util.concurrent.ExecutionException e2) {
            return true;
        }
    }

    static final /* synthetic */ java.lang.Object a(java.lang.String str, defpackage.anx anx, defpackage.anu anu) {
        new java.lang.Object[1][0] = str;
        try {
            java.lang.Object a2 = anx.a(anu);
            new java.lang.Object[1][0] = str;
            return a2;
        } catch (java.lang.Exception e2) {
            new java.lang.Object[1][0] = str;
            throw new java.lang.RuntimeException(e2);
        }
    }

    static final /* synthetic */ java.lang.Void a(java.lang.String str, java.lang.String str2, defpackage.anu anu) {
        defpackage.dih dih;
        try {
            defpackage.amb amb = anu.b;
            defpackage.ead b2 = amb.b();
            defpackage.dii dii = (defpackage.dii) defpackage.dbv.b.a(defpackage.bg.ao);
            defpackage.dii dii2 = (defpackage.dii) defpackage.dbw.c.a(defpackage.bg.ao);
            dii2.b();
            defpackage.dbw dbw = (defpackage.dbw) dii2.a;
            if (str == null) {
                throw new java.lang.NullPointerException();
            }
            dbw.b = str;
            dii2.b();
            defpackage.dbw dbw2 = (defpackage.dbw) dii2.a;
            if (str2 == null) {
                throw new java.lang.NullPointerException();
            }
            dbw2.a = str2;
            dii.b();
            defpackage.dbv.a((defpackage.dbv) dii.a, dii2);
            if (dii.b) {
                dih = dii.a;
            } else {
                defpackage.dih dih2 = dii.a;
                defpackage.djz.a.a(dih2).c(dih2);
                dii.b = true;
                dih = dii.a;
            }
            defpackage.dih dih3 = dih;
            if (!defpackage.dih.a(dih3, java.lang.Boolean.TRUE.booleanValue())) {
                throw new defpackage.dkw();
            }
            defpackage.dbv dbv = (defpackage.dbv) dih3;
            b2.getClass();
            amb.a(dbv, new defpackage.amc(b2));
            return null;
        } catch (defpackage.dqb e2) {
            if (!defpackage.ajd.b(e2)) {
                throw e2;
            }
        }
    }
}
