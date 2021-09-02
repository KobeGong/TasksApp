package defpackage;

/* renamed from: dph reason: default package */
/* compiled from: PG */
public final class dph {
    public final defpackage.dwo a;
    public final /* synthetic */ defpackage.dwf b;

    public final void a(java.util.List list, defpackage.dmv dmv) {
        if (list.isEmpty()) {
            a(defpackage.dpw.i.a("NameResolver returned an empty list"));
            return;
        }
        if (defpackage.dwf.a.isLoggable(java.util.logging.Level.FINE)) {
            defpackage.dwf.a.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImpl$NameResolverListenerImpl", "onAddresses", "[{0}] resolved address: {1}, config={2}", new java.lang.Object[]{this.b.d, list, dmv});
        }
        this.a.a(new defpackage.dwt(this, dmv, list));
    }

    public final void a(defpackage.dpw dpw) {
        defpackage.cld.a(!dpw.a(), (java.lang.Object) "the error status must not be OK");
        defpackage.dwf.a.logp(java.util.logging.Level.WARNING, "io.grpc.internal.ManagedChannelImpl$NameResolverListenerImpl", "onError", "[{0}] Failed to resolve name. status={1}", new java.lang.Object[]{this.b.d, dpw});
        this.b.k.a((java.lang.Runnable) new defpackage.dws(this, dpw)).a();
    }

    public dph(defpackage.dwf dwf, defpackage.dwo dwo) {
        this.b = dwf;
        this.a = dwo;
    }
}
