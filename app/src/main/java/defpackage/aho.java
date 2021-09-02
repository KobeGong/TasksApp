package defpackage;

/* renamed from: aho reason: default package */
/* compiled from: PG */
public final class aho {
    public final defpackage.qr a = new defpackage.qr();
    public final defpackage.qx b = new defpackage.qx();

    public final void a() {
        this.a.clear();
        this.b.c();
    }

    public final void a(defpackage.afv afv, defpackage.afb afb) {
        defpackage.ahp ahp = (defpackage.ahp) this.a.get(afv);
        if (ahp == null) {
            ahp = defpackage.ahp.a();
            this.a.put(afv, ahp);
        }
        ahp.b = afb;
        ahp.a |= 4;
    }

    public final boolean a(defpackage.afv afv) {
        defpackage.ahp ahp = (defpackage.ahp) this.a.get(afv);
        return (ahp == null || (ahp.a & 1) == 0) ? false : true;
    }

    public final defpackage.afb a(defpackage.afv afv, int i) {
        defpackage.afb afb = null;
        int a2 = this.a.a((java.lang.Object) afv);
        if (a2 >= 0) {
            defpackage.ahp ahp = (defpackage.ahp) this.a.c(a2);
            if (!(ahp == null || (ahp.a & i) == 0)) {
                ahp.a &= i ^ -1;
                if (i == 4) {
                    afb = ahp.b;
                } else if (i == 8) {
                    afb = ahp.c;
                } else {
                    throw new java.lang.IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((ahp.a & 12) == 0) {
                    this.a.d(a2);
                    defpackage.ahp.a(ahp);
                }
            }
        }
        return afb;
    }

    public final void a(long j, defpackage.afv afv) {
        this.b.a(j, afv);
    }

    public final void b(defpackage.afv afv, defpackage.afb afb) {
        defpackage.ahp ahp = (defpackage.ahp) this.a.get(afv);
        if (ahp == null) {
            ahp = defpackage.ahp.a();
            this.a.put(afv, ahp);
        }
        ahp.c = afb;
        ahp.a |= 8;
    }

    /* access modifiers changed from: 0000 */
    public final void b(defpackage.afv afv) {
        defpackage.ahp ahp = (defpackage.ahp) this.a.get(afv);
        if (ahp == null) {
            ahp = defpackage.ahp.a();
            this.a.put(afv, ahp);
        }
        ahp.a |= 1;
    }

    /* access modifiers changed from: 0000 */
    public final void c(defpackage.afv afv) {
        defpackage.ahp ahp = (defpackage.ahp) this.a.get(afv);
        if (ahp != null) {
            ahp.a &= -2;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void d(defpackage.afv afv) {
        int b2 = this.b.b() - 1;
        while (true) {
            if (b2 < 0) {
                break;
            } else if (afv == this.b.b(b2)) {
                defpackage.qx qxVar = this.b;
                if (qxVar.d[b2] != defpackage.qx.a) {
                    qxVar.d[b2] = defpackage.qx.a;
                    qxVar.b = true;
                }
            } else {
                b2--;
            }
        }
        defpackage.ahp ahp = (defpackage.ahp) this.a.remove(afv);
        if (ahp != null) {
            defpackage.ahp.a(ahp);
        }
    }
}
