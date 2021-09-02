package defpackage;

/* renamed from: cnm reason: default package */
/* compiled from: PG */
public final class cnm {
    public final java.util.Map a = new java.util.HashMap();
    public final /* synthetic */ defpackage.chz b;

    public final void a(boolean z) {
        boolean z2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : this.a.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            defpackage.cia cia = (defpackage.cia) entry.getValue();
            if (cia.b > 0 || cia.a > 0) {
                defpackage.eet eet = new defpackage.eet();
                eet.a = str;
                eet.c = java.lang.Integer.valueOf(cia.b);
                eet.b = java.lang.Integer.valueOf(cia.a);
                arrayList.add(eet);
                cia.b = 0;
                cia.a = 0;
            }
        }
        if (!arrayList.isEmpty()) {
            defpackage.efx efx = new defpackage.efx();
            efx.n = new defpackage.eel();
            efx.n.a = (defpackage.eet[]) arrayList.toArray(new defpackage.eet[arrayList.size()]);
            if (this.b.b()) {
                this.b.a(efx);
            }
        }
        if (z) {
            if (!this.b.h || this.b.c || (!this.b.g && !this.b.f)) {
                z2 = false;
            } else {
                long j = this.b.i.get();
                z2 = j == 0 || j + 43200000 <= android.os.SystemClock.elapsedRealtime();
            }
            if (z2 && this.b.j.compareAndSet(false, true)) {
                defpackage.cdm.a(3, "MemoryLeakService", "Scheduling heap dump %d seconds after the next screen off.", java.lang.Integer.valueOf(5));
                android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                this.b.a.registerReceiver(new defpackage.cib(this.b), intentFilter);
            }
        }
    }

    public cnm(defpackage.chz chz) {
        this.b = chz;
    }
}
