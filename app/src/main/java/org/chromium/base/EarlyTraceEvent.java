package org.chromium.base;

/* compiled from: PG */
public class EarlyTraceEvent {
    public static final java.lang.Object a = new java.lang.Object();
    public static volatile int b = 0;

    private static native void nativeRecordEarlyEvent(java.lang.String str, long j, long j2, int i, long j3);

    private static native void nativeRecordEarlyFinishAsyncEvent(java.lang.String str, long j, long j2);

    private static native void nativeRecordEarlyStartAsyncEvent(java.lang.String str, long j, long j2);

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

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0022, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        throw new java.lang.IllegalArgumentException("Multiple pending trace events can't have the same name");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
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
            java.lang.Object r1 = a
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
            java.lang.Object r0 = r2.put(r3, r0)     // Catch:{ all -> 0x0017 }
            ego r0 = (defpackage.ego) r0     // Catch:{ all -> 0x0017 }
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0006
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Multiple pending trace events can't have the same name"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.EarlyTraceEvent.a(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(java.lang.String r4) {
        /*
            boolean r0 = a()
            if (r0 != 0) goto L_0x0007
        L_0x0006:
            return
        L_0x0007:
            java.lang.Object r1 = a
            monitor-enter(r1)
            boolean r0 = a()     // Catch:{ all -> 0x0012 }
            if (r0 != 0) goto L_0x0015
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            goto L_0x0006
        L_0x0012:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            throw r0
        L_0x0015:
            r0 = 0
            java.lang.Object r0 = r0.remove(r4)     // Catch:{ all -> 0x0012 }
            ego r0 = (defpackage.ego) r0     // Catch:{ all -> 0x0012 }
            if (r0 != 0) goto L_0x0020
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            goto L_0x0006
        L_0x0020:
            long r2 = defpackage.ego.a()     // Catch:{ all -> 0x0012 }
            r0.e = r2     // Catch:{ all -> 0x0012 }
            long r2 = android.os.SystemClock.currentThreadTimeMillis()     // Catch:{ all -> 0x0012 }
            r0.f = r2     // Catch:{ all -> 0x0012 }
            r2 = 0
            r2.add(r0)     // Catch:{ all -> 0x0012 }
            int r0 = b     // Catch:{ all -> 0x0012 }
            r2 = 2
            if (r0 != r2) goto L_0x0038
            c()     // Catch:{ all -> 0x0012 }
        L_0x0038:
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.EarlyTraceEvent.b(java.lang.String):void");
    }

    static void c() {
        java.util.List list = null;
        if (!list.isEmpty()) {
            long nativeGetTimeTicksNowUs = (org.chromium.base.TimeUtils.nativeGetTimeTicksNowUs() * 1000) - defpackage.ego.a();
            java.util.List<defpackage.ego> list2 = null;
            for (defpackage.ego ego : list2) {
                nativeRecordEarlyEvent(ego.a, ego.c + nativeGetTimeTicksNowUs, ego.e + nativeGetTimeTicksNowUs, ego.b, ego.f - ego.d);
            }
            java.util.List list3 = null;
            list3.clear();
        }
        java.util.List list4 = null;
        if (!list4.isEmpty()) {
            long nativeGetTimeTicksNowUs2 = (org.chromium.base.TimeUtils.nativeGetTimeTicksNowUs() * 1000) - defpackage.ego.a();
            java.util.List<defpackage.egn> list5 = null;
            for (defpackage.egn egn : list5) {
                if (egn.a) {
                    nativeRecordEarlyStartAsyncEvent(egn.b, egn.c, egn.d + nativeGetTimeTicksNowUs2);
                } else {
                    nativeRecordEarlyFinishAsyncEvent(egn.b, egn.c, egn.d + nativeGetTimeTicksNowUs2);
                }
            }
            java.util.List list6 = null;
            list6.clear();
        }
        java.util.Map map = null;
        if (map.isEmpty()) {
            b = 3;
        }
    }
}
