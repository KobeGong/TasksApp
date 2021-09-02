package defpackage;

/* renamed from: aes reason: default package */
/* compiled from: PG */
public final class aes implements android.view.animation.Interpolator {
    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
