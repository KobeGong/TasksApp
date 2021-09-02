package defpackage;

/* renamed from: cde reason: default package */
/* compiled from: PG */
public class cde implements defpackage.q {
    public static final java.lang.String a = java.lang.String.valueOf(defpackage.cde.class.getName()).concat(".navigationDrawerAccountMenuDialogFragment");
    public final FragmentActivity b;
    public final android.view.View c;
    public defpackage.cft d;
    private final defpackage.cdj e;

    public cde(FragmentActivity lgVar, defpackage.cdj cdj, android.view.View view) {
        this.e = (defpackage.cdj) defpackage.cky.a((java.lang.Object) cdj);
        this.b = (FragmentActivity) defpackage.cky.a((java.lang.Object) lgVar);
        this.c = (android.view.View) defpackage.cky.a((java.lang.Object) view);
        lgVar.g.addObserver(this);
    }

    public final void b() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void e() {
    }

    public final void f() {
    }

    public final void a() {
        g();
    }

    public final void g() {
        if (this.d == null) {
            this.d = h();
            if (this.d == null) {
                this.d = new defpackage.cft();
            }
            defpackage.cft cft = this.d;
            defpackage.cdj cdj = this.e;
            defpackage.cky.b(cft.U == null, (java.lang.Object) "Initialize may only be called once");
            cft.U = cdj;
            this.d.b(this.c);
        }
    }

    public final defpackage.cft h() {
        return (defpackage.cft) this.b.getSupportFragmentManager().a(a);
    }

    static {
        defpackage.cde.class.getSimpleName();
    }
}
