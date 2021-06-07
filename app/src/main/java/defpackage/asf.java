package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Color;

/* renamed from: asf  reason: default package */
final /* synthetic */ class asf implements ValueAnimator.AnimatorUpdateListener {
    private final arx a;

    asf(arx arx) {
        this.a = arx;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        arx arx = this.a;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        arx.W.setRotation((float) ((int) (45.0f * floatValue)));
        arx.W.setColorFilter(Color.argb((int) ((1.0f - floatValue) * 255.0f), Color.red(arx.Z), Color.green(arx.Z), Color.blue(arx.Z)));
    }
}
