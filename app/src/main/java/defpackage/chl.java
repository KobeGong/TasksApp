package defpackage;

import android.os.Debug;

/* access modifiers changed from: package-private */
/* renamed from: chl  reason: default package */
/* compiled from: PG */
public final class chl {
    public final long a;
    public final long b;

    chl(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    static chl a() {
        return new chl(System.nanoTime(), Debug.threadCpuTimeNanos());
    }
}
