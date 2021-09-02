package defpackage;

/* renamed from: bby reason: default package */
/* compiled from: PG */
public final class bby implements android.app.Application.ActivityLifecycleCallbacks, android.content.ComponentCallbacks2 {
    public static final defpackage.bby a = new defpackage.bby();
    public final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean();
    public final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean();
    public final java.util.ArrayList d = new java.util.ArrayList();
    public boolean e = false;

    private bby() {
    }

    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        boolean compareAndSet = this.b.compareAndSet(true, false);
        this.c.set(true);
        if (compareAndSet) {
            a(false);
        }
    }

    public final void onActivityResumed(android.app.Activity activity) {
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
            java.util.ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                java.lang.Object obj = arrayList.get(i);
                i++;
                defpackage.bbz bbz = (defpackage.bbz) obj;
                bbz.a.g.sendMessage(bbz.a.g.obtainMessage(1, java.lang.Boolean.valueOf(z)));
            }
        }
    }

    public final void onActivityStarted(android.app.Activity activity) {
    }

    public final void onActivityPaused(android.app.Activity activity) {
    }

    public final void onActivityStopped(android.app.Activity activity) {
    }

    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    public final void onActivityDestroyed(android.app.Activity activity) {
    }

    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    public final void onLowMemory() {
    }
}
