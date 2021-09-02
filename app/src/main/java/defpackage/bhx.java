package defpackage;

/* renamed from: bhx reason: default package */
/* compiled from: PG */
public abstract class bhx extends android.app.Service {
    public final java.util.concurrent.ExecutorService a = java.util.concurrent.Executors.newSingleThreadExecutor();
    private android.os.Binder b;
    private final java.lang.Object c = new java.lang.Object();
    private int d;
    private int e = 0;

    public abstract void handleIntent(android.content.Intent intent);

    public final synchronized android.os.IBinder onBind(android.content.Intent intent) {
        if (this.b == null) {
            this.b = new defpackage.bib(this);
        }
        return this.b;
    }

    public final int onStartCommand(android.content.Intent intent, int i, int i2) {
        synchronized (this.c) {
            this.d = i2;
            this.e++;
        }
        if (intent == null) {
            a(intent);
            return 2;
        }
        this.a.execute(new defpackage.bhy(this, intent, intent));
        return 3;
    }

    /* access modifiers changed from: 0000 */
    public final void a(android.content.Intent intent) {
        if (intent != null) {
            defpackage.bpt.a(intent);
        }
        synchronized (this.c) {
            this.e--;
            if (this.e == 0) {
                stopSelfResult(this.d);
            }
        }
    }
}
