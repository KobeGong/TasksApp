package defpackage;

/* renamed from: dtc reason: default package */
/* compiled from: PG */
public interface dtc extends java.io.Closeable {
    defpackage.dth a(java.net.SocketAddress socketAddress, java.lang.String str, java.lang.String str2, defpackage.dxu dxu);

    java.util.concurrent.ScheduledExecutorService a();

    void close();
}
