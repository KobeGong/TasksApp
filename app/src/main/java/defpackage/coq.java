package defpackage;

/* renamed from: coq reason: default package */
/* compiled from: PG */
public final class coq implements android.app.Application.ActivityLifecycleCallbacks {
    private static final java.util.Map b = new java.util.HashMap(1);
    public final java.util.Map a = new java.util.HashMap();
    private final defpackage.ecz c;

    private coq(defpackage.ecz ecz) {
        this.c = ecz;
    }

    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        this.a.put(activity, new defpackage.cos(activity, bundle, this.c));
    }

    public final void onActivityStarted(android.app.Activity activity) {
    }

    public final void onActivityResumed(android.app.Activity activity) {
        android.view.View findViewById = activity.findViewById(16908290);
        if (defpackage.cky.b(findViewById)) {
            defpackage.cos.a(activity).b.a(findViewById);
        }
    }

    public final void onActivityPaused(android.app.Activity activity) {
    }

    public final void onActivityStopped(android.app.Activity activity) {
    }

    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        defpackage.cos a2 = defpackage.cos.a(activity);
        if (a2 != null) {
            defpackage.cph cph = a2.b.a;
            if (!cph.a.isEmpty()) {
                bundle.putIntegerArrayList("impression_tracker_impressed_elements", new java.util.ArrayList(cph.a));
                bundle.putParcelable("impression_tracker_previous_config", cph.b);
            }
        }
    }

    public final void onActivityDestroyed(android.app.Activity activity) {
        this.a.remove(activity);
    }

    public static void a(android.app.Application application, defpackage.ecz ecz) {
        if (a(application) != null) {
            throw new java.lang.IllegalStateException();
        }
        defpackage.coq coq = new defpackage.coq(ecz);
        application.registerActivityLifecycleCallbacks(coq);
        b.put(application, coq);
    }

    static synchronized defpackage.coq a(android.content.Context context) {
        defpackage.coq coq;
        synchronized (defpackage.coq.class) {
            coq = (defpackage.coq) b.get(context.getApplicationContext());
        }
        return coq;
    }
}
