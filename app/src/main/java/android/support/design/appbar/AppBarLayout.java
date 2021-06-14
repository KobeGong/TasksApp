package android.support.design.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import com.google.android.apps.tasks.R;
import java.lang.ref.WeakReference;
import java.util.List;

import defpackage.cw;

@gy(a = Behavior.class)
/* compiled from: PG */
public class AppBarLayout extends LinearLayout {
    public boolean a;
    public int b;
    public tk c;
    public List d;
    public boolean e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private int[] j;

    /* compiled from: PG */
    public class ScrollingViewBehavior extends dg {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dh.D);
            this.c = obtainStyledAttributes.getDimensionPixelSize(dh.E, 0);
            obtainStyledAttributes.recycle();
        }

        @Override // defpackage.gx
        public final boolean a_(View view) {
            return view instanceof AppBarLayout;
        }

        @Override // defpackage.gx
        public final boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            gx gxVar = ((ha) view2.getLayoutParams()).a;
            if (!(gxVar instanceof BaseBehavior)) {
                return false;
            }
            sn.b(view, ((((BaseBehavior) gxVar).a + (view2.getBottom() - view.getTop())) + ((dg) this).b) - d(view2));
            return false;
        }

        @Override // defpackage.gx
        public final boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            boolean z2;
            AppBarLayout b = b(coordinatorLayout.a(view));
            if (b != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.a;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    if (!z) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    b.a(false, z2, true);
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.dg
        public final float b(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int c = appBarLayout.c();
                int d = appBarLayout.d();
                gx gxVar = ((ha) appBarLayout.getLayoutParams()).a;
                if (gxVar instanceof BaseBehavior) {
                    i = ((BaseBehavior) gxVar).a();
                } else {
                    i = 0;
                }
                if (d != 0 && c + i <= d) {
                    return 0.0f;
                }
                int i2 = c - d;
                if (i2 != 0) {
                    return (((float) i) / ((float) i2)) + 1.0f;
                }
            }
            return 0.0f;
        }

        private static AppBarLayout b(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.dg
        public final int c(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).c();
            }
            return super.c(view);
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.dg
        public final /* synthetic */ View a(List list) {
            return b(list);
        }

        @Override // defpackage.gx, defpackage.dg
        public final /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.a(coordinatorLayout, view, i, i2, i3, i4);
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    /* compiled from: PG */
    public class Behavior extends BaseBehavior {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: PG */
    public class BaseBehavior extends de {
        public int a;
        public cw b;
        private int d;
        private ValueAnimator e;
        private int f = -1;
        private boolean g;
        private float h;
        private WeakReference i;

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
            if ((r5.getHeight() - r7.getHeight()) <= r6.getHeight()) goto L_0x001e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(android.support.design.widget.CoordinatorLayout r5, android.support.design.appbar.AppBarLayout r6, android.view.View r7, android.view.View r8, int r9, int r10) {
            /*
                r4 = this;
                r0 = 1
                r1 = 0
                r2 = r9 & 2
                if (r2 == 0) goto L_0x0031
                int r2 = r6.c()
                if (r2 == 0) goto L_0x002f
                r2 = r0
            L_0x000d:
                if (r2 == 0) goto L_0x0031
                int r2 = r5.getHeight()
                int r3 = r7.getHeight()
                int r2 = r2 - r3
                int r3 = r6.getHeight()
                if (r2 > r3) goto L_0x0031
            L_0x001e:
                if (r0 == 0) goto L_0x0029
                android.animation.ValueAnimator r1 = r4.e
                if (r1 == 0) goto L_0x0029
                android.animation.ValueAnimator r1 = r4.e
                r1.cancel()
            L_0x0029:
                r1 = 0
                r4.i = r1
                r4.d = r10
                return r0
            L_0x002f:
                r2 = r1
                goto L_0x000d
            L_0x0031:
                r0 = r1
                goto L_0x001e
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.appbar.AppBarLayout.BaseBehavior.a(android.support.design.widget.CoordinatorLayout, android.support.design.appbar.AppBarLayout, android.view.View, android.view.View, int, int):boolean");
        }

        private final void a(int i2, AppBarLayout appBarLayout, View view, int i3) {
            if (i3 == 1) {
                int a2 = a();
                if ((i2 < 0 && a2 == 0) || (i2 > 0 && a2 == (-appBarLayout.e()))) {
                    sn.c(view);
                }
            }
        }

        private final void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i2) {
            int height;
            int abs = Math.abs(a() - i2);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                height = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);
            }
            int a2 = a();
            if (a2 != i2) {
                if (this.e == null) {
                    this.e = new ValueAnimator();
                    this.e.setInterpolator(cs.d);
                    this.e.addUpdateListener(new cv(this, coordinatorLayout, appBarLayout));
                } else {
                    this.e.cancel();
                }
                this.e.setDuration((long) Math.min(height, 600));
                this.e.setIntValues(a2, i2);
                this.e.start();
            } else if (this.e != null && this.e.isRunning()) {
                this.e.cancel();
            }
        }

        /* access modifiers changed from: private */
        public final void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int i2;
            int i3;
            int i4;
            int i5;
            int a2 = a();
            int childCount = appBarLayout.getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount) {
                    i2 = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i6);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                da daVar = (da) childAt.getLayoutParams();
                if (a(daVar.a, 32)) {
                    i4 = daVar.bottomMargin + bottom;
                    i5 = top - daVar.topMargin;
                } else {
                    i4 = bottom;
                    i5 = top;
                }
                if (i5 <= (-a2) && i4 >= (-a2)) {
                    i2 = i6;
                    break;
                }
                i6++;
            }
            if (i2 >= 0) {
                View childAt2 = appBarLayout.getChildAt(i2);
                da daVar2 = (da) childAt2.getLayoutParams();
                int i7 = daVar2.a;
                if ((i7 & 17) == 17) {
                    int i8 = -childAt2.getTop();
                    int i9 = -childAt2.getBottom();
                    if (i2 == appBarLayout.getChildCount() - 1) {
                        i9 += appBarLayout.f();
                    }
                    if (a(i7, 2)) {
                        i9 += sn.a.f(childAt2);
                        i3 = i8;
                    } else if (a(i7, 5)) {
                        i3 = sn.a.f(childAt2) + i9;
                        if (a2 >= i3) {
                            i9 = i3;
                            i3 = i8;
                        }
                    } else {
                        i3 = i8;
                    }
                    if (a(i7, 32)) {
                        i3 += daVar2.topMargin;
                        i9 -= daVar2.bottomMargin;
                    }
                    if (a2 >= (i9 + i3) / 2) {
                        i9 = i3;
                    }
                    a(coordinatorLayout, appBarLayout, gm.a(i9, -appBarLayout.c(), 0));
                }
            }
        }

        private static boolean a(int i2, int i3) {
            return (i2 & i3) == i3;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x009c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static void a(android.support.design.widget.CoordinatorLayout r7, android.support.design.appbar.AppBarLayout r8, int r9, int r10, boolean r11) {
            /*
            // Method dump skipped, instructions count: 164
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.appbar.AppBarLayout.BaseBehavior.a(android.support.design.widget.CoordinatorLayout, android.support.design.appbar.AppBarLayout, int, int, boolean):void");
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.de
        public final int a() {
            return c() + this.a;
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.de
        public final /* synthetic */ int a(View view) {
            return ((AppBarLayout) view).c();
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.de
        public final /* synthetic */ int b(View view) {
            return -((AppBarLayout) view).e();
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.de
        public final /* synthetic */ boolean b() {
            View view;
            return this.b != null ? !this.b.a.d : this.i == null || ((view = (View) this.i.get()) != null && view.isShown() && !view.canScrollVertically(-1));
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.de
        public final /* synthetic */ int a(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
            int i5;
            List b2;
            int i6;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int a2 = a();
            if (i3 == 0 || a2 < i3 || a2 > i4) {
                this.a = 0;
                return 0;
            }
            int a3 = gm.a(i2, i3, i4);
            if (a2 == a3) {
                return 0;
            }
            if (appBarLayout.a) {
                int abs = Math.abs(a3);
                int childCount = appBarLayout.getChildCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= childCount) {
                        break;
                    }
                    View childAt = appBarLayout.getChildAt(i7);
                    da daVar = (da) childAt.getLayoutParams();
                    Interpolator interpolator = daVar.b;
                    if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                        i7++;
                    } else if (interpolator != null) {
                        int i8 = daVar.a;
                        if ((i8 & 1) != 0) {
                            i6 = daVar.bottomMargin + childAt.getHeight() + daVar.topMargin + 0;
                            if ((i8 & 2) != 0) {
                                i6 -= sn.a.f(childAt);
                            }
                        } else {
                            i6 = 0;
                        }
                        if (sn.a.h(childAt)) {
                            i6 -= appBarLayout.f();
                        }
                        if (i6 > 0) {
                            i5 = (Math.round(interpolator.getInterpolation(((float) (abs - childAt.getTop())) / ((float) i6)) * ((float) i6)) + childAt.getTop()) * Integer.signum(a3);
                        }
                    }
                }
                i5 = a3;
            } else {
                i5 = a3;
            }
            boolean a_ = a_(i5);
            int i9 = a2 - a3;
            this.a = a3 - i5;
            if (!a_ && appBarLayout.a && (b2 = coordinatorLayout.a.b(appBarLayout)) != null && !b2.isEmpty()) {
                for (int i10 = 0; i10 < b2.size(); i10++) {
                    View view2 = (View) b2.get(i10);
                    gx gxVar = ((ha) view2.getLayoutParams()).a;
                    if (gxVar != null) {
                        gxVar.a(coordinatorLayout, view2, appBarLayout);
                    }
                }
            }
            appBarLayout.a(c());
            a(coordinatorLayout, appBarLayout, a3, a3 < a2 ? -1 : 1, false);
            return i9;
        }

        @Override // defpackage.gx, defpackage.di
        public final /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i2) {
            int round;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean a2 = super.a(coordinatorLayout, (View) appBarLayout, i2);
            int i3 = appBarLayout.b;
            if (this.f >= 0 && (i3 & 8) == 0) {
                View childAt = appBarLayout.getChildAt(this.f);
                int i4 = -childAt.getBottom();
                if (this.g) {
                    round = sn.a.f(childAt) + appBarLayout.f() + i4;
                } else {
                    round = Math.round(((float) childAt.getHeight()) * this.h) + i4;
                }
                a_(coordinatorLayout, appBarLayout, round);
            } else if (i3 != 0) {
                boolean z = (i3 & 4) != 0;
                if ((i3 & 2) != 0) {
                    int i5 = -appBarLayout.c();
                    if (z) {
                        a(coordinatorLayout, appBarLayout, i5);
                    } else {
                        a_(coordinatorLayout, appBarLayout, i5);
                    }
                } else if ((i3 & 1) != 0) {
                    if (z) {
                        a(coordinatorLayout, appBarLayout, 0);
                    } else {
                        a_(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.b = 0;
            this.f = -1;
            a_(gm.a(c(), -appBarLayout.c(), 0));
            a(coordinatorLayout, appBarLayout, c(), 0, true);
            appBarLayout.a(c());
            return a2;
        }

        @Override // defpackage.gx
        public final /* synthetic */ Parcelable b(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = false;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            Parcelable b2 = super.b(coordinatorLayout, appBarLayout);
            int c = c();
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                int bottom = childAt.getBottom() + c;
                if (childAt.getTop() + c <= 0 && bottom >= 0) {
                    cx cxVar = new cx(b2);
                    cxVar.a = i2;
                    if (bottom == sn.a.f(childAt) + appBarLayout.f()) {
                        z = true;
                    }
                    cxVar.c = z;
                    cxVar.b = ((float) bottom) / ((float) childAt.getHeight());
                    return cxVar;
                }
            }
            return b2;
        }

        @Override // defpackage.gx
        public final /* synthetic */ void a(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof cx) {
                cx cxVar = (cx) parcelable;
                super.a(coordinatorLayout, appBarLayout, cxVar.e);
                this.f = cxVar.a;
                this.h = cxVar.b;
                this.g = cxVar.c;
                return;
            }
            super.a(coordinatorLayout, appBarLayout, parcelable);
            this.f = -1;
        }

        @Override // defpackage.gx
        public final /* synthetic */ void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i2 != 0) {
                if (i2 < 0) {
                    i4 = -appBarLayout.c();
                    i5 = i4 + appBarLayout.d();
                } else {
                    i4 = -appBarLayout.c();
                    i5 = 0;
                }
                if (i4 != i5) {
                    iArr[1] = b(coordinatorLayout, appBarLayout, i2, i4, i5);
                    a(i2, appBarLayout, view2, i3);
                }
            }
        }

        @Override // defpackage.gx
        public final /* synthetic */ void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int i4) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                b(coordinatorLayout, appBarLayout, i3, -appBarLayout.e(), 0);
                a(i3, appBarLayout, view2, i4);
            }
        }

        @Override // defpackage.gx
        public final /* synthetic */ void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i2) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.d == 0 || i2 == 1) {
                a(coordinatorLayout, appBarLayout);
            }
            this.i = new WeakReference(view2);
        }

        @Override // defpackage.gx
        public final /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int i5) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ha) appBarLayout.getLayoutParams()).height != -2) {
                return super.a(coordinatorLayout, appBarLayout, i2, i3, i4, i5);
            }
            coordinatorLayout.a(appBarLayout, i2, i3, View.MeasureSpec.makeMeasureSpec(0, 0), i5);
            return true;
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.b = 0;
        setOrientation(1);
        if (Build.VERSION.SDK_INT >= 21) {
            dk.a(this);
            dk.a(this, attributeSet);
        }
        TypedArray a2 = fp.a(context, attributeSet, dh.a, 0, 2132017714);
        sn.a(this, a2.getDrawable(dh.e));
        if (a2.hasValue(dh.i)) {
            a(a2.getBoolean(dh.i, false), false, false);
        }
        if (Build.VERSION.SDK_INT >= 21 && a2.hasValue(dh.h)) {
            dk.a(this, (float) a2.getDimensionPixelSize(dh.h, 0));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (a2.hasValue(dh.f)) {
                setKeyboardNavigationCluster(a2.getBoolean(dh.f, false));
            }
            if (a2.hasValue(dh.g)) {
                setTouchscreenBlocksFocus(a2.getBoolean(dh.g, false));
            }
        }
        a2.recycle();
        sn.a(this, new es(this));
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        a();
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean z2;
        boolean z3;
        super.onLayout(z, i2, i3, i4, i5);
        a();
        this.a = false;
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount) {
                break;
            } else if (((da) getChildAt(i6).getLayoutParams()).b != null) {
                this.a = true;
                break;
            } else {
                i6++;
            }
        }
        int childCount2 = getChildCount();
        int i7 = 0;
        while (true) {
            if (i7 >= childCount2) {
                z2 = false;
                break;
            }
            da daVar = (da) getChildAt(i7).getLayoutParams();
            if ((daVar.a & 1) != 1 || (daVar.a & 10) == 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                z2 = true;
                break;
            }
            i7++;
        }
        if (this.i != z2) {
            this.i = z2;
            refreshDrawableState();
        }
    }

    public final void a() {
        this.f = -1;
        this.g = -1;
        this.h = -1;
    }

    public void setOrientation(int i2) {
        if (i2 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i2);
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        int i2;
        int i3 = 0;
        int i4 = z ? 1 : 2;
        if (z2) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        int i5 = i2 | i4;
        if (z3) {
            i3 = 8;
        }
        this.b = i3 | i5;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof da;
    }

    /* renamed from: b */
    public da generateDefaultLayoutParams() {
        return new da();
    }

    /* renamed from: a */
    public da generateLayoutParams(AttributeSet attributeSet) {
        return new da(getContext(), attributeSet);
    }

    /* renamed from: a */
    public da generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (Build.VERSION.SDK_INT >= 19 && (layoutParams instanceof LinearLayout.LayoutParams)) {
            return new da((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new da((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new da(layoutParams);
    }

    public final int c() {
        int i2;
        if (this.f != -1) {
            return this.f;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            da daVar = (da) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = daVar.a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += daVar.bottomMargin + measuredHeight + daVar.topMargin;
            if ((i5 & 2) != 0) {
                i2 = i4 - sn.a.f(childAt);
                break;
            }
            i3++;
        }
        i2 = i4;
        int max = Math.max(0, i2 - f());
        this.f = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public final int d() {
        int i2;
        if (this.g != -1) {
            return this.g;
        }
        int childCount = getChildCount() - 1;
        int i3 = 0;
        while (childCount >= 0) {
            View childAt = getChildAt(childCount);
            da daVar = (da) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = daVar.a;
            if ((i4 & 5) != 5) {
                if (i3 > 0) {
                    break;
                }
                i2 = i3;
            } else {
                int i5 = daVar.bottomMargin + daVar.topMargin + i3;
                if ((i4 & 8) != 0) {
                    i2 = i5 + sn.a.f(childAt);
                } else if ((i4 & 2) != 0) {
                    i2 = i5 + (measuredHeight - sn.a.f(childAt));
                } else {
                    i2 = i5 + (measuredHeight - f());
                }
            }
            childCount--;
            i3 = i2;
        }
        int max = Math.max(0, i3);
        this.g = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public final int e() {
        int i2;
        if (this.h != -1) {
            return this.h;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            da daVar = (da) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + daVar.topMargin + daVar.bottomMargin;
            int i5 = daVar.a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight;
            if ((i5 & 2) != 0) {
                i2 = i4 - (sn.a.f(childAt) + f());
                break;
            }
            i3++;
        }
        i2 = i4;
        int max = Math.max(0, i2);
        this.h = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        if (this.d != null) {
            int size = this.d.size();
            for (int i3 = 0; i3 < size; i3++) {
                cz czVar = (cz) this.d.get(i3);
                if (czVar != null) {
                    czVar.a.e = i2;
                    int b2 = czVar.a.f != null ? czVar.a.f.b() : 0;
                    int childCount = czVar.a.getChildCount();
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = czVar.a.getChildAt(i4);
                        dd ddVar = (dd) childAt.getLayoutParams();
                        dj a2 = db.a(childAt);
                        switch (ddVar.a) {
                            case 1:
                                a2.a(gm.a(-i2, 0, czVar.a.b(childAt)));
                                break;
                            case 2:
                                a2.a(Math.round(ddVar.b * ((float) (-i2))));
                                break;
                        }
                    }
                    czVar.a.b();
                    if (czVar.a.d != null && b2 > 0) {
                        sn.a.c(czVar.a);
                    }
                    int height = (czVar.a.getHeight() - sn.a.f(czVar.a)) - b2;
                    ew ewVar = czVar.a.c;
                    float abs = ((float) Math.abs(i2)) / ((float) height);
                    if (abs < 0.0f) {
                        abs = 0.0f;
                    } else if (abs > 1.0f) {
                        abs = 1.0f;
                    }
                    if (abs != ewVar.b) {
                        ewVar.b = abs;
                        ewVar.b();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        if (this.j == null) {
            this.j = new int[2];
        }
        int[] iArr = this.j;
        int[] onCreateDrawableState = super.onCreateDrawableState(iArr.length + i2);
        iArr[0] = this.i ? R.attr.state_collapsible : -2130772113;
        iArr[1] = (!this.i || !this.e) ? -2130772112 : R.attr.state_collapsed;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    public final int f() {
        if (this.c != null) {
            return this.c.b();
        }
        return 0;
    }
}
