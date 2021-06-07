package defpackage;

import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: dwt  reason: default package */
/* compiled from: PG */
public final class dwt implements Runnable {
    private final /* synthetic */ dmv a;
    private final /* synthetic */ List b;
    private final /* synthetic */ dph c;

    public dwt(dph dph, dmv dmv, List list) {
        this.c = dph;
        this.a = dmv;
        this.b = list;
    }

    public final void run() {
        if (this.c.a == this.c.b.t) {
            this.c.b.S = null;
            try {
                if (this.c.b.N) {
                    this.c.b.M = dzh.a((Map) this.a.a(dvb.a), this.c.b.J);
                    this.c.b.I = dwf.a(this.a);
                }
            } catch (RuntimeException e) {
                Logger logger = dwf.a;
                Level level = Level.WARNING;
                String valueOf = String.valueOf(this.c.b.d);
                logger.logp(level, "io.grpc.internal.ManagedChannelImpl$NameResolverListenerImpl$1NamesResolved", "run", new StringBuilder(String.valueOf(valueOf).length() + 51).append("[").append(valueOf).append("] Unexpected exception from parsing service config").toString(), (Throwable) e);
            }
            this.c.a.a.a(this.b, this.a);
        }
    }
}
