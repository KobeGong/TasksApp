package defpackage;

/* renamed from: qd reason: default package */
/* compiled from: PG */
final class qd implements java.lang.Runnable {
    public final /* synthetic */ defpackage.qg a;
    private final /* synthetic */ java.util.concurrent.Callable b;
    private final /* synthetic */ android.os.Handler c;

    qd(java.util.concurrent.Callable callable, android.os.Handler handler, defpackage.qg qgVar) {
        this.b = callable;
        this.c = handler;
        this.a = qgVar;
    }

    public final void run() {
        java.lang.Object obj;
        try {
            obj = this.b.call();
        } catch (java.lang.Exception e) {
            obj = null;
        }
        this.c.post(new defpackage.qe(this, obj));
    }
}
