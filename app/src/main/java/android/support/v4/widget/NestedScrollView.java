package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.util.ArrayList;

/* compiled from: PG */
public class NestedScrollView extends FrameLayout implements sg, si {
    private static final ux x = new ux();
    private static final int[] y = {16843130};
    private final sh A;
    private float B;
    public uy a;
    private long b;
    private final Rect c;
    private OverScroller d;
    private EdgeEffect e;
    private EdgeEffect f;
    private int g;
    private boolean h;
    private boolean i;
    private View j;
    private boolean k;
    private VelocityTracker l;
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
    private uz w;
    private final sk z;

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.c = new Rect();
        this.h = true;
        this.i = false;
        this.j = null;
        this.k = false;
        this.n = true;
        this.r = -1;
        this.s = new int[2];
        this.t = new int[2];
        this.d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.o = viewConfiguration.getScaledTouchSlop();
        this.p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y, i2, 0);
        boolean z2 = obtainStyledAttributes.getBoolean(0, false);
        if (z2 != this.m) {
            this.m = z2;
            requestLayout();
        }
        obtainStyledAttributes.recycle();
        this.z = new sk();
        this.A = new sh(this);
        setNestedScrollingEnabled(true);
        sn.a(this, x);
    }

    public void setNestedScrollingEnabled(boolean z2) {
        this.A.a(z2);
    }

    @Override // defpackage.sf
    public boolean isNestedScrollingEnabled() {
        return this.A.a;
    }

    public boolean startNestedScroll(int i2) {
        return this.A.a(i2, 0);
    }

    private final boolean d(int i2) {
        return this.A.a(2, i2);
    }

    @Override // defpackage.sf
    public void stopNestedScroll() {
        this.A.b(0);
    }

    @Override // defpackage.sg
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

    @Override // defpackage.si
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return (i2 & 2) != 0;
    }

    @Override // defpackage.si
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.z.a = i2;
        startNestedScroll(2);
    }

    @Override // defpackage.si
    public void onStopNestedScroll(View view) {
        this.z.a = 0;
        stopNestedScroll();
    }

    @Override // defpackage.si
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int scrollY = getScrollY();
        scrollBy(0, i5);
        int scrollY2 = getScrollY() - scrollY;
        dispatchNestedScroll(0, scrollY2, 0, i5 - scrollY2, null);
    }

    @Override // defpackage.si
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        dispatchNestedPreScroll(i2, i3, iArr, null);
    }

    @Override // defpackage.si
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        i((int) f3);
        return true;
    }

    @Override // defpackage.si
    public boolean onNestedPreFling(View view, float f2, float f3) {
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

    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
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
        if (this.m && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            int measuredHeight = getMeasuredHeight();
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight(), ((FrameLayout.LayoutParams) childAt.getLayoutParams()).width), View.MeasureSpec.makeMeasureSpec((measuredHeight - getPaddingTop()) - getPaddingBottom(), 1073741824));
            }
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || a(keyEvent);
    }

    public final boolean a(KeyEvent keyEvent) {
        boolean z2;
        boolean z3;
        this.c.setEmpty();
        View childAt = getChildAt(0);
        if (childAt != null) {
            z2 = getHeight() < (childAt.getHeight() + getPaddingTop()) + getPaddingBottom();
        } else {
            z2 = false;
        }
        if (!z2) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
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
                case by.bg /*{ENCODED_INT: 62}*/:
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
                            View childAt2 = getChildAt(childCount - 1);
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
            this.l = VelocityTracker.obtain();
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

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
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
                    View childAt = getChildAt(0);
                    z2 = y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x2 >= childAt.getLeft() && x2 < childAt.getRight();
                } else {
                    z2 = false;
                }
                if (z2) {
                    this.g = y2;
                    this.r = motionEvent.getPointerId(0);
                    if (this.l == null) {
                        this.l = VelocityTracker.obtain();
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
                    sn.a.c(this);
                }
                a(0);
                break;
            case 2:
                int i2 = this.r;
                if (i2 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i2);
                    if (findPointerIndex != -1) {
                        int y3 = (int) motionEvent.getY(findPointerIndex);
                        if (Math.abs(y3 - this.g) > this.o && (getNestedScrollAxes() & 2) == 0) {
                            this.k = true;
                            this.g = y3;
                            b();
                            this.l.addMovement(motionEvent);
                            this.u = 0;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                                break;
                            }
                        }
                    } else {
                        Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
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

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        ViewParent parent;
        b();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
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
                    if (z3 && (parent = getParent()) != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
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
                VelocityTracker velocityTracker = this.l;
                velocityTracker.computeCurrentVelocity(1000, (float) this.q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.r);
                if (Math.abs(yVelocity) > this.p) {
                    i(-yVelocity);
                } else if (this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, a())) {
                    sn.a.c(this);
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
                    if (!this.k && Math.abs(i2) > this.o) {
                        ViewParent parent2 = getParent();
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
                                    um.a(this.e, ((float) i2) / ((float) getHeight()), motionEvent.getX(findPointerIndex) / ((float) getWidth()));
                                    if (!this.f.isFinished()) {
                                        this.f.onRelease();
                                    }
                                } else if (i3 > a2) {
                                    um.a(this.f, ((float) i2) / ((float) getHeight()), 1.0f - (motionEvent.getX(findPointerIndex) / ((float) getWidth())));
                                    if (!this.e.isFinished()) {
                                        this.e.onRelease();
                                    }
                                }
                                if (this.e != null && (!this.e.isFinished() || !this.f.isFinished())) {
                                    sn.a.c(this);
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
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.r + " in onTouchEvent");
                    break;
                }
                break;
            case 3:
                if (this.k && getChildCount() > 0 && this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, a())) {
                    sn.a.c(this);
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

    private final void a(MotionEvent motionEvent) {
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

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0) {
            switch (motionEvent.getAction()) {
                case 8:
                    if (!this.k) {
                        float axisValue = motionEvent.getAxisValue(9);
                        if (axisValue != 0.0f) {
                            if (this.B == 0.0f) {
                                TypedValue typedValue = new TypedValue();
                                Context context = getContext();
                                if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                                    throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
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
        return z2 || z3;
    }

    public final int a() {
        if (getChildCount() > 0) {
            return Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
        }
        return 0;
    }

    private final boolean f(int i2) {
        int childCount;
        boolean z2 = i2 == 130;
        int height = getHeight();
        this.c.top = 0;
        this.c.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            this.c.bottom = getChildAt(childCount - 1).getBottom() + getPaddingBottom();
            this.c.top = this.c.bottom - height;
        }
        return a(i2, this.c.top, this.c.bottom);
    }

    private final boolean a(int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        boolean z4;
        View view;
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = scrollY + height;
        if (i2 == 33) {
            z2 = true;
        } else {
            z2 = false;
        }
        ArrayList focusables = getFocusables(2);
        View view2 = null;
        boolean z5 = false;
        int size = focusables.size();
        int i6 = 0;
        while (i6 < size) {
            View view3 = (View) focusables.get(i6);
            int top = view3.getTop();
            int bottom = view3.getBottom();
            if (i3 < bottom && top < i4) {
                boolean z6 = i3 < top && bottom < i4;
                if (view2 == null) {
                    view = view3;
                    z4 = z6;
                } else {
                    boolean z7 = (z2 && top < view2.getTop()) || (!z2 && bottom > view2.getBottom());
                    if (z5) {
                        if (z6 && z7) {
                            view = view3;
                            z4 = z5;
                        }
                    } else if (z6) {
                        view = view3;
                        z4 = true;
                    } else if (z7) {
                        view = view3;
                        z4 = z5;
                    }
                }
                i6++;
                view2 = view;
                z5 = z4;
            }
            z4 = z5;
            view = view2;
            i6++;
            view2 = view;
            z5 = z4;
        }
        if (view2 == null) {
            view2 = this;
        }
        if (i3 < scrollY || i4 > i5) {
            h(z2 ? i3 - scrollY : i4 - i5);
            z3 = true;
        } else {
            z3 = false;
        }
        if (view2 != findFocus()) {
            view2.requestFocus(i2);
        }
        return z3;
    }

    private final boolean g(int i2) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
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

    private final boolean a(View view) {
        return !a(view, 0, getHeight());
    }

    private final boolean a(View view, int i2, int i3) {
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
            if (AnimationUtils.currentAnimationTimeMillis() - this.b > 250) {
                int max = Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
                int scrollY = getScrollY();
                this.d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(scrollY + i3, max)) - scrollY);
                sn.a.c(this);
            } else {
                if (!this.d.isFinished()) {
                    this.d.abortAnimation();
                }
                scrollBy(i2, i3);
            }
            this.b = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public final void b(int i2) {
        a(0 - getScrollX(), i2 - getScrollY());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        int bottom = getChildAt(0).getBottom();
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i2, int i3) {
        view.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.bottomMargin + marginLayoutParams.topMargin, 0));
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
            sn.a.c(this);
            return;
        }
        if (e(1)) {
            a(1);
        }
        this.v = 0;
    }

    private final void b(View view) {
        view.getDrawingRect(this.c);
        offsetDescendantRectToMyCoords(view, this.c);
        int a2 = a(this.c);
        if (a2 != 0) {
            scrollBy(0, a2);
        }
    }

    private final int a(Rect rect) {
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
            i2 = Math.min(i4, getChildAt(0).getBottom() - i5);
        } else if (rect.top >= scrollY || rect.bottom >= i5) {
            i2 = 0;
        } else {
            if (rect.height() > height) {
                i3 = 0 - (i5 - rect.bottom);
            } else {
                i3 = 0 - (scrollY - rect.top);
            }
            i2 = Math.max(i3, -getScrollY());
        }
        return i2;
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.h) {
            b(view2);
        } else {
            this.j = view2;
        }
        super.requestChildFocus(view, view2);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        View findNextFocusFromRect;
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i2);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        }
        if (findNextFocusFromRect != null && !a(findNextFocusFromRect)) {
            return findNextFocusFromRect.requestFocus(i2, rect);
        }
        return false;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
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
        if (this.j != null && a(this.j, this)) {
            b(this.j);
        }
        this.j = null;
        if (!this.i) {
            if (this.w != null) {
                scrollTo(getScrollX(), this.w.a);
                this.w = null;
            }
            int max = Math.max(0, (getChildCount() > 0 ? getChildAt(0).getMeasuredHeight() : 0) - (((i5 - i3) - getPaddingBottom()) - getPaddingTop()));
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
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && a(findFocus, 0, i5)) {
            findFocus.getDrawingRect(this.c);
            offsetDescendantRectToMyCoords(findFocus, this.c);
            h(a(this.c));
        }
    }

    private static boolean a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !a((View) parent, view2)) {
            return false;
        }
        return true;
    }

    public final void c(int i2) {
        if (getChildCount() > 0) {
            d(1);
            this.d.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.v = getScrollY();
            sn.a.c(this);
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
            View childAt = getChildAt(0);
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
            Context context = getContext();
            this.e = new EdgeEffect(context);
            this.f = new EdgeEffect(context);
        }
    }

    public void draw(Canvas canvas) {
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
                int min = Math.min(0, scrollY);
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    i2 = width - (getPaddingLeft() + getPaddingRight());
                    i3 = getPaddingLeft() + 0;
                } else {
                    i2 = width;
                    i3 = 0;
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i3, (float) min);
                this.e.setSize(i2, height);
                if (this.e.draw(canvas)) {
                    sn.a.c(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(a(), scrollY) + height2;
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i4 = getPaddingLeft() + 0;
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i4 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f.setSize(width2, height2);
                if (this.f.draw(canvas)) {
                    sn.a.c(this);
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
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof uz)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        uz uzVar = (uz) parcelable;
        super.onRestoreInstanceState(uzVar.getSuperState());
        this.w = uzVar;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        uz uzVar = new uz(super.onSaveInstanceState());
        uzVar.a = getScrollY();
        return uzVar;
    }
}
