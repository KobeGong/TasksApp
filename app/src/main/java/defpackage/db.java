package defpackage;

/* renamed from: db reason: default package */
/* compiled from: PG */
public class db extends android.widget.FrameLayout {
    public int a;
    public int expandedTitleMarginBottom;
    public final defpackage.ew c;
    public android.graphics.drawable.Drawable d;
    public int e;
    public WindowInsetsCompat f;
    private boolean g;
    private int h;
    private android.support.v7.widget.Toolbar i;
    private android.view.View j;
    private android.view.View k;
    private int l;
    private int m;
    private final android.graphics.Rect n;
    private boolean o;
    private boolean p;
    private android.graphics.drawable.Drawable q;
    private int r;
    private boolean s;
    private android.animation.ValueAnimator t;
    private long u;
    private int v;
    private defpackage.cz w;

    public db(android.content.Context context) {
        this(context, null);
    }

    public db(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public db(android.content.Context context, android.util.AttributeSet attributeSet, int i2) {
        android.graphics.drawable.Drawable drawable = null;
        super(context, attributeSet, i2);
        this.g = true;
        this.n = new android.graphics.Rect();
        this.v = -1;
        this.c = new defpackage.ew(this);
        defpackage.ew ewVar = this.c;
        ewVar.w = defpackage.cs.d;
        ewVar.c();
        android.content.res.TypedArray a2 = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, defpackage.dh.j, i2, 2132017717);
        defpackage.ew ewVar2 = this.c;
        int i3 = a2.getInt(defpackage.dh.q, 8388691);
        if (ewVar2.e != i3) {
            ewVar2.e = i3;
            ewVar2.c();
        }
        defpackage.ew ewVar3 = this.c;
        int i4 = a2.getInt(defpackage.dh.n, 8388627);
        if (ewVar3.f != i4) {
            ewVar3.f = i4;
            ewVar3.c();
        }
        int dimensionPixelSize = a2.getDimensionPixelSize(defpackage.dh.r, 0);
        this.expandedTitleMarginBottom = dimensionPixelSize;
        this.m = dimensionPixelSize;
        this.a = dimensionPixelSize;
        this.l = dimensionPixelSize;
        if (a2.hasValue(defpackage.dh.u)) {
            this.l = a2.getDimensionPixelSize(defpackage.dh.u, 0);
        }
        if (a2.hasValue(defpackage.dh.t)) {
            this.m = a2.getDimensionPixelSize(defpackage.dh.t, 0);
        }
        if (a2.hasValue(defpackage.dh.v)) {
            this.a = a2.getDimensionPixelSize(defpackage.dh.v, 0);
        }
        if (a2.hasValue(defpackage.dh.s)) {
            this.expandedTitleMarginBottom = a2.getDimensionPixelSize(defpackage.dh.s, 0);
        }
        this.o = a2.getBoolean(defpackage.dh.B, true);
        a(a2.getText(defpackage.dh.A));
        this.c.b(2132017496);
        this.c.a(2132017470);
        if (a2.hasValue(defpackage.dh.w)) {
            this.c.b(a2.getResourceId(defpackage.dh.w, 0));
        }
        if (a2.hasValue(defpackage.dh.o)) {
            this.c.a(a2.getResourceId(defpackage.dh.o, 0));
        }
        this.v = a2.getDimensionPixelSize(defpackage.dh.y, -1);
        this.u = (long) a2.getInt(defpackage.dh.x, 600);
        android.graphics.drawable.Drawable drawable2 = a2.getDrawable(defpackage.dh.p);
        if (this.q != drawable2) {
            if (this.q != null) {
                this.q.setCallback(null);
            }
            this.q = drawable2 != null ? drawable2.mutate() : null;
            if (this.q != null) {
                this.q.setBounds(0, 0, getWidth(), getHeight());
                this.q.setCallback(this);
                this.q.setAlpha(this.r);
            }
            ViewCompat.a.c(this);
        }
        android.graphics.drawable.Drawable drawable3 = a2.getDrawable(defpackage.dh.z);
        if (this.d != drawable3) {
            if (this.d != null) {
                this.d.setCallback(null);
            }
            if (drawable3 != null) {
                drawable = drawable3.mutate();
            }
            this.d = drawable;
            if (this.d != null) {
                if (this.d.isStateful()) {
                    this.d.setState(getDrawableState());
                }
                defpackage.jd.b(this.d, ViewCompat.a.j(this));
                this.d.setVisible(getVisibility() == 0, false);
                this.d.setCallback(this);
                this.d.setAlpha(this.r);
            }
            ViewCompat.a.c(this);
        }
        this.h = a2.getResourceId(defpackage.dh.C, -1);
        a2.recycle();
        setWillNotDraw(false);
        ViewCompat.setOnApplyWindowInsetsListener((android.view.View) this, (defpackage.OnApplyWindowInsetsListener) new defpackage.gk(this));
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.view.ViewParent parent = getParent();
        if (parent instanceof android.support.design.appbar.AppBarLayout) {
            ViewCompat.b((android.view.View) this, ViewCompat.a.h((android.view.View) parent));
            if (this.w == null) {
                this.w = new defpackage.cz(this);
            }
            android.support.design.appbar.AppBarLayout appBarLayout = (android.support.design.appbar.AppBarLayout) parent;
            defpackage.cz czVar = this.w;
            if (appBarLayout.d == null) {
                appBarLayout.d = new java.util.ArrayList();
            }
            if (czVar != null && !appBarLayout.d.contains(czVar)) {
                appBarLayout.d.add(czVar);
            }
            ViewCompat.a.g(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        android.view.ViewParent parent = getParent();
        if (this.w != null && (parent instanceof android.support.design.appbar.AppBarLayout)) {
            android.support.design.appbar.AppBarLayout appBarLayout = (android.support.design.appbar.AppBarLayout) parent;
            defpackage.cz czVar = this.w;
            if (!(appBarLayout.d == null || czVar == null)) {
                appBarLayout.d.remove(czVar);
            }
        }
        super.onDetachedFromWindow();
    }

    public void draw(android.graphics.Canvas canvas) {
        int i2;
        float f2;
        super.draw(canvas);
        c();
        if (this.i == null && this.q != null && this.r > 0) {
            this.q.mutate().setAlpha(this.r);
            this.q.draw(canvas);
        }
        if (this.o && this.p) {
            defpackage.ew ewVar = this.c;
            int save = canvas.save();
            if (ewVar.n != null && ewVar.a) {
                float f3 = ewVar.i;
                float f4 = ewVar.j;
                boolean z = ewVar.o && ewVar.p != null;
                if (z) {
                    f2 = ewVar.r * ewVar.s;
                } else {
                    ewVar.v.ascent();
                    f2 = 0.0f;
                    ewVar.v.descent();
                }
                if (z) {
                    f4 += f2;
                }
                if (ewVar.s != 1.0f) {
                    canvas.scale(ewVar.s, ewVar.s, f3, f4);
                }
                if (z) {
                    canvas.drawBitmap(ewVar.p, f3, f4, ewVar.q);
                } else {
                    canvas.drawText(ewVar.n, 0, ewVar.n.length(), f3, f4, ewVar.v);
                }
            }
            canvas.restoreToCount(save);
        }
        if (this.d != null && this.r > 0) {
            if (this.f != null) {
                i2 = this.f.b();
            } else {
                i2 = 0;
            }
            if (i2 > 0) {
                this.d.setBounds(0, -this.e, getWidth(), i2 - this.e);
                this.d.mutate().setAlpha(this.r);
                this.d.draw(canvas);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j2) {
        boolean z;
        if (this.q != null && this.r > 0) {
            boolean z2 = (this.j == null || this.j == this) ? view == this.i : view == this.j;
            if (z2) {
                this.q.mutate().setAlpha(this.r);
                this.q.draw(canvas);
                z = true;
                if (!super.drawChild(canvas, view, j2) || z) {
                    return true;
                }
                return false;
            }
        }
        z = false;
        if (!super.drawChild(canvas, view, j2)) {
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (this.q != null) {
            this.q.setBounds(0, 0, i2, i3);
        }
    }

    private final void c() {
        android.support.v7.widget.Toolbar toolbar;
        if (this.g) {
            this.i = null;
            this.j = null;
            if (this.h != -1) {
                this.i = (android.support.v7.widget.Toolbar) findViewById(this.h);
                if (this.i != null) {
                    android.view.View view = this.i;
                    android.view.ViewParent parent = view.getParent();
                    while (parent != this && parent != null) {
                        if (parent instanceof android.view.View) {
                            view = (android.view.View) parent;
                        }
                        parent = parent.getParent();
                    }
                    this.j = view;
                }
            }
            if (this.i == null) {
                int childCount = getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        toolbar = null;
                        break;
                    }
                    android.view.View childAt = getChildAt(i2);
                    if (childAt instanceof android.support.v7.widget.Toolbar) {
                        toolbar = (android.support.v7.widget.Toolbar) childAt;
                        break;
                    }
                    i2++;
                }
                this.i = toolbar;
            }
            if (!this.o && this.k != null) {
                android.view.ViewParent parent2 = this.k.getParent();
                if (parent2 instanceof android.view.ViewGroup) {
                    ((android.view.ViewGroup) parent2).removeView(this.k);
                }
            }
            if (this.o && this.i != null) {
                if (this.k == null) {
                    this.k = new android.view.View(getContext());
                }
                if (this.k.getParent() == null) {
                    this.i.addView(this.k, -1, -1);
                }
            }
            this.g = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        c();
        super.onMeasure(i2, i3);
        int mode = android.view.View.MeasureSpec.getMode(i3);
        int i4 = this.f != null ? this.f.b() : 0;
        if (mode == 0 && i4 > 0) {
            super.onMeasure(i2, android.view.View.MeasureSpec.makeMeasureSpec(i4 + getMeasuredHeight(), 1073741824));
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        boolean z2;
        int i6;
        int i7;
        super.onLayout(changed, left, top, right, bottom);
        if (this.f != null) {
            int b2 = this.f.b();
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                android.view.View childAt = getChildAt(i8);
                if (!ViewCompat.a.h(childAt) && childAt.getTop() < b2) {
                    ViewCompat.b(childAt, b2);
                }
            }
        }
        if (this.o && this.k != null) {
            this.p = ViewCompat.a.s(this.k) && this.k.getVisibility() == 0;
            if (this.p) {
                if (ViewCompat.a.j(this) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int b3 = b(this.j != null ? this.j : this.i);
                defpackage.ex.a((android.view.ViewGroup) this, this.k, this.n);
                defpackage.ew ewVar = this.c;
                int i9 = this.n.left;
                if (z2) {
                    i6 = this.i.t;
                } else {
                    i6 = this.i.s;
                }
                int i10 = i9 + i6;
                int i11 = this.i.u + this.n.top + b3;
                int i12 = this.n.right;
                if (z2) {
                    i7 = this.i.s;
                } else {
                    i7 = this.i.t;
                }
                int i13 = i7 + i12;
                int i14 = (b3 + this.n.bottom) - this.i.v;
                if (!defpackage.ew.a(ewVar.d, i10, i11, i13, i14)) {
                    ewVar.d.set(i10, i11, i13, i14);
                    ewVar.u = true;
                    ewVar.a();
                }
                defpackage.ew ewVar2 = this.c;
                int i15 = z2 ? this.m : this.l;
                int i16 = this.n.top + this.a;
                int i17 = (right - left) - (z2 ? this.l : this.m);
                int i18 = (bottom - top) - this.expandedTitleMarginBottom;
                if (!defpackage.ew.a(ewVar2.c, i15, i16, i17, i18)) {
                    ewVar2.c.set(i15, i16, i17, i18);
                    ewVar2.u = true;
                    ewVar2.a();
                }
                this.c.c();
            }
        }
        int childCount2 = getChildCount();
        for (int i19 = 0; i19 < childCount2; i19++) {
            a(getChildAt(i19)).a();
        }
        if (this.i != null) {
            if (this.o && android.text.TextUtils.isEmpty(this.c.m)) {
                this.c.a(this.i.mSubtitleText);
            }
            if (this.j == null || this.j == this) {
                setMinimumHeight(c(this.i));
            } else {
                setMinimumHeight(c(this.j));
            }
        }
        b();
    }

    private static int c(android.view.View view) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
            return view.getHeight();
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.bottomMargin + view.getHeight() + marginLayoutParams.topMargin;
    }

    public static ViewOffsetHelper a(android.view.View view) {
        ViewOffsetHelper djVar = (ViewOffsetHelper) view.getTag(2131755049);
        if (djVar != null) {
            return djVar;
        }
        ViewOffsetHelper djVar2 = new ViewOffsetHelper(view);
        view.setTag(2131755049, djVar2);
        return djVar2;
    }

    public final void a(java.lang.CharSequence charSequence) {
        this.c.a(charSequence);
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2) {
        if (i2 != this.r) {
            if (!(this.q == null || this.i == null)) {
                ViewCompat.a.c(this.i);
            }
            this.r = i2;
            ViewCompat.a.c(this);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        boolean z;
        boolean z2 = false;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        android.graphics.drawable.Drawable drawable = this.d;
        if (drawable == null || !drawable.isStateful()) {
            z = false;
        } else {
            z = drawable.setState(drawableState) | false;
        }
        android.graphics.drawable.Drawable drawable2 = this.q;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (this.c != null) {
            defpackage.ew ewVar = this.c;
            ewVar.t = drawableState;
            if ((ewVar.h != null && ewVar.h.isStateful()) || (ewVar.g != null && ewVar.g.isStateful())) {
                ewVar.c();
                z2 = true;
            }
            z |= z2;
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.q || drawable == this.d;
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        if (!(this.d == null || this.d.isVisible() == z)) {
            this.d.setVisible(z, false);
        }
        if (this.q != null && this.q.isVisible() != z) {
            this.q.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof defpackage.dd;
    }

    /* renamed from: a */
    public defpackage.dd generateDefaultLayoutParams() {
        return new defpackage.dd();
    }

    public android.widget.FrameLayout.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new defpackage.dd(getContext(), attributeSet);
    }

    /* renamed from: a */
    public android.widget.FrameLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new defpackage.dd(layoutParams);
    }

    public final void b() {
        int height;
        boolean z;
        boolean z2;
        int i2;
        android.animation.TimeInterpolator timeInterpolator;
        int i3 = 255;
        if (this.q != null || this.d != null) {
            int height2 = this.e + getHeight();
            if (this.v >= 0) {
                height = this.v;
            } else {
                int i4 = this.f != null ? this.f.b() : 0;
                int f2 = ViewCompat.a.f(this);
                if (f2 > 0) {
                    height = java.lang.Math.min(i4 + (f2 << 1), getHeight());
                } else {
                    height = getHeight() / 3;
                }
            }
            if (height2 < height) {
                z = true;
            } else {
                z = false;
            }
            if (!ViewCompat.a.r(this) || isInEditMode()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (this.s != z) {
                if (z2) {
                    if (z) {
                        i2 = 255;
                    } else {
                        i2 = 0;
                    }
                    c();
                    if (this.t == null) {
                        this.t = new android.animation.ValueAnimator();
                        this.t.setDuration(this.u);
                        android.animation.ValueAnimator valueAnimator = this.t;
                        if (i2 > this.r) {
                            timeInterpolator = defpackage.cs.b;
                        } else {
                            timeInterpolator = defpackage.cs.c;
                        }
                        valueAnimator.setInterpolator(timeInterpolator);
                        this.t.addUpdateListener(new defpackage.dc(this));
                    } else if (this.t.isRunning()) {
                        this.t.cancel();
                    }
                    this.t.setIntValues(new int[]{this.r, i2});
                    this.t.start();
                } else {
                    if (!z) {
                        i3 = 0;
                    }
                    a(i3);
                }
                this.s = z;
            }
        }
    }

    public final int b(android.view.View view) {
        return ((getHeight() - a(view).a) - view.getHeight()) - ((defpackage.dd) view.getLayoutParams()).bottomMargin;
    }
}
