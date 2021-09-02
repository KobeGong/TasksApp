package defpackage;

/* renamed from: baj reason: default package */
/* compiled from: PG */
public final class baj implements android.os.Handler.Callback {
    public static final com.google.android.gms.common.api.Status a = new com.google.android.gms.common.api.Status(4, "Sign-out occurred while this API call was in progress.");
    public static final com.google.android.gms.common.api.Status b = new com.google.android.gms.common.api.Status(4, "The user must be signed in to make this API call.");
    public static final java.lang.Object c = new java.lang.Object();
    public static defpackage.baj d;
    public final java.util.concurrent.atomic.AtomicInteger e = new java.util.concurrent.atomic.AtomicInteger(1);
    public final java.util.concurrent.atomic.AtomicInteger f = new java.util.concurrent.atomic.AtomicInteger(0);
    public final android.os.Handler g;
    /* access modifiers changed from: private */
    public long h = 5000;
    /* access modifiers changed from: private */
    public long i = 120000;
    /* access modifiers changed from: private */
    public long j = 10000;
    /* access modifiers changed from: private */
    public final android.content.Context k;
    /* access modifiers changed from: private */
    public final defpackage.axt l;
    /* access modifiers changed from: private */
    public int m = -1;
    /* access modifiers changed from: private */
    public final java.util.Map n = new java.util.concurrent.ConcurrentHashMap(5, 0.75f, 1);
    private final java.util.Set o = new defpackage.qt();
    private final java.util.Set p = new defpackage.qt();

    public static defpackage.baj a(android.content.Context context) {
        defpackage.baj baj;
        synchronized (c) {
            if (d == null) {
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                d = new defpackage.baj(context.getApplicationContext(), handlerThread.getLooper(), defpackage.axt.a);
            }
            baj = d;
        }
        return baj;
    }

    private baj(android.content.Context context, android.os.Looper looper, defpackage.axt axt) {
        this.k = context;
        this.g = new android.os.Handler(looper, this);
        this.l = axt;
        this.g.sendMessage(this.g.obtainMessage(6));
    }

