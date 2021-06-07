package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: bza  reason: default package */
/* compiled from: PG */
public final class bza {
    public ccq a;
    public bzw b;
    public bzr c;
    public caa d;
    public bzn e;
    public bzj f;
    public bzf g;
    public bzh h;
    public bzu i;

    public final ccr a(String str) {
        try {
            ccq ccq = this.a;
            return ccq.a.a("/v1/storetarget", str, this.b.a(), det.a);
        } catch (byl e2) {
            ccs e3 = ccr.e();
            e3.b = e2;
            return e3.a(true).a();
        }
    }

    public final ccr b(String str) {
        dih dih;
        dih dih2;
        dih dih3;
        dih dih4;
        try {
            ccq ccq = this.a;
            bzr bzr = this.c;
            dii dii = (dii) dfa.d.a(bg.ao);
            dii j = ((dii) dfb.d.a(bg.ao)).a(Long.parseLong(bzr.a.d())).j(bzr.b.a());
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
            if (bzr.a.c() != null && !bzr.a.c().isEmpty()) {
                dii a3 = ((dii) dfc.b.a(bg.ao)).a(bzr.a.c());
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
            dii dii2 = (dii) deo.e.a(bg.ao);
            String a4 = bzr.a.a();
            dii2.b();
            deo deo = (deo) dii2.a;
            if (a4 == null) {
                throw new NullPointerException();
            }
            deo.a |= 1;
            deo.b = a4;
            dfh a5 = bzr.c.a();
            dii2.b();
            deo deo2 = (deo) dii2.a;
            if (a5 == null) {
                throw new NullPointerException();
            }
            deo2.c = a5;
            deo2.a |= 2;
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
            deo deo3 = (deo) dii2.a;
            if (dfa == null) {
                throw new NullPointerException();
            }
            deo3.d = dfa;
            deo3.a |= 4;
            if (dii2.b) {
                dih3 = dii2.a;
            } else {
                dih dih11 = dii2.a;
                djz.a.a(dih11).c(dih11);
                dii2.b = true;
                dih3 = dii2.a;
            }
            dih dih12 = dih3;
            if (!dih.a(dih12, Boolean.TRUE.booleanValue())) {
                throw new dkw();
            }
            return ccq.a.a("/v1/removetarget", str, (deo) dih12, dep.a);
        } catch (byl e2) {
            ccs e3 = ccr.e();
            e3.b = e2;
            return e3.a(true).a();
        }
    }

    public final ccr a(String str, long j, List list) {
        dih dih;
        try {
            ccq ccq = this.a;
            bzn bzn = this.e;
            dii dii = (dii) del.h.a(bg.ao);
            String a2 = bzn.a.a();
            dii.b();
            del del = (del) dii.a;
            if (a2 == null) {
                throw new NullPointerException();
            }
            del.a |= 1;
            del.b = a2;
            dfi b2 = bzn.c.b();
            dii.b();
            del del2 = (del) dii.a;
            if (b2 == null) {
                throw new NullPointerException();
            }
            del2.c = b2;
            del2.a |= 2;
            dfd a3 = bzn.b.a();
            dii.b();
            del del3 = (del) dii.a;
            if (a3 == null) {
                throw new NullPointerException();
            }
            del3.f = a3;
            del3.a |= 32;
            dem dem = dem.RENDER_ALL;
            dii.b();
            del del4 = (del) dii.a;
            if (dem == null) {
                throw new NullPointerException();
            }
            del4.a |= 16;
            del4.e = dem.c;
            dii.b();
            del del5 = (del) dii.a;
            del5.a |= 4;
            del5.d = j;
            dii.b();
            del del6 = (del) dii.a;
            if (!del6.g.a()) {
                diq diq = del6.g;
                int size = diq.size();
                del6.g = diq.a(size == 0 ? 10 : size << 1);
            }
            diq diq2 = del6.g;
            dim.a(list);
            if (list instanceof diz) {
                List d2 = ((diz) list).d();
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
            } else if (list instanceof djy) {
                diq2.addAll(list);
            } else {
                if ((diq2 instanceof ArrayList) && (list instanceof Collection)) {
                    ((ArrayList) diq2).ensureCapacity(list.size() + diq2.size());
                }
                int size4 = diq2.size();
                for (Object obj2 : list) {
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
            return ccq.a.a("/v1/fetchupdatedthreads", str, (del) dih3, den.d);
        } catch (byl e2) {
            ccs e3 = ccr.e();
            e3.b = e2;
            return e3.a(true).a();
        }
    }

    public final ccr a(String str, Long l) {
        dih dih;
        try {
            ccq ccq = this.a;
            bzj bzj = this.f;
            dii dii = (dii) dej.f.a(bg.ao);
            String a2 = bzj.a.a();
            dii.b();
            dej dej = (dej) dii.a;
            if (a2 == null) {
                throw new NullPointerException();
            }
            dej.a |= 1;
            dej.b = a2;
            dfi b2 = bzj.c.b();
            dii.b();
            dej dej2 = (dej) dii.a;
            if (b2 == null) {
                throw new NullPointerException();
            }
            dej2.c = b2;
            dej2.a |= 2;
            dfd a3 = bzj.b.a();
            dii.b();
            dej dej3 = (dej) dii.a;
            if (a3 == null) {
                throw new NullPointerException();
            }
            dej3.e = a3;
            dej3.a |= 16;
            if (l != null && l.longValue() > 0) {
                long longValue = l.longValue();
                dii.b();
                dej dej4 = (dej) dii.a;
                dej4.a |= 4;
                dej4.d = longValue;
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
            return ccq.a.a("/v1/fetchlatestthreads", str, (dej) dih3, dek.e);
        } catch (byl e2) {
            ccs e3 = ccr.e();
            e3.b = e2;
            return e3.a(true).a();
        }
    }

    public final ccr a(String str, List list) {
        dih dih;
        try {
            ccq ccq = this.a;
            bzf bzf = this.g;
            dii dii = (dii) def.e.a(bg.ao);
            String a2 = bzf.a.a();
            dii.b();
            def def = (def) dii.a;
            if (a2 == null) {
                throw new NullPointerException();
            }
            def.a |= 1;
            def.b = a2;
            dii.b();
            def def2 = (def) dii.a;
            if (!def2.c.a()) {
                diq diq = def2.c;
                int size = diq.size();
                def2.c = diq.a(size == 0 ? 10 : size << 1);
            }
            diq diq2 = def2.c;
            dim.a(list);
            if (list instanceof diz) {
                List d2 = ((diz) list).d();
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
            } else if (list instanceof djy) {
                diq2.addAll(list);
            } else {
                if (diq2 instanceof ArrayList) {
                    ((ArrayList) diq2).ensureCapacity(list.size() + diq2.size());
                }
                int size4 = diq2.size();
                for (Object obj2 : list) {
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
            dfh a3 = bzf.b.a();
            dii.b();
            def def3 = (def) dii.a;
            if (a3 == null) {
                throw new NullPointerException();
            }
            if (!def3.d.a()) {
                diq diq3 = def3.d;
                int size6 = diq3.size();
                def3.d = diq3.a(size6 == 0 ? 10 : size6 << 1);
            }
            def3.d.add(a3);
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
            return ccq.a.a("/v1/createusersubscription", str, (def) dih3, deg.a);
        } catch (byl e2) {
            ccs e3 = ccr.e();
            e3.b = e2;
            return e3.a(true).a();
        }
    }

    public final ccr b(String str, List list) {
        dih dih;
        try {
            ccq ccq = this.a;
            bzh bzh = this.h;
            dii dii = (dii) deh.e.a(bg.ao);
            String a2 = bzh.a.a();
            dii.b();
            deh deh = (deh) dii.a;
            if (a2 == null) {
                throw new NullPointerException();
            }
            deh.a |= 1;
            deh.b = a2;
            dii.b();
            deh deh2 = (deh) dii.a;
            if (!deh2.c.a()) {
                diq diq = deh2.c;
                int size = diq.size();
                deh2.c = diq.a(size == 0 ? 10 : size << 1);
            }
            diq diq2 = deh2.c;
            dim.a(list);
            if (list instanceof diz) {
                List d2 = ((diz) list).d();
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
            } else if (list instanceof djy) {
                diq2.addAll(list);
            } else {
                if (diq2 instanceof ArrayList) {
                    ((ArrayList) diq2).ensureCapacity(list.size() + diq2.size());
                }
                int size4 = diq2.size();
                for (Object obj2 : list) {
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
            dfh a3 = bzh.b.a();
            dii.b();
            deh deh3 = (deh) dii.a;
            if (a3 == null) {
                throw new NullPointerException();
            }
            if (!deh3.d.a()) {
                diq diq3 = deh3.d;
                int size6 = diq3.size();
                deh3.d = diq3.a(size6 == 0 ? 10 : size6 << 1);
            }
            deh3.d.add(a3);
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
            return ccq.a.a("/v1/deleteusersubscription", str, (deh) dih3, dei.a);
        } catch (byl e2) {
            ccs e3 = ccr.e();
            e3.b = e2;
            return e3.a(true).a();
        }
    }

    public final ccr a(String str, btw btw, boolean z) {
        dih dih;
        dih dih2;
        dey dey;
        dih dih3;
        try {
            ccq ccq = this.a;
            bzu bzu = this.i;
            dii dii = (dii) deq.e.a(bg.ao);
            String a2 = bzu.a.a();
            dii.b();
            deq deq = (deq) dii.a;
            if (a2 == null) {
                throw new NullPointerException();
            }
            deq.a |= 1;
            deq.b = a2;
            for (bts bts : btw.a()) {
                dii dii2 = (dii) dez.d.a(bg.ao);
                btu a3 = bts.a();
                dii dii3 = (dii) deb.d.a(bg.ao);
                String a4 = a3.a();
                dii3.b();
                deb deb = (deb) dii3.a;
                if (a4 == null) {
                    throw new NullPointerException();
                }
                deb.a |= 1;
                deb.b = a4;
                if (!TextUtils.isEmpty(a3.b())) {
                    String b2 = a3.b();
                    dii3.b();
                    deb deb2 = (deb) dii3.a;
                    if (b2 == null) {
                        throw new NullPointerException();
                    }
                    deb2.a |= 2;
                    deb2.c = b2;
                }
                if (dii3.b) {
                    dih2 = dii3.a;
                } else {
                    dih dih4 = dii3.a;
                    djz.a.a(dih4).c(dih4);
                    dii3.b = true;
                    dih2 = dii3.a;
                }
                dih dih5 = dih2;
                if (!dih.a(dih5, Boolean.TRUE.booleanValue())) {
                    throw new dkw();
                }
                deb deb3 = (deb) dih5;
                dii2.b();
                dez dez = (dez) dii2.a;
                if (deb3 == null) {
                    throw new NullPointerException();
                }
                dez.b = deb3;
                dez.a |= 1;
                btr b3 = bts.b();
                if (b3 == btr.NOTIFY) {
                    dey = dey.NOTIFY;
                } else if (b3 == btr.DROP) {
                    dey = dey.DROP;
                } else {
                    dey = dey.NOTIFY_PREFERENCE_UNKNOWN;
                }
                dii2.b();
                dez dez2 = (dez) dii2.a;
                if (dey == null) {
                    throw new NullPointerException();
                }
                dez2.a |= 2;
                dez2.c = dey.e;
                if (dii2.b) {
                    dih3 = dii2.a;
                } else {
                    dih dih6 = dii2.a;
                    djz.a.a(dih6).c(dih6);
                    dii2.b = true;
                    dih3 = dii2.a;
                }
                dih dih7 = dih3;
                if (!dih.a(dih7, Boolean.TRUE.booleanValue())) {
                    throw new dkw();
                }
                dez dez3 = (dez) dih7;
                dii.b();
                deq deq2 = (deq) dii.a;
                if (dez3 == null) {
                    throw new NullPointerException();
                }
                if (!deq2.c.a()) {
                    diq diq = deq2.c;
                    int size = diq.size();
                    deq2.c = diq.a(size == 0 ? 10 : size << 1);
                }
                deq2.c.add(dez3);
            }
            if (z) {
                dfh a5 = bzu.b.a();
                dii.b();
                deq deq3 = (deq) dii.a;
                if (a5 == null) {
                    throw new NullPointerException();
                }
                deq3.d = a5;
                deq3.a |= 4;
            }
            if (dii.b) {
                dih = dii.a;
            } else {
                dih dih8 = dii.a;
                djz.a.a(dih8).c(dih8);
                dii.b = true;
                dih = dii.a;
            }
            dih dih9 = dih;
            if (!dih.a(dih9, Boolean.TRUE.booleanValue())) {
                throw new dkw();
            }
            return ccq.a.a("/v1/setuserpreference", str, (deq) dih9, der.a);
        } catch (byl e2) {
            ccs e3 = ccr.e();
            e3.b = e2;
            return e3.a(true).a();
        }
    }
}
