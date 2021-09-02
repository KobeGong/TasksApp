package defpackage;

/* renamed from: lx reason: default package */
/* compiled from: PG */
class lx implements android.view.animation.Animation.AnimationListener {
    private final android.view.animation.Animation.AnimationListener a;

    lx(android.view.animation.Animation.AnimationListener animationListener) {
        this.a = animationListener;
    }

    public void onAnimationStart(android.view.animation.Animation animation) {
        if (this.a != null) {
            this.a.onAnimationStart(animation);
        }
    }

    public void onAnimationEnd(android.view.animation.Animation animation) {
        if (this.a != null) {
            this.a.onAnimationEnd(animation);
        }
    }

    public void onAnimationRepeat(android.view.animation.Animation animation) {
        if (this.a != null) {
            this.a.onAnimationRepeat(animation);
        }
    }
}
