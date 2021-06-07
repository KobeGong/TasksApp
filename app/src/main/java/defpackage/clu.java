package defpackage;

import android.os.SystemClock;

/* renamed from: clu  reason: default package */
/* compiled from: PG */
public final class clu {
    public final long a;
    public long b;
    public int c;

    clu() {
        this(SystemClock.elapsedRealtime());
    }

    private clu(long j) {
        this.b = -1;
        this.c = bg.ab;
        this.a = j;
    }

    clu(long j, long j2) {
        boolean z;
        this.b = -1;
        this.c = bg.ab;
        if (j2 >= j) {
            z = true;
        } else {
            z = false;
        }
        Object[] objArr = {Long.valueOf(j2), Long.valueOf(j)};
        if (!z) {
            throw new IllegalArgumentException(cky.a("End time %s is before start time %s.", objArr));
        }
        this.a = j;
        this.b = j2;
    }

    static {
        new clu();
    }
}
