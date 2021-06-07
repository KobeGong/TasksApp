package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: bhx  reason: default package */
/* compiled from: PG */
public abstract class bhx extends Service {
    public final ExecutorService a = Executors.newSingleThreadExecutor();
    private Binder b;
    private final Object c = new Object();
    private int d;
    private int e = 0;

    public abstract void handleIntent(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        if (this.b == null) {
            this.b = new bib(this);
        }
        return this.b;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.c) {
            this.d = i2;
            this.e++;
        }
        if (intent == null) {
            a(intent);
            return 2;
        }
        this.a.execute(new bhy(this, intent, intent));
        return 3;
    }

    /* access modifiers changed from: package-private */
    public final void a(Intent intent) {
        if (intent != null) {
            bpt.a(intent);
        }
        synchronized (this.c) {
            this.e--;
            if (this.e == 0) {
                stopSelfResult(this.d);
            }
        }
    }
}
