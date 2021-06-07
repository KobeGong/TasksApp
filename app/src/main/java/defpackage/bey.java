package defpackage;

import android.os.SystemClock;

/* renamed from: bey  reason: default package */
/* compiled from: PG */
public final class bey implements bex {
    public static bey a = new bey();

    @Override // defpackage.bex
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // defpackage.bex
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    private bey() {
    }
}
