package defpackage;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: cs  reason: default package */
/* compiled from: PG */
public final class cs {
    public static final TimeInterpolator a = new tt();
    public static final TimeInterpolator b = new ts();
    public static final TimeInterpolator c = new tu();
    public static final TimeInterpolator d = new DecelerateInterpolator();

    public static float a(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    static {
        new LinearInterpolator();
    }
}
