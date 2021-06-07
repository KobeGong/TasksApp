package defpackage;

import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.util.Log;
import org.chromium.base.TraceEvent;

/* renamed from: ehg  reason: default package */
/* compiled from: PG */
public final class ehg extends ehf implements MessageQueue.IdleHandler {
    private long a;
    private long b;
    private int c;
    private int d;
    private int e;
    private boolean f;

    ehg() {
    }

    private final void a() {
        if (TraceEvent.a && !this.f) {
            this.a = SystemClock.elapsedRealtime();
            Looper.myQueue().addIdleHandler(this);
            this.f = true;
        } else if (this.f && !TraceEvent.a) {
            Looper.myQueue().removeIdleHandler(this);
            this.f = false;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.ehf
    public final void a(String str) {
        if (this.e == 0) {
            TraceEvent.a("Looper.queueIdle");
        }
        this.b = SystemClock.elapsedRealtime();
        a();
        super.a(str);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.ehf
    public final void b(String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
        if (elapsedRealtime > 16) {
            a(5, "observed a task that took " + elapsedRealtime + "ms: " + str);
        }
        super.b(str);
        a();
        this.c++;
        this.e++;
    }

    private static void a(int i, String str) {
        TraceEvent.a("TraceEvent.LooperMonitor:IdleStats", str);
        Log.println(i, "TraceEvent.LooperMonitor", str);
    }

    public final boolean queueIdle() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.a == 0) {
            this.a = elapsedRealtime;
        }
        long j = elapsedRealtime - this.a;
        this.d++;
        TraceEvent.b("Looper.queueIdle", this.e + " tasks since last idle.");
        if (j > 48) {
            a(3, this.c + " tasks and " + this.d + " idles processed so far, " + this.e + " tasks bursted and " + j + "ms elapsed since last idle");
        }
        this.a = elapsedRealtime;
        this.e = 0;
        return true;
    }
}
