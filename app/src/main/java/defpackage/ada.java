package defpackage;

/* renamed from: ada reason: default package */
/* compiled from: PG */
final class ada extends android.animation.AnimatorListenerAdapter {
    private final /* synthetic */ defpackage.adb a;
    private final /* synthetic */ android.view.ViewPropertyAnimator b;
    private final /* synthetic */ android.view.View c;
    private final /* synthetic */ defpackage.acs d;

    ada(defpackage.acs acs, defpackage.adb adb, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
        this.d = acs;
        this.a = adb;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    public final void onAnimationStart(android.animation.Animator animator) {
    }

    public final void onAnimationEnd(android.animation.Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        this.c.setTranslationX(0.0f);
        this.c.setTranslationY(0.0f);
        this.d.e(this.a.b);
        this.d.g.remove(this.a.b);
        this.d.c();
    }
}
