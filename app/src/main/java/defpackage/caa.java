package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: caa  reason: default package */
/* compiled from: PG */
public final class caa {
    public buc a;
    public bzc b;

    public final dew a(int i, List list) {
        dih dih;
        dgm a2 = bzd.a(i);
        dii dii = (dii) dew.f.a(bg.ao);
        String a3 = this.a.a();
        dii.b();
        dew dew = (dew) dii.a;
        if (a3 == null) {
            throw new NullPointerException();
        }
        dew.a |= 1;
        dew.b = a3;
        dii.b();
        dew dew2 = (dew) dii.a;
        if (a2 == null) {
            throw new NullPointerException();
        }
        dew2.d = a2;
        dew2.a |= 2;
        dii.b();
        dew dew3 = (dew) dii.a;
        if (!dew3.c.a()) {
            diq diq = dew3.c;
            int size = diq.size();
            dew3.c = diq.a(size == 0 ? 10 : size << 1);
        }
        diq diq2 = dew3.c;
        dim.a(list);
        if (list instanceof diz) {
            List d = ((diz) list).d();
            diz diz = (diz) diq2;
            int size2 = diq2.size();
            for (Object obj : d) {
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
        try {
            dfh a4 = this.b.a();
            dii dii2 = (dii) ddu.d.a(bg.ao);
            dii2.b();
            ddu ddu = (ddu) dii2.a;
            if (a4 == null) {
                throw new NullPointerException();
            }
            ddu.c = a4;
            ddu.b = 2;
            dii.j(dii2);
            if (dii.b) {
                dih = dii.a;
            } else {
                dih dih2 = dii.a;
                djz.a.a(dih2).c(dih2);
                dii.b = true;
                dih = dii.a;
            }
            dih dih3 = dih;
            if (dih.a(dih3, Boolean.TRUE.booleanValue())) {
                return (dew) dih3;
            }
            throw new dkw();
        } catch (byl e) {
            bty.b("UpdateThreadStateRequestBuilder", "Failed to create target for analyticsinfo", new Object[0]);
            String format = String.format("Chime Android SDK - Client Id [%s]", this.a.a());
            dii dii3 = (dii) ddu.d.a(bg.ao);
            dii3.b();
            ddu ddu2 = (ddu) dii3.a;
            if (format == null) {
                throw new NullPointerException();
            }
            ddu2.b = 1;
            ddu2.c = format;
            dii.j(dii3);
        }
    }
}
