package defpackage;

/* renamed from: bcx reason: default package */
/* compiled from: PG */
public abstract class bcx {
    private long a;
    public int b;
    public long c;
    public final android.content.Context d;
    public final android.os.Handler e;
    public defpackage.bda f;
    public java.util.concurrent.atomic.AtomicInteger g = new java.util.concurrent.atomic.AtomicInteger(0);
    private int h;
    private long i;
    private defpackage.ber j;
    private final defpackage.bdn k;
    private final java.lang.Object l = new java.lang.Object();
    /* access modifiers changed from: private */
    public final java.lang.Object m = new java.lang.Object();
    /* access modifiers changed from: private */
    public defpackage.bdt n;
    private android.os.IInterface o;
    /* access modifiers changed from: private */
    public final java.util.ArrayList p = new java.util.ArrayList();
    private defpackage.bdf q;
    private int r = 1;
    /* access modifiers changed from: private */
    public final defpackage.bcy s;
    /* access modifiers changed from: private */
    public final defpackage.bcz t;
    private final int u;
    private final java.lang.String v;
    /* access modifiers changed from: private */
    public defpackage.axq w = null;
    /* access modifiers changed from: private */
    public boolean x = false;

    protected bcx(android.content.Context context, android.os.Looper looper, defpackage.bdn bdn, defpackage.axv axv, int i2, defpackage.bcy bcy, defpackage.bcz bcz, java.lang.String str) {
        this.d = (android.content.Context) defpackage.azb.b((java.lang.Object) context, (java.lang.Object) "Context must not be null");
        defpackage.azb.b((java.lang.Object) looper, (java.lang.Object) "Looper must not be null");
        this.k = (defpackage.bdn) defpackage.azb.b((java.lang.Object) bdn, (java.lang.Object) "Supervisor must not be null");
        defpackage.azb.b((java.lang.Object) axv, (java.lang.Object) "API availability must not be null");
        this.e = new defpackage.bdd(this, looper);
        this.u = i2;
        this.s = bcy;
        this.t = bcz;
        this.v = str;
    }

    public abstract android.os.IInterface a(android.os.IBinder iBinder);

    public abstract java.lang.String b();

    public abstract java.lang.String f_();

    private final java.lang.String q() {
        return this.v == null ? this.d.getClass().getName() : this.v;
    }

    /* access modifiers changed from: protected */
    public final void a(defpackage.axq axq) {
        this.h = axq.b;
        this.i = java.lang.System.currentTimeMillis();
    }

