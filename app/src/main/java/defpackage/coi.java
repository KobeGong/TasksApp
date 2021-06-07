package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: coi  reason: default package */
/* compiled from: PG */
public final class coi extends col {
    public final Object b;
    public final AtomicLong c;
    public bqw d;
    public final bra e;
    public final bqz f;
    private final coc g;
    private final Context h;
    private final bqn i;
    private final bqk j;
    private final String k;
    private bqx l;
    private volatile HashMap m;
    private final Runnable n;
    private final brd o;

    public coi(Context context, bqn bqn, bqy bqy, bqk bqk, String str) {
        this(context, bqn, bqy, bqk, str, coc.a);
    }

    private coi(Context context, bqn bqn, bqy bqy, bqk bqk, String str, coc coc) {
        this.b = new Object();
        this.c = new AtomicLong(-1000);
        this.m = new HashMap();
        this.n = new coj(this);
        this.e = new bra(this);
        this.f = new bqz(this);
        this.o = new cok(this);
        this.h = context.getApplicationContext();
        this.i = (bqn) cky.a(bqn);
        cky.a(bqy);
        this.j = (bqk) cky.a(bqk);
        this.k = (String) cky.a((Object) str);
        this.g = (coc) cky.a(coc);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.col
    public final void b(efx efx) {
        long j2 = this.c.get();
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - j2 >= 1000 && this.c.compareAndSet(j2, uptimeMillis)) {
            long j3 = 15000 + uptimeMillis;
            try {
                cky.d().removeCallbacks(this.n);
                cky.d().postAtTime(this.n, j3);
            } catch (RuntimeException e2) {
                cdm.a("ClearcutTransmitter", "reschedule disconnect failed", e2, new Object[0]);
            }
        }
        byte[] a = dmf.a(efx);
        String str = this.k;
        try {
            this.g.a();
        } catch (Exception e3) {
            String valueOf = String.valueOf(e3);
            cdm.a(3, "ClearcutTransmitter", new StringBuilder(String.valueOf(valueOf).length() + 73).append("Failed to get Account Name, falling back to Zwieback logging, exception: ").append(valueOf).toString(), new Object[0]);
        } finally {
            bql a2 = a(str).a(a).a(null);
            a();
            a2.a().a(this.o);
        }
    }

    private final bqm a(String str) {
        if (this.m.get(str) == null) {
            synchronized (this.b) {
                if (this.m.get(str) == null) {
                    this.m.put(str, bqn.a(this.h, str, null));
                }
            }
        }
        return (bqm) this.m.get(str);
    }

    private final bqw a() {
        bqw bqw;
        synchronized (this.b) {
            if (this.d == null) {
                if (this.l == null) {
                    this.l = new bqx(this.h, (byte) 0);
                }
                bqx bqx = this.l;
                bqx.a.a(bqx.b.a(this.j.a));
                this.d = bqx.a();
                this.d.a(this.e);
                this.d.a(this.f);
                cdm.a(3, "ClearcutTransmitter", "Connecting to GmsCore", new Object[0]);
                this.d.a();
            }
            bqw = this.d;
        }
        return bqw;
    }

    static void a(bre bre) {
        cdm.a(2, "ClearcutTransmitter", "handleResult, success: %b", Boolean.valueOf(bre.b()));
        if (!bre.b()) {
            cdm.a(3, "ClearcutTransmitter", "Clearcut logging failed", new Object[0]);
        }
    }

    public static void a(int i2) {
        cdm.a(3, "ClearcutTransmitter", "onConnectionSuspended, cause: %d", Integer.valueOf(i2));
    }
}
