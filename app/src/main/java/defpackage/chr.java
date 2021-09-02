package defpackage;

/* renamed from: chr reason: default package */
/* compiled from: PG */
final class chr implements java.lang.Thread.UncaughtExceptionHandler {
    public final java.lang.Thread.UncaughtExceptionHandler a;
    private final /* synthetic */ defpackage.chn b;

    chr(defpackage.chn chn, java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.b = chn;
        this.a = uncaughtExceptionHandler;
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r9v1 */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r1v7, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v8, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r1v11, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v11, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: type inference failed for: r2v12, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r1v19 */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: type inference failed for: r1v23 */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: type inference failed for: r1v25 */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* JADX WARNING: type inference failed for: r1v26 */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r0v42, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r1v29 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* JADX WARNING: type inference failed for: r2v19 */
    /* JADX WARNING: type inference failed for: r1v30 */
    /* JADX WARNING: type inference failed for: r2v20 */
    /* JADX WARNING: type inference failed for: r1v31 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v15
      assigns: []
      uses: []
      mth insns count: 164
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
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d4 A[SYNTHETIC, Splitter:B:55:0x00d4] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f6 A[SYNTHETIC, Splitter:B:68:0x00f6] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 11 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void uncaughtException(java.lang.Thread r11, java.lang.Throwable r12) {
        /*
            r10 = this;
            r0 = 0
            r8 = 5
            r7 = 0
            chn r1 = r10.b     // Catch:{ Exception -> 0x013b, all -> 0x0129 }
            boolean r1 = r1.b()     // Catch:{ Exception -> 0x013b, all -> 0x0129 }
            if (r1 == 0) goto L_0x0152
            chn r1 = r10.b     // Catch:{ Exception -> 0x013b, all -> 0x0129 }
            boolean r1 = r1.k     // Catch:{ Exception -> 0x013b, all -> 0x0129 }
            if (r1 == 0) goto L_0x014e
            android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ Exception -> 0x013b, all -> 0x0129 }
            chn r1 = r10.b     // Catch:{ IOException -> 0x00a9, Exception -> 0x0141, all -> 0x012f }
            android.app.Application r1 = r1.a     // Catch:{ IOException -> 0x00a9, Exception -> 0x0141, all -> 0x012f }
            java.lang.String r3 = "primes_crash"
            r4 = 0
            java.io.FileOutputStream r0 = r1.openFileOutput(r3, r4)     // Catch:{ IOException -> 0x00a9, Exception -> 0x0141, all -> 0x012f }
            r0.flush()     // Catch:{ IOException -> 0x00a9 }
            r1 = r2
            r2 = r0
        L_0x0025:
            chn r0 = r10.b     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r3 = r11.getName()     // Catch:{ Exception -> 0x00c7 }
            edw r0 = r0.a(r3, r12)     // Catch:{ Exception -> 0x00c7 }
            chn r3 = r10.b     // Catch:{ Exception -> 0x00c7 }
            boolean r3 = r3.k     // Catch:{ Exception -> 0x00c7 }
            if (r3 == 0) goto L_0x003e
            if (r2 == 0) goto L_0x003e
            byte[] r3 = defpackage.dmf.a(r0)     // Catch:{ IOException -> 0x00b9 }
            r2.write(r3)     // Catch:{ IOException -> 0x00b9 }
        L_0x003e:
            efx r3 = new efx     // Catch:{ Exception -> 0x00c7 }
            r3.<init>()     // Catch:{ Exception -> 0x00c7 }
            r3.g = r0     // Catch:{ Exception -> 0x00c7 }
            chn r0 = r10.b     // Catch:{ Exception -> 0x00c7 }
            chm r0 = r0.f     // Catch:{ Exception -> 0x00c7 }
            if (r0 == 0) goto L_0x0055
            chn r0 = r10.b     // Catch:{ Exception -> 0x00e6 }
            chm r0 = r0.f     // Catch:{ Exception -> 0x00e6 }
            eeo r0 = r0.a()     // Catch:{ Exception -> 0x00e6 }
            r3.o = r0     // Catch:{ Exception -> 0x00e6 }
        L_0x0055:
            chn r0 = r10.b     // Catch:{ Exception -> 0x00c7 }
            java.util.concurrent.atomic.AtomicBoolean r4 = r0.i     // Catch:{ Exception -> 0x00c7 }
            r5 = 0
            boolean r4 = r4.getAndSet(r5)     // Catch:{ Exception -> 0x00c7 }
            if (r4 == 0) goto L_0x006b
            r4 = 2
            edw r5 = r0.j     // Catch:{ Exception -> 0x00c7 }
            r0.a(r4, r5)     // Catch:{ Exception -> 0x00c7 }
            r4 = 3
            r5 = 0
            r0.a(r4, r5)     // Catch:{ Exception -> 0x00c7 }
        L_0x006b:
            chn r0 = r10.b     // Catch:{ Exception -> 0x00c7 }
            r0.a(r3)     // Catch:{ Exception -> 0x00c7 }
            chn r0 = r10.b     // Catch:{ Exception -> 0x00c7 }
            boolean r0 = r0.c     // Catch:{ Exception -> 0x00c7 }
            if (r0 != 0) goto L_0x0087
            chn r0 = r10.b     // Catch:{ Exception -> 0x00c7 }
            boolean r0 = r0.h     // Catch:{ Exception -> 0x00c7 }
            if (r0 == 0) goto L_0x0087
            chn r0 = r10.b     // Catch:{ Exception -> 0x00c7 }
            cog r0 = r0.g     // Catch:{ Exception -> 0x00c7 }
            chn r3 = r10.b     // Catch:{ Exception -> 0x00c7 }
            civ r3 = r3.e     // Catch:{ Exception -> 0x00c7 }
            r0.a()     // Catch:{ Exception -> 0x00c7 }
        L_0x0087:
            chn r0 = r10.b     // Catch:{ Exception -> 0x00c7 }
            android.app.Application r0 = r0.a     // Catch:{ Exception -> 0x00c7 }
            defpackage.cdm.c(r0)     // Catch:{ Exception -> 0x00c7 }
            chn r0 = r10.b     // Catch:{ Exception -> 0x00c7 }
            android.app.Application r0 = r0.a     // Catch:{ Exception -> 0x00c7 }
            defpackage.cdm.d(r0)     // Catch:{ Exception -> 0x00c7 }
            if (r2 == 0) goto L_0x009a
            r2.close()     // Catch:{ IOException -> 0x0108 }
        L_0x009a:
            if (r1 == 0) goto L_0x009f
            android.os.StrictMode.setThreadPolicy(r1)
        L_0x009f:
            java.lang.Thread$UncaughtExceptionHandler r0 = r10.a
            if (r0 == 0) goto L_0x00a8
            java.lang.Thread$UncaughtExceptionHandler r0 = r10.a
            r0.uncaughtException(r11, r12)
        L_0x00a8:
            return
        L_0x00a9:
            r1 = move-exception
            java.lang.String r1 = "CrashMetricService"
            java.lang.String r3 = "IO failure creating empty file."
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0147, all -> 0x0135 }
            r5 = 5
            defpackage.cdm.a(r5, r1, r3, r4)     // Catch:{ Exception -> 0x0147, all -> 0x0135 }
            r1 = r2
            r2 = r0
            goto L_0x0025
        L_0x00b9:
            r3 = move-exception
            java.lang.String r3 = "CrashMetricService"
            java.lang.String r4 = "IO failure storing crash."
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x00c7 }
            r6 = 5
            defpackage.cdm.a(r6, r3, r4, r5)     // Catch:{ Exception -> 0x00c7 }
            goto L_0x003e
        L_0x00c7:
            r0 = move-exception
        L_0x00c8:
            java.lang.String r3 = "CrashMetricService"
            java.lang.String r4 = "Failed to record crash."
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x00f3 }
            defpackage.cdm.b(r3, r4, r0, r5)     // Catch:{ all -> 0x00f3 }
            if (r2 == 0) goto L_0x00d7
            r2.close()     // Catch:{ IOException -> 0x0113 }
        L_0x00d7:
            if (r1 == 0) goto L_0x00dc
            android.os.StrictMode.setThreadPolicy(r1)
        L_0x00dc:
            java.lang.Thread$UncaughtExceptionHandler r0 = r10.a
            if (r0 == 0) goto L_0x00a8
            java.lang.Thread$UncaughtExceptionHandler r0 = r10.a
            r0.uncaughtException(r11, r12)
            goto L_0x00a8
        L_0x00e6:
            r0 = move-exception
            java.lang.String r4 = "CrashMetricService"
            java.lang.String r5 = "Exception while getting crash metric extension!"
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x00c7 }
            defpackage.cdm.b(r4, r5, r0, r6)     // Catch:{ Exception -> 0x00c7 }
            goto L_0x0055
        L_0x00f3:
            r0 = move-exception
        L_0x00f4:
            if (r2 == 0) goto L_0x00f9
            r2.close()     // Catch:{ IOException -> 0x011e }
        L_0x00f9:
            if (r1 == 0) goto L_0x00fe
            android.os.StrictMode.setThreadPolicy(r1)
        L_0x00fe:
            java.lang.Thread$UncaughtExceptionHandler r1 = r10.a
            if (r1 == 0) goto L_0x0107
            java.lang.Thread$UncaughtExceptionHandler r1 = r10.a
            r1.uncaughtException(r11, r12)
        L_0x0107:
            throw r0
        L_0x0108:
            r0 = move-exception
            java.lang.String r0 = "CrashMetricService"
            java.lang.String r2 = "Could not close file."
            java.lang.Object[] r3 = new java.lang.Object[r7]
            defpackage.cdm.a(r8, r0, r2, r3)
            goto L_0x009a
        L_0x0113:
            r0 = move-exception
            java.lang.String r0 = "CrashMetricService"
            java.lang.String r2 = "Could not close file."
            java.lang.Object[] r3 = new java.lang.Object[r7]
            defpackage.cdm.a(r8, r0, r2, r3)
            goto L_0x00d7
        L_0x011e:
            r2 = move-exception
            java.lang.String r2 = "CrashMetricService"
            java.lang.String r3 = "Could not close file."
            java.lang.Object[] r4 = new java.lang.Object[r7]
            defpackage.cdm.a(r8, r2, r3, r4)
            goto L_0x00f9
        L_0x0129:
            r1 = move-exception
            r2 = r0
            r9 = r0
            r0 = r1
            r1 = r9
            goto L_0x00f4
        L_0x012f:
            r1 = move-exception
            r9 = r1
            r1 = r2
            r2 = r0
            r0 = r9
            goto L_0x00f4
        L_0x0135:
            r1 = move-exception
            r9 = r1
            r1 = r2
            r2 = r0
            r0 = r9
            goto L_0x00f4
        L_0x013b:
            r1 = move-exception
            r2 = r0
            r9 = r0
            r0 = r1
            r1 = r9
            goto L_0x00c8
        L_0x0141:
            r1 = move-exception
            r9 = r1
            r1 = r2
            r2 = r0
            r0 = r9
            goto L_0x00c8
        L_0x0147:
            r1 = move-exception
            r9 = r1
            r1 = r2
            r2 = r0
            r0 = r9
            goto L_0x00c8
        L_0x014e:
            r1 = r0
            r2 = r0
            goto L_0x0025
        L_0x0152:
            r1 = r0
            r2 = r0
            goto L_0x0087
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chr.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
