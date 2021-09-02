package defpackage;

/* renamed from: bza reason: default package */
/* compiled from: PG */
public final class bza {
    public defpackage.ccq a;
    public defpackage.bzw b;
    public defpackage.bzr c;
    public defpackage.caa d;
    public defpackage.bzn e;
    public defpackage.bzj f;
    public defpackage.bzf g;
    public defpackage.bzh h;
    public defpackage.bzu i;

    public final defpackage.ccr a(java.lang.String str) {
        try {
            defpackage.ccq ccq = this.a;
            return ccq.a.a("/v1/storetarget", str, this.b.a(), defpackage.det.a);
        } catch (defpackage.byl e2) {
            defpackage.ccs e3 = defpackage.ccr.e();
            e3.b = e2;
            return e3.a(true).a();
        }
    }

    public final defpackage.ccr b(java.lang.String str) {
        defpackage.dih dih;
        defpackage.dih dih2;
        defpackage.dih dih3;
        defpackage.dih dih4;
        try {
            defpackage.ccq ccq = this.a;
            defpackage.bzr bzr = this.c;
            defpackage.dii dii = (defpackage.dii) defpackage.dfa.d.a(defpackage.bg.ao);
            defpackage.dii j = ((defpackage.dii) defpackage.dfb.d.a(defpackage.bg.ao)).a(java.lang.Long.parseLong(bzr.a.d())).j(bzr.b.a());
            if (j.b) {
                dih = j.a;
            } else {
                defpackage.dih dih5 = j.a;
                defpackage.djz.a.a((java.lang.Object) dih5).c(dih5);
                j.b = true;
                dih = j.a;
            }
            defpackage.dih dih6 = dih;
            if (!defpackage.dih.a(dih6, java.lang.Boolean.TRUE.booleanValue())) {
                throw new defpackage.dkw();
            }
            defpackage.dii a2 = dii.a((defpackage.dfb) dih6);
            if (bzr.a.c() != null && !bzr.a.c().isEmpty()) {
                defpackage.dii a3 = ((defpackage.dii) defpackage.dfc.b.a(defpackage.bg.ao)).a((java.lang.Iterable) bzr.a.c());
                if (a3.b) {
                    dih4 = a3.a;
                } else {
                    defpackage.dih dih7 = a3.a;
                    defpackage.djz.a.a((java.lang.Object) dih7).c(dih7);
                    a3.b = true;
                    dih4 = a3.a;
                }
                defpackage.dih dih8 = dih4;
                if (!defpackage.dih.a(dih8, java.lang.Boolean.TRUE.booleanValue())) {
                    throw new defpackage.dkw();
                }
                a2.a((defpackage.dfc) dih8);
            }
            defpackage.dii dii2 = (defpackage.dii) defpackage.deo.e.a(defpackage.bg.ao);
            java.lang.String a4 = bzr.a.a();
            dii2.b();
            defpackage.deo deo = (defpackage.deo) dii2.a;
            if (a4 == null) {
                throw new java.lang.NullPointerException();
            }
            deo.a |= 1;
            deo.b = a4;
            defpackage.dfh a5 = bzr.c.a();
            dii2.b();
            defpackage.deo deo2 = (defpackage.deo) dii2.a;
            if (a5 == null) {
                throw new java.lang.NullPointerException();
            }
            deo2.c = a5;
            deo2.a |= 2;
            if (a2.b) {
                dih2 = a2.a;
            } else {
                defpackage.dih dih9 = a2.a;
                defpackage.djz.a.a((java.lang.Object) dih9).c(dih9);
                a2.b = true;
                dih2 = a2.a;
            }
            defpackage.dih dih10 = dih2;
            if (!defpackage.dih.a(dih10, java.lang.Boolean.TRUE.booleanValue())) {
                throw new defpackage.dkw();
            }
            defpackage.dfa dfa = (defpackage.dfa) dih10;
            dii2.b();
            defpackage.deo deo3 = (defpackage.deo) dii2.a;
            if (dfa == null) {
                throw new java.lang.NullPointerException();
            }
            deo3.d = dfa;
            deo3.a |= 4;
            if (dii2.b) {
                dih3 = dii2.a;
            } else {
                defpackage.dih dih11 = dii2.a;
                defpackage.djz.a.a((java.lang.Object) dih11).c(dih11);
                dii2.b = true;
                dih3 = dii2.a;
            }
            defpackage.dih dih12 = dih3;
            if (!defpackage.dih.a(dih12, java.lang.Boolean.TRUE.booleanValue())) {
                throw new defpackage.dkw();
            }
            return ccq.a.a("/v1/removetarget", str, (defpackage.deo) dih12, defpackage.dep.a);
        } catch (defpackage.byl e2) {
            defpackage.ccs e3 = defpackage.ccr.e();
            e3.b = e2;
            return e3.a(true).a();
        }
    }

