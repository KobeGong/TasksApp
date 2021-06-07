package defpackage;

import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* access modifiers changed from: package-private */
/* renamed from: dru  reason: default package */
/* compiled from: PG */
public final class dru implements dtc {
    public final Executor a;
    private final dtc b;

    dru(dtc dtc, Executor executor) {
        this.b = (dtc) cld.a(dtc, "delegate");
        this.a = (Executor) cld.a(executor, "appExecutor");
    }

    @Override // defpackage.dtc
    public final dth a(SocketAddress socketAddress, String str, String str2, dxu dxu) {
        return new drv(this, this.b.a(socketAddress, str, str2, dxu), str);
    }

    @Override // defpackage.dtc
    public final ScheduledExecutorService a() {
        return this.b.a();
    }

    @Override // defpackage.dtc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
