package com.google.android.apps.tasks.sync;

/* compiled from: PG */
public class SyncService extends android.app.Service {
    private static defpackage.anb a = null;
    private static final java.lang.Object b = new java.lang.Object();

    public void onCreate() {
        synchronized (b) {
            if (a == null) {
                a = new defpackage.anb(getApplicationContext());
            }
        }
    }

    public android.os.IBinder onBind(android.content.Intent intent) {
        return a.getSyncAdapterBinder();
    }
}
