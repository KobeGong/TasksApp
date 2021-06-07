package defpackage;

import android.os.SystemClock;

/* renamed from: cin  reason: default package */
/* compiled from: PG */
final class cin {
    public final cnz a;
    public final clt b;
    public final int c;
    private final coe d;
    private final clt e;

    cin(coe coe, clt clt, clt clt2, int i, int i2) {
        this.d = (coe) cky.a(coe);
        this.e = (clt) cky.a(clt);
        this.b = clt2;
        this.c = i;
        this.a = new cnz(i2);
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, boolean z, efx efx, eeo eeo) {
        if (efx == null) {
            String valueOf = String.valueOf(str);
            cdm.a(5, "MetricRecorder", valueOf.length() != 0 ? "metric is null, skipping recorded metric for event: ".concat(valueOf) : new String("metric is null, skipping recorded metric for event: "), new Object[0]);
            return;
        }
        cip cip = (cip) this.e.a();
        if (efx == null) {
            cdm.a(5, "MetricStamper", "Unexpected null metric to stamp, Stamping has been skipped.", new Object[0]);
        } else {
            efx.e = new edh();
            efx.e.a = cip.a;
            efx.e.c = cip.d;
            efx.e.d = cip.g;
            efx.e.b = cip.c;
            efx.e.e = cip.b;
            efx.v = new edy();
            efx.v.a = Long.valueOf(cip.e.a().getFreeSpace() / 1024);
            efx.v.b = Long.valueOf(cip.f);
        }
        if (z) {
            efx.r = str;
        } else {
            efx.c = str;
        }
        if (eeo != null) {
            efx.o = eeo;
        }
        this.d.a(efx);
        cnz cnz = this.a;
        synchronized (cnz.a) {
            cnz.b++;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - cnz.c > 1000) {
                cnz.b = 0;
                cnz.c = elapsedRealtime;
            }
        }
    }
}
