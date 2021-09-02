package defpackage;

/* renamed from: azd reason: default package */
/* compiled from: PG */
final class azd implements defpackage.bpu {
    private defpackage.bbh a;
    private /* synthetic */ defpackage.azb b;

    azd(defpackage.azb azb, defpackage.bbh bbh) {
        this.b = azb;
        this.a = bbh;
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        this.a.g();
    }

    public final void a(defpackage.bpv bpv) {
        java.util.concurrent.locks.Lock lock = null;
        lock.lock();
        try {
            if (!this.b.a) {
                this.a.g();
                return;
            }
            if (bpv.a()) {
                java.util.Map map = null;
                this.b.c = new defpackage.qr(map.size());
                java.util.Map map2 = null;
                for (defpackage.bcn bcn : map2.values()) {
                    this.b.c.put(bcn.c, defpackage.axq.a);
                }
            } else if (bpv.b() instanceof defpackage.aym) {
                defpackage.aym aym = (defpackage.aym) bpv.b();
                this.b.c = aym.a;
            } else {
                android.util.Log.e("ConnectionlessGAC", "Unexpected availability exception", bpv.b());
                this.b.c = java.util.Collections.emptyMap();
            }
            if (this.b.d()) {
                this.b.b.putAll(this.b.c);
                if (defpackage.azb.a(this.b) == null) {
                    null.e = java.util.Collections.emptySet();
                    defpackage.azb.b(this.b);
                    java.util.concurrent.locks.Condition condition = null;
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
