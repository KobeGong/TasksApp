package defpackage;

/* renamed from: axd reason: default package */
/* compiled from: PG */
final class axd extends defpackage.bca {
    private final defpackage.axa e;

    axd(defpackage.axa axa, defpackage.ayp ayp) {
        super(defpackage.awt.a, ayp);
        this.e = axa;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [axg, axe] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0, types: [axg, axe]
      assigns: [axe]
      uses: [axg]
      mth insns count: 54
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
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(defpackage.ayg r8) {
        /*
            r7 = this;
            axf r8 = (defpackage.axf) r8
            axe r1 = new axe
            r1.<init>(r7)
            axa r2 = r7.e     // Catch:{ RuntimeException -> 0x0036 }
            aww r0 = r2.d     // Catch:{ RuntimeException -> 0x0036 }
            if (r0 == 0) goto L_0x0070
            blh r0 = r2.c     // Catch:{ RuntimeException -> 0x0036 }
            byte[] r0 = r0.e     // Catch:{ RuntimeException -> 0x0036 }
            int r0 = r0.length     // Catch:{ RuntimeException -> 0x0036 }
            if (r0 != 0) goto L_0x0070
            blh r3 = r2.c     // Catch:{ RuntimeException -> 0x0036 }
            aww r0 = r2.d     // Catch:{ RuntimeException -> 0x0036 }
            bqo r0 = r0.a     // Catch:{ RuntimeException -> 0x0036 }
            dii r0 = r0.a     // Catch:{ RuntimeException -> 0x0036 }
            boolean r4 = r0.b     // Catch:{ RuntimeException -> 0x0036 }
            if (r4 == 0) goto L_0x004b
            dih r0 = r0.a     // Catch:{ RuntimeException -> 0x0036 }
        L_0x0022:
            dih r0 = (defpackage.dih) r0     // Catch:{ RuntimeException -> 0x0036 }
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ RuntimeException -> 0x0036 }
            boolean r4 = r4.booleanValue()     // Catch:{ RuntimeException -> 0x0036 }
            boolean r4 = defpackage.dih.a(r0, r4)     // Catch:{ RuntimeException -> 0x0036 }
            if (r4 != 0) goto L_0x005c
            dkw r0 = new dkw     // Catch:{ RuntimeException -> 0x0036 }
            r0.<init>()     // Catch:{ RuntimeException -> 0x0036 }
            throw r0     // Catch:{ RuntimeException -> 0x0036 }
        L_0x0036:
            r0 = move-exception
            java.lang.String r1 = "ClearcutLoggerApiImpl"
            java.lang.String r2 = "derived ClearcutLogger.MessageProducer "
            android.util.Log.e(r1, r2, r0)
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 10
            java.lang.String r2 = "MessageProducer"
            r0.<init>(r1, r2)
            r7.c(r0)
        L_0x004a:
            return
        L_0x004b:
            dih r4 = r0.a     // Catch:{ RuntimeException -> 0x0036 }
            djz r5 = defpackage.djz.a     // Catch:{ RuntimeException -> 0x0036 }
            dkh r5 = r5.a(r4)     // Catch:{ RuntimeException -> 0x0036 }
            r5.c(r4)     // Catch:{ RuntimeException -> 0x0036 }
            r4 = 1
            r0.b = r4     // Catch:{ RuntimeException -> 0x0036 }
            dih r0 = r0.a     // Catch:{ RuntimeException -> 0x0036 }
            goto L_0x0022
        L_0x005c:
            dih r0 = (defpackage.dih) r0     // Catch:{ RuntimeException -> 0x0036 }
            cwx r0 = (defpackage.cwx) r0     // Catch:{ RuntimeException -> 0x0036 }
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ RuntimeException -> 0x0036 }
            r5 = 0
            java.lang.String r6 = r0.toString()     // Catch:{ RuntimeException -> 0x0036 }
            r4[r5] = r6     // Catch:{ RuntimeException -> 0x0036 }
            byte[] r0 = r0.b()     // Catch:{ RuntimeException -> 0x0036 }
            r3.e = r0     // Catch:{ RuntimeException -> 0x0036 }
        L_0x0070:
            aww r0 = r2.e     // Catch:{ RuntimeException -> 0x0036 }
            blh r0 = r2.c     // Catch:{ RuntimeException -> 0x0036 }
            byte[] r0 = defpackage.blb.a(r0)     // Catch:{ RuntimeException -> 0x0036 }
            r2.b = r0     // Catch:{ RuntimeException -> 0x0036 }
            android.os.IInterface r0 = r8.o()
            axi r0 = (defpackage.axi) r0
            axa r2 = r7.e
            r0.a(r1, r2)
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axd.a(ayg):void");
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj) {
        super.a((defpackage.ayw) (com.google.android.gms.common.api.Status) obj);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ defpackage.ayw a(com.google.android.gms.common.api.Status status) {
        return status;
    }
}
