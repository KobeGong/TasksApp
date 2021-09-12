package defpackage;

/* renamed from: afu reason: default package */
/* compiled from: PG */
public final class afu implements java.lang.Runnable {
    public int a;
    public int b;
    public android.widget.OverScroller c;
    public android.view.animation.Interpolator d = android.support.v7.widget.RecyclerView.M;
    public final /* synthetic */ android.support.v7.widget.RecyclerView e;
    private boolean f = false;
    private boolean g = false;

    public afu(android.support.v7.widget.RecyclerView recyclerView) {
        this.e = recyclerView;
        this.c = new android.widget.OverScroller(recyclerView.getContext(), android.support.v7.widget.RecyclerView.M);
    }

    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (this.e.mLayout == null) {
            b();
            return;
        }
        this.g = false;
        this.f = true;
        this.e.c();
        android.widget.OverScroller overScroller = this.c;
        LayoutManager afd = this.e.mLayout;
        if (overScroller.computeScrollOffset()) {
            int[] iArr = this.e.K;
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i8 = currX - this.a;
            int i9 = currY - this.b;
            this.a = currX;
            this.b = currY;
            if (this.e.a(i8, i9, iArr, null, 1)) {
                i = i9 - iArr[1];
                i2 = i8 - iArr[0];
            } else {
                i = i9;
                i2 = i8;
            }
            if (this.e.adapter != null) {
                this.e.a(i2, i, this.e.L);
                i6 = this.e.L[0];
                i5 = this.e.L[1];
                i4 = i2 - i6;
                i3 = i - i5;
            } else {
                i3 = 0;
                i4 = 0;
                i5 = 0;
                i6 = 0;
            }
            if (!this.e.mItemDecorations.isEmpty()) {
                this.e.invalidate();
            }
            if (this.e.getOverScrollMode() != 2) {
                this.e.b(i2, i);
            }
            if (!this.e.a(i6, i5, i4, i3, null, 1) && !(i4 == 0 && i3 == 0)) {
                int currVelocity = (int) overScroller.getCurrVelocity();
                if (i4 != currX) {
                    int i10 = i4 < 0 ? -currVelocity : i4 > 0 ? currVelocity : 0;
                    i7 = i10;
                } else {
                    i7 = 0;
                }
                if (i3 == currY) {
                    currVelocity = 0;
                } else if (i3 < 0) {
                    currVelocity = -currVelocity;
                } else if (i3 <= 0) {
                    currVelocity = 0;
                }
                if (this.e.getOverScrollMode() != 2) {
                    android.support.v7.widget.RecyclerView recyclerView = this.e;
                    if (i7 < 0) {
                        recyclerView.e();
                        recyclerView.v.onAbsorb(-i7);
                    } else if (i7 > 0) {
                        recyclerView.f();
                        recyclerView.x.onAbsorb(i7);
                    }
                    if (currVelocity < 0) {
                        recyclerView.g();
                        recyclerView.w.onAbsorb(-currVelocity);
                    } else if (currVelocity > 0) {
                        recyclerView.h();
                        recyclerView.y.onAbsorb(currVelocity);
                    }
                    if (!(i7 == 0 && currVelocity == 0)) {
                        ViewCompat.a.c(recyclerView);
                    }
                }
                if ((i7 != 0 || i4 == currX || overScroller.getFinalX() == 0) && (currVelocity != 0 || i3 == currY || overScroller.getFinalY() == 0)) {
                    overScroller.abortAnimation();
                }
            }
            if (!(i6 == 0 && i5 == 0)) {
                this.e.m();
            }
            if (!this.e.awakenScrollBars()) {
                this.e.invalidate();
            }
            boolean z = (i2 == 0 && i == 0) || (i2 != 0 && this.e.mLayout.d() && i6 == i2) || (i != 0 && this.e.mLayout.e() && i5 == i);
            if (overScroller.isFinished() || (!z && !this.e.p().a(1))) {
                this.e.b(0);
                if (android.support.v7.widget.RecyclerView.d) {
                    this.e.C.a();
                }
                this.e.a(1);
            } else {
                a();
                if (this.e.B != null) {
                    this.e.B.a(this.e, i2, i);
                }
            }
        }
        this.f = false;
        if (this.g) {
            a();
        }
    }

    public final void a() {
        if (this.f) {
            this.g = true;
            return;
        }
        this.e.removeCallbacks(this);
        ViewCompat.a((android.view.View) this.e, (java.lang.Runnable) this);
    }

    public final void b() {
        this.e.removeCallbacks(this);
        this.c.abortAnimation();
    }
}
