package com.google.android.libraries.notifications.executor.impl.basic;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

import defpackage.bww;
import defpackage.bwx;
import defpackage.bxk;
import defpackage.bxr;
import defpackage.cky;

/* compiled from: PG */
public final class ChimeExecutorApiService extends Service {
    public static final Queue a = new ArrayDeque();
    public int b;
    private ExecutorService c;

    public static void a(Context context, Runnable runnable) {
        cky.a((Runnable) new bww(runnable, context));
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        this.c = bxr.a(bxk.a(this).a);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null || !"ACTION_NEW_TASK".equals(intent.getAction())) {
            a();
            return 2;
        } else if (a.isEmpty()) {
            return 2;
        } else {
            this.b++;
            Runnable runnable = (Runnable) a.remove();
            this.c.execute(new bwx(this, ((PowerManager) getSystemService("power")).newWakeLock(1, runnable.getClass().getSimpleName()), runnable));
            return 2;
        }
    }

    public final void a() {
        if (a.isEmpty() && this.b == 0) {
            stopSelf();
        }
    }
}
