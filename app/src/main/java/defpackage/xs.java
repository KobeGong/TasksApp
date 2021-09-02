package defpackage;

/* renamed from: xs reason: default package */
/* compiled from: PG */
public final class xs extends defpackage.yc implements defpackage.zf {
    private final android.content.Context c;
    private final defpackage.ze d;
    private defpackage.yd e;
    private java.lang.ref.WeakReference f;
    private final /* synthetic */ defpackage.xp g;

    public xs(defpackage.xp xpVar, android.content.Context context, defpackage.yd ydVar) {
        this.g = xpVar;
        this.c = context;
        this.e = ydVar;
        defpackage.ze zeVar = new defpackage.ze(context);
        this.d = zeVar;
        this.d.a((defpackage.zf) this);
    }

    public final android.view.MenuInflater a() {
        return new defpackage.yj(this.c);
    }

    public final android.view.Menu b() {
        return this.d;
    }

    public final void c() {
        if (this.g.g == this) {
            if (!defpackage.xp.a(this.g.k, this.g.l, false)) {
                this.g.h = this;
                this.g.i = this.e;
            } else {
                this.e.a(this);
            }
            this.e = null;
            this.g.f(false);
            android.support.v7.widget.ActionBarContextView actionBarContextView = this.g.e;
            if (actionBarContextView.h == null) {
                actionBarContextView.b();
            }
            this.g.d.a.sendAccessibilityEvent(32);
            this.g.b.a(this.g.n);
            this.g.g = null;
        }
    }

    public final void d() {
        if (this.g.g == this) {
            this.d.e();
            try {
                this.e.b(this, this.d);
            } finally {
                this.d.f();
            }
        }
    }

    public final boolean e() {
        this.d.e();
        try {
            return this.e.a((defpackage.yc) this, (android.view.Menu) this.d);
        } finally {
            this.d.f();
        }
    }

    public final void a(android.view.View view) {
        this.g.e.a(view);
        this.f = new java.lang.ref.WeakReference(view);
    }

    public final void a(java.lang.CharSequence charSequence) {
        this.g.e.b(charSequence);
    }

    public final void b(java.lang.CharSequence charSequence) {
        this.g.e.a(charSequence);
    }

    public final void a(int i) {
        b((java.lang.CharSequence) this.g.a.getResources().getString(i));
    }

    public final void b(int i) {
        a((java.lang.CharSequence) this.g.a.getResources().getString(i));
    }

    public final java.lang.CharSequence f() {
        return this.g.e.f;
    }

    public final java.lang.CharSequence g() {
        return this.g.e.g;
    }

    public final void a(boolean z) {
        super.a(z);
        this.g.e.a(z);
    }

    public final boolean h() {
        return this.g.e.i;
    }

    public final android.view.View i() {
        if (this.f != null) {
            return (android.view.View) this.f.get();
        }
        return null;
    }

    public final boolean a(defpackage.ze zeVar, android.view.MenuItem menuItem) {
        if (this.e != null) {
            return this.e.a((defpackage.yc) this, menuItem);
        }
        return false;
    }

    public final void a(defpackage.ze zeVar) {
        if (this.e != null) {
            d();
            this.g.e.a();
        }
    }
}
