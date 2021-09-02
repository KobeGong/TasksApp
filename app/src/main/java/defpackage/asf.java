package defpackage;

/* renamed from: asf reason: default package */
final /* synthetic */ class asf implements android.animation.ValueAnimator.AnimatorUpdateListener {
    private final AddTaskFragment a;

    asf(AddTaskFragment arx) {
        this.a = arx;
    }

    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        AddTaskFragment arx = this.a;
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        arx.W.setRotation((float) ((int) (45.0f * floatValue)));
        arx.W.setColorFilter(android.graphics.Color.argb((int) ((1.0f - floatValue) * 255.0f), android.graphics.Color.red(arx.Z), android.graphics.Color.green(arx.Z), android.graphics.Color.blue(arx.Z)));
    }
}
