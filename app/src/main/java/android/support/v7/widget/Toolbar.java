package android.support.v7.widget;

import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;

import com.google.android.apps.tasks.R;

import defpackage.AppCompatTextView;
import defpackage.ExpandedActionViewMenuPresenter;
import defpackage.MenuBuilder;
import defpackage.MenuItemImpl;
import defpackage.OnMenuItemClickListener;
import defpackage.SupportMenuInflater;
import defpackage.ToolbarLayoutParams;
import defpackage.ViewCompat;

/* compiled from: PG */
public class Toolbar extends android.view.ViewGroup {
    public OnMenuItemClickListener mOnMenuItemClickListener;
    public defpackage.aap B;
    public ExpandedActionViewMenuPresenter mExpandedMenuPresenter;
    public boolean D;
    private int mSubtitleTextColor;
    private int mTitleTextColor;
    private boolean G;
    private boolean H;
    private final java.util.ArrayList I;
    private final int[] J;
    private final defpackage.abc K;
    private defpackage.acr L;
    private final java.lang.Runnable M;
    private android.widget.ImageButton mNavButtonView;
    private android.widget.ImageView b;
    private final int c;
    private final int d;
    private final int e;
    private int f;
    public ActionMenuView mMenuView;
    public android.widget.TextView mSubtitleTextView;
    public android.widget.TextView mTitleTextView;
    public Drawable j;
    public java.lang.CharSequence k;
    public android.widget.ImageButton l;
    public View m;
    public android.content.Context n;
    public int mPopupTheme;
    public int mSubtitleTextAppearance;
    public int mTitleTextAppearance;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public defpackage.afz w;
    public java.lang.CharSequence mSubtitleText;
    public java.lang.CharSequence mTitleText;
    public final java.util.ArrayList mHiddenViews;

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
        this.mHiddenViews = new java.util.ArrayList();
        this.J = new int[2];
        this.K = new defpackage.abc(this);
        this.M = new defpackage.agx(this);
        defpackage.agw a2 = defpackage.agw.a(getContext(), attributeSet, defpackage.xu.cz, i2, 0);
        this.mSubtitleTextAppearance = a2.g(defpackage.xu.da, 0);
        this.mTitleTextAppearance = a2.g(defpackage.xu.cR, 0);
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
            setSubtitle(c2);
        }
        java.lang.CharSequence c3 = a2.c(defpackage.xu.cQ);
        if (!android.text.TextUtils.isEmpty(c3)) {
            setTitle(c3);
        }
        this.n = getContext();
        a(a2.g(defpackage.xu.cP, 0));
        Drawable a3 = a2.a(defpackage.xu.cO);
        if (a3 != null) {
            setNavigationIcon(a3);
        }
        java.lang.CharSequence c4 = a2.c(defpackage.xu.cN);
        if (!android.text.TextUtils.isEmpty(c4)) {
            c(c4);
        }
        Drawable a4 = a2.a(defpackage.xu.cK);
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
            this.mSubtitleTextColor = b2;
            if (this.mSubtitleTextView != null) {
                this.mSubtitleTextView.setTextColor(b2);
            }
        }
        if (a2.f(defpackage.xu.cS)) {
            int b3 = a2.b(defpackage.xu.cS, -1);
            this.mTitleTextColor = b3;
            if (this.mTitleTextView != null) {
                this.mTitleTextView.setTextColor(b3);
            }
        }
        a2.b.recycle();
    }

    public final void a(int i2) {
        if (this.mPopupTheme != i2) {
            this.mPopupTheme = i2;
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
        if (this.mMenuView != null) {
            ActionMenuView actionMenuView = this.mMenuView;
            z2 = actionMenuView.presenter != null && actionMenuView.presenter.i();
            return z2;
        }
        return false;
    }

    public final boolean g() {
        boolean z2;
        if (this.mMenuView != null) {
            ActionMenuView actionMenuView = this.mMenuView;
            z2 = actionMenuView.presenter != null && actionMenuView.presenter.e();
            return z2;
        }
        return false;
    }

    public final void a(Drawable drawable) {
        if (drawable != null) {
            a();
            if (!isChildOrHidden(this.b)) {
                addSystemView(this.b, true);
            }
        } else if (this.b != null && isChildOrHidden(this.b)) {
            removeView(this.b);
            this.mHiddenViews.remove(this.b);
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
        MenuItemImpl ziVar = this.mExpandedMenuPresenter == null ? null : this.mExpandedMenuPresenter.a;
        if (ziVar != null) {
            ziVar.collapseActionView();
        }
    }

    public void setSubtitle(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            if (this.mSubtitleTextView == null) {
                android.content.Context context = getContext();
                this.mSubtitleTextView = new AppCompatTextView(context);
                this.mSubtitleTextView.setSingleLine();
                this.mSubtitleTextView.setEllipsize(android.text.TextUtils.TruncateAt.END);
                if (this.mSubtitleTextAppearance != 0) {
                    this.mSubtitleTextView.setTextAppearance(context, this.mSubtitleTextAppearance);
                }
                if (this.mSubtitleTextColor != 0) {
                    this.mSubtitleTextView.setTextColor(this.mSubtitleTextColor);
                }
            }
            if (!isChildOrHidden(this.mSubtitleTextView)) {
                addSystemView(this.mSubtitleTextView, true);
            }
        } else if (this.mSubtitleTextView != null && isChildOrHidden(this.mSubtitleTextView)) {
            removeView(this.mSubtitleTextView);
            this.mHiddenViews.remove(this.mSubtitleTextView);
        }
        if (this.mSubtitleTextView != null) {
            this.mSubtitleTextView.setText(charSequence);
        }
        this.mSubtitleText = charSequence;
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            if (this.mTitleTextView == null) {
                android.content.Context context = getContext();
                this.mTitleTextView = new AppCompatTextView(context);
                this.mTitleTextView.setSingleLine();
                this.mTitleTextView.setEllipsize(android.text.TextUtils.TruncateAt.END);
                if (this.mTitleTextAppearance != 0) {
                    this.mTitleTextView.setTextAppearance(context, this.mTitleTextAppearance);
                }
                if (this.mTitleTextColor != 0) {
                    this.mTitleTextView.setTextColor(this.mTitleTextColor);
                }
            }
            if (!isChildOrHidden(this.mTitleTextView)) {
                addSystemView(this.mTitleTextView, true);
            }
        } else if (this.mTitleTextView != null && isChildOrHidden(this.mTitleTextView)) {
            removeView(this.mTitleTextView);
            this.mHiddenViews.remove(this.mTitleTextView);
        }
        if (this.mTitleTextView != null) {
            this.mTitleTextView.setText(charSequence);
        }
        this.mTitleText = charSequence;
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
        setNavigationIcon(defpackage.xw.b(getContext(), i2));
    }

    public final void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            ensureNavButtonView();
            if (!isChildOrHidden(this.mNavButtonView)) {
                addSystemView(this.mNavButtonView, true);
            }
        } else if (this.mNavButtonView != null && isChildOrHidden(this.mNavButtonView)) {
            removeView(this.mNavButtonView);
            this.mHiddenViews.remove(this.mNavButtonView);
        }
        if (this.mNavButtonView != null) {
            this.mNavButtonView.setImageDrawable(drawable);
        }
    }

    public final Drawable getNavigationIcon() {
        if (this.mNavButtonView != null) {
            return this.mNavButtonView.getDrawable();
        }
        return null;
    }

    public final void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        ensureNavButtonView();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    public final Menu getMenu() {
        ensureMenuView();
        if (this.mMenuView.peekMenu == null) {
            MenuBuilder menu = (MenuBuilder) this.mMenuView.getMenu();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new ExpandedActionViewMenuPresenter(this);
            }
            this.mMenuView.presenter.mExpandedActionViewsExclusive = true;
            menu.addMenuPresenter(this.mExpandedMenuPresenter, this.n);
        }
        return this.mMenuView.getMenu();
    }

    /* access modifiers changed from: 0000 */
    public final void ensureMenuView() {
        if (this.mMenuView == null) {
            this.mMenuView = new ActionMenuView(getContext());
            this.mMenuView.setPopupTheme(this.mPopupTheme);
            this.mMenuView.f = this.K;
            mMenuView.mActionMenuPresenterCallback = null;
            mMenuView.mMenuBuilderCallback = null;
            ToolbarLayoutParams lp = new ToolbarLayoutParams();
            lp.gravity = 8388613 | (this.r & 112);
            this.mMenuView.setLayoutParams(lp);
            addSystemView(this.mMenuView, false);
        }
    }

    public final void inflateMenu(int i2) {
        new SupportMenuInflater(getContext()).inflate(i2, getMenu());
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
        if (getNavigationIcon() != null) {
            return java.lang.Math.max(b(), java.lang.Math.max(this.d, 0));
        }
        return b();
    }

    private final int e() {
        boolean z2;
        if (this.mMenuView != null) {
            MenuBuilder zeVar = this.mMenuView.peekMenu;
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
            ToolbarLayoutParams aha = new ToolbarLayoutParams();
            aha.gravity = 8388611 | (this.r & 112);
            this.mNavButtonView.setLayoutParams(aha);
        }
    }

    private final void addSystemView(View view, boolean allowHide) {
        ToolbarLayoutParams aha;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            aha = new ToolbarLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            aha = a(layoutParams);
        } else {
            aha = (ToolbarLayoutParams) layoutParams;
        }
        aha.b = 1;
        if (!allowHide || this.m == null) {
            addView(view, aha);
            return;
        }
        view.setLayoutParams(aha);
        this.mHiddenViews.add(view);
    }

    public android.os.Parcelable onSaveInstanceState() {
        defpackage.ahc ahc = new defpackage.ahc(super.onSaveInstanceState());
        if (!(this.mExpandedMenuPresenter == null || this.mExpandedMenuPresenter.a == null)) {
            ahc.a = this.mExpandedMenuPresenter.a.getItemId();
        }
        ahc.b = f();
        return ahc;
    }

    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        MenuBuilder zeVar;
        if (!(parcelable instanceof defpackage.ahc)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        defpackage.ahc ahc = (defpackage.ahc) parcelable;
        super.onRestoreInstanceState(ahc.e);
        if (this.mMenuView != null) {
            zeVar = this.mMenuView.peekMenu;
        } else {
            zeVar = null;
        }
        if (!(ahc.a == 0 || this.mExpandedMenuPresenter == null || zeVar == null)) {
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
        if (a(this.mNavButtonView)) {
            a(this.mNavButtonView, i2, 0, i3, this.c);
            i8 = this.mNavButtonView.getMeasuredWidth() + b(this.mNavButtonView);
            int max = java.lang.Math.max(0, this.mNavButtonView.getMeasuredHeight() + c(this.mNavButtonView));
            i4 = View.combineMeasuredStates(0, this.mNavButtonView.getMeasuredState());
            i5 = max;
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (a(this.l)) {
            a(this.l, i2, 0, i3, this.c);
            i8 = this.l.getMeasuredWidth() + b(this.l);
            i5 = java.lang.Math.max(i5, this.l.getMeasuredHeight() + c(this.l));
            i4 = View.combineMeasuredStates(i4, this.l.getMeasuredState());
        }
        int d2 = d();
        int max2 = java.lang.Math.max(d2, i8) + 0;
        iArr[c3] = java.lang.Math.max(0, d2 - i8);
        int i9 = 0;
        if (a(this.mMenuView)) {
            a(this.mMenuView, i2, max2, i3, this.c);
            i9 = this.mMenuView.getMeasuredWidth() + b(this.mMenuView);
            i5 = java.lang.Math.max(i5, this.mMenuView.getMeasuredHeight() + c(this.mMenuView));
            i4 = View.combineMeasuredStates(i4, this.mMenuView.getMeasuredState());
        }
        int e2 = e();
        int max3 = max2 + java.lang.Math.max(e2, i9);
        iArr[c2] = java.lang.Math.max(0, e2 - i9);
        if (a(this.m)) {
            max3 += a(this.m, i2, max3, i3, 0, iArr);
            i5 = java.lang.Math.max(i5, this.m.getMeasuredHeight() + c(this.m));
            i4 = View.combineMeasuredStates(i4, this.m.getMeasuredState());
        }
        if (a(this.b)) {
            max3 += a(this.b, i2, max3, i3, 0, iArr);
            i5 = java.lang.Math.max(i5, this.b.getMeasuredHeight() + c(this.b));
            i4 = View.combineMeasuredStates(i4, this.b.getMeasuredState());
        }
        int childCount = getChildCount();
        int i10 = 0;
        int i11 = i4;
        int i12 = i5;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (((ToolbarLayoutParams) childAt.getLayoutParams()).b != 0 || !a(childAt)) {
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
        if (a(this.mSubtitleTextView)) {
            a(this.mSubtitleTextView, i2, max3 + i16, i3, i15, iArr);
            i13 = b(this.mSubtitleTextView) + this.mSubtitleTextView.getMeasuredWidth();
            i14 = this.mSubtitleTextView.getMeasuredHeight() + c(this.mSubtitleTextView);
            i11 = View.combineMeasuredStates(i11, this.mSubtitleTextView.getMeasuredState());
        }
        if (a(this.mTitleTextView)) {
            i13 = java.lang.Math.max(i13, a(this.mTitleTextView, i2, max3 + i16, i3, i15 + i14, iArr));
            i14 += this.mTitleTextView.getMeasuredHeight() + c(this.mTitleTextView);
            i11 = View.combineMeasuredStates(i11, this.mTitleTextView.getMeasuredState());
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
        z3 = ViewCompat.a.j(this) == 1;
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
        int f2 = ViewCompat.a.f(this);
        int i20 = f2 >= 0 ? java.lang.Math.min(f2, i5 - i3) : 0;
        if (!a(this.mNavButtonView)) {
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
        if (a(this.l)) {
            if (z3) {
                i6 = b(this.l, i6, iArr, i20);
            } else {
                i7 = a(this.l, i7, iArr, i20);
            }
        }
        if (a(this.mMenuView)) {
            if (z3) {
                i7 = a(this.mMenuView, i7, iArr, i20);
            } else {
                i6 = b(this.mMenuView, i6, iArr, i20);
            }
        }
        if (ViewCompat.a.j(this) == 1) {
            d2 = e();
        } else {
            d2 = d();
        }
        if (ViewCompat.a.j(this) == 1) {
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
        if (!a(this.b)) {
            i8 = min;
            i9 = max;
        } else if (z3) {
            i8 = b(this.b, min, iArr, i20);
            i9 = max;
        } else {
            i8 = min;
            i9 = a(this.b, max, iArr, i20);
        }
        boolean a2 = a(this.mSubtitleTextView);
        boolean a3 = a(this.mTitleTextView);
        int i22 = 0;
        if (a2) {
            ToolbarLayoutParams aha = (ToolbarLayoutParams) this.mSubtitleTextView.getLayoutParams();
            i22 = aha.bottomMargin + aha.topMargin + this.mSubtitleTextView.getMeasuredHeight() + 0;
        }
        if (a3) {
            ToolbarLayoutParams aha2 = (ToolbarLayoutParams) this.mTitleTextView.getLayoutParams();
            i10 = aha2.bottomMargin + aha2.topMargin + this.mTitleTextView.getMeasuredHeight() + i22;
        } else {
            i10 = i22;
        }
        if (a2 || a3) {
            ToolbarLayoutParams aha3 = (ToolbarLayoutParams) (a2 ? this.mSubtitleTextView : this.mTitleTextView).getLayoutParams();
            ToolbarLayoutParams aha4 = (ToolbarLayoutParams) (a3 ? this.mTitleTextView : this.mSubtitleTextView).getLayoutParams();
            boolean z4 = (a2 && this.mSubtitleTextView.getMeasuredWidth() > 0) || (a3 && this.mTitleTextView.getMeasuredWidth() > 0);
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
                    ToolbarLayoutParams aha5 = (ToolbarLayoutParams) this.mSubtitleTextView.getLayoutParams();
                    int measuredWidth = max2 - this.mSubtitleTextView.getMeasuredWidth();
                    int measuredHeight = this.mSubtitleTextView.getMeasuredHeight() + i11;
                    this.mSubtitleTextView.layout(measuredWidth, i11, max2, measuredHeight);
                    i11 = measuredHeight + aha5.bottomMargin;
                    i15 = measuredWidth - this.t;
                } else {
                    i15 = max2;
                }
                if (a3) {
                    ToolbarLayoutParams aha6 = (ToolbarLayoutParams) this.mTitleTextView.getLayoutParams();
                    int i26 = aha6.topMargin + i11;
                    this.mTitleTextView.layout(max2 - this.mTitleTextView.getMeasuredWidth(), i26, max2, this.mTitleTextView.getMeasuredHeight() + i26);
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
                    ToolbarLayoutParams aha7 = (ToolbarLayoutParams) this.mSubtitleTextView.getLayoutParams();
                    int measuredWidth2 = this.mSubtitleTextView.getMeasuredWidth() + i9;
                    int measuredHeight2 = this.mSubtitleTextView.getMeasuredHeight() + i11;
                    this.mSubtitleTextView.layout(i9, i11, measuredWidth2, measuredHeight2);
                    int i30 = aha7.bottomMargin + measuredHeight2;
                    i12 = measuredWidth2 + this.t;
                    i13 = i30;
                } else {
                    i12 = i9;
                    i13 = i11;
                }
                if (a3) {
                    ToolbarLayoutParams aha8 = (ToolbarLayoutParams) this.mTitleTextView.getLayoutParams();
                    int i31 = i13 + aha8.topMargin;
                    int measuredWidth3 = this.mTitleTextView.getMeasuredWidth() + i9;
                    this.mTitleTextView.layout(i9, i31, measuredWidth3, this.mTitleTextView.getMeasuredHeight() + i31);
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
        a(this.I, 3);
        int size = this.I.size();
        int i34 = i9;
        for (int i35 = 0; i35 < size; i35++) {
            i34 = a((View) this.I.get(i35), i34, iArr, i20);
        }
        a(this.I, 5);
        int size2 = this.I.size();
        int i36 = 0;
        int i37 = i8;
        while (i36 < size2) {
            int b2 = b((View) this.I.get(i36), i37, iArr, i20);
            i36++;
            i37 = b2;
        }
        a(this.I, 1);
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
            ToolbarLayoutParams aha9 = (ToolbarLayoutParams) view.getLayoutParams();
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
        ToolbarLayoutParams aha = (ToolbarLayoutParams) view.getLayoutParams();
        int i4 = aha.leftMargin - iArr[0];
        int max = java.lang.Math.max(0, i4) + i2;
        iArr[0] = java.lang.Math.max(0, -i4);
        int a2 = a(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a2, max + measuredWidth, view.getMeasuredHeight() + a2);
        return aha.rightMargin + measuredWidth + max;
    }

    private final int b(View view, int i2, int[] iArr, int i3) {
        ToolbarLayoutParams aha = (ToolbarLayoutParams) view.getLayoutParams();
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
        ToolbarLayoutParams aha = (ToolbarLayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i5 = aha.gravity & 112;
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
        if (ViewCompat.a.j(this) != 1) {
            z2 = false;
        }
        int childCount = getChildCount();
        int a2 = defpackage.jd.a(i2, ViewCompat.a.j(this));
        list.clear();
        if (z2) {
            for (int i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                ToolbarLayoutParams aha = (ToolbarLayoutParams) childAt.getLayoutParams();
                if (aha.b == 0 && a(childAt) && e(aha.gravity) == a2) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            ToolbarLayoutParams aha2 = (ToolbarLayoutParams) childAt2.getLayoutParams();
            if (aha2.b == 0 && a(childAt2) && e(aha2.gravity) == a2) {
                list.add(childAt2);
            }
        }
    }

    private final int e(int i2) {
        int j2 = ViewCompat.a.j(this);
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
        return view != null && view.getParent() == this && view.getVisibility() != 8;
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

    private static ToolbarLayoutParams a(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ToolbarLayoutParams) {
            return new ToolbarLayoutParams((ToolbarLayoutParams) layoutParams);
        }
        if (layoutParams instanceof defpackage.wb) {
            return new ToolbarLayoutParams((defpackage.wb) layoutParams);
        }
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            return new ToolbarLayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new ToolbarLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof ToolbarLayoutParams);
    }

    public final defpackage.acr m() {
        if (this.L == null) {
            this.L = new defpackage.acr(this);
        }
        return this.L;
    }

    private final boolean isChildOrHidden(View view) {
        return view.getParent() == this || this.mHiddenViews.contains(view);
    }

    public final void n() {
        if (this.w == null) {
            this.w = new defpackage.afz();
        }
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ToolbarLayoutParams();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new ToolbarLayoutParams(getContext(), attributeSet);
    }
}
