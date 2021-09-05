package defpackage;

/* renamed from: xp reason: default package */
/* compiled from: PG */
public final class xp extends defpackage.wa implements defpackage.aan {
    private static final android.view.animation.Interpolator o = new android.view.animation.AccelerateInterpolator();
    private static final android.view.animation.Interpolator p = new android.view.animation.DecelerateInterpolator();
    private final defpackage.th A = new defpackage.xr(this);
    private final defpackage.tj B = new defpackage.tj(this);
    public android.content.Context a;
    public android.support.v7.widget.ActionBarOverlayLayout b;
    public android.support.v7.widget.ActionBarContainer c;
    public defpackage.acr d;
    public android.support.v7.widget.ActionBarContextView e;
    public android.view.View f;
    public defpackage.xs g;
    public defpackage.yc h;
    public defpackage.yd i;
    public boolean j = true;
    public boolean k;
    public boolean l;
    public defpackage.ym m;
    public boolean n;
    private android.content.Context q;
    private boolean r;
    private boolean s;
    private java.util.ArrayList t = new java.util.ArrayList();
    private boolean u;
    private int v = 0;
    private boolean w;
    private boolean x = true;
    private boolean y;
    private final defpackage.th z = new defpackage.xq(this);

    public xp(android.app.Activity activity, boolean z2) {
        new java.util.ArrayList();
        android.view.View decorView = activity.getWindow().getDecorView();
        a(decorView);
        if (!z2) {
            this.f = decorView.findViewById(16908290);
        }
    }

    public xp(android.app.Dialog dialog) {
        new java.util.ArrayList();
        a(dialog.getWindow().getDecorView());
    }

