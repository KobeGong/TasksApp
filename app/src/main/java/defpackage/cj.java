package defpackage;

import java.util.ArrayList;

/* renamed from: cj  reason: default package */
/* compiled from: PG */
public final class cj extends ch {
    public float ac = -1.0f;
    public int ad = -1;
    public int ae = -1;
    public int af = 0;
    private cg ag = this.j;

    public cj() {
        new ck();
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

    @Override // defpackage.ch
    public final cg e(int i) {
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

    @Override // defpackage.ch
    public final ArrayList l() {
        return this.n;
    }

    @Override // defpackage.ch
    public final void a(cd cdVar) {
        cg cgVar;
        cg cgVar2;
        ci ciVar = (ci) this.o;
        if (ciVar != null) {
            cg e = ciVar.e(bg.n);
            cg e2 = ciVar.e(bg.p);
            if (this.af == 0) {
                cgVar2 = ciVar.e(bg.o);
                cgVar = ciVar.e(bg.q);
            } else {
                cgVar = e2;
                cgVar2 = e;
            }
            if (this.ad != -1) {
                cdVar.a(cd.a(cdVar, cdVar.a(this.ag), cdVar.a(cgVar2), this.ad, false));
            } else if (this.ae != -1) {
                cdVar.a(cd.a(cdVar, cdVar.a(this.ag), cdVar.a(cgVar), -this.ae, false));
            } else if (this.ac != -1.0f) {
                cf a = cdVar.a(this.ag);
                cf a2 = cdVar.a(cgVar2);
                cf a3 = cdVar.a(cgVar);
                float f = this.ac;
                ca b = cdVar.b();
                b.c.a(a, -1.0f);
                b.c.a(a2, 1.0f - f);
                b.c.a(a3, f);
                cdVar.a(b);
            }
        }
    }

    @Override // defpackage.ch
    public final void n() {
        if (this.o != null) {
            int b = cd.b(this.ag);
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
