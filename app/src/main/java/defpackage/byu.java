package defpackage;

/* renamed from: byu reason: default package */
/* compiled from: PG */
public final class byu {
    public final defpackage.byh a;
    private final defpackage.bwq b;
    private final defpackage.byy c;

    public final void a(defpackage.bul bul, java.util.List list, defpackage.bvo bvo) {
        boolean z;
        if (bvo.d()) {
            this.a.a(bul, list, bvo);
            return;
        }
        defpackage.bvo f = bvo.f();
        if (f.d() || f.e() > 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            defpackage.bty.b("ChimeReceiver", new java.util.concurrent.TimeoutException(), "Falling back scheduled notification receciver.", new java.lang.Object[0]);
            this.c.a(bul, list);
            return;
        }
        java.util.concurrent.Future a2 = this.b.a((java.util.concurrent.Callable) new defpackage.byw(this, bul, list, f));
        try {
            defpackage.bty.a("ChimeReceiver", "Blocking until operation is finished.", new java.lang.Object[0]);
            defpackage.bty.a("ChimeReceiver", " - Maximum blocked time: %d ms.", java.lang.Long.valueOf(f.e()));
            defpackage.bty.a("ChimeReceiver", " - Total available time: %d ms.", java.lang.Long.valueOf(bvo.e()));
            a2.get(f.e(), java.util.concurrent.TimeUnit.MILLISECONDS);
            return;
        } catch (java.lang.InterruptedException e) {
            defpackage.bty.b("ChimeReceiver", e, "Retrying in scheduled notification receciver, caused by:", new java.lang.Object[0]);
            java.lang.Thread.currentThread().interrupt();
        } catch (java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e2) {
            defpackage.bty.b("ChimeReceiver", e2, "Retrying in scheduled notification receciver, caused by:", new java.lang.Object[0]);
        }
        defpackage.bty.a("ChimeReceiver", "Available time for scheduling: %d ms.", java.lang.Long.valueOf(bvo.e()));
        this.c.a(bul, list);
    }

    public byu(defpackage.bwq bwq, defpackage.byh byh, defpackage.byy byy) {
        this.b = bwq;
        this.a = byh;
        this.c = byy;
    }
}
