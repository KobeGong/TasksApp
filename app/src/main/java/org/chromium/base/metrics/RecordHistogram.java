package org.chromium.base.metrics;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
public class RecordHistogram {
    private static Map a = Collections.synchronizedMap(new HashMap());

    private static native int nativeGetHistogramTotalCountForTesting(String str);

    private static native int nativeGetHistogramValueCountForTesting(String str, int i);

    private static native long nativeRecordBooleanHistogram(String str, long j, boolean z);

    private static native long nativeRecordCustomCountHistogram(String str, long j, int i, int i2, int i3, int i4);

    private static native long nativeRecordCustomTimesHistogramMilliseconds(String str, long j, int i, int i2, int i3, int i4);

    private static native long nativeRecordEnumeratedHistogram(String str, long j, int i, int i2);

    private static native long nativeRecordLinearCountHistogram(String str, long j, int i, int i2, int i3, int i4);

    private static native long nativeRecordSparseHistogram(String str, long j, int i);

    private static long a(String str) {
        Long l = (Long) a.get(str);
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    public static void a(String str, boolean z) {
        long a2 = a(str);
        long nativeRecordBooleanHistogram = nativeRecordBooleanHistogram(str, a2, z);
        if (nativeRecordBooleanHistogram != a2) {
            a.put(str, Long.valueOf(nativeRecordBooleanHistogram));
        }
    }

    public static void a(String str, long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j);
        long millis2 = TimeUnit.SECONDS.toMillis(10);
        long a2 = a(str);
        long nativeRecordCustomTimesHistogramMilliseconds = nativeRecordCustomTimesHistogramMilliseconds(str, a2, a(millis), a(1), a(millis2), 50);
        if (nativeRecordCustomTimesHistogramMilliseconds != a2) {
            a.put(str, Long.valueOf(nativeRecordCustomTimesHistogramMilliseconds));
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
