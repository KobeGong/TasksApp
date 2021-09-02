package defpackage;

/* renamed from: aia reason: default package */
/* compiled from: PG */
final class aia implements android.view.animation.Interpolator {
    aia() {
    }

    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
