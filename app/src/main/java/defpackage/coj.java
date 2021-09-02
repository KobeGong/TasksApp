package defpackage;

/* renamed from: coj reason: default package */
/* compiled from: PG */
final class coj implements java.lang.Runnable {
    private final /* synthetic */ defpackage.coi a;

    coj(defpackage.coi coi) {
        this.a = coi;
    }

    public final void run() {
        defpackage.coi coi = this.a;
        long uptimeMillis = android.os.SystemClock.uptimeMillis() - coi.c.get();
        if (uptimeMillis < 15000) {
            defpackage.cdm.a(3, "ClearcutTransmitter", "ignoring early disconnect, postScheduledMs = %d", java.lang.Long.valueOf(uptimeMillis));
            return;
        }
        synchronized (coi.b) {
            if (coi.d != null) {
                coi.d.b();
                coi.d.b(coi.f);
                coi.d.b(coi.e);
                coi.d = null;
            }
        }
    }
}
