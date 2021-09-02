package defpackage;

/* renamed from: chc reason: default package */
/* compiled from: PG */
final class chc implements android.app.Application.ActivityLifecycleCallbacks, android.content.ComponentCallbacks2 {
    public final java.util.List a = new java.util.concurrent.CopyOnWriteArrayList();
    private java.lang.Boolean b;
    private volatile android.app.Activity c;

    chc() {
    }

    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        activity.getApplicationContext();
        this.c = null;
        for (defpackage.cgp cgp : this.a) {
            if (cgp instanceof defpackage.cgq) {
                defpackage.cgq cgq = (defpackage.cgq) cgp;
                synchronized (cgq) {
                    cgq.c = true;
                }
                cgq.a.b(cgq);
                for (defpackage.cle f : cgq.b) {
                    f.f();
                }
            }
        }
    }

    public final void onActivityStarted(android.app.Activity activity) {
        activity.getApplicationContext();
        this.c = null;
        a(activity);
        for (defpackage.cgp cgp : this.a) {
            if (cgp instanceof defpackage.cgv) {
                ((defpackage.cgv) cgp).a(activity);
            }
        }
    }

    public final void onActivityResumed(android.app.Activity activity) {
        activity.getApplicationContext();
        this.c = null;
        activity.getClass().getSimpleName();
        for (defpackage.cgp cgp : this.a) {
            if (cgp instanceof defpackage.cgt) {
                ((defpackage.cgt) cgp).a(activity);
            }
        }
    }

    public final void onActivityPaused(android.app.Activity activity) {
        activity.getApplicationContext();
        for (defpackage.cgp cgp : this.a) {
            if (cgp instanceof defpackage.cgs) {
                ((defpackage.cgs) cgp).a(activity);
            }
        }
    }

    public final void onActivityStopped(android.app.Activity activity) {
        activity.getApplicationContext();
        this.c = activity;
        for (defpackage.cgp cgp : this.a) {
            if (cgp instanceof defpackage.cgw) {
                ((defpackage.cgw) cgp).a();
            }
        }
        a(activity);
    }

    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        activity.getApplicationContext();
        for (defpackage.cgp cgp : this.a) {
            if (cgp instanceof defpackage.cgu) {
                ((defpackage.cgu) cgp).a();
            }
        }
    }

    public final void onActivityDestroyed(android.app.Activity activity) {
        activity.getApplicationContext();
        this.c = null;
        for (defpackage.cgp cgp : this.a) {
            if (cgp instanceof defpackage.cgr) {
                ((defpackage.cgr) cgp).a(activity);
            }
        }
    }

    public final void onTrimMemory(int i) {
        for (defpackage.cgp cgp : this.a) {
            if (cgp instanceof defpackage.cgz) {
                ((defpackage.cgz) cgp).a(i);
            }
        }
        if (i >= 20 && this.c != null) {
            a(java.lang.Boolean.valueOf(false), this.c);
        }
        this.c = null;
    }

    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    private final void a(android.app.Activity activity) {
        a(java.lang.Boolean.valueOf(defpackage.cnx.b(activity.getApplicationContext())), activity);
    }

    private final void a(java.lang.Boolean bool, android.app.Activity activity) {
        if (!bool.equals(this.b)) {
            this.b = bool;
            if (bool.booleanValue()) {
                defpackage.cdm.a(3, "AppLifecycleTracker", "App transition to foreground", new java.lang.Object[0]);
                for (defpackage.cgp cgp : this.a) {
                    if (cgp instanceof defpackage.cgy) {
                        ((defpackage.cgy) cgp).a(activity);
                    }
                }
                return;
            }
            defpackage.cdm.a(3, "AppLifecycleTracker", "App transition to background", new java.lang.Object[0]);
            for (defpackage.cgp cgp2 : this.a) {
                if (cgp2 instanceof defpackage.cgx) {
                    ((defpackage.cgx) cgp2).b(activity);
                }
            }
        }
    }
}
