package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;

/* renamed from: cic  reason: default package */
/* compiled from: PG */
final class cic implements Runnable {
    private final /* synthetic */ Context a;
    private final /* synthetic */ cib b;

    cic(cib cib, Context context) {
        this.b = cib;
        this.a = context;
    }

    public final void run() {
        if (this.b.a.j.compareAndSet(true, false)) {
            this.a.unregisterReceiver(this.b);
            this.b.a.i.set(SystemClock.elapsedRealtime());
            cnn cnn = this.b.a.e;
            File b2 = cdm.b(this.a);
            if (cnn.a != null) {
                cno cno = cnn.a;
                if (cno.d.c != null) {
                    cno.b = (File) cky.a((Object) b2);
                    cno.interrupt();
                    cdm.a(3, "LeakWatcherThread", "Schedule for heap dump", new Object[0]);
                    return;
                }
                cdm.a(3, "LeakWatcherThread", "Skip heap dump. No leak suspects found.", new Object[0]);
            }
        }
    }
}
