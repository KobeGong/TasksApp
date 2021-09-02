package android.support.v7.widget;

import android.view.View;

import com.google.android.apps.tasks.R;

import defpackage.OnMenuItemClickListener;

/* compiled from: PG */
public class Toolbar extends android.view.ViewGroup {
    public OnMenuItemClickListener mOnMenuItemClickListener;
    public defpackage.aap B;
    public defpackage.agz C;
    public boolean D;
    private int E;
    private int F;
    private boolean G;
    private boolean H;
    private final java.util.ArrayList I;
    private final int[] J;
    private final defpackage.abc K;
    private defpackage.acr L;
    private final java.lang.Runnable M;
    private android.widget.ImageButton mNavButtonView;
    private android.widget.ImageView b;
    private int c;
    private int d;
    private int e;
    private int f;
    public android.support.v7.widget.ActionMenuView g;
    public android.widget.TextView h;
    public android.widget.TextView i;
    public android.graphics.drawable.Drawable j;
    public java.lang.CharSequence k;
    public android.widget.ImageButton l;
    public View m;
    public android.content.Context n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public defpackage.afz w;
    public java.lang.CharSequence x;
    public java.lang.CharSequence y;
    public final java.util.ArrayList z;

    public Toolbar(android.content.Context context) {
        this(context, null);
    }

