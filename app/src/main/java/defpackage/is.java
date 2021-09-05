package defpackage;

/* renamed from: is reason: default package */
/* compiled from: PG */
final class is extends android.animation.AnimatorListenerAdapter {
    private final android.view.View a;
    private boolean b = false;

    is(android.view.View view) {
        this.a = view;
    }

    public final void onAnimationStart(android.animation.Animator animator) {
        if (ViewCompat.a.i(this.a) && this.a.getLayerType() == 0) {
            this.b = true;
            this.a.setLayerType(2, null);
        }
    }

    public final void onAnimationEnd(android.animation.Animator animator) {
        defpackage.kb.a(this.a, 1.0f);
        if (this.b) {
            this.a.setLayerType(0, null);
        }
    }
}
