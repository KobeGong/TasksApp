package android.support.v7.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import com.google.android.apps.tasks.R;

/* compiled from: PG */
public class ActionBarOverlayLayout extends ViewGroup implements acq, si {
    private static final int[] A = {R.attr.actionBarSize, 16842841};
    private final sk B;
    public int a;
    public ActionBarContainer b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    public aan g;
    public ViewPropertyAnimator h;
    public final AnimatorListenerAdapter i;
    private int j;
    private ContentFrameLayout k;
    private acr l;
    private Drawable m;
    private boolean n;
    private boolean o;
    private int p;
    private final Rect q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private final Rect v;
    private final Rect w;
    private OverScroller x;
    private final Runnable y;
    private final Runnable z;

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.w = new Rect();
        this.i = new aak(this);
        this.y = new aal(this);
        this.z = new aam(this);
        a(context);
        this.B = new sk();
    }

    private final void a(Context context) {
        boolean z2;
        boolean z3 = true;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(A);
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
        this.x = new OverScroller(context);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    public static void a() {
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(getContext());
        sn.a.g(this);
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
            aan aan = this.g;
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
            sn.a.g(this);
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

    private static boolean a(View view, Rect rect, boolean z2) {
        boolean z3 = false;
        aao aao = (aao) view.getLayoutParams();
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
    public boolean fitSystemWindows(Rect rect) {
        j();
        sn.a.m(this);
        boolean a2 = a(this.b, rect, false);
        this.t.set(rect);
        ahr.a(this, this.t, this.q);
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
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new aao(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof aao;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int i4;
        j();
        measureChildWithMargins(this.b, i2, 0, i3, 0);
        aao aao = (aao) this.b.getLayoutParams();
        int max = Math.max(0, this.b.getMeasuredWidth() + aao.leftMargin + aao.rightMargin);
        int max2 = Math.max(0, aao.bottomMargin + this.b.getMeasuredHeight() + aao.topMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.b.getMeasuredState());
        boolean z2 = (sn.a.m(this) & 256) != 0;
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
            Rect rect = this.v;
            rect.top = i4 + rect.top;
            Rect rect2 = this.v;
            rect2.bottom = rect2.bottom;
        } else {
            Rect rect3 = this.s;
            rect3.top = i4 + rect3.top;
            Rect rect4 = this.s;
            rect4.bottom = rect4.bottom;
        }
        a(this.k, this.s, true);
        if (!this.w.equals(this.v)) {
            this.w.set(this.v);
            this.k.a(this.v);
        }
        measureChildWithMargins(this.k, i2, 0, i3, 0);
        aao aao2 = (aao) this.k.getLayoutParams();
        int max3 = Math.max(max, this.k.getMeasuredWidth() + aao2.leftMargin + aao2.rightMargin);
        int max4 = Math.max(max2, aao2.bottomMargin + this.k.getMeasuredHeight() + aao2.topMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.k.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                aao aao = (aao) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = aao.leftMargin + paddingLeft;
                int i8 = aao.topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.m != null && !this.n) {
            int bottom = this.b.getVisibility() == 0 ? (int) (((float) this.b.getBottom()) + this.b.getTranslationY() + 0.5f) : 0;
            this.m.setBounds(0, bottom, getWidth(), this.m.getIntrinsicHeight() + bottom);
            this.m.draw(canvas);
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // defpackage.si
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.b.getVisibility() != 0) {
            return false;
        }
        return this.o;
    }

    @Override // defpackage.si
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.B.a = i2;
        this.p = this.b != null ? -((int) this.b.getTranslationY()) : 0;
        b();
        if (this.g != null) {
            this.g.o();
        }
    }

    @Override // defpackage.si
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        this.p += i3;
        b(this.p);
    }

    @Override // defpackage.si
    public void onStopNestedScroll(View view) {
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

    @Override // defpackage.si
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
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

    @Override // defpackage.si
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // defpackage.si
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    public int getNestedScrollAxes() {
        return this.B.a;
    }

    private final void j() {
        acr m2;
        if (this.k == null) {
            this.k = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.b = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof acr) {
                m2 = (acr) findViewById;
            } else if (findViewById instanceof Toolbar) {
                m2 = ((Toolbar) findViewById).m();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of " + findViewById.getClass().getSimpleName());
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
        this.b.setTranslationY((float) (-Math.max(0, Math.min(i2, this.b.getHeight()))));
    }

    public final void b() {
        removeCallbacks(this.y);
        removeCallbacks(this.z);
        if (this.h != null) {
            this.h.cancel();
        }
    }

    @Override // defpackage.acq
    public final void a(Window.Callback callback) {
        j();
        this.l.e = callback;
    }

    @Override // defpackage.acq
    public final void a(CharSequence charSequence) {
        j();
        this.l.a(charSequence);
    }

    @Override // defpackage.acq
    public final void a(int i2) {
        boolean z2 = true;
        j();
        switch (i2) {
            case 2:
            case 5:
            default:
                return;
            case 109:
                this.c = true;
                if (getContext().getApplicationInfo().targetSdkVersion >= 19) {
                    z2 = false;
                }
                this.n = z2;
                return;
        }
    }

    @Override // defpackage.acq
    public final boolean c() {
        j();
        Toolbar toolbar = this.l.a;
        return toolbar.getVisibility() == 0 && toolbar.g != null && toolbar.g.b;
    }

    @Override // defpackage.acq
    public final boolean d() {
        j();
        return this.l.a.f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    @Override // defpackage.acq
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

    @Override // defpackage.acq
    public final boolean f() {
        j();
        return this.l.a.g();
    }

    @Override // defpackage.acq
    public final boolean g() {
        boolean z2;
        j();
        Toolbar toolbar = this.l.a;
        if (toolbar.g != null) {
            ActionMenuView actionMenuView = toolbar.g;
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

    @Override // defpackage.acq
    public final void h() {
        j();
        this.l.f = true;
    }

    @Override // defpackage.acq
    public final void a(Menu menu, zu zuVar) {
        j();
        acr acr = this.l;
        if (acr.g == null) {
            acr.g = new aap(acr.a.getContext());
            acr.g.f = R.id.action_menu_presenter;
        }
        acr.g.d = zuVar;
        Toolbar toolbar = acr.a;
        ze zeVar = (ze) menu;
        aap aap = acr.g;
        if (zeVar != null || toolbar.g != null) {
            toolbar.l();
            ze zeVar2 = toolbar.g.a;
            if (zeVar2 != zeVar) {
                if (zeVar2 != null) {
                    zeVar2.b(toolbar.B);
                    zeVar2.b(toolbar.C);
                }
                if (toolbar.C == null) {
                    toolbar.C = new agz(toolbar);
                }
                aap.i = true;
                if (zeVar != null) {
                    zeVar.a(aap, toolbar.n);
                    zeVar.a(toolbar.C, toolbar.n);
                } else {
                    aap.a(toolbar.n, (ze) null);
                    toolbar.C.a(toolbar.n, (ze) null);
                    aap.a(true);
                    toolbar.C.a(true);
                }
                toolbar.g.a(toolbar.o);
                toolbar.g.a(aap);
                toolbar.B = aap;
            }
        }
    }

    @Override // defpackage.acq
    public final void i() {
        j();
        this.l.a();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new aao();
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new aao(getContext(), attributeSet);
    }
}
