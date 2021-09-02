package defpackage;

/* renamed from: dwt reason: default package */
/* compiled from: PG */
public final class dwt implements java.lang.Runnable {
    private final /* synthetic */ defpackage.dmv a;
    private final /* synthetic */ java.util.List b;
    private final /* synthetic */ defpackage.dph c;

    public dwt(defpackage.dph dph, defpackage.dmv dmv, java.util.List list) {
        this.c = dph;
        this.a = dmv;
        this.b = list;
    }

    public final void run() {
        if (this.c.a == this.c.b.t) {
            this.c.b.S = null;
            try {
                if (this.c.b.N) {
                    this.c.b.M = defpackage.dzh.a((java.util.Map) this.a.a(defpackage.dvb.a), this.c.b.J);
                    this.c.b.I = defpackage.dwf.a(this.a);
                }
            } catch (java.lang.RuntimeException e) {
                java.lang.String valueOf = java.lang.String.valueOf(this.c.b.d);
                defpackage.dwf.a.logp(java.util.logging.Level.WARNING, "io.grpc.internal.ManagedChannelImpl$NameResolverListenerImpl$1NamesResolved", "run", new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 51).append("[").append(valueOf).append("] Unexpected exception from parsing service config").toString(), e);
            }
            this.c.a.a.a(this.b, this.a);
        }
    }
}
