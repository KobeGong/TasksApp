package org.chromium.base.metrics;

/* compiled from: PG */
public class RecordHistogram {
    private static java.util.Map a = java.util.Collections.synchronizedMap(new java.util.HashMap());

    private static native int nativeGetHistogramTotalCountForTesting(java.lang.String str);

    private static native int nativeGetHistogramValueCountForTesting(java.lang.String str, int i);

    private static native long nativeRecordBooleanHistogram(java.lang.String str, long j, boolean z);

    private static native long nativeRecordCustomCountHistogram(java.lang.String str, long j, int i, int i2, int i3, int i4);

    private static native long nativeRecordCustomTimesHistogramMilliseconds(java.lang.String str, long j, int i, int i2, int i3, int i4);

    private static native long nativeRecordEnumeratedHistogram(java.lang.String str, long j, int i, int i2);

    private static native long nativeRecordLinearCountHistogram(java.lang.String str, long j, int i, int i2, int i3, int i4);

    private static native long nativeRecordSparseHistogram(java.lang.String str, long j, int i);

    private static long a(java.lang.String str) {
        java.lang.Long l = (java.lang.Long) a.get(str);
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    public static void a(java.lang.String str, boolean z) {
        long a2 = a(str);
        long nativeRecordBooleanHistogram = nativeRecordBooleanHistogram(str, a2, z);
        if (nativeRecordBooleanHistogram != a2) {
            a.put(str, java.lang.Long.valueOf(nativeRecordBooleanHistogram));
        }
    }

    public static void a(java.lang.String str, long j, java.util.concurrent.TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j);
        long millis2 = java.util.concurrent.TimeUnit.SECONDS.toMillis(10);
        long a2 = a(str);
        long nativeRecordCustomTimesHistogramMilliseconds = nativeRecordCustomTimesHistogramMilliseconds(str, a2, a(millis), a(1), a(millis2), 50);
        if (nativeRecordCustomTimesHistogramMilliseconds != a2) {
            a.put(str, java.lang.Long.valueOf(nativeRecordCustomTimesHistogramMilliseconds));
        }
    }

    private static int a(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }
}
