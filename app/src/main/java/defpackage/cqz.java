package defpackage;

import java.util.Arrays;
import java.util.Collections;

/* renamed from: cqz  reason: default package */
/* compiled from: PG */
public final class cqz {
    public static final cqz a = new cqz(cta.a, false);
    public static final cqz b = new cqz(cta.a, true);
    public final css c;
    public final boolean d;

    cqz(css css, boolean z) {
        this.c = css;
        this.d = z;
    }

    public static cra a() {
        return new cra();
    }

    public static cqz a(crb crb) {
        cra cra = new cra();
        boolean z = crb.d;
        if (!cra.c) {
            throw new IllegalStateException("setInverted cannot be called on a builder that has fields.");
        }
        cra.b = z;
        for (Integer num : crb.c) {
            cra.a.put(Integer.valueOf(num.intValue()), b);
        }
        for (Integer num2 : Collections.unmodifiableMap(crb.b).keySet()) {
            int intValue = num2.intValue();
            cra.a.put(Integer.valueOf(intValue), a((crb) Collections.unmodifiableMap(crb.b).get(Integer.valueOf(intValue))));
        }
        return cra.a();
    }

    public final String toString() {
        crs b2 = cky.b(this);
        if (equals(a)) {
            b2.a().b = "empty()";
        } else if (equals(b)) {
            b2.a().b = "all()";
        } else {
            b2.a("fields", this.c).a("inverted", this.d);
        }
        return b2.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        cqz cqz = (cqz) obj;
        return cru.d(this.c, cqz.c) && cru.d(Boolean.valueOf(this.d), Boolean.valueOf(cqz.d));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Boolean.valueOf(this.d)});
    }

    public final crb b() {
        dih dih;
        dii dii = (dii) crb.e.a(bg.ao);
        boolean z = this.d;
        dii.b();
        ((crb) dii.a).d = z;
        cth cth = (cth) ((csv) this.c.keySet()).iterator();
        while (cth.hasNext()) {
            int intValue = ((Integer) cth.next()).intValue();
            cqz cqz = (cqz) this.c.get(Integer.valueOf(intValue));
            if (cqz.equals(b)) {
                dii.b();
                crb crb = (crb) dii.a;
                if (!crb.c.a()) {
                    dip dip = crb.c;
                    int size = dip.size();
                    crb.c = dip.b(size == 0 ? 10 : size << 1);
                }
                crb.c.d(intValue);
            } else {
                crb b2 = cqz.b();
                if (b2 == null) {
                    throw new NullPointerException();
                }
                dii.b();
                crb crb2 = (crb) dii.a;
                if (!crb2.b.a) {
                    crb2.b = crb2.b.a();
                }
                crb2.b.put(Integer.valueOf(intValue), b2);
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
        if (dih.a(dih3, Boolean.TRUE.booleanValue())) {
            return (crb) dih3;
        }
        throw new dkw();
    }
}