    public Toolbar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130772187);
    }

    public Toolbar(android.content.Context context, android.util.AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f = 8388627;
        this.I = new java.util.ArrayList();
        this.z = new java.util.ArrayList();
        this.J = new int[2];
        this.K = new defpackage.abc(this);
        this.M = new defpackage.agx(this);
        defpackage.agw a2 = defpackage.agw.a(getContext(), attributeSet, defpackage.xu.cz, i2, 0);
        this.p = a2.g(defpackage.xu.da, 0);
        this.q = a2.g(defpackage.xu.cR, 0);
        this.f = a2.c(defpackage.xu.cA, this.f);
        this.r = a2.c(defpackage.xu.cB, 48);
        int d2 = a2.d(defpackage.xu.cU, 0);
        if (a2.f(defpackage.xu.cZ)) {
            d2 = a2.d(defpackage.xu.cZ, d2);
        }
        this.v = d2;
        this.u = d2;
        this.t = d2;
        this.s = d2;
        int d3 = a2.d(defpackage.xu.cX, -1);
        if (d3 >= 0) {
            this.s = d3;
        }
        int d4 = a2.d(defpackage.xu.cW, -1);
        if (d4 >= 0) {
            this.t = d4;
        }
        int d5 = a2.d(defpackage.xu.cY, -1);
        if (d5 >= 0) {
            this.u = d5;
        }
        int d6 = a2.d(defpackage.xu.cV, -1);
        if (d6 >= 0) {
            this.v = d6;
        }
        this.c = a2.e(defpackage.xu.cM, -1);
        int d7 = a2.d(defpackage.xu.cI, Integer.MIN_VALUE);
        int d8 = a2.d(defpackage.xu.cE, Integer.MIN_VALUE);
        int e2 = a2.e(defpackage.xu.cG, 0);
        int e3 = a2.e(defpackage.xu.cH, 0);
        n();
        defpackage.afz afz = this.w;
        afz.h = false;
        if (e2 != Integer.MIN_VALUE) {
            afz.e = e2;
            afz.a = e2;
        }
        if (e3 != Integer.MIN_VALUE) {
            afz.f = e3;
            afz.b = e3;
        }
        if (!(d7 == Integer.MIN_VALUE && d8 == Integer.MIN_VALUE)) {
            this.w.a(d7, d8);
        }
        this.d = a2.d(defpackage.xu.cJ, Integer.MIN_VALUE);
        this.e = a2.d(defpackage.xu.cF, Integer.MIN_VALUE);
        this.j = a2.a(defpackage.xu.cD);
        this.k = a2.c(defpackage.xu.cC);
        java.lang.CharSequence c2 = a2.c(defpackage.xu.cT);
        if (!android.text.TextUtils.isEmpty(c2)) {
            a(c2);
        }
        java.lang.CharSequence c3 = a2.c(defpackage.xu.cQ);
        if (!android.text.TextUtils.isEmpty(c3)) {
            b(c3);
        }
        this.n = getContext();
        a(a2.g(defpackage.xu.cP, 0));
        android.graphics.drawable.Drawable a3 = a2.a(defpackage.xu.cO);
        if (a3 != null) {
            b(a3);
        }
        java.lang.CharSequence c4 = a2.c(defpackage.xu.cN);
        if (!android.text.TextUtils.isEmpty(c4)) {
            c(c4);
        }
        android.graphics.drawable.Drawable a4 = a2.a(defpackage.xu.cK);
        if (a4 != null) {
            a(a4);
        }
        java.lang.CharSequence c5 = a2.c(defpackage.xu.cL);
        if (!android.text.TextUtils.isEmpty(c5)) {
            if (!android.text.TextUtils.isEmpty(c5)) {
                a();
            }
            if (this.b != null) {
                this.b.setContentDescription(c5);
            }
        }
        if (a2.f(defpackage.xu.db)) {
            int b2 = a2.b(defpackage.xu.db, -1);
            this.E = b2;
            if (this.h != null) {
                this.h.setTextColor(b2);
            }
        }
        if (a2.f(defpackage.xu.cS)) {
            int b3 = a2.b(defpackage.xu.cS, -1);
            this.F = b3;
            if (this.i != null) {
                this.i.setTextColor(b3);
            }
        }
        a2.b.recycle();
    }

    public final void a(int i2) {
        if (this.o != i2) {
            this.o = i2;
            if (i2 == 0) {
                this.n = getContext();
            } else {
                this.n = new android.view.ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void onRtlPropertiesChanged(int i2) {
        boolean z2 = true;
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i2);
        }
        n();
        defpackage.afz afz = this.w;
        if (i2 != 1) {
            z2 = false;
        }
        if (z2 != afz.g) {
            afz.g = z2;
            if (!afz.h) {
                afz.a = afz.e;
                afz.b = afz.f;
            } else if (z2) {
                afz.a = afz.d != Integer.MIN_VALUE ? afz.d : afz.e;
                afz.b = afz.c != Integer.MIN_VALUE ? afz.c : afz.f;
            } else {
                afz.a = afz.c != Integer.MIN_VALUE ? afz.c : afz.e;
                afz.b = afz.d != Integer.MIN_VALUE ? afz.d : afz.f;
            }
        }
    }

    public final boolean f() {
        boolean z2;
        if (this.g != null) {
            android.support.v7.widget.ActionMenuView actionMenuView = this.g;
            if (actionMenuView.c == null || !actionMenuView.c.i()) {
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

    public final boolean g() {
        boolean z2;
        if (this.g != null) {
            android.support.v7.widget.ActionMenuView actionMenuView = this.g;
            if (actionMenuView.c == null || !actionMenuView.c.e()) {
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

    public final void a(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            a();
            if (!d((View) this.b)) {
                a((View) this.b, true);
            }
        } else if (this.b != null && d((View) this.b)) {
            removeView(this.b);
            this.z.remove(this.b);
        }
        if (this.b != null) {
            this.b.setImageDrawable(drawable);
        }
    }

    private final void a() {
        if (this.b == null) {
            this.b = new defpackage.abt(getContext());
        }
    }

    public final void h() {
        defpackage.zi ziVar = this.C == null ? null : this.C.a;
        if (ziVar != null) {
            ziVar.collapseActionView();
        }
    }

    public void a(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            if (this.h == null) {
                android.content.Context context = getContext();
                this.h = new defpackage.ack(context);
                this.h.setSingleLine();
                this.h.setEllipsize(android.text.TextUtils.TruncateAt.END);
                if (this.p != 0) {
                    this.h.setTextAppearance(context, this.p);
                }
                if (this.E != 0) {
                    this.h.setTextColor(this.E);
                }
            }
            if (!d((View) this.h)) {
                a((View) this.h, true);
            }
        } else if (this.h != null && d((View) this.h)) {
            removeView(this.h);
            this.z.remove(this.h);
        }
        if (this.h != null) {
            this.h.setText(charSequence);
        }
        this.x = charSequence;
    }

    public void b(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            if (this.i == null) {
                android.content.Context context = getContext();
                this.i = new defpackage.ack(context);
                this.i.setSingleLine();
                this.i.setEllipsize(android.text.TextUtils.TruncateAt.END);
                if (this.q != 0) {
                    this.i.setTextAppearance(context, this.q);
                }
                if (this.F != 0) {
                    this.i.setTextColor(this.F);
                }
            }
            if (!d((View) this.i)) {
                a((View) this.i, true);
            }
        } else if (this.i != null && d((View) this.i)) {
            removeView(this.i);
            this.z.remove(this.i);
        }
        if (this.i != null) {
            this.i.setText(charSequence);
        }
        this.y = charSequence;
    }

    public final java.lang.CharSequence i() {
        if (this.mNavButtonView != null) {
            return this.mNavButtonView.getContentDescription();
        }
        return null;
    }

    public final void b(int i2) {
        c(i2 != 0 ? getContext().getText(i2) : null);
    }

    public final void c(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            ensureNavButtonView();
        }
        if (this.mNavButtonView != null) {
            this.mNavButtonView.setContentDescription(charSequence);
        }
    }

    public final void c(int i2) {
        b(defpackage.xw.b(getContext(), i2));
    }

    public final void b(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            ensureNavButtonView();
            if (!d((View) this.mNavButtonView)) {
                a((View) this.mNavButtonView, true);
            }
        } else if (this.mNavButtonView != null && d((View) this.mNavButtonView)) {
            removeView(this.mNavButtonView);
            this.z.remove(this.mNavButtonView);
        }
        if (this.mNavButtonView != null) {
            this.mNavButtonView.setImageDrawable(drawable);
        }
    }

    public final android.graphics.drawable.Drawable j() {
        if (this.mNavButtonView != null) {
            return this.mNavButtonView.getDrawable();
        }
        return null;
    }

    public final void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        ensureNavButtonView();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    public final android.view.Menu k() {
        l();
        if (this.g.a == null) {
            defpackage.ze zeVar = (defpackage.ze) this.g.b();
            if (this.C == null) {
                this.C = new defpackage.agz(this);
            }
            this.g.c.i = true;
            zeVar.a((defpackage.zt) this.C, this.n);
        }
        return this.g.b();
    }

    /* access modifiers changed from: 0000 */
    public final void l() {
        if (this.g == null) {
            this.g = new android.support.v7.widget.ActionMenuView(getContext());
            this.g.a(this.o);
            this.g.f = this.K;
            android.support.v7.widget.ActionMenuView actionMenuView = this.g;
            actionMenuView.d = null;
            actionMenuView.e = null;
            defpackage.aha aha = new defpackage.aha();
            aha.a = 8388613 | (this.r & 112);
            this.g.setLayoutParams(aha);
            a((View) this.g, false);
        }
    }

    public final void d(int i2) {
        new defpackage.yj(getContext()).inflate(i2, k());
    }

    private final int b() {
        if (this.w == null) {
            return 0;
        }
        defpackage.afz afz = this.w;
        return afz.g ? afz.b : afz.a;
    }

    private final int c() {
        if (this.w == null) {
            return 0;
        }
        defpackage.afz afz = this.w;
        return afz.g ? afz.a : afz.b;
    }

    private final int d() {
        if (j() != null) {
            return java.lang.Math.max(b(), java.lang.Math.max(this.d, 0));
        }
        return b();
    }

    private final int e() {
        boolean z2;
        if (this.g != null) {
            defpackage.ze zeVar = this.g.a;
            z2 = zeVar != null && zeVar.hasVisibleItems();
        } else {
            z2 = false;
        }
        if (z2) {
            return java.lang.Math.max(c(), java.lang.Math.max(this.e, 0));
        }
        return c();
    }

    private final void ensureNavButtonView() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new defpackage.abr(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            defpackage.aha aha = new defpackage.aha();
            aha.a = 8388611 | (this.r & 112);
            this.mNavButtonView.setLayoutParams(aha);
        }
    }

    private final void a(View view, boolean z2) {
        defpackage.aha aha;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            aha = new defpackage.aha();
        } else if (!checkLayoutParams(layoutParams)) {
            aha = a(layoutParams);
        } else {
            aha = (defpackage.aha) layoutParams;
        }
        aha.b = 1;
        if (!z2 || this.m == null) {
            addView(view, aha);
            return;
        }
        view.setLayoutParams(aha);
        this.z.add(view);
    }

    public android.os.Parcelable onSaveInstanceState() {
        defpackage.ahc ahc = new defpackage.ahc(super.onSaveInstanceState());
        if (!(this.C == null || this.C.a == null)) {
            ahc.a = this.C.a.getItemId();
        }
        ahc.b = f();
        return ahc;
    }

    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        defpackage.ze zeVar;
        if (!(parcelable instanceof defpackage.ahc)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        defpackage.ahc ahc = (defpackage.ahc) parcelable;
        super.onRestoreInstanceState(ahc.e);
        if (this.g != null) {
            zeVar = this.g.a;
        } else {
            zeVar = null;
        }
        if (!(ahc.a == 0 || this.C == null || zeVar == null)) {
            android.view.MenuItem findItem = zeVar.findItem(ahc.a);
            if (findItem != null) {
                findItem.expandActionView();
            }
        }
        if (ahc.b) {
            removeCallbacks(this.M);
            post(this.M);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.M);
    }

    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.G = false;
        }
        if (!this.G) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.G = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.G = false;
        }
        return true;
    }

    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.H = false;
        }
        if (!this.H) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.H = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.H = false;
        }
        return true;
    }

    private final void a(View view, int i2, int i3, int i4, int i5) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = java.lang.Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private final int a(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = java.lang.Math.max(0, i6) + java.lang.Math.max(0, i7);
        iArr[0] = java.lang.Math.max(0, -i6);
        iArr[1] = java.lang.Math.max(0, -i7);
        view.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + max + i3, marginLayoutParams.width), getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        char c2;
        char c3;
        int i4;
        int i5;
        int i6;
        int i7;
        int[] iArr = this.J;
        if (defpackage.ahr.a(this)) {
            c2 = 0;
            c3 = 1;
        } else {
            c2 = 1;
            c3 = 0;
        }
        int i8 = 0;
        if (a((View) this.mNavButtonView)) {
            a(this.mNavButtonView, i2, 0, i3, this.c);
            i8 = this.mNavButtonView.getMeasuredWidth() + b((View) this.mNavButtonView);
            int max = java.lang.Math.max(0, this.mNavButtonView.getMeasuredHeight() + c((View) this.mNavButtonView));
            i4 = View.combineMeasuredStates(0, this.mNavButtonView.getMeasuredState());
            i5 = max;
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (a((View) this.l)) {
            a(this.l, i2, 0, i3, this.c);
            i8 = this.l.getMeasuredWidth() + b((View) this.l);
            i5 = java.lang.Math.max(i5, this.l.getMeasuredHeight() + c((View) this.l));
            i4 = View.combineMeasuredStates(i4, this.l.getMeasuredState());
        }
        int d2 = d();
        int max2 = java.lang.Math.max(d2, i8) + 0;
        iArr[c3] = java.lang.Math.max(0, d2 - i8);
        int i9 = 0;
        if (a((View) this.g)) {
            a(this.g, i2, max2, i3, this.c);
            i9 = this.g.getMeasuredWidth() + b((View) this.g);
            i5 = java.lang.Math.max(i5, this.g.getMeasuredHeight() + c((View) this.g));
            i4 = View.combineMeasuredStates(i4, this.g.getMeasuredState());
        }
        int e2 = e();
        int max3 = max2 + java.lang.Math.max(e2, i9);
        iArr[c2] = java.lang.Math.max(0, e2 - i9);
        if (a(this.m)) {
            max3 += a(this.m, i2, max3, i3, 0, iArr);
            i5 = java.lang.Math.max(i5, this.m.getMeasuredHeight() + c(this.m));
            i4 = View.combineMeasuredStates(i4, this.m.getMeasuredState());
        }
        if (a((View) this.b)) {
            max3 += a(this.b, i2, max3, i3, 0, iArr);
            i5 = java.lang.Math.max(i5, this.b.getMeasuredHeight() + c((View) this.b));
            i4 = View.combineMeasuredStates(i4, this.b.getMeasuredState());
        }
        int childCount = getChildCount();
        int i10 = 0;
        int i11 = i4;
        int i12 = i5;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (((defpackage.aha) childAt.getLayoutParams()).b != 0 || !a(childAt)) {
                i6 = i11;
                i7 = i12;
            } else {
                max3 += a(childAt, i2, max3, i3, 0, iArr);
                int max4 = java.lang.Math.max(i12, childAt.getMeasuredHeight() + c(childAt));
                i6 = View.combineMeasuredStates(i11, childAt.getMeasuredState());
                i7 = max4;
            }
            i10++;
            i11 = i6;
            i12 = i7;
        }
        int i13 = 0;
        int i14 = 0;
        int i15 = this.u + this.v;
        int i16 = this.s + this.t;
        if (a((View) this.h)) {
            a(this.h, i2, max3 + i16, i3, i15, iArr);
            i13 = b((View) this.h) + this.h.getMeasuredWidth();
            i14 = this.h.getMeasuredHeight() + c((View) this.h);
            i11 = View.combineMeasuredStates(i11, this.h.getMeasuredState());
        }
        if (a((View) this.i)) {
            i13 = java.lang.Math.max(i13, a(this.i, i2, max3 + i16, i3, i15 + i14, iArr));
            i14 += this.i.getMeasuredHeight() + c((View) this.i);
            i11 = View.combineMeasuredStates(i11, this.i.getMeasuredState());
        }
        int i17 = i13 + max3;
        int max5 = java.lang.Math.max(i12, i14) + getPaddingTop() + getPaddingBottom();
        int i18 = i2;
        setMeasuredDimension(View.resolveSizeAndState(java.lang.Math.max(i17 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i18, -16777216 & i11), View.resolveSizeAndState(java.lang.Math.max(max5, getSuggestedMinimumHeight()), i3, i11 << 16));
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean z3;
        int i6;
        int i7;
        int d2;
        int e2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if (defpackage.sn.a.j(this) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i19 = width - paddingRight;
        int[] iArr = this.J;
        iArr[1] = 0;
        iArr[0] = 0;
        int f2 = defpackage.sn.a.f(this);
        int i20 = f2 >= 0 ? java.lang.Math.min(f2, i5 - i3) : 0;
        if (!a((View) this.mNavButtonView)) {
            i6 = i19;
            i7 = paddingLeft;
        } else if (z3) {
            i6 = b(this.mNavButtonView, i19, iArr, i20);
            i7 = paddingLeft;
        } else {
            int i21 = i19;
            i7 = a(this.mNavButtonView, paddingLeft, iArr, i20);
            i6 = i21;
        }
        if (a((View) this.l)) {
            if (z3) {
                i6 = b(this.l, i6, iArr, i20);
            } else {
                i7 = a(this.l, i7, iArr, i20);
            }
        }
        if (a((View) this.g)) {
            if (z3) {
                i7 = a(this.g, i7, iArr, i20);
            } else {
                i6 = b(this.g, i6, iArr, i20);
            }
        }
        if (defpackage.sn.a.j(this) == 1) {
            d2 = e();
        } else {
            d2 = d();
        }
        if (defpackage.sn.a.j(this) == 1) {
            e2 = d();
        } else {
            e2 = e();
        }
        iArr[0] = java.lang.Math.max(0, d2 - i7);
        iArr[1] = java.lang.Math.max(0, e2 - ((width - paddingRight) - i6));
        int max = java.lang.Math.max(i7, d2);
        int min = java.lang.Math.min(i6, (width - paddingRight) - e2);
        if (a(this.m)) {
            if (z3) {
                min = b(this.m, min, iArr, i20);
            } else {
                max = a(this.m, max, iArr, i20);
            }
        }
        if (!a((View) this.b)) {
            i8 = min;
            i9 = max;
        } else if (z3) {
            i8 = b(this.b, min, iArr, i20);
            i9 = max;
        } else {
            i8 = min;
            i9 = a(this.b, max, iArr, i20);
        }
        boolean a2 = a((View) this.h);
        boolean a3 = a((View) this.i);
        int i22 = 0;
        if (a2) {
            defpackage.aha aha = (defpackage.aha) this.h.getLayoutParams();
            i22 = aha.bottomMargin + aha.topMargin + this.h.getMeasuredHeight() + 0;
        }
        if (a3) {
            defpackage.aha aha2 = (defpackage.aha) this.i.getLayoutParams();
            i10 = aha2.bottomMargin + aha2.topMargin + this.i.getMeasuredHeight() + i22;
        } else {
            i10 = i22;
        }
        if (a2 || a3) {
            defpackage.aha aha3 = (defpackage.aha) (a2 ? this.h : this.i).getLayoutParams();
            defpackage.aha aha4 = (defpackage.aha) (a3 ? this.i : this.h).getLayoutParams();
            boolean z4 = (a2 && this.h.getMeasuredWidth() > 0) || (a3 && this.i.getMeasuredWidth() > 0);
            switch (this.f & 112) {
                case 48:
                    i11 = aha3.topMargin + getPaddingTop() + this.u;
                    break;
                case 80:
                    i11 = (((height - paddingBottom) - aha4.bottomMargin) - this.v) - i10;
                    break;
                default:
                    int i23 = (((height - paddingTop) - paddingBottom) - i10) / 2;
                    if (i23 < aha3.topMargin + this.u) {
                        i18 = aha3.topMargin + this.u;
                    } else {
                        int i24 = (((height - paddingBottom) - i10) - i23) - paddingTop;
                        if (i24 < aha3.bottomMargin + this.v) {
                            i18 = java.lang.Math.max(0, i23 - ((aha4.bottomMargin + this.v) - i24));
                        } else {
                            i18 = i23;
                        }
                    }
                    i11 = paddingTop + i18;
                    break;
            }
            if (z3) {
                int i25 = (z4 ? this.s : 0) - iArr[1];
                int max2 = i8 - java.lang.Math.max(0, i25);
                iArr[1] = java.lang.Math.max(0, -i25);
                if (a2) {
                    defpackage.aha aha5 = (defpackage.aha) this.h.getLayoutParams();
                    int measuredWidth = max2 - this.h.getMeasuredWidth();
                    int measuredHeight = this.h.getMeasuredHeight() + i11;
                    this.h.layout(measuredWidth, i11, max2, measuredHeight);
                    i11 = measuredHeight + aha5.bottomMargin;
                    i15 = measuredWidth - this.t;
                } else {
                    i15 = max2;
                }
                if (a3) {
                    defpackage.aha aha6 = (defpackage.aha) this.i.getLayoutParams();
                    int i26 = aha6.topMargin + i11;
                    this.i.layout(max2 - this.i.getMeasuredWidth(), i26, max2, this.i.getMeasuredHeight() + i26);
                    int i27 = max2 - this.t;
                    int i28 = aha6.bottomMargin;
                    i16 = i27;
                } else {
                    i16 = max2;
                }
                if (z4) {
                    i17 = java.lang.Math.min(i15, i16);
                } else {
                    i17 = max2;
                }
                i8 = i17;
            } else {
                int i29 = (z4 ? this.s : 0) - iArr[0];
                i9 += java.lang.Math.max(0, i29);
                iArr[0] = java.lang.Math.max(0, -i29);
                if (a2) {
                    defpackage.aha aha7 = (defpackage.aha) this.h.getLayoutParams();
                    int measuredWidth2 = this.h.getMeasuredWidth() + i9;
                    int measuredHeight2 = this.h.getMeasuredHeight() + i11;
                    this.h.layout(i9, i11, measuredWidth2, measuredHeight2);
                    int i30 = aha7.bottomMargin + measuredHeight2;
                    i12 = measuredWidth2 + this.t;
                    i13 = i30;
                } else {
                    i12 = i9;
                    i13 = i11;
                }
                if (a3) {
                    defpackage.aha aha8 = (defpackage.aha) this.i.getLayoutParams();
                    int i31 = i13 + aha8.topMargin;
                    int measuredWidth3 = this.i.getMeasuredWidth() + i9;
                    this.i.layout(i9, i31, measuredWidth3, this.i.getMeasuredHeight() + i31);
                    int i32 = this.t + measuredWidth3;
                    int i33 = aha8.bottomMargin;
                    i14 = i32;
                } else {
                    i14 = i9;
                }
                if (z4) {
                    i9 = java.lang.Math.max(i12, i14);
                }
            }
        }
        a((java.util.List) this.I, 3);
        int size = this.I.size();
        int i34 = i9;
        for (int i35 = 0; i35 < size; i35++) {
            i34 = a((View) this.I.get(i35), i34, iArr, i20);
        }
        a((java.util.List) this.I, 5);
        int size2 = this.I.size();
        int i36 = 0;
        int i37 = i8;
        while (i36 < size2) {
            int b2 = b((View) this.I.get(i36), i37, iArr, i20);
            i36++;
            i37 = b2;
        }
        a((java.util.List) this.I, 1);
        java.util.ArrayList arrayList = this.I;
        int i38 = iArr[0];
        int i39 = iArr[1];
        int size3 = arrayList.size();
        int i40 = i39;
        int i41 = i38;
        int i42 = 0;
        int i43 = 0;
        while (i42 < size3) {
            View view = (View) arrayList.get(i42);
            defpackage.aha aha9 = (defpackage.aha) view.getLayoutParams();
            int i44 = aha9.leftMargin - i41;
            int i45 = aha9.rightMargin - i40;
            int max3 = java.lang.Math.max(0, i44);
            int max4 = java.lang.Math.max(0, i45);
            i41 = java.lang.Math.max(0, -i44);
            i40 = java.lang.Math.max(0, -i45);
            i42++;
            i43 += view.getMeasuredWidth() + max3 + max4;
        }
        int i46 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i43 / 2);
        int i47 = i46 + i43;
        if (i46 < i34) {
            i46 = i34;
        } else if (i47 > i37) {
            i46 -= i47 - i37;
        }
        int size4 = this.I.size();
        int i48 = i46;
        for (int i49 = 0; i49 < size4; i49++) {
            i48 = a((View) this.I.get(i49), i48, iArr, i20);
        }
        this.I.clear();
    }

    private final int a(View view, int i2, int[] iArr, int i3) {
        defpackage.aha aha = (defpackage.aha) view.getLayoutParams();
        int i4 = aha.leftMargin - iArr[0];
        int max = java.lang.Math.max(0, i4) + i2;
        iArr[0] = java.lang.Math.max(0, -i4);
        int a2 = a(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a2, max + measuredWidth, view.getMeasuredHeight() + a2);
        return aha.rightMargin + measuredWidth + max;
    }

    private final int b(View view, int i2, int[] iArr, int i3) {
        defpackage.aha aha = (defpackage.aha) view.getLayoutParams();
        int i4 = aha.rightMargin - iArr[1];
        int max = i2 - java.lang.Math.max(0, i4);
        iArr[1] = java.lang.Math.max(0, -i4);
        int a2 = a(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a2, max, view.getMeasuredHeight() + a2);
        return max - (aha.leftMargin + measuredWidth);
    }

    private final int a(View view, int i2) {
        int i3;
        defpackage.aha aha = (defpackage.aha) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i5 = aha.a & 112;
        switch (i5) {
            case 16:
            case 48:
            case 80:
                break;
            default:
                i5 = this.f & 112;
                break;
        }
        switch (i5) {
            case 48:
                return getPaddingTop() - i4;
            case 80:
                return (((getHeight() - getPaddingBottom()) - measuredHeight) - aha.bottomMargin) - i4;
            default:
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i6 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                if (i6 < aha.topMargin) {
                    i3 = aha.topMargin;
                } else {
                    int i7 = (((height - paddingBottom) - measuredHeight) - i6) - paddingTop;
                    i3 = i7 < aha.bottomMargin ? java.lang.Math.max(0, i6 - (aha.bottomMargin - i7)) : i6;
                }
                return i3 + paddingTop;
        }
    }

    private final void a(java.util.List list, int i2) {
        boolean z2 = true;
        if (defpackage.sn.a.j(this) != 1) {
            z2 = false;
        }
        int childCount = getChildCount();
        int a2 = defpackage.jd.a(i2, defpackage.sn.a.j(this));
        list.clear();
        if (z2) {
            for (int i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                defpackage.aha aha = (defpackage.aha) childAt.getLayoutParams();
                if (aha.b == 0 && a(childAt) && e(aha.a) == a2) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            defpackage.aha aha2 = (defpackage.aha) childAt2.getLayoutParams();
            if (aha2.b == 0 && a(childAt2) && e(aha2.a) == a2) {
                list.add(childAt2);
            }
        }
    }

    private final int e(int i2) {
        int j2 = defpackage.sn.a.j(this);
        int a2 = defpackage.jd.a(i2, j2) & 7;
        switch (a2) {
            case 1:
            case 3:
            case 5:
                return a2;
            default:
                return j2 == 1 ? 5 : 3;
        }
    }

    private final boolean a(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private static int b(View view) {
        int i2;
        int i3;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            i2 = marginLayoutParams.getMarginStart();
        } else {
            i2 = marginLayoutParams.leftMargin;
        }
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            i3 = marginLayoutParams.getMarginEnd();
        } else {
            i3 = marginLayoutParams.rightMargin;
        }
        return i3 + i2;
    }

    private static int c(View view) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
    }

    private static defpackage.aha a(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof defpackage.aha) {
            return new defpackage.aha((defpackage.aha) layoutParams);
        }
        if (layoutParams instanceof defpackage.wb) {
            return new defpackage.aha((defpackage.wb) layoutParams);
        }
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            return new defpackage.aha((android.view.ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new defpackage.aha(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof defpackage.aha);
    }

    public final defpackage.acr m() {
        if (this.L == null) {
            this.L = new defpackage.acr(this);
        }
        return this.L;
    }

    private final boolean d(View view) {
        return view.getParent() == this || this.z.contains(view);
    }

    public final void n() {
        if (this.w == null) {
            this.w = new defpackage.afz();
        }
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new defpackage.aha();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new defpackage.aha(getContext(), attributeSet);
    }
}
