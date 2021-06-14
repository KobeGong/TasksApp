package defpackage;

/* renamed from: aho  reason: default package */
/* compiled from: PG */
public final class aho {
    public final qr a = new qr();
    public final qx b = new qx();

    public final void a() {
        this.a.clear();
        this.b.c();
    }

    public final void a(ViewHolder afv, afb afb) {
        ahp ahp = (ahp) this.a.get(afv);
        if (ahp == null) {
            ahp = ahp.a();
            this.a.put(afv, ahp);
        }
        ahp.b = afb;
        ahp.a |= 4;
    }

    public final boolean a(ViewHolder afv) {
        ahp ahp = (ahp) this.a.get(afv);
        return (ahp == null || (ahp.a & 1) == 0) ? false : true;
    }

    public final afb a(ViewHolder afv, int i) {
        ahp ahp;
        afb afb = null;
        int a2 = this.a.a(afv);
        if (!(a2 < 0 || (ahp = (ahp) this.a.c(a2)) == null || (ahp.a & i) == 0)) {
            ahp.a &= i ^ -1;
            if (i == 4) {
                afb = ahp.b;
            } else if (i == 8) {
                afb = ahp.c;
            } else {
                throw new IllegalArgumentException("Must provide flag PRE or POST");
            }
            if ((ahp.a & 12) == 0) {
                this.a.d(a2);
                ahp.a(ahp);
            }
        }
        return afb;
    }

    public final void a(long j, ViewHolder afv) {
        this.b.a(j, afv);
    }

    public final void b(ViewHolder afv, afb afb) {
        ahp ahp = (ahp) this.a.get(afv);
        if (ahp == null) {
            ahp = ahp.a();
            this.a.put(afv, ahp);
        }
        ahp.c = afb;
        ahp.a |= 8;
    }

    /* access modifiers changed from: package-private */
    public final void b(ViewHolder afv) {
        ahp ahp = (ahp) this.a.get(afv);
        if (ahp == null) {
            ahp = ahp.a();
            this.a.put(afv, ahp);
        }
        ahp.a |= 1;
    }

    /* access modifiers changed from: package-private */
    public final void c(ViewHolder afv) {
        ahp ahp = (ahp) this.a.get(afv);
        if (ahp != null) {
            ahp.a &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    public final void d(ViewHolder afv) {
        int b2 = this.b.b() - 1;
        while (true) {
            if (b2 < 0) {
                break;
            } else if (afv == this.b.b(b2)) {
                qx qxVar = this.b;
                if (qxVar.d[b2] != qx.a) {
                    qxVar.d[b2] = qx.a;
                    qxVar.b = true;
                }
            } else {
                b2--;
            }
        }
        ahp ahp = (ahp) this.a.remove(afv);
        if (ahp != null) {
            ahp.a(ahp);
        }
    }
}
