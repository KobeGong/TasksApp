package defpackage;

/* renamed from: dwv reason: default package */
/* compiled from: PG */
final class dwv extends defpackage.dnc {
    private final /* synthetic */ defpackage.dwf a;

    dwv(defpackage.dwf dwf) {
        this.a = dwf;
    }

    public final defpackage.dnd a(defpackage.dpb dpb, defpackage.dna dna) {
        java.util.concurrent.ScheduledExecutorService a2;
        defpackage.dwf dwf = this.a;
        java.util.concurrent.Executor executor = dna.c;
        if (executor == null) {
            executor = dwf.i;
        }
        defpackage.dsx dsx = this.a.T;
        if (this.a.C) {
            a2 = null;
        } else {
            a2 = this.a.h.a();
        }
        defpackage.dsq dsq = new defpackage.dsq(dpb, executor, dna, dsx, a2, this.a.F, this.a.N);
        dsq.g = this.a.l;
        dsq.h = this.a.m;
        dsq.i = this.a.n;
        return dsq;
    }

    public final java.lang.String a() {
        return (java.lang.String) defpackage.cld.a((java.lang.Object) this.a.s.a(), (java.lang.Object) "authority");
    }
}
