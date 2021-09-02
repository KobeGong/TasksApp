package defpackage;

/* renamed from: yg reason: default package */
/* compiled from: PG */
public final class yg extends defpackage.yc implements defpackage.zf {
    private android.content.Context c;
    private android.support.v7.widget.ActionBarContextView d;
    private defpackage.yd e;
    private java.lang.ref.WeakReference f;
    private boolean g;
    private defpackage.ze h;

    public yg(android.content.Context context, android.support.v7.widget.ActionBarContextView actionBarContextView, defpackage.yd ydVar) {
        this.c = context;
        this.d = actionBarContextView;
        this.e = ydVar;
        defpackage.ze zeVar = new defpackage.ze(actionBarContextView.getContext());
        this.h = zeVar;
        this.h.a((defpackage.zf) this);
    }

    public final void b(java.lang.CharSequence charSequence) {
        this.d.a(charSequence);
    }

    public final void a(java.lang.CharSequence charSequence) {
        this.d.b(charSequence);
    }

    public final void a(int i) {
        b((java.lang.CharSequence) this.c.getString(i));
    }

    public final void b(int i) {
        a((java.lang.CharSequence) this.c.getString(i));
    }

    public final void a(boolean z) {
        super.a(z);
        this.d.a(z);
    }

    public final boolean h() {
        return this.d.i;
    }

    public final void a(android.view.View view) {
        this.d.a(view);
        this.f = view != null ? new java.lang.ref.WeakReference(view) : null;
    }

    public final void d() {
        this.e.b(this, this.h);
    }

    public final void c() {
        if (!this.g) {
            this.g = true;
            this.d.sendAccessibilityEvent(32);
            this.e.a(this);
        }
    }

    public final android.view.Menu b() {
        return this.h;
    }

    public final java.lang.CharSequence f() {
        return this.d.f;
    }

    public final java.lang.CharSequence g() {
        return this.d.g;
    }

    public final android.view.View i() {
        if (this.f != null) {
            return (android.view.View) this.f.get();
        }
        return null;
    }

    public final android.view.MenuInflater a() {
        return new defpackage.yj(this.d.getContext());
    }

    public final boolean a(defpackage.ze zeVar, android.view.MenuItem menuItem) {
        return this.e.a((defpackage.yc) this, menuItem);
    }

    public final void a(defpackage.ze zeVar) {
        d();
        this.d.a();
    }
}
