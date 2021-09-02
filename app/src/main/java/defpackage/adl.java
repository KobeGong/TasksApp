package defpackage;

/* renamed from: adl reason: default package */
/* compiled from: PG */
final class adl implements android.animation.ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ defpackage.adh a;

    adl(defpackage.adh adh) {
        this.a = adh;
    }

    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int floatValue = (int) (((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        this.a.b.setAlpha(floatValue);
        this.a.c.setAlpha(floatValue);
        this.a.j.invalidate();
    }
}
