package defpackage;

/* renamed from: ego reason: default package */
/* compiled from: PG */
public final class ego {
    public final java.lang.String a;
    public final int b = android.os.Process.myTid();
    public final long c = a();
    public final long d = android.os.SystemClock.currentThreadTimeMillis();
    public long e;
    public long f;

    public ego(java.lang.String str) {
        this.a = str;
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static long a() {
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            return android.os.SystemClock.elapsedRealtimeNanos();
        }
        return android.os.SystemClock.elapsedRealtime() * 1000000;
    }
}
