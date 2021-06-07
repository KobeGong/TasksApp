package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: avr  reason: default package */
/* compiled from: PG */
public final class avr extends nz implements bbh {
    private Semaphore j = new Semaphore(0);
    private Set k;

    public avr(Context context, Set set) {
        super(context);
        this.k = set;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final Void d() {
        int i = 0;
        for (ayp ayp : this.k) {
            if (ayp.a((bbh) this)) {
                i++;
            } else {
                i = i;
            }
        }
        try {
            this.j.tryAcquire(i, 5, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.oc
    public final void e() {
        this.j.drainPermits();
        a();
    }

    @Override // defpackage.bbh
    public final void g() {
        this.j.release();
    }
}
