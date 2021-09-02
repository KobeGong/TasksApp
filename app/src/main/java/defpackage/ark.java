package defpackage;

/* renamed from: ark reason: default package */
/* compiled from: PG */
final class ark extends android.animation.AnimatorListenerAdapter {
    private final /* synthetic */ defpackage.ard a;

    ark(defpackage.ard ard) {
        this.a = ard;
    }

    public final void onAnimationEnd(android.animation.Animator animator) {
        this.a.d();
    }
}
