package defpackage;

/* renamed from: cnx reason: default package */
/* compiled from: PG */
public class cnx {
    private static volatile android.app.ActivityManager a = null;

    public static android.app.ActivityManager a(android.content.Context context) {
        if (a == null) {
            synchronized (defpackage.cnx.class) {
                if (a == null) {
                    a = (android.app.ActivityManager) context.getSystemService("activity");
                }
            }
        }
        return a;
    }

    public static boolean b(android.content.Context context) {
        boolean z;
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.contains(context.getPackageName())) {
                    if (android.os.Build.VERSION.SDK_INT < 23) {
                        z = c(context);
                    } else {
                        z = true;
                    }
                    if (z) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @android.annotation.TargetApi(20)
    public static boolean c(android.content.Context context) {
        android.os.PowerManager powerManager = (android.os.PowerManager) context.getSystemService("power");
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            return powerManager.isInteractive();
        }
        return powerManager.isScreenOn();
    }

    public static java.lang.String d(android.content.Context context) {
        java.lang.String packageName = context.getPackageName();
        java.lang.String a2 = a(android.os.Process.myPid());
        if (a2 == null || packageName == null || !a2.startsWith(packageName)) {
            return a2;
        }
        int length = packageName.length();
        if (a2.length() == length) {
            return null;
        }
        return a2.substring(length + 1);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047 A[SYNTHETIC, Splitter:B:19:0x0047] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(int r6) {
        /*
            r0 = 0
            if (r6 > 0) goto L_0x0004
        L_0x0003:
            return r0
        L_0x0004:
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0037, all -> 0x0041 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ IOException -> 0x0037, all -> 0x0041 }
            r3 = 25
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0037, all -> 0x0041 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0037, all -> 0x0041 }
            java.lang.String r3 = "/proc/"
            java.lang.StringBuilder r3 = r4.append(r3)     // Catch:{ IOException -> 0x0037, all -> 0x0041 }
            java.lang.StringBuilder r3 = r3.append(r6)     // Catch:{ IOException -> 0x0037, all -> 0x0041 }
            java.lang.String r4 = "/cmdline"
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch:{ IOException -> 0x0037, all -> 0x0041 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0037, all -> 0x0041 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0037, all -> 0x0041 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0037, all -> 0x0041 }
            java.lang.String r2 = r1.readLine()     // Catch:{ IOException -> 0x004f, all -> 0x004d }
            java.lang.String r0 = r2.trim()     // Catch:{ IOException -> 0x004f, all -> 0x004d }
            r1.close()     // Catch:{ IOException -> 0x0035 }
            goto L_0x0003
        L_0x0035:
            r1 = move-exception
            goto L_0x0003
        L_0x0037:
            r1 = move-exception
            r1 = r0
        L_0x0039:
            if (r1 == 0) goto L_0x0003
            r1.close()     // Catch:{ IOException -> 0x003f }
            goto L_0x0003
        L_0x003f:
            r1 = move-exception
            goto L_0x0003
        L_0x0041:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x0045:
            if (r1 == 0) goto L_0x004a
            r1.close()     // Catch:{ IOException -> 0x004b }
        L_0x004a:
            throw r0
        L_0x004b:
            r1 = move-exception
            goto L_0x004a
        L_0x004d:
            r0 = move-exception
            goto L_0x0045
        L_0x004f:
            r2 = move-exception
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnx.a(int):java.lang.String");
    }
}