    /* access modifiers changed from: private */
    public final void a(int i2, android.os.IInterface iInterface) {
        boolean z = true;
        if ((i2 == 4) != (iInterface != null)) {
            z = false;
        }
        defpackage.azb.b(z);
        synchronized (this.l) {
            this.r = i2;
            this.o = iInterface;
            switch (i2) {
                case 1:
                    if (this.q != null) {
                        defpackage.bdf bdf = this.q;
                        q();
                        this.k.a(f_(), "com.google.android.gms", 129, bdf);
                        this.q = null;
                        break;
                    }
                    break;
                case 2:
                case 3:
                    if (!(this.q == null || this.j == null)) {
                        java.lang.String str = this.j.a;
                        java.lang.String str2 = this.j.b;
                        android.util.Log.e("GmsClient", new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 70 + java.lang.String.valueOf(str2).length()).append("Calling connect() while still connected, missing disconnect() for ").append(str).append(" on ").append(str2).toString());
                        defpackage.bdn bdn = this.k;
                        java.lang.String str3 = this.j.a;
                        java.lang.String str4 = this.j.b;
                        defpackage.bdf bdf2 = this.q;
                        q();
                        bdn.a(str3, str4, 129, bdf2);
                        this.g.incrementAndGet();
                    }
                    this.q = new defpackage.bdf(this, this.g.get());
                    this.j = new defpackage.ber("com.google.android.gms", f_());
                    defpackage.bdn bdn2 = this.k;
                    java.lang.String str5 = this.j.a;
                    java.lang.String str6 = this.j.b;
                    defpackage.bdf bdf3 = this.q;
                    q();
                    if (!bdn2.a(new defpackage.bdo(str5, str6, 129), (android.content.ServiceConnection) bdf3)) {
                        java.lang.String str7 = this.j.a;
                        java.lang.String str8 = this.j.b;
                        android.util.Log.e("GmsClient", new java.lang.StringBuilder(java.lang.String.valueOf(str7).length() + 34 + java.lang.String.valueOf(str8).length()).append("unable to connect to service: ").append(str7).append(" on ").append(str8).toString());
                        a(16, this.g.get());
                        break;
                    }
                    break;
                case 4:
                    this.a = java.lang.System.currentTimeMillis();
                    break;
            }
        }
    }

    /* access modifiers changed from: private */
    public final boolean a(int i2, int i3, android.os.IInterface iInterface) {
        boolean z;
        synchronized (this.l) {
            if (this.r != i2) {
                z = false;
            } else {
                a(i3, iInterface);
                z = true;
            }
        }
        return z;
    }

    public final void a(defpackage.bda bda) {
        this.f = (defpackage.bda) defpackage.azb.b((java.lang.Object) bda, (java.lang.Object) "Connection progress callbacks cannot be null.");
        a(2, (android.os.IInterface) null);
    }

    public final boolean f() {
        boolean z;
        synchronized (this.l) {
            z = this.r == 4;
        }
        return z;
    }

    public final boolean g() {
        boolean z;
        synchronized (this.l) {
            z = this.r == 2 || this.r == 3;
        }
        return z;
    }

    private final boolean r() {
        boolean z;
        synchronized (this.l) {
            z = this.r == 3;
        }
        return z;
    }

    public void e() {
        this.g.incrementAndGet();
        synchronized (this.p) {
            int size = this.p.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((defpackage.bde) this.p.get(i2)).d();
            }
            this.p.clear();
        }
        synchronized (this.m) {
            this.n = null;
        }
        a(1, (android.os.IInterface) null);
    }

    public android.accounts.Account k() {
        return null;
    }

    public defpackage.axs[] l() {
        return new defpackage.axs[0];
    }

    public android.os.Bundle m() {
        return new android.os.Bundle();
    }

    public void a(int i2, android.os.IBinder iBinder, android.os.Bundle bundle, int i3) {
        this.e.sendMessage(this.e.obtainMessage(1, i3, -1, new defpackage.bdh(this, i2, iBinder, bundle)));
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, int i3) {
        this.e.sendMessage(this.e.obtainMessage(7, i3, -1, new defpackage.bdi(this, i2)));
    }

    public final void n() {
        if (!f()) {
            throw new java.lang.IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public final android.os.Bundle a() {
        return null;
    }

    public final android.os.IInterface o() {
        android.os.IInterface iInterface;
        synchronized (this.l) {
            if (this.r == 5) {
                throw new android.os.DeadObjectException();
            }
            n();
            defpackage.azb.a(this.o != null, (java.lang.Object) "Client is connected but service is null");
            iInterface = this.o;
        }
        return iInterface;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [bds, bdr] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v2, types: [bds, bdr]
      assigns: [bds]
      uses: [bdr]
      mth insns count: 80
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
    public final void a(defpackage.bdp r10, java.util.Set r11) {
        /*
            r9 = this;
            r8 = 0
            r7 = 1
            android.os.Bundle r0 = r9.m()
            bdm r1 = new bdm
            int r2 = r9.u
            r1.<init>(r2)
            android.content.Context r2 = r9.d
            java.lang.String r2 = r2.getPackageName()
            r1.a = r2
            r1.d = r0
            if (r11 == 0) goto L_0x0027
            int r0 = r11.size()
            com.google.android.gms.common.api.Scope[] r0 = new com.google.android.gms.common.api.Scope[r0]
            java.lang.Object[] r0 = r11.toArray(r0)
            com.google.android.gms.common.api.Scope[] r0 = (com.google.android.gms.common.api.Scope[]) r0
            r1.c = r0
        L_0x0027:
            boolean r0 = r9.h()
            if (r0 == 0) goto L_0x0041
            android.accounts.Account r0 = r9.k()
            if (r0 == 0) goto L_0x008a
            android.accounts.Account r0 = r9.k()
        L_0x0037:
            r1.e = r0
            if (r10 == 0) goto L_0x0041
            android.os.IBinder r0 = r10.asBinder()
            r1.b = r0
        L_0x0041:
            axs[] r0 = r9.l()
            r1.f = r0
            java.lang.Object r2 = r9.m     // Catch:{ DeadObjectException -> 0x009f, SecurityException -> 0x00c2, RemoteException -> 0x00c4, RuntimeException -> 0x00d8 }
            monitor-enter(r2)     // Catch:{ DeadObjectException -> 0x009f, SecurityException -> 0x00c2, RemoteException -> 0x00c4, RuntimeException -> 0x00d8 }
            bdt r0 = r9.n     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x00ba
            bdt r0 = r9.n     // Catch:{ all -> 0x009c }
            bds r3 = new bds     // Catch:{ all -> 0x009c }
            java.util.concurrent.atomic.AtomicInteger r4 = r9.g     // Catch:{ all -> 0x009c }
            int r4 = r4.get()     // Catch:{ all -> 0x009c }
            r3.<init>(r9, r4)     // Catch:{ all -> 0x009c }
            android.os.Parcel r4 = android.os.Parcel.obtain()     // Catch:{ all -> 0x009c }
            android.os.Parcel r5 = android.os.Parcel.obtain()     // Catch:{ all -> 0x009c }
            java.lang.String r6 = "com.google.android.gms.common.internal.IGmsServiceBroker"
            r4.writeInterfaceToken(r6)     // Catch:{ all -> 0x0094 }
            android.os.IBinder r3 = r3.asBinder()     // Catch:{ all -> 0x0094 }
            r4.writeStrongBinder(r3)     // Catch:{ all -> 0x0094 }
            r3 = 1
            r4.writeInt(r3)     // Catch:{ all -> 0x0094 }
            r3 = 0
            r1.writeToParcel(r4, r3)     // Catch:{ all -> 0x0094 }
            android.os.IBinder r0 = r0.a     // Catch:{ all -> 0x0094 }
            r1 = 46
            r3 = 0
            r0.transact(r1, r4, r5, r3)     // Catch:{ all -> 0x0094 }
            r5.readException()     // Catch:{ all -> 0x0094 }
            r5.recycle()     // Catch:{ all -> 0x009c }
            r4.recycle()     // Catch:{ all -> 0x009c }
        L_0x0088:
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
        L_0x0089:
            return
        L_0x008a:
            android.accounts.Account r0 = new android.accounts.Account
            java.lang.String r2 = "<<default account>>"
            java.lang.String r3 = "com.google"
            r0.<init>(r2, r3)
            goto L_0x0037
        L_0x0094:
            r0 = move-exception
            r5.recycle()     // Catch:{ all -> 0x009c }
            r4.recycle()     // Catch:{ all -> 0x009c }
            throw r0     // Catch:{ all -> 0x009c }
        L_0x009c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
            throw r0     // Catch:{ DeadObjectException -> 0x009f, SecurityException -> 0x00c2, RemoteException -> 0x00c4, RuntimeException -> 0x00d8 }
        L_0x009f:
            r0 = move-exception
            java.lang.String r1 = "GmsClient"
            java.lang.String r2 = "IGmsServiceBroker.getService failed"
            android.util.Log.w(r1, r2, r0)
            android.os.Handler r0 = r9.e
            android.os.Handler r1 = r9.e
            r2 = 6
            java.util.concurrent.atomic.AtomicInteger r3 = r9.g
            int r3 = r3.get()
            android.os.Message r1 = r1.obtainMessage(r2, r3, r7)
            r0.sendMessage(r1)
            goto L_0x0089
        L_0x00ba:
            java.lang.String r0 = "GmsClient"
            java.lang.String r1 = "mServiceBroker is null, client disconnected"
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x009c }
            goto L_0x0088
        L_0x00c2:
            r0 = move-exception
            throw r0
        L_0x00c4:
            r0 = move-exception
        L_0x00c5:
            java.lang.String r1 = "GmsClient"
            java.lang.String r2 = "IGmsServiceBroker.getService failed"
            android.util.Log.w(r1, r2, r0)
            r0 = 8
            java.util.concurrent.atomic.AtomicInteger r1 = r9.g
            int r1 = r1.get()
            r9.a(r0, r8, r8, r1)
            goto L_0x0089
        L_0x00d8:
            r0 = move-exception
            goto L_0x00c5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcx.a(bdp, java.util.Set):void");
    }

    public boolean h() {
        return false;
    }

    public final void a(defpackage.bdb bdb) {
        bdb.a.g.g.post(new defpackage.bao(bdb));
    }

    public final boolean i() {
        return true;
    }

    public boolean c() {
        return false;
    }

    public android.content.Intent d() {
        throw new java.lang.UnsupportedOperationException("Not a sign in API");
    }

    /* access modifiers changed from: protected */
    public java.util.Set p() {
        return java.util.Collections.EMPTY_SET;
    }

    public final void a(java.lang.String str, java.io.PrintWriter printWriter) {
        int i2;
        android.os.IInterface iInterface;
        defpackage.bdt bdt;
        synchronized (this.l) {
            i2 = this.r;
            iInterface = this.o;
        }
        synchronized (this.m) {
            bdt = this.n;
        }
        printWriter.append(str).append("mConnectState=");
        switch (i2) {
            case 1:
                printWriter.print("DISCONNECTED");
                break;
            case 2:
                printWriter.print("REMOTE_CONNECTING");
                break;
            case 3:
                printWriter.print("LOCAL_CONNECTING");
                break;
            case 4:
                printWriter.print("CONNECTED");
                break;
            case 5:
                printWriter.print("DISCONNECTING");
                break;
            default:
                printWriter.print("UNKNOWN");
                break;
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append(b()).append("@").append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (bdt == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(java.lang.Integer.toHexString(java.lang.System.identityHashCode(bdt.asBinder())));
        }
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", java.util.Locale.US);
        if (this.a > 0) {
            java.io.PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j2 = this.a;
            java.lang.String format = simpleDateFormat.format(new java.util.Date(this.a));
            append.println(new java.lang.StringBuilder(java.lang.String.valueOf(format).length() + 21).append(j2).append(" ").append(format).toString());
        }
        if (this.c > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            switch (this.b) {
                case 1:
                    printWriter.append("CAUSE_SERVICE_DISCONNECTED");
                    break;
                case 2:
                    printWriter.append("CAUSE_NETWORK_LOST");
                    break;
                default:
                    printWriter.append(java.lang.String.valueOf(this.b));
                    break;
            }
            java.io.PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j3 = this.c;
            java.lang.String format2 = simpleDateFormat.format(new java.util.Date(this.c));
            append2.println(new java.lang.StringBuilder(java.lang.String.valueOf(format2).length() + 21).append(j3).append(" ").append(format2).toString());
        }
        if (this.i > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(defpackage.azb.a(this.h));
            java.io.PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j4 = this.i;
            java.lang.String format3 = simpleDateFormat.format(new java.util.Date(this.i));
            append3.println(new java.lang.StringBuilder(java.lang.String.valueOf(format3).length() + 21).append(j4).append(" ").append(format3).toString());
        }
    }

    /* access modifiers changed from: private */
    public final boolean s() {
        if (this.x || android.text.TextUtils.isEmpty(b()) || android.text.TextUtils.isEmpty(null)) {
            return false;
        }
        try {
            java.lang.Class.forName(b());
            return true;
        } catch (java.lang.ClassNotFoundException e2) {
            return false;
        }
    }

    public final java.lang.String j() {
        if (f() && this.j != null) {
            return this.j.b;
        }
        throw new java.lang.RuntimeException("Failed to connect when checking package");
    }

    static /* synthetic */ void a(defpackage.bcx bcx) {
        int i2;
        if (bcx.r()) {
            i2 = 5;
            bcx.x = true;
        } else {
            i2 = 4;
        }
        bcx.e.sendMessage(bcx.e.obtainMessage(i2, bcx.g.get(), 16));
    }

    static {
        java.lang.String[] strArr = {"service_esmobile", "service_googleme"};
    }
}
