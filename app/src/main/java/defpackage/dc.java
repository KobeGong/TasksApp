package defpackage;

import android.animation.ValueAnimator;

/* access modifiers changed from: package-private */
/* renamed from: dc  reason: default package */
/* compiled from: PG */
public final class dc implements ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ db a;

    dc(db dbVar) {
        this.a = dbVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
