package android.support.design.behavior;

/* compiled from: PG */
public class HideBottomViewOnScrollBehavior extends defpackage.gx {
    public android.view.ViewPropertyAnimator a;
    private int b = 0;
    private int c = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i) {
        this.b = view.getMeasuredHeight();
        return super.a(coordinatorLayout, view, i);
    }

    public final boolean a(int i) {
        return i == 2;
    }

    public final void a(android.view.View view, int i) {
        if (this.c != 1 && i > 0) {
            c(view);
        } else if (this.c != 2 && i < 0) {
            b(view);
        }
    }

    public void b(android.view.View view) {
        if (this.a != null) {
            this.a.cancel();
            view.clearAnimation();
        }
        this.c = 2;
        a(view, 0, 225, defpackage.cs.c);
    }

    public void c(android.view.View view) {
        if (this.a != null) {
            this.a.cancel();
            view.clearAnimation();
        }
        this.c = 1;
        a(view, this.b, 175, defpackage.cs.b);
    }

    private final void a(android.view.View view, int i, long j, android.animation.TimeInterpolator timeInterpolator) {
        this.a = view.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new defpackage.dl(this));
    }
}
