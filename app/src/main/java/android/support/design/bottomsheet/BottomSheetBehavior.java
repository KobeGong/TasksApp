package android.support.design.bottomsheet;

import defpackage.ViewCompat;

/* compiled from: PG */
public class BottomSheetBehavior extends defpackage.gx {
    public boolean a = true;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f = 4;
    public defpackage.vv g;
    public int h;
    public java.lang.ref.WeakReference i;
    public java.lang.ref.WeakReference j;
    public defpackage.ea k;
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
    private android.view.VelocityTracker w;
    private int x;
    private final defpackage.vy y = new defpackage.dz(this);

    public BottomSheetBehavior() {
    }

    public BottomSheetBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.ej.a);
        android.util.TypedValue peekValue = obtainStyledAttributes.peekValue(defpackage.ej.d);
        if (peekValue == null || peekValue.data != -1) {
            d(obtainStyledAttributes.getDimensionPixelSize(defpackage.ej.d, -1));
        } else {
            d(peekValue.data);
        }
        this.e = obtainStyledAttributes.getBoolean(defpackage.ej.c, false);
        boolean z = obtainStyledAttributes.getBoolean(defpackage.ej.b, true);
        if (this.a != z) {
            this.a = z;
            if (this.i != null) {
                c();
            }
            c((!this.a || this.f != 6) ? this.f : 3);
        }
        this.s = obtainStyledAttributes.getBoolean(defpackage.ej.e, false);
        obtainStyledAttributes.recycle();
        this.n = (float) android.view.ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final android.os.Parcelable b(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
        return new defpackage.eb(super.b(coordinatorLayout, view), this.f);
    }

    public final void a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.os.Parcelable parcelable) {
        defpackage.eb ebVar = (defpackage.eb) parcelable;
        super.a(coordinatorLayout, view, ebVar.e);
        if (ebVar.a == 1 || ebVar.a == 2) {
            this.f = 4;
        } else {
            this.f = ebVar.a;
        }
    }

    public final boolean a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i2) {
        if (ViewCompat.a.h(coordinatorLayout) && !ViewCompat.a.h(view)) {
            view.setFitsSystemWindows(true);
        }
        int top = view.getTop();
        coordinatorLayout.a(view, i2);
        this.h = coordinatorLayout.getHeight();
        if (this.p) {
            if (this.q == 0) {
                this.q = coordinatorLayout.getResources().getDimensionPixelSize(2131689629);
            }
            this.r = java.lang.Math.max(this.q, this.h - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            this.r = this.o;
        }
        this.b = java.lang.Math.max(0, this.h - view.getHeight());
        this.c = this.h / 2;
        c();
        if (this.f == 3) {
            ViewCompat.b(view, a());
        } else if (this.f == 6) {
            ViewCompat.b(view, this.c);
        } else if (this.e && this.f == 5) {
            ViewCompat.b(view, this.h);
        } else if (this.f == 4) {
            ViewCompat.b(view, this.d);
        } else if (this.f == 1 || this.f == 2) {
            ViewCompat.b(view, top - view.getTop());
        }
        if (this.g == null) {
            this.g = defpackage.vv.a((android.view.ViewGroup) coordinatorLayout, this.y);
        }
        this.i = new java.lang.ref.WeakReference(view);
        this.j = new java.lang.ref.WeakReference(b(view));
        return true;
    }

    public final boolean a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        if (!view.isShown()) {
            this.t = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            d();
        }
        if (this.w == null) {
            this.w = android.view.VelocityTracker.obtain();
        }
        this.w.addMovement(motionEvent);
        switch (actionMasked) {
            case 0:
                int x2 = (int) motionEvent.getX();
                this.x = (int) motionEvent.getY();
                android.view.View view2 = this.j != null ? (android.view.View) this.j.get() : null;
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
        android.view.View view3 = this.j != null ? (android.view.View) this.j.get() : null;
        if (actionMasked != 2 || view3 == null || this.t || this.f == 1 || coordinatorLayout.a(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.g == null || java.lang.Math.abs(((float) this.x) - motionEvent.getY()) <= ((float) this.g.a)) {
            return false;
        }
        return true;
    }

    public final boolean b(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
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
            this.w = android.view.VelocityTracker.obtain();
        }
        this.w.addMovement(motionEvent);
        if (actionMasked == 2 && !this.t && java.lang.Math.abs(((float) this.x) - motionEvent.getY()) > ((float) this.g.a)) {
            this.g.a(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        if (!this.t) {
            return true;
        }
        return false;
    }

    public final boolean a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, android.view.View view3, int i2, int i3) {
        this.u = 0;
        this.v = false;
        if ((i2 & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i2, int[] iArr, int i3) {
        if (i3 != 1 && view2 == ((android.view.View) this.j.get())) {
            int top = view.getTop();
            int i4 = top - i2;
            if (i2 > 0) {
                if (i4 < a()) {
                    iArr[1] = top - a();
                    ViewCompat.b(view, -iArr[1]);
                    c(3);
                } else {
                    iArr[1] = i2;
                    ViewCompat.b(view, -i2);
                    c(1);
                }
            } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
                if (i4 <= this.d || this.e) {
                    iArr[1] = i2;
                    ViewCompat.b(view, -i2);
                    c(1);
                } else {
                    iArr[1] = top - this.d;
                    ViewCompat.b(view, -iArr[1]);
                    c(4);
                }
            }
            view.getTop();
            b();
            this.u = i2;
            this.v = true;
        }
    }

    public final void a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i2) {
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
                        if (java.lang.Math.abs(top - this.b) < java.lang.Math.abs(top - this.d)) {
                            i3 = this.b;
                            i4 = 3;
                        } else {
                            i3 = this.d;
                            i4 = 4;
                        }
                    } else if (top < this.c) {
                        if (top < java.lang.Math.abs(top - this.d)) {
                            i4 = 3;
                            i3 = 0;
                        } else {
                            i3 = this.c;
                            i4 = 6;
                        }
                    } else if (java.lang.Math.abs(top - this.c) < java.lang.Math.abs(top - this.d)) {
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
                ViewCompat.a(view, (java.lang.Runnable) new defpackage.ed(this, view, i4));
            } else {
                c(i4);
            }
            this.v = false;
        }
    }

    public final boolean a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, float f2, float f3) {
        return view2 == this.j.get() && (this.f != 3 || super.a(coordinatorLayout, view, view2, f2, f3));
    }

    private final void d(int i2) {
        boolean z = true;
        if (i2 == -1) {
            if (!this.p) {
                this.p = true;
            }
            z = false;
        } else {
            if (this.p || this.o != i2) {
                this.p = false;
                this.o = java.lang.Math.max(0, i2);
                this.d = this.h - i2;
            }
            z = false;
        }
        if (z && this.f == 4 && this.i != null) {
            android.view.View view = (android.view.View) this.i.get();
            if (view != null) {
                view.requestLayout();
            }
        }
    }

    public final void b(int i2) {
        if (i2 != this.f) {
            if (this.i != null) {
                android.view.View view = (android.view.View) this.i.get();
                if (view != null) {
                    android.view.ViewParent parent = view.getParent();
                    if (parent == null || !parent.isLayoutRequested() || !ViewCompat.a.s(view)) {
                        b(view, i2);
                    } else {
                        view.post(new defpackage.dy(this, view, i2));
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
            if (((android.view.View) this.i.get()) != null && this.k != null) {
                defpackage.ea eaVar = this.k;
                if (i2 == 5) {
                    eaVar.a.cancel();
                }
            }
        }
    }

    private final void c() {
        if (this.a) {
            this.d = java.lang.Math.max(this.h - this.r, this.b);
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

    public final boolean a(android.view.View view, float f2) {
        if (this.s) {
            return true;
        }
        if (view.getTop() < this.d) {
            return false;
        }
        if (java.lang.Math.abs((((float) view.getTop()) + (0.1f * f2)) - ((float) this.d)) / ((float) this.o) <= 0.5f) {
            return false;
        }
        return true;
    }

    private final android.view.View b(android.view.View view) {
        if (ViewCompat.a.w(view)) {
            return view;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                android.view.View b2 = b(viewGroup.getChildAt(i2));
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

    public final void b(android.view.View view, int i2) {
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
            throw new java.lang.IllegalArgumentException("Illegal state argument: " + i2);
        } else {
            i3 = this.h;
        }
        if (this.g.a(view, view.getLeft(), i3)) {
            c(2);
            ViewCompat.a(view, (java.lang.Runnable) new defpackage.ed(this, view, i2));
            return;
        }
        c(i2);
    }

    public final void b() {
        this.i.get();
    }
}
