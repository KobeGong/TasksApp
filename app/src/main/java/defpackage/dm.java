package defpackage;

import android.support.design.behavior.SwipeDismissBehavior;
import android.view.View;
import android.view.ViewParent;

/* renamed from: dm  reason: default package */
/* compiled from: PG */
public final class dm extends vy {
    private int a;
    private int b = -1;
    private final /* synthetic */ SwipeDismissBehavior c;

    public dm(SwipeDismissBehavior swipeDismissBehavior) {
        this.c = swipeDismissBehavior;
    }

    @Override // defpackage.vy
    public final boolean a(View view, int i) {
        return this.b == -1 && this.c.b(view);
    }

    @Override // defpackage.vy
    public final void b(View view, int i) {
        this.b = i;
        this.a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // defpackage.vy
    public final void a(int i) {
        if (this.c.b != null) {
            this.c.b.a(i);
        }
    }

    @Override // defpackage.vy
    public final void a(View view, float f, float f2) {
        boolean z;
        int i;
        boolean z2 = true;
        this.b = -1;
        int width = view.getWidth();
        if (f != 0.0f) {
            boolean z3 = sn.a.j(view) == 1;
            z = this.c.c == 2 ? true : this.c.c == 0 ? z3 ? f < 0.0f : f > 0.0f : this.c.c == 1 ? z3 ? f > 0.0f : f < 0.0f : false;
        } else {
            z = Math.abs(view.getLeft() - this.a) >= Math.round(((float) view.getWidth()) * this.c.d);
        }
        if (!z) {
            i = this.a;
            z2 = false;
        } else if (view.getLeft() < this.a) {
            i = this.a - width;
        } else {
            i = this.a + width;
        }
        if (this.c.a.a(i, view.getTop())) {
            sn.a(view, new PG(this.c, view, z2));
        } else if (z2 && this.c.b != null) {
            this.c.b.a(view);
        }
    }

    @Override // defpackage.vy
    public final int a(View view) {
        return view.getWidth();
    }

    @Override // defpackage.vy
    public final int c(View view, int i) {
        int width;
        int width2;
        boolean z = sn.a.j(view) == 1;
        if (this.c.c == 0) {
            if (z) {
                width = this.a - view.getWidth();
                width2 = this.a;
            } else {
                width = this.a;
                width2 = this.a + view.getWidth();
            }
        } else if (this.c.c != 1) {
            width = this.a - view.getWidth();
            width2 = this.a + view.getWidth();
        } else if (z) {
            width = this.a;
            width2 = this.a + view.getWidth();
        } else {
            width = this.a - view.getWidth();
            width2 = this.a;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // defpackage.vy
    public final int d(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.vy
    public final void a(View view, int i, int i2) {
        float width = ((float) this.a) + (((float) view.getWidth()) * this.c.e);
        float width2 = ((float) this.a) + (((float) view.getWidth()) * this.c.f);
        if (((float) i) <= width) {
            view.setAlpha(1.0f);
        } else if (((float) i) >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(SwipeDismissBehavior.a(1.0f - ((((float) i) - width) / (width2 - width))));
        }
    }
}
