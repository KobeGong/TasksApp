package org.chromium.base;

import android.os.SystemClock;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
public class EarlyTraceEvent {
    public static final Object a = new Object();
    public static volatile int b = 0;

    private static native void nativeRecordEarlyEvent(String str, long j, long j2, int i, long j3);

    private static native void nativeRecordEarlyFinishAsyncEvent(String str, long j, long j2);

    private static native void nativeRecordEarlyStartAsyncEvent(String str, long j, long j2);

    public static boolean a() {
        int i = b;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    static boolean b() {
        return b == 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        throw new java.lang.IllegalArgumentException("Multiple pending trace events can't have the same name");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r3) {
        /*
            boolean r0 = b()
            if (r0 != 0) goto L_0x0007
        L_0x0006:
            return
        L_0x0007:
            ego r0 = new ego
            r0.<init>(r3)
            java.lang.Object r1 = org.chromium.base.EarlyTraceEvent.a
            monitor-enter(r1)
            boolean r2 = b()     // Catch:{ all -> 0x0017 }
            if (r2 != 0) goto L_0x001a
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            goto L_0x0006
        L_0x0017:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            throw r0
        L_0x001a:
            r2 = 0
            java.lang.Object r0 = r2.put(r3, r0)
            ego r0 = (defpackage.ego) r0
            monitor-exit(r1)
            if (r0 == 0) goto L_0x0006
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Multiple pending trace events can't have the same name"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.EarlyTraceEvent.a(java.lang.String):void");
    }

    public static void b(String str) {
        if (a()) {
            synchronized (a) {
                if (a()) {
                    Map map = null;
                    ego ego = (ego) map.remove(str);
                    if (ego != null) {
                        ego.e = ego.a();
                        ego.f = SystemClock.currentThreadTimeMillis();
                        List list = null;
                        list.add(ego);
                        if (b == 2) {
                            c();
                        }
                    }
                }
            }
        }
    }

    static void c() {
        List list = null;
        if (!list.isEmpty()) {
            long nativeGetTimeTicksNowUs = (TimeUtils.nativeGetTimeTicksNowUs() * 1000) - ego.a();
            List<ego> list2 = null;
            for (ego ego : list2) {
                nativeRecordEarlyEvent(ego.a, ego.c + nativeGetTimeTicksNowUs, ego.e + nativeGetTimeTicksNowUs, ego.b, ego.f - ego.d);
            }
            List list3 = null;
            list3.clear();
        }
        List list4 = null;
        if (!list4.isEmpty()) {
            long nativeGetTimeTicksNowUs2 = (TimeUtils.nativeGetTimeTicksNowUs() * 1000) - ego.a();
            List<egn> list5 = null;
            for (egn egn : list5) {
                if (egn.a) {
                    nativeRecordEarlyStartAsyncEvent(egn.b, egn.c, egn.d + nativeGetTimeTicksNowUs2);
                } else {
                    nativeRecordEarlyFinishAsyncEvent(egn.b, egn.c, egn.d + nativeGetTimeTicksNowUs2);
                }
            }
            List list6 = null;
            list6.clear();
        }
        Map map = null;
        if (map.isEmpty()) {
            b = 3;
        }
    }
}
