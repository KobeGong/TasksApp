package defpackage;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;

/* access modifiers changed from: package-private */
/* renamed from: are  reason: default package */
public final /* synthetic */ class are implements ValueAnimator.AnimatorUpdateListener {
    private final ard a;
    private final DecelerateInterpolator b;

    are(ard ard, DecelerateInterpolator decelerateInterpolator) {
        this.a = ard;
        this.b = decelerateInterpolator;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ard ard = this.a;
        DecelerateInterpolator decelerateInterpolator = this.b;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ard.d.setAlpha(floatValue);
        float interpolation = (decelerateInterpolator.getInterpolation(floatValue) * 0.19999999f) + 0.8f;
        ard.d.setScaleX(interpolation);
        ard.d.setScaleY(interpolation);
    }
}
