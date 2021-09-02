package android.support.v4.widget;

/* compiled from: PG */
public class NestedScrollView extends android.widget.FrameLayout implements defpackage.sg, defpackage.si {
    private static final defpackage.ux x = new defpackage.ux();
    private static final int[] y = {16843130};
    private final defpackage.sh A;
    private float B;
    public defpackage.uy a;
    private long b;
    private final android.graphics.Rect c;
    private android.widget.OverScroller d;
    private android.widget.EdgeEffect e;
    private android.widget.EdgeEffect f;
    private int g;
    private boolean h;
    private boolean i;
    private android.view.View j;
    private boolean k;
    private android.view.VelocityTracker l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private int r;
    private final int[] s;
    private final int[] t;
    private int u;
    private int v;
    private defpackage.uz w;
    private final defpackage.sk z;

    public NestedScrollView(android.content.Context context) {
        this(context, null);
    }

    public NestedScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(android.content.Context context, android.util.AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.c = new android.graphics.Rect();
        this.h = true;
        this.i = false;
        this.j = null;
        this.k = false;
        this.n = true;
        this.r = -1;
        this.s = new int[2];
        this.t = new int[2];
        this.d = new android.widget.OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        this.o = viewConfiguration.getScaledTouchSlop();
        this.p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.q = viewConfiguration.getScaledMaximumFlingVelocity();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y, i2, 0);
        boolean z2 = obtainStyledAttributes.getBoolean(0, false);
        if (z2 != this.m) {
            this.m = z2;
            requestLayout();
        }
        obtainStyledAttributes.recycle();
        this.z = new defpackage.sk();
        this.A = new defpackage.sh(this);
        setNestedScrollingEnabled(true);
        defpackage.sn.a((android.view.View) this, (defpackage.rn) x);
    }

    public void setNestedScrollingEnabled(boolean z2) {
        this.A.a(z2);
    }

    public boolean isNestedScrollingEnabled() {
        return this.A.a;
    }

    public boolean startNestedScroll(int i2) {
        return this.A.a(i2, 0);
    }

    private final boolean d(int i2) {
        return this.A.a(2, i2);
    }

    public void stopNestedScroll() {
        this.A.b(0);
    }

    public final void a(int i2) {
        this.A.b(i2);
    }

    public boolean hasNestedScrollingParent() {
        return this.A.a(0);
    }

    private final boolean e(int i2) {
        return this.A.a(i2);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.A.a(i2, i3, i4, i5, iArr);
    }

    private final boolean a(int i2, int i3, int[] iArr, int i4) {
        return this.A.a(0, i2, 0, i3, iArr, i4);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.A.a(i2, i3, iArr, iArr2);
    }

    private final boolean a(int i2, int[] iArr, int[] iArr2, int i3) {
        return this.A.a(0, i2, iArr, iArr2, i3);
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.A.a(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.A.a(f2, f3);
    }

    public boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i2) {
        return (i2 & 2) != 0;
    }

    public void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i2) {
        this.z.a = i2;
        startNestedScroll(2);
    }

    public void onStopNestedScroll(android.view.View view) {
        this.z.a = 0;
        stopNestedScroll();
    }

    public void onNestedScroll(android.view.View view, int i2, int i3, int i4, int i5) {
        int scrollY = getScrollY();
        scrollBy(0, i5);
        int scrollY2 = getScrollY() - scrollY;
        dispatchNestedScroll(0, scrollY2, 0, i5 - scrollY2, null);
    }

    public void onNestedPreScroll(android.view.View view, int i2, int i3, int[] iArr) {
        dispatchNestedPreScroll(i2, i3, iArr, null);
    }

    public boolean onNestedFling(android.view.View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        i((int) f3);
        return true;
    }

    public boolean onNestedPreFling(android.view.View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    public int getNestedScrollAxes() {
        return this.z.a;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = (getChildAt(0).getBottom() - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public void addView(android.view.View view) {
        if (getChildCount() > 0) {
            throw new java.lang.IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public void addView(android.view.View view, int i2) {
        if (getChildCount() > 0) {
            throw new java.lang.IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i2);
    }

    public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new java.lang.IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    public void addView(android.view.View view, int i2, android.view.ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new java.lang.IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i2, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        if (this.a != null) {
            this.a.a(this, i3, i5);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.m && android.view.View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            android.view.View childAt = getChildAt(0);
            int measuredHeight = getMeasuredHeight();
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight(), ((android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams()).width), android.view.View.MeasureSpec.makeMeasureSpec((measuredHeight - getPaddingTop()) - getPaddingBottom(), 1073741824));
            }
        }
    }

    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || a(keyEvent);
    }

    public final boolean a(android.view.KeyEvent keyEvent) {
        boolean z2;
        boolean z3;
        this.c.setEmpty();
        android.view.View childAt = getChildAt(0);
        if (childAt != null) {
            z2 = getHeight() < (childAt.getHeight() + getPaddingTop()) + getPaddingBottom();
        } else {
            z2 = false;
        }
        if (!z2) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            android.view.View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            android.view.View findNextFocus = android.view.FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            switch (keyEvent.getKeyCode()) {
                case 19:
                    if (!keyEvent.isAltPressed()) {
                        return g(33);
                    }
                    return f(33);
                case 20:
                    if (!keyEvent.isAltPressed()) {
                        return g(130);
                    }
                    return f(130);
                case 62:
                    int i2 = keyEvent.isShiftPressed() ? 33 : 130;
                    if (i2 == 130) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    int height = getHeight();
                    if (z3) {
                        this.c.top = getScrollY() + height;
                        int childCount = getChildCount();
                        if (childCount > 0) {
                            android.view.View childAt2 = getChildAt(childCount - 1);
                            if (this.c.top + height > childAt2.getBottom()) {
                                this.c.top = childAt2.getBottom() - height;
                            }
                        }
                    } else {
                        this.c.top = getScrollY() - height;
                        if (this.c.top < 0) {
                            this.c.top = 0;
                        }
                    }
                    this.c.bottom = height + this.c.top;
                    a(i2, this.c.top, this.c.bottom);
                    return false;
                default:
                    return false;
            }
        }
    }

    private final void b() {
        if (this.l == null) {
            this.l = android.view.VelocityTracker.obtain();
        }
    }

    private final void c() {
        if (this.l != null) {
            this.l.recycle();
            this.l = null;
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        if (z2) {
            c();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z2;
        boolean z3 = true;
        int action = motionEvent.getAction();
        if (action == 2 && this.k) {
            return true;
        }
        switch (action & 255) {
            case 0:
                int y2 = (int) motionEvent.getY();
                int x2 = (int) motionEvent.getX();
                if (getChildCount() > 0) {
                    int scrollY = getScrollY();
                    android.view.View childAt = getChildAt(0);
                    z2 = y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x2 >= childAt.getLeft() && x2 < childAt.getRight();
                } else {
                    z2 = false;
                }
                if (z2) {
                    this.g = y2;
                    this.r = motionEvent.getPointerId(0);
                    if (this.l == null) {
                        this.l = android.view.VelocityTracker.obtain();
                    } else {
                        this.l.clear();
                    }
                    this.l.addMovement(motionEvent);
                    this.d.computeScrollOffset();
                    if (this.d.isFinished()) {
                        z3 = false;
                    }
                    this.k = z3;
                    d(0);
                    break;
                } else {
                    this.k = false;
                    c();
                    break;
                }
                break;
            case 1:
            case 3:
                this.k = false;
                this.r = -1;
                c();
                if (this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, a())) {
                    defpackage.sn.a.c(this);
                }
                a(0);
                break;
            case 2:
                int i2 = this.r;
                if (i2 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i2);
                    if (findPointerIndex != -1) {
                        int y3 = (int) motionEvent.getY(findPointerIndex);
                        if (java.lang.Math.abs(y3 - this.g) > this.o && (getNestedScrollAxes() & 2) == 0) {
                            this.k = true;
                            this.g = y3;
                            b();
                            this.l.addMovement(motionEvent);
                            this.u = 0;
                            android.view.ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                                break;
                            }
                        }
                    } else {
                        android.util.Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        break;
                    }
                }
                break;
            case 6:
                a(motionEvent);
                break;
        }
        return this.k;
    }

    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z2;
        b();
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.u = 0;
        }
        obtain.offsetLocation(0.0f, (float) this.u);
        switch (actionMasked) {
            case 0:
                if (getChildCount() != 0) {
                    boolean z3 = !this.d.isFinished();
                    this.k = z3;
                    if (z3) {
                        android.view.ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (!this.d.isFinished()) {
                        this.d.abortAnimation();
                    }
                    this.g = (int) motionEvent.getY();
                    this.r = motionEvent.getPointerId(0);
                    d(0);
                    break;
                } else {
                    return false;
                }
            case 1:
                android.view.VelocityTracker velocityTracker = this.l;
                velocityTracker.computeCurrentVelocity(1000, (float) this.q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.r);
                if (java.lang.Math.abs(yVelocity) > this.p) {
                    i(-yVelocity);
                } else if (this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, a())) {
                    defpackage.sn.a.c(this);
                }
                this.r = -1;
                d();
                break;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.r);
                if (findPointerIndex != -1) {
                    int y2 = (int) motionEvent.getY(findPointerIndex);
                    int i2 = this.g - y2;
                    if (a(i2, this.t, this.s, 0)) {
                        i2 -= this.t[1];
                        obtain.offsetLocation(0.0f, (float) this.s[1]);
                        this.u += this.s[1];
                    }
                    if (!this.k && java.lang.Math.abs(i2) > this.o) {
                        android.view.ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.k = true;
                        if (i2 > 0) {
                            i2 -= this.o;
                        } else {
                            i2 += this.o;
                        }
                    }
                    if (this.k) {
                        this.g = y2 - this.s[1];
                        int scrollY = getScrollY();
                        int a2 = a();
                        int overScrollMode = getOverScrollMode();
                        if (overScrollMode == 0 || (overScrollMode == 1 && a2 > 0)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (a(i2, 0, getScrollY(), a2) && !e(0)) {
                            this.l.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        if (!a(scrollY2, i2 - scrollY2, this.s, 0)) {
                            if (z2) {
                                e();
                                int i3 = scrollY + i2;
                                if (i3 < 0) {
                                    defpackage.um.a(this.e, ((float) i2) / ((float) getHeight()), motionEvent.getX(findPointerIndex) / ((float) getWidth()));
                                    if (!this.f.isFinished()) {
                                        this.f.onRelease();
                                    }
                                } else if (i3 > a2) {
                                    defpackage.um.a(this.f, ((float) i2) / ((float) getHeight()), 1.0f - (motionEvent.getX(findPointerIndex) / ((float) getWidth())));
                                    if (!this.e.isFinished()) {
                                        this.e.onRelease();
                                    }
                                }
                                if (this.e != null && (!this.e.isFinished() || !this.f.isFinished())) {
                                    defpackage.sn.a.c(this);
                                    break;
                                }
                            }
                        } else {
                            this.g -= this.s[1];
                            obtain.offsetLocation(0.0f, (float) this.s[1]);
                            this.u += this.s[1];
                            break;
                        }
                    }
                } else {
                    android.util.Log.e("NestedScrollView", "Invalid pointerId=" + this.r + " in onTouchEvent");
                    break;
                }
                break;
            case 3:
                if (this.k && getChildCount() > 0 && this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, a())) {
                    defpackage.sn.a.c(this);
                }
                this.r = -1;
                d();
                break;
            case 5:
                int actionIndex = motionEvent.getActionIndex();
                this.g = (int) motionEvent.getY(actionIndex);
                this.r = motionEvent.getPointerId(actionIndex);
                break;
            case 6:
                a(motionEvent);
                this.g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.r));
                break;
        }
        if (this.l != null) {
            this.l.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    private final void a(android.view.MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.r) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.g = (int) motionEvent.getY(i2);
            this.r = motionEvent.getPointerId(i2);
            if (this.l != null) {
                this.l.clear();
            }
        }
    }

    public boolean onGenericMotionEvent(android.view.MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0) {
            switch (motionEvent.getAction()) {
                case 8:
                    if (!this.k) {
                        float axisValue = motionEvent.getAxisValue(9);
                        if (axisValue != 0.0f) {
                            if (this.B == 0.0f) {
                                android.util.TypedValue typedValue = new android.util.TypedValue();
                                android.content.Context context = getContext();
                                if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                                    throw new java.lang.IllegalStateException("Expected theme to define listPreferredItemHeight.");
                                }
                                this.B = typedValue.getDimension(context.getResources().getDisplayMetrics());
                            }
                            int i2 = (int) (axisValue * this.B);
                            int a2 = a();
                            int scrollY = getScrollY();
                            int i3 = scrollY - i2;
                            if (i3 < 0) {
                                a2 = 0;
                            } else if (i3 <= a2) {
                                a2 = i3;
                            }
                            if (a2 != scrollY) {
                                super.scrollTo(getScrollX(), a2);
                                return true;
                            }
                        }
                    }
                    break;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        super.scrollTo(i2, i3);
    }

    private final boolean a(int i2, int i3, int i4, int i5) {
        boolean z2;
        int i6;
        boolean z3;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i7 = i4 + i2;
        if (i3 > 0) {
            z2 = true;
            i6 = 0;
        } else if (i3 < 0) {
            z2 = true;
            i6 = 0;
        } else {
            z2 = false;
            i6 = i3;
        }
        if (i7 > i5) {
            z3 = true;
            i7 = i5;
        } else if (i7 < 0) {
            z3 = true;
            i7 = 0;
        } else {
            z3 = false;
        }
        if (z3 && !e(1)) {
            this.d.springBack(i6, i7, 0, 0, 0, a());
        }
        onOverScrolled(i6, i7, z2, z3);
        if (z2 || z3) {
            return true;
        }
        return false;
    }

    public final int a() {
        if (getChildCount() > 0) {
            return java.lang.Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
        }
        return 0;
    }

    private final boolean f(int i2) {
        boolean z2 = i2 == 130;
        int height = getHeight();
        this.c.top = 0;
        this.c.bottom = height;
        if (z2) {
            int childCount = getChildCount();
            if (childCount > 0) {
                this.c.bottom = getChildAt(childCount - 1).getBottom() + getPaddingBottom();
                this.c.top = this.c.bottom - height;
            }
        }
        return a(i2, this.c.top, this.c.bottom);
    }

    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a(int r17, int r18, int r19) {
        /*
            r16 = this;
            r6 = 1
            int r1 = r16.getHeight()
            int r9 = r16.getScrollY()
            int r10 = r9 + r1
            r1 = 33
            r0 = r17
            if (r0 != r1) goto L_0x004e
            r1 = 1
            r2 = r1
        L_0x0013:
            r1 = 2
            r0 = r16
            java.util.ArrayList r11 = r0.getFocusables(r1)
            r5 = 0
            r4 = 0
            int r12 = r11.size()
            r1 = 0
            r8 = r1
        L_0x0022:
            if (r8 >= r12) goto L_0x007b
            java.lang.Object r1 = r11.get(r8)
            android.view.View r1 = (android.view.View) r1
            int r7 = r1.getTop()
            int r13 = r1.getBottom()
            r0 = r18
            if (r0 >= r13) goto L_0x00a2
            r0 = r19
            if (r7 >= r0) goto L_0x00a2
            r0 = r18
            if (r0 >= r7) goto L_0x0051
            r0 = r19
            if (r13 >= r0) goto L_0x0051
            r3 = 1
        L_0x0043:
            if (r5 != 0) goto L_0x0053
            r15 = r3
            r3 = r1
            r1 = r15
        L_0x0048:
            int r4 = r8 + 1
            r8 = r4
            r5 = r3
            r4 = r1
            goto L_0x0022
        L_0x004e:
            r1 = 0
            r2 = r1
            goto L_0x0013
        L_0x0051:
            r3 = 0
            goto L_0x0043
        L_0x0053:
            if (r2 == 0) goto L_0x005b
            int r14 = r5.getTop()
            if (r7 < r14) goto L_0x0063
        L_0x005b:
            if (r2 != 0) goto L_0x006d
            int r7 = r5.getBottom()
            if (r13 <= r7) goto L_0x006d
        L_0x0063:
            r7 = 1
        L_0x0064:
            if (r4 == 0) goto L_0x006f
            if (r3 == 0) goto L_0x00a2
            if (r7 == 0) goto L_0x00a2
            r3 = r1
            r1 = r4
            goto L_0x0048
        L_0x006d:
            r7 = 0
            goto L_0x0064
        L_0x006f:
            if (r3 == 0) goto L_0x0076
            r3 = 1
            r15 = r3
            r3 = r1
            r1 = r15
            goto L_0x0048
        L_0x0076:
            if (r7 == 0) goto L_0x00a2
            r3 = r1
            r1 = r4
            goto L_0x0048
        L_0x007b:
            if (r5 != 0) goto L_0x007f
            r5 = r16
        L_0x007f:
            r0 = r18
            if (r0 < r9) goto L_0x0094
            r0 = r19
            if (r0 > r10) goto L_0x0094
            r1 = 0
        L_0x0088:
            android.view.View r2 = r16.findFocus()
            if (r5 == r2) goto L_0x0093
            r0 = r17
            r5.requestFocus(r0)
        L_0x0093:
            return r1
        L_0x0094:
            if (r2 == 0) goto L_0x009f
            int r1 = r18 - r9
        L_0x0098:
            r0 = r16
            r0.h(r1)
            r1 = r6
            goto L_0x0088
        L_0x009f:
            int r1 = r19 - r10
            goto L_0x0098
        L_0x00a2:
            r1 = r4
            r3 = r5
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.NestedScrollView.a(int, int, int):boolean");
    }

    private final boolean g(int i2) {
        android.view.View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        android.view.View findNextFocus = android.view.FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        int height = (int) (0.5f * ((float) getHeight()));
        if (findNextFocus == null || !a(findNextFocus, height, getHeight())) {
            if (i2 == 33 && getScrollY() < height) {
                height = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                int bottom = getChildAt(0).getBottom();
                int scrollY = (getScrollY() + getHeight()) - getPaddingBottom();
                if (bottom - scrollY < height) {
                    height = bottom - scrollY;
                }
            }
            if (height == 0) {
                return false;
            }
            if (i2 != 130) {
                height = -height;
            }
            h(height);
        } else {
            findNextFocus.getDrawingRect(this.c);
            offsetDescendantRectToMyCoords(findNextFocus, this.c);
            h(a(this.c));
            findNextFocus.requestFocus(i2);
        }
        if (findFocus != null && findFocus.isFocused() && a(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    private final boolean a(android.view.View view) {
        return !a(view, 0, getHeight());
    }

    private final boolean a(android.view.View view, int i2, int i3) {
        view.getDrawingRect(this.c);
        offsetDescendantRectToMyCoords(view, this.c);
        return this.c.bottom + i2 >= getScrollY() && this.c.top - i2 <= getScrollY() + i3;
    }

    private final void h(int i2) {
        if (i2 == 0) {
            return;
        }
        if (this.n) {
            a(0, i2);
        } else {
            scrollBy(0, i2);
        }
    }

    private final void a(int i2, int i3) {
        if (getChildCount() != 0) {
            if (android.view.animation.AnimationUtils.currentAnimationTimeMillis() - this.b > 250) {
                int max = java.lang.Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
                int scrollY = getScrollY();
                this.d.startScroll(getScrollX(), scrollY, 0, java.lang.Math.max(0, java.lang.Math.min(scrollY + i3, max)) - scrollY);
                defpackage.sn.a.c(this);
            } else {
                if (!this.d.isFinished()) {
                    this.d.abortAnimation();
                }
                scrollBy(i2, i3);
            }
            this.b = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public final void b(int i2) {
        a(0 - getScrollX(), i2 - getScrollY());
    }

    public int computeVerticalScrollRange() {
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (getChildCount() == 0) {
            return height;
        }
        int bottom = getChildAt(0).getBottom();
        int scrollY = getScrollY();
        int max = java.lang.Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    public int computeVerticalScrollOffset() {
        return java.lang.Math.max(0, super.computeVerticalScrollOffset());
    }

    /* access modifiers changed from: protected */
    public void measureChild(android.view.View view, int i2, int i3) {
        view.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(android.view.View view, int i2, int i3, int i4, int i5) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), android.view.View.MeasureSpec.makeMeasureSpec(marginLayoutParams.bottomMargin + marginLayoutParams.topMargin, 0));
    }

    public void computeScroll() {
        boolean z2 = false;
        if (this.d.computeScrollOffset()) {
            this.d.getCurrX();
            int currY = this.d.getCurrY();
            int i2 = currY - this.v;
            if (a(i2, this.t, (int[]) null, 1)) {
                i2 -= this.t[1];
            }
            if (i2 != 0) {
                int a2 = a();
                int scrollY = getScrollY();
                a(i2, getScrollX(), scrollY, a2);
                int scrollY2 = getScrollY() - scrollY;
                if (!a(scrollY2, i2 - scrollY2, (int[]) null, 1)) {
                    int overScrollMode = getOverScrollMode();
                    if (overScrollMode == 0 || (overScrollMode == 1 && a2 > 0)) {
                        z2 = true;
                    }
                    if (z2) {
                        e();
                        if (currY <= 0 && scrollY > 0) {
                            this.e.onAbsorb((int) this.d.getCurrVelocity());
                        } else if (currY >= a2 && scrollY < a2) {
                            this.f.onAbsorb((int) this.d.getCurrVelocity());
                        }
                    }
                }
            }
            this.v = currY;
            defpackage.sn.a.c(this);
            return;
        }
        if (e(1)) {
            a(1);
        }
        this.v = 0;
    }

    private final void b(android.view.View view) {
        view.getDrawingRect(this.c);
        offsetDescendantRectToMyCoords(view, this.c);
        int a2 = a(this.c);
        if (a2 != 0) {
            scrollBy(0, a2);
        }
    }

    private final int a(android.graphics.Rect rect) {
        int i2;
        int i3;
        int i4;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        if (rect.bottom < getChildAt(0).getHeight()) {
            i5 -= verticalFadingEdgeLength;
        }
        if (rect.bottom > i5 && rect.top > scrollY) {
            if (rect.height() > height) {
                i4 = (rect.top - scrollY) + 0;
            } else {
                i4 = (rect.bottom - i5) + 0;
            }
            i2 = java.lang.Math.min(i4, getChildAt(0).getBottom() - i5);
        } else if (rect.top >= scrollY || rect.bottom >= i5) {
            i2 = 0;
        } else {
            if (rect.height() > height) {
                i3 = 0 - (i5 - rect.bottom);
            } else {
                i3 = 0 - (scrollY - rect.top);
            }
            i2 = java.lang.Math.max(i3, -getScrollY());
        }
        return i2;
    }

    public void requestChildFocus(android.view.View view, android.view.View view2) {
        if (!this.h) {
            b(view2);
        } else {
            this.j = view2;
        }
        super.requestChildFocus(view, view2);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, android.graphics.Rect rect) {
        android.view.View findNextFocusFromRect;
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = android.view.FocusFinder.getInstance().findNextFocus(this, null, i2);
        } else {
            findNextFocusFromRect = android.view.FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        }
        if (findNextFocusFromRect != null && !a(findNextFocusFromRect)) {
            return findNextFocusFromRect.requestFocus(i2, rect);
        }
        return false;
    }

    public boolean requestChildRectangleOnScreen(android.view.View view, android.graphics.Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int a2 = a(rect);
        boolean z3 = a2 != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, a2);
            } else {
                a(0, a2);
            }
        }
        return z3;
    }

    public void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        this.h = false;
        if (this.j != null && a(this.j, (android.view.View) this)) {
            b(this.j);
        }
        this.j = null;
        if (!this.i) {
            if (this.w != null) {
                scrollTo(getScrollX(), this.w.a);
                this.w = null;
            }
            int max = java.lang.Math.max(0, (getChildCount() > 0 ? getChildAt(0).getMeasuredHeight() : 0) - (((i5 - i3) - getPaddingBottom()) - getPaddingTop()));
            if (getScrollY() > max) {
                scrollTo(getScrollX(), max);
            } else if (getScrollY() < 0) {
                scrollTo(getScrollX(), 0);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.i = true;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = false;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        android.view.View findFocus = findFocus();
        if (findFocus != null && this != findFocus && a(findFocus, 0, i5)) {
            findFocus.getDrawingRect(this.c);
            offsetDescendantRectToMyCoords(findFocus, this.c);
            h(a(this.c));
        }
    }

    private static boolean a(android.view.View view, android.view.View view2) {
        if (view == view2) {
            return true;
        }
        android.view.ViewParent parent = view.getParent();
        return (parent instanceof android.view.ViewGroup) && a((android.view.View) parent, view2);
    }

    public final void c(int i2) {
        if (getChildCount() > 0) {
            d(1);
            this.d.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.v = getScrollY();
            defpackage.sn.a.c(this);
        }
    }

    private final void i(int i2) {
        int scrollY = getScrollY();
        boolean z2 = (scrollY > 0 || i2 > 0) && (scrollY < a() || i2 < 0);
        if (!dispatchNestedPreFling(0.0f, (float) i2)) {
            dispatchNestedFling(0.0f, (float) i2, z2);
            c(i2);
        }
    }

    private final void d() {
        this.k = false;
        c();
        a(0);
        if (this.e != null) {
            this.e.onRelease();
            this.f.onRelease();
        }
    }

    public void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            android.view.View childAt = getChildAt(0);
            int b2 = b(i2, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
            int b3 = b(i3, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
            if (b2 != getScrollX() || b3 != getScrollY()) {
                super.scrollTo(b2, b3);
            }
        }
    }

    private final void e() {
        if (getOverScrollMode() == 2) {
            this.e = null;
            this.f = null;
        } else if (this.e == null) {
            android.content.Context context = getContext();
            this.e = new android.widget.EdgeEffect(context);
            this.f = new android.widget.EdgeEffect(context);
        }
    }

    public void draw(android.graphics.Canvas canvas) {
        int i2;
        int i3;
        int i4 = 0;
        super.draw(canvas);
        if (this.e != null) {
            int scrollY = getScrollY();
            if (!this.e.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = java.lang.Math.min(0, scrollY);
                if (android.os.Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    i2 = width - (getPaddingLeft() + getPaddingRight());
                    i3 = getPaddingLeft() + 0;
                } else {
                    i2 = width;
                    i3 = 0;
                }
                if (android.os.Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i3, (float) min);
                this.e.setSize(i2, height);
                if (this.e.draw(canvas)) {
                    defpackage.sn.a.c(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = java.lang.Math.max(a(), scrollY) + height2;
                if (android.os.Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i4 = getPaddingLeft() + 0;
                }
                if (android.os.Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i4 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f.setSize(width2, height2);
                if (this.f.draw(canvas)) {
                    defpackage.sn.a.c(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    private static int b(int i2, int i3, int i4) {
        if (i3 >= i4 || i2 < 0) {
            return 0;
        }
        if (i3 + i2 > i4) {
            return i4 - i3;
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof defpackage.uz)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        defpackage.uz uzVar = (defpackage.uz) parcelable;
        super.onRestoreInstanceState(uzVar.getSuperState());
        this.w = uzVar;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public android.os.Parcelable onSaveInstanceState() {
        defpackage.uz uzVar = new defpackage.uz(super.onSaveInstanceState());
        uzVar.a = getScrollY();
        return uzVar;
    }
}
