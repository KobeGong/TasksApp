package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* renamed from: cvn  reason: default package */
/* compiled from: PG */
final class cvn extends cvg {
    public static final AtomicReference b = new AtomicReference();
    private static cvj d;
    private static final AtomicLong e = new AtomicLong();
    private static final ConcurrentLinkedQueue f = new ConcurrentLinkedQueue();
    private volatile cup c;

    static void b() {
        while (true) {
            cvn cvn = (cvn) cvo.a.poll();
            if (cvn != null) {
                cvn.c = ((cvj) b.get()).a(cvn.a());
            } else {
                c();
                return;
            }
        }
    }

    cvn(String str) {
        super(str);
        this.c = d != null ? d.a(a()) : null;
    }

    private static void c() {
        while (true) {
            cvp cvp = (cvp) f.poll();
            if (cvp != null) {
                e.getAndDecrement();
                cup cup = cvp.a;
                cuo cuo = cvp.b;
                if (cuo.j() || cup.a(cuo.d())) {
                    cup.a(cuo);
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.cup
    public final boolean a(Level level) {
        if (this.c != null) {
            return this.c.a(level);
        }
        return true;
    }

    @Override // defpackage.cup
    public final void a(cuo cuo) {
        if (this.c != null) {
            this.c.a(cuo);
            return;
        }
        if (e.incrementAndGet() > 20) {
            f.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        f.offer(new cvp(this, cuo));
        if (this.c != null) {
            c();
        }
    }

    static {
        boolean z = false;
        boolean z2 = Build.FINGERPRINT == null || "robolectric".equals(Build.FINGERPRINT);
        if ("goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE)) {
            z = true;
        }
        if (z2 || z) {
            d = new cvj();
        } else {
            d = null;
        }
    }
}
