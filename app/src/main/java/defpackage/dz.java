package defpackage;

/* renamed from: dz reason: default package */
/* compiled from: PG */
public final class dz extends defpackage.vy {
    private final /* synthetic */ android.support.design.bottomsheet.BottomSheetBehavior a;

    public dz(android.support.design.bottomsheet.BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    public final boolean a(android.view.View view, int i) {
        if (this.a.f == 1) {
            return false;
        }
        if (this.a.m) {
            return false;
        }
        if (this.a.f == 3 && this.a.l == i) {
            android.view.View view2 = (android.view.View) this.a.j.get();
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        return this.a.i != null && this.a.i.get() == view;
    }

    public final void a(android.view.View view, int i, int i2) {
        this.a.b();
    }

    public final void a(int i) {
        if (i == 1) {
            this.a.c(1);
        }
    }

    public final void a(android.view.View view, float f, float f2) {
        int i;
        int i2 = 3;
        if (f2 < 0.0f) {
            if (this.a.a) {
                i = this.a.b;
            } else if (view.getTop() > this.a.c) {
                i = this.a.c;
                i2 = 6;
            } else {
                i = 0;
            }
        } else if (this.a.e && this.a.a(view, f2)) {
            i = this.a.h;
            i2 = 5;
        } else if (f2 == 0.0f) {
            int top = view.getTop();
            if (this.a.a) {
                if (java.lang.Math.abs(top - this.a.b) < java.lang.Math.abs(top - this.a.d)) {
                    i = this.a.b;
                } else {
                    i = this.a.d;
                    i2 = 4;
                }
            } else if (top < this.a.c) {
                if (top < java.lang.Math.abs(top - this.a.d)) {
                    i = 0;
                } else {
                    i = this.a.c;
                    i2 = 6;
                }
            } else if (java.lang.Math.abs(top - this.a.c) < java.lang.Math.abs(top - this.a.d)) {
                i = this.a.c;
                i2 = 6;
            } else {
                i = this.a.d;
                i2 = 4;
            }
        } else {
            i = this.a.d;
            i2 = 4;
        }
        if (this.a.g.a(view.getLeft(), i)) {
            this.a.c(2);
            ViewCompat.a(view, (java.lang.Runnable) new defpackage.ed(this.a, view, i2));
            return;
        }
        this.a.c(i2);
    }

    public final int d(android.view.View view, int i) {
        return defpackage.gm.a(i, this.a.a(), this.a.e ? this.a.h : this.a.d);
    }

    public final int c(android.view.View view, int i) {
        return view.getLeft();
    }

    public final int a() {
        if (this.a.e) {
            return this.a.h;
        }
        return this.a.d;
    }
}
