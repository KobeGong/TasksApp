package defpackage;

import android.util.Log;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* access modifiers changed from: package-private */
/* renamed from: azd  reason: default package */
/* compiled from: PG */
public final class azd implements bpu {
    private bbh a;
    private /* synthetic */ azb b;

    azd(azb azb, bbh bbh) {
        this.b = azb;
        this.a = bbh;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.a.g();
    }

    @Override // defpackage.bpu
    public final void a(bpv bpv) {
        Lock lock = null;
        lock.lock();
        try {
            if (!this.b.a) {
                this.a.g();
                return;
            }
            if (bpv.a()) {
                Map map = null;
                this.b.c = new qr(map.size());
                Map map2 = null;
                for (bcn bcn : map2.values()) {
                    this.b.c.put(bcn.c, axq.a);
                }
            } else if (bpv.b() instanceof aym) {
                this.b.c = ((aym) bpv.b()).a;
            } else {
                Log.e("ConnectionlessGAC", "Unexpected availability exception", bpv.b());
                this.b.c = Collections.emptyMap();
            }
            if (this.b.d()) {
                this.b.b.putAll(this.b.c);
                if (azb.a(this.b) == null) {
                    azx azx = null;
                    azx.e = Collections.emptySet();
                    azb.b(this.b);
                    Condition condition = null;
                    condition.signalAll();
                }
            }
            this.a.g();
            lock.unlock();
        } finally {
            lock.unlock();
        }
    }
}
