package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* access modifiers changed from: package-private */
/* renamed from: bcj  reason: default package */
/* compiled from: PG */
public final class bcj implements bau {
    public final baf a;
    public final baf b;
    public Bundle c;
    public axq d = null;
    public axq e = null;
    public boolean f = false;
    public final Lock g;
    private final Context h;
    private final azx i;
    private final Looper j;
    private final Map k;
    private final Set l = Collections.newSetFromMap(new WeakHashMap());
    private final ayj m;
    private int n = 0;

    bcj(Context context, azx azx, Lock lock, Looper looper, axv axv, Map map, Map map2, bdj bdj, ayf ayf, ayj ayj, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.h = context;
        this.i = azx;
        this.g = lock;
        this.j = looper;
        this.m = ayj;
        this.a = new baf(context, this.i, lock, looper, axv, map2, null, map4, null, arrayList2, new bcl(this));
        this.b = new baf(context, this.i, lock, looper, axv, map, bdj, map3, ayf, arrayList, new bcm(this));
        qr qrVar = new qr();
        for (ayh ayh : map2.keySet()) {
            qrVar.put(ayh, this.a);
        }
        for (ayh ayh2 : map.keySet()) {
            qrVar.put(ayh2, this.b);
        }
        this.k = Collections.unmodifiableMap(qrVar);
    }

    @Override // defpackage.bau
    public final bca a(bca bca) {
        if (!c(bca)) {
            return this.a.a(bca);
        }
        if (!h()) {
            return this.b.a(bca);
        }
        bca.c(new Status(4, null, i()));
        return bca;
    }

    @Override // defpackage.bau
    public final bca b(bca bca) {
        if (!c(bca)) {
            return this.a.b(bca);
        }
        if (!h()) {
            return this.b.b(bca);
        }
        bca.c(new Status(4, null, i()));
        return bca;
    }

    @Override // defpackage.bau
    public final void a() {
        this.n = 2;
        this.f = false;
        this.e = null;
        this.d = null;
        this.a.a();
        this.b.a();
    }

    @Override // defpackage.bau
    public final axq b() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.bau
    public final void c() {
        this.e = null;
        this.d = null;
        this.n = 0;
        this.a.c();
        this.b.c();
        g();
    }

    @Override // defpackage.bau
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

    @Override // defpackage.bau
    public final boolean e() {
        this.g.lock();
        try {
            return this.n == 2;
        } finally {
            this.g.unlock();
        }
    }

    @Override // defpackage.bau
    public final boolean a(bbh bbh) {
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

    @Override // defpackage.bau
    public final void f() {
        this.g.lock();
        try {
            boolean e2 = e();
            this.b.c();
            this.e = new axq(4);
            if (e2) {
                new Handler(this.j).post(new bck(this));
            } else {
                g();
            }
        } finally {
            this.g.unlock();
        }
    }

    private final void a(axq axq) {
        switch (this.n) {
            case 2:
                this.i.a(axq);
            case 1:
                g();
                break;
            default:
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                break;
        }
        this.n = 0;
    }

    private final void g() {
        for (bbh bbh : this.l) {
            bbh.g();
        }
        this.l.clear();
    }

    private final boolean h() {
        return this.e != null && this.e.b == 4;
    }

    private final boolean c(bca bca) {
        ayh ayh = bca.c;
        azb.b(this.k.containsKey(ayh), "GoogleApiClient is not configured to use the API required for this call.");
        return ((baf) this.k.get(ayh)).equals(this.b);
    }

    private final PendingIntent i() {
        if (this.m == null) {
            return null;
        }
        return PendingIntent.getActivity(this.h, System.identityHashCode(this.i), this.m.d(), 134217728);
    }

    private static boolean b(axq axq) {
        return axq != null && axq.b();
    }

    @Override // defpackage.bau
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.b.a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.a.a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    static /* synthetic */ void a(bcj bcj) {
        if (b(bcj.d)) {
            if (b(bcj.e) || bcj.h()) {
                switch (bcj.n) {
                    case 2:
                        bcj.i.a(bcj.c);
                    case 1:
                        bcj.g();
                        break;
                    default:
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        break;
                }
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
            axq axq = bcj.d;
            if (bcj.b.l < bcj.a.l) {
                axq = bcj.e;
            }
            bcj.a(axq);
        }
    }

    static /* synthetic */ void a(bcj bcj, int i2, boolean z) {
        bcj.i.a(i2, z);
        bcj.e = null;
        bcj.d = null;
    }
}
