package defpackage;

/* renamed from: ehg reason: default package */
/* compiled from: PG */
public final class ehg extends defpackage.ehf implements android.os.MessageQueue.IdleHandler {
    private long a;
    private long b;
    private int c;
    private int d;
    private int e;
    private boolean f;

    ehg() {
    }

    private final void a() {
        if (org.chromium.base.TraceEvent.a && !this.f) {
            this.a = android.os.SystemClock.elapsedRealtime();
            android.os.Looper.myQueue().addIdleHandler(this);
            this.f = true;
        } else if (this.f && !org.chromium.base.TraceEvent.a) {
            android.os.Looper.myQueue().removeIdleHandler(this);
            this.f = false;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(java.lang.String str) {
        if (this.e == 0) {
            org.chromium.base.TraceEvent.a("Looper.queueIdle");
        }
        this.b = android.os.SystemClock.elapsedRealtime();
        a();
        super.a(str);
    }

    /* access modifiers changed from: 0000 */
    public final void b(java.lang.String str) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.b;
        if (elapsedRealtime > 16) {
            a(5, "observed a task that took " + elapsedRealtime + "ms: " + str);
        }
        super.b(str);
        a();
        this.c++;
        this.e++;
    }

    private static void a(int i, java.lang.String str) {
        org.chromium.base.TraceEvent.a("TraceEvent.LooperMonitor:IdleStats", str);
        android.util.Log.println(i, "TraceEvent.LooperMonitor", str);
    }

    public final boolean queueIdle() {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (this.a == 0) {
            this.a = elapsedRealtime;
        }
        long j = elapsedRealtime - this.a;
        this.d++;
        org.chromium.base.TraceEvent.b("Looper.queueIdle", this.e + " tasks since last idle.");
        if (j > 48) {
            a(3, this.c + " tasks and " + this.d + " idles processed so far, " + this.e + " tasks bursted and " + j + "ms elapsed since last idle");
        }
        this.a = elapsedRealtime;
        this.e = 0;
        return true;
    }
}
