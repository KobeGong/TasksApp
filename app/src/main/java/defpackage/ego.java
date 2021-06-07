package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;

/* renamed from: ego  reason: default package */
/* compiled from: PG */
public final class ego {
    public final String a;
    public final int b = Process.myTid();
    public final long c = a();
    public final long d = SystemClock.currentThreadTimeMillis();
    public long e;
    public long f;

    public ego(String str) {
        this.a = str;
    }

    @SuppressLint({"NewApi"})
    public static long a() {
        if (Build.VERSION.SDK_INT >= 17) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return SystemClock.elapsedRealtime() * 1000000;
    }
}
