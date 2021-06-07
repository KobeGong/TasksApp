package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: bzw  reason: default package */
/* compiled from: PG */
public final class bzw {
    public buc a;
    public byk b;
    public bzb c;
    public bzc d;

    public final des a() {
        dih dih;
        dih dih2;
        dih dih3;
        dih dih4;
        dii dii = (dii) dfa.d.a(bg.ao);
        dii j = ((dii) dfb.d.a(bg.ao)).a(Long.parseLong(this.a.d())).j(this.b.a());
        if (j.b) {
            dih = j.a;
        } else {
            dih dih5 = j.a;
            djz.a.a(dih5).c(dih5);
            j.b = true;
            dih = j.a;
        }
        dih dih6 = dih;
        if (!dih.a(dih6, Boolean.TRUE.booleanValue())) {
            throw new dkw();
        }
        dii a2 = dii.a((dfb) dih6);
        if (this.a.c() != null && !this.a.c().isEmpty()) {
            dii a3 = ((dii) dfc.b.a(bg.ao)).a(this.a.c());
            if (a3.b) {
                dih4 = a3.a;
            } else {
                dih dih7 = a3.a;
                djz.a.a(dih7).c(dih7);
                a3.b = true;
                dih4 = a3.a;
            }
            dih dih8 = dih4;
            if (!dih.a(dih8, Boolean.TRUE.booleanValue())) {
                throw new dkw();
            }
            a2.a((dfc) dih8);
        }
        dii dii2 = (dii) des.g.a(bg.ao);
        String a4 = this.a.a();
        dii2.b();
        des des = (des) dii2.a;
        if (a4 == null) {
            throw new NullPointerException();
        }
        des.a |= 1;
        des.b = a4;
        dfh a5 = this.d.a();
        dii2.b();
        des des2 = (des) dii2.a;
        if (a5 == null) {
            throw new NullPointerException();
        }
        des2.c = a5;
        des2.a |= 2;
        dfd a6 = this.c.a();
        dii2.b();
        des des3 = (des) dii2.a;
        if (a6 == null) {
            throw new NullPointerException();
        }
        des3.e = a6;
        des3.a |= 4;
        if (a2.b) {
            dih2 = a2.a;
        } else {
            dih dih9 = a2.a;
            djz.a.a(dih9).c(dih9);
            a2.b = true;
            dih2 = a2.a;
        }
        dih dih10 = dih2;
        if (!dih.a(dih10, Boolean.TRUE.booleanValue())) {
            throw new dkw();
        }
        dfa dfa = (dfa) dih10;
        dii2.b();
        des des4 = (des) dii2.a;
        if (dfa == null) {
            throw new NullPointerException();
        }
        des4.f = dfa;
        des4.a |= 8;
        if (this.a.b() != null) {
            List b2 = this.a.b();
            dii2.b();
            des des5 = (des) dii2.a;
            if (!des5.d.a()) {
                diq diq = des5.d;
                int size = diq.size();
                des5.d = diq.a(size == 0 ? 10 : size << 1);
            }
            diq diq2 = des5.d;
            dim.a(b2);
            if (b2 instanceof diz) {
                List d2 = ((diz) b2).d();
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
            } else if (b2 instanceof djy) {
                diq2.addAll(b2);
            } else {
                if ((diq2 instanceof ArrayList) && (b2 instanceof Collection)) {
                    ((ArrayList) diq2).ensureCapacity(b2.size() + diq2.size());
                }
                int size4 = diq2.size();
                for (Object obj2 : b2) {
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
        }
        if (dii2.b) {
            dih3 = dii2.a;
        } else {
            dih dih11 = dii2.a;
            djz.a.a(dih11).c(dih11);
            dii2.b = true;
            dih3 = dii2.a;
        }
        dih dih12 = dih3;
        if (dih.a(dih12, Boolean.TRUE.booleanValue())) {
            return (des) dih12;
        }
        throw new dkw();
    }
}
