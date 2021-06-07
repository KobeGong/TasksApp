package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: amj  reason: default package */
/* compiled from: PG */
public final class amj {
    public static final cwl a = new cwo(new cwm());
    public final Context b;
    public final Queue c;
    public cyj d;
    public final ais e;
    public boolean f = false;
    private final Executor g;
    private final BroadcastReceiver h = new aml(this);
    private final aiy i = new aiy(this);

    public amj(ais ais, Executor executor, Context context) {
        this.b = context.getApplicationContext();
        this.c = new LinkedBlockingQueue();
        this.e = ais;
        this.g = cub.a(executor);
    }

    public final synchronized void a() {
        boolean z = true;
        synchronized (this) {
            if (this.f) {
                z = false;
            }
            cld.b(z, "The coordinator is already running.");
            cld.b(true, (Object) "The coordinator is shutting down.");
            this.b.registerReceiver(this.h, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.e.a(this.i);
            this.f = true;
        }
    }

    public final synchronized cyi a(csd csd, int i2, Runnable runnable) {
        amm amm;
        cld.b(this.f, "The coordinator is not running. Please call start().");
        amm = new amm(csd, i2, runnable);
        this.c.add(amm);
        b();
        return amm.d;
    }

    public final synchronized void b() {
        if (this.f && (this.d == null || this.d.isDone())) {
            this.d = new cyj(new amk(this));
            this.g.execute(this.d);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(amm amm, Throwable th) {
        synchronized (this) {
            this.c.poll();
        }
        amm.d.a(th);
        a(amm);
    }

    static void a(amm amm) {
        if (amm.c != null) {
            amm.c.run();
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void c() {
        Throwable ami;
        boolean z;
        if (bdk.a(this.b)) {
            ami = new RuntimeException("Fail fast");
        } else {
            ami = new ami();
        }
        boolean z2 = false;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            amm amm = (amm) it.next();
            if (amm.b == bg.D) {
                it.remove();
                amm.d.a(ami);
                z = true;
            } else {
                z = z2;
            }
            z2 = z;
        }
        if (z2) {
            this.e.a(air.a(ami));
        }
    }
}
