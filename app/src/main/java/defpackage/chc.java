package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* access modifiers changed from: package-private */
/* renamed from: chc  reason: default package */
/* compiled from: PG */
public final class chc implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public final List a = new CopyOnWriteArrayList();
    private Boolean b;
    private volatile Activity c;

    chc() {
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getApplicationContext();
        this.c = null;
        for (cgp cgp : this.a) {
            if (cgp instanceof cgq) {
                cgq cgq = (cgq) cgp;
                synchronized (cgq) {
                    cgq.c = true;
                }
                cgq.a.b(cgq);
                for (cle cle : cgq.b) {
                    cle.f();
                }
            }
        }
    }

    public final void onActivityStarted(Activity activity) {
        activity.getApplicationContext();
        this.c = null;
        a(activity);
        for (cgp cgp : this.a) {
            if (cgp instanceof cgv) {
                ((cgv) cgp).a(activity);
            }
        }
    }

    public final void onActivityResumed(Activity activity) {
        activity.getApplicationContext();
        this.c = null;
        activity.getClass().getSimpleName();
        for (cgp cgp : this.a) {
            if (cgp instanceof cgt) {
                ((cgt) cgp).a(activity);
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        activity.getApplicationContext();
        for (cgp cgp : this.a) {
            if (cgp instanceof cgs) {
                ((cgs) cgp).a(activity);
            }
        }
    }

    public final void onActivityStopped(Activity activity) {
        activity.getApplicationContext();
        this.c = activity;
        for (cgp cgp : this.a) {
            if (cgp instanceof cgw) {
                ((cgw) cgp).a();
            }
        }
        a(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getApplicationContext();
        for (cgp cgp : this.a) {
            if (cgp instanceof cgu) {
                ((cgu) cgp).a();
            }
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        activity.getApplicationContext();
        this.c = null;
        for (cgp cgp : this.a) {
            if (cgp instanceof cgr) {
                ((cgr) cgp).a(activity);
            }
        }
    }

    public final void onTrimMemory(int i) {
        for (cgp cgp : this.a) {
            if (cgp instanceof cgz) {
                ((cgz) cgp).a(i);
            }
        }
        if (i >= 20 && this.c != null) {
            a(false, this.c);
        }
        this.c = null;
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    private final void a(Activity activity) {
        a(Boolean.valueOf(cnx.b(activity.getApplicationContext())), activity);
    }

    private final void a(Boolean bool, Activity activity) {
        if (!bool.equals(this.b)) {
            this.b = bool;
            if (bool.booleanValue()) {
                cdm.a(3, "AppLifecycleTracker", "App transition to foreground", new Object[0]);
                for (cgp cgp : this.a) {
                    if (cgp instanceof cgy) {
                        ((cgy) cgp).a(activity);
                    }
                }
                return;
            }
            cdm.a(3, "AppLifecycleTracker", "App transition to background", new Object[0]);
            for (cgp cgp2 : this.a) {
                if (cgp2 instanceof cgx) {
                    ((cgx) cgp2).b(activity);
                }
            }
        }
    }
}
