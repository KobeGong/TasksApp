package com.google.android.apps.tasks.sync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: PG */
public class SyncService extends Service {
    private static anb a = null;
    private static final Object b = new Object();

    public void onCreate() {
        synchronized (b) {
            if (a == null) {
                a = new anb(getApplicationContext());
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return a.getSyncAdapterBinder();
    }
}
