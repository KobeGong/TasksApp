package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import android.util.Log;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: bid  reason: default package */
/* compiled from: PG */
public final class bid implements ServiceConnection {
    private final Context a;
    private final Intent b;
    private final ScheduledExecutorService c;
    private final Queue d;
    private bib e;
    private boolean f;

    public bid(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0));
    }

    private bid(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.d = new LinkedList();
        this.f = false;
        this.a = context.getApplicationContext();
        this.b = new Intent(str).setPackage(this.a.getPackageName());
        this.c = scheduledExecutorService;
    }

    public final synchronized void a(Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        this.d.add(new bhz(intent, pendingResult, this.c));
        a();
    }

    private final synchronized void a() {
        while (true) {
            if (this.d.isEmpty()) {
                break;
            } else if (this.e != null && this.e.isBinderAlive()) {
                bhz bhz = (bhz) this.d.poll();
                bib bib = this.e;
                if (Binder.getCallingUid() != Process.myUid()) {
                    throw new SecurityException("Binding only allowed within app");
                }
                bib.a.a.execute(new bic(bib, bhz));
            }
        }
        if (!this.f) {
            this.f = true;
            try {
                bew.a();
                Context context = this.a;
                Intent intent = this.b;
                context.getClass().getName();
                if (!bew.a(context, intent, this, 65)) {
                    Log.e("EnhancedIntentService", "binding to the service failed");
                    while (!this.d.isEmpty()) {
                        ((bhz) this.d.poll()).a();
                    }
                }
            } catch (SecurityException e2) {
                Log.e("EnhancedIntentService", "Exception while binding the service", e2);
            }
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            this.f = false;
            this.e = (bib) iBinder;
            a();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        a();
    }
}
