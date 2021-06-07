package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: aoa  reason: default package */
/* compiled from: PG */
public final class aoa {
    private String a;
    private aoc b;
    private aod c;
    private final ScheduledExecutorService d;
    private ScheduledFuture e;
    private final Context f;

    public aoa(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.d = scheduledExecutorService;
        this.f = context.getApplicationContext();
    }

    public final synchronized void a(String str) {
        b();
        this.a = str;
    }

    public final synchronized void a(aoc aoc) {
        this.b = aoc;
    }

    public final synchronized void a(String str, aod aod) {
        if (str.equals(this.a)) {
            b();
            this.c = aod;
            if (this.b != null) {
                aoc aoc = this.b;
                aoc.a.runOnUiThread(new aqv(aoc, this.c.a.a(this.f)));
            }
            this.e = this.d.schedule(new aob(this), bdk.b(this.f) ? 10000 : 3500, TimeUnit.MILLISECONDS);
        } else {
            aod.a();
        }
    }

    public final synchronized void b(String str) {
        if (str.equals(this.a)) {
            b();
        }
    }

    public final synchronized void a() {
        c();
        if (this.c != null) {
            aod aod = this.c;
            aod.a.a(aod.c.a.a);
            aod.c.a.a.b(aod.a);
            if (this.b != null) {
                aoc aoc = this.b;
                aoc.a.runOnUiThread(new aqx(aoc, this.c.b));
            }
            this.c = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b() {
        if (this.c != null) {
            c();
            this.c.a();
            if (this.b != null) {
                aoc aoc = this.b;
                aoc.a.runOnUiThread(new aqw(aoc));
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
