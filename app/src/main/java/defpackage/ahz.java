package defpackage;

import android.view.animation.Interpolator;

/* renamed from: ahz  reason: default package */
/* compiled from: PG */
final class ahz implements Interpolator {
    ahz() {
    }

    public final float getInterpolation(float f) {
        return f * f * f * f * f;
    }
}
