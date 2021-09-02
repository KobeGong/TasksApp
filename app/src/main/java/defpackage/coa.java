package defpackage;

/* renamed from: coa reason: default package */
/* compiled from: PG */
public final class coa {
    public final float a;
    public final java.util.Random b;

    public coa(float f) {
        this(f, new java.util.Random(android.os.SystemClock.elapsedRealtime()));
    }

    private coa(float f, java.util.Random random) {
        defpackage.cky.a(f > 0.0f && f <= 1.0f, (java.lang.Object) "Sampling rate should be a floating number > 0 and <= 1.");
        this.a = f;
        this.b = random;
    }
}
