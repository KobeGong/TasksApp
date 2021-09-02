package defpackage;

/* renamed from: azx reason: default package */
/* compiled from: PG */
public final class azx extends defpackage.ayp implements defpackage.bav {
    public final java.util.concurrent.locks.Lock b;
    public final java.util.Queue c = new java.util.LinkedList();
    public final java.util.Map d;
    public java.util.Set e = new java.util.HashSet();
    public java.util.Set f = null;
    public final defpackage.bbr g;
    private final defpackage.bem h;
    private defpackage.bau i = null;
    private final int j;
    /* access modifiers changed from: private */
    public final android.content.Context k;
    private final android.os.Looper l;
    private volatile boolean m;
    private long n = 120000;
    private long o = 5000;
    private final defpackage.bac p;
    private final defpackage.axt q;
    private defpackage.bar r;
    private defpackage.bdj s;
    private java.util.Map t;
    private defpackage.ayf u;
    private final defpackage.bbe v = new defpackage.bbe();
    private final java.util.ArrayList w;
    private java.lang.Integer x = null;
    private final defpackage.ben y = new defpackage.azy(this);

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<ayr>, for r13v0, types: [java.util.List, java.util.List<ayr>] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<ays>, for r14v0, types: [java.util.List, java.util.List<ays>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public azx(android.content.Context r6, java.util.concurrent.locks.Lock r7, android.os.Looper r8, defpackage.bdj r9, defpackage.axt r10, defpackage.ayf r11, java.util.Map r12, java.util.List<defpackage.ayr> r13, java.util.List<defpackage.ays> r14, java.util.Map r15, int r16, int r17, java.util.ArrayList r18) {
        /*
            r5 = this;
            r5.<init>()
            r2 = 0
            r5.i = r2
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r5.c = r2
            r2 = 120000(0x1d4c0, double:5.9288E-319)
            r5.n = r2
            r2 = 5000(0x1388, double:2.4703E-320)
            r5.o = r2
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r5.e = r2
            bbe r2 = new bbe
            r2.<init>()
            r5.v = r2
            r2 = 0
            r5.x = r2
            r2 = 0
            r5.f = r2
            azy r2 = new azy
            r2.<init>(r5)
            r5.y = r2
            r5.k = r6
            r5.b = r7
            bem r2 = new bem
            ben r3 = r5.y
            r2.<init>(r8, r3)
            r5.h = r2
            r5.l = r8
            bac r2 = new bac
            r2.<init>(r5, r8)
            r5.p = r2
            r5.q = r10
            r0 = r16
            r5.j = r0
            int r2 = r5.j
            if (r2 < 0) goto L_0x0057
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            r5.x = r2
        L_0x0057:
            r5.t = r12
            r5.d = r15
            r0 = r18
            r5.w = r0
            bbr r2 = new bbr
            java.util.Map r3 = r5.d
            r2.<init>(r3)
            r5.g = r2
            java.util.Iterator r3 = r13.iterator()
        L_0x006c:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x007e
            java.lang.Object r2 = r3.next()
            ayr r2 = (defpackage.ayr) r2
            bem r4 = r5.h
            r4.a(r2)
            goto L_0x006c
        L_0x007e:
            java.util.Iterator r3 = r14.iterator()
        L_0x0082:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0094
            java.lang.Object r2 = r3.next()
            ays r2 = (defpackage.ays) r2
            bem r4 = r5.h
            r4.a(r2)
            goto L_0x0082
        L_0x0094:
            r5.s = r9
            r5.u = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azx.<init>(android.content.Context, java.util.concurrent.locks.Lock, android.os.Looper, bdj, axt, ayf, java.util.Map, java.util.List, java.util.List, java.util.Map, int, int, java.util.ArrayList):void");
    }

    public final defpackage.bca a(defpackage.bca bca) {
        java.lang.String str;
        defpackage.azb.b(bca.c != null, (java.lang.Object) "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.d.containsKey(bca.c);
        if (bca.d != null) {
            str = bca.d.b;
        } else {
            str = "the API";
        }
        defpackage.azb.b(containsKey, (java.lang.Object) new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 65).append("GoogleApiClient is not configured to use ").append(str).append(" required for this call.").toString());
        this.b.lock();
        try {
            if (this.i == null) {
                this.c.add(bca);
            } else {
                bca = this.i.a(bca);
                this.b.unlock();
            }
            return bca;
        } finally {
            this.b.unlock();
        }
    }

    public final defpackage.bca b(defpackage.bca bca) {
        java.lang.String str;
        defpackage.azb.b(bca.c != null, (java.lang.Object) "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.d.containsKey(bca.c);
        if (bca.d != null) {
            str = bca.d.b;
        } else {
            str = "the API";
        }
        defpackage.azb.b(containsKey, (java.lang.Object) new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 65).append("GoogleApiClient is not configured to use ").append(str).append(" required for this call.").toString());
        this.b.lock();
        try {
            if (this.i == null) {
                throw new java.lang.IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (this.m) {
                this.c.add(bca);
                while (!this.c.isEmpty()) {
                    defpackage.bca bca2 = (defpackage.bca) this.c.remove();
                    this.g.a(bca2);
                    bca2.c(com.google.android.gms.common.api.Status.c);
                }
            } else {
                bca = this.i.b(bca);
                this.b.unlock();
            }
            return bca;
        } finally {
            this.b.unlock();
        }
    }

    public final defpackage.bba a(java.lang.Object obj) {
        this.b.lock();
        try {
            defpackage.bbe bbe = this.v;
            android.os.Looper looper = this.l;
            java.lang.String str = "NO_TYPE";
            defpackage.azb.b(obj, (java.lang.Object) "Listener must not be null");
            defpackage.azb.b((java.lang.Object) looper, (java.lang.Object) "Looper must not be null");
            defpackage.azb.b((java.lang.Object) str, (java.lang.Object) "Listener type must not be null");
            defpackage.bba bba = new defpackage.bba(looper, obj, str);
            bbe.a.add(bba);
            return bba;
        } finally {
            this.b.unlock();
        }
    }

    public final defpackage.ayj a(defpackage.ayh ayh) {
        defpackage.ayj ayj = (defpackage.ayj) this.d.get(ayh);
        defpackage.azb.b((java.lang.Object) ayj, (java.lang.Object) "Appropriate Api was not requested.");
        return ayj;
    }

    public final void e() {
        boolean z = false;
        this.b.lock();
        try {
            if (this.j >= 0) {
                if (this.x != null) {
                    z = true;
                }
                defpackage.azb.a(z, (java.lang.Object) "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.x == null) {
                this.x = java.lang.Integer.valueOf(a((java.lang.Iterable) this.d.values(), false));
            } else if (this.x.intValue() == 2) {
                throw new java.lang.IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            a(this.x.intValue());
        } finally {
            this.b.unlock();
        }
    }

    public final void a(int i2) {
        boolean z = true;
        this.b.lock();
        if (!(i2 == 3 || i2 == 1 || i2 == 2)) {
            z = false;
        }
        try {
            defpackage.azb.b(z, (java.lang.Object) "Illegal sign-in mode: " + i2);
            b(i2);
            n();
        } finally {
            this.b.unlock();
        }
    }

    public final defpackage.axq f() {
        boolean z = true;
        defpackage.azb.a(android.os.Looper.myLooper() != android.os.Looper.getMainLooper(), (java.lang.Object) "blockingConnect must not be called on the UI thread");
        this.b.lock();
        try {
            if (this.j >= 0) {
                if (this.x == null) {
                    z = false;
                }
                defpackage.azb.a(z, (java.lang.Object) "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.x == null) {
                this.x = java.lang.Integer.valueOf(a((java.lang.Iterable) this.d.values(), false));
            } else if (this.x.intValue() == 2) {
                throw new java.lang.IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            b(this.x.intValue());
            this.h.e = true;
            return this.i.b();
        } finally {
            this.b.unlock();
        }
    }

    public final void g() {
        com.google.android.gms.common.api.internal.BasePendingResult[] basePendingResultArr;
        this.b.lock();
        try {
            defpackage.bbr bbr = this.g;
            for (com.google.android.gms.common.api.internal.BasePendingResult basePendingResult : (com.google.android.gms.common.api.internal.BasePendingResult[]) bbr.c.toArray(defpackage.bbr.b)) {
                basePendingResult.a((defpackage.bbs) null);
                if (basePendingResult.c()) {
                    bbr.c.remove(basePendingResult);
                }
            }
            if (this.i != null) {
                this.i.c();
            }
            defpackage.bbe bbe = this.v;
            for (defpackage.bba bba : bbe.a) {
                bba.b = null;
            }
            bbe.a.clear();
            for (defpackage.bca bca : this.c) {
                bca.a((defpackage.bbs) null);
                bca.a();
            }
            this.c.clear();
            if (this.i != null) {
                l();
                this.h.a();
                this.b.unlock();
            }
        } finally {
            this.b.unlock();
        }
    }

    public final void h() {
        g();
        e();
    }

    public final defpackage.ayt i() {
        defpackage.azb.a(j(), (java.lang.Object) "GoogleApiClient is not connected yet.");
        defpackage.azb.a(this.x.intValue() != 2, (java.lang.Object) "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        defpackage.bbn bbn = new defpackage.bbn((defpackage.ayp) this);
        if (this.d.containsKey(defpackage.bir.a)) {
            a((defpackage.ayp) this, bbn, false);
        } else {
            java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
            defpackage.azz azz = new defpackage.azz(this, atomicReference, bbn);
            defpackage.baa baa = new defpackage.baa(bbn);
            defpackage.ayq a = new defpackage.ayq(this.k).a(defpackage.bir.b);
            defpackage.azb.b((java.lang.Object) azz, (java.lang.Object) "Listener must not be null");
            a.e.add(azz);
            defpackage.azb.b((java.lang.Object) baa, (java.lang.Object) "Listener must not be null");
            a.f.add(baa);
            defpackage.bac bac = this.p;
            defpackage.azb.b((java.lang.Object) bac, (java.lang.Object) "Handler must not be null");
            a.d = bac.getLooper();
            defpackage.ayp a2 = a.a();
            atomicReference.set(a2);
            a2.e();
        }
        return bbn;
    }

    /* access modifiers changed from: private */
    public final void a(defpackage.ayp ayp, defpackage.bbn bbn, boolean z) {
        ayp.b((defpackage.bca) new defpackage.biv(ayp, 0)).a((defpackage.ayx) new defpackage.bab(this, bbn, z, ayp));
    }

    public final boolean j() {
        return this.i != null && this.i.d();
    }

    public final boolean k() {
        return this.i != null && this.i.e();
    }

    private final void b(int i2) {
        boolean z;
        if (this.x == null) {
            this.x = java.lang.Integer.valueOf(i2);
        } else if (this.x.intValue() != i2) {
            java.lang.String c2 = c(i2);
            java.lang.String c3 = c(this.x.intValue());
            throw new java.lang.IllegalStateException(new java.lang.StringBuilder(java.lang.String.valueOf(c2).length() + 51 + java.lang.String.valueOf(c3).length()).append("Cannot use sign-in mode: ").append(c2).append(". Mode was already set to ").append(c3).toString());
        }
        if (this.i == null) {
            boolean z2 = false;
            java.util.Iterator it = this.d.values().iterator();
            boolean z3 = false;
            while (true) {
                z = z2;
                if (!it.hasNext()) {
                    break;
                }
                defpackage.ayj ayj = (defpackage.ayj) it.next();
                if (ayj.h()) {
                    z3 = true;
                }
                if (ayj.c()) {
                    z2 = true;
                } else {
                    z2 = z;
                }
            }
            switch (this.x.intValue()) {
                case 1:
                    if (!z3) {
                        throw new java.lang.IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                    } else if (z) {
                        throw new java.lang.IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                    }
                    break;
                case 2:
                    if (z3) {
                        android.content.Context context = this.k;
                        java.util.concurrent.locks.Lock lock = this.b;
                        android.os.Looper looper = this.l;
                        defpackage.axt axt = this.q;
                        java.util.Map map = this.d;
                        defpackage.bdj bdj = this.s;
                        java.util.Map map2 = this.t;
                        defpackage.ayf ayf = this.u;
                        java.util.ArrayList arrayList = this.w;
                        defpackage.ayj ayj2 = null;
                        defpackage.qr qrVar = new defpackage.qr();
                        defpackage.qr qrVar2 = new defpackage.qr();
                        for (java.util.Map.Entry entry : map.entrySet()) {
                            defpackage.ayj ayj3 = (defpackage.ayj) entry.getValue();
                            if (ayj3.c()) {
                                ayj2 = ayj3;
                            }
                            if (ayj3.h()) {
                                qrVar.put((defpackage.ayh) entry.getKey(), ayj3);
                            } else {
                                qrVar2.put((defpackage.ayh) entry.getKey(), ayj3);
                            }
                        }
                        defpackage.azb.a(!qrVar.isEmpty(), (java.lang.Object) "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
                        defpackage.qr qrVar3 = new defpackage.qr();
                        defpackage.qr qrVar4 = new defpackage.qr();
                        for (defpackage.ayd ayd : map2.keySet()) {
                            defpackage.ayh b2 = ayd.b();
                            if (qrVar.containsKey(b2)) {
                                qrVar3.put(ayd, (java.lang.Boolean) map2.get(ayd));
                            } else if (qrVar2.containsKey(b2)) {
                                qrVar4.put(ayd, (java.lang.Boolean) map2.get(ayd));
                            } else {
                                throw new java.lang.IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                            }
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.util.ArrayList arrayList4 = arrayList;
                        int size = arrayList4.size();
                        int i3 = 0;
                        while (i3 < size) {
                            i3++;
                            defpackage.bch bch = (defpackage.bch) arrayList4.get(i3);
                            if (qrVar3.containsKey(bch.a)) {
                                arrayList2.add(bch);
                            } else {
                                if (qrVar4.containsKey(bch.a)) {
                                    arrayList3.add(bch);
                                } else {
                                    throw new java.lang.IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                                }
                            }
                        }
                        this.i = new defpackage.bcj(context, this, lock, looper, axt, qrVar, qrVar2, bdj, ayf, ayj2, arrayList2, arrayList3, qrVar3, qrVar4);
                        return;
                    }
                    break;
            }
            this.i = new defpackage.baf(this.k, this, this.b, this.l, this.q, this.d, this.s, this.t, this.u, this.w, this);
        }
    }

    private final void n() {
        this.h.e = true;
        this.i.a();
    }

    /* access modifiers changed from: 0000 */
    public final boolean l() {
        if (!this.m) {
            return false;
        }
        this.m = false;
        this.p.removeMessages(2);
        this.p.removeMessages(1);
        if (this.r != null) {
            this.r.a();
            this.r = null;
        }
        return true;
    }

    public final void a(defpackage.ayr ayr) {
        this.h.a(ayr);
    }

    public final void b(defpackage.ayr ayr) {
        defpackage.bem bem = this.h;
        defpackage.azb.b((java.lang.Object) ayr);
        synchronized (bem.i) {
            if (!bem.b.remove(ayr)) {
                java.lang.String valueOf = java.lang.String.valueOf(ayr);
                android.util.Log.w("GmsClientEvents", new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 52).append("unregisterConnectionCallbacks(): listener ").append(valueOf).append(" not found").toString());
            } else if (bem.g) {
                bem.c.add(ayr);
            }
        }
    }

    public final void a(defpackage.ays ays) {
        this.h.a(ays);
    }

    public final void b(defpackage.ays ays) {
        defpackage.bem bem = this.h;
        defpackage.azb.b((java.lang.Object) ays);
        synchronized (bem.i) {
            if (!bem.d.remove(ays)) {
                java.lang.String valueOf = java.lang.String.valueOf(ays);
                android.util.Log.w("GmsClientEvents", new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 57).append("unregisterConnectionFailedListener(): listener ").append(valueOf).append(" not found").toString());
            }
        }
    }

    public final void a(android.os.Bundle bundle) {
        boolean z;
        boolean z2 = true;
        int i2 = 0;
        while (!this.c.isEmpty()) {
            b((defpackage.bca) this.c.remove());
        }
        defpackage.bem bem = this.h;
        defpackage.azb.a(android.os.Looper.myLooper() == bem.h.getLooper(), (java.lang.Object) "onConnectionSuccess must only be called on the Handler thread");
        synchronized (bem.i) {
            if (!bem.g) {
                z = true;
            } else {
                z = false;
            }
            defpackage.azb.a(z);
            bem.h.removeMessages(1);
            bem.g = true;
            if (bem.c.size() != 0) {
                z2 = false;
            }
            defpackage.azb.a(z2);
            java.util.ArrayList arrayList = new java.util.ArrayList(bem.b);
            int i3 = bem.f.get();
            java.util.ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            while (i2 < size) {
                java.lang.Object obj = arrayList2.get(i2);
                i2++;
                defpackage.ayr ayr = (defpackage.ayr) obj;
                if (bem.e && bem.a.f() && bem.f.get() == i3) {
                    if (!bem.c.contains(ayr)) {
                        ayr.a(bundle);
                    }
                }
            }
            bem.c.clear();
            bem.g = false;
        }
    }

    public final void a(defpackage.axq axq) {
        int i2 = 0;
        if (!defpackage.axv.a(this.k, axq.b)) {
            l();
        }
        if (!this.m) {
            defpackage.bem bem = this.h;
            defpackage.azb.a(android.os.Looper.myLooper() == bem.h.getLooper(), (java.lang.Object) "onConnectionFailure must only be called on the Handler thread");
            bem.h.removeMessages(1);
            synchronized (bem.i) {
                java.util.ArrayList arrayList = new java.util.ArrayList(bem.d);
                int i3 = bem.f.get();
                java.util.ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    java.lang.Object obj = arrayList2.get(i2);
                    i2++;
                    defpackage.ays ays = (defpackage.ays) obj;
                    if (bem.e && bem.f.get() == i3) {
                        if (bem.d.contains(ays)) {
                            ays.a(axq);
                        }
                    }
                }
            }
            this.h.a();
        }
    }

    public final void a(int i2, boolean z) {
        int i3 = 0;
        if (i2 == 1 && !z && !this.m) {
            this.m = true;
            if (this.r == null) {
                this.r = defpackage.axt.a(this.k.getApplicationContext(), (defpackage.bas) new defpackage.bad(this));
            }
            this.p.sendMessageDelayed(this.p.obtainMessage(1), this.n);
            this.p.sendMessageDelayed(this.p.obtainMessage(2), this.o);
        }
        for (com.google.android.gms.common.api.internal.BasePendingResult b2 : (com.google.android.gms.common.api.internal.BasePendingResult[]) this.g.c.toArray(defpackage.bbr.b)) {
            b2.b(defpackage.bbr.a);
        }
        defpackage.bem bem = this.h;
        defpackage.azb.a(android.os.Looper.myLooper() == bem.h.getLooper(), (java.lang.Object) "onUnintentionalDisconnection must only be called on the Handler thread");
        bem.h.removeMessages(1);
        synchronized (bem.i) {
            bem.g = true;
            java.util.ArrayList arrayList = new java.util.ArrayList(bem.b);
            int i4 = bem.f.get();
            java.util.ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            while (i3 < size) {
                java.lang.Object obj = arrayList2.get(i3);
                i3++;
                defpackage.ayr ayr = (defpackage.ayr) obj;
                if (bem.e && bem.f.get() == i4) {
                    if (bem.b.contains(ayr)) {
                        ayr.a(i2);
                    }
                }
            }
            bem.c.clear();
            bem.g = false;
        }
        this.h.a();
        if (i2 == 2) {
            n();
        }
    }

    public final android.content.Context b() {
        return this.k;
    }

    public final android.os.Looper c() {
        return this.l;
    }

    public final boolean a(defpackage.bbh bbh) {
        return this.i != null && this.i.a(bbh);
    }

    public final void d() {
        if (this.i != null) {
            this.i.f();
        }
    }

    /* access modifiers changed from: 0000 */
    public final java.lang.String m() {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        a("", null, new java.io.PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    public final void a(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.k);
        printWriter.append(str).append("mResuming=").print(this.m);
        printWriter.append(" mWorkQueue.size()=").print(this.c.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.g.c.size());
        if (this.i != null) {
            this.i.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Iterable, code=java.lang.Iterable<ayj>, for r6v0, types: [java.lang.Iterable<ayj>, java.lang.Iterable] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.Iterable<defpackage.ayj> r6, boolean r7) {
        /*
            r0 = 0
            r3 = 1
            java.util.Iterator r4 = r6.iterator()
            r1 = r0
            r2 = r0
        L_0x0008:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = r4.next()
            ayj r0 = (defpackage.ayj) r0
            boolean r5 = r0.h()
            if (r5 == 0) goto L_0x001b
            r2 = r3
        L_0x001b:
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x002e
            r0 = r3
        L_0x0022:
            r1 = r0
            goto L_0x0008
        L_0x0024:
            if (r2 == 0) goto L_0x002c
            if (r1 == 0) goto L_0x002b
            if (r7 == 0) goto L_0x002b
            r3 = 2
        L_0x002b:
            return r3
        L_0x002c:
            r3 = 3
            goto L_0x002b
        L_0x002e:
            r0 = r1
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azx.a(java.lang.Iterable, boolean):int");
    }

    private static java.lang.String c(int i2) {
        switch (i2) {
            case 1:
                return "SIGN_IN_MODE_REQUIRED";
            case 2:
                return "SIGN_IN_MODE_OPTIONAL";
            case 3:
                return "SIGN_IN_MODE_NONE";
            default:
                return "UNKNOWN";
        }
    }

    static /* synthetic */ void a(defpackage.azx azx) {
        azx.b.lock();
        try {
            if (azx.m) {
                azx.n();
            }
        } finally {
            azx.b.unlock();
        }
    }

    static /* synthetic */ void b(defpackage.azx azx) {
        azx.b.lock();
        try {
            if (azx.l()) {
                azx.n();
            }
        } finally {
            azx.b.unlock();
        }
    }
}
