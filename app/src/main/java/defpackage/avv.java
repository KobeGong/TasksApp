package defpackage;

/* renamed from: avv reason: default package */
/* compiled from: PG */
public final class avv extends defpackage.bca {
    private avv(defpackage.ayp ayp) {
        super(defpackage.avg.a, ayp);
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj) {
        super.a((defpackage.ayw) obj);
    }

    public avv(defpackage.ayp ayp, byte b) {
        this(ayp);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [avu, awb] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0, types: [avu, awb]
      assigns: [avu]
      uses: [awb]
      mth insns count: 7
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
    public final /* synthetic */ void a(defpackage.ayg r4) {
        /*
            r3 = this;
            avs r4 = (defpackage.avs) r4
            android.os.IInterface r0 = r4.o()
            awd r0 = (defpackage.awd) r0
            avu r1 = new avu
            r1.<init>(r3)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r2 = r4.a
            r0.a(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avv.a(ayg):void");
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ defpackage.ayw a(com.google.android.gms.common.api.Status status) {
        return status;
    }
}
