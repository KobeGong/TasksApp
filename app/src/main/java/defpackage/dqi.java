package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: dqi  reason: default package */
/* compiled from: PG */
final class dqi implements dtc {
    private final ScheduledExecutorService a;
    private final Executor b;
    private final int c;
    private final boolean d;
    private final dqj e;
    private final dzt f;
    private final boolean g = true;

    dqi(dqj dqj, Executor executor, int i, dzt dzt) {
        ScheduledExecutorService scheduledExecutorService;
        if (this.g) {
            scheduledExecutorService = (ScheduledExecutorService) dzi.a.a(dvc.m);
        } else {
            scheduledExecutorService = null;
        }
        this.a = scheduledExecutorService;
        this.c = i;
        this.d = false;
        this.e = dqj;
        this.b = (Executor) cld.a(executor, "executor");
        this.f = (dzt) cld.a(dzt, "transportTracer");
    }

    @Override // defpackage.dtc
    public final dth a(SocketAddress socketAddress, String str, String str2, dxu dxu) {
        return new dqo(this.e, (InetSocketAddress) socketAddress, str, str2, this.b, this.c, false, this.f);
    }

    @Override // defpackage.dtc
    public final ScheduledExecutorService a() {
        return this.a;
    }

    @Override // defpackage.dtc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g) {
            dzi.a(dvc.m, this.a);
        }
    }
}
