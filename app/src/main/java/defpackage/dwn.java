package defpackage;

import java.util.logging.Level;

/* access modifiers changed from: package-private */
/* renamed from: dwn  reason: default package */
/* compiled from: PG */
public final class dwn implements Runnable {
    public boolean a;
    private final /* synthetic */ dwf b;

    dwn(dwf dwf) {
        this.b = dwf;
    }

    public final void run() {
        if (!this.a) {
            dwf dwf = this.b;
            dwf.a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImpl", "enterIdleMode", "[{0}] Entering idle mode", dwf.d);
            dwf.a(true);
            dwf.y.a((doq) null);
            dwf.s = dwf.a(dwf.e, dwf.f, dwf.g);
            dwf.p.a(dnq.IDLE);
        }
    }
}
