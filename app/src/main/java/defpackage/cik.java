package defpackage;

import android.app.Application;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
/* renamed from: cik  reason: default package */
/* compiled from: PG */
public final class cik extends cgj {
    public final boolean d;
    public final cid e;
    public final boolean f;
    public final boolean g;
    private cie h;

    cik(coe coe, Application application, clt clt, int i, boolean z, cid cid, boolean z2, boolean z3) {
        super(coe, application, clt, bg.Z, i);
        new AtomicReference(null);
        new ConcurrentHashMap();
        this.d = z;
        this.e = cid;
        this.f = z2;
        this.g = z3;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void e() {
        if (!this.c && this.h == null) {
            this.h = new cie(new cij(this), this.a, this.b);
            cie cie = this.h;
            if (cie.a.getAndSet(true)) {
                cdm.a(5, "MemoryMetricMonitor", "Memory Monitor has already started. This MemoryMetricMonitor.start() is ignored.", new Object[0]);
            } else {
                cie.f.a(cie.g);
                cie.f.a(cie.h);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cgj
    public final synchronized void d() {
        if (this.h != null) {
            cie cie = this.h;
            cie.f.b(cie.g);
            cie.f.b(cie.h);
            this.h = null;
        }
    }
}
