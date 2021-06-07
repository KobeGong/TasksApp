package defpackage;

import android.view.animation.Interpolator;

/* renamed from: aia  reason: default package */
/* compiled from: PG */
final class aia implements Interpolator {
    aia() {
    }

    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
