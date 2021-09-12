package defpackage;

import android.view.View;

/* renamed from: cde reason: default package */
/* compiled from: PG */
public class cde implements defpackage.q {
    public static final java.lang.String TAG = cde.class.getName().concat(".navigationDrawerAccountMenuDialogFragment");
    public final FragmentActivity fragmentActivity;
    public final View view;
    public defpackage.cft d;
    private final defpackage.cdj e;

    public cde(FragmentActivity fragmentActivity, defpackage.cdj cdj, View view) {
        this.e = (defpackage.cdj) defpackage.cky.a(cdj);
        this.fragmentActivity = (FragmentActivity) defpackage.cky.a((java.lang.Object) fragmentActivity);
        this.view = (View) defpackage.cky.a((java.lang.Object) view);
        fragmentActivity.g.addObserver(this);
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
            defpackage.cky.b(this.d.U == null, "Initialize may only be called once");
            this.d.U = this.e;
            this.d.b(this.view);
        }
    }

    public final defpackage.cft h() {
        return (defpackage.cft) this.fragmentActivity.getSupportFragmentManager().findFragmentByTag(TAG);
    }

    static {
        defpackage.cde.class.getSimpleName();
    }
}
