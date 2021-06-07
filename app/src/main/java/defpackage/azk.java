package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* renamed from: azk  reason: default package */
/* compiled from: PG */
public final class azk implements bae {
    public final baf a;
    public final Lock b;
    public final Context c;
    public bps d;
    public boolean e;
    public boolean f;
    public bdp g;
    public boolean h;
    public boolean i;
    public final bdj j;
    private final axv k;
    private axq l;
    private int m;
    private int n = 0;
    private int o;
    private final Bundle p = new Bundle();
    private final Set q = new HashSet();
    private boolean r;
    private final Map s;
    private final ayf t;
    private ArrayList u = new ArrayList();

    public azk(baf baf, bdj bdj, Map map, axv axv, ayf ayf, Lock lock, Context context) {
        this.a = baf;
        this.j = bdj;
        this.s = map;
        this.k = axv;
        this.t = ayf;
        this.b = lock;
        this.c = context;
    }

    @Override // defpackage.bae
    public final void a() {
        this.a.g.clear();
        this.e = false;
        this.l = null;
        this.n = 0;
        this.r = true;
        this.f = false;
        this.h = false;
        HashMap hashMap = new HashMap();
        for (ayd ayd : this.s.keySet()) {
            ayj ayj = (ayj) this.a.f.get(ayd.b());
            boolean booleanValue = ((Boolean) this.s.get(ayd)).booleanValue();
            if (ayj.h()) {
                this.e = true;
                if (booleanValue) {
                    this.q.add(ayd.b());
                } else {
                    this.r = false;
                }
            }
            hashMap.put(ayj, new azm(this, ayd, booleanValue));
        }
        if (this.e) {
            this.j.h = Integer.valueOf(System.identityHashCode(this.a.m));
            azt azt = new azt(this);
            this.d = (bps) this.t.a(this.c, this.a.m.c(), this.j, this.j.g, azt, azt);
        }
        this.o = this.a.f.size();
        this.u.add(bai.a.submit(new azn(this, hashMap)));
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        this.o--;
        if (this.o > 0) {
            return false;
        }
        if (this.o < 0) {
            Log.w("GoogleApiClientConnecting", this.a.m.m());
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            b(new axq(8, null));
            return false;
        } else if (this.l == null) {
            return true;
        } else {
            this.a.l = this.m;
            b(this.l);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        if (this.o == 0) {
            if (!this.e || this.f) {
                ArrayList arrayList = new ArrayList();
                this.n = 1;
                this.o = this.a.f.size();
                for (ayh ayh : this.a.f.keySet()) {
                    if (!this.a.g.containsKey(ayh)) {
                        arrayList.add((ayj) this.a.f.get(ayh));
                    } else if (d()) {
                        g();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.u.add(bai.a.submit(new azq(this, arrayList)));
                }
            }
        }
    }

    @Override // defpackage.bae
    public final void a(Bundle bundle) {
        if (b(1)) {
            if (bundle != null) {
                this.p.putAll(bundle);
            }
            if (d()) {
                g();
            }
        }
    }

    @Override // defpackage.bae
    public final void a(axq axq, ayd ayd, boolean z) {
        if (b(1)) {
            b(axq, ayd, z);
            if (d()) {
                g();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private final void g() {
        baf baf = this.a;
        baf.a.lock();
        try {
            baf.m.l();
            baf.k = new azi(baf);
            baf.k.a();
            baf.b.signalAll();
            baf.a.unlock();
            bai.a.execute(new azl(this));
            if (this.d != null) {
                if (this.h) {
                    this.d.a(this.g, this.i);
                }
                a(false);
            }
            for (ayh ayh : this.a.g.keySet()) {
                ((ayj) this.a.f.get(ayh)).e();
            }
            this.a.n.a(this.p.isEmpty() ? null : this.p);
        } catch (Throwable th) {
            baf.a.unlock();
            throw th;
        }
    }

    @Override // defpackage.bae
    public final bca a(bca bca) {
        this.a.m.c.add(bca);
        return bca;
    }

    @Override // defpackage.bae
    public final bca b(bca bca) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // defpackage.bae
    public final void c() {
    }

    @Override // defpackage.bae
    public final boolean b() {
        h();
        a(true);
        this.a.a((axq) null);
        return true;
    }

    @Override // defpackage.bae
    public final void a(int i2) {
        b(new axq(8, null));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r2 != false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (Integer.MAX_VALUE >= r5.m) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(defpackage.axq r6, defpackage.ayd r7, boolean r8) {
        /*
            r5 = this;
            r4 = 0
            r3 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
            r0 = 1
            if (r8 == 0) goto L_0x0011
            boolean r2 = r6.a()
            if (r2 == 0) goto L_0x002b
            r2 = r0
        L_0x000f:
            if (r2 == 0) goto L_0x0037
        L_0x0011:
            axq r2 = r5.l
            if (r2 == 0) goto L_0x0019
            int r2 = r5.m
            if (r3 >= r2) goto L_0x0037
        L_0x0019:
            if (r0 == 0) goto L_0x001f
            r5.l = r6
            r5.m = r3
        L_0x001f:
            baf r0 = r5.a
            java.util.Map r0 = r0.g
            ayh r1 = r7.b()
            r0.put(r1, r6)
            return
        L_0x002b:
            int r2 = r6.b
            android.content.Intent r2 = defpackage.axv.a(r4, r2, r4)
            if (r2 == 0) goto L_0x0035
            r2 = r0
            goto L_0x000f
        L_0x0035:
            r2 = r1
            goto L_0x000f
        L_0x0037:
            r0 = r1
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azk.b(axq, ayd, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        this.e = false;
        this.a.m.e = Collections.emptySet();
        for (ayh ayh : this.q) {
            if (!this.a.g.containsKey(ayh)) {
                this.a.g.put(ayh, new axq(17, null));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(axq axq) {
        return this.r && !axq.a();
    }

    /* access modifiers changed from: package-private */
    public final void b(axq axq) {
        h();
        a(!axq.a());
        this.a.a(axq);
        this.a.n.a(axq);
    }

    private final void a(boolean z) {
        if (this.d != null) {
            if (this.d.f() && z) {
                this.d.q();
            }
            this.d.e();
            this.g = null;
        }
    }

    private final void h() {
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((Future) obj).cancel(true);
        }
        this.u.clear();
    }

    /* access modifiers changed from: package-private */
    public final boolean b(int i2) {
        if (this.n == i2) {
            return true;
        }
        Log.w("GoogleApiClientConnecting", this.a.m.m());
        String valueOf = String.valueOf(this);
        Log.w("GoogleApiClientConnecting", new StringBuilder(String.valueOf(valueOf).length() + 23).append("Unexpected callback in ").append(valueOf).toString());
        Log.w("GoogleApiClientConnecting", new StringBuilder(33).append("mRemainingConnections=").append(this.o).toString());
        String c2 = c(this.n);
        String c3 = c(i2);
        Log.wtf("GoogleApiClientConnecting", new StringBuilder(String.valueOf(c2).length() + 70 + String.valueOf(c3).length()).append("GoogleApiClient connecting is in step ").append(c2).append(" but received callback for step ").append(c3).toString(), new Exception());
        b(new axq(8, null));
        return false;
    }

    private static String c(int i2) {
        switch (i2) {
            case 0:
                return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            case 1:
                return "STEP_GETTING_REMOTE_SERVICE";
            default:
                return "UNKNOWN";
        }
    }
}
