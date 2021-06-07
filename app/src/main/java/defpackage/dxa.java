package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* access modifiers changed from: package-private */
/* renamed from: dxa  reason: default package */
/* compiled from: PG */
public final class dxa extends WeakReference {
    private static final boolean a = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));
    private static final RuntimeException b;
    private final ReferenceQueue c;
    private final ConcurrentMap d;
    private final dnc e;
    private final Reference f;
    private volatile boolean g;
    private volatile boolean h;

    dxa(dwz dwz, dnc dnc, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(dwz, referenceQueue);
        RuntimeException runtimeException;
        if (a) {
            runtimeException = new RuntimeException("ManagedChannel allocation site");
        } else {
            runtimeException = b;
        }
        this.f = new SoftReference(runtimeException);
        this.e = dnc;
        this.c = referenceQueue;
        this.d = concurrentMap;
        this.d.put(this, this);
        a(referenceQueue);
    }

    public final void clear() {
        a();
        a(this.c);
    }

    private final void a() {
        super.clear();
        this.d.remove(this);
        this.f.clear();
    }

    private static int a(ReferenceQueue referenceQueue) {
        int i = 0;
        while (true) {
            dxa dxa = (dxa) referenceQueue.poll();
            if (dxa == null) {
                return i;
            }
            RuntimeException runtimeException = (RuntimeException) dxa.f.get();
            dxa.a();
            boolean z = dxa.g;
            i++;
            boolean z2 = dxa.h;
            Level level = Level.SEVERE;
            if (dwz.a.isLoggable(level)) {
                boolean z3 = dxa.g;
                String property = System.getProperty("line.separator");
                LogRecord logRecord = new LogRecord(level, new StringBuilder(String.valueOf("shutdown").length() + 140 + String.valueOf(property).length()).append("*~*~*~ Channel {0} was not ").append("shutdown").append(" properly!!! ~*~*~*").append(property).append("    Make sure to call shutdown()/shutdownNow() and wait until awaitTermination() returns true.").toString());
                logRecord.setLoggerName(dwz.a.getName());
                logRecord.setParameters(new Object[]{dxa.e.toString()});
                logRecord.setThrown(runtimeException);
                dwz.a.log(logRecord);
            }
        }
    }

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        b = runtimeException;
    }
}
