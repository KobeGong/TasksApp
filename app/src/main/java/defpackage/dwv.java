package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* access modifiers changed from: package-private */
/* renamed from: dwv  reason: default package */
/* compiled from: PG */
public final class dwv extends dnc {
    private final /* synthetic */ dwf a;

    dwv(dwf dwf) {
        this.a = dwf;
    }

    @Override // defpackage.dnc
    public final dnd a(dpb dpb, dna dna) {
        ScheduledExecutorService a2;
        dwf dwf = this.a;
        Executor executor = dna.c;
        if (executor == null) {
            executor = dwf.i;
        }
        dsx dsx = this.a.T;
        if (this.a.C) {
            a2 = null;
        } else {
            a2 = this.a.h.a();
        }
        dsq dsq = new dsq(dpb, executor, dna, dsx, a2, this.a.F, this.a.N);
        dsq.g = this.a.l;
        dsq.h = this.a.m;
        dsq.i = this.a.n;
        return dsq;
    }

    @Override // defpackage.dnc
    public final String a() {
        return (String) cld.a(this.a.s.a(), "authority");
    }
}
