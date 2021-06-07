package android.support.design.bottomsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.apps.tasks.R;
import java.lang.ref.WeakReference;

/* compiled from: PG */
public class BottomSheetBehavior extends gx {
    public boolean a = true;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f = 4;
    public vv g;
    public int h;
    public WeakReference i;
    public WeakReference j;
    public ea k;
    public int l;
    public boolean m;
    private float n;
    private int o;
    private boolean p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private int u;
    private boolean v;
    private VelocityTracker w;
    private int x;
    private final vy y = new dz(this);

    public BottomSheetBehavior() {
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ej.a);
        TypedValue peekValue = obtainStyledAttributes.peekValue(ej.d);
        if (peekValue == null || peekValue.data != -1) {
            d(obtainStyledAttributes.getDimensionPixelSize(ej.d, -1));
        } else {
            d(peekValue.data);
        }
        this.e = obtainStyledAttributes.getBoolean(ej.c, false);
        boolean z = obtainStyledAttributes.getBoolean(ej.b, true);
        if (this.a != z) {
            this.a = z;
            if (this.i != null) {
                c();
            }
            c((!this.a || this.f != 6) ? this.f : 3);
        }
        this.s = obtainStyledAttributes.getBoolean(ej.e, false);
        obtainStyledAttributes.recycle();
        this.n = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.gx
    public final Parcelable b(CoordinatorLayout coordinatorLayout, View view) {
        return new eb(super.b(coordinatorLayout, view), this.f);
    }

    @Override // defpackage.gx
    public final void a(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        eb ebVar = (eb) parcelable;
        super.a(coordinatorLayout, view, ebVar.e);
        if (ebVar.a == 1 || ebVar.a == 2) {
            this.f = 4;
        } else {
            this.f = ebVar.a;
        }
    }

    @Override // defpackage.gx
    public final boolean a(CoordinatorLayout coordinatorLayout, View view, int i2) {
        if (sn.a.h(coordinatorLayout) && !sn.a.h(view)) {
            view.setFitsSystemWindows(true);
        }
        int top = view.getTop();
        coordinatorLayout.a(view, i2);
        this.h = coordinatorLayout.getHeight();
        if (this.p) {
            if (this.q == 0) {
                this.q = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            }
            this.r = Math.max(this.q, this.h - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            this.r = this.o;
        }
        this.b = Math.max(0, this.h - view.getHeight());
        this.c = this.h / 2;
        c();
        if (this.f == 3) {
            sn.b(view, a());
        } else if (this.f == 6) {
            sn.b(view, this.c);
        } else if (this.e && this.f == 5) {
            sn.b(view, this.h);
        } else if (this.f == 4) {
            sn.b(view, this.d);
        } else if (this.f == 1 || this.f == 2) {
            sn.b(view, top - view.getTop());
        }
        if (this.g == null) {
            this.g = vv.a(coordinatorLayout, this.y);
        }
        this.i = new WeakReference(view);
        this.j = new WeakReference(b(view));
        return true;
    }

    @Override // defpackage.gx
    public final boolean a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            this.t = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            d();
        }
        if (this.w == null) {
            this.w = VelocityTracker.obtain();
        }
        this.w.addMovement(motionEvent);
        switch (actionMasked) {
            case 0:
                int x2 = (int) motionEvent.getX();
                this.x = (int) motionEvent.getY();
                View view2 = this.j != null ? (View) this.j.get() : null;
                if (view2 != null && coordinatorLayout.a(view2, x2, this.x)) {
                    this.l = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.m = true;
                }
                this.t = this.l == -1 && !coordinatorLayout.a(view, x2, this.x);
                break;
            case 1:
            case 3:
                this.m = false;
                this.l = -1;
                if (this.t) {
                    this.t = false;
                    return false;
                }
                break;
        }
        if (!this.t && this.g != null && this.g.a(motionEvent)) {
            return true;
        }
        View view3 = this.j != null ? (View) this.j.get() : null;
        return actionMasked == 2 && view3 != null && !this.t && this.f != 1 && !coordinatorLayout.a(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.g != null && Math.abs(((float) this.x) - motionEvent.getY()) > ((float) this.g.a);
    }

