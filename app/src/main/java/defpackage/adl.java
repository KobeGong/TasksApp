package defpackage;

import android.animation.ValueAnimator;

/* access modifiers changed from: package-private */
/* renamed from: adl  reason: default package */
/* compiled from: PG */
public final class adl implements ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ adh a;

    adl(adh adh) {
        this.a = adh;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        this.a.b.setAlpha(floatValue);
        this.a.c.setAlpha(floatValue);
        this.a.j.invalidate();
    }
}
