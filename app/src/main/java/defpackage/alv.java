package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: alv  reason: default package */
/* compiled from: PG */
public final class alv {
    public final String a;
    public List b = null;
    private final Context c;
    private Map d = new HashMap();
    private List e = new ArrayList();
    private boolean f = false;
    private ScheduledExecutorService g;

    public alv(String str, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.g = scheduledExecutorService;
        this.a = str;
        this.c = context.getApplicationContext();
        g();
    }

    public final synchronized List a() {
        List unmodifiableList;
        if (this.b == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = Collections.unmodifiableList(this.b);
        }
        return unmodifiableList;
    }

    public final synchronized dcb a(String str) {
        dcb dcb;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                dcb = null;
                break;
            }
            dcb = (dcb) it.next();
            if (dcb.b.equals(str)) {
                break;
            }
        }
        return dcb;
    }

    public final synchronized void a(List list) {
        HashSet<String> hashSet;
        Set keySet = this.d.keySet();
        if (keySet instanceof Collection) {
            hashSet = new HashSet(keySet);
        } else {
            Iterator it = keySet.iterator();
            HashSet hashSet2 = new HashSet();
            cky.a((Collection) hashSet2, it);
            hashSet = hashSet2;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            hashSet.remove(((dcb) it2.next()).b);
        }
        for (String str : hashSet) {
            ajq ajq = (ajq) this.d.remove(str);
            if (ajq != null) {
                aju.a(ajq.a());
            }
        }
        this.b = cky.a((Iterable) list);
        e();
    }

    public final synchronized ajq b(String str) {
        ajq ajq;
        ajq = (ajq) this.d.get(str);
        if (ajq == null) {
            ajq = null;
        }
        return ajq;
    }

    public final synchronized dby a(String str, String str2) {
        int a2;
        dby dby = null;
        synchronized (this) {
            ajq b2 = b(str);
            if (b2 != null && (a2 = a(b2.a(), str2)) >= 0) {
                dby = (dby) b2.a().get(a2);
            }
        }
        return dby;
    }

    public final synchronized boolean b(String str, String str2) {
        boolean z;
        ajq b2 = b(str);
        if (b2 != null) {
            Iterator it = b2.b().a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((dcf) it.next()).b.equals(str2)) {
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

    public final synchronized List c(String str, String str2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        ajq b2 = b(str);
        if (b2 != null) {
            for (dcf dcf : b2.b().a) {
                if (dcf.b.equals(str2)) {
                    for (dcf dcf2 : dcf.c) {
                        int a2 = a(b2.a(), dcf2.b);
                        if (a2 >= 0) {
                            arrayList.add((dby) b2.a().get(a2));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized void a(String str, ajq ajq) {
        if (e(str) >= 0) {
            ajq ajq2 = (ajq) this.d.get(str);
            this.d.put(str, ajq);
            e();
            HashSet hashSet = new HashSet();
            if (ajq2 != null) {
                for (dby dby : ajq2.a()) {
                    hashSet.add(dby.d);
                }
                if (ajq != null) {
                    for (dby dby2 : ajq.a()) {
                        hashSet.remove(dby2.d);
                    }
                }
                aju.c();
            }
            if (ajq != null) {
                ajq.a();
                aju.b();
            }
        }
    }

    public final synchronized void a(String str, String str2, boolean z) {
        int a2;
        dih dih;
        dih dih2;
        ajq ajq = (ajq) this.d.get(str);
        if (ajq != null && (a2 = a(ajq.a(), str2)) >= 0) {
            dby dby = (dby) ajq.a().get(a2);
            dii dii = (dii) dby.a(bg.ao);
            dii.a((dih) dby);
            dii dii2 = dii;
            dca f2 = dii2.f();
            dii dii3 = (dii) f2.a(bg.ao);
            dii3.a((dih) f2);
            dii2.g(dii3.a(z));
            if (dii2.b) {
                dih = dii2.a;
            } else {
                dih dih3 = dii2.a;
                djz.a.a(dih3).c(dih3);
                dii2.b = true;
                dih = dii2.a;
            }
            dih dih4 = dih;
            if (!dih.a(dih4, Boolean.TRUE.booleanValue())) {
                throw new dkw();
            }
            dby dby2 = (dby) dih4;
            ArrayList a3 = cky.a((Iterable) ajq.a());
            a3.remove(a2);
            a3.add(0, dby2);
            dce b2 = ajq.b();
            dii dii4 = (dii) b2.a(bg.ao);
            dii4.a((dih) b2);
            dii dii5 = dii4;
            if (z) {
                a(str2, dii5);
            } else {
                dii5.b(0, ((dii) dcf.d.a(bg.ao)).i(str2));
            }
            Map map = this.d;
            if (dii5.b) {
                dih2 = dii5.a;
            } else {
                dih dih5 = dii5.a;
                djz.a.a(dih5).c(dih5);
                dii5.b = true;
                dih2 = dii5.a;
            }
            dih dih6 = dih2;
            if (!dih.a(dih6, Boolean.TRUE.booleanValue())) {
                throw new dkw();
            }
            map.put(str, ajq.a(a3, (dce) dih6, ajq.c()));
            e();
            csp.a(dby2);
            aju.b();
        }
    }

    public final synchronized void a(String str, String str2, String str3) {
        a(str, str2, new alw(str3));
    }

    public final synchronized void b(String str, String str2, String str3) {
        a(str, str2, new alx(str3));
    }

    public final synchronized void a(String str, String str2, dmk dmk) {
        a(str, str2, new aly(dmk));
    }

    public final synchronized void a(String str, String str2, String str3, String str4, Map map) {
        int a2;
        dca dca;
        dce dce;
        dcf dcf;
        ajq ajq;
        dce dce2;
        dih dih;
        dih dih2;
        int a3;
        dih dih3;
        dih dih4;
        ajq ajq2 = (ajq) this.d.get(str);
        if (ajq2 != null && (a2 = a(ajq2.a(), str2)) >= 0) {
            ArrayList a4 = cky.a((Iterable) ajq2.a());
            dby dby = (dby) a4.remove(a2);
            dce b2 = ajq2.b();
            if (dby.e == null) {
                dca = dca.g;
            } else {
                dca = dby.e;
            }
            if (!dca.a) {
                dii dii = (dii) b2.a(bg.ao);
                dii.a((dih) b2);
                dii dii2 = dii;
                dcf = a(str2, dii2);
                if (dii2.b) {
                    dih4 = dii2.a;
                } else {
                    dih dih5 = dii2.a;
                    djz.a.a(dih5).c(dih5);
                    dii2.b = true;
                    dih4 = dii2.a;
                }
                dih dih6 = dih4;
                if (!dih.a(dih6, Boolean.TRUE.booleanValue())) {
                    throw new dkw();
                }
                dce = (dce) dih6;
            } else {
                dce = b2;
                dcf = null;
            }
            aju.a(csp.a(dby));
            ajq ajq3 = (ajq) this.d.get(str3);
            if (ajq3 == null) {
                ajq = ajq.d();
            } else {
                ajq = ajq3;
            }
            ArrayList a5 = cky.a((Iterable) ajq.a());
            dce b3 = ajq.b();
            if (dcf != null) {
                dii i = ((dii) dcf.d.a(bg.ao)).i(str4);
                for (dcf dcf2 : dcf.c) {
                    if (map.containsKey(dcf2.b) && (a3 = a(a4, dcf2.b)) >= 0) {
                        String str5 = (String) map.get(dcf2.b);
                        dii i2 = ((dii) dcf.d.a(bg.ao)).i(str5);
                        i.b();
                        dcf.a((dcf) i.a, i2);
                        dby dby2 = (dby) a4.remove(a3);
                        dii dii3 = (dii) dby2.a(bg.ao);
                        dii3.a((dih) dby2);
                        dii e2 = dii3.e(str5);
                        if (e2.b) {
                            dih3 = e2.a;
                        } else {
                            dih dih7 = e2.a;
                            djz.a.a(dih7).c(dih7);
                            e2.b = true;
                            dih3 = e2.a;
                        }
                        dih dih8 = dih3;
                        if (!dih.a(dih8, Boolean.TRUE.booleanValue())) {
                            throw new dkw();
                        }
                        a5.add((dby) dih8);
                    }
                }
                dce b4 = ajq.b();
                dii dii4 = (dii) b4.a(bg.ao);
                dii4.a((dih) b4);
                dii dii5 = dii4;
                dii5.b(0, i);
                if (dii5.b) {
                    dih2 = dii5.a;
                } else {
                    dih dih9 = dii5.a;
                    djz.a.a(dih9).c(dih9);
                    dii5.b = true;
                    dih2 = dii5.a;
                }
                dih dih10 = dih2;
                if (!dih.a(dih10, Boolean.TRUE.booleanValue())) {
                    throw new dkw();
                }
                dce2 = (dce) dih10;
            } else {
                dce2 = b3;
            }
            dii dii6 = (dii) dby.a(bg.ao);
            dii6.a((dih) dby);
            dii e3 = dii6.e(str4);
            if (e3.b) {
                dih = e3.a;
            } else {
                dih dih11 = e3.a;
                djz.a.a(dih11).c(dih11);
                e3.b = true;
                dih = e3.a;
            }
            dih dih12 = dih;
            if (!dih.a(dih12, Boolean.TRUE.booleanValue())) {
                throw new dkw();
            }
            dby dby3 = (dby) dih12;
            a5.add(dby3);
            csp.a(dby3);
            aju.b();
            this.d.put(str, ajq.a(a4, dce, ajq2.c()));
            this.d.put(str3, ajq.a(a5, dce2, ajq.c()));
            e();
        }
    }

    public final synchronized void a(String str, dby dby, int i, String str2) {
        ajq ajq;
        dih dih;
        dih dih2;
        ajq ajq2 = (ajq) this.d.get(str);
        if (ajq2 == null) {
            ajq = ajq.d();
        } else {
            ajq = ajq2;
        }
        if (a(ajq.a(), dby.d) < 0) {
            if (TextUtils.isEmpty(str2)) {
                ArrayList a2 = cky.a((Iterable) ajq.a());
                a2.add(0, dby);
                Map map = this.d;
                dce b2 = ajq.b();
                dii dii = (dii) b2.a(bg.ao);
                dii.a((dih) b2);
                dii b3 = dii.b(i, ((dii) dcf.d.a(bg.ao)).i(dby.d));
                if (b3.b) {
                    dih2 = b3.a;
                } else {
                    dih dih3 = b3.a;
                    djz.a.a(dih3).c(dih3);
                    b3.b = true;
                    dih2 = b3.a;
                }
                dih dih4 = dih2;
                if (!dih.a(dih4, Boolean.TRUE.booleanValue())) {
                    throw new dkw();
                }
                map.put(str, ajq.a(a2, (dce) dih4, ajq.c()));
                csp.a(dby);
                aju.b();
                e();
            } else {
                int i2 = 0;
                for (dcf dcf : ajq.b().a) {
                    if (dcf.b.equals(str2)) {
                        ArrayList a3 = cky.a((Iterable) ajq.a());
                        a3.add(0, dby);
                        Map map2 = this.d;
                        dce b4 = ajq.b();
                        dii dii2 = (dii) b4.a(bg.ao);
                        dii2.a((dih) b4);
                        dcf dcf2 = (dcf) ajq.b().a.get(i2);
                        dii dii3 = (dii) dcf2.a(bg.ao);
                        dii3.a((dih) dcf2);
                        dii dii4 = dii3;
                        dii i3 = ((dii) dcf.d.a(bg.ao)).i(dby.d);
                        dii4.b();
                        dcf.a((dcf) dii4.a, i, i3);
                        dii a4 = dii2.a(i2, dii4);
                        if (a4.b) {
                            dih = a4.a;
                        } else {
                            dih dih5 = a4.a;
                            djz.a.a(dih5).c(dih5);
                            a4.b = true;
                            dih = a4.a;
                        }
                        dih dih6 = dih;
                        if (!dih.a(dih6, Boolean.TRUE.booleanValue())) {
                            throw new dkw();
                        }
                        map2.put(str, ajq.a(a3, (dce) dih6, ajq.c()));
                        csp.a(dby);
                        aju.b();
                        e();
                    }
                    i2++;
                }
            }
        }
    }

    public final synchronized void a(String str, String str2, int i, String str3) {
        dih dih;
        int i2 = 10;
        synchronized (this) {
            ajq ajq = (ajq) this.d.get(str);
            if (ajq != null) {
                dce b2 = ajq.b();
                dii dii = (dii) b2.a(bg.ao);
                dii.a((dih) b2);
                dii dii2 = dii;
                dcf a2 = a(str2, dii2);
                if (a2 != null) {
                    if (!TextUtils.isEmpty(str3)) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= dii2.h().size()) {
                                break;
                            }
                            dcf b3 = dii2.b(i3);
                            if (b3.b.equals(str3)) {
                                dii dii3 = (dii) b3.a(bg.ao);
                                dii3.a((dih) b3);
                                dii dii4 = dii3;
                                dii4.b();
                                dcf dcf = (dcf) dii4.a;
                                if (a2 == null) {
                                    throw new NullPointerException();
                                }
                                if (!dcf.c.a()) {
                                    diq diq = dcf.c;
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
                        dce dce = (dce) dii2.a;
                        if (a2 == null) {
                            throw new NullPointerException();
                        }
                        if (!dce.a.a()) {
                            diq diq2 = dce.a;
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
                    Map map = this.d;
                    List a3 = ajq.a();
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
                    map.put(str, ajq.a(a3, (dce) dih3, ajq.c()));
                    e();
                }
            }
        }
    }

    private final void a(String str, String str2, crq crq) {
        int a2;
        ajq ajq = (ajq) this.d.get(str);
        if (ajq != null && (a2 = a(ajq.a(), str2)) >= 0) {
            dby dby = (dby) crq.a((dby) ajq.a().get(a2));
            ArrayList a3 = cky.a((Iterable) ajq.a());
            a3.set(a2, dby);
            this.d.put(str, ajq.a(a3, ajq.b(), ajq.c()));
            e();
            csp.a(dby);
            aju.b();
        }
    }

    private static dcf a(String str, dii dii) {
        dcf dcf = null;
        for (int i = 0; i < dii.h().size() && dcf == null; i++) {
            dcf b2 = dii.b(i);
            if (b2.b.equals(str)) {
                dii.c(i);
                dcf = b2;
            } else {
                int i2 = 0;
                while (i2 < b2.c.size() && dcf == null) {
                    dcf dcf2 = (dcf) b2.c.get(i2);
                    if (dcf2.b.equals(str)) {
                        dii dii2 = (dii) b2.a(bg.ao);
                        dii2.a((dih) b2);
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

    public final synchronized void d(String str, String str2) {
        boolean z;
        dce dce;
        dih dih;
        dih dih2;
        ajq ajq = (ajq) this.d.get(str);
        if (ajq != null) {
            dce b2 = ajq.b();
            ArrayList a2 = cky.a((Iterable) ajq.a());
            int a3 = a(a2, str2);
            if (a3 >= 0) {
                aju.a(csp.a((dby) a2.remove(a3)));
            }
            diq diq = b2.a;
            int i = 0;
            boolean z2 = false;
            while (!z2 && i < diq.size()) {
                dcf dcf = (dcf) diq.get(i);
                if (cru.d(str2, dcf.b)) {
                    dce b3 = ajq.b();
                    dii dii = (dii) b3.a(bg.ao);
                    dii.a((dih) b3);
                    dii dii2 = dii;
                    dii2.c(i);
                    for (int size = dcf.c.size() - 1; size >= 0; size--) {
                        int a4 = a(a2, ((dcf) dcf.c.get(size)).b);
                        if (a4 >= 0) {
                            aju.a(csp.a((dby) a2.remove(a4)));
                        }
                    }
                    if (dii2.b) {
                        dih2 = dii2.a;
                    } else {
                        dih dih3 = dii2.a;
                        djz.a.a(dih3).c(dih3);
                        dii2.b = true;
                        dih2 = dii2.a;
                    }
                    dih dih4 = dih2;
                    if (!dih.a(dih4, Boolean.TRUE.booleanValue())) {
                        throw new dkw();
                    }
                    z2 = true;
                    b2 = (dce) dih4;
                } else {
                    int i2 = 0;
                    while (!z2 && i2 < dcf.c.size()) {
                        if (cru.d(str2, ((dcf) dcf.c.get(i2)).b)) {
                            dce b4 = ajq.b();
                            dii dii3 = (dii) b4.a(bg.ao);
                            dii3.a((dih) b4);
                            dii dii4 = dii3;
                            dii dii5 = (dii) dcf.a(bg.ao);
                            dii5.a((dih) dcf);
                            dii4.a(i, dii5.d(i2));
                            if (dii4.b) {
                                dih = dii4.a;
                            } else {
                                dih dih5 = dii4.a;
                                djz.a.a(dih5).c(dih5);
                                dii4.b = true;
                                dih = dii4.a;
                            }
                            dih dih6 = dih;
                            if (!dih.a(dih6, Boolean.TRUE.booleanValue())) {
                                throw new dkw();
                            }
                            dce = (dce) dih6;
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
            this.d.put(str, ajq.a(a2, b2, ajq.c()));
            e();
        }
    }

    public final synchronized void c(String str) {
        dca dca;
        ajq ajq = (ajq) this.d.get(str);
        if (ajq != null) {
            dce b2 = ajq.b();
            List<dby> a2 = ajq.a();
            ArrayList b3 = cky.b(a2.size());
            for (dby dby : a2) {
                if (dby.e == null) {
                    dca = dca.g;
                } else {
                    dca = dby.e;
                }
                if (!dca.a) {
                    b3.add(dby);
                }
            }
            this.d.put(str, ajq.a(b3, b2, ajq.c()));
            e();
        }
    }

    public final synchronized void a(dcb dcb) {
        if (e(dcb.b) < 0) {
            this.b.add(dcb);
            e();
        }
    }

    public final synchronized void e(String str, String str2) {
        dcd dcd;
        dih dih;
        int e2 = e(str);
        if (e2 >= 0) {
            dcb dcb = (dcb) this.b.get(e2);
            dii dii = (dii) dcb.a(bg.ao);
            dii.a((dih) dcb);
            dii dii2 = dii;
            dcb dcb2 = (dcb) dii2.a;
            if (dcb2.c == null) {
                dcd = dcd.c;
            } else {
                dcd = dcb2.c;
            }
            dii dii3 = (dii) dcd.a(bg.ao);
            dii3.a((dih) dcd);
            dii2.i(dii3.h(str2));
            List list = this.b;
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
            list.set(e2, (dcb) dih3);
            e();
        }
    }

    public final synchronized void d(String str) {
        ajq ajq = (ajq) this.d.remove(str);
        int e2 = e(str);
        if (e2 >= 0) {
            this.b.remove(e2);
            e();
        }
        if (ajq != null) {
            aju.a(ajq.a());
        }
    }

    public final synchronized void a(amn amn) {
        this.e.add(amn);
        e();
    }

    public final synchronized void b(amn amn) {
        if (this.e.remove(amn)) {
            e();
        }
    }

    public final synchronized List b() {
        return Collections.unmodifiableList(this.e);
    }

    public final synchronized void c() {
        h();
        this.f = false;
        this.c.deleteFile(f());
    }

    private final synchronized void e() {
        if (!this.f) {
            this.f = true;
            this.g.schedule(new alz(this), 50, TimeUnit.MILLISECONDS);
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void d() {
        if (this.f) {
            try {
                FileOutputStream openFileOutput = this.c.openFileOutput(f(), 0);
                try {
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(openFileOutput);
                    objectOutputStream.writeObject(b(this.b));
                    Map map = this.d;
                    HashMap hashMap = new HashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        List b2 = b(((ajq) entry.getValue()).a());
                        byte[] a2 = bdk.a(((ajq) entry.getValue()).b());
                        long c2 = ((ajq) entry.getValue()).c();
                        ama ama = new ama();
                        ama.a = b2;
                        ama.b = a2;
                        ama.c = c2;
                        hashMap.put((String) entry.getKey(), ama);
                    }
                    objectOutputStream.writeObject(hashMap);
                    objectOutputStream.writeObject(this.e);
                    objectOutputStream.flush();
                    this.f = false;
                } finally {
                    openFileOutput.close();
                }
            } catch (IOException e2) {
                azb.a("Cannot save database", (Throwable) e2, new String[0]);
            }
        }
    }

    private static List b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(bdk.a((dih) it.next()));
        }
        return arrayList;
    }

    private static List a(List list, dih dih) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(bdk.a((byte[]) it.next(), dih));
        }
        return arrayList;
    }

    private final String f() {
        String valueOf = String.valueOf(azb.a(this.a));
        return valueOf.length() != 0 ? "database_".concat(valueOf) : new String("database_");
    }

    private final synchronized void g() {
        try {
            FileInputStream openFileInput = this.c.openFileInput(f());
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(openFileInput);
                this.b = a((List) objectInputStream.readObject(), dcb.g);
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : ((Map) objectInputStream.readObject()).entrySet()) {
                    ama ama = (ama) entry.getValue();
                    hashMap.put((String) entry.getKey(), ajq.a(a(ama.a, dby.g), (dce) bdk.a(ama.b, dce.b), ama.c));
                }
                this.d = hashMap;
                this.e = (List) objectInputStream.readObject();
                String valueOf = String.valueOf(azb.a(this.a));
                if (valueOf.length() != 0) {
                    "Database opened: ".concat(valueOf);
                } else {
                    new String("Database opened: ");
                }
            } catch (ClassCastException | ClassNotFoundException e2) {
                azb.a("Incompatible database; will continue as new: %s", e2, azb.a(this.a));
                h();
            } finally {
                openFileInput.close();
            }
        } catch (FileNotFoundException e3) {
            Object[] objArr = {e3, azb.a(this.a), e3};
        } catch (IOException e4) {
            azb.a("Cannot open database: %s", (Throwable) e4, azb.a(this.a));
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
    }

    private final void h() {
        this.b = new ArrayList();
        this.d = new HashMap();
        this.e = new ArrayList();
    }

    private static int a(List list, String str) {
        if (list == null) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (cru.d(str, ((dby) list.get(i)).d)) {
                return i;
            }
        }
        return -1;
    }

    private final int e(String str) {
        if (this.b == null) {
            return -1;
        }
        for (int i = 0; i < this.b.size(); i++) {
            if (cru.d(str, ((dcb) this.b.get(i)).b)) {
                return i;
            }
        }
        return -1;
    }
}
