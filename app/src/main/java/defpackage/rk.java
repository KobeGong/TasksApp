package defpackage;

/* renamed from: rk reason: default package */
/* compiled from: PG */
public final class rk {
    private static final java.lang.Object a = new java.lang.Object();
    private static char[] b = new char[24];

    private static int a(char[] cArr, int i, char c, int i2, boolean z) {
        int i3;
        int i4;
        if (!z && i <= 0) {
            return i2;
        }
        if (i > 99) {
            int i5 = i / 100;
            cArr[i2] = (char) (i5 + 48);
            i3 = i2 + 1;
            i4 = i - (i5 * 100);
        } else {
            i3 = i2;
            i4 = i;
        }
        if (i4 > 9 || i2 != i3) {
            int i6 = i4 / 10;
            cArr[i3] = (char) (i6 + 48);
            i3++;
            i4 -= i6 * 10;
        }
        cArr[i3] = (char) (i4 + 48);
        int i7 = i3 + 1;
        cArr[i7] = c;
        return i7 + 1;
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3, types: [boolean] */
    /* JADX WARNING: type inference failed for: r0v6, types: [int] */
    /* JADX WARNING: type inference failed for: r0v7, types: [int] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0
      assigns: [?[boolean, int, float, short, byte, char], ?[int, float, boolean, short, byte, char, OBJECT, ARRAY], int]
      uses: [boolean, int]
      mth insns count: 72
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.util.ArrayList.forEach(ArrayList.java:1257)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.util.ArrayList.forEach(ArrayList.java:1257)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.util.ArrayList.forEach(ArrayList.java:1257)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(long r12, java.io.PrintWriter r14) {
        /*
            r4 = 86400(0x15180, float:1.21072E-40)
            r0 = 1
            r1 = 0
            java.lang.Object r8 = a
            monitor-enter(r8)
            char[] r2 = b     // Catch:{ all -> 0x00a1 }
            int r2 = r2.length     // Catch:{ all -> 0x00a1 }
            if (r2 >= 0) goto L_0x0012
            r2 = 0
            char[] r2 = new char[r2]     // Catch:{ all -> 0x00a1 }
            b = r2     // Catch:{ all -> 0x00a1 }
        L_0x0012:
            char[] r9 = b     // Catch:{ all -> 0x00a1 }
            r2 = 0
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x002c
            r1 = 0
            r2 = 48
            r9[r1] = r2     // Catch:{ all -> 0x00a1 }
        L_0x001f:
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x00a1 }
            char[] r2 = b     // Catch:{ all -> 0x00a1 }
            r3 = 0
            r1.<init>(r2, r3, r0)     // Catch:{ all -> 0x00a1 }
            r14.print(r1)     // Catch:{ all -> 0x00a1 }
            monitor-exit(r8)     // Catch:{ all -> 0x00a1 }
            return
        L_0x002c:
            r2 = 0
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0096
            r2 = 43
            r7 = r2
        L_0x0035:
            r2 = 1000(0x3e8, double:4.94E-321)
            long r2 = r12 % r2
            int r10 = (int) r2     // Catch:{ all -> 0x00a1 }
            r2 = 1000(0x3e8, double:4.94E-321)
            long r2 = r12 / r2
            double r2 = (double) r2     // Catch:{ all -> 0x00a1 }
            double r2 = java.lang.Math.floor(r2)     // Catch:{ all -> 0x00a1 }
            int r3 = (int) r2     // Catch:{ all -> 0x00a1 }
            if (r3 <= r4) goto L_0x00a9
            r2 = 86400(0x15180, float:1.21072E-40)
            int r2 = r3 / r2
            int r4 = r4 * r2
            int r3 = r3 - r4
            r6 = r2
        L_0x004e:
            r2 = 3600(0xe10, float:5.045E-42)
            if (r3 <= r2) goto L_0x00a7
            int r2 = r3 / 3600
            int r4 = r2 * 3600
            int r3 = r3 - r4
            r5 = r2
        L_0x0058:
            r2 = 60
            if (r3 <= r2) goto L_0x00a4
            int r2 = r3 / 60
            int r4 = r2 * 60
            int r3 = r3 - r4
            r4 = r3
            r3 = r2
        L_0x0063:
            r2 = 0
            r9[r2] = r7     // Catch:{ all -> 0x00a1 }
            r2 = 100
            r7 = 1
            r11 = 0
            int r6 = a(r9, r6, r2, r7, r11)     // Catch:{ all -> 0x00a1 }
            r7 = 104(0x68, float:1.46E-43)
            if (r6 == r0) goto L_0x009b
            r2 = r0
        L_0x0073:
            int r5 = a(r9, r5, r7, r6, r2)     // Catch:{ all -> 0x00a1 }
            r6 = 109(0x6d, float:1.53E-43)
            if (r5 == r0) goto L_0x009d
            r2 = r0
        L_0x007c:
            int r2 = a(r9, r3, r6, r5, r2)     // Catch:{ all -> 0x00a1 }
            r3 = 115(0x73, float:1.61E-43)
            if (r2 == r0) goto L_0x009f
        L_0x0084:
            int r0 = a(r9, r4, r3, r2, r0)     // Catch:{ all -> 0x00a1 }
            r1 = 109(0x6d, float:1.53E-43)
            r2 = 1
            int r0 = a(r9, r10, r1, r0, r2)     // Catch:{ all -> 0x00a1 }
            r1 = 115(0x73, float:1.61E-43)
            r9[r0] = r1     // Catch:{ all -> 0x00a1 }
            int r0 = r0 + 1
            goto L_0x001f
        L_0x0096:
            r2 = 45
            long r12 = -r12
            r7 = r2
            goto L_0x0035
        L_0x009b:
            r2 = r1
            goto L_0x0073
        L_0x009d:
            r2 = r1
            goto L_0x007c
        L_0x009f:
            r0 = r1
            goto L_0x0084
        L_0x00a1:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00a1 }
            throw r0
        L_0x00a4:
            r4 = r3
            r3 = r1
            goto L_0x0063
        L_0x00a7:
            r5 = r1
            goto L_0x0058
        L_0x00a9:
            r6 = r1
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rk.a(long, java.io.PrintWriter):void");
    }

    public static void a(java.io.PrintWriter printWriter) {
        a(0, printWriter);
    }

    public static void a(long j, long j2, java.io.PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            a(j - j2, printWriter);
        }
    }
}
