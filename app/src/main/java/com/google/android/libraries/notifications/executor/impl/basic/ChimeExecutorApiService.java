package com.google.android.libraries.notifications.executor.impl.basic;

/* compiled from: PG */
public final class ChimeExecutorApiService extends android.app.Service {
    public static final java.util.Queue a = new java.util.ArrayDeque();
    public int b;
    private java.util.concurrent.ExecutorService c;

    public static void a(android.content.Context context, java.lang.Runnable runnable) {
        defpackage.cky.a((java.lang.Runnable) new defpackage.bww(runnable, context));
    }

    public final android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        this.c = defpackage.bxr.a(defpackage.bxk.a(this).a);
    }

    public final int onStartCommand(android.content.Intent intent, int i, int i2) {
        if (intent == null || !"ACTION_NEW_TASK".equals(intent.getAction())) {
            a();
        } else if (!a.isEmpty()) {
            android.os.PowerManager powerManager = (android.os.PowerManager) getSystemService("power");
            this.b++;
            java.lang.Runnable runnable = (java.lang.Runnable) a.remove();
            this.c.execute(new defpackage.bwx(this, powerManager.newWakeLock(1, runnable.getClass().getSimpleName()), runnable));
        }
        return 2;
    }

    public final void a() {
        if (a.isEmpty() && this.b == 0) {
            stopSelf();
        }
    }
}
