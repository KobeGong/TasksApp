package defpackage;

/* renamed from: cin reason: default package */
/* compiled from: PG */
final class cin {
    public final defpackage.cnz a;
    public final defpackage.clt b;
    public final int c;
    private final defpackage.coe d;
    private final defpackage.clt e;

    cin(defpackage.coe coe, defpackage.clt clt, defpackage.clt clt2, int i, int i2) {
        this.d = (defpackage.coe) defpackage.cky.a((java.lang.Object) coe);
        this.e = (defpackage.clt) defpackage.cky.a((java.lang.Object) clt);
        this.b = clt2;
        this.c = i;
        this.a = new defpackage.cnz(i2);
    }

    /* access modifiers changed from: 0000 */
    public final void a(java.lang.String str, boolean z, defpackage.efx efx, defpackage.eeo eeo) {
        if (efx == null) {
            java.lang.String str2 = "MetricRecorder";
            java.lang.String str3 = "metric is null, skipping recorded metric for event: ";
            java.lang.String valueOf = java.lang.String.valueOf(str);
            defpackage.cdm.a(5, str2, valueOf.length() != 0 ? str3.concat(valueOf) : new java.lang.String(str3), new java.lang.Object[0]);
            return;
        }
        defpackage.cip cip = (defpackage.cip) this.e.a();
        if (efx == null) {
            defpackage.cdm.a(5, "MetricStamper", "Unexpected null metric to stamp, Stamping has been skipped.", new java.lang.Object[0]);
        } else {
            efx.e = new defpackage.edh();
            efx.e.a = cip.a;
            efx.e.c = cip.d;
            efx.e.d = cip.g;
            efx.e.b = cip.c;
            efx.e.e = cip.b;
            efx.v = new defpackage.edy();
            efx.v.a = java.lang.Long.valueOf(cip.e.a().getFreeSpace() / 1024);
            efx.v.b = java.lang.Long.valueOf(cip.f);
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
        defpackage.cnz cnz = this.a;
        synchronized (cnz.a) {
            cnz.b++;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            if (elapsedRealtime - cnz.c > 1000) {
                cnz.b = 0;
                cnz.c = elapsedRealtime;
            }
        }
    }
}
