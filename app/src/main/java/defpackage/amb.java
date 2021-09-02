package defpackage;

/* renamed from: amb reason: default package */
/* compiled from: PG */
public final class amb {
    public static final defpackage.crb a = defpackage.cqz.a().a(2).a(4).a(3).a(8).a(1).a(3).a().b();
    public static final defpackage.crb b = defpackage.cqz.a().a(1).a().b();
    private static final defpackage.dbr d;
    public android.accounts.Account c;
    private final defpackage.aiz e;
    private final defpackage.ajb f;
    private final defpackage.ake g;
    private defpackage.cri h;

    public amb(defpackage.aiz aiz, defpackage.ajb ajb, defpackage.ake ake) {
        this.e = aiz;
        this.f = ajb;
        this.g = ake;
    }

    public final java.util.List a() {
        defpackage.dat dat;
        defpackage.dbu dbu = (defpackage.dbu) a(d).a.get(0);
        if (dbu.a == 13) {
            dat = (defpackage.dat) dbu.b;
        } else {
            dat = defpackage.dat.b;
        }
        java.util.ArrayList a2 = defpackage.cky.a((java.lang.Iterable) dat.a);
        if (a2 == null) {
            return java.util.Collections.emptyList();
        }
        return java.util.Collections.unmodifiableList(a2);
    }

