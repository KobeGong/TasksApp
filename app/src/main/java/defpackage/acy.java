package defpackage;

/* renamed from: acy reason: default package */
/* compiled from: PG */
final class acy extends android.animation.AnimatorListenerAdapter {
    private final /* synthetic */ RecyclerViewHolder a;
    private final /* synthetic */ int b;
    private final /* synthetic */ android.view.View c;
    private final /* synthetic */ int d;
    private final /* synthetic */ android.view.ViewPropertyAnimator e;
    private final /* synthetic */ defpackage.acs f;

    acy(defpackage.acs acs, RecyclerViewHolder afv, int i, android.view.View view, int i2, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f = acs;
        this.a = afv;
        this.b = i;
        this.c = view;
        this.d = i2;
        this.e = viewPropertyAnimator;
    }

    public final void onAnimationStart(android.animation.Animator animator) {
    }

    public final void onAnimationCancel(android.animation.Animator animator) {
        if (this.b != 0) {
            this.c.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            this.c.setTranslationY(0.0f);
        }
    }

    public final void onAnimationEnd(android.animation.Animator animator) {
        this.e.setListener(null);
        this.f.e(this.a);
        this.f.e.remove(this.a);
        this.f.c();
    }
}
