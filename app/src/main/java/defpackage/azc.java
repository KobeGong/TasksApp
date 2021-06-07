package defpackage;

import android.util.Log;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* access modifiers changed from: package-private */
/* renamed from: azc  reason: default package */
/* compiled from: PG */
public final class azc implements bpu {
    private /* synthetic */ azb a;

    azc(azb azb) {
        this.a = azb;
    }

    @Override // defpackage.bpu
    public final void a(bpv bpv) {
        Lock lock = null;
        lock.lock();
        try {
            if (this.a.a) {
                if (bpv.a()) {
                    Map map = null;
                    this.a.b = new qr(map.size());
                    Map map2 = null;
                    for (bcn bcn : map2.values()) {
                        this.a.b.put(bcn.c, axq.a);
                    }
                } else if (bpv.b() instanceof aym) {
                    this.a.b = ((aym) bpv.b()).a;
                    this.a.d = azb.a(this.a);
                } else {
                    Log.e("ConnectionlessGAC", "Unexpected availability exception", bpv.b());
                    this.a.b = Collections.emptyMap();
                    this.a.d = new axq(8);
                }
                if (this.a.c != null) {
                    this.a.b.putAll(this.a.c);
                    this.a.d = azb.a(this.a);
                }
                if (this.a.d == null) {
                    azx azx = null;
                    azx.e = Collections.emptySet();
                    azb.b(this.a);
                } else {
                    this.a.a = false;
                    azx azx2 = null;
                    azx2.a(this.a.d);
                }
                Condition condition = null;
                condition.signalAll();
                lock.unlock();
            }
        } finally {
            lock.unlock();
        }
    }
}
