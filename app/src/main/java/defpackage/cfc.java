package defpackage;

/* renamed from: cfc reason: default package */
/* compiled from: PG */
public abstract class cfc extends defpackage.xh {
    public defpackage.cdj U;
    public defpackage.cff V;
    private final defpackage.cdm W = new defpackage.cfd(this);

    /* access modifiers changed from: protected */
    public abstract defpackage.cff N();

    public final android.app.Dialog c() {
        defpackage.cky.b(this.U != null, (java.lang.Object) "initialize must be called before opening the dialog");
        return new defpackage.cey(getContext());
    }

    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.V = N();
        this.V.setId(2131755023);
        this.V.a(this.U);
        return this.V;
    }

    public final void a(android.view.View view, android.os.Bundle bundle) {
        super.a(view, bundle);
        this.V.setSaveFromParentEnabled(true);
    }

    public final void s() {
        super.s();
        this.V.b();
        this.U.a().a(this.W);
    }

    public final void t() {
        super.t();
        this.U.a().b(this.W);
    }

    public void u() {
        this.V = null;
        super.u();
    }

    protected static void O() {
    }
}
