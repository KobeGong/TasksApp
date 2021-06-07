package defpackage;

import android.accounts.Account;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: amb  reason: default package */
/* compiled from: PG */
public final class amb {
    public static final crb a = cqz.a().a(2).a(4).a(3).a(8).a(1).a(3).a().b();
    public static final crb b = cqz.a().a(1).a().b();
    private static final dbr d;
    public Account c;
    private final aiz e;
    private final ajb f;
    private final ake g;
    private cri h;

    public amb(aiz aiz, ajb ajb, ake ake) {
        this.e = aiz;
        this.f = ajb;
        this.g = ake;
    }

    public final List a() {
        dat dat;
        dbu dbu = (dbu) a(d).a.get(0);
        if (dbu.a == 13) {
            dat = (dat) dbu.b;
        } else {
            dat = dat.b;
        }
        ArrayList a2 = cky.a((Iterable) dat.a);
        if (a2 == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(a2);
    }

    public final ajq a(String str) {
        dih dih;
        dih dih2;
        dav dav;
        daf daf;
        dcb dcb;
        dce dce;
        dbr[] dbrArr = new dbr[2];
        dii dii = (dii) dbr.c.a(bg.ao);
        dii dii2 = (dii) dau.d.a(bg.ao);
        dii2.b();
        dau dau = (dau) dii2.a;
        if (str == null) {
            throw new NullPointerException();
        }
        dau.b = str;
        dii2.b();
        ((dau) dii2.a).c = true;
        crb b2 = cqz.b.b();
        dii2.b();
        dau dau2 = (dau) dii2.a;
        if (b2 == null) {
            throw new NullPointerException();
        }
        dau2.a = b2;
        dii.b();
        dbr.c((dbr) dii.a, dii2);
        if (dii.b) {
            dih = dii.a;
        } else {
            dih dih3 = dii.a;
            djz.a.a(dih3).c(dih3);
            dii.b = true;
            dih = dii.a;
        }
        dih dih4 = dih;
        if (!dih.a(dih4, Boolean.TRUE.booleanValue())) {
            throw new dkw();
        }
        dbrArr[0] = (dbr) dih4;
        dii dii3 = (dii) dbr.c.a(bg.ao);
        dii dii4 = (dii) dae.c.a(bg.ao);
        dii4.b();
        dae dae = (dae) dii4.a;
        if (str == null) {
            throw new NullPointerException();
        }
        dae.b = str;
        crb b3 = cqz.a().a(3).a().b();
        dii4.b();
        dae dae2 = (dae) dii4.a;
        if (b3 == null) {
            throw new NullPointerException();
        }
        dae2.a = b3;
        dii3.b();
        dbr.a((dbr) dii3.a, dii4);
        if (dii3.b) {
            dih2 = dii3.a;
        } else {
            dih dih5 = dii3.a;
            djz.a.a(dih5).c(dih5);
            dii3.b = true;
            dih2 = dii3.a;
        }
        dih dih6 = dih2;
        if (!dih.a(dih6, Boolean.TRUE.booleanValue())) {
            throw new dkw();
        }
        dbrArr[1] = (dbr) dih6;
        dbt a2 = a(dbrArr);
        dbu dbu = (dbu) a2.a.get(0);
        if (dbu.a == 15) {
            dav = (dav) dbu.b;
        } else {
            dav = dav.c;
        }
        diq diq = dav.b;
        if (diq == null) {
            return ajq.d();
        }
        dbu dbu2 = (dbu) a2.a.get(1);
        if (dbu2.a == 12) {
            daf = (daf) dbu2.b;
        } else {
            daf = daf.b;
        }
        if (daf.a == null) {
            dcb = dcb.g;
        } else {
            dcb = daf.a;
        }
        if (dcb.d == null) {
            dce = dce.b;
        } else {
            dce = dcb.d;
        }
        return ajq.a(diq, dce, auz.a());
    }

    /* access modifiers changed from: package-private */
    public final ead b() {
        aiz aiz = this.e;
        Account account = this.c;
        String a2 = aiz.a(aiz.a, account, "https://www.googleapis.com/auth/tasks");
        this.h = new aja(aiz, new crg(a2), a2, account, "https://www.googleapis.com/auth/tasks");
        ead a3 = dcg.a(this.f.a());
        dqe dqe = new dqe(this.h);
        dnc dnc = a3.a;
        dna dna = new dna(a3.b);
        dna.e = dqe;
        ead a4 = ead.a(dnc, dna);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        dnc dnc2 = a4.a;
        dna dna2 = a4.b;
        dny a5 = dny.a(timeUnit);
        dna dna3 = new dna(dna2);
        dna3.b = a5;
        return ead.a(dnc2, dna3);
    }

    private final dbt a(dbr... dbrArr) {
        dih dih;
        ead b2 = b();
        dii dii = (dii) dbs.b.a(bg.ao);
        List asList = Arrays.asList(dbrArr);
        dii.b();
        dbs dbs = (dbs) dii.a;
        if (!dbs.a.a()) {
            diq diq = dbs.a;
            int size = diq.size();
            dbs.a = diq.a(size == 0 ? 10 : size << 1);
        }
        diq diq2 = dbs.a;
        dim.a(asList);
        if (asList instanceof diz) {
            List d2 = ((diz) asList).d();
            diz diz = (diz) diq2;
            int size2 = diq2.size();
            for (Object obj : d2) {
                if (obj == null) {
                    String sb = new StringBuilder(37).append("Element at index ").append(diz.size() - size2).append(" is null.").toString();
                    for (int size3 = diz.size() - 1; size3 >= size2; size3--) {
                        diz.remove(size3);
                    }
                    throw new NullPointerException(sb);
                } else if (obj instanceof dha) {
                    diz.a((dha) obj);
                } else {
                    diz.add((String) obj);
                }
            }
        } else if (asList instanceof djy) {
            diq2.addAll(asList);
        } else {
            if ((diq2 instanceof ArrayList) && (asList instanceof Collection)) {
                ((ArrayList) diq2).ensureCapacity(asList.size() + diq2.size());
            }
            int size4 = diq2.size();
            for (Object obj2 : asList) {
                if (obj2 == null) {
                    String sb2 = new StringBuilder(37).append("Element at index ").append(diq2.size() - size4).append(" is null.").toString();
                    for (int size5 = diq2.size() - 1; size5 >= size4; size5--) {
                        diq2.remove(size5);
                    }
                    throw new NullPointerException(sb2);
                }
                diq2.add(obj2);
            }
        }
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
        return (dbt) a((dbs) dih3, new ame(b2));
    }

    /* access modifiers changed from: package-private */
    public final dba a(dbo... dboArr) {
        dih dih;
        ead b2 = b();
        dii dii = (dii) daz.b.a(bg.ao);
        List asList = Arrays.asList(dboArr);
        dii.b();
        daz daz = (daz) dii.a;
        if (!daz.a.a()) {
            diq diq = daz.a;
            int size = diq.size();
            daz.a = diq.a(size == 0 ? 10 : size << 1);
        }
        diq diq2 = daz.a;
        dim.a(asList);
        if (asList instanceof diz) {
            List d2 = ((diz) asList).d();
            diz diz = (diz) diq2;
            int size2 = diq2.size();
            for (Object obj : d2) {
                if (obj == null) {
                    String sb = new StringBuilder(37).append("Element at index ").append(diz.size() - size2).append(" is null.").toString();
                    for (int size3 = diz.size() - 1; size3 >= size2; size3--) {
                        diz.remove(size3);
                    }
                    throw new NullPointerException(sb);
                } else if (obj instanceof dha) {
                    diz.a((dha) obj);
                } else {
                    diz.add((String) obj);
                }
            }
        } else if (asList instanceof djy) {
            diq2.addAll(asList);
        } else {
            if ((diq2 instanceof ArrayList) && (asList instanceof Collection)) {
                ((ArrayList) diq2).ensureCapacity(asList.size() + diq2.size());
            }
            int size4 = diq2.size();
            for (Object obj2 : asList) {
                if (obj2 == null) {
                    String sb2 = new StringBuilder(37).append("Element at index ").append(diq2.size() - size4).append(" is null.").toString();
                    for (int size5 = diq2.size() - 1; size5 >= size4; size5--) {
                        diq2.remove(size5);
                    }
                    throw new NullPointerException(sb2);
                }
                diq2.add(obj2);
            }
        }
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
        dba dba = (dba) a((daz) dih3, new amf(b2));
        this.g.a(this.c, dba.c);
        return dba;
    }

    /* access modifiers changed from: package-private */
    public final Object a(Object obj, crq crq) {
        try {
            return crq.a(obj);
        } catch (dqb e2) {
            dpw dpw = e2.a;
            if (dpw.l == dpx.UNAUTHENTICATED || dpw.l == dpx.PERMISSION_DENIED) {
                this.h.c();
            }
            throw e2;
        }
    }

    static dbo a(String str, String str2, int i, String str3) {
        dih dih;
        dii a2 = ((dii) daw.h.a(bg.ao)).c(str).a(i);
        if (!TextUtils.isEmpty(str3)) {
            a2.b();
            daw daw = (daw) a2.a;
            if (str3 == null) {
                throw new NullPointerException();
            }
            daw.d = str3;
        }
        dii f2 = ((dii) dbo.d.a(bg.ao)).d(str2).f(a2);
        if (f2.b) {
            dih = f2.a;
        } else {
            dih dih2 = f2.a;
            djz.a.a(dih2).c(dih2);
            f2.b = true;
            dih = f2.a;
        }
        dih dih3 = dih;
        if (dih.a(dih3, Boolean.TRUE.booleanValue())) {
            return (dbo) dih3;
        }
        throw new dkw();
    }

    static {
        dih dih;
        dii dii = (dii) dbr.c.a(bg.ao);
        dii dii2 = (dii) das.b.a(bg.ao);
        cqz cqz = cqz.b;
        cra a2 = cqz.a();
        crb b2 = cqz.b();
        boolean z = b2.d;
        if (!a2.c) {
            throw new IllegalStateException("setInverted cannot be called on a builder that has fields.");
        }
        a2.b = z;
        for (Integer num : b2.c) {
            a2.a.put(Integer.valueOf(num.intValue()), cqz.b);
        }
        for (Integer num2 : Collections.unmodifiableMap(b2.b).keySet()) {
            int intValue = num2.intValue();
            Map map = a2.a;
            Integer valueOf = Integer.valueOf(intValue);
            crb crb = (crb) Collections.unmodifiableMap(b2.b).get(Integer.valueOf(intValue));
            cra a3 = cqz.a();
            boolean z2 = crb.d;
            if (!a3.c) {
                throw new IllegalStateException("setInverted cannot be called on a builder that has fields.");
            }
            a3.b = z2;
            for (Integer num3 : crb.c) {
                a3.a.put(Integer.valueOf(num3.intValue()), cqz.b);
            }
            for (Integer num4 : Collections.unmodifiableMap(crb.b).keySet()) {
                int intValue2 = num4.intValue();
                Map map2 = a3.a;
                Integer valueOf2 = Integer.valueOf(intValue2);
                crb crb2 = (crb) Collections.unmodifiableMap(crb.b).get(Integer.valueOf(intValue2));
                cra cra = new cra();
                boolean z3 = crb2.d;
                if (!cra.c) {
                    throw new IllegalStateException("setInverted cannot be called on a builder that has fields.");
                }
                cra.b = z3;
                for (Integer num5 : crb2.c) {
                    cra.a.put(Integer.valueOf(num5.intValue()), cqz.b);
                }
                for (Integer num6 : Collections.unmodifiableMap(crb2.b).keySet()) {
                    int intValue3 = num6.intValue();
                    cra.a.put(Integer.valueOf(intValue3), cqz.a((crb) Collections.unmodifiableMap(crb2.b).get(Integer.valueOf(intValue3))));
                }
                map2.put(valueOf2, cra.a());
            }
            map.put(valueOf, a3.a());
        }
        a2.a(3, cqz.a);
        crb b3 = a2.a().b();
        dii2.b();
        das das = (das) dii2.a;
        if (b3 == null) {
            throw new NullPointerException();
        }
        das.a = b3;
        dii.b();
        dbr.b((dbr) dii.a, dii2);
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
        d = (dbr) dih3;
    }
}
