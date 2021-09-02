package android.support.v7.widget;

/* compiled from: PG */
public class ActionBarOverlayLayout extends android.view.ViewGroup implements defpackage.acq, defpackage.si {
    private static final int[] A = {2130772149, 16842841};
    private final defpackage.sk B;
    public int a;
    public android.support.v7.widget.ActionBarContainer b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    public defpackage.aan g;
    public android.view.ViewPropertyAnimator h;
    public final android.animation.AnimatorListenerAdapter i;
    private int j;
    private android.support.v7.widget.ContentFrameLayout k;
    private defpackage.acr l;
    private android.graphics.drawable.Drawable m;
    private boolean n;
    private boolean o;
    private int p;
    private final android.graphics.Rect q;
    private final android.graphics.Rect r;
    private final android.graphics.Rect s;
    private final android.graphics.Rect t;
    private final android.graphics.Rect u;
    private final android.graphics.Rect v;
    private final android.graphics.Rect w;
    private android.widget.OverScroller x;
    private final java.lang.Runnable y;
    private final java.lang.Runnable z;

    public ActionBarOverlayLayout(android.content.Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.q = new android.graphics.Rect();
        this.r = new android.graphics.Rect();
        this.s = new android.graphics.Rect();
        this.t = new android.graphics.Rect();
        this.u = new android.graphics.Rect();
        this.v = new android.graphics.Rect();
        this.w = new android.graphics.Rect();
        this.i = new defpackage.aak(this);
        this.y = new defpackage.aal(this);
        this.z = new defpackage.aam(this);
        a(context);
        this.B = new defpackage.sk();
    }

