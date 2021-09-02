package defpackage;

/* renamed from: nz reason: default package */
/* compiled from: PG */
public abstract class nz extends defpackage.oc {
    public volatile defpackage.oa a;
    public long b;
    private final java.util.concurrent.Executor j;
    private volatile defpackage.oa k;

    public nz(android.content.Context context) {
        this(context, defpackage.oe.b);
    }

    public abstract java.lang.Object d();

    private nz(android.content.Context context, java.util.concurrent.Executor executor) {
        super(context);
        this.b = -10000;
        this.j = executor;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        super.a();
        b();
        this.a = new defpackage.oa(this);
        c();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [oa, android.os.Handler] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v0, types: [oa, android.os.Handler]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [oa, android.os.Handler]
      mth insns count: 35
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
    public final boolean b() {
        /*
            r5 = this;
            r4 = 1
            r3 = 0
            r0 = 0
            oa r1 = r5.a
            if (r1 == 0) goto L_0x0022
            boolean r1 = r5.f
            if (r1 != 0) goto L_0x000d
            r5.i = r4
        L_0x000d:
            oa r1 = r5.k
            if (r1 == 0) goto L_0x0023
            oa r1 = r5.a
            boolean r1 = r1.a
            if (r1 == 0) goto L_0x0020
            oa r1 = r5.a
            r1.a = r0
            oa r1 = r5.a
            r3.removeCallbacks(r1)
        L_0x0020:
            r5.a = r3
        L_0x0022:
            return r0
        L_0x0023:
            oa r1 = r5.a
            boolean r1 = r1.a
            if (r1 == 0) goto L_0x0035
            oa r1 = r5.a
            r1.a = r0
            oa r1 = r5.a
            r3.removeCallbacks(r1)
            r5.a = r3
            goto L_0x0022
        L_0x0035:
            oa r1 = r5.a
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.f
            r2.set(r4)
            java.util.concurrent.FutureTask r1 = r1.d
            boolean r0 = r1.cancel(r0)
            if (r0 == 0) goto L_0x0048
            oa r1 = r5.a
            r5.k = r1
        L_0x0048:
            r5.a = r3
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nz.b():boolean");
    }

    /* access modifiers changed from: 0000 */
    public final void c() {
        android.os.Handler handler = null;
        if (this.k == null && this.a != null) {
            if (this.a.a) {
                this.a.a = false;
                handler.removeCallbacks(this.a);
            }
            if (0 <= 0 || android.os.SystemClock.uptimeMillis() >= this.b) {
                defpackage.oa oaVar = this.a;
                java.util.concurrent.Executor executor = this.j;
                if (oaVar.e != defpackage.bg.A) {
                    switch (oaVar.e - 1) {
                        case 1:
                            throw new java.lang.IllegalStateException("Cannot execute task: the task is already running.");
                        case 2:
                            throw new java.lang.IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                        default:
                            throw new java.lang.IllegalStateException("We should never reach this state");
                    }
                } else {
                    oaVar.e = defpackage.bg.B;
                    defpackage.oj ojVar = oaVar.c;
                    executor.execute(oaVar.d);
                }
            } else {
                this.a.a = true;
                handler.postAtTime(this.a, this.b);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.oa oaVar) {
        if (this.k == oaVar) {
            this.b = android.os.SystemClock.uptimeMillis();
            this.k = null;
            c();
        }
    }

    public final void a(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        super.a(str, fileDescriptor, printWriter, strArr);
        if (this.a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.a);
            printWriter.print(" waiting=");
            printWriter.println(this.a.a);
        }
        if (this.k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.k);
            printWriter.print(" waiting=");
            printWriter.println(this.k.a);
        }
        if (0 != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            defpackage.rk.a(printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            defpackage.rk.a(this.b, android.os.SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }
}
