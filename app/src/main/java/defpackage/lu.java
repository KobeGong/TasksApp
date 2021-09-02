package defpackage;

/* renamed from: lu reason: default package */
/* compiled from: PG */
final class lu extends android.animation.AnimatorListenerAdapter {
    private final /* synthetic */ android.view.ViewGroup a;
    private final /* synthetic */ android.view.View b;
    private final /* synthetic */ Fragment c;

    lu(android.view.ViewGroup viewGroup, android.view.View view, Fragment lcVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = lcVar;
    }

    public final void onAnimationEnd(android.animation.Animator animator) {
        this.a.endViewTransition(this.b);
        animator.removeListener(this);
        if (this.c.J != null) {
            this.c.J.setVisibility(8);
        }
    }
}
