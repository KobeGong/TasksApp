package defpackage;

import android.os.SystemClock;

/* renamed from: cnz  reason: default package */
/* compiled from: PG */
public final class cnz {
    public final Object a = new Object();
    public int b = 0;
    public long c = 0;
    private final int d;

    public cnz(int i) {
        this.d = i;
    }

    public final boolean a() {
        boolean z = false;
        synchronized (this.a) {
            if (SystemClock.elapsedRealtime() - this.c <= 1000) {
                if (this.b >= this.d) {
                    z = true;
                }
            }
        }
        return z;
    }
}
