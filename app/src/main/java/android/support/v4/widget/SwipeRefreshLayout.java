package android.support.v4.widget;

import defpackage.ViewCompat;

/* compiled from: PG */
public class SwipeRefreshLayout extends android.view.ViewGroup implements defpackage.sf, defpackage.si {
    private static final int[] B = {16842766};
    private static final java.lang.String l = android.support.v4.widget.SwipeRefreshLayout.class.getSimpleName();
    private final android.view.animation.DecelerateInterpolator A;
    private int C;
    private android.view.animation.Animation D;
    private android.view.animation.Animation E;
    private android.view.animation.Animation F;
    private android.view.animation.Animation G;
    private int H;
    private android.view.animation.Animation.AnimationListener I;
    private final android.view.animation.Animation J;
    private final android.view.animation.Animation K;
    public defpackage.vn a;
    public boolean b;
    public int c;
    public boolean d;
    public defpackage.ua e;
    public int f;
    public int g;
    public int h;
    public defpackage.uc i;
    public boolean j;
    public boolean k;
    private android.view.View m;
    private int n;
    private float o;
    private float p;
    private final defpackage.sk q;
    private final defpackage.sh r;
    private final int[] s;
    private final int[] t;
    private boolean u;
    private int v;
    private float w;
    private float x;
    private boolean y;
    private int z;

    public final void a() {
        this.e.clearAnimation();
        this.i.stop();
        this.e.setVisibility(8);
        this.e.getBackground().setAlpha(255);
        this.i.setAlpha(255);
        a(this.g - this.c);
        this.c = this.e.getTop();
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        if (!z2) {
            a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    public SwipeRefreshLayout(android.content.Context context) {
        this(context, null);
    }

    public SwipeRefreshLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        this.o = -1.0f;
        this.s = new int[2];
        this.t = new int[2];
        this.z = -1;
        this.C = -1;
        this.I = new defpackage.vg(this);
        this.J = new defpackage.vl(this);
        this.K = new defpackage.vm(this);
        this.n = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        this.v = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.A = new android.view.animation.DecelerateInterpolator(2.0f);
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.H = (int) (40.0f * displayMetrics.density);
        this.e = new defpackage.ua(getContext());
        this.i = new defpackage.uc(getContext());
        defpackage.uc ucVar = this.i;
        defpackage.uf ufVar = ucVar.b;
        float f2 = ucVar.d.getDisplayMetrics().density;
        ufVar.a(2.5f * f2);
        ufVar.p = 7.5f * f2;
        ufVar.a(0);
        float f3 = 10.0f * f2;
        float f4 = f2 * 5.0f;
        ufVar.q = (int) f3;
        ufVar.r = (int) f4;
        ucVar.invalidateSelf();
        this.e.setImageDrawable(this.i);
        this.e.setVisibility(8);
        addView(this.e);
        setChildrenDrawingOrderEnabled(true);
        this.h = (int) (displayMetrics.density * 64.0f);
        this.o = (float) this.h;
        this.q = new defpackage.sk();
        this.r = new defpackage.sh(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.H;
        this.c = i2;
        this.g = i2;
        b(1.0f);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, B);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        if (this.C < 0) {
            return i3;
        }
        if (i3 == i2 - 1) {
            return this.C;
        }
        if (i3 >= this.C) {
            return i3 + 1;
        }
        return i3;
    }

    public final void a(boolean z2) {
        if (!z2 || this.b == z2) {
            a(z2, false);
            return;
        }
        this.b = z2;
        a((this.h + this.g) - this.c);
        this.j = false;
        android.view.animation.Animation.AnimationListener animationListener = this.I;
        this.e.setVisibility(0);
        this.i.setAlpha(255);
        this.D = new defpackage.vh(this);
        this.D.setDuration((long) this.v);
        if (animationListener != null) {
            this.e.a = animationListener;
        }
        this.e.clearAnimation();
        this.e.startAnimation(this.D);
    }

    public final void a(float f2) {
        this.e.setScaleX(f2);
        this.e.setScaleY(f2);
    }

    private final void a(boolean z2, boolean z3) {
        if (this.b != z2) {
            this.j = z3;
            b();
            this.b = z2;
            if (this.b) {
                int i2 = this.c;
                android.view.animation.Animation.AnimationListener animationListener = this.I;
                this.f = i2;
                this.J.reset();
                this.J.setDuration(200);
                this.J.setInterpolator(this.A);
                if (animationListener != null) {
                    this.e.a = animationListener;
                }
                this.e.clearAnimation();
                this.e.startAnimation(this.J);
                return;
            }
            a(this.I);
        }
    }

    public final void a(android.view.animation.Animation.AnimationListener animationListener) {
        this.E = new defpackage.vi(this);
        this.E.setDuration(150);
        this.e.a = animationListener;
        this.e.clearAnimation();
        this.e.startAnimation(this.E);
    }

    private final android.view.animation.Animation a(int i2, int i3) {
        defpackage.vj vjVar = new defpackage.vj(this, i2, i3);
        vjVar.setDuration(300);
        this.e.a = null;
        this.e.clearAnimation();
        this.e.startAnimation(vjVar);
        return vjVar;
    }

    private final void b() {
        if (this.m == null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                android.view.View childAt = getChildAt(i2);
                if (!childAt.equals(this.e)) {
                    this.m = childAt;
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.m == null) {
                b();
            }
            if (this.m != null) {
                android.view.View view = this.m;
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.e.getMeasuredWidth();
                this.e.layout((measuredWidth / 2) - (measuredWidth2 / 2), this.c, (measuredWidth / 2) + (measuredWidth2 / 2), this.c + this.e.getMeasuredHeight());
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.m == null) {
            b();
        }
        if (this.m != null) {
            this.m.measure(android.view.View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.e.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.H, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.H, 1073741824));
            this.C = -1;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                if (getChildAt(i4) == this.e) {
                    this.C = i4;
                    return;
                }
            }
        }
    }