    public final defpackage.ccr a(java.lang.String str, long j, java.util.List list) {
        defpackage.dih dih;
        try {
            defpackage.ccq ccq = this.a;
            defpackage.bzn bzn = this.e;
            defpackage.dii dii = (defpackage.dii) defpackage.del.h.a(defpackage.bg.ao);
            java.lang.String a2 = bzn.a.a();
            dii.b();
            defpackage.del del = (defpackage.del) dii.a;
            if (a2 == null) {
                throw new java.lang.NullPointerException();
            }
            del.a |= 1;
            del.b = a2;
            defpackage.dfi b2 = bzn.c.b();
            dii.b();
            defpackage.del del2 = (defpackage.del) dii.a;
            if (b2 == null) {
                throw new java.lang.NullPointerException();
            }
            del2.c = b2;
            del2.a |= 2;
            defpackage.dfd a3 = bzn.b.a();
            dii.b();
            defpackage.del del3 = (defpackage.del) dii.a;
            if (a3 == null) {
                throw new java.lang.NullPointerException();
            }
            del3.f = a3;
            del3.a |= 32;
            defpackage.dem dem = defpackage.dem.RENDER_ALL;
            dii.b();
            defpackage.del del4 = (defpackage.del) dii.a;
            if (dem == null) {
                throw new java.lang.NullPointerException();
            }
            del4.a |= 16;
            del4.e = dem.c;
            dii.b();
            defpackage.del del5 = (defpackage.del) dii.a;
            del5.a |= 4;
            del5.d = j;
            dii.b();
            defpackage.del del6 = (defpackage.del) dii.a;
            if (!del6.g.a()) {
                defpackage.diq diq = del6.g;
                int size = diq.size();
                del6.g = diq.a(size == 0 ? 10 : size << 1);
            }
            defpackage.diq diq2 = del6.g;
            defpackage.dim.a((java.lang.Object) list);
            if (list instanceof defpackage.diz) {
                java.util.List d2 = ((defpackage.diz) list).d();
                defpackage.diz diz = (defpackage.diz) diq2;
                int size2 = diq2.size();
                for (java.lang.Object next : d2) {
                    if (next == null) {
                        java.lang.String str2 = "Element at index " + (diz.size() - size2) + " is null.";
                        for (int size3 = diz.size() - 1; size3 >= size2; size3--) {
                            diz.remove(size3);
                        }
                        throw new java.lang.NullPointerException(str2);
                    } else if (next instanceof defpackage.dha) {
                        diz.a((defpackage.dha) next);
                    } else {
                        diz.add((java.lang.String) next);
                    }
                }
            } else if (list instanceof defpackage.djy) {
                diq2.addAll(list);
            } else {
                if ((diq2 instanceof java.util.ArrayList) && (list instanceof java.util.Collection)) {
                    ((java.util.ArrayList) diq2).ensureCapacity(list.size() + diq2.size());
                }
                int size4 = diq2.size();
                for (java.lang.Object next2 : list) {
                    if (next2 == null) {
                        java.lang.String str3 = "Element at index " + (diq2.size() - size4) + " is null.";
                        for (int size5 = diq2.size() - 1; size5 >= size4; size5--) {
                            diq2.remove(size5);
                        }
                        throw new java.lang.NullPointerException(str3);
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
            return ccq.a.a("/v1/fetchupdatedthreads", str, (defpackage.del) dih3, defpackage.den.d);
        } catch (defpackage.byl e2) {
            defpackage.ccs e3 = defpackage.ccr.e();
            e3.b = e2;
            return e3.a(true).a();
        }
    }

    public final defpackage.ccr a(java.lang.String str, java.lang.Long l) {
        defpackage.dih dih;
        try {
            defpackage.ccq ccq = this.a;
            defpackage.bzj bzj = this.f;
            defpackage.dii dii = (defpackage.dii) defpackage.dej.f.a(defpackage.bg.ao);
            java.lang.String a2 = bzj.a.a();
            dii.b();
            defpackage.dej dej = (defpackage.dej) dii.a;
            if (a2 == null) {
                throw new java.lang.NullPointerException();
            }
            dej.a |= 1;
            dej.b = a2;
            defpackage.dfi b2 = bzj.c.b();
            dii.b();
            defpackage.dej dej2 = (defpackage.dej) dii.a;
            if (b2 == null) {
                throw new java.lang.NullPointerException();
            }
            dej2.c = b2;
            dej2.a |= 2;
            defpackage.dfd a3 = bzj.b.a();
            dii.b();
            defpackage.dej dej3 = (defpackage.dej) dii.a;
            if (a3 == null) {
                throw new java.lang.NullPointerException();
            }
            dej3.e = a3;
            dej3.a |= 16;
            if (l != null && l.longValue() > 0) {
                long longValue = l.longValue();
                dii.b();
                defpackage.dej dej4 = (defpackage.dej) dii.a;
                dej4.a |= 4;
                dej4.d = longValue;
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
            return ccq.a.a("/v1/fetchlatestthreads", str, (defpackage.dej) dih3, defpackage.dek.e);
        } catch (defpackage.byl e2) {
            defpackage.ccs e3 = defpackage.ccr.e();
            e3.b = e2;
            return e3.a(true).a();
        }
    }

    public final defpackage.ccr a(java.lang.String str, java.util.List list) {
        defpackage.dih dih;
        try {
            defpackage.ccq ccq = this.a;
            defpackage.bzf bzf = this.g;
            defpackage.dii dii = (defpackage.dii) defpackage.def.e.a(defpackage.bg.ao);
            java.lang.String a2 = bzf.a.a();
            dii.b();
            defpackage.def def = (defpackage.def) dii.a;
            if (a2 == null) {
                throw new java.lang.NullPointerException();
            }
            def.a |= 1;
            def.b = a2;
            dii.b();
            defpackage.def def2 = (defpackage.def) dii.a;
            if (!def2.c.a()) {
                defpackage.diq diq = def2.c;
                int size = diq.size();
                def2.c = diq.a(size == 0 ? 10 : size << 1);
            }
            defpackage.diq diq2 = def2.c;
            defpackage.dim.a((java.lang.Object) list);
            if (list instanceof defpackage.diz) {
                java.util.List d2 = ((defpackage.diz) list).d();
                defpackage.diz diz = (defpackage.diz) diq2;
                int size2 = diq2.size();
                for (java.lang.Object next : d2) {
                    if (next == null) {
                        java.lang.String str2 = "Element at index " + (diz.size() - size2) + " is null.";
                        for (int size3 = diz.size() - 1; size3 >= size2; size3--) {
                            diz.remove(size3);
                        }
                        throw new java.lang.NullPointerException(str2);
                    } else if (next instanceof defpackage.dha) {
                        diz.a((defpackage.dha) next);
                    } else {
                        diz.add((java.lang.String) next);
                    }
                }
            } else if (list instanceof defpackage.djy) {
                diq2.addAll(list);
            } else {
                if (diq2 instanceof java.util.ArrayList) {
                    ((java.util.ArrayList) diq2).ensureCapacity(list.size() + diq2.size());
                }
                int size4 = diq2.size();
                for (java.lang.Object next2 : list) {
                    if (next2 == null) {
                        java.lang.String str3 = "Element at index " + (diq2.size() - size4) + " is null.";
                        for (int size5 = diq2.size() - 1; size5 >= size4; size5--) {
                            diq2.remove(size5);
                        }
                        throw new java.lang.NullPointerException(str3);
                    }
                    diq2.add(next2);
                }
            }
            defpackage.dfh a3 = bzf.b.a();
            dii.b();
            defpackage.def def3 = (defpackage.def) dii.a;
            if (a3 == null) {
                throw new java.lang.NullPointerException();
            }
            if (!def3.d.a()) {
                defpackage.diq diq3 = def3.d;
                int size6 = diq3.size();
                def3.d = diq3.a(size6 == 0 ? 10 : size6 << 1);
            }
            def3.d.add(a3);
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
            return ccq.a.a("/v1/createusersubscription", str, (defpackage.def) dih3, defpackage.deg.a);
        } catch (defpackage.byl e2) {
            defpackage.ccs e3 = defpackage.ccr.e();
            e3.b = e2;
            return e3.a(true).a();
        }
    }

    public final defpackage.ccr b(java.lang.String str, java.util.List list) {
        defpackage.dih dih;
        try {
            defpackage.ccq ccq = this.a;
            defpackage.bzh bzh = this.h;
            defpackage.dii dii = (defpackage.dii) defpackage.deh.e.a(defpackage.bg.ao);
            java.lang.String a2 = bzh.a.a();
            dii.b();
            defpackage.deh deh = (defpackage.deh) dii.a;
            if (a2 == null) {
                throw new java.lang.NullPointerException();
            }
            deh.a |= 1;
            deh.b = a2;
            dii.b();
            defpackage.deh deh2 = (defpackage.deh) dii.a;
            if (!deh2.c.a()) {
                defpackage.diq diq = deh2.c;
                int size = diq.size();
                deh2.c = diq.a(size == 0 ? 10 : size << 1);
            }
            defpackage.diq diq2 = deh2.c;
            defpackage.dim.a((java.lang.Object) list);
            if (list instanceof defpackage.diz) {
                java.util.List d2 = ((defpackage.diz) list).d();
                defpackage.diz diz = (defpackage.diz) diq2;
                int size2 = diq2.size();
                for (java.lang.Object next : d2) {
                    if (next == null) {
                        java.lang.String str2 = "Element at index " + (diz.size() - size2) + " is null.";
                        for (int size3 = diz.size() - 1; size3 >= size2; size3--) {
                            diz.remove(size3);
                        }
                        throw new java.lang.NullPointerException(str2);
                    } else if (next instanceof defpackage.dha) {
                        diz.a((defpackage.dha) next);
                    } else {
                        diz.add((java.lang.String) next);
                    }
                }
            } else if (list instanceof defpackage.djy) {
                diq2.addAll(list);
            } else {
                if (diq2 instanceof java.util.ArrayList) {
                    ((java.util.ArrayList) diq2).ensureCapacity(list.size() + diq2.size());
                }
                int size4 = diq2.size();
                for (java.lang.Object next2 : list) {
                    if (next2 == null) {
                        java.lang.String str3 = "Element at index " + (diq2.size() - size4) + " is null.";
                        for (int size5 = diq2.size() - 1; size5 >= size4; size5--) {
                            diq2.remove(size5);
                        }
                        throw new java.lang.NullPointerException(str3);
                    }
                    diq2.add(next2);
                }
            }
            defpackage.dfh a3 = bzh.b.a();
            dii.b();
            defpackage.deh deh3 = (defpackage.deh) dii.a;
            if (a3 == null) {
                throw new java.lang.NullPointerException();
            }
            if (!deh3.d.a()) {
                defpackage.diq diq3 = deh3.d;
                int size6 = diq3.size();
                deh3.d = diq3.a(size6 == 0 ? 10 : size6 << 1);
            }
            deh3.d.add(a3);
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
            return ccq.a.a("/v1/deleteusersubscription", str, (defpackage.deh) dih3, defpackage.dei.a);
        } catch (defpackage.byl e2) {
            defpackage.ccs e3 = defpackage.ccr.e();
            e3.b = e2;
            return e3.a(true).a();
        }
    }

    public final defpackage.ccr a(java.lang.String str, defpackage.btw btw, boolean z) {
        defpackage.dih dih;
        defpackage.dih dih2;
        defpackage.dey dey;
        defpackage.dih dih3;
        try {
            defpackage.ccq ccq = this.a;
            defpackage.bzu bzu = this.i;
            defpackage.dii dii = (defpackage.dii) defpackage.deq.e.a(defpackage.bg.ao);
            java.lang.String a2 = bzu.a.a();
            dii.b();
            defpackage.deq deq = (defpackage.deq) dii.a;
            if (a2 == null) {
                throw new java.lang.NullPointerException();
            }
            deq.a |= 1;
            deq.b = a2;
            for (defpackage.bts bts : btw.a()) {
                defpackage.dii dii2 = (defpackage.dii) defpackage.dez.d.a(defpackage.bg.ao);
                defpackage.btu a3 = bts.a();
                defpackage.dii dii3 = (defpackage.dii) defpackage.deb.d.a(defpackage.bg.ao);
                java.lang.String a4 = a3.a();
                dii3.b();
                defpackage.deb deb = (defpackage.deb) dii3.a;
                if (a4 == null) {
                    throw new java.lang.NullPointerException();
                }
                deb.a |= 1;
                deb.b = a4;
                if (!android.text.TextUtils.isEmpty(a3.b())) {
                    java.lang.String b2 = a3.b();
                    dii3.b();
                    defpackage.deb deb2 = (defpackage.deb) dii3.a;
                    if (b2 == null) {
                        throw new java.lang.NullPointerException();
                    }
                    deb2.a |= 2;
                    deb2.c = b2;
                }
                if (dii3.b) {
                    dih2 = dii3.a;
                } else {
                    defpackage.dih dih4 = dii3.a;
                    defpackage.djz.a.a((java.lang.Object) dih4).c(dih4);
                    dii3.b = true;
                    dih2 = dii3.a;
                }
                defpackage.dih dih5 = dih2;
                if (!defpackage.dih.a(dih5, java.lang.Boolean.TRUE.booleanValue())) {
                    throw new defpackage.dkw();
                }
                defpackage.deb deb3 = (defpackage.deb) dih5;
                dii2.b();
                defpackage.dez dez = (defpackage.dez) dii2.a;
                if (deb3 == null) {
                    throw new java.lang.NullPointerException();
                }
                dez.b = deb3;
                dez.a |= 1;
                defpackage.btr b3 = bts.b();
                if (b3 == defpackage.btr.NOTIFY) {
                    dey = defpackage.dey.NOTIFY;
                } else if (b3 == defpackage.btr.DROP) {
                    dey = defpackage.dey.DROP;
                } else {
                    dey = defpackage.dey.NOTIFY_PREFERENCE_UNKNOWN;
                }
                dii2.b();
                defpackage.dez dez2 = (defpackage.dez) dii2.a;
                if (dey == null) {
                    throw new java.lang.NullPointerException();
                }
                dez2.a |= 2;
                dez2.c = dey.e;
                if (dii2.b) {
                    dih3 = dii2.a;
                } else {
                    defpackage.dih dih6 = dii2.a;
                    defpackage.djz.a.a((java.lang.Object) dih6).c(dih6);
                    dii2.b = true;
                    dih3 = dii2.a;
                }
                defpackage.dih dih7 = dih3;
                if (!defpackage.dih.a(dih7, java.lang.Boolean.TRUE.booleanValue())) {
                    throw new defpackage.dkw();
                }
                defpackage.dez dez3 = (defpackage.dez) dih7;
                dii.b();
                defpackage.deq deq2 = (defpackage.deq) dii.a;
                if (dez3 == null) {
                    throw new java.lang.NullPointerException();
                }
                if (!deq2.c.a()) {
                    defpackage.diq diq = deq2.c;
                    int size = diq.size();
                    deq2.c = diq.a(size == 0 ? 10 : size << 1);
                }
                deq2.c.add(dez3);
            }
            if (z) {
                defpackage.dfh a5 = bzu.b.a();
                dii.b();
                defpackage.deq deq3 = (defpackage.deq) dii.a;
                if (a5 == null) {
                    throw new java.lang.NullPointerException();
                }
                deq3.d = a5;
                deq3.a |= 4;
            }
            if (dii.b) {
                dih = dii.a;
            } else {
                defpackage.dih dih8 = dii.a;
                defpackage.djz.a.a((java.lang.Object) dih8).c(dih8);
                dii.b = true;
                dih = dii.a;
            }
            defpackage.dih dih9 = dih;
            if (!defpackage.dih.a(dih9, java.lang.Boolean.TRUE.booleanValue())) {
                throw new defpackage.dkw();
            }
            return ccq.a.a("/v1/setuserpreference", str, (defpackage.deq) dih9, defpackage.der.a);
        } catch (defpackage.byl e2) {
            defpackage.ccs e3 = defpackage.ccr.e();
            e3.b = e2;
            return e3.a(true).a();
        }
    }
}
