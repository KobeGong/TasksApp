package defpackage;

import android.animation.ValueAnimator;
import android.support.design.bottomappbar.BottomAppBar;

/* renamed from: ds  reason: default package */
/* compiled from: PG */
final class ds implements ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ BottomAppBar a;

    ds(BottomAppBar bottomAppBar) {
        this.a = bottomAppBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
