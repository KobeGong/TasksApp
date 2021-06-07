package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: anc  reason: default package */
/* compiled from: PG */
public final class anc {
    public anu a;
    public final Executor b;
    private final Context c;
    private final aiz d;
    private final Executor e;
    private final amg f = new amg();
    private final Map g = new HashMap();
    private final aoa h;

    public anc(Account account, Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, aoa aoa) {
        this.c = context.getApplicationContext();
        this.d = new aiz(this.c);
        this.b = executor;
        this.e = executor2;
        this.h = aoa;
        a(account, scheduledExecutorService);
    }

    public final boolean a() {
        alv alv = this.a.a;
        return alv.b == null || alv.b.isEmpty();
    }

    public final synchronized String b() {
        return this.a.a.a;
    }

    public final synchronized cyi c() {
        return a("sync_lists", new and(this));
    }

    public final synchronized cyi a(String str) {
        String valueOf;
        String valueOf2;
        valueOf = String.valueOf("sync_list_tasks:");
        valueOf2 = String.valueOf(str);
        return a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), new ane(this, str));
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b(String str) {
        cyu cyu = new cyu();
        a(this.a, cyu);
        cyu.a(new ann(this, str), this.b);
    }

    public final synchronized List d() {
        return this.a.a.a();
    }

    public final synchronized dcb c(String str) {
        return this.a.a.a(str);
    }

    public final synchronized ajq d(String str) {
        ajq b2;
        b2 = this.a.a.b(str);
        if (b2 == null) {
            b2 = ajq.d();
        }
        return b2;
    }

    public final synchronized Map a(long j) {
        HashMap hashMap;
        dca dca;
        dmk dmk;
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        long timeInMillis = instance.getTimeInMillis() + j;
        hashMap = new HashMap();
        for (dcb dcb : d()) {
            String str = dcb.b;
            new Object[1][0] = str;
            for (dby dby : d(str).a()) {
                if (!(dby.e != null)) {
                    azb.a("Task %s has no properties!", dby.d);
                } else {
                    if (dby.e == null) {
                        dca = dca.g;
                    } else {
                        dca = dby.e;
                    }
                    if (!dca.a) {
                        if (dca.d != null) {
                            if (dca.d == null) {
                                dmk = dmk.d;
                            } else {
                                dmk = dca.d;
                            }
                            long a2 = ajd.a(dmk);
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

    public final synchronized dby a(String str, String str2) {
        return this.a.a.a(str, str2);
    }

    public final synchronized boolean b(String str, String str2) {
        return this.a.a.b(str, str2);
    }

    public final synchronized List c(String str, String str2) {
        return this.a.a.c(str, str2);
    }

    public final synchronized void a(String str, String str2, boolean z) {
        ajq b2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        if (z && (b2 = this.a.a.b(str)) != null) {
            Iterator it = b2.b().a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                dcf dcf = (dcf) it.next();
                if (dcf.b.equals(str2)) {
                    for (dcf dcf2 : dcf.c) {
                        arrayList.add(dcf2.b);
                    }
                }
            }
        }
        a(new amz(str, z, (String[]) arrayList.toArray(new String[0])), (Object) null);
    }

    public final synchronized void a(String str, String str2, String str3) {
        a(new ana(str, str2, str3), (Object) null);
    }

    public final synchronized void b(String str, String str2, String str3) {
        a(new amv(str, str2, str3), (Object) null);
    }

    public final synchronized void a(String str, String str2, dmk dmk) {
        a(new amw(str, str2, dmk, amx.UPDATE), (Object) null);
    }

    public final synchronized void b(String str, String str2, dmk dmk) {
        a(new amw(str, str2, dmk, amx.SNOOZE), (Object) null);
    }

    public final synchronized String a(String str, String str2, String str3, boolean z) {
        String a2;
        dcb a3 = this.a.a.a(str3);
        a2 = this.f.a(a3);
        HashMap hashMap = new HashMap();
        ajq b2 = this.a.a.b(str);
        if (b2 != null) {
            Iterator it = b2.b().a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                dcf dcf = (dcf) it.next();
                if (dcf.b.equals(str2)) {
                    for (dcf dcf2 : dcf.c) {
                        hashMap.put(dcf2.b, this.f.a(a3));
                    }
                }
            }
        }
        a(new amu(str, str2, str3, a2, hashMap, z), (Object) null);
        return a2;
    }

    public final synchronized dby a(String str, dby dby, int i, String str2) {
        dih dih;
        dby dby2;
        dcb a2 = this.a.a.a(str);
        dii dii = (dii) dby.a(bg.ao);
        dii.a((dih) dby);
        dii e2 = dii.e(this.f.a(a2));
        if (e2.b) {
            dih = e2.a;
        } else {
            dih dih2 = e2.a;
            djz.a.a(dih2).c(dih2);
            e2.b = true;
            dih = e2.a;
        }
        dih dih3 = dih;
        if (!dih.a(dih3, Boolean.TRUE.booleanValue())) {
            throw new dkw();
        }
        dby2 = (dby) dih3;
        a(new amo(str, dby2, i, str2), (Object) null);
        return dby2;
    }

    public final synchronized void a(String str, String str2, int i, String str3) {
        a(new amt(str, str2, i, str3), (Object) null);
    }

    public final synchronized void a(String str, String str2, Object obj) {
        a(new amr(str, str2), obj);
    }

    public final synchronized void e(String str) {
        a(new amq(str), (Object) null);
    }

    public final synchronized dcb a(dcb dcb) {
        String a2;
        dih dih;
        dcb dcb2;
        dii dii = (dii) dcb.a(bg.ao);
        dii.a((dih) dcb);
        dii dii2 = dii;
        amg amg = this.f;
        String str = ((dcb) this.a.a.a().get(0)).e;
        if (!TextUtils.isEmpty(str)) {
            String substring = str.substring(0, str.indexOf(58));
            String b2 = amg.b();
            a2 = new StringBuilder(String.valueOf(substring).length() + 3 + String.valueOf(b2).length()).append(substring).append(":").append(b2).append(":0").toString();
        } else {
            a2 = amg.a();
        }
        dii2.b();
        dcb dcb3 = (dcb) dii2.a;
        if (a2 == null) {
            throw new NullPointerException();
        }
        dcb3.b = a2;
        if (dii2.b) {
            dih = dii2.a;
        } else {
            dih dih2 = dii2.a;
            djz.a.a(dih2).c(dih2);
            dii2.b = true;
            dih = dii2.a;
        }
        dih dih3 = dih;
        if (!dih.a(dih3, Boolean.TRUE.booleanValue())) {
            throw new dkw();
        }
        dcb2 = (dcb) dih3;
        a(new amp(dcb2), (Object) null);
        return dcb2;
    }

    public final synchronized void d(String str, String str2) {
        a(new amy(str, str2), (Object) null);
    }

    public final synchronized void a(String str, int i, Object obj) {
        a(new ams(str, i == 0), obj);
    }

    public final synchronized void f(String str) {
        this.g.clear();
        a("flatten_list", this.a, new anp(str), bg.D, null);
    }

    public final synchronized cyi e(String str, String str2) {
        return a("setup_account", this.a, new anq(str, str2), bg.D, null);
    }

    public final synchronized cyi a(int i) {
        return a("check_version", this.a, new anr(i), bg.D, null);
    }

    private final synchronized void a(Account account, ScheduledExecutorService scheduledExecutorService) {
        alv alv = new alv(account.name, this.c, scheduledExecutorService);
        aiz aiz = this.d;
        ajb a2 = ajb.a(this.c);
        aka.a().b();
        amb amb = new amb(aiz, a2, akf.a());
        amb.c = account;
        amj amj = new amj(aiq.a().b(account.name), this.e, this.c);
        amj.a();
        anu anu = new anu(alv, amb, amj);
        ArrayList a3 = cky.a((Iterable) anu.a.b());
        int size = a3.size();
        int i = 0;
        while (i < size) {
            Object obj = a3.get(i);
            i++;
            a(anu, (amn) obj);
        }
        this.a = anu;
    }

    private final void a(amn amn, Object obj) {
        amn.b(this.a.a);
        this.a.a.a(amn);
        if (!aln.a().a() || !amn.a()) {
            this.h.b(b());
            a(this.a, amn);
            return;
        }
        this.h.a(b(), new aod(this, amn, obj));
    }

    /* access modifiers changed from: package-private */
    public final void a(anu anu, cyu cyu) {
        cyi a2 = a("sync_lists", anu, new anf(this), bg.D, null);
        a2.a(new ang(this, a2, anu, cyu), this.b);
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, anu anu, cyu cyu) {
        cyi a2 = a("sync_list_tasks", anu, new anh(this, str), bg.D, null);
        a2.a(new ani(this, a2, anu, cyu, str), this.b);
    }

    static anw a(anu anu) {
        anw anw;
        List a2 = anu.b.a();
        synchronized (anu.a) {
            if (!anu.a.b().isEmpty()) {
                anw = anw.LOCAL_CHANGES;
            } else if (a2.isEmpty() || a2.equals(anu.a.a())) {
                anw = anw.NO_CHANGES;
            } else {
                anu.a.a(a2);
                anw = anw.SERVER_CHANGES;
            }
        }
        return anw;
    }

    static anw a(String str, anu anu) {
        anw anw;
        ajq a2 = anu.b.a(str);
        synchronized (anu.a) {
            if (!anu.a.b().isEmpty()) {
                anw = anw.LOCAL_CHANGES;
            } else {
                ajq b2 = anu.a.b(str);
                if (b2 == null || !csv.a(b2.a()).equals(csv.a(a2.a())) || !b2.b().equals(a2.b())) {
                    anu.a.a(str, a2);
                    anw = anw.SERVER_CHANGES;
                } else {
                    anw = anw.NO_CHANGES;
                }
            }
        }
        return anw;
    }

    static Void b(anu anu) {
        List<dcb> a2 = anu.b.a();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.min(5, Math.max(1, a2.size())));
        for (dcb dcb : a2) {
            newFixedThreadPool.execute(new anj(concurrentHashMap, dcb, anu));
        }
        newFixedThreadPool.shutdown();
        try {
            newFixedThreadPool.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
        }
        synchronized (anu.a) {
            if (!a2.isEmpty()) {
                anu.a.a(a2);
            }
            for (dcb dcb2 : a2) {
                ajq ajq = (ajq) concurrentHashMap.remove(dcb2.b);
                if (ajq != null) {
                    anu.a.a(dcb2.b, ajq);
                }
            }
            for (amn amn : anu.a.b()) {
                amn.b(anu.a);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void a(anu anu, amn amn) {
        this.g.clear();
        a(amn.toString(), anu, new ank(amn, anu), bg.E, new anl(anu, amn));
    }

    static cyi a(String str, anu anu, anx anx, int i, Runnable runnable) {
        cyi a2 = anu.c.a(new anm(str, anx, anu), i, runnable);
        new Object[1][0] = str;
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final cyi a(String str, csd csd) {
        anv anv = (anv) this.g.get(str);
        if (anv != null) {
            if (!anv.a.isDone() || (!a(anv.a) && anv.b + 5000 >= System.currentTimeMillis())) {
                return anv.a;
            }
            this.g.remove(str);
        }
        cyi cyi = (cyi) csd.b();
        this.g.put(str, new anv(cyi));
        return cyi;
    }

    private static boolean a(Future future) {
        try {
            future.get();
            return false;
        } catch (InterruptedException | CancellationException | ExecutionException e2) {
            return true;
        }
    }

    static final /* synthetic */ Object a(String str, anx anx, anu anu) {
        new Object[1][0] = str;
        try {
            Object a2 = anx.a(anu);
            new Object[1][0] = str;
            return a2;
        } catch (Exception e2) {
            new Object[1][0] = str;
            throw new RuntimeException(e2);
        }
    }

    static final /* synthetic */ Void a(String str, String str2, anu anu) {
        dih dih;
        try {
            amb amb = anu.b;
            ead b2 = amb.b();
            dii dii = (dii) dbv.b.a(bg.ao);
            dii dii2 = (dii) dbw.c.a(bg.ao);
            dii2.b();
            dbw dbw = (dbw) dii2.a;
            if (str == null) {
                throw new NullPointerException();
            }
            dbw.b = str;
            dii2.b();
            dbw dbw2 = (dbw) dii2.a;
            if (str2 == null) {
                throw new NullPointerException();
            }
            dbw2.a = str2;
            dii.b();
            dbv.a((dbv) dii.a, dii2);
            if (dii.b) {
                dih = dii.a;
            } else {
                dih dih2 = dii.a;
                djz.a.a(dih2).c(dih2);
                dii.b = true;
                dih = dii.a;
            }
            dih dih3 = dih;
            if (!dih.a(dih3, Boolean.TRUE.booleanValue())) {
                throw new dkw();
            }
            b2.getClass();
            amb.a((dbv) dih3, new amc(b2));
            return null;
        } catch (dqb e2) {
            if (ajd.b(e2)) {
                return null;
            }
            throw e2;
        }
    }
}