    private final void a(android.content.Context context) {
        boolean z2;
        boolean z3 = true;
        android.content.res.TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(A);
        this.j = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.m = obtainStyledAttributes.getDrawable(1);
        if (this.m == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        setWillNotDraw(z2);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion >= 19) {
            z3 = false;
        }
        this.n = z3;
        this.x = new android.widget.OverScroller(context);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    public static void a() {
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(getContext());
        defpackage.sn.a.g(this);
    }

    public void onWindowSystemUiVisibilityChanged(int i2) {
        boolean z2;
        boolean z3 = true;
        super.onWindowSystemUiVisibilityChanged(i2);
        j();
        int i3 = this.f ^ i2;
        this.f = i2;
        boolean z4 = (i2 & 4) == 0;
        if ((i2 & 256) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.g != null) {
            defpackage.aan aan = this.g;
            if (z2) {
                z3 = false;
            }
            aan.e(z3);
            if (z4 || !z2) {
                this.g.m();
            } else {
                this.g.n();
            }
        }
        if ((i3 & 256) != 0 && this.g != null) {
            defpackage.sn.a.g(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.a = i2;
        if (this.g != null) {
            this.g.a(i2);
        }
    }

    private static boolean a(android.view.View view, android.graphics.Rect rect, boolean z2) {
        boolean z3 = false;
        defpackage.aao aao = (defpackage.aao) view.getLayoutParams();
        if (aao.leftMargin != rect.left) {
            aao.leftMargin = rect.left;
            z3 = true;
        }
        if (aao.topMargin != rect.top) {
            aao.topMargin = rect.top;
            z3 = true;
        }
        if (aao.rightMargin != rect.right) {
            aao.rightMargin = rect.right;
            z3 = true;
        }
        if (!z2 || aao.bottomMargin == rect.bottom) {
            return z3;
        }
        aao.bottomMargin = rect.bottom;
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(android.graphics.Rect rect) {
        j();
        defpackage.sn.a.m(this);
        boolean a2 = a(this.b, rect, false);
        this.t.set(rect);
        defpackage.ahr.a(this, this.t, this.q);
        if (!this.u.equals(this.t)) {
            this.u.set(this.t);
            a2 = true;
        }
        if (!this.r.equals(this.q)) {
            this.r.set(this.q);
            a2 = true;
        }
        if (a2) {
            requestLayout();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new defpackage.aao(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof defpackage.aao;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int i4;
        j();
        measureChildWithMargins(this.b, i2, 0, i3, 0);
        defpackage.aao aao = (defpackage.aao) this.b.getLayoutParams();
        int max = java.lang.Math.max(0, this.b.getMeasuredWidth() + aao.leftMargin + aao.rightMargin);
        int max2 = java.lang.Math.max(0, aao.bottomMargin + this.b.getMeasuredHeight() + aao.topMargin);
        int combineMeasuredStates = android.view.View.combineMeasuredStates(0, this.b.getMeasuredState());
        boolean z2 = (defpackage.sn.a.m(this) & 256) != 0;
        if (z2) {
            i4 = this.j;
        } else if (this.b.getVisibility() != 8) {
            i4 = this.b.getMeasuredHeight();
        } else {
            i4 = 0;
        }
        this.s.set(this.q);
        this.v.set(this.t);
        if (this.c || z2) {
            android.graphics.Rect rect = this.v;
            rect.top = i4 + rect.top;
            android.graphics.Rect rect2 = this.v;
            rect2.bottom = rect2.bottom;
        } else {
            android.graphics.Rect rect3 = this.s;
            rect3.top = i4 + rect3.top;
            android.graphics.Rect rect4 = this.s;
            rect4.bottom = rect4.bottom;
        }
        a(this.k, this.s, true);
        if (!this.w.equals(this.v)) {
            this.w.set(this.v);
            this.k.a(this.v);
        }
        measureChildWithMargins(this.k, i2, 0, i3, 0);
        defpackage.aao aao2 = (defpackage.aao) this.k.getLayoutParams();
        int max3 = java.lang.Math.max(max, this.k.getMeasuredWidth() + aao2.leftMargin + aao2.rightMargin);
        int max4 = java.lang.Math.max(max2, aao2.bottomMargin + this.k.getMeasuredHeight() + aao2.topMargin);
        int combineMeasuredStates2 = android.view.View.combineMeasuredStates(combineMeasuredStates, this.k.getMeasuredState());
        setMeasuredDimension(android.view.View.resolveSizeAndState(java.lang.Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, combineMeasuredStates2), android.view.View.resolveSizeAndState(java.lang.Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                defpackage.aao aao = (defpackage.aao) childAt.getLayoutParams();
                int i7 = aao.leftMargin + paddingLeft;
                int i8 = aao.topMargin + paddingTop;
                childAt.layout(i7, i8, childAt.getMeasuredWidth() + i7, childAt.getMeasuredHeight() + i8);
            }
        }
    }

    public void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
        if (this.m != null && !this.n) {
            int i2 = this.b.getVisibility() == 0 ? (int) (((float) this.b.getBottom()) + this.b.getTranslationY() + 0.5f) : 0;
            this.m.setBounds(0, i2, getWidth(), this.m.getIntrinsicHeight() + i2);
            this.m.draw(canvas);
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i2) {
        if ((i2 & 2) == 0 || this.b.getVisibility() != 0) {
            return false;
        }
        return this.o;
    }

    public void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i2) {
        this.B.a = i2;
        this.p = this.b != null ? -((int) this.b.getTranslationY()) : 0;
        b();
        if (this.g != null) {
            this.g.o();
        }
    }

    public void onNestedScroll(android.view.View view, int i2, int i3, int i4, int i5) {
        this.p += i3;
        b(this.p);
    }

    public void onStopNestedScroll(android.view.View view) {
        if (this.o && !this.e) {
            if (this.p <= this.b.getHeight()) {
                b();
                postDelayed(this.y, 600);
                return;
            }
            b();
            postDelayed(this.z, 600);
        }
    }

    public boolean onNestedFling(android.view.View view, float f2, float f3, boolean z2) {
        if (!this.o || !z2) {
            return false;
        }
        this.x.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.x.getFinalY() > this.b.getHeight()) {
            b();
            this.z.run();
        } else {
            b();
            this.y.run();
        }
        this.e = true;
        return true;
    }

    public void onNestedPreScroll(android.view.View view, int i2, int i3, int[] iArr) {
    }

    public boolean onNestedPreFling(android.view.View view, float f2, float f3) {
        return false;
    }

    public int getNestedScrollAxes() {
        return this.B.a;
    }

    private final void j() {
        defpackage.acr m2;
        if (this.k == null) {
            this.k = (android.support.v7.widget.ContentFrameLayout) findViewById(2131755008);
            this.b = (android.support.v7.widget.ActionBarContainer) findViewById(2131755206);
            android.view.View findViewById = findViewById(2131755207);
            if (findViewById instanceof defpackage.acr) {
                m2 = (defpackage.acr) findViewById;
            } else if (findViewById instanceof android.support.v7.widget.Toolbar) {
                m2 = ((android.support.v7.widget.Toolbar) findViewById).m();
            } else {
                throw new java.lang.IllegalStateException("Can't make a decor toolbar out of " + findViewById.getClass().getSimpleName());
            }
            this.l = m2;
        }
    }

    public final void a(boolean z2) {
        if (z2 != this.o) {
            this.o = z2;
            if (!z2) {
                b();
                b(0);
            }
        }
    }

    private final void b(int i2) {
        b();
        this.b.setTranslationY((float) (-java.lang.Math.max(0, java.lang.Math.min(i2, this.b.getHeight()))));
    }

    public final void b() {
        removeCallbacks(this.y);
        removeCallbacks(this.z);
        if (this.h != null) {
            this.h.cancel();
        }
    }

    public final void a(android.view.Window.Callback callback) {
        j();
        this.l.e = callback;
    }

    public final void a(java.lang.CharSequence charSequence) {
        j();
        this.l.a(charSequence);
    }

    public final void a(int i2) {
        boolean z2 = true;
        j();
        switch (i2) {
            case 109:
                this.c = true;
                if (getContext().getApplicationInfo().targetSdkVersion >= 19) {
                    z2 = false;
                }
                this.n = z2;
                return;
            default:
                return;
        }
    }

    public final boolean c() {
        j();
        android.support.v7.widget.Toolbar toolbar = this.l.a;
        return toolbar.getVisibility() == 0 && toolbar.g != null && toolbar.g.b;
    }

    public final boolean d() {
        j();
        return this.l.a.f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            r4.j()
            acr r2 = r4.l
            android.support.v7.widget.Toolbar r2 = r2.a
            android.support.v7.widget.ActionMenuView r3 = r2.g
            if (r3 == 0) goto L_0x002a
            android.support.v7.widget.ActionMenuView r2 = r2.g
            aap r3 = r2.c
            if (r3 == 0) goto L_0x0028
            aap r2 = r2.c
            aar r3 = r2.l
            if (r3 != 0) goto L_0x001f
            boolean r2 = r2.i()
            if (r2 == 0) goto L_0x0026
        L_0x001f:
            r2 = r0
        L_0x0020:
            if (r2 == 0) goto L_0x0028
            r2 = r0
        L_0x0023:
            if (r2 == 0) goto L_0x002a
        L_0x0025:
            return r0
        L_0x0026:
            r2 = r1
            goto L_0x0020
        L_0x0028:
            r2 = r1
            goto L_0x0023
        L_0x002a:
            r0 = r1
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarOverlayLayout.e():boolean");
    }

    public final boolean f() {
        j();
        return this.l.a.g();
    }

    public final boolean g() {
        boolean z2;
        j();
        android.support.v7.widget.Toolbar toolbar = this.l.a;
        if (toolbar.g != null) {
            android.support.v7.widget.ActionMenuView actionMenuView = toolbar.g;
            if (actionMenuView.c == null || !actionMenuView.c.f()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final void h() {
        j();
        this.l.f = true;
    }

    public final void a(android.view.Menu menu, defpackage.zu zuVar) {
        j();
        defpackage.acr acr = this.l;
        if (acr.g == null) {
            acr.g = new defpackage.aap(acr.a.getContext());
            acr.g.f = 2131755011;
        }
        acr.g.d = zuVar;
        android.support.v7.widget.Toolbar toolbar = acr.a;
        defpackage.ze zeVar = (defpackage.ze) menu;
        defpackage.aap aap = acr.g;
        if (zeVar != null || toolbar.g != null) {
            toolbar.l();
            defpackage.ze zeVar2 = toolbar.g.a;
            if (zeVar2 != zeVar) {
                if (zeVar2 != null) {
                    zeVar2.b((defpackage.zt) toolbar.B);
                    zeVar2.b((defpackage.zt) toolbar.C);
                }
                if (toolbar.C == null) {
                    toolbar.C = new defpackage.agz(toolbar);
                }
                aap.i = true;
                if (zeVar != null) {
                    zeVar.a((defpackage.zt) aap, toolbar.n);
                    zeVar.a((defpackage.zt) toolbar.C, toolbar.n);
                } else {
                    aap.a(toolbar.n, (defpackage.ze) null);
                    toolbar.C.a(toolbar.n, (defpackage.ze) null);
                    aap.a(true);
                    toolbar.C.a(true);
                }
                toolbar.g.a(toolbar.o);
                toolbar.g.a(aap);
                toolbar.B = aap;
            }
        }
    }

    public final void i() {
        j();
        this.l.a();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new defpackage.aao();
    }

    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new defpackage.aao(getContext(), attributeSet);
    }
}
