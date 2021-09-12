package defpackage;

/* renamed from: acw reason: default package */
/* compiled from: PG */
final class acw extends android.animation.AnimatorListenerAdapter {
    private final /* synthetic */ RecyclerViewHolder a;
    private final /* synthetic */ android.view.ViewPropertyAnimator b;
    private final /* synthetic */ android.view.View c;
    private final /* synthetic */ defpackage.acs d;

    acw(defpackage.acs acs, RecyclerViewHolder afv, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
        this.d = acs;
        this.a = afv;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    public final void onAnimationStart(android.animation.Animator animator) {
    }

    public final void onAnimationEnd(android.animation.Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        this.d.e(this.a);
        this.d.f.remove(this.a);
        this.d.c();
    }
}