    private final boolean c() {
        if (!(this.m instanceof android.widget.ListView)) {
            return this.m.canScrollVertically(-1);
        }
        android.widget.ListView listView = (android.widget.ListView) this.m;
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            return listView.canScrollList(-1);
        }
        if (listView.getChildCount() != 0) {
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            int top = listView.getChildAt(0).getTop();
            if (firstVisiblePosition > 0 || top < listView.getListPaddingTop()) {
                return true;
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        b();
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || c() || this.b || this.u) {
            return false;
        }
        switch (actionMasked) {
            case 0:
                a(this.g - this.e.getTop());
                this.z = motionEvent.getPointerId(0);
                this.y = false;
                int findPointerIndex = motionEvent.findPointerIndex(this.z);
                if (findPointerIndex >= 0) {
                    this.x = motionEvent.getY(findPointerIndex);
                    break;
                } else {
                    return false;
                }
            case 1:
            case 3:
                this.y = false;
                this.z = -1;
                break;
            case 2:
                if (this.z == -1) {
                    android.util.Log.e(l, "Got ACTION_MOVE event but don't have an active pointer id.");
                    return false;
                }
                int findPointerIndex2 = motionEvent.findPointerIndex(this.z);
                if (findPointerIndex2 >= 0) {
                    e(motionEvent.getY(findPointerIndex2));
                    break;
                } else {
                    return false;
                }
            case 6:
                a(motionEvent);
                break;
        }
        return this.y;
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        if (android.os.Build.VERSION.SDK_INT >= 21 || !(this.m instanceof android.widget.AbsListView)) {
            if (this.m != null) {
                if (!ViewCompat.a.w(this.m)) {
                    return;
                }
            }
            super.requestDisallowInterceptTouchEvent(z2);
        }
    }

