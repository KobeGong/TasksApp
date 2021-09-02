package defpackage;

/* renamed from: bid reason: default package */
/* compiled from: PG */
public final class bid implements android.content.ServiceConnection {
    private final android.content.Context a;
    private final android.content.Intent b;
    private final java.util.concurrent.ScheduledExecutorService c;
    private final java.util.Queue d;
    private defpackage.bib e;
    private boolean f;

    public bid(android.content.Context context, java.lang.String str) {
        this(context, str, new java.util.concurrent.ScheduledThreadPoolExecutor(0));
    }

    private bid(android.content.Context context, java.lang.String str, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.d = new java.util.LinkedList();
        this.f = false;
        this.a = context.getApplicationContext();
        this.b = new android.content.Intent(str).setPackage(this.a.getPackageName());
        this.c = scheduledExecutorService;
    }

    public final synchronized void a(android.content.Intent intent, android.content.BroadcastReceiver.PendingResult pendingResult) {
        this.d.add(new defpackage.bhz(intent, pendingResult, this.c));
        a();
    }

    private final synchronized void a() {
        while (true) {
            if (this.d.isEmpty()) {
                break;
            } else if (this.e != null && this.e.isBinderAlive()) {
                defpackage.bhz bhz = (defpackage.bhz) this.d.poll();
                defpackage.bib bib = this.e;
                if (android.os.Binder.getCallingUid() != android.os.Process.myUid()) {
                    throw new java.lang.SecurityException("Binding only allowed within app");
                }
                bib.a.a.execute(new defpackage.bic(bib, bhz));
            }
        }
        if (!this.f) {
            this.f = true;
            try {
                defpackage.bew.a();
                android.content.Context context = this.a;
                android.content.Intent intent = this.b;
                context.getClass().getName();
                if (!defpackage.bew.a(context, intent, this, 65)) {
                    android.util.Log.e("EnhancedIntentService", "binding to the service failed");
                    while (!this.d.isEmpty()) {
                        ((defpackage.bhz) this.d.poll()).a();
                    }
                }
            } catch (java.lang.SecurityException e2) {
                android.util.Log.e("EnhancedIntentService", "Exception while binding the service", e2);
            }
        }
    }

    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        synchronized (this) {
            this.f = false;
            this.e = (defpackage.bib) iBinder;
            a();
        }
    }

    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        a();
    }
}
