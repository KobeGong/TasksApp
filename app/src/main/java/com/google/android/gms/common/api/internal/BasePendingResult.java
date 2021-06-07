package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
/* compiled from: PG */
public abstract class BasePendingResult extends ayt {
    private static final ThreadLocal c = new bcg();
    public final Object a;
    public bet b;
    private ayy d;
    private WeakReference e;
    private final CountDownLatch f;
    private final ArrayList g;
    private ayx h;
    private final AtomicReference i;
    private ayw j;
    private Status k;
    private volatile boolean l;
    private boolean m;
    @KeepName
    public ayz mResultGuardian;
    private boolean n;
    private volatile bbq o;
    private boolean p;

    @Deprecated
    BasePendingResult() {
        this.a = new Object();
        this.f = new CountDownLatch(1);
        this.g = new ArrayList();
        this.i = new AtomicReference();
        this.p = false;
        this.d = new ayy(Looper.getMainLooper());
        this.e = new WeakReference(null);
    }

    public abstract ayw a(Status status);

    public BasePendingResult(ayp ayp) {
        this.a = new Object();
        this.f = new CountDownLatch(1);
        this.g = new ArrayList();
        this.i = new AtomicReference();
        this.p = false;
        this.d = new ayy(ayp != null ? ayp.c() : Looper.getMainLooper());
        this.e = new WeakReference(ayp);
    }

    @Deprecated
    public BasePendingResult(Looper looper) {
        this.a = new Object();
        this.f = new CountDownLatch(1);
        this.g = new ArrayList();
        this.i = new AtomicReference();
        this.p = false;
        this.d = new ayy(looper);
        this.e = new WeakReference(null);
    }

    private final boolean e() {
        return this.f.getCount() == 0;
    }

    @Override // defpackage.ayt
    public final void a(ayx ayx) {
        boolean z = true;
        synchronized (this.a) {
            if (this.l) {
                z = false;
            }
            azb.a(z, "Result has already been consumed.");
            bbq bbq = this.o;
            azb.a(true, (Object) "Cannot set callbacks if then() has been called.");
            if (!b()) {
                if (e()) {
                    this.d.a(ayx, f());
                } else {
                    this.h = ayx;
                }
            }
        }
    }

    @Override // defpackage.ayt
    public final void a(ayu ayu) {
        azb.b(true, (Object) "Callback cannot be null.");
        synchronized (this.a) {
            if (e()) {
                ayu.a(this.k);
            } else {
                this.g.add(ayu);
            }
        }
    }

    @Override // defpackage.ayt
    public final void a() {
        synchronized (this.a) {
            if (!this.m && !this.l) {
                if (this.b != null) {
                    try {
                        this.b.a();
                    } catch (RemoteException e2) {
                    }
                }
                b(this.j);
                this.m = true;
                c(a(Status.e));
            }
        }
    }

    public final boolean c() {
        boolean b2;
        synchronized (this.a) {
            if (((ayp) this.e.get()) == null || !this.p) {
                a();
            }
            b2 = b();
        }
        return b2;
    }

    @Override // defpackage.ayt
    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            z = this.m;
        }
        return z;
    }

    public final void a(ayw ayw) {
        boolean z;
        boolean z2 = true;
        synchronized (this.a) {
            if (this.n || this.m) {
                b(ayw);
                return;
            }
            if (e()) {
            }
            if (!e()) {
                z = true;
            } else {
                z = false;
            }
            azb.a(z, "Results have already been set");
            if (this.l) {
                z2 = false;
            }
            azb.a(z2, "Result has already been consumed");
            c(ayw);
        }
    }

    public final void b(Status status) {
        synchronized (this.a) {
            if (!e()) {
                a(a(status));
                this.n = true;
            }
        }
    }

    public final void a(bbs bbs) {
        this.i.set(bbs);
    }

    public final void d() {
        this.p = this.p || ((Boolean) c.get()).booleanValue();
    }

    private final ayw f() {
        ayw ayw;
        boolean z = true;
        synchronized (this.a) {
            if (this.l) {
                z = false;
            }
            azb.a(z, "Result has already been consumed.");
            azb.a(e(), "Result is not ready.");
            ayw = this.j;
            this.j = null;
            this.h = null;
            this.l = true;
        }
        bbs bbs = (bbs) this.i.getAndSet(null);
        if (bbs != null) {
            bbs.a(this);
        }
        return ayw;
    }

    private final void c(ayw ayw) {
        this.j = ayw;
        this.b = null;
        this.f.countDown();
        this.k = this.j.b();
        if (this.m) {
            this.h = null;
        } else if (this.h != null) {
            this.d.removeMessages(2);
            this.d.a(this.h, f());
        } else if (this.j instanceof ayv) {
            this.mResultGuardian = new ayz(this);
        }
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((ayu) obj).a(this.k);
        }
        this.g.clear();
    }

    public static void b(ayw ayw) {
        if (ayw instanceof ayv) {
            try {
                ((ayv) ayw).a();
            } catch (RuntimeException e2) {
                String valueOf = String.valueOf(ayw);
                Log.w("BasePendingResult", new StringBuilder(String.valueOf(valueOf).length() + 18).append("Unable to release ").append(valueOf).toString(), e2);
            }
        }
    }
}