    private final void a(android.view.View view) {
        defpackage.acr m2;
        this.b = (android.support.v7.widget.ActionBarOverlayLayout) view.findViewById(2131755205);
        if (this.b != null) {
            android.support.v7.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.b;
            actionBarOverlayLayout.g = this;
            if (actionBarOverlayLayout.getWindowToken() != null) {
                actionBarOverlayLayout.g.a(actionBarOverlayLayout.a);
                if (actionBarOverlayLayout.f != 0) {
                    actionBarOverlayLayout.onWindowSystemUiVisibilityChanged(actionBarOverlayLayout.f);
                    ViewCompat.a.g(actionBarOverlayLayout);
                }
            }
        }
        android.view.View findViewById = view.findViewById(2131755207);
        if (findViewById instanceof defpackage.acr) {
            m2 = (defpackage.acr) findViewById;
        } else if (findViewById instanceof android.support.v7.widget.Toolbar) {
            m2 = ((android.support.v7.widget.Toolbar) findViewById).m();
        } else {
            throw new java.lang.IllegalStateException("Can't make a decor toolbar out of " + (findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
        }
        this.d = m2;
        this.e = (android.support.v7.widget.ActionBarContextView) view.findViewById(2131755208);
        this.c = (android.support.v7.widget.ActionBarContainer) view.findViewById(2131755206);
        if (this.d == null || this.e == null || this.c == null) {
            throw new java.lang.IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.a = this.d.a.getContext();
        if ((this.d.b & 4) != 0) {
            this.r = true;
        }
        defpackage.yb a2 = defpackage.yb.a(this.a);
        int i2 = a2.a.getApplicationInfo().targetSdkVersion;
        g(a2.b());
        android.content.res.TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, defpackage.xu.a, 2130772145, 0);
        if (obtainStyledAttributes.getBoolean(defpackage.xu.m, false)) {
            e();
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(defpackage.xu.k, 0);
        if (dimensionPixelSize != 0) {
            a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void a(float f2) {
        ViewCompat.a((android.view.View) this.c, f2);
    }

    public final void f() {
        g(defpackage.yb.a(this.a).b());
    }

    private final void g(boolean z2) {
        this.u = z2;
        if (!this.u) {
            this.d.c = null;
            this.c.a = null;
        } else {
            this.c.a = null;
            this.d.c = null;
        }
        android.support.v7.widget.Toolbar toolbar = this.d.a;
        toolbar.D = false;
        toolbar.requestLayout();
        this.b.d = false;
    }

    public final void a(int i2) {
        this.v = i2;
    }

    public final void c(boolean z2) {
        this.y = z2;
        if (!z2 && this.m != null) {
            this.m.b();
        }
    }

    public final void d(boolean z2) {
        if (z2 != this.s) {
            this.s = z2;
            int size = this.t.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((defpackage.wc) this.t.get(i2)).a();
            }
        }
    }

    public final void b() {
        a(2, 2);
    }

    public final void a(boolean z2) {
        a(z2 ? 4 : 0, 4);
    }

    public final void a(java.lang.CharSequence charSequence) {
        this.d.b(charSequence);
    }

    public final void b(java.lang.CharSequence charSequence) {
        this.d.a(charSequence);
    }

    private final void a(int i2, int i3) {
        int i4 = this.d.b;
        if ((i3 & 4) != 0) {
            this.r = true;
        }
        this.d.a((i4 & (i3 ^ -1)) | (i2 & i3));
    }

    public final int c() {
        return this.d.b;
    }

    public final defpackage.yc a(defpackage.yd ydVar) {
        if (this.g != null) {
            this.g.c();
        }
        this.b.a(false);
        this.e.b();
        defpackage.xs xsVar = new defpackage.xs(this, this.e.getContext(), ydVar);
        if (!xsVar.e()) {
            return null;
        }
        this.g = xsVar;
        xsVar.d();
        this.e.a((defpackage.yc) xsVar);
        f(true);
        this.e.sendAccessibilityEvent(32);
        return xsVar;
    }

    public final void e(boolean z2) {
        this.j = z2;
    }

    public final void m() {
        if (this.l) {
            this.l = false;
            h(true);
        }
    }

    public final void n() {
        if (!this.l) {
            this.l = true;
            h(true);
        }
    }

    public final void e() {
        if (!this.b.c) {
            throw new java.lang.IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.n = true;
        this.b.a(true);
    }

    static boolean a(boolean z2, boolean z3, boolean z4) {
        if (z4) {
            return true;
        }
        if (z2 || z3) {
            return false;
        }
        return true;
    }

    private final void h(boolean z2) {
        if (a(false, this.l, this.w)) {
            if (!this.x) {
                this.x = true;
                if (this.m != null) {
                    this.m.b();
                }
                this.c.setVisibility(0);
                if (this.v != 0 || (!this.y && !z2)) {
                    this.c.setAlpha(1.0f);
                    this.c.setTranslationY(0.0f);
                    if (this.j && this.f != null) {
                        this.f.setTranslationY(0.0f);
                    }
                    this.A.b();
                } else {
                    this.c.setTranslationY(0.0f);
                    float f2 = (float) (-this.c.getHeight());
                    if (z2) {
                        int[] iArr = {0, 0};
                        this.c.getLocationInWindow(iArr);
                        f2 -= (float) iArr[1];
                    }
                    this.c.setTranslationY(f2);
                    defpackage.ym ymVar = new defpackage.ym();
                    defpackage.te b2 = ViewCompat.b(this.c).b(0.0f);
                    b2.a(this.B);
                    ymVar.a(b2);
                    if (this.j && this.f != null) {
                        this.f.setTranslationY(f2);
                        ymVar.a(ViewCompat.b(this.f).b(0.0f));
                    }
                    ymVar.a(p);
                    ymVar.c();
                    ymVar.a(this.A);
                    this.m = ymVar;
                    ymVar.a();
                }
                if (this.b != null) {
                    ViewCompat.a.g(this.b);
                }
            }
        } else if (this.x) {
            this.x = false;
            if (this.m != null) {
                this.m.b();
            }
            if (this.v != 0 || (!this.y && !z2)) {
                this.z.b();
                return;
            }
            this.c.setAlpha(1.0f);
            this.c.a(true);
            defpackage.ym ymVar2 = new defpackage.ym();
            float f3 = (float) (-this.c.getHeight());
            if (z2) {
                int[] iArr2 = {0, 0};
                this.c.getLocationInWindow(iArr2);
                f3 -= (float) iArr2[1];
            }
            defpackage.te b3 = ViewCompat.b(this.c).b(f3);
            b3.a(this.B);
            ymVar2.a(b3);
            if (this.j && this.f != null) {
                ymVar2.a(ViewCompat.b(this.f).b(f3));
            }
            ymVar2.a(o);
            ymVar2.c();
            ymVar2.a(this.z);
            this.m = ymVar2;
            ymVar2.a();
        }
    }

    public final void f(boolean z2) {
        defpackage.te a2;
        defpackage.te a3;
        long j2;
        if (z2) {
            if (!this.w) {
                this.w = true;
                if (this.b != null) {
                    android.support.v7.widget.ActionBarOverlayLayout.a();
                }
                h(false);
            }
        } else if (this.w) {
            this.w = false;
            if (this.b != null) {
                android.support.v7.widget.ActionBarOverlayLayout.a();
            }
            h(false);
        }
        if (ViewCompat.a.r(this.c)) {
            if (z2) {
                a3 = this.d.a(4, 100);
                a2 = this.e.a(0, 200);
            } else {
                a2 = this.d.a(0, 200);
                a3 = this.e.a(8, 100);
            }
            defpackage.ym ymVar = new defpackage.ym();
            ymVar.a.add(a3);
            android.view.View view = (android.view.View) a3.a.get();
            if (view != null) {
                j2 = view.animate().getDuration();
            } else {
                j2 = 0;
            }
            android.view.View view2 = (android.view.View) a2.a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j2);
            }
            ymVar.a.add(a2);
            ymVar.a();
        } else if (z2) {
            this.d.b(4);
            this.e.setVisibility(0);
        } else {
            this.d.b(0);
            this.e.setVisibility(8);
        }
    }

    public final android.content.Context d() {
        if (this.q == null) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            this.a.getTheme().resolveAttribute(2130772148, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.q = new android.view.ContextThemeWrapper(this.a, i2);
            } else {
                this.q = this.a;
            }
        }
        return this.q;
    }

    public final void o() {
        if (this.m != null) {
            this.m.b();
            this.m = null;
        }
    }

    public final boolean k() {
        if (this.d != null) {
            android.support.v7.widget.Toolbar toolbar = this.d.a;
            if ((toolbar.mExpandedMenuPresenter == null || toolbar.mExpandedMenuPresenter.a == null) ? false : true) {
                this.d.a.h();
                return true;
            }
        }
        return false;
    }

    public final void a() {
        this.d.a((android.graphics.drawable.Drawable) null);
    }

    public final void b(boolean z2) {
        if (!this.r) {
            a(z2);
        }
    }

    public final boolean a(int i2, android.view.KeyEvent keyEvent) {
        boolean z2;
        if (this.g == null) {
            return false;
        }
        android.view.Menu b2 = this.g.b();
        if (b2 == null) {
            return false;
        }
        if (android.view.KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        b2.setQwertyMode(z2);
        return b2.performShortcut(i2, keyEvent, 0);
    }
}
