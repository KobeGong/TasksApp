package defpackage;

/* renamed from: acr reason: default package */
/* compiled from: PG */
public final class acr {
    public android.support.v7.widget.Toolbar a;
    public int b;
    public android.view.View c;
    public java.lang.CharSequence d;
    public android.view.Window.Callback e;
    public boolean f;
    public defpackage.aap g;
    private android.view.View h;
    private android.graphics.drawable.Drawable i;
    private android.graphics.drawable.Drawable j;
    private android.graphics.drawable.Drawable k;
    private boolean l;
    private java.lang.CharSequence m;
    private java.lang.CharSequence n;
    private int o;
    private android.graphics.drawable.Drawable p;

    public final void a(java.lang.CharSequence charSequence) {
        if (!this.l) {
            c(charSequence);
        }
    }

    public final void b(java.lang.CharSequence charSequence) {
        this.l = true;
        c(charSequence);
    }

    public final void a(android.graphics.drawable.Drawable drawable) {
        this.j = drawable;
        b();
    }

    public final void a() {
        android.support.v7.widget.Toolbar toolbar = this.a;
        if (toolbar.mMenuView != null) {
            toolbar.mMenuView.c();
        }
    }

    public final void a(int i2) {
        int i3 = this.b ^ i2;
        this.b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    d();
                }
                c();
            }
            if ((i3 & 3) != 0) {
                b();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.a.setSubtitle(this.d);
                    this.a.setTitle(this.m);
                } else {
                    this.a.setSubtitle((java.lang.CharSequence) null);
                    this.a.setTitle((java.lang.CharSequence) null);
                }
            }
            if ((i3 & 16) != 0 && this.h != null) {
                if ((i2 & 16) != 0) {
                    this.a.addView(this.h);
                } else {
                    this.a.removeView(this.h);
                }
            }
        }
    }

    public final defpackage.te a(int i2, long j2) {
        return ViewCompat.b(this.a).a(i2 == 0 ? 1.0f : 0.0f).a(j2).a((defpackage.th) new defpackage.ahf(this, i2));
    }

    public final void b(int i2) {
        this.a.setVisibility(i2);
    }

    public acr(android.support.v7.widget.Toolbar toolbar) {
        this(toolbar, 0);
    }

    private acr(android.support.v7.widget.Toolbar toolbar, byte b2) {
        java.lang.String string;
        this.o = 0;
        this.a = toolbar;
        this.d = toolbar.mSubtitleText;
        this.m = toolbar.mTitleText;
        this.l = this.d != null;
        this.k = toolbar.getNavigationIcon();
        defpackage.agw a2 = defpackage.agw.a(toolbar.getContext(), null, defpackage.xu.a, 2130772145, 0);
        this.p = a2.a(defpackage.xu.n);
        java.lang.CharSequence c2 = a2.c(defpackage.xu.t);
        if (!android.text.TextUtils.isEmpty(c2)) {
            b(c2);
        }
        java.lang.CharSequence c3 = a2.c(defpackage.xu.r);
        if (!android.text.TextUtils.isEmpty(c3)) {
            this.m = c3;
            if ((this.b & 8) != 0) {
                this.a.setTitle(c3);
            }
        }
        android.graphics.drawable.Drawable a3 = a2.a(defpackage.xu.p);
        if (a3 != null) {
            a(a3);
        }
        android.graphics.drawable.Drawable a4 = a2.a(defpackage.xu.o);
        if (a4 != null) {
            this.i = a4;
            b();
        }
        if (this.k == null && this.p != null) {
            this.k = this.p;
            c();
        }
        a(a2.a(defpackage.xu.j, 0));
        int g2 = a2.g(defpackage.xu.i, 0);
        if (g2 != 0) {
            android.view.View inflate = android.view.LayoutInflater.from(this.a.getContext()).inflate(g2, this.a, false);
            if (!(this.h == null || (this.b & 16) == 0)) {
                this.a.removeView(this.h);
            }
            this.h = inflate;
            if (!(inflate == null || (this.b & 16) == 0)) {
                this.a.addView(this.h);
            }
            a(this.b | 16);
        }
        int f2 = a2.f(defpackage.xu.l, 0);
        if (f2 > 0) {
            android.view.ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            layoutParams.height = f2;
            this.a.setLayoutParams(layoutParams);
        }
        int d2 = a2.d(defpackage.xu.h, -1);
        int d3 = a2.d(defpackage.xu.g, -1);
        if (d2 >= 0 || d3 >= 0) {
            android.support.v7.widget.Toolbar toolbar2 = this.a;
            int max = java.lang.Math.max(d2, 0);
            int max2 = java.lang.Math.max(d3, 0);
            toolbar2.n();
            toolbar2.w.a(max, max2);
        }
        int g3 = a2.g(defpackage.xu.u, 0);
        if (g3 != 0) {
            android.support.v7.widget.Toolbar toolbar3 = this.a;
            android.content.Context context = this.a.getContext();
            toolbar3.mSubtitleTextAppearance = g3;
            if (toolbar3.mSubtitleTextView != null) {
                toolbar3.mSubtitleTextView.setTextAppearance(context, g3);
            }
        }
        int g4 = a2.g(defpackage.xu.s, 0);
        if (g4 != 0) {
            android.support.v7.widget.Toolbar toolbar4 = this.a;
            android.content.Context context2 = this.a.getContext();
            toolbar4.mTitleTextAppearance = g4;
            if (toolbar4.mTitleTextView != null) {
                toolbar4.mTitleTextView.setTextAppearance(context2, g4);
            }
        }
        int g5 = a2.g(defpackage.xu.q, 0);
        if (g5 != 0) {
            this.a.a(g5);
        }
        a2.b.recycle();
        if (2131951642 != this.o) {
            this.o = 2131951642;
            if (android.text.TextUtils.isEmpty(this.a.i())) {
                int i2 = this.o;
                if (i2 == 0) {
                    string = null;
                } else {
                    string = this.a.getContext().getString(i2);
                }
                this.n = string;
                d();
            }
        }
        this.n = this.a.i();
        this.a.setNavigationOnClickListener((android.view.View.OnClickListener) new defpackage.ahe(this));
    }

    private final void c(java.lang.CharSequence charSequence) {
        this.d = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setSubtitle(charSequence);
        }
    }

    private final void b() {
        android.graphics.drawable.Drawable drawable = null;
        if ((this.b & 2) != 0) {
            drawable = (this.b & 1) != 0 ? this.j != null ? this.j : this.i : this.i;
        }
        this.a.a(drawable);
    }

    private final void c() {
        if ((this.b & 4) != 0) {
            this.a.setNavigationIcon(this.k != null ? this.k : this.p);
        } else {
            this.a.setNavigationIcon((android.graphics.drawable.Drawable) null);
        }
    }

    private final void d() {
        if ((this.b & 4) == 0) {
            return;
        }
        if (android.text.TextUtils.isEmpty(this.n)) {
            this.a.b(this.o);
        } else {
            this.a.c(this.n);
        }
    }
}
