package defpackage;

import android.view.View;
import com.google.android.libraries.onegoogle.bottomdrawer.BottomDrawerBehavior;

/* renamed from: cgb  reason: default package */
/* compiled from: PG */
public final class cgb extends vy {
    private final /* synthetic */ BottomDrawerBehavior a;

    public cgb(BottomDrawerBehavior bottomDrawerBehavior) {
        this.a = bottomDrawerBehavior;
    }

    @Override // defpackage.vy
    public final boolean a(View view, int i) {
        View view2;
        if (this.a.c == 1) {
            return false;
        }
        if (this.a.j) {
            return false;
        }
        if (this.a.c != 3 || this.a.i != i || (view2 = (View) this.a.g.get()) == null || !view2.canScrollVertically(-1)) {
            return this.a.f != null && this.a.f.get() == view;
        }
        return false;
    }

    @Override // defpackage.vy
    public final void a(View view, int i, int i2) {
        this.a.d(i2);
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
        int i2 = 6;
        if (f2 < 0.0f || !this.a.a()) {
            if (f2 < 0.0f) {
                this.a.b();
                i = this.a.a;
                if (this.a.a <= this.a.b) {
                    i2 = 3;
                }
            } else if (!this.a.l || this.a.k) {
                this.a.l = false;
                i = this.a.e;
                i2 = 5;
            } else {
                this.a.l = false;
                i = this.a.b;
            }
            if (this.a.d.a(view.getLeft(), i)) {
                this.a.c(2);
                sn.a(view, new cgd(this.a, view, i2));
                return;
            }
            this.a.c(i2);
        }
    }

    @Override // defpackage.vy
    public final int d(View view, int i) {
        if (i < this.a.a) {
            return this.a.a;
        }
        return Math.min(this.a.e, i);
    }

    @Override // defpackage.vy
    public final int c(View view, int i) {
        return view.getLeft();
    }

    @Override // defpackage.vy
    public final int a() {
        return this.a.e;
    }
}
