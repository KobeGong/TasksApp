package defpackage;

/* renamed from: cgb reason: default package */
/* compiled from: PG */
public final class cgb extends defpackage.vy {
    private final /* synthetic */ com.google.android.libraries.onegoogle.bottomdrawer.BottomDrawerBehavior a;

    public cgb(com.google.android.libraries.onegoogle.bottomdrawer.BottomDrawerBehavior bottomDrawerBehavior) {
        this.a = bottomDrawerBehavior;
    }

    public final boolean a(android.view.View view, int i) {
        if (this.a.c == 1) {
            return false;
        }
        if (this.a.j) {
            return false;
        }
        if (this.a.c == 3 && this.a.i == i) {
            android.view.View view2 = (android.view.View) this.a.g.get();
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        return this.a.f != null && this.a.f.get() == view;
    }

    public final void a(android.view.View view, int i, int i2) {
        this.a.d(i2);
    }

    public final void a(int i) {
        if (i == 1) {
            this.a.c(1);
        }
    }

    public final void a(android.view.View view, float f, float f2) {
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
                defpackage.sn.a(view, (java.lang.Runnable) new defpackage.cgd(this.a, view, i2));
                return;
            }
            this.a.c(i2);
        }
    }

    public final int d(android.view.View view, int i) {
        if (i < this.a.a) {
            return this.a.a;
        }
        return java.lang.Math.min(this.a.e, i);
    }

    public final int c(android.view.View view, int i) {
        return view.getLeft();
    }

    public final int a() {
        return this.a.e;
    }
}
