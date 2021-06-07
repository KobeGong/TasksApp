package defpackage;

import android.content.IntentFilter;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: cnm  reason: default package */
/* compiled from: PG */
public final class cnm {
    public final Map a = new HashMap();
    public final /* synthetic */ chz b;

    public final void a(boolean z) {
        boolean z2;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.a.entrySet()) {
            String str = (String) entry.getKey();
            cia cia = (cia) entry.getValue();
            if (cia.b > 0 || cia.a > 0) {
                eet eet = new eet();
                eet.a = str;
                eet.c = Integer.valueOf(cia.b);
                eet.b = Integer.valueOf(cia.a);
                arrayList.add(eet);
                cia.b = 0;
                cia.a = 0;
            }
        }
        if (!arrayList.isEmpty()) {
            efx efx = new efx();
            efx.n = new eel();
            efx.n.a = (eet[]) arrayList.toArray(new eet[arrayList.size()]);
            if (this.b.b()) {
                this.b.a(efx);
            }
        }
        if (z) {
            if (!this.b.h || this.b.c || (!this.b.g && !this.b.f)) {
                z2 = false;
            } else {
                long j = this.b.i.get();
                z2 = j == 0 || j + 43200000 <= SystemClock.elapsedRealtime();
            }
            if (z2 && this.b.j.compareAndSet(false, true)) {
                cdm.a(3, "MemoryLeakService", "Scheduling heap dump %d seconds after the next screen off.", 5);
                IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                this.b.a.registerReceiver(new cib(this.b), intentFilter);
            }
        }
    }

    public cnm(chz chz) {
        this.b = chz;
    }
}
