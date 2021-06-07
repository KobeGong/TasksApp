package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bby  reason: default package */
/* compiled from: PG */
public final class bby implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final bby a = new bby();
    public final AtomicBoolean b = new AtomicBoolean();
    public final AtomicBoolean c = new AtomicBoolean();
    public final ArrayList d = new ArrayList();
    public boolean e = false;

    private bby() {
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.b.compareAndSet(true, false);
        this.c.set(true);
        if (compareAndSet) {
            a(false);
        }
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.b.compareAndSet(true, false);
        this.c.set(true);
        if (compareAndSet) {
            a(false);
        }
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.b.compareAndSet(false, true)) {
            this.c.set(true);
            a(true);
        }
    }

    private final void a(boolean z) {
        synchronized (a) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                bbz bbz = (bbz) obj;
                bbz.a.g.sendMessage(bbz.a.g.obtainMessage(1, Boolean.valueOf(z)));
            }
        }
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }
}
