package defpackage;

/* renamed from: bcj reason: default package */
/* compiled from: PG */
final class bcj implements defpackage.bau {
    public final defpackage.baf a;
    public final defpackage.baf b;
    public android.os.Bundle c;
    public defpackage.axq d = null;
    public defpackage.axq e = null;
    public boolean f = false;
    public final java.util.concurrent.locks.Lock g;
    private final android.content.Context h;
    private final defpackage.azx i;
    private final android.os.Looper j;
    private final java.util.Map k;
    private final java.util.Set l = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());
    private final defpackage.ayj m;
    private int n = 0;

    bcj(android.content.Context context, defpackage.azx azx, java.util.concurrent.locks.Lock lock, android.os.Looper looper, defpackage.axv axv, java.util.Map map, java.util.Map map2, defpackage.bdj bdj, defpackage.ayf ayf, defpackage.ayj ayj, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.Map map3, java.util.Map map4) {
        this.h = context;
        this.i = azx;
        this.g = lock;
        this.j = looper;
        this.m = ayj;
        this.a = new defpackage.baf(context, this.i, lock, looper, axv, map2, null, map4, null, arrayList2, new defpackage.bcl(this));
        this.b = new defpackage.baf(context, this.i, lock, looper, axv, map, bdj, map3, ayf, arrayList, new defpackage.bcm(this));
        defpackage.qr qrVar = new defpackage.qr();
        for (defpackage.ayh put : map2.keySet()) {
            qrVar.put(put, this.a);
        }
        for (defpackage.ayh put2 : map.keySet()) {
            qrVar.put(put2, this.b);
        }
        this.k = java.util.Collections.unmodifiableMap(qrVar);
    }

    public final defpackage.bca a(defpackage.bca bca) {
        if (!c(bca)) {
            return this.a.a(bca);
        }
        if (!h()) {
            return this.b.a(bca);
        }
        bca.c(new com.google.android.gms.common.api.Status(4, null, i()));
        return bca;
    }

    public final defpackage.bca b(defpackage.bca bca) {
        if (!c(bca)) {
            return this.a.b(bca);
        }
        if (!h()) {
            return this.b.b(bca);
        }
        bca.c(new com.google.android.gms.common.api.Status(4, null, i()));
        return bca;
    }

    public final void a() {
        this.n = 2;
        this.f = false;
        this.e = null;
        this.d = null;
        this.a.a();
        this.b.a();
    }

    public final defpackage.axq b() {
        throw new java.lang.UnsupportedOperationException();
    }

    public final void c() {
        this.e = null;
        this.d = null;
        this.n = 0;
        this.a.c();
        this.b.c();
        g();
    }

    public final boolean d() {
        boolean z = true;
        this.g.lock();
        try {
            if (!this.a.d() || (!this.b.d() && !h() && this.n != 1)) {
                z = false;
            }
            return z;
        } finally {
            this.g.unlock();
        }
    }

    public final boolean e() {
        this.g.lock();
        try {
            return this.n == 2;
        } finally {
            this.g.unlock();
        }
    }

    public final boolean a(defpackage.bbh bbh) {
        this.g.lock();
        try {
            if ((e() || d()) && !this.b.d()) {
                this.l.add(bbh);
                if (this.n == 0) {
                    this.n = 1;
                }
                this.e = null;
                this.b.a();
                return true;
            }
            this.g.unlock();
            return false;
        } finally {
            this.g.unlock();
        }
    }

    public final void f() {
        this.g.lock();
        try {
            boolean e2 = e();
            this.b.c();
            this.e = new defpackage.axq(4);
            if (e2) {
                new android.os.Handler(this.j).post(new defpackage.bck(this));
            } else {
                g();
            }
        } finally {
            this.g.unlock();
        }
    }

    private final void a(defpackage.axq axq) {
        switch (this.n) {
            case 1:
                break;
            case 2:
                this.i.a(axq);
                break;
            default:
                android.util.Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new java.lang.Exception());
                break;
        }
        g();
        this.n = 0;
    }

    private final void g() {
        for (defpackage.bbh g2 : this.l) {
            g2.g();
        }
        this.l.clear();
    }

    private final boolean h() {
        return this.e != null && this.e.b == 4;
    }

    private final boolean c(defpackage.bca bca) {
        defpackage.ayh ayh = bca.c;
        defpackage.azb.b(this.k.containsKey(ayh), (java.lang.Object) "GoogleApiClient is not configured to use the API required for this call.");
        return ((defpackage.baf) this.k.get(ayh)).equals(this.b);
    }

    private final android.app.PendingIntent i() {
        if (this.m == null) {
            return null;
        }
        return android.app.PendingIntent.getActivity(this.h, java.lang.System.identityHashCode(this.i), this.m.d(), 134217728);
    }

    private static boolean b(defpackage.axq axq) {
        return axq != null && axq.b();
    }

    public final void a(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.b.a(java.lang.String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.a.a(java.lang.String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    static /* synthetic */ void a(defpackage.bcj bcj) {
        if (b(bcj.d)) {
            if (b(bcj.e) || bcj.h()) {
                switch (bcj.n) {
                    case 1:
                        break;
                    case 2:
                        bcj.i.a(bcj.c);
                        break;
                    default:
                        android.util.Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new java.lang.AssertionError());
                        break;
                }
                bcj.g();
                bcj.n = 0;
            } else if (bcj.e == null) {
            } else {
                if (bcj.n == 1) {
                    bcj.g();
                    return;
                }
                bcj.a(bcj.e);
                bcj.a.c();
            }
        } else if (bcj.d != null && b(bcj.e)) {
            bcj.b.c();
            bcj.a(bcj.d);
        } else if (bcj.d != null && bcj.e != null) {
            defpackage.axq axq = bcj.d;
            if (bcj.b.l < bcj.a.l) {
                axq = bcj.e;
            }
            bcj.a(axq);
        }
    }

    static /* synthetic */ void a(defpackage.bcj bcj, int i2, boolean z) {
        bcj.i.a(i2, z);
        bcj.e = null;
        bcj.d = null;
    }
}
