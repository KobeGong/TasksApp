package defpackage;

/* renamed from: avr reason: default package */
/* compiled from: PG */
public final class avr extends defpackage.nz implements defpackage.bbh {
    private java.util.concurrent.Semaphore j = new java.util.concurrent.Semaphore(0);
    private java.util.Set k;

    public avr(android.content.Context context, java.util.Set set) {
        super(context);
        this.k = set;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final java.lang.Void d() {
        int i;
        int i2 = 0;
        java.util.Iterator it = this.k.iterator();
        while (true) {
            i = i2;
            if (!it.hasNext()) {
                try {
                    break;
                } catch (java.lang.InterruptedException e) {
                    java.lang.Thread.currentThread().interrupt();
                }
            } else if (((defpackage.ayp) it.next()).a((defpackage.bbh) this)) {
                i2 = i + 1;
            } else {
                i2 = i;
            }
        }
        this.j.tryAcquire(i, 5, java.util.concurrent.TimeUnit.SECONDS);
        return null;
    }

    /* access modifiers changed from: protected */
    public final void e() {
        this.j.drainPermits();
        a();
    }

    public final void g() {
        this.j.release();
    }
}
