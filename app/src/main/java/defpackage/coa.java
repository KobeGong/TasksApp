package defpackage;

import android.os.SystemClock;
import java.util.Random;

/* renamed from: coa  reason: default package */
/* compiled from: PG */
public final class coa {
    public final float a;
    public final Random b;

    public coa(float f) {
        this(f, new Random(SystemClock.elapsedRealtime()));
    }

    private coa(float f, Random random) {
        cky.a(f > 0.0f && f <= 1.0f, "Sampling rate should be a floating number > 0 and <= 1.");
        this.a = f;
        this.b = random;
    }
}
