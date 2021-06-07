package defpackage;

import android.view.View;

/* renamed from: cde  reason: default package */
/* compiled from: PG */
public class cde implements q {
    public static final String a = String.valueOf(cde.class.getName()).concat(".navigationDrawerAccountMenuDialogFragment");
    public final lg b;
    public final View c;
    public cft d;
    private final cdj e;

    public cde(lg lgVar, cdj cdj, View view) {
        this.e = (cdj) cky.a(cdj);
        this.b = (lg) cky.a((Object) lgVar);
        this.c = (View) cky.a((Object) view);
        lgVar.g.a(this);
    }

    @Override // defpackage.q
    public final void b() {
    }

    @Override // defpackage.q
    public final void c() {
    }

    @Override // defpackage.q
    public final void d() {
    }

    @Override // defpackage.q
    public final void e() {
    }

    @Override // defpackage.q
    public final void f() {
    }

    @Override // defpackage.q
    public final void a() {
        g();
    }

    public final void g() {
        if (this.d == null) {
            this.d = h();
            if (this.d == null) {
                this.d = new cft();
            }
            cft cft = this.d;
            cdj cdj = this.e;
            cky.b(((cfc) cft).U == null, "Initialize may only be called once");
            ((cfc) cft).U = cdj;
            this.d.b(this.c);
        }
    }

    public final cft h() {
        return (cft) this.b.c().a(a);
    }

    static {
        cde.class.getSimpleName();
    }
}
