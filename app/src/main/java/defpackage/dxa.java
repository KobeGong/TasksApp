package defpackage;

/* renamed from: dxa reason: default package */
/* compiled from: PG */
final class dxa extends java.lang.ref.WeakReference {
    private static final boolean a = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));
    private static final java.lang.RuntimeException b;
    private final java.lang.ref.ReferenceQueue c;
    private final java.util.concurrent.ConcurrentMap d;
    private final defpackage.dnc e;
    private final java.lang.ref.Reference f;
    private volatile boolean g;
    private volatile boolean h;

    dxa(defpackage.dwz dwz, defpackage.dnc dnc, java.lang.ref.ReferenceQueue referenceQueue, java.util.concurrent.ConcurrentMap concurrentMap) {
        java.lang.RuntimeException runtimeException;
        super(dwz, referenceQueue);
        if (a) {
            runtimeException = new java.lang.RuntimeException("ManagedChannel allocation site");
        } else {
            runtimeException = b;
        }
        this.f = new java.lang.ref.SoftReference(runtimeException);
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

    private static int a(java.lang.ref.ReferenceQueue referenceQueue) {
        int i = 0;
        while (true) {
            defpackage.dxa dxa = (defpackage.dxa) referenceQueue.poll();
            if (dxa == null) {
                return i;
            }
            java.lang.RuntimeException runtimeException = (java.lang.RuntimeException) dxa.f.get();
            dxa.a();
            boolean z = dxa.g;
            i++;
            boolean z2 = dxa.h;
            java.util.logging.Level level = java.util.logging.Level.SEVERE;
            if (defpackage.dwz.a.isLoggable(level)) {
                boolean z3 = dxa.g;
                java.lang.String str = "shutdown";
                java.lang.String property = java.lang.System.getProperty("line.separator");
                java.util.logging.LogRecord logRecord = new java.util.logging.LogRecord(level, new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 140 + java.lang.String.valueOf(property).length()).append("*~*~*~ Channel {0} was not ").append(str).append(" properly!!! ~*~*~*").append(property).append("    Make sure to call shutdown()/shutdownNow() and wait until awaitTermination() returns true.").toString());
                logRecord.setLoggerName(defpackage.dwz.a.getName());
                logRecord.setParameters(new java.lang.Object[]{dxa.e.toString()});
                logRecord.setThrown(runtimeException);
                defpackage.dwz.a.log(logRecord);
            }
        }
    }

    static {
        java.lang.RuntimeException runtimeException = new java.lang.RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new java.lang.StackTraceElement[0]);
        b = runtimeException;
    }
}
