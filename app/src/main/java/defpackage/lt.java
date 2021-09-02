package defpackage;

/* renamed from: lt reason: default package */
/* compiled from: PG */
final class lt extends android.animation.AnimatorListenerAdapter {
    private final /* synthetic */ android.view.ViewGroup a;
    private final /* synthetic */ android.view.View b;
    private final /* synthetic */ Fragment c;
    private final /* synthetic */ FragmentManagerImpl d;

    lt(FragmentManagerImpl lpVar, android.view.ViewGroup viewGroup, android.view.View view, Fragment lcVar) {
        this.d = lpVar;
        this.a = viewGroup;
        this.b = view;
        this.c = lcVar;
    }

    public final void onAnimationEnd(android.animation.Animator animator) {
        this.a.endViewTransition(this.b);
        android.animation.Animator J = this.c.J();
        this.c.a((android.animation.Animator) null);
        if (J != null && this.a.indexOfChild(this.b) < 0) {
            this.d.a(this.c, this.c.K(), 0, 0, false);
        }
    }
}