    public final defpackage.ajq a(java.lang.String str) {
        defpackage.dih dih;
        defpackage.dih dih2;
        defpackage.dav dav;
        defpackage.daf daf;
        defpackage.dcb dcb;
        defpackage.dce dce;
        defpackage.dbr[] dbrArr = new defpackage.dbr[2];
        defpackage.dii dii = (defpackage.dii) defpackage.dbr.c.a(defpackage.bg.ao);
        defpackage.dii dii2 = (defpackage.dii) defpackage.dau.d.a(defpackage.bg.ao);
        dii2.b();
        defpackage.dau dau = (defpackage.dau) dii2.a;
        if (str == null) {
            throw new java.lang.NullPointerException();
        }
        dau.b = str;
        dii2.b();
        ((defpackage.dau) dii2.a).c = true;
        defpackage.crb b2 = defpackage.cqz.b.b();
        dii2.b();
        defpackage.dau dau2 = (defpackage.dau) dii2.a;
        if (b2 == null) {
            throw new java.lang.NullPointerException();
        }
        dau2.a = b2;
        dii.b();
        defpackage.dbr.c((defpackage.dbr) dii.a, dii2);
        if (dii.b) {
            dih = dii.a;
        } else {
            defpackage.dih dih3 = dii.a;
            defpackage.djz.a.a((java.lang.Object) dih3).c(dih3);
            dii.b = true;
            dih = dii.a;
        }
        defpackage.dih dih4 = dih;
        if (!defpackage.dih.a(dih4, java.lang.Boolean.TRUE.booleanValue())) {
            throw new defpackage.dkw();
        }
        dbrArr[0] = (defpackage.dbr) dih4;
        defpackage.dii dii3 = (defpackage.dii) defpackage.dbr.c.a(defpackage.bg.ao);
        defpackage.dii dii4 = (defpackage.dii) defpackage.dae.c.a(defpackage.bg.ao);
        dii4.b();
        defpackage.dae dae = (defpackage.dae) dii4.a;
        if (str == null) {
            throw new java.lang.NullPointerException();
        }
        dae.b = str;
        defpackage.crb b3 = defpackage.cqz.a().a(3).a().b();
        dii4.b();
        defpackage.dae dae2 = (defpackage.dae) dii4.a;
        if (b3 == null) {
            throw new java.lang.NullPointerException();
        }
        dae2.a = b3;
        dii3.b();
        defpackage.dbr.a((defpackage.dbr) dii3.a, dii4);
        if (dii3.b) {
            dih2 = dii3.a;
        } else {
            defpackage.dih dih5 = dii3.a;
            defpackage.djz.a.a((java.lang.Object) dih5).c(dih5);
            dii3.b = true;
            dih2 = dii3.a;
        }
        defpackage.dih dih6 = dih2;
        if (!defpackage.dih.a(dih6, java.lang.Boolean.TRUE.booleanValue())) {
            throw new defpackage.dkw();
        }
        dbrArr[1] = (defpackage.dbr) dih6;
        defpackage.dbt a2 = a(dbrArr);
        defpackage.dbu dbu = (defpackage.dbu) a2.a.get(0);
        if (dbu.a == 15) {
            dav = (defpackage.dav) dbu.b;
        } else {
            dav = defpackage.dav.c;
        }
        defpackage.diq diq = dav.b;
        if (diq == null) {
            return defpackage.ajq.d();
        }
        defpackage.dbu dbu2 = (defpackage.dbu) a2.a.get(1);
        if (dbu2.a == 12) {
            daf = (defpackage.daf) dbu2.b;
        } else {
            daf = defpackage.daf.b;
        }
        if (daf.a == null) {
            dcb = defpackage.dcb.g;
        } else {
            dcb = daf.a;
        }
        if (dcb.d == null) {
            dce = defpackage.dce.b;
        } else {
            dce = dcb.d;
        }
        return defpackage.ajq.a(diq, dce, defpackage.auz.a());
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.ead b() {
        defpackage.aiz aiz = this.e;
        android.accounts.Account account = this.c;
        java.lang.String str = "https://www.googleapis.com/auth/tasks";
        java.lang.String a2 = defpackage.aiz.a(aiz.a, account, str);
        this.h = new defpackage.aja(aiz, new defpackage.crg(a2), a2, account, str);
        defpackage.ead a3 = defpackage.dcg.a(this.f.a());
        defpackage.dqe dqe = new defpackage.dqe(this.h);
        defpackage.dnc dnc = a3.a;
        defpackage.dna dna = new defpackage.dna(a3.b);
        dna.e = dqe;
        defpackage.ead a4 = defpackage.ead.a(dnc, dna);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        defpackage.dnc dnc2 = a4.a;
        defpackage.dna dna2 = a4.b;
        defpackage.dny a5 = defpackage.dny.a(timeUnit);
        defpackage.dna dna3 = new defpackage.dna(dna2);
        dna3.b = a5;
        return defpackage.ead.a(dnc2, dna3);
    }

    private final defpackage.dbt a(defpackage.dbr... dbrArr) {
        defpackage.dih dih;
        defpackage.ead b2 = b();
        defpackage.dii dii = (defpackage.dii) defpackage.dbs.b.a(defpackage.bg.ao);
        java.util.List asList = java.util.Arrays.asList(dbrArr);
        dii.b();
        defpackage.dbs dbs = (defpackage.dbs) dii.a;
        if (!dbs.a.a()) {
            defpackage.diq diq = dbs.a;
            int size = diq.size();
            dbs.a = diq.a(size == 0 ? 10 : size << 1);
        }
        defpackage.diq diq2 = dbs.a;
        defpackage.dim.a((java.lang.Object) asList);
        if (asList instanceof defpackage.diz) {
            java.util.List d2 = ((defpackage.diz) asList).d();
            defpackage.diz diz = (defpackage.diz) diq2;
            int size2 = diq2.size();
            for (java.lang.Object next : d2) {
                if (next == null) {
                    java.lang.String str = "Element at index " + (diz.size() - size2) + " is null.";
                    for (int size3 = diz.size() - 1; size3 >= size2; size3--) {
                        diz.remove(size3);
                    }
                    throw new java.lang.NullPointerException(str);
                } else if (next instanceof defpackage.dha) {
                    diz.a((defpackage.dha) next);
                } else {
                    diz.add((java.lang.String) next);
                }
            }
        } else if (asList instanceof defpackage.djy) {
            diq2.addAll(asList);
        } else {
            if ((diq2 instanceof java.util.ArrayList) && (asList instanceof java.util.Collection)) {
                ((java.util.ArrayList) diq2).ensureCapacity(asList.size() + diq2.size());
            }
            int size4 = diq2.size();
            for (java.lang.Object next2 : asList) {
                if (next2 == null) {
                    java.lang.String str2 = "Element at index " + (diq2.size() - size4) + " is null.";
                    for (int size5 = diq2.size() - 1; size5 >= size4; size5--) {
                        diq2.remove(size5);
                    }
                    throw new java.lang.NullPointerException(str2);
                }
                diq2.add(next2);
            }
        }
        if (dii.b) {
            dih = dii.a;
        } else {
            defpackage.dih dih2 = dii.a;
            defpackage.djz.a.a((java.lang.Object) dih2).c(dih2);
            dii.b = true;
            dih = dii.a;
        }
        defpackage.dih dih3 = dih;
        if (!defpackage.dih.a(dih3, java.lang.Boolean.TRUE.booleanValue())) {
            throw new defpackage.dkw();
        }
        defpackage.dbs dbs2 = (defpackage.dbs) dih3;
        b2.getClass();
        return (defpackage.dbt) a(dbs2, new defpackage.ame(b2));
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.dba a(defpackage.dbo... dboArr) {
        defpackage.dih dih;
        defpackage.ead b2 = b();
        defpackage.dii dii = (defpackage.dii) defpackage.daz.b.a(defpackage.bg.ao);
        java.util.List asList = java.util.Arrays.asList(dboArr);
        dii.b();
        defpackage.daz daz = (defpackage.daz) dii.a;
        if (!daz.a.a()) {
            defpackage.diq diq = daz.a;
            int size = diq.size();
            daz.a = diq.a(size == 0 ? 10 : size << 1);
        }
        defpackage.diq diq2 = daz.a;
        defpackage.dim.a((java.lang.Object) asList);
        if (asList instanceof defpackage.diz) {
            java.util.List d2 = ((defpackage.diz) asList).d();
            defpackage.diz diz = (defpackage.diz) diq2;
            int size2 = diq2.size();
            for (java.lang.Object next : d2) {
                if (next == null) {
                    java.lang.String str = "Element at index " + (diz.size() - size2) + " is null.";
                    for (int size3 = diz.size() - 1; size3 >= size2; size3--) {
                        diz.remove(size3);
                    }
                    throw new java.lang.NullPointerException(str);
                } else if (next instanceof defpackage.dha) {
                    diz.a((defpackage.dha) next);
                } else {
                    diz.add((java.lang.String) next);
                }
            }
        } else if (asList instanceof defpackage.djy) {
            diq2.addAll(asList);
        } else {
            if ((diq2 instanceof java.util.ArrayList) && (asList instanceof java.util.Collection)) {
                ((java.util.ArrayList) diq2).ensureCapacity(asList.size() + diq2.size());
            }
            int size4 = diq2.size();
            for (java.lang.Object next2 : asList) {
                if (next2 == null) {
                    java.lang.String str2 = "Element at index " + (diq2.size() - size4) + " is null.";
                    for (int size5 = diq2.size() - 1; size5 >= size4; size5--) {
                        diq2.remove(size5);
                    }
                    throw new java.lang.NullPointerException(str2);
                }
                diq2.add(next2);
            }
        }
        if (dii.b) {
            dih = dii.a;
        } else {
            defpackage.dih dih2 = dii.a;
            defpackage.djz.a.a((java.lang.Object) dih2).c(dih2);
            dii.b = true;
            dih = dii.a;
        }
        defpackage.dih dih3 = dih;
        if (!defpackage.dih.a(dih3, java.lang.Boolean.TRUE.booleanValue())) {
            throw new defpackage.dkw();
        }
        defpackage.daz daz2 = (defpackage.daz) dih3;
        b2.getClass();
        defpackage.dba dba = (defpackage.dba) a(daz2, new defpackage.amf(b2));
        this.g.a(this.c, dba.c);
        return dba;
    }

    /* access modifiers changed from: 0000 */
    public final java.lang.Object a(java.lang.Object obj, defpackage.crq crq) {
        try {
            return crq.a(obj);
        } catch (defpackage.dqb e2) {
            defpackage.dpw dpw = e2.a;
            if (dpw.l == defpackage.dpx.UNAUTHENTICATED || dpw.l == defpackage.dpx.PERMISSION_DENIED) {
                this.h.c();
            }
            throw e2;
        }
    }

    static defpackage.dbo a(java.lang.String str, java.lang.String str2, int i, java.lang.String str3) {
        defpackage.dih dih;
        defpackage.dii a2 = ((defpackage.dii) defpackage.daw.h.a(defpackage.bg.ao)).c(str).a(i);
        if (!android.text.TextUtils.isEmpty(str3)) {
            a2.b();
            defpackage.daw daw = (defpackage.daw) a2.a;
            if (str3 == null) {
                throw new java.lang.NullPointerException();
            }
            daw.d = str3;
        }
        defpackage.dii f2 = ((defpackage.dii) defpackage.dbo.d.a(defpackage.bg.ao)).d(str2).f(a2);
        if (f2.b) {
            dih = f2.a;
        } else {
            defpackage.dih dih2 = f2.a;
            defpackage.djz.a.a((java.lang.Object) dih2).c(dih2);
            f2.b = true;
            dih = f2.a;
        }
        defpackage.dih dih3 = dih;
        if (defpackage.dih.a(dih3, java.lang.Boolean.TRUE.booleanValue())) {
            return (defpackage.dbo) dih3;
        }
        throw new defpackage.dkw();
    }

    static {
        defpackage.dih dih;
        defpackage.dii dii = (defpackage.dii) defpackage.dbr.c.a(defpackage.bg.ao);
        defpackage.dii dii2 = (defpackage.dii) defpackage.das.b.a(defpackage.bg.ao);
        defpackage.cqz cqz = defpackage.cqz.b;
        defpackage.cra a2 = defpackage.cqz.a();
        defpackage.crb b2 = cqz.b();
        boolean z = b2.d;
        if (!a2.c) {
            throw new java.lang.IllegalStateException("setInverted cannot be called on a builder that has fields.");
        }
        a2.b = z;
        for (java.lang.Integer intValue : b2.c) {
            a2.a.put(java.lang.Integer.valueOf(intValue.intValue()), defpackage.cqz.b);
        }
        for (java.lang.Integer intValue2 : java.util.Collections.unmodifiableMap(b2.b).keySet()) {
            int intValue3 = intValue2.intValue();
            java.util.Map map = a2.a;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(intValue3);
            defpackage.crb crb = (defpackage.crb) java.util.Collections.unmodifiableMap(b2.b).get(java.lang.Integer.valueOf(intValue3));
            defpackage.cra a3 = defpackage.cqz.a();
            boolean z2 = crb.d;
            if (!a3.c) {
                throw new java.lang.IllegalStateException("setInverted cannot be called on a builder that has fields.");
            }
            a3.b = z2;
            for (java.lang.Integer intValue4 : crb.c) {
                a3.a.put(java.lang.Integer.valueOf(intValue4.intValue()), defpackage.cqz.b);
            }
            for (java.lang.Integer intValue5 : java.util.Collections.unmodifiableMap(crb.b).keySet()) {
                int intValue6 = intValue5.intValue();
                java.util.Map map2 = a3.a;
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(intValue6);
                defpackage.crb crb2 = (defpackage.crb) java.util.Collections.unmodifiableMap(crb.b).get(java.lang.Integer.valueOf(intValue6));
                defpackage.cra cra = new defpackage.cra();
                boolean z3 = crb2.d;
                if (!cra.c) {
                    throw new java.lang.IllegalStateException("setInverted cannot be called on a builder that has fields.");
                }
                cra.b = z3;
                for (java.lang.Integer intValue7 : crb2.c) {
                    int intValue8 = intValue7.intValue();
                    cra.a.put(java.lang.Integer.valueOf(intValue8), defpackage.cqz.b);
                }
                for (java.lang.Integer intValue9 : java.util.Collections.unmodifiableMap(crb2.b).keySet()) {
                    int intValue10 = intValue9.intValue();
                    java.util.Map map3 = cra.a;
                    java.lang.Integer valueOf3 = java.lang.Integer.valueOf(intValue10);
                    java.util.Map map4 = map3;
                    java.lang.Integer num = valueOf3;
                    map4.put(num, defpackage.cqz.a((defpackage.crb) java.util.Collections.unmodifiableMap(crb2.b).get(java.lang.Integer.valueOf(intValue10))));
                }
                map2.put(valueOf2, cra.a());
            }
            map.put(valueOf, a3.a());
        }
        a2.a(3, defpackage.cqz.a);
        defpackage.crb b3 = a2.a().b();
        dii2.b();
        defpackage.das das = (defpackage.das) dii2.a;
        if (b3 == null) {
            throw new java.lang.NullPointerException();
        }
        das.a = b3;
        dii.b();
        defpackage.dbr.b((defpackage.dbr) dii.a, dii2);
        if (dii.b) {
            dih = dii.a;
        } else {
            defpackage.dih dih2 = dii.a;
            defpackage.djz.a.a((java.lang.Object) dih2).c(dih2);
            dii.b = true;
            dih = dii.a;
        }
        defpackage.dih dih3 = dih;
        if (!defpackage.dih.a(dih3, java.lang.Boolean.TRUE.booleanValue())) {
            throw new defpackage.dkw();
        }
        d = (defpackage.dbr) dih3;
    }
}