    private final void a(defpackage.ayn ayn) {
        defpackage.bbu bbu = ayn.c;
        defpackage.bak bak = (defpackage.bak) this.n.get(bbu);
        if (bak == null) {
            bak = new defpackage.bak(this, ayn);
            this.n.put(bbu, bak);
        }
        if (bak.j()) {
            this.p.add(bbu);
        }
        bak.h();
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Iterable, code=java.lang.Iterable<ayn>, for r6v0, types: [java.lang.Iterable<ayn>, java.lang.Iterable] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.bpv a(java.lang.Iterable<defpackage.ayn> r6) {
        /*
            r5 = this;
            bbx r2 = new bbx
            r2.<init>(r6)
            java.util.Iterator r3 = r6.iterator()
        L_0x0009:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0046
            java.lang.Object r0 = r3.next()
            ayn r0 = (defpackage.ayn) r0
            java.util.Map r1 = r5.n
            bbu r4 = r0.c
            java.lang.Object r1 = r1.get(r4)
            bak r1 = (defpackage.bak) r1
            if (r1 == 0) goto L_0x0027
            boolean r4 = r1.i()
            if (r4 != 0) goto L_0x0038
        L_0x0027:
            android.os.Handler r0 = r5.g
            android.os.Handler r1 = r5.g
            r3 = 2
            android.os.Message r1 = r1.obtainMessage(r3, r2)
            r0.sendMessage(r1)
            bpw r0 = r2.b
            bqa r0 = r0.a
        L_0x0037:
            return r0
        L_0x0038:
            bbu r0 = r0.c
            axq r4 = defpackage.axq.a
            ayj r1 = r1.a
            java.lang.String r1 = r1.j()
            r2.a(r0, r4, r1)
            goto L_0x0009
        L_0x0046:
            bpw r0 = r2.b
            bqa r0 = r0.a
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baj.a(java.lang.Iterable):bpv");
    }

    public final void a() {
        this.g.sendMessage(this.g.obtainMessage(3));
    }

    public final boolean handleMessage(android.os.Message message) {
        com.google.android.gms.common.api.Status status;
        defpackage.bak bak;
        long j2;
        boolean z = false;
        switch (message.what) {
            case 1:
                if (((java.lang.Boolean) message.obj).booleanValue()) {
                    j2 = 10000;
                } else {
                    j2 = 300000;
                }
                this.j = j2;
                this.g.removeMessages(12);
                for (defpackage.bbu obtainMessage : this.n.keySet()) {
                    this.g.sendMessageDelayed(this.g.obtainMessage(12, obtainMessage), this.j);
                }
                break;
            case 2:
                defpackage.bbx bbx = (defpackage.bbx) message.obj;
                java.util.Iterator it = bbx.a.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        defpackage.bbu bbu = (defpackage.bbu) it.next();
                        defpackage.bak bak2 = (defpackage.bak) this.n.get(bbu);
                        if (bak2 == null) {
                            bbx.a(bbu, new defpackage.axq(13), null);
                            break;
                        } else if (bak2.i()) {
                            bbx.a(bbu, defpackage.axq.a, bak2.a.j());
                        } else if (bak2.e() != null) {
                            bbx.a(bbu, bak2.e(), null);
                        } else {
                            defpackage.azb.a(bak2.g.g);
                            bak2.c.add(bbx);
                        }
                    }
                }
            case 3:
                for (defpackage.bak bak3 : this.n.values()) {
                    bak3.d();
                    bak3.h();
                }
                break;
            case 4:
            case 8:
            case 13:
                defpackage.bbf bbf = (defpackage.bbf) message.obj;
                defpackage.bak bak4 = (defpackage.bak) this.n.get(bbf.c.c);
                if (bak4 == null) {
                    a(bbf.c);
                    bak4 = (defpackage.bak) this.n.get(bbf.c.c);
                }
                if (bak4.j() && this.f.get() != bbf.b) {
                    bbf.a.a(a);
                    bak4.c();
                    break;
                } else {
                    bak4.a(bbf.a);
                    break;
                }
                break;
            case 5:
                int i2 = message.arg1;
                defpackage.axq axq = (defpackage.axq) message.obj;
                java.util.Iterator it2 = this.n.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        bak = (defpackage.bak) it2.next();
                        if (bak.e == i2) {
                        }
                    } else {
                        bak = null;
                    }
                }
                if (bak == null) {
                    android.util.Log.wtf("GoogleApiManager", "Could not find API instance " + i2 + " while trying to fail enqueued calls.", new java.lang.Exception());
                    break;
                } else {
                    java.lang.String b2 = defpackage.axv.b(axq.b);
                    java.lang.String str = axq.d;
                    bak.a(new com.google.android.gms.common.api.Status(17, new java.lang.StringBuilder(java.lang.String.valueOf(b2).length() + 69 + java.lang.String.valueOf(str).length()).append("Error resolution was canceled by the user, original error message: ").append(b2).append(": ").append(str).toString()));
                    break;
                }
            case 6:
                if (this.k.getApplicationContext() instanceof android.app.Application) {
                    android.app.Application application = (android.app.Application) this.k.getApplicationContext();
                    synchronized (defpackage.bby.a) {
                        if (!defpackage.bby.a.e) {
                            application.registerActivityLifecycleCallbacks(defpackage.bby.a);
                            application.registerComponentCallbacks(defpackage.bby.a);
                            defpackage.bby.a.e = true;
                        }
                    }
                    defpackage.bby bby = defpackage.bby.a;
                    defpackage.bbz bbz = new defpackage.bbz(this);
                    synchronized (defpackage.bby.a) {
                        bby.d.add(bbz);
                    }
                    defpackage.bby bby2 = defpackage.bby.a;
                    if (!bby2.c.get()) {
                        android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
                        android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!bby2.c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            bby2.b.set(true);
                        }
                    }
                    if (!bby2.b.get()) {
                        this.j = 300000;
                        break;
                    }
                }
                break;
            case 7:
                a((defpackage.ayn) message.obj);
                break;
            case 9:
                if (this.n.containsKey(message.obj)) {
                    defpackage.bak bak5 = (defpackage.bak) this.n.get(message.obj);
                    defpackage.azb.a(bak5.g.g);
                    if (bak5.f) {
                        bak5.h();
                        break;
                    }
                }
                break;
            case 10:
                for (defpackage.bbu remove : this.p) {
                    ((defpackage.bak) this.n.remove(remove)).c();
                }
                this.p.clear();
                break;
            case 11:
                if (this.n.containsKey(message.obj)) {
                    defpackage.bak bak6 = (defpackage.bak) this.n.get(message.obj);
                    defpackage.azb.a(bak6.g.g);
                    if (bak6.f) {
                        bak6.f();
                        if (defpackage.axv.a(bak6.g.k) == 18) {
                            status = new com.google.android.gms.common.api.Status(8, "Connection timed out while waiting for Google Play services update to complete.");
                        } else {
                            status = new com.google.android.gms.common.api.Status(8, "API failed to connect while resuming due to an unknown error.");
                        }
                        bak6.a(status);
                        bak6.a.e();
                        break;
                    }
                }
                break;
            case 12:
                if (this.n.containsKey(message.obj)) {
                    defpackage.bak bak7 = (defpackage.bak) this.n.get(message.obj);
                    defpackage.azb.a(bak7.g.g);
                    if (bak7.a.f() && bak7.d.size() == 0) {
                        defpackage.aze aze = bak7.b;
                        if (!aze.a.isEmpty() || !aze.b.isEmpty()) {
                            z = true;
                        }
                        if (!z) {
                            bak7.a.e();
                            break;
                        } else {
                            bak7.g();
                            break;
                        }
                    }
                }
                break;
            default:
                android.util.Log.w("GoogleApiManager", "Unknown message id: " + message.what);
                return false;
        }
        return true;
    }

    public final boolean a(defpackage.axq axq, int i2) {
        android.app.PendingIntent a2;
        defpackage.axt axt = this.l;
        android.content.Context context = this.k;
        if (axq.a()) {
            a2 = axq.c;
        } else {
            a2 = defpackage.axv.a(context, axq.b, 0, null);
        }
        if (a2 == null) {
            return false;
        }
        axt.a(context, axq.b, android.app.PendingIntent.getActivity(context, 0, com.google.android.gms.common.api.GoogleApiActivity.a(context, a2, i2, true), 134217728));
        return true;
    }

    static /* synthetic */ defpackage.azg b() {
        return null;
    }
}
