package defpackage;

import android.os.SystemClock;

/* access modifiers changed from: package-private */
/* renamed from: coj  reason: default package */
/* compiled from: PG */
public final class coj implements Runnable {
    private final /* synthetic */ coi a;

    coj(coi coi) {
        this.a = coi;
    }

    public final void run() {
        coi coi = this.a;
        long uptimeMillis = SystemClock.uptimeMillis() - coi.c.get();
        if (uptimeMillis < 15000) {
            cdm.a(3, "ClearcutTransmitter", "ignoring early disconnect, postScheduledMs = %d", Long.valueOf(uptimeMillis));
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
