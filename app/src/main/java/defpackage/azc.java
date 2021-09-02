package defpackage;

/* renamed from: azc reason: default package */
/* compiled from: PG */
final class azc implements defpackage.bpu {
    private /* synthetic */ defpackage.azb a;

    azc(defpackage.azb azb) {
        this.a = azb;
    }

    public final void a(defpackage.bpv bpv) {
        java.util.concurrent.locks.Lock lock = null;
        lock.lock();
        try {
            if (this.a.a) {
                if (bpv.a()) {
                    java.util.Map map = null;
                    this.a.b = new defpackage.qr(map.size());
                    java.util.Map map2 = null;
                    for (defpackage.bcn bcn : map2.values()) {
                        this.a.b.put(bcn.c, defpackage.axq.a);
                    }
                } else if (bpv.b() instanceof defpackage.aym) {
                    defpackage.aym aym = (defpackage.aym) bpv.b();
                    this.a.b = aym.a;
                    this.a.d = defpackage.azb.a(this.a);
                } else {
                    android.util.Log.e("ConnectionlessGAC", "Unexpected availability exception", bpv.b());
                    this.a.b = java.util.Collections.emptyMap();
                    this.a.d = new defpackage.axq(8);
                }
                if (this.a.c != null) {
                    this.a.b.putAll(this.a.c);
                    this.a.d = defpackage.azb.a(this.a);
                }
                if (this.a.d == null) {
                    null.e = java.util.Collections.emptySet();
                    defpackage.azb.b(this.a);
                } else {
                    this.a.a = false;
                    defpackage.azx azx = null;
                    azx.a(this.a.d);
                }
                java.util.concurrent.locks.Condition condition = null;
                condition.signalAll();
                lock.unlock();
            }
        } finally {
            lock.unlock();
        }
    }
}
