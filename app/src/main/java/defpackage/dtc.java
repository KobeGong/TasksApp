package defpackage;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: dtc  reason: default package */
/* compiled from: PG */
public interface dtc extends Closeable {
    dth a(SocketAddress socketAddress, String str, String str2, dxu dxu);

    ScheduledExecutorService a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();
}
