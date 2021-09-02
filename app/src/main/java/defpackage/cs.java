package defpackage;

/* renamed from: cs reason: default package */
/* compiled from: PG */
public final class cs {
    public static final android.animation.TimeInterpolator a = new defpackage.tt();
    public static final android.animation.TimeInterpolator b = new defpackage.ts();
    public static final android.animation.TimeInterpolator c = new defpackage.tu();
    public static final android.animation.TimeInterpolator d = new android.view.animation.DecelerateInterpolator();

    public static float a(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    static {
        new android.view.animation.LinearInterpolator();
    }
}
