package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Looper;

/* renamed from: cos  reason: default package */
/* compiled from: PG */
public final class cos {
    public final cpd a = new cpd(this.c);
    public final cpa b;
    private final cor c;

    cos(Activity activity, Bundle bundle, ecz ecz) {
        this.c = new cor(ecz);
        this.b = new cpa(activity, bundle, this.a);
    }

    public static cos a(Context context) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalThreadStateException();
        }
        coq a2 = coq.a(context);
        for (Context context2 = context; context2 != null; context2 = ((ContextWrapper) context2).getBaseContext()) {
            if (!(context2 instanceof Activity)) {
                if (!(context2 instanceof ContextWrapper)) {
                    break;
                }
            } else {
                Activity activity = (Activity) context2;
                if (activity.isDestroyed()) {
                    throw new IllegalStateException();
                }
                cos cos = (cos) a2.a.get(activity);
                if (cos != null) {
                    return cos;
                }
                throw new IllegalStateException();
            }
        }
        throw new IllegalStateException();
    }
}
