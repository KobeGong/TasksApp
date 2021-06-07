package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.health.SystemHealthManager;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
/* renamed from: che  reason: default package */
/* compiled from: PG */
public final class che extends cgj implements cgx, cgy, cle {
    public final cmk d;
    private volatile boolean e = false;
    private final Object f = new Object();
    private final AtomicBoolean g = new AtomicBoolean();
    private final clz h;
    private final boolean i;
    private final List j;

    che(coe coe, Application application, clt clt, SharedPreferences sharedPreferences, clz clz, boolean z) {
        super(coe, application, clt, bg.Z);
        new ConcurrentHashMap();
        this.d = new cmk(sharedPreferences);
        this.h = clz;
        this.i = z;
        this.j = z ? new ArrayList() : null;
    }

    @Override // defpackage.cle
    public final void e() {
    }

    @Override // defpackage.cle
    public final void f() {
        if (!this.g.get()) {
            if (this.g.getAndSet(true)) {
                cdm.a(5, "BatteryMetricService", "unexpected state onAppToForeground", new Object[0]);
            } else if (this.i) {
                a(2);
            } else {
                c().submit(new chj(this, 2));
            }
        }
        synchronized (this.f) {
            if (!this.e) {
                cha.a(this.a).a(this);
                this.e = true;
            }
        }
    }

    @Override // defpackage.cgy
    public final void a(Activity activity) {
        if (this.g.getAndSet(true)) {
            cdm.a(5, "BatteryMetricService", "unexpected state onAppToForeground", new Object[0]);
        } else if (this.i) {
            a(2);
        } else {
            c().submit(new chj(this, 2));
        }
    }

    @Override // defpackage.cgx
    public final void b(Activity activity) {
        if (!this.g.getAndSet(false)) {
            cdm.a(5, "BatteryMetricService", "unexpected state onAppToBackground", new Object[0]);
        } else if (this.i) {
            a(1);
        } else {
            c().submit(new chj(this, 1));
        }
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cgj
    public final void d() {
        synchronized (this.f) {
            if (this.e) {
                cha.a(this.a).b(this);
                this.e = false;
            }
        }
        synchronized (this.d) {
            this.d.a.a.edit().remove("primes.battery.snapshot").commit();
        }
    }

    /* access modifiers changed from: package-private */
    public final cml g() {
        cml cml;
        cky.c();
        synchronized (this.d) {
            cmk cmk = this.d;
            com com2 = new com();
            if (cmk.a.a("primes.battery.snapshot", com2)) {
                cml = new cml(com2.a, com2.b, com2.c, com2.d, com2.e, com2.f, com2.g, com2.h, com2.i);
            } else {
                cml = null;
            }
        }
        return cml;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(cml cml) {
        boolean commit;
        cky.c();
        synchronized (this.d) {
            cmk cmk = this.d;
            com com2 = new com();
            com2.a = cml.a;
            com2.b = cml.b;
            com2.c = cml.c;
            com2.d = cml.d;
            com2.e = cml.e;
            com2.f = cml.f;
            com2.g = cml.g;
            com2.h = cml.h;
            com2.i = cml.i;
            cny cny = cmk.a;
            byte[] a = dmf.a((dmf) cky.a(com2));
            byte[] bArr = new byte[(a.length + 1)];
            bArr[0] = 1;
            System.arraycopy(a, 0, bArr, 1, a.length);
            commit = cny.a.edit().putString("primes.battery.snapshot", Base64.encodeToString(bArr, 0)).commit();
        }
        return commit;
    }

    /* access modifiers changed from: package-private */
    public final cma a(int i2, String str, boolean z) {
        clz clz = this.h;
        Long valueOf = Long.valueOf(clz.c.a());
        Long valueOf2 = Long.valueOf(clz.b.a());
        SystemHealthManager systemHealthManager = (SystemHealthManager) clz.a.a.getSystemService("systemhealth");
        return new cma(clz, valueOf, valueOf2, systemHealthManager != null ? systemHealthManager.takeMyUidSnapshot() : null, Integer.valueOf(i2), str, Boolean.valueOf(z), null);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005a, code lost:
        if (r0 != false) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.cml r14, defpackage.cml r15) {
        /*
        // Method dump skipped, instructions count: 983
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.che.a(cml, cml):void");
    }

    private final Future a(int i2) {
        Future submit = c().submit(new chh(this, i2, null, true));
        cdm.a(3, "BatteryMetricService", "adding future BatteryCapture", new Object[0]);
        synchronized (this.j) {
            this.j.add(submit);
            if (!this.g.get()) {
                submit = h();
            }
        }
        return submit;
    }

    private final Future h() {
        ArrayList arrayList;
        synchronized (this.j) {
            arrayList = new ArrayList(this.j);
            this.j.clear();
        }
        cdm.a(4, "BatteryMetricService", "Logging captures: %d", Integer.valueOf(arrayList.size()));
        return c().submit(new chi(this, arrayList));
    }
}