    public boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i2) {
        return isEnabled() && !this.b && (i2 & 2) != 0;
    }

    public void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i2) {
        this.q.a = i2;
        startNestedScroll(i2 & 2);
        this.p = 0.0f;
        this.u = true;
    }

    public void onNestedPreScroll(android.view.View view, int i2, int i3, int[] iArr) {
        if (i3 > 0 && this.p > 0.0f) {
            if (((float) i3) > this.p) {
                iArr[1] = i3 - ((int) this.p);
                this.p = 0.0f;
            } else {
                this.p -= (float) i3;
                iArr[1] = i3;
            }
            c(this.p);
        }
        int[] iArr2 = this.s;
        if (dispatchNestedPreScroll(i2 - iArr[0], i3 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr2[1] + iArr[1];
        }
    }

    public int getNestedScrollAxes() {
        return this.q.a;
    }

    public void onStopNestedScroll(android.view.View view) {
        this.q.a = 0;
        this.u = false;
        if (this.p > 0.0f) {
            d(this.p);
            this.p = 0.0f;
        }
        stopNestedScroll();
    }

    public void onNestedScroll(android.view.View view, int i2, int i3, int i4, int i5) {
        dispatchNestedScroll(i2, i3, i4, i5, this.t);
        int i6 = this.t[1] + i5;
        if (i6 < 0 && !c()) {
            this.p = ((float) java.lang.Math.abs(i6)) + this.p;
            c(this.p);
        }
    }

    public void setNestedScrollingEnabled(boolean z2) {
        this.r.a(z2);
    }

    public boolean isNestedScrollingEnabled() {
        return this.r.a;
    }

    public boolean startNestedScroll(int i2) {
        return this.r.a(i2, 0);
    }

    public void stopNestedScroll() {
        this.r.b(0);
    }

    public boolean hasNestedScrollingParent() {
        return this.r.a(0);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.r.a(i2, i3, i4, i5, iArr);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.r.a(i2, i3, iArr, iArr2);
    }

    public boolean onNestedPreFling(android.view.View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    public boolean onNestedFling(android.view.View view, float f2, float f3, boolean z2) {
        return dispatchNestedFling(f2, f3, z2);
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.r.a(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.r.a(f2, f3);
    }

    private static boolean a(android.view.animation.Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    private final void c(float f2) {
        this.i.a(true);
        float min = java.lang.Math.min(1.0f, java.lang.Math.abs(f2 / this.o));
        float max = (((float) java.lang.Math.max(((double) min) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float f3 = (float) this.h;
        float max2 = java.lang.Math.max(0.0f, java.lang.Math.min(java.lang.Math.abs(f2) - this.o, f3 * 2.0f) / f3);
        float pow = ((float) (((double) (max2 / 4.0f)) - java.lang.Math.pow((double) (max2 / 4.0f), 2.0d))) * 2.0f;
        int i2 = ((int) ((min * f3) + (f3 * pow * 2.0f))) + this.g;
        if (this.e.getVisibility() != 0) {
            this.e.setVisibility(0);
        }
        this.e.setScaleX(1.0f);
        this.e.setScaleY(1.0f);
        if (f2 < this.o) {
            if (this.i.getAlpha() > 76 && !a(this.F)) {
                this.F = a(this.i.getAlpha(), 76);
            }
        } else if (this.i.getAlpha() < 255 && !a(this.G)) {
            this.G = a(this.i.getAlpha(), 255);
        }
        this.i.b(java.lang.Math.min(0.8f, max * 0.8f));
        this.i.a(java.lang.Math.min(1.0f, max));
        float f4 = (((max * 0.4f) - 16.0f) + (pow * 2.0f)) * 0.5f;
        defpackage.uc ucVar = this.i;
        ucVar.b.g = f4;
        ucVar.invalidateSelf();
        a(i2 - this.c);
    }

    private final void d(float f2) {
        if (f2 > this.o) {
            a(true, true);
            return;
        }
        this.b = false;
        this.i.b(0.0f);
        defpackage.vk vkVar = new defpackage.vk(this);
        this.f = this.c;
        this.K.reset();
        this.K.setDuration(200);
        this.K.setInterpolator(this.A);
        this.e.a = vkVar;
        this.e.clearAnimation();
        this.e.startAnimation(this.K);
        this.i.a(false);
    }

    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || c() || this.b || this.u) {
            return false;
        }
        switch (actionMasked) {
            case 0:
                this.z = motionEvent.getPointerId(0);
                this.y = false;
                break;
            case 1:
                int findPointerIndex = motionEvent.findPointerIndex(this.z);
                if (findPointerIndex < 0) {
                    android.util.Log.e(l, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.y) {
                    float y2 = (motionEvent.getY(findPointerIndex) - this.w) * 0.5f;
                    this.y = false;
                    d(y2);
                }
                this.z = -1;
                return false;
            case 2:
                int findPointerIndex2 = motionEvent.findPointerIndex(this.z);
                if (findPointerIndex2 < 0) {
                    android.util.Log.e(l, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y3 = motionEvent.getY(findPointerIndex2);
                e(y3);
                if (this.y) {
                    float f2 = (y3 - this.w) * 0.5f;
                    if (f2 > 0.0f) {
                        c(f2);
                        break;
                    } else {
                        return false;
                    }
                }
                break;
            case 3:
                return false;
            case 5:
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex >= 0) {
                    this.z = motionEvent.getPointerId(actionIndex);
                    break;
                } else {
                    android.util.Log.e(l, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
            case 6:
                a(motionEvent);
                break;
        }
        return true;
    }

    private final void e(float f2) {
        if (f2 - this.x > ((float) this.n) && !this.y) {
            this.w = this.x + ((float) this.n);
            this.y = true;
            this.i.setAlpha(76);
        }
    }

    public final void b(float f2) {
        a((this.f + ((int) (((float) (this.g - this.f)) * f2))) - this.e.getTop());
    }

    public final void a(int i2) {
        this.e.bringToFront();
        ViewCompat.b((android.view.View) this.e, i2);
        this.c = this.e.getTop();
    }

    private final void a(android.view.MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.z) {
            this.z = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }
}
