package defpackage;

import android.animation.ValueAnimator;

/* access modifiers changed from: package-private */
/* renamed from: aid  reason: default package */
/* compiled from: PG */
public final class aid implements ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ aic a;

    aid(aic aic) {
        this.a = aic;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.m = valueAnimator.getAnimatedFraction();
    }
}
