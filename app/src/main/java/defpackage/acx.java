package defpackage;

/* renamed from: acx reason: default package */
/* compiled from: PG */
final class acx extends android.animation.AnimatorListenerAdapter {
    private final /* synthetic */ defpackage.afv a;
    private final /* synthetic */ android.view.View b;
    private final /* synthetic */ android.view.ViewPropertyAnimator c;
    private final /* synthetic */ defpackage.acs d;

    acx(defpackage.acs acs, defpackage.afv afv, android.view.View view, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.d = acs;
        this.a = afv;
        this.b = view;
        this.c = viewPropertyAnimator;
    }

    public final void onAnimationStart(android.animation.Animator animator) {
    }

    public final void onAnimationCancel(android.animation.Animator animator) {
        this.b.setAlpha(1.0f);
    }

    public final void onAnimationEnd(android.animation.Animator animator) {
        this.c.setListener(null);
        this.d.e(this.a);
        this.d.d.remove(this.a);
        this.d.c();
    }
}
