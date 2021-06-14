package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.tasks.R;
import java.util.ArrayList;
import java.util.List;

import defpackage.AppCompatImageButton;
import defpackage.aap;
import defpackage.abc;
import defpackage.acr;
import defpackage.agz;
import defpackage.aha;
import defpackage.ahb;
import defpackage.xw;

/* compiled from: PG */
public class Toolbar extends ViewGroup {
    public ahb A;
    public aap B;
    public agz C;
    public boolean D;
    private int E;
    private int F;
    private boolean G;
    private boolean H;
    private final ArrayList I;
    private final int[] J;
    private final abc K;
    private acr L;
    private final Runnable M;
    private ImageButton navButtonView;
    private ImageView b;
    private int c;
    private int d;
    private int e;
    private int f;
    public ActionMenuView g;
    public TextView h;
    public TextView i;
    public Drawable j;
    public CharSequence k;
    public ImageButton l;
    public View m;
    public Context n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public afz w;
    public CharSequence x;
    public CharSequence y;
    public final ArrayList z;

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f = 8388627;
        this.I = new ArrayList();
        this.z = new ArrayList();
        this.J = new int[2];
        this.K = new abc(this);
        this.M = new agx(this);
        agw a2 = agw.a(getContext(), attributeSet, xu.cz, i2, 0);
        this.p = a2.g(xu.da, 0);
        this.q = a2.g(xu.cR, 0);
        this.f = a2.c(xu.cA, this.f);
        this.r = a2.c(xu.cB, 48);
        int d2 = a2.d(xu.cU, 0);
        d2 = a2.f(xu.cZ) ? a2.d(xu.cZ, d2) : d2;
        this.v = d2;
        this.u = d2;
        this.t = d2;
        this.s = d2;
        int d3 = a2.d(xu.cX, -1);
        if (d3 >= 0) {
            this.s = d3;
        }
        int d4 = a2.d(xu.cW, -1);
        if (d4 >= 0) {
            this.t = d4;
        }
        int d5 = a2.d(xu.cY, -1);
        if (d5 >= 0) {
            this.u = d5;
        }
        int d6 = a2.d(xu.cV, -1);
        if (d6 >= 0) {
            this.v = d6;
        }
        this.c = a2.e(xu.cM, -1);
        int d7 = a2.d(xu.cI, Integer.MIN_VALUE);
        int d8 = a2.d(xu.cE, Integer.MIN_VALUE);
        int e2 = a2.e(xu.cG, 0);
        int e3 = a2.e(xu.cH, 0);
        n();
        afz afz = this.w;
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
        this.d = a2.d(xu.cJ, Integer.MIN_VALUE);
        this.e = a2.d(xu.cF, Integer.MIN_VALUE);
        this.j = a2.a(xu.cD);
        this.k = a2.c(xu.cC);
        CharSequence c2 = a2.c(xu.cT);
        if (!TextUtils.isEmpty(c2)) {
            a(c2);
        }
        CharSequence c3 = a2.c(xu.cQ);
        if (!TextUtils.isEmpty(c3)) {
            b(c3);
        }
        this.n = getContext();
        a(a2.g(xu.cP, 0));
        Drawable a3 = a2.a(xu.cO);
        if (a3 != null) {
            b(a3);
        }
        CharSequence c4 = a2.c(xu.cN);
        if (!TextUtils.isEmpty(c4)) {
            c(c4);
        }
        Drawable a4 = a2.a(xu.cK);
        if (a4 != null) {
            a(a4);
        }
        CharSequence c5 = a2.c(xu.cL);
        if (!TextUtils.isEmpty(c5)) {
            if (!TextUtils.isEmpty(c5)) {
                a();
            }
            if (this.b != null) {
                this.b.setContentDescription(c5);
            }
        }
        if (a2.f(xu.db)) {
            int b2 = a2.b(xu.db, -1);
            this.E = b2;
            if (this.h != null) {
                this.h.setTextColor(b2);
            }
        }
        if (a2.f(xu.cS)) {
            int b3 = a2.b(xu.cS, -1);
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
                this.n = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void onRtlPropertiesChanged(int i2) {
        boolean z2 = true;
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i2);
        }
        n();
        afz afz = this.w;
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
            ActionMenuView actionMenuView = this.g;
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
            ActionMenuView actionMenuView = this.g;
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

