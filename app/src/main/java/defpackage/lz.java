package defpackage;

/* renamed from: lz reason: default package */
/* compiled from: PG */
final class lz extends android.animation.AnimatorListenerAdapter {
    private android.view.View a;

    lz(android.view.View view) {
        this.a = view;
    }

    public final void onAnimationStart(android.animation.Animator animator) {
        this.a.setLayerType(2, null);
    }

    public final void onAnimationEnd(android.animation.Animator animator) {
        this.a.setLayerType(0, null);
        animator.removeListener(this);
    }
}
