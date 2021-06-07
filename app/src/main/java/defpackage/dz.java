package defpackage;

import android.support.design.bottomsheet.BottomSheetBehavior;
import android.view.View;

/* renamed from: dz  reason: default package */
/* compiled from: PG */
public final class dz extends vy {
    private final /* synthetic */ BottomSheetBehavior a;

    public dz(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // defpackage.vy
    public final boolean a(View view, int i) {
        View view2;
        if (this.a.f == 1) {
            return false;
        }
        if (this.a.m) {
            return false;
        }
        if (this.a.f != 3 || this.a.l != i || (view2 = (View) this.a.j.get()) == null || !view2.canScrollVertically(-1)) {
            return this.a.i != null && this.a.i.get() == view;
        }
        return false;
    }

    @Override // defpackage.vy
    public final void a(View view, int i, int i2) {
        this.a.b();
    }

    @Override // defpackage.vy
    public final void a(int i) {
        if (i == 1) {
            this.a.c(1);
        }
    }

    @Override // defpackage.vy
    public final void a(View view, float f, float f2) {
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
                if (Math.abs(top - this.a.b) < Math.abs(top - this.a.d)) {
                    i = this.a.b;
                } else {
                    i = this.a.d;
                    i2 = 4;
                }
            } else if (top < this.a.c) {
                if (top < Math.abs(top - this.a.d)) {
                    i = 0;
                } else {
                    i = this.a.c;
                    i2 = 6;
                }
            } else if (Math.abs(top - this.a.c) < Math.abs(top - this.a.d)) {
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
            sn.a(view, new ed(this.a, view, i2));
            return;
        }
        this.a.c(i2);
    }

    @Override // defpackage.vy
    public final int d(View view, int i) {
        return gm.a(i, this.a.a(), this.a.e ? this.a.h : this.a.d);
    }

    @Override // defpackage.vy
    public final int c(View view, int i) {
        return view.getLeft();
    }

    @Override // defpackage.vy
    public final int a() {
        if (this.a.e) {
            return this.a.h;
        }
        return this.a.d;
    }
}
