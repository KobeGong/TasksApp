package defpackage;

/* renamed from: cj reason: default package */
/* compiled from: PG */
public final class cj extends defpackage.ch {
    public float ac = -1.0f;
    public int ad = -1;
    public int ae = -1;
    public int af = 0;
    private defpackage.cg ag = this.j;

    public cj() {
        new defpackage.ck();
        this.n.clear();
        this.n.add(this.ag);
    }

    public final void h(int i) {
        if (this.af != i) {
            this.af = i;
            this.n.clear();
            if (this.af == 1) {
                this.ag = this.i;
            } else {
                this.ag = this.j;
            }
            this.n.add(this.ag);
        }
    }

    public final defpackage.cg e(int i) {
        switch (i - 1) {
            case 1:
            case 3:
                if (this.af == 1) {
                    return this.ag;
                }
                break;
            case 2:
            case 4:
                if (this.af == 0) {
                    return this.ag;
                }
                break;
        }
        return null;
    }

    public final java.util.ArrayList l() {
        return this.n;
    }

    public final void a(defpackage.cd cdVar) {
        defpackage.cg cgVar;
        defpackage.cg cgVar2;
        defpackage.ci ciVar = (defpackage.ci) this.o;
        if (ciVar != null) {
            defpackage.cg e = ciVar.e(defpackage.bg.n);
            defpackage.cg e2 = ciVar.e(defpackage.bg.p);
            if (this.af == 0) {
                cgVar2 = ciVar.e(defpackage.bg.o);
                cgVar = ciVar.e(defpackage.bg.q);
            } else {
                cgVar = e2;
                cgVar2 = e;
            }
            if (this.ad != -1) {
                cdVar.a(defpackage.cd.a(cdVar, cdVar.a((java.lang.Object) this.ag), cdVar.a((java.lang.Object) cgVar2), this.ad, false));
            } else if (this.ae != -1) {
                cdVar.a(defpackage.cd.a(cdVar, cdVar.a((java.lang.Object) this.ag), cdVar.a((java.lang.Object) cgVar), -this.ae, false));
            } else if (this.ac != -1.0f) {
                defpackage.cf a = cdVar.a((java.lang.Object) this.ag);
                defpackage.cf a2 = cdVar.a((java.lang.Object) cgVar2);
                defpackage.cf a3 = cdVar.a((java.lang.Object) cgVar);
                float f = this.ac;
                defpackage.ca b = cdVar.b();
                b.c.a(a, -1.0f);
                b.c.a(a2, 1.0f - f);
                b.c.a(a3, f);
                cdVar.a(b);
            }
        }
    }

    public final void n() {
        if (this.o != null) {
            int b = defpackage.cd.b((java.lang.Object) this.ag);
            if (this.af == 1) {
                this.t = b;
                this.u = 0;
                b(this.o.f());
                a(0);
                return;
            }
            this.t = 0;
            this.u = b;
            a(this.o.c());
            b(0);
        }
    }
}
