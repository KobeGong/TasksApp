package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: aoa reason: default package */
/* compiled from: PG */
public final class aoa {
    private java.lang.String a;
    private defpackage.aoc b;
    private defpackage.aod c;
    private final ScheduledExecutorService d;
    private java.util.concurrent.ScheduledFuture e;
    private final android.content.Context context;

    public aoa(android.content.Context context, ScheduledExecutorService scheduledExecutorService) {
        this.d = scheduledExecutorService;
        this.context = context.getApplicationContext();
    }

    public final synchronized void a(java.lang.String str) {
        b();
        this.a = str;
    }

    public final synchronized void a(defpackage.aoc aoc) {
        this.b = aoc;
    }

    public final synchronized void a(java.lang.String str, defpackage.aod aod) {
        if (str.equals(this.a)) {
            b();
            this.c = aod;
            if (this.b != null) {
                defpackage.aoc aoc = this.b;
                aoc.a.runOnUiThread(new defpackage.aqv(aoc, this.c.a.a(this.context)));
            }
            this.e = this.d.schedule(new defpackage.aob(this), defpackage.bdk.b(this.context) ? 10000 : 3500, java.util.concurrent.TimeUnit.MILLISECONDS);
        } else {
            aod.a();
        }
    }

    public final synchronized void b(java.lang.String str) {
        if (str.equals(this.a)) {
            b();
        }
    }

    public final synchronized void a() {
        c();
        if (this.c != null) {
            defpackage.aod aod = this.c;
            aod.a.a(aod.c.a.a);
            aod.c.a.a.b(aod.a);
            if (this.b != null) {
                defpackage.aoc aoc = this.b;
                aoc.a.runOnUiThread(new defpackage.aqx(aoc, this.c.b));
            }
            this.c = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void b() {
        if (this.c != null) {
            c();
            this.c.a();
            if (this.b != null) {
                defpackage.aoc aoc = this.b;
                aoc.a.runOnUiThread(new defpackage.aqw(aoc));
            }
            this.c = null;
        }
    }

    private final void c() {
        if (this.e != null) {
            this.e.cancel(false);
            this.e = null;
        }
    }
}
