package android.support.design.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
public class HideBottomViewOnScrollBehavior extends gx {
    public ViewPropertyAnimator a;
    private int b = 0;
    private int c = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.gx
    public boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.b = view.getMeasuredHeight();
        return super.a(coordinatorLayout, view, i);
    }

    @Override // defpackage.gx
    public final boolean a(int i) {
        return i == 2;
    }

    @Override // defpackage.gx
    public final void a(View view, int i) {
        if (this.c != 1 && i > 0) {
            c(view);
        } else if (this.c != 2 && i < 0) {
            b(view);
        }
    }

    public void b(View view) {
        if (this.a != null) {
            this.a.cancel();
            view.clearAnimation();
        }
        this.c = 2;
        a(view, 0, 225, cs.c);
    }

    public void c(View view) {
        if (this.a != null) {
            this.a.cancel();
            view.clearAnimation();
        }
        this.c = 1;
        a(view, this.b, 175, cs.b);
    }

    private final void a(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.a = view.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new dl(this));
    }
}
