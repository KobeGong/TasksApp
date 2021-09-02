package defpackage;

/* renamed from: dqi reason: default package */
/* compiled from: PG */
final class dqi implements defpackage.dtc {
    private final java.util.concurrent.ScheduledExecutorService a;
    private final java.util.concurrent.Executor b;
    private final int c;
    private final boolean d;
    private final defpackage.dqj e;
    private final defpackage.dzt f;
    private final boolean g = true;

    dqi(defpackage.dqj dqj, java.util.concurrent.Executor executor, int i, defpackage.dzt dzt) {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService;
        if (this.g) {
            scheduledExecutorService = (java.util.concurrent.ScheduledExecutorService) defpackage.dzi.a.a(defpackage.dvc.m);
        } else {
            scheduledExecutorService = null;
        }
        this.a = scheduledExecutorService;
        this.c = i;
        this.d = false;
        this.e = dqj;
        this.b = (java.util.concurrent.Executor) defpackage.cld.a((java.lang.Object) executor, (java.lang.Object) "executor");
        this.f = (defpackage.dzt) defpackage.cld.a((java.lang.Object) dzt, (java.lang.Object) "transportTracer");
    }

    public final defpackage.dth a(java.net.SocketAddress socketAddress, java.lang.String str, java.lang.String str2, defpackage.dxu dxu) {
        return new defpackage.dqo(this.e, (java.net.InetSocketAddress) socketAddress, str, str2, this.b, this.c, false, this.f);
    }

    public final java.util.concurrent.ScheduledExecutorService a() {
        return this.a;
    }

    public final void close() {
        if (this.g) {
            defpackage.dzi.a(defpackage.dvc.m, this.a);
        }
    }
}
