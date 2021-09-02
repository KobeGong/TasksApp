package defpackage;

/* renamed from: cqz reason: default package */
/* compiled from: PG */
public final class cqz {
    public static final defpackage.cqz a = new defpackage.cqz(defpackage.cta.a, false);
    public static final defpackage.cqz b = new defpackage.cqz(defpackage.cta.a, true);
    public final defpackage.css c;
    public final boolean d;

    cqz(defpackage.css css, boolean z) {
        this.c = css;
        this.d = z;
    }

    public static defpackage.cra a() {
        return new defpackage.cra();
    }

    public static defpackage.cqz a(defpackage.crb crb) {
        defpackage.cra cra = new defpackage.cra();
        boolean z = crb.d;
        if (!cra.c) {
            throw new java.lang.IllegalStateException("setInverted cannot be called on a builder that has fields.");
        }
        cra.b = z;
        for (java.lang.Integer intValue : crb.c) {
            cra.a.put(java.lang.Integer.valueOf(intValue.intValue()), b);
        }
        for (java.lang.Integer intValue2 : java.util.Collections.unmodifiableMap(crb.b).keySet()) {
            int intValue3 = intValue2.intValue();
            cra.a.put(java.lang.Integer.valueOf(intValue3), a((defpackage.crb) java.util.Collections.unmodifiableMap(crb.b).get(java.lang.Integer.valueOf(intValue3))));
        }
        return cra.a();
    }

    public final java.lang.String toString() {
        defpackage.crs b2 = defpackage.cky.b((java.lang.Object) this);
        if (equals(a)) {
            b2.a().b = "empty()";
        } else if (equals(b)) {
            b2.a().b = "all()";
        } else {
            b2.a("fields", (java.lang.Object) this.c).a("inverted", this.d);
        }
        return b2.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        defpackage.cqz cqz = (defpackage.cqz) obj;
        if (!defpackage.cru.d(this.c, cqz.c) || !defpackage.cru.d(java.lang.Boolean.valueOf(this.d), java.lang.Boolean.valueOf(cqz.d))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.c, java.lang.Boolean.valueOf(this.d)});
    }

    public final defpackage.crb b() {
        defpackage.dih dih;
        defpackage.dii dii = (defpackage.dii) defpackage.crb.e.a(defpackage.bg.ao);
        boolean z = this.d;
        dii.b();
        ((defpackage.crb) dii.a).d = z;
        defpackage.cth cth = (defpackage.cth) ((defpackage.csv) this.c.keySet()).iterator();
        while (cth.hasNext()) {
            int intValue = ((java.lang.Integer) cth.next()).intValue();
            defpackage.cqz cqz = (defpackage.cqz) this.c.get(java.lang.Integer.valueOf(intValue));
            if (cqz.equals(b)) {
                dii.b();
                defpackage.crb crb = (defpackage.crb) dii.a;
                if (!crb.c.a()) {
                    defpackage.dip dip = crb.c;
                    int size = dip.size();
                    crb.c = dip.b(size == 0 ? 10 : size << 1);
                }
                crb.c.d(intValue);
            } else {
                defpackage.crb b2 = cqz.b();
                if (b2 == null) {
                    throw new java.lang.NullPointerException();
                }
                dii.b();
                defpackage.crb crb2 = (defpackage.crb) dii.a;
                if (!crb2.b.a) {
                    crb2.b = crb2.b.a();
                }
                crb2.b.put(java.lang.Integer.valueOf(intValue), b2);
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
        if (defpackage.dih.a(dih3, java.lang.Boolean.TRUE.booleanValue())) {
            return (defpackage.crb) dih3;
        }
        throw new defpackage.dkw();
    }
}