    public final void a(Drawable drawable) {
        if (drawable != null) {
            a();
            if (!d(this.b)) {
                a((View) this.b, true);
            }
        } else if (this.b != null && d(this.b)) {
            removeView(this.b);
            this.z.remove(this.b);
        }
        if (this.b != null) {
            this.b.setImageDrawable(drawable);
        }
    }

    private final void a() {
        if (this.b == null) {
            this.b = new abt(getContext());
        }
    }

    public final void h() {
        zi ziVar = this.C == null ? null : this.C.a;
        if (ziVar != null) {
            ziVar.collapseActionView();
        }
    }

    public void a(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.h == null) {
                Context context = getContext();
                this.h = new ack(context);
                this.h.setSingleLine();
                this.h.setEllipsize(TextUtils.TruncateAt.END);
                if (this.p != 0) {
                    this.h.setTextAppearance(context, this.p);
                }
                if (this.E != 0) {
                    this.h.setTextColor(this.E);
                }
            }
            if (!d(this.h)) {
                a((View) this.h, true);
            }
        } else if (this.h != null && d(this.h)) {
            removeView(this.h);
            this.z.remove(this.h);
        }
        if (this.h != null) {
            this.h.setText(charSequence);
        }
        this.x = charSequence;
    }

    public void b(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.i == null) {
                Context context = getContext();
                this.i = new ack(context);
                this.i.setSingleLine();
                this.i.setEllipsize(TextUtils.TruncateAt.END);
                if (this.q != 0) {
                    this.i.setTextAppearance(context, this.q);
                }
                if (this.F != 0) {
                    this.i.setTextColor(this.F);
                }
            }
            if (!d(this.i)) {
                a((View) this.i, true);
            }
        } else if (this.i != null && d(this.i)) {
            removeView(this.i);
            this.z.remove(this.i);
        }
        if (this.i != null) {
            this.i.setText(charSequence);
        }
        this.y = charSequence;
    }

    public final CharSequence i() {
        if (this.navButtonView != null) {
            return this.navButtonView.getContentDescription();
        }
        return null;
    }

    public final void b(int i2) {
        c(i2 != 0 ? getContext().getText(i2) : null);
    }

    public final void c(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureNavButtonView();
        }
        if (this.navButtonView != null) {
            this.navButtonView.setContentDescription(charSequence);
        }
    }

    public final void c(int i2) {
        b(xw.b(getContext(), i2));
    }

    public final void b(Drawable drawable) {
        if (drawable != null) {
            ensureNavButtonView();
            if (!d(this.navButtonView)) {
                a((View) this.navButtonView, true);
            }
        } else if (this.navButtonView != null && d(this.navButtonView)) {
            removeView(this.navButtonView);
            this.z.remove(this.navButtonView);
        }
        if (this.navButtonView != null) {
            this.navButtonView.setImageDrawable(drawable);
        }
    }

    public final Drawable j() {
        if (this.navButtonView != null) {
            return this.navButtonView.getDrawable();
        }
        return null;
    }

    public final void a(View.OnClickListener onClickListener) {
        ensureNavButtonView();
        this.navButtonView.setOnClickListener(onClickListener);
    }

    public final Menu k() {
        l();
        if (this.g.a == null) {
            ze zeVar = (ze) this.g.b();
            if (this.C == null) {
                this.C = new agz(this);
            }
            this.g.c.i = true;
            zeVar.a(this.C, this.n);
        }
        return this.g.b();
    }

    /* access modifiers changed from: package-private */
    public final void l() {
        if (this.g == null) {
            this.g = new ActionMenuView(getContext());
            this.g.a(this.o);
            this.g.f = this.K;
            ActionMenuView actionMenuView = this.g;
            actionMenuView.d = null;
            actionMenuView.e = null;
            aha aha = new aha();
            aha.a = 8388613 | (this.r & 112);
            this.g.setLayoutParams(aha);
            a((View) this.g, false);
        }
    }

    public final void d(int i2) {
        new yj(getContext()).inflate(i2, k());
    }

    private final int b() {
        if (this.w == null) {
            return 0;
        }
        afz afz = this.w;
        return afz.g ? afz.b : afz.a;
    }

    private final int c() {
        if (this.w == null) {
            return 0;
        }
        afz afz = this.w;
        return afz.g ? afz.a : afz.b;
    }

    private final int d() {
        if (j() != null) {
            return Math.max(b(), Math.max(this.d, 0));
        }
        return b();
    }

    private final int e() {
        boolean z2;
        if (this.g != null) {
            ze zeVar = this.g.a;
            z2 = zeVar != null && zeVar.hasVisibleItems();
        } else {
            z2 = false;
        }
        if (z2) {
            return Math.max(c(), Math.max(this.e, 0));
        }
        return c();
    }

    private final void ensureNavButtonView() {
        if (this.navButtonView == null) {
            this.navButtonView = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            aha aha = new aha();
            aha.a = 8388611 | (this.r & 112);
            this.navButtonView.setLayoutParams(aha);
        }
    }

    private final void a(View view, boolean z2) {
        aha aha;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            aha = new aha();
        } else if (!checkLayoutParams(layoutParams)) {
            aha = a(layoutParams);
        } else {
            aha = (aha) layoutParams;
        }
        aha.b = 1;
        if (!z2 || this.m == null) {
            addView(view, aha);
            return;
        }
        view.setLayoutParams(aha);
        this.z.add(view);
    }

    public Parcelable onSaveInstanceState() {
        ahc ahc = new ahc(super.onSaveInstanceState());
        if (!(this.C == null || this.C.a == null)) {
            ahc.a = this.C.a.getItemId();
        }
        ahc.b = f();
        return ahc;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ze zeVar;
        MenuItem findItem;
        if (!(parcelable instanceof ahc)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ahc ahc = (ahc) parcelable;
        super.onRestoreInstanceState(ahc.e);
        if (this.g != null) {
            zeVar = this.g.a;
        } else {
            zeVar = null;
        }
        if (!(ahc.a == 0 || this.C == null || zeVar == null || (findItem = zeVar.findItem(ahc.a)) == null)) {
            findItem.expandActionView();
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

    public boolean onTouchEvent(MotionEvent motionEvent) {
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

    public boolean onHoverEvent(MotionEvent motionEvent) {
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
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private final int a(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
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
        if (ahr.a(this)) {
            c2 = 0;
            c3 = 1;
        } else {
            c2 = 1;
            c3 = 0;
        }
        int i8 = 0;
        if (a(this.navButtonView)) {
            a(this.navButtonView, i2, 0, i3, this.c);
            i8 = this.navButtonView.getMeasuredWidth() + b(this.navButtonView);
            int max = Math.max(0, this.navButtonView.getMeasuredHeight() + c(this.navButtonView));
            i4 = View.combineMeasuredStates(0, this.navButtonView.getMeasuredState());
            i5 = max;
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (a(this.l)) {
            a(this.l, i2, 0, i3, this.c);
            i8 = this.l.getMeasuredWidth() + b(this.l);
            i5 = Math.max(i5, this.l.getMeasuredHeight() + c(this.l));
            i4 = View.combineMeasuredStates(i4, this.l.getMeasuredState());
        }
        int d2 = d();
        int max2 = Math.max(d2, i8) + 0;
        iArr[c3] = Math.max(0, d2 - i8);
        int i9 = 0;
        if (a(this.g)) {
            a(this.g, i2, max2, i3, this.c);
            i9 = this.g.getMeasuredWidth() + b(this.g);
            i5 = Math.max(i5, this.g.getMeasuredHeight() + c(this.g));
            i4 = View.combineMeasuredStates(i4, this.g.getMeasuredState());
        }
        int e2 = e();
        int max3 = max2 + Math.max(e2, i9);
        iArr[c2] = Math.max(0, e2 - i9);
        if (a(this.m)) {
            max3 += a(this.m, i2, max3, i3, 0, iArr);
            i5 = Math.max(i5, this.m.getMeasuredHeight() + c(this.m));
            i4 = View.combineMeasuredStates(i4, this.m.getMeasuredState());
        }
        if (a(this.b)) {
            max3 += a(this.b, i2, max3, i3, 0, iArr);
            i5 = Math.max(i5, this.b.getMeasuredHeight() + c(this.b));
            i4 = View.combineMeasuredStates(i4, this.b.getMeasuredState());
        }
        int childCount = getChildCount();
        int i10 = 0;
        int i11 = i4;
        int i12 = i5;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (((aha) childAt.getLayoutParams()).b != 0 || !a(childAt)) {
                i6 = i11;
                i7 = i12;
            } else {
                max3 += a(childAt, i2, max3, i3, 0, iArr);
                int max4 = Math.max(i12, childAt.getMeasuredHeight() + c(childAt));
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
        if (a(this.h)) {
            a(this.h, i2, max3 + i16, i3, i15, iArr);
            i13 = b(this.h) + this.h.getMeasuredWidth();
            i14 = this.h.getMeasuredHeight() + c(this.h);
            i11 = View.combineMeasuredStates(i11, this.h.getMeasuredState());
        }
        if (a(this.i)) {
            i13 = Math.max(i13, a(this.i, i2, max3 + i16, i3, i15 + i14, iArr));
            i14 += this.i.getMeasuredHeight() + c(this.i);
            i11 = View.combineMeasuredStates(i11, this.i.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i13 + max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, -16777216 & i11), View.resolveSizeAndState(Math.max(Math.max(i12, i14) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, i11 << 16));
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
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
        boolean z3 = sn.a.j(this) == 1;
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
        int f2 = sn.a.f(this);
        int min = f2 >= 0 ? Math.min(f2, i5 - i3) : 0;
        if (!a(this.navButtonView)) {
            i6 = i19;
            i7 = paddingLeft;
        } else if (z3) {
            i6 = b(this.navButtonView, i19, iArr, min);
            i7 = paddingLeft;
        } else {
            i7 = a(this.navButtonView, paddingLeft, iArr, min);
            i6 = i19;
        }
        if (a(this.l)) {
            if (z3) {
                i6 = b(this.l, i6, iArr, min);
            } else {
                i7 = a(this.l, i7, iArr, min);
            }
        }
        if (a(this.g)) {
            if (z3) {
                i7 = a(this.g, i7, iArr, min);
            } else {
                i6 = b(this.g, i6, iArr, min);
            }
        }
        if (sn.a.j(this) == 1) {
            d2 = e();
        } else {
            d2 = d();
        }
        if (sn.a.j(this) == 1) {
            e2 = d();
        } else {
            e2 = e();
        }
        iArr[0] = Math.max(0, d2 - i7);
        iArr[1] = Math.max(0, e2 - ((width - paddingRight) - i6));
        int max = Math.max(i7, d2);
        int min2 = Math.min(i6, (width - paddingRight) - e2);
        if (a(this.m)) {
            if (z3) {
                min2 = b(this.m, min2, iArr, min);
            } else {
                max = a(this.m, max, iArr, min);
            }
        }
        if (!a(this.b)) {
            i8 = min2;
            i9 = max;
        } else if (z3) {
            i8 = b(this.b, min2, iArr, min);
            i9 = max;
        } else {
            i8 = min2;
            i9 = a(this.b, max, iArr, min);
        }
        boolean a2 = a(this.h);
        boolean a3 = a(this.i);
        int i20 = 0;
        if (a2) {
            aha aha = (aha) this.h.getLayoutParams();
            i20 = aha.bottomMargin + aha.topMargin + this.h.getMeasuredHeight() + 0;
        }
        if (a3) {
            aha aha2 = (aha) this.i.getLayoutParams();
            i10 = aha2.bottomMargin + aha2.topMargin + this.i.getMeasuredHeight() + i20;
        } else {
            i10 = i20;
        }
        if (a2 || a3) {
            TextView textView = a2 ? this.h : this.i;
            TextView textView2 = a3 ? this.i : this.h;
            aha aha3 = (aha) textView.getLayoutParams();
            aha aha4 = (aha) textView2.getLayoutParams();
            boolean z4 = (a2 && this.h.getMeasuredWidth() > 0) || (a3 && this.i.getMeasuredWidth() > 0);
            switch (this.f & 112) {
                case 48:
                    i11 = aha3.topMargin + getPaddingTop() + this.u;
                    break;
                case 80:
                    i11 = (((height - paddingBottom) - aha4.bottomMargin) - this.v) - i10;
                    break;
                default:
                    int i21 = (((height - paddingTop) - paddingBottom) - i10) / 2;
                    if (i21 < aha3.topMargin + this.u) {
                        i18 = aha3.topMargin + this.u;
                    } else {
                        int i22 = (((height - paddingBottom) - i10) - i21) - paddingTop;
                        if (i22 < aha3.bottomMargin + this.v) {
                            i18 = Math.max(0, i21 - ((aha4.bottomMargin + this.v) - i22));
                        } else {
                            i18 = i21;
                        }
                    }
                    i11 = paddingTop + i18;
                    break;
            }
            if (z3) {
                int i23 = (z4 ? this.s : 0) - iArr[1];
                int max2 = i8 - Math.max(0, i23);
                iArr[1] = Math.max(0, -i23);
                if (a2) {
                    int measuredWidth = max2 - this.h.getMeasuredWidth();
                    int measuredHeight = this.h.getMeasuredHeight() + i11;
                    this.h.layout(measuredWidth, i11, max2, measuredHeight);
                    int i24 = measuredWidth - this.t;
                    i11 = measuredHeight + ((aha) this.h.getLayoutParams()).bottomMargin;
                    i15 = i24;
                } else {
                    i15 = max2;
                }
                if (a3) {
                    aha aha5 = (aha) this.i.getLayoutParams();
                    int i25 = aha5.topMargin + i11;
                    this.i.layout(max2 - this.i.getMeasuredWidth(), i25, max2, this.i.getMeasuredHeight() + i25);
                    int i26 = aha5.bottomMargin;
                    i16 = max2 - this.t;
                } else {
                    i16 = max2;
                }
                if (z4) {
                    i17 = Math.min(i15, i16);
                } else {
                    i17 = max2;
                }
                i8 = i17;
            } else {
                int i27 = (z4 ? this.s : 0) - iArr[0];
                i9 += Math.max(0, i27);
                iArr[0] = Math.max(0, -i27);
                if (a2) {
                    int measuredWidth2 = this.h.getMeasuredWidth() + i9;
                    int measuredHeight2 = this.h.getMeasuredHeight() + i11;
                    this.h.layout(i9, i11, measuredWidth2, measuredHeight2);
                    int i28 = ((aha) this.h.getLayoutParams()).bottomMargin + measuredHeight2;
                    i12 = measuredWidth2 + this.t;
                    i13 = i28;
                } else {
                    i12 = i9;
                    i13 = i11;
                }
                if (a3) {
                    aha aha6 = (aha) this.i.getLayoutParams();
                    int i29 = i13 + aha6.topMargin;
                    int measuredWidth3 = this.i.getMeasuredWidth() + i9;
                    this.i.layout(i9, i29, measuredWidth3, this.i.getMeasuredHeight() + i29);
                    int i30 = aha6.bottomMargin;
                    i14 = this.t + measuredWidth3;
                } else {
                    i14 = i9;
                }
                if (z4) {
                    i9 = Math.max(i12, i14);
                }
            }
        }
        a(this.I, 3);
        int size = this.I.size();
        int i31 = i9;
        for (int i32 = 0; i32 < size; i32++) {
            i31 = a((View) this.I.get(i32), i31, iArr, min);
        }
        a(this.I, 5);
        int size2 = this.I.size();
        int i33 = 0;
        int i34 = i8;
        while (i33 < size2) {
            int b2 = b((View) this.I.get(i33), i34, iArr, min);
            i33++;
            i34 = b2;
        }
        a(this.I, 1);
        ArrayList arrayList = this.I;
        int i35 = iArr[0];
        int i36 = iArr[1];
        int size3 = arrayList.size();
        int i37 = i36;
        int i38 = i35;
        int i39 = 0;
        int i40 = 0;
        while (i39 < size3) {
            View view = (View) arrayList.get(i39);
            aha aha7 = (aha) view.getLayoutParams();
            int i41 = aha7.leftMargin - i38;
            int i42 = aha7.rightMargin - i37;
            int max3 = Math.max(0, i41);
            int max4 = Math.max(0, i42);
            i38 = Math.max(0, -i41);
            i37 = Math.max(0, -i42);
            i39++;
            i40 += view.getMeasuredWidth() + max3 + max4;
        }
        int i43 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i40 / 2);
        int i44 = i43 + i40;
        if (i43 < i31) {
            i43 = i31;
        } else if (i44 > i34) {
            i43 -= i44 - i34;
        }
        int size4 = this.I.size();
        int i45 = i43;
        for (int i46 = 0; i46 < size4; i46++) {
            i45 = a((View) this.I.get(i46), i45, iArr, min);
        }
        this.I.clear();
    }

    private final int a(View view, int i2, int[] iArr, int i3) {
        aha aha = (aha) view.getLayoutParams();
        int i4 = aha.leftMargin - iArr[0];
        int max = Math.max(0, i4) + i2;
        iArr[0] = Math.max(0, -i4);
        int a2 = a(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a2, max + measuredWidth, view.getMeasuredHeight() + a2);
        return aha.rightMargin + measuredWidth + max;
    }

    private final int b(View view, int i2, int[] iArr, int i3) {
        aha aha = (aha) view.getLayoutParams();
        int i4 = aha.rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int a2 = a(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a2, max, view.getMeasuredHeight() + a2);
        return max - (aha.leftMargin + measuredWidth);
    }

    private final int a(View view, int i2) {
        int max;
        aha aha = (aha) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i4 = aha.a & 112;
        switch (i4) {
            case 16:
            case 48:
            case 80:
                break;
            default:
                i4 = this.f & 112;
                break;
        }
        switch (i4) {
            case 48:
                return getPaddingTop() - i3;
            case 80:
                return (((getHeight() - getPaddingBottom()) - measuredHeight) - aha.bottomMargin) - i3;
            default:
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i5 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                if (i5 < aha.topMargin) {
                    max = aha.topMargin;
                } else {
                    int i6 = (((height - paddingBottom) - measuredHeight) - i5) - paddingTop;
                    max = i6 < aha.bottomMargin ? Math.max(0, i5 - (aha.bottomMargin - i6)) : i5;
                }
                return max + paddingTop;
        }
    }

    private final void a(List list, int i2) {
        boolean z2 = true;
        if (sn.a.j(this) != 1) {
            z2 = false;
        }
        int childCount = getChildCount();
        int a2 = jd.a(i2, sn.a.j(this));
        list.clear();
        if (z2) {
            for (int i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                aha aha = (aha) childAt.getLayoutParams();
                if (aha.b == 0 && a(childAt) && e(aha.a) == a2) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            aha aha2 = (aha) childAt2.getLayoutParams();
            if (aha2.b == 0 && a(childAt2) && e(aha2.a) == a2) {
                list.add(childAt2);
            }
        }
    }

    private final int e(int i2) {
        int j2 = sn.a.j(this);
        int a2 = jd.a(i2, j2) & 7;
        switch (a2) {
            case 1:
            case 3:
            case 5:
                return a2;
            case 2:
            case 4:
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
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (Build.VERSION.SDK_INT >= 17) {
            i2 = marginLayoutParams.getMarginStart();
        } else {
            i2 = marginLayoutParams.leftMargin;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            i3 = marginLayoutParams.getMarginEnd();
        } else {
            i3 = marginLayoutParams.rightMargin;
        }
        return i3 + i2;
    }

    private static int c(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
    }

    private static aha a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof aha) {
            return new aha((aha) layoutParams);
        }
        if (layoutParams instanceof wb) {
            return new aha((wb) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new aha((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new aha(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof aha);
    }

    public final acr m() {
        if (this.L == null) {
            this.L = new acr(this);
        }
        return this.L;
    }

    private final boolean d(View view) {
        return view.getParent() == this || this.z.contains(view);
    }

    public final void n() {
        if (this.w == null) {
            this.w = new afz();
        }
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new aha();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new aha(getContext(), attributeSet);
    }
}