    @Override // defpackage.gx
    public final boolean b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f == 1 && actionMasked == 0) {
            return true;
        }
        if (this.g != null) {
            this.g.b(motionEvent);
        }
        if (actionMasked == 0) {
            d();
        }
        if (this.w == null) {
            this.w = VelocityTracker.obtain();
        }
        this.w.addMovement(motionEvent);
        if (actionMasked == 2 && !this.t && Math.abs(((float) this.x) - motionEvent.getY()) > ((float) this.g.a)) {
            this.g.a(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.t;
    }

    @Override // defpackage.gx
    public final boolean a(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
        this.u = 0;
        this.v = false;
        if ((i2 & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.gx
    public final void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int[] iArr, int i3) {
        if (i3 != 1 && view2 == ((View) this.j.get())) {
            int top = view.getTop();
            int i4 = top - i2;
            if (i2 > 0) {
                if (i4 < a()) {
                    iArr[1] = top - a();
                    sn.b(view, -iArr[1]);
                    c(3);
                } else {
                    iArr[1] = i2;
                    sn.b(view, -i2);
                    c(1);
                }
            } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
                if (i4 <= this.d || this.e) {
                    iArr[1] = i2;
                    sn.b(view, -i2);
                    c(1);
                } else {
                    iArr[1] = top - this.d;
                    sn.b(view, -iArr[1]);
                    c(4);
                }
            }
            view.getTop();
            b();
            this.u = i2;
            this.v = true;
        }
    }

    @Override // defpackage.gx
    public final void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i2) {
        int i3;
        int i4;
        float yVelocity;
        if (view.getTop() == a()) {
            c(3);
        } else if (view2 == this.j.get() && this.v) {
            if (this.u > 0) {
                i3 = a();
                i4 = 3;
            } else {
                if (this.e) {
                    if (this.w == null) {
                        yVelocity = 0.0f;
                    } else {
                        this.w.computeCurrentVelocity(1000, this.n);
                        yVelocity = this.w.getYVelocity(this.l);
                    }
                    if (a(view, yVelocity)) {
                        i3 = this.h;
                        i4 = 5;
                    }
                }
                if (this.u == 0) {
                    int top = view.getTop();
                    if (this.a) {
                        if (Math.abs(top - this.b) < Math.abs(top - this.d)) {
                            i3 = this.b;
                            i4 = 3;
                        } else {
                            i3 = this.d;
                            i4 = 4;
                        }
                    } else if (top < this.c) {
                        if (top < Math.abs(top - this.d)) {
                            i4 = 3;
                            i3 = 0;
                        } else {
                            i3 = this.c;
                            i4 = 6;
                        }
                    } else if (Math.abs(top - this.c) < Math.abs(top - this.d)) {
                        i3 = this.c;
                        i4 = 6;
                    } else {
                        i3 = this.d;
                        i4 = 4;
                    }
                } else {
                    i3 = this.d;
                    i4 = 4;
                }
            }
            if (this.g.a(view, view.getLeft(), i3)) {
                c(2);
                sn.a(view, new ed(this, view, i4));
            } else {
                c(i4);
            }
            this.v = false;
        }
    }

    @Override // defpackage.gx
    public final boolean a(CoordinatorLayout coordinatorLayout, View view, View view2, float f2, float f3) {
        return view2 == this.j.get() && (this.f != 3 || super.a(coordinatorLayout, view, view2, f2, f3));
    }

    private final void d(int i2) {
        View view;
        boolean z = true;
        if (i2 == -1) {
            if (!this.p) {
                this.p = true;
            }
            z = false;
        } else {
            if (this.p || this.o != i2) {
                this.p = false;
                this.o = Math.max(0, i2);
                this.d = this.h - i2;
            }
            z = false;
        }
        if (z && this.f == 4 && this.i != null && (view = (View) this.i.get()) != null) {
            view.requestLayout();
        }
    }

    public final void b(int i2) {
        if (i2 != this.f) {
            if (this.i != null) {
                View view = (View) this.i.get();
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent == null || !parent.isLayoutRequested() || !sn.a.s(view)) {
                        b(view, i2);
                    } else {
                        view.post(new dy(this, view, i2));
                    }
                }
            } else if (i2 == 4 || i2 == 3 || i2 == 6 || (this.e && i2 == 5)) {
                this.f = i2;
            }
        }
    }

    public final void c(int i2) {
        if (this.f != i2) {
            this.f = i2;
            if (((View) this.i.get()) != null && this.k != null) {
                ea eaVar = this.k;
                if (i2 == 5) {
                    eaVar.a.cancel();
                }
            }
        }
    }

    private final void c() {
        if (this.a) {
            this.d = Math.max(this.h - this.r, this.b);
        } else {
            this.d = this.h - this.r;
        }
    }

    private final void d() {
        this.l = -1;
        if (this.w != null) {
            this.w.recycle();
            this.w = null;
        }
    }

    public final boolean a(View view, float f2) {
        if (this.s) {
            return true;
        }
        if (view.getTop() < this.d) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (0.1f * f2)) - ((float) this.d)) / ((float) this.o) > 0.5f;
    }

    private final View b(View view) {
        if (sn.a.w(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View b2 = b(viewGroup.getChildAt(i2));
                if (b2 != null) {
                    return b2;
                }
            }
        }
        return null;
    }

    public final int a() {
        if (this.a) {
            return this.b;
        }
        return 0;
    }

    public final void b(View view, int i2) {
        int i3;
        if (i2 == 4) {
            i3 = this.d;
        } else if (i2 == 6) {
            i3 = this.c;
            if (this.a && i3 <= this.b) {
                i3 = this.b;
                i2 = 3;
            }
        } else if (i2 == 3) {
            i3 = a();
        } else if (!this.e || i2 != 5) {
            throw new IllegalArgumentException(new StringBuilder(35).append("Illegal state argument: ").append(i2).toString());
        } else {
            i3 = this.h;
        }
        if (this.g.a(view, view.getLeft(), i3)) {
            c(2);
            sn.a(view, new ed(this, view, i2));
            return;
        }
        c(i2);
    }

    public final void b() {
        this.i.get();
    }
}
