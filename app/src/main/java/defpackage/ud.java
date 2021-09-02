package defpackage;

/* renamed from: ud reason: default package */
/* compiled from: PG */
final class ud implements android.animation.ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ defpackage.uf a;
    private final /* synthetic */ defpackage.uc b;

    ud(defpackage.uc ucVar, defpackage.uf ufVar) {
        this.b = ucVar;
        this.a = ufVar;
    }

    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float f;
        float interpolation;
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        defpackage.uc.a(floatValue, this.a);
        defpackage.uc ucVar = this.b;
        defpackage.uf ufVar = this.a;
        if (ucVar.f) {
            defpackage.uc.a(floatValue, ufVar);
            float floor = (float) (java.lang.Math.floor((double) (ufVar.l / 0.8f)) + 1.0d);
            ufVar.e = ufVar.j + (((ufVar.k - 0.01f) - ufVar.j) * floatValue);
            ufVar.f = ufVar.k;
            ufVar.g = ((floor - ufVar.l) * floatValue) + ufVar.l;
        } else if (floatValue != 1.0f) {
            float f2 = ufVar.l;
            if (floatValue < 0.5f) {
                float f3 = floatValue / 0.5f;
                interpolation = ufVar.j;
                f = (defpackage.uc.a.getInterpolation(f3) * 0.79f) + 0.01f + interpolation;
            } else {
                f = ufVar.j + 0.79f;
                interpolation = f - (((1.0f - defpackage.uc.a.getInterpolation((floatValue - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
            }
            float f4 = f2 + (0.20999998f * floatValue);
            float f5 = (floatValue + ucVar.e) * 216.0f;
            ufVar.e = interpolation;
            ufVar.f = f;
            ufVar.g = f4;
            ucVar.c = f5;
        }
        this.b.invalidateSelf();
    }
}
