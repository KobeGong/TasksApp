package defpackage;

/* renamed from: bzw reason: default package */
/* compiled from: PG */
public final class bzw {
    public defpackage.buc a;
    public defpackage.byk b;
    public defpackage.bzb c;
    public defpackage.bzc d;

    public final defpackage.des a() {
        defpackage.dih dih;
        defpackage.dih dih2;
        defpackage.dih dih3;
        defpackage.dih dih4;
        defpackage.dii dii = (defpackage.dii) defpackage.dfa.d.a(defpackage.bg.ao);
        defpackage.dii j = ((defpackage.dii) defpackage.dfb.d.a(defpackage.bg.ao)).a(java.lang.Long.parseLong(this.a.d())).j(this.b.a());
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
        if (this.a.c() != null && !this.a.c().isEmpty()) {
            defpackage.dii a3 = ((defpackage.dii) defpackage.dfc.b.a(defpackage.bg.ao)).a((java.lang.Iterable) this.a.c());
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
        defpackage.dii dii2 = (defpackage.dii) defpackage.des.g.a(defpackage.bg.ao);
        java.lang.String a4 = this.a.a();
        dii2.b();
        defpackage.des des = (defpackage.des) dii2.a;
        if (a4 == null) {
            throw new java.lang.NullPointerException();
        }
        des.a |= 1;
        des.b = a4;
        defpackage.dfh a5 = this.d.a();
        dii2.b();
        defpackage.des des2 = (defpackage.des) dii2.a;
        if (a5 == null) {
            throw new java.lang.NullPointerException();
        }
        des2.c = a5;
        des2.a |= 2;
        defpackage.dfd a6 = this.c.a();
        dii2.b();
        defpackage.des des3 = (defpackage.des) dii2.a;
        if (a6 == null) {
            throw new java.lang.NullPointerException();
        }
        des3.e = a6;
        des3.a |= 4;
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
        defpackage.des des4 = (defpackage.des) dii2.a;
        if (dfa == null) {
            throw new java.lang.NullPointerException();
        }
        des4.f = dfa;
        des4.a |= 8;
        if (this.a.b() != null) {
            java.util.List b2 = this.a.b();
            dii2.b();
            defpackage.des des5 = (defpackage.des) dii2.a;
            if (!des5.d.a()) {
                defpackage.diq diq = des5.d;
                int size = diq.size();
                des5.d = diq.a(size == 0 ? 10 : size << 1);
            }
            defpackage.diq diq2 = des5.d;
            defpackage.dim.a((java.lang.Object) b2);
            if (b2 instanceof defpackage.diz) {
                java.util.List d2 = ((defpackage.diz) b2).d();
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
            } else if (b2 instanceof defpackage.djy) {
                diq2.addAll(b2);
            } else {
                if ((diq2 instanceof java.util.ArrayList) && (b2 instanceof java.util.Collection)) {
                    ((java.util.ArrayList) diq2).ensureCapacity(b2.size() + diq2.size());
                }
                int size4 = diq2.size();
                for (java.lang.Object next2 : b2) {
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
        }
        if (dii2.b) {
            dih3 = dii2.a;
        } else {
            defpackage.dih dih11 = dii2.a;
            defpackage.djz.a.a((java.lang.Object) dih11).c(dih11);
            dii2.b = true;
            dih3 = dii2.a;
        }
        defpackage.dih dih12 = dih3;
        if (defpackage.dih.a(dih12, java.lang.Boolean.TRUE.booleanValue())) {
            return (defpackage.des) dih12;
        }
        throw new defpackage.dkw();
    }
}
