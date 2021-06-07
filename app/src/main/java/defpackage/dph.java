package defpackage;

import java.util.List;
import java.util.logging.Level;

/* renamed from: dph  reason: default package */
/* compiled from: PG */
public final class dph {
    public final dwo a;
    public final /* synthetic */ dwf b;

    public final void a(List list, dmv dmv) {
        if (list.isEmpty()) {
            a(dpw.i.a("NameResolver returned an empty list"));
            return;
        }
        if (dwf.a.isLoggable(Level.FINE)) {
            dwf.a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImpl$NameResolverListenerImpl", "onAddresses", "[{0}] resolved address: {1}, config={2}", new Object[]{this.b.d, list, dmv});
        }
        this.a.a(new dwt(this, dmv, list));
    }

    public final void a(dpw dpw) {
        cld.a(!dpw.a(), "the error status must not be OK");
        dwf.a.logp(Level.WARNING, "io.grpc.internal.ManagedChannelImpl$NameResolverListenerImpl", "onError", "[{0}] Failed to resolve name. status={1}", new Object[]{this.b.d, dpw});
        this.b.k.a(new dws(this, dpw)).a();
    }

    public dph(dwf dwf, dwo dwo) {
        this.b = dwf;
        this.a = dwo;
    }
}
