package defpackage;

/* renamed from: bbl reason: default package */
/* compiled from: PG */
public final class bbl implements defpackage.bda {
    public final defpackage.ayj a;
    public final defpackage.bbu b;
    public defpackage.bdp c = null;
    public java.util.Set d = null;
    public boolean e = false;
    public final /* synthetic */ defpackage.baj f;

    public final void b(defpackage.axq axq) {
        defpackage.bak bak = (defpackage.bak) this.f.n.get(this.b);
        defpackage.azb.a(bak.g.g);
        bak.a.e();
        bak.a(axq);
    }

    public bbl(defpackage.baj baj, defpackage.ayj ayj, defpackage.bbu bbu) {
        this.f = baj;
        this.a = ayj;
        this.b = bbu;
    }

    public final void a(defpackage.axq axq) {
        this.f.g.post(new defpackage.bap(this, axq));
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        if (this.e && this.c != null) {
            this.a.a(this.c, this.d);
        }
    }
}
