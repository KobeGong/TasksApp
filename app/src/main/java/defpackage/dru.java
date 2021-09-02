package defpackage;

/* renamed from: dru reason: default package */
/* compiled from: PG */
final class dru implements defpackage.dtc {
    public final java.util.concurrent.Executor a;
    private final defpackage.dtc b;

    dru(defpackage.dtc dtc, java.util.concurrent.Executor executor) {
        this.b = (defpackage.dtc) defpackage.cld.a((java.lang.Object) dtc, (java.lang.Object) "delegate");
        this.a = (java.util.concurrent.Executor) defpackage.cld.a((java.lang.Object) executor, (java.lang.Object) "appExecutor");
    }

    public final defpackage.dth a(java.net.SocketAddress socketAddress, java.lang.String str, java.lang.String str2, defpackage.dxu dxu) {
        return new defpackage.drv(this, this.b.a(socketAddress, str, str2, dxu), str);
    }

    public final java.util.concurrent.ScheduledExecutorService a() {
        return this.b.a();
    }

    public final void close() {
        this.b.close();
    }
}
