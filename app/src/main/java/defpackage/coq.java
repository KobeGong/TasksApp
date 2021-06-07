package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: coq  reason: default package */
/* compiled from: PG */
public final class coq implements Application.ActivityLifecycleCallbacks {
    private static final Map b = new HashMap(1);
    public final Map a = new HashMap();
    private final ecz c;

    private coq(ecz ecz) {
        this.c = ecz;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.a.put(activity, new cos(activity, bundle, this.c));
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        View findViewById = activity.findViewById(16908290);
        if (cky.b(findViewById)) {
            cos.a(activity).b.a(findViewById);
        }
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        cos a2 = cos.a(activity);
        if (a2 != null) {
            cph cph = a2.b.a;
            if (!cph.a.isEmpty()) {
                bundle.putIntegerArrayList("impression_tracker_impressed_elements", new ArrayList<>(cph.a));
                bundle.putParcelable("impression_tracker_previous_config", cph.b);
            }
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        this.a.remove(activity);
    }

    public static void a(Application application, ecz ecz) {
        if (a(application) != null) {
            throw new IllegalStateException();
        }
        coq coq = new coq(ecz);
        application.registerActivityLifecycleCallbacks(coq);
        b.put(application, coq);
    }

    static synchronized coq a(Context context) {
        coq coq;
        synchronized (coq.class) {
            coq = (coq) b.get(context.getApplicationContext());
        }
        return coq;
    }
}
