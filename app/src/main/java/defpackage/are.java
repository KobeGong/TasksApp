package defpackage;

/* renamed from: are reason: default package */
final /* synthetic */ class are implements android.animation.ValueAnimator.AnimatorUpdateListener {
    private final defpackage.ard a;
    private final android.view.animation.DecelerateInterpolator b;

    are(defpackage.ard ard, android.view.animation.DecelerateInterpolator decelerateInterpolator) {
        this.a = ard;
        this.b = decelerateInterpolator;
    }

    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        defpackage.ard ard = this.a;
        android.view.animation.DecelerateInterpolator decelerateInterpolator = this.b;
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        ard.d.setAlpha(floatValue);
        float interpolation = (decelerateInterpolator.getInterpolation(floatValue) * 0.19999999f) + 0.8f;
        ard.d.setScaleX(interpolation);
        ard.d.setScaleY(interpolation);
    }
}
