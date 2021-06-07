package defpackage;

import android.animation.ValueAnimator;

/* access modifiers changed from: package-private */
/* renamed from: ud  reason: default package */
/* compiled from: PG */
public final class ud implements ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ uf a;
    private final /* synthetic */ uc b;

    ud(uc ucVar, uf ufVar) {
        this.b = ucVar;
        this.a = ufVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        float interpolation;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        uc.a(floatValue, this.a);
        uc ucVar = this.b;
        uf ufVar = this.a;
        if (ucVar.f) {
            uc.a(floatValue, ufVar);
            ufVar.e = ufVar.j + (((ufVar.k - 0.01f) - ufVar.j) * floatValue);
            ufVar.f = ufVar.k;
            ufVar.g = ((((float) (Math.floor((double) (ufVar.l / 0.8f)) + 1.0d)) - ufVar.l) * floatValue) + ufVar.l;
        } else if (floatValue != 1.0f) {
            float f2 = ufVar.l;
            if (floatValue < 0.5f) {
                interpolation = ufVar.j;
                f = (uc.a.getInterpolation(floatValue / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                f = ufVar.j + 0.79f;
                interpolation = f - (((1.0f - uc.a.getInterpolation((floatValue - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
            }
            ufVar.e = interpolation;
            ufVar.f = f;
            ufVar.g = f2 + (0.20999998f * floatValue);
            ucVar.c = (floatValue + ucVar.e) * 216.0f;
        }
        this.b.invalidateSelf();
    }
}
