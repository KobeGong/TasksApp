package defpackage;

/* renamed from: caa reason: default package */
/* compiled from: PG */
public final class caa {
    public defpackage.buc a;
    public defpackage.bzc b;

    public final defpackage.dew a(int i, java.util.List list) {
        defpackage.dih dih;
        defpackage.dgm a2 = defpackage.bzd.a(i);
        defpackage.dii dii = (defpackage.dii) defpackage.dew.f.a(defpackage.bg.ao);
        java.lang.String a3 = this.a.a();
        dii.b();
        defpackage.dew dew = (defpackage.dew) dii.a;
        if (a3 == null) {
            throw new java.lang.NullPointerException();
        }
        dew.a |= 1;
        dew.b = a3;
        dii.b();
        defpackage.dew dew2 = (defpackage.dew) dii.a;
        if (a2 == null) {
            throw new java.lang.NullPointerException();
        }
        dew2.d = a2;
        dew2.a |= 2;
        dii.b();
        defpackage.dew dew3 = (defpackage.dew) dii.a;
        if (!dew3.c.a()) {
            defpackage.diq diq = dew3.c;
            int size = diq.size();
            dew3.c = diq.a(size == 0 ? 10 : size << 1);
        }
        defpackage.diq diq2 = dew3.c;
        defpackage.dim.a((java.lang.Object) list);
        if (list instanceof defpackage.diz) {
            java.util.List d = ((defpackage.diz) list).d();
            defpackage.diz diz = (defpackage.diz) diq2;
            int size2 = diq2.size();
            for (java.lang.Object next : d) {
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
        } else if (list instanceof defpackage.djy) {
            diq2.addAll(list);
        } else {
            if (diq2 instanceof java.util.ArrayList) {
                ((java.util.ArrayList) diq2).ensureCapacity(list.size() + diq2.size());
            }
            int size4 = diq2.size();
            for (java.lang.Object next2 : list) {
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
        try {
            defpackage.dfh a4 = this.b.a();
            defpackage.dii dii2 = (defpackage.dii) defpackage.ddu.d.a(defpackage.bg.ao);
            dii2.b();
            defpackage.ddu ddu = (defpackage.ddu) dii2.a;
            if (a4 == null) {
                throw new java.lang.NullPointerException();
            }
            ddu.c = a4;
            ddu.b = 2;
            dii.j(dii2);
            if (dii.b) {
                dih = dii.a;
            } else {
                defpackage.dih dih2 = dii.a;
                defpackage.djz.a.a((java.lang.Object) dih2).c(dih2);
                dii.b = true;
                dih = dii.a;
            }
            defpackage.dih dih3 = dih;
            if (defpackage.dih.a(dih3, java.lang.Boolean.TRUE.booleanValue())) {
                return (defpackage.dew) dih3;
            }
            throw new defpackage.dkw();
        } catch (defpackage.byl e) {
            defpackage.bty.b("UpdateThreadStateRequestBuilder", "Failed to create target for analyticsinfo", new java.lang.Object[0]);
            java.lang.String format = java.lang.String.format("Chime Android SDK - Client Id [%s]", new java.lang.Object[]{this.a.a()});
            defpackage.dii dii3 = (defpackage.dii) defpackage.ddu.d.a(defpackage.bg.ao);
            dii3.b();
            defpackage.ddu ddu2 = (defpackage.ddu) dii3.a;
            if (format == null) {
                throw new java.lang.NullPointerException();
            }
            ddu2.b = 1;
            ddu2.c = format;
            dii.j(dii3);
        }
    }
}
