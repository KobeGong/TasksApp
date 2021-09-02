package defpackage;

/* renamed from: vw reason: default package */
/* compiled from: PG */
final class vw implements android.view.animation.Interpolator {
    vw() {
    }

    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
